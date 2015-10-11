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


public class CashBookShiftReportPdf implements java.lang.Runnable {
    java.lang.String memNo = null;
    
    java.lang.String CashPoint = null;
    
    java.lang.String beginDate = null;
    
    java.lang.String endDate = null;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    
    //  java.lang.String memNo2Use = null;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.NORMAL);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void CashBookShiftReportPdf(java.sql.Connection connDb, java.lang.String combox, java.lang.String cashPoint) {
        memNo = combox;
        
        CashPoint = cashPoint;
        
        connectDB = connDb;
        
        //  beginDate = begindate;
        
        /// endDate = endate;
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
            
            this.generatePdf(memNo);
            
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
                        java.sql.ResultSet rset4 = st4.executeQuery("SELECT date('now') as Date");
                        while(rset2.next())
                            compName = rset2.getObject(1).toString();
                        
                        while(rset4.next())
                            date = rset4.getObject(1).toString();
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);
                        
                        //  com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setRight(5);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Shift Report - Page: "), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    
                    try {
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        
                        long dateNow = calendar.getTimeInMillis();
                        
                        java.sql.Date datenowSql= new java.sql.Date(dateNow);
                        
                        System.out.println(datenowSql.toString());
                        
                      //  java.lang.Object listofStaffNos[] = this.getListofStaffNos();
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(7);
                        
                        int headerwidths[] = {10,10,25,15,10,10,10};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        
                        //  table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(4);
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                         table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                        Phrase phrase = new Phrase();
                        phrase = new Phrase("CASHIER'S SHIFT REPORT", pFontHeader);
                        table.addCell(phrase);
                        table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("PrintDate: " +datenowSql, pFontHeader1);
                            table.addCell(phrase);
                        
                        
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        try {
                            java.lang.Object[] listofAct = this.getListofActivities();
                            
                            System.out.println(listofAct.length);
                            java.sql.Statement st2 = connectDB.createStatement();
                            java.sql.Statement st3 = connectDB.createStatement();
                            
                            java.sql.ResultSet rsetTotals1 = st2.executeQuery("SELECT SUM(debit),sum(credit),sum(credit-debit) from ac_cash_book WHERE shift_no = '"+memNo+"'  AND cash_point = '"+CashPoint+"'");
                            java.sql.ResultSet rset2 = st3.executeQuery("select user_name,shift_no,status from ac_shifts where shift_no = '"+memNo+"'");
                            
                            while (rset2.next())
                                table.getDefaultCell().setColspan(2);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Shift No. : "+rset2.getObject(2).toString(), pFontHeader);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Cashier :  "+rset2.getObject(1).toString().toUpperCase(), pFontHeader);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(3);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Status :  "+rset2.getObject(3).toString(), pFontHeader);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                            
                            // table.getDefaultCell().setColspan(6);
                            table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                            table.getDefaultCell().setBorderColor(java.awt.Color.black);
                            table.getDefaultCell().setColspan(1);
                            
                            phrase = new Phrase("Receipt No.", pFontHeader);
                            table.addCell(phrase);
                            
                            phrase = new Phrase("Date", pFontHeader);
                            table.addCell(phrase);
                            
                            phrase = new Phrase("Payer", pFontHeader);
                            table.addCell(phrase);
                            
                            phrase = new Phrase("Chq No./CR.No", pFontHeader);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            phrase = new Phrase("Receipt Amt.", pFontHeader);
                            table.addCell(phrase);
                            
                            phrase = new Phrase("Refunds", pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase("Balance", pFontHeader);
                            
                            table.addCell(phrase);
                            
                            
                            table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            for (int i = 0; i < listofAct.length; i++) {
                                java.sql.Statement st = connectDB.createStatement();
                                java.sql.Statement st1 = connectDB.createStatement();
                                
                                java.sql.ResultSet rset = st.executeQuery("select voucher_no,date,dealer,cheque_no,sum(debit),sum(credit),sum(credit-debit) from ac_cash_book where shift_no = '"+memNo+"' AND cash_point = '"+CashPoint+"' and payment_mode ILIKE '"+listofAct[i].toString()+"' group by voucher_no,date,dealer,cheque_no order by voucher_no");
                                
                                java.sql.ResultSet rset1 = st1.executeQuery("select sum(debit),sum(credit),sum(credit-debit) from ac_cash_book where shift_no = '"+memNo+"'  AND cash_point = '"+CashPoint+"' and payment_mode ILIKE '"+listofAct[i].toString()+"' group by payment_mode ");
                                
                                
                                while (rset1.next()){
                                    phrase = new Phrase(" ", pFontHeader);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(3);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(listofAct[i].toString(), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(1)),pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(2)),pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(3)),pFontHeader);
                                    
                                    table.addCell(phrase);
                                }
                                while (rset.next()) {
                                    
                                    
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(rset.getObject(1).toString(), pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    //  table.getDefaultCell().setColspan(2);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    
                                    phrase = new Phrase(rset.getObject(2).toString().toUpperCase(), pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    
                                    phrase = new Phrase(rset.getObject(3).toString().toUpperCase(), pFontHeader1);
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    
                                    phrase = new Phrase(rset.getObject(4).toString().toUpperCase(), pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(5)),pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(6)),pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(7)),pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    
                                }
                            }
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            while (rsetTotals1.next()) {
                                
                                table.getDefaultCell().setColspan(4);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Total", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals1.getString(1)),pFontHeader);
                                
                                table.addCell(phrase);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals1.getString(2)),pFontHeader);
                                
                                table.addCell(phrase);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals1.getString(3)),pFontHeader);
                                
                                table.addCell(phrase);
                             /*
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals1.getString(2)),pFontHeader);
                              
                                    //phrase = new Phrase(" ");
                              
                                    table.addCell(phrase);
                              
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                              
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals1.getString(3)),pFontHeader);
                              
                                    table.addCell(phrase);*/
                                
                                
                                
                            }
                            
                            
                             table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                     table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                             table.getDefaultCell().setColspan(35);
                            phrase = new Phrase(" ");
                                     table.addCell(phrase);
                                      table.getDefaultCell().setColspan(7);
                                phrase = new Phrase("RECEIVED FROM:_________________BANKED BY: _____________ Date: ____/____/______ Time: _________", pFontHeader);
                         table.addCell(phrase);
                           
                          table.getDefaultCell().setColspan(35);
                          phrase = new Phrase(" ");
                                     table.addCell(phrase);
                           //table.getDefaultCell().setColspan(7);
                                 phrase = new Phrase("RECEIVED BY: ___________________  Sign:   _______________ Date: ____/____/______  Time: ___________", pFontHeader);
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
    public java.lang.Object[] getListofActivities() {
        
        java.lang.Object[] listofActivities = null;
        
        java.util.Vector listActVector = new java.util.Vector(1,1);
        
        
        try {
            
            //    java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT payment_mode FROM ac_cash_book where shift_no = '"+memNo+"' order by payment_mode");
            
            while (rSet1.next()) {
                
                listActVector.addElement(rSet1.getObject(1).toString().toUpperCase());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities = listActVector.toArray();
        System.out.println("Done list of activities ...");
        return listofActivities;
    }
    
    
    
    
    
}





