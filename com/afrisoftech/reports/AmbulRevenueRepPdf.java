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


public class AmbulRevenueRepPdf implements java.lang.Runnable {
    
    java.lang.String bank = null;
    java.lang.String bank1 = null;
    com.afrisoftech.lib.DBObject dbObject;
    
    java.util.Date beginDate = null;
    
    java.util.Date endDate = null;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD);
    com.lowagie.text.Font pFontNum = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.NORMAL);
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void AmbulRevenueRepPdf(java.sql.Connection connDb,java.util.Date begindate, java.util.Date endate,java.lang.String combox,java.lang.String combox1) {
        
         dbObject = new com.afrisoftech.lib.DBObject();
        bank = combox;
        bank1 = combox1;
        connectDB = connDb;
        beginDate = begindate;
        endDate = endate;
        
        threadSample = new java.lang.Thread(this,"SampleThread");
        
        System.out.println("threadSample created");
        
        threadSample.start();
        
        System.out.println("threadSample fired");
        
    }
    
    public static void main(java.lang.String[] args) {
        
        //		new GlTransactPdf().GlTransactPdf();
        
    }
    
    
    public void run() {
        
        System.out.println("System has entered running mode");
        
        while (threadCheck) {
            
            System.out.println("O.K. see how we execute target program");
            
            this.generatePdf();
            
            try {
                
                System.out.println("Right, let's wait for task to complete of fail");
                
                java.lang.Thread.currentThread().sleep(50);
                
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
        java.sql.ResultSet rsetTotals1 = null;
        
        java.lang.Process wait_for_Pdf2Show;
        
        java.util.Calendar cal = java.util.Calendar.getInstance();
        
        java.util.Date dateStampPdf = cal.getTime();
        
        java.lang.String pdfDateStamp = dateStampPdf.toString();
        
        
        try {
            
            java.io.File tempFile = java.io.File.createTempFile("REP"+this.getDateLable()+"_", ".pdf");
            
            tempFile.deleteOnExit();
            
            java.lang.Runtime rt = java.lang.Runtime.getRuntime();
            
            java.lang.String amountTotal = null;
            
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
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName, pFontHeader),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        
                        //  com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setRight(5);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Daily Rev. - Page: ", pFontHeader), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    double Total = 0.00;
                    double osBalancebf = 0.00;
                     double osBalancebf2 = 0.00;
                     double osBalancebf1 = 0.00;
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(5);
                        
                        int headerwidths[] = {12,10,20,25,15};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        table.setHeaderRows(2);
                        
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(5);
                         Phrase phrase = new Phrase("", pFontHeader);
                            
                            
                            try {
                                java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                                
                                
                                java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());
                                java.util.Date endDate11 = dateFormat.parse(beginDate.toLocaleString());//dateInstance.toLocaleString());
                                
                                System.out.println(""+endDate1);
                                //  phrase = new Phrase(bank +" Report: " +dateFormat.format(formattedDate), pFontHeader);
                                
                                //  table.addCell(phrase);
                                table.getDefaultCell().setColspan(3);
                                
                                phrase = new Phrase(bank.toUpperCase() + " Revenue :  Period : "  +dateFormat.format(endDate11)+" ------ "+dateFormat.format(endDate1), pFontHeader);
                                
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase("Printed On  :" +date , pFontHeader);
                                
                                table.addCell(phrase);
                            } catch(java.text.ParseException psExec) {
                                
                                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                                
                            }
                        
                        table.getDefaultCell().setColspan(1);
                        
                       
                         table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                         phrase = new Phrase("Date", pFontHeader);
                        
                        table.addCell(phrase);
                        phrase = new Phrase("Pat No", pFontHeader);
                        
                        table.addCell(phrase);
                        
                          phrase = new Phrase("Name", pFontHeader);
                        
                          table.addCell(phrase);
                          
                           phrase = new Phrase("Service", pFontHeader);
                        
                          table.addCell(phrase);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        table.getDefaultCell().setColspan(1);
                        
                          
                        phrase = new Phrase("Amount KShs.", pFontHeader);
                        
                        table.addCell(phrase);
                        
                        //   phrase = new Phrase("Y.T.D KShs.", pFontHeader);
                        
                        //  table.addCell(phrase);
                        
                        
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                      //table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        
                        try {
                            java.lang.Object listofStaffNos[] = this.getListofStaffNos();
                        table.getDefaultCell().setColspan(5);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("OP REPORT", pFontHeader);
                                
                                table.addCell(phrase);
                               
                        for (int j = 0; j < listofStaffNos.length; j++) {
                            //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                            
                           System.out.println(listofStaffNos[j]);
                            
                           
                            java.sql.Statement psetc2 = connectDB.createStatement();
                                java.sql.Statement st1 = connectDB.createStatement();
                                java.sql.Statement st4 = connectDB.createStatement();
                                java.sql.Statement psetc1 = connectDB.createStatement();
                                java.sql.Statement st = connectDB.createStatement();
                                
                                java.sql.Statement st2 = connectDB.createStatement();
                                
                                java.sql.Statement st3 = connectDB.createStatement();
                                java.sql.Statement psetc3 = connectDB.createStatement();
                             //   rsetTotals1 = st3.executeQuery("SELECT SUM(amount) from hp_patient_billing WHERE trans_date BETWEEN '"+beginDate+"' AND '"+endDate+"'");
                                System.out.println("Select C done ...");
                               
                               //  java.sql.ResultSet rsetc1 =psetc1.executeQuery("select COUNT(main) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and   main ilike '"+listofStaffNos[j]+"'  and  (payment_mode ilike 'CASH' OR payment_mode ilike 'CHEQUE' OR payment_mode ilike 'CREDIT CARD')");
                               
                               //  java.sql.ResultSet rsetc2 =psetc2.executeQuery("select COUNT(main) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and   main ilike '"+listofStaffNos[j]+"'  and payment_mode ilike 'SCHEME'");
                             
                               //  java.sql.ResultSet rsetc3 =psetc3.executeQuery("select COUNT(main) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and   main ilike '"+listofStaffNos[j]+"'");
                             
                                 
                                System.out.println("Statements Created ...");
                                java.sql.ResultSet rset = st.executeQuery("select date,patient_no,upper(patient_name),upper(service),amount from oprev_brkview where date  between '"+beginDate+"' AND '"+endDate+"' and  main ilike '"+bank+"' and payment_mode ilike '"+listofStaffNos[j]+"' order by date");// tn,amount_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                             
                                //java.sql.ResultSet rset = st.executeQuery("select upper(main),sum(amount) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and   main ilike '"+listofStaffNos[j]+"' group by upper(main)");// tn,amount_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                System.out.println("Select A done ...");
                                
                                 //java.sql.ResultSet rset1 = st1.executeQuery("select upper(main),sum(amount) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and  (payment_mode ilike 'CASH' OR payment_mode ilike 'CHEQUE' OR payment_mode ilike 'CREDIT CARD') and main ilike '"+listofStaffNos[j]+"' group by upper(main)");// tn,amount_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                             
                                 //java.sql.ResultSet rset4 = st4.executeQuery("select upper(main),sum(amount) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and payment_mode ilike 'SCHEME' and main ilike '"+listofStaffNos[j]+"' group by upper(main)");// tn,amount_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                             
                              
                               
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                                
                                
                               
                                    
                                    table.getDefaultCell().setColspan(5);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(listofStaffNos[j].toString(), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    
                                    
                                while (rset.next()) {
                                
                                   table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                  
                                  
                                  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset.getObject(1), "-"), pFontNum);
                                
                                table.addCell(phrase);
                                   
                                    phrase = new Phrase(dbObject.getDBObject(rset.getObject(2), "-"), pFontNum);
                                
                                table.addCell(phrase);
                                phrase = new Phrase(dbObject.getDBObject(rset.getObject(3), "-"),pFontNum);
                                
                                table.addCell(phrase);
                                phrase = new Phrase(dbObject.getDBObject(rset.getObject(4), "-"), pFontNum);
                                
                                table.addCell(phrase);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                  
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(5)),pFontNum);
                                  osBalancebf = osBalancebf + rset.getDouble(5);
                                    table.addCell(phrase);
                                }
                                }
                                
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                         
                                table.getDefaultCell().setColspan(3);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("OP Total", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                
                                
                              table.getDefaultCell().setColspan(2);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                  
                                                                  
                                 
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalancebf)),pFontHeader);
                              
                               table.addCell(phrase);
                              
                               table.getDefaultCell().setColspan(5);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("IP REPORT", pFontHeader);
                                
                                table.addCell(phrase);
                               
                                 for (int j = 0; j < listofStaffNos.length; j++) {
                            //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                            
                           System.out.println(listofStaffNos[j]);
                            
                           
                            java.sql.Statement psetc2 = connectDB.createStatement();
                                java.sql.Statement st1 = connectDB.createStatement();
                                java.sql.Statement st4 = connectDB.createStatement();
                                java.sql.Statement psetc1 = connectDB.createStatement();
                                java.sql.Statement st = connectDB.createStatement();
                                
                                java.sql.Statement st2 = connectDB.createStatement();
                                
                                java.sql.Statement st3 = connectDB.createStatement();
                                java.sql.Statement psetc3 = connectDB.createStatement();
                             //   rsetTotals1 = st3.executeQuery("SELECT SUM(amount) from hp_patient_billing WHERE trans_date BETWEEN '"+beginDate+"' AND '"+endDate+"'");
                                System.out.println("Select C done ...");
                               
                               //  java.sql.ResultSet rsetc1 =psetc1.executeQuery("select COUNT(main) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and   main ilike '"+listofStaffNos[j]+"'  and  (payment_mode ilike 'CASH' OR payment_mode ilike 'CHEQUE' OR payment_mode ilike 'CREDIT CARD')");
                               
                               //  java.sql.ResultSet rsetc2 =psetc2.executeQuery("select COUNT(main) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and   main ilike '"+listofStaffNos[j]+"'  and payment_mode ilike 'SCHEME'");
                             
                               //  java.sql.ResultSet rsetc3 =psetc3.executeQuery("select COUNT(main) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and   main ilike '"+listofStaffNos[j]+"'");
                             
                                 
                                System.out.println("Statements Created ...");
                                java.sql.ResultSet rset = st.executeQuery("select date,patient_no,upper(patient_name),upper(service),amount from iprev_brkview where date  between '"+beginDate+"' AND '"+endDate+"' and  main ilike '"+bank1+"' and payment_mode ilike '"+listofStaffNos[j]+"' order by date");// tn,amount_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                             
                                //java.sql.ResultSet rset = st.executeQuery("select upper(main),sum(amount) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and   main ilike '"+listofStaffNos[j]+"' group by upper(main)");// tn,amount_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                System.out.println("Select A done ...");
                                
                                 //java.sql.ResultSet rset1 = st1.executeQuery("select upper(main),sum(amount) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and  (payment_mode ilike 'CASH' OR payment_mode ilike 'CHEQUE' OR payment_mode ilike 'CREDIT CARD') and main ilike '"+listofStaffNos[j]+"' group by upper(main)");// tn,amount_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                             
                                 //java.sql.ResultSet rset4 = st4.executeQuery("select upper(main),sum(amount) from oprev_view where date  between '"+beginDate+"' AND '"+endDate+"' and payment_mode ilike 'SCHEME' and main ilike '"+listofStaffNos[j]+"' group by upper(main)");// tn,amount_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                             
                              
                               
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                                
                                
                               
                                    
                                    table.getDefaultCell().setColspan(5);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(listofStaffNos[j].toString(), pFontNum);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    
                                    
                                while (rset.next()) {
                                
                                   table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                  
                                  
                                  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset.getObject(1), "-"), pFontNum);
                                
                                table.addCell(phrase);
                                   
                                    phrase = new Phrase(dbObject.getDBObject(rset.getObject(2), "-"), pFontNum);
                                
                                table.addCell(phrase);
                                phrase = new Phrase(dbObject.getDBObject(rset.getObject(3), "-"), pFontNum);
                                
                                table.addCell(phrase);
                                phrase = new Phrase(dbObject.getDBObject(rset.getObject(4), "-"), pFontNum);
                                
                                table.addCell(phrase);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                  
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(5)),pFontNum);
                                  osBalancebf1 = osBalancebf1 + rset.getDouble(5);
                                    table.addCell(phrase);
                                }
                                }
                                
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                         
                                table.getDefaultCell().setColspan(3);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("IP Total", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                
                                
                              table.getDefaultCell().setColspan(2);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                  
                                                                  
                                 
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalancebf1)),pFontHeader);
                              
                               table.addCell(phrase);
                               
                                    table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                         
                                table.getDefaultCell().setColspan(3);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Gross Total", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                
                                
                              table.getDefaultCell().setColspan(2);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                  
                                                                  
                                 
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalancebf1+osBalancebf)),pFontHeader);
                              
                               table.addCell(phrase);
                            docPdf.add(table);
                            
                        } catch(java.sql.SQLException SqlExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                            
                        }
                        
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
    
   public java.lang.Object[] getListofStaffNos() {
        
        java.lang.Object[] listofStaffNos = null;
        
        java.util.Vector listStaffNoVector = new java.util.Vector(1,1);
        
        
        try {
            
            //    java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("SELECT distinct upper(payment_mode) from oprev_brkview where date  between '"+beginDate+"' AND '"+endDate+"' order by upper(payment_mode)");
            
            //  java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("SELECT distinct patient_no FROM hp_patient_register WHERE last_visit  BETWEEN ? AND ? AND pay_mode = ? order by patient_no");
          //  pSet1.setString(1,beginDate.toString());
          //  pSet1.setString(2,endDate.toString());
           // pSet1.setString(3,"Raise Invoice");
            //pSet1.setString(4,"''");
            java.sql.ResultSet rSet1 = pSet1.executeQuery();
            
            // java.sql.Statement stmt1 = connectDB.createStatement();
            
            // java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT distinct patient_no FROM hp_patient_card WHERE date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND payment_mode = 'Scheme' order by patient_no");
            
            while (rSet1.next()) {
                
                listStaffNoVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofStaffNos = listStaffNoVector.toArray();
        System.out.println("Done list of Staff Nos ...");
        return listofStaffNos;
    }
    
}





