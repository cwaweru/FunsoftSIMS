//Author Charles Waweru

//Made to test Java support for Threads.

//Revision : Ver 1.0a

//import java.lang.*;

package com.afrisoftech.accounting;
import java.awt.Point;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.*;


public class ReceiptsCopyPdf implements java.lang.Runnable {
    
    java.lang.String MNo = null;
    
    java.lang.String beginDate = null;
    
    java.lang.String endDate = null;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    
    //  java.lang.String memNo2Use = null;
    
    java.lang.Thread threadSample;
    
    //    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.NORMAL);
    //    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    // public void ReceiptsPdf(java.sql.Connection connDb, java.lang.String begindate, java.lang.String endate, java.lang.String combox) {
    
    public void ReceiptsCopyPdf(java.sql.Connection connDb, java.lang.String combox) {
        
        MNo = combox;
        
        connectDB = connDb;
        
        // beginDate = begindate;
        
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
            
            int titleFont = 0;
            int bodyFont = 0;
            float Widths = 0;
            float Heights = 0;
            float Margins = 0;
            
            try {
                connectDB.setAutoCommit(false);
                
                java.sql.Statement stm1 = connectDB.createStatement();
                java.sql.ResultSet rse1 = stm1.executeQuery("select header_font,body_font,width,height,margins from receipt_pref");
                while (rse1.next()){
                    titleFont = rse1.getInt(1);
                    bodyFont = rse1.getInt(2);
                    Widths = rse1.getFloat(3);
                    Heights = rse1.getFloat(4);
                    Margins = rse1.getFloat(5);
                }
            }catch(java.sql.SQLException sq){
                
                try {
                    connectDB.rollback();
                }catch (java.sql.SQLException sql){
                    //   javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                }
                System.out.println(sq.getMessage());
                //   javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(), "Error",javax.swing.JOptionPane.ERROR_MESSAGE);
                
            }
            // com.lowagie.text.Font pFontHeader = FontFactory.getFont(System.getProperty("font_type_name"), java.lang.Float.parseFloat(System.getProperty("receiptFontSize")), Font.NORMAL);
            // com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(System.getProperty("font_type_name"), java.lang.Float.parseFloat(System.getProperty("receiptTitleFontSize")), Font.BOLD);
            com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, bodyFont, Font.NORMAL);
            com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, titleFont, Font.BOLD);
            
            
            // com.lowagie.text.Document docPdf = new com.lowagie.text.Document(new Rectangle(java.lang.Float.parseFloat(System.getProperty("papersize_width")), java.lang.Float.parseFloat(System.getProperty("papersize_legnth"))),java.lang.Float.parseFloat(System.getProperty("receiptPageMargin")),java.lang.Float.parseFloat(System.getProperty("receiptPageMargin")),java.lang.Float.parseFloat(System.getProperty("receiptPageMargin")),java.lang.Float.parseFloat(System.getProperty("receiptPageMargin")));
            com.lowagie.text.Document docPdf = new com.lowagie.text.Document(new Rectangle((Widths), Heights),Margins,Margins,Margins,Margins);
            
            
            //            com.lowagie.text.Document docPdf = new com.lowagie.text.Document(new Rectangle(java.lang.Float.parseFloat(System.getProperty("papersize_width")), java.lang.Float.parseFloat(System.getProperty("papersize_legnth"))));
            
            try {
                
                try {
                    
                    com.lowagie.text.pdf.PdfWriter.getInstance(docPdf, new java.io.FileOutputStream(tempFile));
                    
                    
                    
                    
                    
                    String compName = null;
                    String date = null;
                   /* try {
                    
                    
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
                    */
                    //   com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Member Statements - Page: "), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    //   docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    String footers = null;
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(6);
                        
                        int headerwidths[] = {15,20,20,15,15,15};
                        
                        //  table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                         table.getDefaultCell().setBorder(Rectangle.BOTTOM|Rectangle.LEFT|Rectangle.RIGHT);
                        
                        //  table.getDefaultCell().setColspan(6);
                        
                        Phrase phrase = new Phrase("");
                        
                        // table.addCell(phrase);
                       // table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setColspan(1);
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        //table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        try {
                            
                            java.sql.Statement st = connectDB.createStatement();
                            java.sql.Statement st1 = connectDB.createStatement();
                            java.sql.Statement st2 = connectDB.createStatement();
                            java.sql.Statement st5 = connectDB.createStatement();
                            java.sql.Statement st6 = connectDB.createStatement();
                            java.sql.Statement st51 = connectDB.createStatement();
                            java.sql.Statement st3 = connectDB.createStatement();
                            java.sql.ResultSet rset3 = st3.executeQuery("select header,footer from ac_receipt_header");
                            
                            
                            //  java.sql.ResultSet rset3 = st3.executeQuery("select hospital_name,postal_code||' '||box_no,main_telno||' '||other_telno,initcap(street),main_faxno,email,website,room_no from pb_hospitalprofile");
                            java.sql.ResultSet rset1 = st1.executeQuery("select cb.dealer from ac_cash_collection cb where cb.receipt_no = '"+MNo+"' AND cb.transaction_type = 'Receipts'");
                            java.sql.ResultSet rsetTotals = st2.executeQuery("select sum(pc.debit) as debit from ac_cash_collection pc where receipt_no = '"+MNo+"' AND pc.transaction_type = 'Receipts'");
                            java.sql.ResultSet rs = st.executeQuery("select cb.receipt_no,date from ac_cash_collection cb where receipt_no = '"+MNo+"'");
                            java.sql.ResultSet rset5 = st5.executeQuery("select account_no from ac_cash_collection where receipt_no = '"+MNo+"' AND transaction_type = 'Receipts' group by account_no,description");
                            java.sql.ResultSet rset51 = st51.executeQuery("select description,sum(debit) from ac_cash_collection where receipt_no = '"+MNo+"' AND transaction_type = 'Receipts' group by account_no,description");
                            
                            java.sql.ResultSet rset6 = st6.executeQuery("select payment_mode||' '||cheque_no, user_name,cash_point from ac_cash_collection where receipt_no = '"+MNo+"' AND transaction_type = 'Receipts'");
                            System.out.println(MNo);
                            
                            while (rset3.next()){
                                table.getDefaultCell().setColspan(6);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                phrase = new Phrase(rset3.getObject(1).toString(), pFontHeader1);
                                table.addCell(phrase);
                                footers = rset3.getObject(2).toString();
                            }
                            //  table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            //  table.getDefaultCell().setBorderWidth(Rectangle.TOP);
                            while (rs.next())
                                
                                table.getDefaultCell().setColspan(2);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Receipt No : "+ rs.getString(1), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(3);
                            phrase = new Phrase("RECEIPT COPY", pFontHeader1);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(1);
                            
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Date "+ rs.getObject(2).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            
                            
                       /*     table.getDefaultCell().setColspan(3);
                        
                            phrase = new Phrase("Description", pFontHeader);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("Qty", pFontHeader);
                            table.addCell(phrase);
                            //  table.addCell("Description");
                        
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase("Amount KShs.", pFontHeader);
                            table.addCell(phrase);
                        */
                            while (rset1.next())
                                
                                table.getDefaultCell().setColspan(6);
                        //    table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Received From :" +rset1.getObject(1).toString(), pFontHeader);
                            
                            table.addCell(phrase);
                            while (rset5.next())
                                table.getDefaultCell().setColspan(1);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase(" ", pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(6);
                           // table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("In Respect Of :" , pFontHeader);
                            
                            table.addCell(phrase);
                            
                            
                            while (rset51.next()){
                                
                                table.getDefaultCell().setColspan(2);
                                phrase = new Phrase("    " , pFontHeader);
                                
                                table.addCell(phrase);
                                
                                phrase = new Phrase(rset51.getObject(1).toString(), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                //   table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset51.getString(2)),pFontHeader);
                                table.addCell(phrase);
                                
                                
                            }
                            
                  /*              table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                   
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(5)),pFontHeader);
                   
                                table.addCell(phrase);
                   
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                   
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(6)),pFontHeader);
                   
                                table.addCell(phrase);
                   
                            }
                   */
                            // table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            //table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            while (rsetTotals.next()) {
                                table.getDefaultCell().setColspan(1);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(" ", pFontHeader);
                                
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Total", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(" ", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals.getString(1)),pFontHeader);
                                
                                table.addCell(phrase);
                                
                                
                             /*   table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals.getString(2)),pFontHeader);
                              
                                //phrase = new Phrase(" ");
                              
                                table.addCell(phrase);
                              
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                              
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals.getString(3)),pFontHeader);
                              
                                table.addCell(phrase);
                              
                              
                              */
                            }
                            
                            while (rset6.next())
                                
                                table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Payment Mode : " +rset6.getString(1), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Served By : " +rset6.getString(2).toString(), pFontHeader);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(6);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Cash Point : " +rset6.getString(3).toString(), pFontHeader);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            table.getDefaultCell().setColspan(6);
                            phrase = new Phrase(footers , pFontHeader);
                            table.addCell(phrase);
                            
                            //  table.getDefaultCell().setColspan(6);
                            //  phrase = new Phrase("Thank You." , pFontHeader);
                            //  table.addCell(phrase);
                            
                            docPdf.add(table);
                            //  java.sql.PreparedStatement pstmt4 = connectDB.prepareStatement("UPDATE hp_patient_card SET paid ='true' WHERE patient_no = '"+MNo+"' AND date::date = current_date");
                            //  pstmt4.executeUpdate();
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
                    //                    wait_for_Pdf2Show = rt.exec("cat kghostview "+tempFile+"");
                    
                    wait_for_Pdf2Show.waitFor();
                    
                } else {
                    
                    //                    wait_for_Pdf2Show = rt.exec("c:/Program Files/Adobe/Acrobat 5.0/Reader/AcroRd32.exe "+tempFile);
                    wait_for_Pdf2Show = rt.exec("cmd.exe /C AcroRd32 /p /h "+tempFile);
                    
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





