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


public class SchmOpeningPdf implements java.lang.Runnable {
    java.lang.String memNo = null;
    
    java.lang.String memNo1 = null;
    
    com.afrisoftech.lib.DBObject dbObject;
    
    java.util.Date beginDate = null;
    
    java.util.Date endDate = null;
    
    com.lowagie.text.HeaderFooter headerFoter;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    
    //  java.lang.String memNo2Use = null;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.BOLD);
    com.lowagie.text.Font pFontHeader11 = FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    //  public void FinalPatientInvoicePdf(java.sql.Connection connDb, java.lang.String begindate, java.lang.String endate, java.lang.String combox) {
    public void SchmOpeningPdf(java.sql.Connection connDb,java.lang.String combox1,java.lang.String combox) {
        
        dbObject = new com.afrisoftech.lib.DBObject();
        
         memNo1 = combox1;
        memNo = combox;
        
        connectDB = connDb;
        
     //  beginDate = begindate;
        
       // endDate = endate;
        
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
            double osBalance1 = 0.00;
            double osBalance = 0.00;
            double current = 0.00;
            double osBalancebf = 0.00;
            try {
                
                try {
                    
                    com.lowagie.text.pdf.PdfWriter.getInstance(docPdf, new java.io.FileOutputStream(tempFile));
                    
                    
                    String compName = null;
                    String date = null;
                    String Messg = null;
                    
             
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Schemes Amendments - Page: ", pFontHeader1), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                  //  docPdf.open();
                    docPdf.open();
                    //  double osBalance1 = 0.00;
            double osBalanceD = 0.00;
          //  double current = 0.00;
            double osBalanceT = 0.00;
                    try {
                        
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        
                        long dateNow = calendar.getTimeInMillis();
                        
                        java.sql.Date datenowSql= new java.sql.Date(dateNow);
                        
                        System.out.println(datenowSql.toString());
                        
                        java.lang.Object listofStaffNos[] = this.getListofStaffNos();
                        
                        
                        com.lowagie.text.pdf.PdfPTable table1 = new com.lowagie.text.pdf.PdfPTable(7);
                        //  com.lowagie.text.Table table = new com.lowagie.text.Table(7);
                        
                        // table.endHeaders();
                        
                        int headerwidths[] = {15,15,30,15,15,15,15};
                        
                        table1.setWidths(headerwidths);
                        //  if (docPdf.getPageNumber() > 1) {
                        //  table1.setHeaderRows(4);
                        //  }
                        table1.setWidthPercentage((100));
                        
                        
                        table1.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table1.getDefaultCell().setColspan(7);
                        
                        Phrase phrase = new Phrase();
                        
                        //  table.addCell(phrase);
                        
                        table1.getDefaultCell().setColspan(1);
                        table1.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table1.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        try {
                            java.sql.Statement st3 = connectDB.createStatement();
                            java.sql.ResultSet rset3 = st3.executeQuery("select header_name from pb_header");
                            while (rset3.next())
                                table1.getDefaultCell().setColspan(7);
                            
                            table1.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase(rset3.getObject(1).toString(), pFontHeader11);
                            table1.addCell(phrase);
                            
                        } catch(java.sql.SQLException SqlExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                            
                        }
                        docPdf.add(table1);
                    } catch(com.lowagie.text.BadElementException BadElExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), BadElExec.getMessage());
                        
                    }
                    
                    //  } catch(java.io.FileNotFoundException fnfExec) {
                    
                    //  javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), fnfExec.getMessage());
                    
                    /// }
                    try {
                        
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        
                        long dateNow = calendar.getTimeInMillis();
                        
                        java.sql.Date datenowSql= new java.sql.Date(dateNow);
                        
                        System.out.println(datenowSql.toString());
                        
                        java.lang.Object listofStaffNos[] = this.getListofStaffNos();
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(6);
                        //  com.lowagie.text.Table table = new com.lowagie.text.Table(7);
                        
                        // table.endHeaders();
                        
                        int headerwidths[] = {10,10,25,10,10,10};
                        
                        table.setWidths(headerwidths);
                        //  if (docPdf.getPageNumber() > 1) {
                        table.setHeaderRows(6);
                        //  }
                        table.setWidthPercentage((100));
                        
                        
                        //table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(6);
                        
                        Phrase phrase = new Phrase();
                        
                        //  table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(1);
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                      //  table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        double Deposit = 0.00;
                        try {
                            
                             java.sql.Statement st22 = connectDB.createStatement();
                            java.sql.Statement st11 = connectDB.createStatement();
                            java.sql.Statement st = connectDB.createStatement();
                            java.sql.Statement st1111 = connectDB.createStatement();
                            java.sql.Statement st111 = connectDB.createStatement();
                            java.sql.Statement st1 = connectDB.createStatement();
                            java.sql.Statement st2 = connectDB.createStatement();
                            java.sql.Statement st3 = connectDB.createStatement();
                            java.sql.Statement st4 = connectDB.createStatement();
                            java.sql.Statement st41 = connectDB.createStatement();
                             java.sql.Statement st4111 = connectDB.createStatement();
                         
                             java.sql.Statement st411 = connectDB.createStatement();
                          //  java.sql.ResultSet rset41 = st41.executeQuery("select payer_name from ac_schemes where account_no = '"+memNo+"'");
                            //   java.sql.ResultSet rset1 = st1.executeQuery("select ac.date,pc.scheme_staff_no, ac.payee,ac.reference_no,sum(ac.debit),ac.admission_no from hp_patient_card pc,ac_debtors ac where pc.patient_no = ac.admission_no and ac.dealer = '"+memNo+"' and ac.dealer = pc.scheme AND ac.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and ac.debit > 0 group by ac.date,pc.scheme_staff_no, ac.payee,ac.reference_no,ac.admission_no");// UNION select pd.date::date,initcap(pd.scheme_staff_no), (sh.first_name||' '||sh.second_name||' '||sh.last_name) as name,pd.reference,sum(pd.credit),pd.patient_no from hp_patient_card pd,hp_inpatient_register sh where pd.patient_no = sh.patient_no and pd.isurer = '"+memNo+"' AND pd.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pd.credit > 0 group by pd.date::date,pd.scheme_staff_no, name,pd.reference,pd.invoice_no,pd.patient_no order by pd.invoice_no");
                                java.sql.ResultSet rset411 = st411.executeQuery("select payer_name,  scheme_name ,  account_no ,address , tel_main , other_tel ,  main_fax ,email ,building_name ,street , doc_ref,legal_status   ,contact1 ,town,date_registered ,expiry_date ,sig_name,  rec_date , marketing_contact ,credit_control,  scheme_limit,  allowed , closed from ac_schemes where account_no = '"+memNo+"' ");// UNION select pd.date::date,initcap(pd.scheme_staff_no), (sh.first_name||' '||sh.second_name||' '||sh.last_name) as name,pd.reference,sum(pd.credit),pd.patient_no from hp_patient_card pd,hp_inpatient_register sh where pd.patient_no = sh.patient_no and pd.isurer = '"+memNo+"' AND pd.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pd.credit > 0 group by pd.date::date,pd.scheme_staff_no, name,pd.reference,pd.invoice_no,pd.patient_no order by pd.invoice_no");
                      java.sql.ResultSet rset4 = st4.executeQuery("select sum(credit-debit) from ac_ledger where payee = '"+memNo+"' ");// UNION select pd.date::date,initcap(pd.scheme_staff_no), (sh.first_name||' '||sh.second_name||' '||sh.last_name) as name,pd.reference,sum(pd.credit),pd.patient_no from hp_patient_card pd,hp_inpatient_register sh where pd.patient_no = sh.patient_no and pd.isurer = '"+memNo+"' AND pd.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pd.credit > 0 group by pd.date::date,pd.scheme_staff_no, name,pd.reference,pd.invoice_no,pd.patient_no order by pd.invoice_no");
                       while (rset4.next()){
                          Deposit = rset4.getDouble(1); 
                       }
                            
                            table.getDefaultCell().setColspan(6);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase("ACCOUNT INSTRUCTIONS CONFIRMATION", pFontHeader11);
                            table.addCell(phrase);
                            
                            
                            while (rset411.next()){
                          //      table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            table.getDefaultCell().setColspan(6);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("PAYER/CATEGORY : " +dbObject.getDBObject(rset411.getObject(1), "-"),pFontHeader);
                            table.addCell(phrase);
                               table.getDefaultCell().setColspan(3);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Scheme Name : " +dbObject.getDBObject(rset411.getObject(2), "-"),pFontHeader);
                            table.addCell(phrase);
                             phrase = new Phrase("Deposit : " +Deposit, pFontHeader1);
                            table.addCell(phrase);
                             table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Account No : " +dbObject.getDBObject(rset411.getObject(3), "-"),pFontHeader);
                            table.addCell(phrase);
                         //  table.getDefaultCell().setColspan(2);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            phrase = new Phrase("Print Date " +datenowSql, pFontHeader1);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                                table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Address. : " +dbObject.getDBObject(rset411.getObject(4), "-"),pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase("Tel : " +dbObject.getDBObject(rset411.getObject(5), "-"),pFontHeader);
                            table.addCell(phrase);
                           table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Fax: " +dbObject.getDBObject(rset411.getObject(6), "-"),pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase("Email : " +dbObject.getDBObject(rset411.getObject(7), "-"),pFontHeader);
                            table.addCell(phrase);
                           table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Mobile : " +dbObject.getDBObject(rset411.getObject(8), "-"),pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase("Building : " +dbObject.getDBObject(rset411.getObject(9), "-"),pFontHeader);
                            table.addCell(phrase);
                          table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Street : " +dbObject.getDBObject(rset411.getObject(10), "-"),pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase("Document Ref : " +dbObject.getDBObject(rset411.getObject(11), "-"),pFontHeader);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Legal Status : " +dbObject.getDBObject(rset411.getObject(12), "-"),pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase("Contact : " +dbObject.getDBObject(rset411.getObject(13), "-"),pFontHeader);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                               phrase = new Phrase("Town : " +dbObject.getDBObject(rset411.getObject(14), "-"),pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase("Date Reg : " +dbObject.getDBObject(rset411.getObject(15), "-"),pFontHeader);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Exp Date : " +dbObject.getDBObject(rset411.getObject(16), "-"),pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase("Signatory's Name : " +dbObject.getDBObject(rset411.getObject(17), "-"),pFontHeader);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Receipt Date : " +dbObject.getDBObject(rset411.getObject(18), "-"),pFontHeader);
                            table.addCell(phrase);
                            phrase = new Phrase("Marketer : " +dbObject.getDBObject(rset411.getObject(19), "-"),pFontHeader);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Credit Controller : " +dbObject.getDBObject(rset411.getObject(20), "-"),pFontHeader);
                            table.addCell(phrase);
                             
                            phrase = new Phrase("Provider Limit : " +dbObject.getDBObject(rset411.getObject(21), "-"),pFontHeader);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("Cover : " +dbObject.getDBObject(rset411.getObject(22), "-"),pFontHeader);
                            table.addCell(phrase);
                             phrase = new Phrase("Status : " +dbObject.getDBObject(rset411.getObject(23), "-"),pFontHeader);
                            table.addCell(phrase);
                           
                                
                            }
                                
                            
                            table.getDefaultCell().setColspan(6);
                            
                           phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            
                            //  while (rsetTotals.next()) {
                            
                           
                          
                               
                                
                            
                          
                           
                              table.getDefaultCell().setBorderColor(java.awt.Color.white);
                         
                              table.getDefaultCell().setColspan(18);
                            phrase = new Phrase(" ");
                            
                            table.addCell(phrase);
                               table.getDefaultCell().setColspan(6);
                            phrase = new Phrase("DEAR CLIENTS: ");
                            
                            table.addCell(phrase);
                             phrase = new Phrase("We are pleased to advice you that we have implemented your instructions as indicated above.Inthe event of an error ,PLEASE notify us within 14 days otherwise the instructions shall be deemed valid.\n  Thank you.",pFontHeader1);
                          
                            table.addCell(phrase);
                            
                             table.getDefaultCell().setColspan(18);
                            phrase = new Phrase(" ");
                            
                            table.addCell(phrase);
                            phrase = new Phrase("Amended by:________________________         Verified By :__________________________  ",pFontHeader);
                            
                            table.addCell(phrase);
                           
                             
                            docPdf.add(table);
                            
                            
                            
                        } catch(java.sql.SQLException SqlExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                            
                        }
                        
                        // }  // }
                        
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
        
   /*     
        try {
            
            //    java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT admission_no FROM ac_debtors WHERE date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND invoice_no IS NOT NULL and admission_no IS NOT NULL");
            
            while (rSet1.next()) {
                
                listStaffNoVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
    */
        
        listofStaffNos = listStaffNoVector.toArray();
        System.out.println("Done list of Staff Nos ...");
        return listofStaffNos;
    }
    
    
    
    
}





