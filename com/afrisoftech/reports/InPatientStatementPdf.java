//Author Charles Waweru

//Made to test Java support for Threads.

//Revision : Ver 1.0a

//import java.lang.*;

package com.afrisoftech.reports;
import java.awt.Point;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.*;


public class InPatientStatementPdf implements java.lang.Runnable {
    java.lang.String MNo = null;
    com.afrisoftech.lib.DBObject dbObject;
    java.util.Date beginDate = null;
    
    java.util.Date endDate = null;
    
    double balance = 0.00;
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    
    //  java.lang.String memNo2Use = null;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.NORMAL);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void InPatientStatementPdf(java.sql.Connection connDb, java.util.Date begindate, java.util.Date endate, java.lang.String combox) {
        MNo = combox;
        dbObject = new com.afrisoftech.lib.DBObject();
        connectDB = connDb;
        
        beginDate = begindate;
        
        endDate = endate;
        threadSample = new java.lang.Thread(this,"SampleThread");
        
        System.out.println("threadSample created");
        
        threadSample.start();
        
        System.out.println("threadSample fired");
        
    }
    
    public static void main(java.lang.String[] args) {
        
        //		new MemberStatementPdf().MemberStatementPdf(args[0]);
        
    }
    
    
    public void run() {
        
        System.out.println("System has entered running mode");
        
        while (threadCheck) {
            
            System.out.println("O.K. see how we execute target program");
            
            this.generatePdf(MNo);
            
            try {
                
                System.out.println("Right, let's wait for task to complete of fail");
                
                java.lang.Thread.currentThread().sleep(200);
                
                System.out.println("It's time for us threads to get back to work after the nap");
                
            } catch(java.lang.InterruptedException IntExec) {
                
                System.out.println(IntExec.getMessage());
                
            }
            
            threadCheck = false;
            
            
            System.out.println("We shall be lucky to get back to start in one piece");
            
        }
        
        if (!threadCheck) {
            
            
            
            Thread.currentThread().stop();
            
        }
        
    }
    
    public java.lang.String getDateLable() {
        
        java.lang.String date_label = null;
        
        java.lang.String month_now_strs = null;
        
        java.lang.String date_now_strs = null;
        
        java.lang.String year_now_strs = null;
        
        java.lang.String minute_now_strs = null;
        
        java.lang.String hour_now_strs = null;
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        java.util.Calendar calinst = java.util.Calendar.getInstance();
        
        java.util.Date date_now = calinst.getTime();
        
        int date_now_str = date_now.getDate();
        
        int month_now_str = date_now.getMonth();
        
        int year_now_str = date_now.getYear();
        
        int hour_now_str = date_now.getHours();
        
        int minute_now_str = date_now.getMinutes();
        
        int year_now_abs = year_now_str - 100;
        
        if (year_now_abs < 10) {
            
            year_now_strs = "200"+year_now_abs;
            
        } else {
            
            year_now_strs = "20"+year_now_abs;
            
        }
        
        switch (month_now_str) {
            
            case 0 : month_now_strs = "JAN";
            
            break;
            
            case 1 : month_now_strs = "FEB";
            
            break;
            
            case 2 : month_now_strs = "MAR";
            
            break;
            
            case 3 : month_now_strs = "APR";
            
            break;
            
            case 4 : month_now_strs = "MAY";
            
            break;
            
            case 5 : month_now_strs = "JUN";
            
            break;
            
            case 6 : month_now_strs = "JUL";
            
            break;
            
            case 7 : month_now_strs = "AUG";
            
            break;
            
            case 8 : month_now_strs = "SEP";
            
            break;
            
            case 9 : month_now_strs = "OCT";
            
            break;
            
            case 10 : month_now_strs = "NOV";
            
            break;
            
            case 11 : month_now_strs = "DEC";
            
            break;
            
            default :         if (month_now_str < 10){
                
                month_now_strs = "0"+month_now_str;
                
            } else {
                
                month_now_strs = ""+month_now_str;
                
            }
            
        }
        
        if (date_now_str < 10) {
            
            date_now_strs = "0"+date_now_str;
            
        } else {
            
            date_now_strs = ""+date_now_str;
            
        }
        
        if (minute_now_str < 10) {
            
            minute_now_strs = "0"+minute_now_str;
            
        } else {
            
            minute_now_strs = ""+minute_now_str;
            
        }
        
        if (hour_now_str < 10) {
            
            hour_now_strs = "0"+hour_now_str;
            
        } else {
            
            hour_now_strs = ""+hour_now_str;
            
        }
        
        date_label = date_now_strs+month_now_strs+year_now_strs+"@"+hour_now_strs+minute_now_strs;
        
        return date_label;
        
    }
    
    
    public void generatePdf(java.lang.String memNo) {
        
        java.lang.Process wait_for_Pdf2Show;
        
        java.util.Calendar cal = java.util.Calendar.getInstance();
        
        java.util.Date dateStampPdf = cal.getTime();
        
        java.lang.String pdfDateStamp = dateStampPdf.toString();
        
        
        try {
            
            java.io.File tempFile = java.io.File.createTempFile("REP"+this.getDateLable()+"_", ".pdf");
            
            tempFile.deleteOnExit();
            
            java.lang.Runtime rt = java.lang.Runtime.getRuntime();
            
            java.lang.String debitTotal = null;
            
            java.lang.String creditTotal = null;
            
            com.lowagie.text.Document docPdf = new com.lowagie.text.Document();
            
            try {
                
                try {
                    
                    com.lowagie.text.pdf.PdfWriter.getInstance(docPdf, new java.io.FileOutputStream(tempFile));
                    
                    
                    
                    
                    
                    String compName = null;
                    String date = null;
                    try {
                        
                        
                        java.sql.Statement st3 = connectDB.createStatement();
                        java.sql.Statement st4 = connectDB.createStatement();
                        
                        java.sql.ResultSet rset2 = st3.executeQuery("SELECT hospital_name from pb_hospitalprofile");
                        java.sql.ResultSet rset4 = st4.executeQuery("SELECT TO_CHAR(current_timestamp(0),'FMDay FMDD/ MM/ YY HH12::MI')");
                         while(rset2.next())
                            compName = rset2.getObject(1).toString();
                        
                        while(rset4.next())
                            date = rset4.getObject(1).toString();
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        
                        //  com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("InPatient Statements - Page: "), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    double balance2 =0.00;
                    double balance21 =0.00;
                    double balance11 =0.00;
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(5);
                        
                        int headerwidths[] = {20,20,20,20,20};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                         table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                        table.getDefaultCell().setColspan(5);
                        Phrase phrase = new Phrase("PATIENT STATEMENT (IP)");
                        table.addCell(phrase);
                         table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                        table.getDefaultCell().setColspan(3);
                         try {
                          
                        java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                                
                                
                                java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());
                                java.util.Date endDate11 = dateFormat.parse(beginDate.toLocaleString());//dateInstance.toLocaleString());
                                
                                System.out.println(""+endDate1);
                                //  phrase = new Phrase(bank +" Report: " +dateFormat.format(formattedDate), pFontHeader);
                                
                                //  table.addCell(phrase);
                                 
                                phrase = new Phrase("Period : From "  +dateFormat.format(endDate11)+" To "+dateFormat.format(endDate1), pFontHeader1);
                                
                                table.addCell(phrase);
                               
                                
                            } catch(java.text.ParseException psExec) {
                                
                                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                                
                            }
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        table.getDefaultCell().setColspan(2);
                        phrase = new Phrase("Printed on : " +date, pFontHeader1);
                        
                        table.addCell(phrase);
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        try {
                            
                            java.sql.Statement st = connectDB.createStatement();
                            java.sql.Statement st1 = connectDB.createStatement();
                            java.sql.Statement st2 = connectDB.createStatement();
                            
                            //  java.sql.ResultSet rset = st.executeQuery("select DISTINCT member_code, member_name,date from shares_transactions order by member_code");
                            java.sql.ResultSet rset = st.executeQuery("select patient_no,initcap(first_name||' '||second_name||' '||last_name),address,residence,tel_no,date from hp_inpatient_register where patient_no = '"+memNo+"'");
                            java.sql.ResultSet rset1 = st1.executeQuery("select date,invoice_no,sum(debit - credit),sum(balance) from ac_debtors where admission_no = '"+memNo+"' AND date BETWEEN '"+beginDate+"' AND '"+endDate+"' group by date,invoice_no order by date");
                            java.sql.ResultSet rset2 = st2.executeQuery("select date,receipt_no,sum(debit-credit),0.00 from ac_cash_collection where patient_no = '"+memNo+"' AND date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' group by date,receipt_no order by date");
                            
                            while (rset.next()) {
                                
                                table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Patient No.:  " +dbObject.getDBObject(rset.getObject(1), "-"), pFontHeader1);
                                table.addCell(phrase);
                                
                                
                                table.getDefaultCell().setColspan(3);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Patient Name : " +dbObject.getDBObject(rset.getObject(2), "-"), pFontHeader1);
                                table.addCell(phrase);
                                
                                
                                table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Address : " +dbObject.getDBObject(rset.getObject(3), "-"), pFontHeader1);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(3);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Town : " +dbObject.getDBObject(rset.getObject(4), "-"), pFontHeader1);
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("TEl No.: " +dbObject.getDBObject(rset.getObject(5), "-"), pFontHeader1);
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(3);
                                phrase = new Phrase("First Visit: " +dbObject.getDBObject(rset.getObject(6), "-"), pFontHeader1);
                                table.addCell(phrase);
                                
                            }
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            table.getDefaultCell().setBorderWidth(Rectangle.TOP);
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("Date",pFontHeader1);
                            
                            table.addCell(phrase);
                            phrase = new Phrase("Doc No",pFontHeader1);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            
                            
                            phrase = new Phrase("Orig",pFontHeader1);
                            
                            table.addCell(phrase);
                            phrase = new Phrase("Balance",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase("Running",pFontHeader1);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(5);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase("INVOICES",pFontHeader1);
                            
                            table.addCell(phrase);
                            while (rset1.next()){
                                
                                //  table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset1.getObject(1), "-"), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                phrase = new Phrase(dbObject.getDBObject(rset1.getObject(2), "-"), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(3)),pFontHeader);
                                balance = balance + rset1.getDouble(3);
                                table.addCell(phrase);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(4)),pFontHeader);
                                balance11 = balance11 + rset1.getDouble(4);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(balance)),pFontHeader);
                                
                                table.addCell(phrase);
                            }
                            
                            table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Total Invoices", pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(balance11)),pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(balance)),pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(5);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase("RECEIPTS",pFontHeader1);
                            
                            table.addCell(phrase);
                            while (rset2.next()){
                                
                                //  table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                table.getDefaultCell().setColspan(1);
                                
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset2.getObject(1), "-"), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                phrase = new Phrase(dbObject.getDBObject(rset2.getObject(2), "-"), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset2.getString(3)),pFontHeader);
                                
                                table.addCell(phrase);
                                balance2 = balance2 + rset2.getDouble(3);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset2.getString(4)),pFontHeader);
                                balance21 = balance21 + rset2.getDouble(4);
                                table.addCell(phrase);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(balance2)),pFontHeader);
                                
                                table.addCell(phrase);
                                
                                
                            }
                            table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Total Receipts", pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(balance21)),pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(balance2)),pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            
                            table.getDefaultCell().setColspan(2);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Total", pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(balance+balance2)),pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            
                            
                            
                            docPdf.add(table);
                            
                        } catch(java.sql.SQLException SqlExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                            
                        }
                        
                        // }
                        
                    } catch(com.lowagie.text.BadElementException BadElExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), BadElExec.getMessage());
                        
                    }
                    
                } catch(java.io.FileNotFoundException fnfExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), fnfExec.getMessage());
                    
                }
            } catch(com.lowagie.text.DocumentException lwDocexec) {
                
                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), lwDocexec.getMessage());
                
            }
            
            docPdf.close();
            
            try {
                
                if (System.getProperty("os.name").equalsIgnoreCase("Linux"))  {
                    
                    System.out.println(tempFile);
                    
                    wait_for_Pdf2Show = rt.exec("kghostview "+tempFile+"");
                    
                    wait_for_Pdf2Show.waitFor();
                    
                } else {
                    
                    wait_for_Pdf2Show = rt.exec("c:/Program Files/Adobe/Acrobat 5.0/Reader/AcroRd32.exe "+tempFile);
                    
                    wait_for_Pdf2Show.waitFor();
                    
                }
                
            } catch(java.lang.InterruptedException intrExec) {
                
                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), intrExec.getMessage());
                
            }
            
            
            
        } catch(java.io.IOException IOexec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), IOexec.getMessage());
            
        }
        
        
        
    }
    
    
    
    
    
    
}





