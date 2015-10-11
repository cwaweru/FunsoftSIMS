//Author Charles Waweru

//Made to test Java support for Threads.

//Revision : Ver 1.0a

//import java.lang.*;

package com.afrisoftech.hospayroll;
import java.awt.Point;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.*;


public class EmployeeDetailsPdf implements java.lang.Runnable {
    
    java.lang.String beginDate = null;
    
    java.lang.String endDate = null;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    java.lang.String bank = null;
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 11, Font.NORMAL);
    com.lowagie.text.Font pFontNum = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    //public void EmployeeDetailsPdf(java.sql.Connection connDb,java.lang.String begindate,java.lang.String endate,java.lang.String combox) {
       public void EmployeeDetailsPdf(java.sql.Connection connDb,java.lang.String combox) {
    
        bank = combox;
        connectDB = connDb;
       // beginDate = begindate;
       // endDate = endate;
        
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
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+"                                                        Printed On: "+date+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        
                        //  com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setRight(5);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("General Ledger - Page: "), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(4);
                        
                        int headerwidths[] = {25,25,25,25};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        table.setHeaderRows(2);
                        
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(4);
                        
                        Phrase phrase;
                       // try {
                          //  java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG);//MEDIUM);
                            
                            
                           // java.util.Date formattedDate = dateFormat.parse(endDate);//dateInstance.toLocaleString());
                            
                            
                            phrase = new Phrase("Staff Details", pFontNum);
                            
                            table.addCell(phrase);
                       // } catch(java.text.ParseException psExec) {
                            
                          //  javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                            
                       // }
                        
                      
                        phrase = new Phrase("", pFontHeader);
                        
                        
                        //table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        
                        //phrase = new Phrase("Amount KShs.", pFontHeader);
                        
                        //table.addCell(phrase);
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        
                        try {
                            
                            java.lang.Object[] listofAct = this.getListofActivities();
                            
                            //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                            
                            System.out.println(listofAct.length);
                            
                            //  for (int i = 0; i < listofAct.length; i++) {
                            
                            java.sql.Statement st1 = connectDB.createStatement();
                            
                            java.sql.Statement st2 = connectDB.createStatement();
                            
                            java.sql.Statement st3 = connectDB.createStatement();
                            
                            System.out.println("Statements Created ...");
                            java.sql.ResultSet rset1 = st1.executeQuery("select employee_no,upper(first_name||' '||middle_name||' '||last_name),marital_status,birth_date,nationality,id_no,date_employed,official_desgnation,employee_grade,department,address,tel_no,estate,district,division,village,"+
                            "pin_no,nhif_no,nssf_no,payment_mode,bank,bank_account_no from master_file where employee_no = '"+bank+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                               java.sql.ResultSet rset2 = st2.executeQuery("select description,amount from allowances_benefits where staff_no = '"+bank+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                           
                            //  java.sql.ResultSet rset = st2.executeQuery("select EXTRACT (month from date)||' '||EXTRACT (year from date) as date,description,amount from posting where staff_no = '"+listofAct[i]+"' AND description IS NOT NULL AND date BETWEEN '"+beginDate+"' AND '"+endDate+"' order by date");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                            System.out.println("Select A done ...");
                            //            java.sql.ResultSet rsetTotals = st2.executeQuery("SELECT SUM(tl.debit),SUM(tl.credit),ac.activity from general_ledger_view tl,activity ac where tl.gl_code ='"+listofAct[i].toString()+"' and ac.code = '"+listofAct[i].toString()+"' AND tl.date BETWEEN '"+beginDate+"' AND '"+endDate+"' GROUP BY ac.activity");
                            System.out.println("Select B done ...");
                            //  rsetTotals1 = st3.executeQuery("SELECT SUM(amount) from posting WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"'");
                            System.out.println("Select C done ...");
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            
                            table.getDefaultCell().setColspan(4);
                          //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                           // table.addCell(" Personal Details :",);
                            phrase = new Phrase(" ", pFontNum);
                            table.addCell(phrase);
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            
                            table.getDefaultCell().setColspan(4);
                          //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                           // table.addCell(" Personal Details :",);
                            phrase = new Phrase("Personal Details : ", pFontNum);
                            table.addCell(phrase);
                            while (rset1.next())
                                
                              
                            table.getDefaultCell().setColspan(2);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Name :  " +rset1.getObject(2).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Birth Date  :  " +rset1.getObject(4).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Marital Status  :  " +rset1.getObject(3).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Nationality  :  " +rset1.getObject(5).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                         table.getDefaultCell().setColspan(4);
                          //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase("ID Details : ", pFontNum);
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(2);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("ID No.  :  " +rset1.getObject(6).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("District : " +rset1.getObject(14).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Division  :  " +rset1.getObject(15).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Village  : " +rset1.getObject(16).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(4);
                          //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase("Address Details :  ", pFontNum);
                            table.addCell(phrase);   table.getDefaultCell().setColspan(1);
                         table.getDefaultCell().setColspan(2);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Address :  "+rset1.getObject(11).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                             table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Tel  :  " +rset1.getObject(12).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Mobile  :  " +rset1.getObject(15).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Email  :  " +rset1.getObject(16).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(4);
                          //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase("Employment Details :  ", pFontNum);
                            table.addCell(phrase); 
                             table.getDefaultCell().setColspan(2);
                           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Employee No :  "+rset1.getObject(1).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                             table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Desig. : " +rset1.getObject(8).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Department  :  " +rset1.getObject(10).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Grade  :  " +rset1.getObject(9).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                              table.getDefaultCell().setColspan(4);
                          //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase("Statutory Details :", pFontNum);
                            table.addCell(phrase); 
                            table.getDefaultCell().setColspan(2);
                         
                          table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("PIN No  :  "+rset1.getObject(17).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                             table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("NSSF No  :  " +rset1.getObject(19).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("NHIF No.  :  " +rset1.getObject(18).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("HELB No." , pFontHeader);
                            
                            table.addCell(phrase);
                                  table.getDefaultCell().setColspan(4);
                      
                          phrase = new Phrase("Payroll Details  :  ", pFontNum);
                            table.addCell(phrase); 
                            table.getDefaultCell().setColspan(2);
                         
                          table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Payment Mode  :  "+rset1.getObject(20).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                             table.getDefaultCell().setColspan(2);
                          table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("", pFontHeader);
                            table.addCell(phrase);
                            
                             table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Bank  :  " +rset1.getObject(21).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("A/C No.  : " +rset1.getObject(22).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            
                           // table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                           // phrase = new Phrase("HELB No." , pFontHeader);
                            
                           // table.addCell(phrase);
                            //  }
                            
            while (rset2.next()) {
                table.getDefaultCell().setColspan(2);
                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                phrase = new Phrase(rset2.getObject(1).toString(),pFontNum);
           
                table.addCell(phrase);
           
               
           
           
 //               table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
 //               table.addCell(rset.getObject(4).toString());
           
           
                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset2.getString(2)),pFontNum);
                table.addCell(phrase);
           
             //   table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
             //   phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(6)),pFontNum);
             //   table.addCell(phrase);
            }
           
           // }
           
           table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
           
           table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
           
          /* 
           while (rsetTotals1.next()) {
           
           table.getDefaultCell().setColspan(2);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
           phrase = new Phrase("Gross Total", pFontHeader);
           
           table.addCell(phrase);
           
           table.getDefaultCell().setColspan(1);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
           
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals1.getString(1)), pFontHeader);
           
           table.addCell(phrase);
           
          // table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
           
         //  phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals1.getString(2)), pFontHeader);
           
         //  table.addCell(phrase);
           }
         //   }
           */
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
    
    public java.lang.Object[] getListofActivities() {
        
        java.lang.Object[] listofActivities = null;
        
        java.util.Vector listActVector = new java.util.Vector(1,1);
        
        
        try {
            
            //    java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT staff_no FROM posting order by staff_no");
            
            while (rSet1.next()) {
                
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities = listActVector.toArray();
        System.out.println("Done list of staff_no ...");
        return listofActivities;
    }
    
}





