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


public class IpRegistereSheetSummPdf implements java.lang.Runnable {
    java.util.Date beginDate = null;
    
    java.util.Date endDate = null;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.afrisoftech.lib.DBObject dbObject;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.NORMAL);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void IpRegistereSheetSummPdf(java.sql.Connection connDb, java.util.Date begindate, java.util.Date endate) {
        
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
        
        //		new MemberListPdf().MemberListPdf();
        
    }
    
    
    public void run() {
        
        System.out.println("System has entered running mode");
        
        while (threadCheck) {
            
            System.out.println("O.K. see how we execute target program");
            
            this.generatePdf();
            
            try {
                
                System.out.println("Right, let's wait for task to complete of fail");
                
                java.lang.Thread.currentThread().sleep(100);
                
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
    
    
    public void generatePdf() {
        
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
                        
                        // java.sql.Connection conDb = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                        
                        java.sql.Statement st3 = connectDB.createStatement();
                        java.sql.Statement st4 = connectDB.createStatement();
                        
                        java.sql.ResultSet rset2 = st3.executeQuery("SELECT hospital_name from pb_hospitalprofile");
                        java.sql.ResultSet rset4 = st4.executeQuery("SELECT TO_CHAR(current_timestamp(0),'FMDay FMDD/ MM/ YY HH12::MI')");
                        while(rset2.next())
                            compName = rset2.getObject(1).toString();
                        
                        while(rset4.next())
                            date = rset4.getObject(1).toString();
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);
                        
                        //  com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setRight(5);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("InPatients List - Page: "), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(7);
                        
                        int headerwidths[] = {12,10,10,12,10,10,12};
                        
                        table.setWidths(headerwidths);
                        table.setHeaderRows(2);
                        table.setWidthPercentage((100));
                        
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        // table.getDefaultCell().setColspan(5);
                        
                        
                        Phrase phrase = new Phrase("", pFontHeader);
                        
                        
                        try {
                            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                            
                            
                            java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());
                            java.util.Date endDate11 = dateFormat.parse(beginDate.toLocaleString());//dateInstance.toLocaleString());
                            
                            System.out.println(""+endDate1);
                            //  phrase = new Phrase(bank +" Report: " +dateFormat.format(formattedDate), pFontHeader);
                            
                            //  table.addCell(phrase);
                            table.getDefaultCell().setColspan(5);
                            
                            phrase = new Phrase("In Patient Att. List Summary:     Period : "  +dateFormat.format(endDate11)+" ------ "+dateFormat.format(endDate1), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(2);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            phrase = new Phrase("Printed On  :" +date , pFontHeader);
                            
                            table.addCell(phrase);
                        } catch(java.text.ParseException psExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                            
                        }
                        // Phrase phrase = new Phrase("Patients List As At:" +endDate, pFontHeader);
                        
                        //table.addCell(phrase);
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                        
                        table.getDefaultCell().setColspan(1);
                        
                        //   table.getDefaultCell().setBackgroundColor(java.awt.Color.LIGHT_GRAY);
                        phrase = new Phrase("Date",pFontHeader);
                        table.addCell(phrase);
                        phrase = new Phrase("Cash Count",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase("Scheme Count",pFontHeader);
                        table.addCell(phrase);
                        phrase = new Phrase("Total Reg.",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Cash Adm.",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase("SchemeAdm.",pFontHeader);
                        table.addCell(phrase);
                        phrase = new Phrase("Total Adm.",pFontHeader);
                        table.addCell(phrase);
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        
                        // table.addCell("Amount KShs.");
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        // table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        try {
                            java.lang.Object[] listofAct = this.getListofActivities();
                            
                            java.sql.Statement sta = connectDB.createStatement();
                            
                            
                            java.sql.ResultSet rseta = sta.executeQuery("select count(distinct(patient_no)) from hp_inpatient_register WHERE date::date BETWEEN '"+beginDate+"' AND '"+endDate+"'");
                            
                            java.sql.Statement st111 = connectDB.createStatement();
                            
                            int cash =0;
                            int scheme = 0;
                            java.sql.ResultSet rset11 = st111.executeQuery("select count(distinct(patient_no)) from hp_inpatient_register WHERE date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pay_mode ilike 'scheme'");
                            
                            java.sql.Statement st11 = connectDB.createStatement();
                            
                            
                           
                            
                            int cashadm =0;
                            int schemeadm = 0;
                                 
                          //  java.sql.Statement sta = connectDB.createStatement();
                            
                            System.out.println(listofAct.length);
                            
                            for (int i = 0; i < listofAct.length; i++) {
                                int cash1 = 0;
                                int scheme1 = 0;
                                java.sql.PreparedStatement pset = connectDB.prepareStatement("select count(distinct(patient_no)) from hp_inpatient_register  WHERE date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pay_mode not ilike 'scheme' and date = ?");
                                pset.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset = pset.executeQuery();
                               
                                java.sql.PreparedStatement pset1 = connectDB.prepareStatement("select count(distinct(patient_no)) from hp_inpatient_register  WHERE date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pay_mode ilike 'scheme' and date = ?");
                                pset1.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset21 = pset1.executeQuery();
                                
                               
                                
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                phrase = new Phrase(listofAct[i].toString(),pFontHeader);
                                table.addCell(phrase);
                                
                                while (rset.next()) {
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    phrase = new Phrase(dbObject.getDBObject(rset.getObject(1), "-"),pFontHeader);
                                    cash = cash + rset.getInt(1);
                                    cash1 = cash1 + rset.getInt(1);
                                    table.addCell(phrase);
                                }
                                while (rset21.next()) {
                                    phrase = new Phrase(dbObject.getDBObject(rset21.getObject(1), "-"),pFontHeader);
                                    scheme = scheme + rset21.getInt(1);
                                    scheme1 = scheme1 + rset21.getInt(1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                
                                int Total = cash1 + scheme1;
                                phrase = new Phrase(""+Total, pFontHeader);
                                
                                table.addCell(phrase);
                                
                                int admcash1 = 0;
                                int admscheme1 = 0;
                                
                                java.sql.PreparedStatement psete = connectDB.prepareStatement("select count(distinct(patient_no)) from hp_admission  WHERE date_admitted BETWEEN '"+beginDate+"' AND '"+endDate+"' and mode_of_payment not ilike 'scheme' and date_admitted = ?");
                                psete.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rsete = psete.executeQuery();
                              
                                java.sql.PreparedStatement pset1e = connectDB.prepareStatement("select count(distinct(patient_no)) from hp_admission  WHERE date_admitted BETWEEN '"+beginDate+"' AND '"+endDate+"' and mode_of_payment ilike 'scheme' and date_admitted = ?");
                                pset1e.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset21e = pset1e.executeQuery();
                                
                                while (rsete.next()) {
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    phrase = new Phrase(dbObject.getDBObject(rsete.getObject(1), "-"),pFontHeader);
                                    cashadm = cashadm + rsete.getInt(1);
                                    admcash1 = admcash1 + rsete.getInt(1);
                                    table.addCell(phrase);
                                }
                                while (rset21e.next()) {
                                    phrase = new Phrase(dbObject.getDBObject(rset21e.getObject(1), "-"),pFontHeader);
                                    schemeadm = schemeadm + rset21e.getInt(1);
                                    admscheme1 = admscheme1 + rset21e.getInt(1);
                                    table.addCell(phrase);
                                    
                                }
                                int Total1 = admcash1 + admscheme1;
                                phrase = new Phrase(""+Total1, pFontHeader);
                                
                                table.addCell(phrase);
                            }
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("Total ", pFontHeader);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            
                            phrase = new Phrase(""+cash, pFontHeader);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(""+scheme, pFontHeader);
                            table.addCell(phrase);
                            int Total11 = cash + scheme;
                            phrase = new Phrase(""+Total11, pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase(""+cashadm, pFontHeader);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(""+schemeadm, pFontHeader);
                            table.addCell(phrase);
                            
                            
                            
                            int Total11a = cashadm + schemeadm;
                            phrase = new Phrase(""+Total11a, pFontHeader);
                            table.addCell(phrase);
                            
                            docPdf.add(table);
                            
                        } catch(java.sql.SQLException SqlExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                            
                        }
                        //
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
            
              
            java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("SELECT DISTINCT date FROM hp_patient_visit where transaction_type ilike 'registration%' and date BETWEEN '"+beginDate+"' AND '"+endDate+"'  order by date");
            //pSet1.setString(1,"Raise Invoice");
            java.sql.ResultSet rSet1 = pSet1.executeQuery();
            while (rSet1.next()) {
                //if (rSet1.getFloat(1) > 0){
                listActVector.addElement(rSet1.getObject(1).toString());
                //}
            }
            System.out.println("description"+rSet1.getObject(1).toString());
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        
        listofActivities = listActVector.toArray();
        System.out.println("Done list of activities ...");
        return listofActivities;
    }
    
    
    
}





