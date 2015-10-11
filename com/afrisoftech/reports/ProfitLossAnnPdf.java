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


public class ProfitLossAnnPdf implements java.lang.Runnable {
    
    java.util.Date beginDate = null;
    
    java.util.Date endDate = null;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    double income = 0.00;
    double expenses = 0.00;
    double profit = 0.00;
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.NORMAL);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void ProfitLossAnnPdf(java.sql.Connection connDb,java.util.Date begindate, java.util.Date endate) {
        
        connectDB = connDb;
        beginDate = begindate;
        endDate = endate;
        
        threadSample = new java.lang.Thread(this,"SampleThread");
        
        System.out.println("threadSample created");
        
        threadSample.start();
        
        System.out.println("threadSample fired");
        
    }
    
    public static void main(java.lang.String[] args) {
        
        //		new ProfitLossPdf().ProfitLossPdf();
        
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
                        
                        //    java.sql.Connection conDb = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                        
                        java.sql.Statement st3 = connectDB.createStatement();
                        java.sql.Statement st4 = connectDB.createStatement();
                        
                        java.sql.ResultSet rset2 = st3.executeQuery("SELECT hospital_name from pb_hospitalprofile");
                        java.sql.ResultSet rset4 = st4.executeQuery("SELECT date('now') as Date");
                        while(rset2.next())
                            compName = rset2.getObject(1).toString();
                        
                        while(rset4.next())
                            date = rset4.getObject(1).toString();
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+"", pFontHeader),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);
                        headerFoter.setRight(5);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Profit & Loss - Page: ", pFontHeader), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(3);
                        
                        int headerwidths[] = {25,50,25};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        table.setHeaderRows(2);
                        
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(3);
                        Phrase phrase = new Phrase("", pFontHeader);
                        
                        
                        try {
                            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                            
                            
                            java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());
                            //  java.util.Date endDate11 = dateFormat.parse(beginDate.toLocaleString());//dateInstance.toLocaleString());
                            
                            System.out.println(""+endDate1);
                            //  phrase = new Phrase(bank +" Report: " +dateFormat.format(formattedDate), pFontHeader);
                            
                            //  table.addCell(phrase);
                            table.getDefaultCell().setColspan(2);
                            
                            phrase = new Phrase("Profit & Loss :   As At : " +dateFormat.format(endDate1), pFontHeader);
                            
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(1);
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
                        
                        phrase = new Phrase("  ", pFontHeader);
                        
                        table.addCell(phrase);
                        
                        phrase = new Phrase("  ", pFontHeader);
                        
                        table.addCell(phrase);
                        
                        //  phrase = new Phrase("Reference", pFontHeader);
                        
                        //   table.addCell(phrase);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        
                        phrase = new Phrase("Amount KShs.", pFontHeader);
                        
                        table.addCell(phrase);
                        
                        //    phrase = new Phrase("Credit KShs.", pFontHeader);
                        
                        //   table.addCell(phrase);
                        
                        
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        
                        try {
                            
                            java.lang.Object[] listofAct = this.getListofActivities();
                            java.lang.Object[] listofAct1 = this.getListofActivities1();
                            //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                            
                            System.out.println(listofAct.length);
                            
                            java.sql.Statement st4 = connectDB.createStatement();
                            
                            java.sql.ResultSet rset4 = st4.executeQuery("select distinct sb.main_code,UPPER(sb.description) from pb_accounts_setup sb,pb_sub_activities sa where class LIKE 'pi%'");
                            
                            while (rset4.next()) {
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(rset4.getObject(1).toString(), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                //  table.addCell(rset4.getObject(1).toString());
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(rset4.getObject(2).toString(), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                
                                //  table.addCell(rset4.getObject(2).toString());
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                table.addCell("  ");
                                
                            }
                            
                            for (int i = 0; i < listofAct.length; i++) {
                                
                                java.sql.Statement st = connectDB.createStatement();
                                
                                java.sql.Statement st2 = connectDB.createStatement();
                                
                                java.sql.Statement st3 = connectDB.createStatement();
                                
                                java.sql.Statement st7 = connectDB.createStatement();
                                
                                java.sql.ResultSet rset = st.executeQuery("select sb.sub_code,sb.description,sum(ac.ytd_credit-ac.ytd_debit) from plsub_activities_view sb,pb_activity ac where sb.sub_code = '"+listofAct[i].toString()+"' and ac.sub_code = sb.sub_code group by sb.description,sb.sub_code");
                             //  select * from pb_activity where sub_code = plincome_view.sub_code 
                               // java.sql.ResultSet rsetTotals = st2.executeQuery("SELECT ac.code,SUM(tl.amount*-1),ac.activity from profit_loss_view tl,pb_activity ac,pb_sub_activities sb where tl.gl_code = ac.code and ac.sub_code ='"+listofAct[i].toString()+"' and ac.sub_code = sb.sub_code  AND tl.date BETWEEN '"+beginDate+"' AND '"+endDate+"' GROUP BY ac.activity,ac.code");
                                java.sql.ResultSet rsetTotals = st2.executeQuery("SELECT ac.code,SUM(ytd_credit - ytd_debit),ac.activity from pb_activity ac where ac.sub_code ='"+listofAct[i].toString()+"' GROUP BY ac.activity,ac.code order by ac.code");
                                
                               // rsetTotals1 = st3.executeQuery("SELECT SUM(ytd_credit-ytd_debit) from pb_activity");
                                table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                
                                
                                table.getDefaultCell().setColspan(3);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                table.addCell("  ");
                                
                                
                                while (rset.next()) {
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    
                                    phrase = new Phrase(rset.getObject(1).toString(), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    //  table.addCell(rset.getObject(1).toString());
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(rset.getObject(2).toString(), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    
                                    // table.addCell(rset.getObject(2).toString());
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(3)), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    
                                }
                                
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                                
                                
                                while (rsetTotals.next()) {
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                    phrase = new Phrase(rsetTotals.getObject(1).toString(), pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(rsetTotals.getObject(3).toString(), pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals.getString(2)), pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    income = income + rsetTotals.getDouble(2);
                                    
                                }
                                
                            }
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            
                          //  while (rsetTotals1.next()) {
                                
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Income Total", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(income)), pFontHeader);
                                
                                table.addCell(phrase);
                                
                           // }
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            
                            
                            table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("  ", pFontHeader);
                            
                            table.addCell(phrase);
                            
                            
                            java.sql.Statement st5 = connectDB.createStatement();
                            
                            java.sql.ResultSet rset5 = st5.executeQuery("select distinct sb.main_code,UPPER(sb.description) from pb_accounts_setup sb,pb_sub_activities sa where class LIKE 'pe%'");
                            while (rset5.next()) {
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                //   table.addCell(rset5.getObject(1).toString());
                                phrase = new Phrase(rset5.getObject(1).toString(), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                //  table.addCell(rset5.getObject(2).toString());
                                
                                phrase = new Phrase(rset5.getObject(2).toString(), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                table.addCell("  ");
                                
                            }
                            
                            for (int i = 0; i < listofAct1.length; i++) {
                                
                                java.sql.Statement st = connectDB.createStatement();
                                
                                java.sql.Statement st2 = connectDB.createStatement();
                                
                                java.sql.Statement st3 = connectDB.createStatement();
                                
                                java.sql.ResultSet rset = st.executeQuery("select ev.sub_code,ev.description,sum(ac.ytd_debit-ac.ytd_credit) from pb_sub_activities ev,pb_activity ac where ev.sub_code = '"+listofAct1[i].toString()+"'and ac.sub_code = ev.sub_code group by ev.description,ev.sub_code");
                                
                                //  java.sql.ResultSet rset = st.executeQuery("select * from plsub_activities_view where sub_code = '"+listofAct1[i].toString()+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                
                                java.sql.ResultSet rsetTotals = st2.executeQuery("SELECT ac.code,SUM(ac.ytd_debit-ac.ytd_credit),ac.activity from pb_activity ac where ac.sub_code ='"+listofAct1[i].toString()+"' GROUP BY ac.activity,ac.code ORDER BY ac.code");
                                
                             //   rsetTotals1 = st3.executeQuery("SELECT SUM(ytd_debit - ytd_credit) from pb_activity WHERE sub_code = '"+listofAct1[i].toString()+"'");
                                table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                
                                
                                table.getDefaultCell().setColspan(3);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                table.addCell("  ");
                                
                                
                                while (rset.next()) {
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    //  table.addCell(rset.getObject(1).toString());
                                    phrase = new Phrase(rset.getObject(1).toString(), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    //  table.addCell(rset.getObject(2).toString());
                                    
                                    phrase = new Phrase(rset.getObject(2).toString(), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(3)), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                }
                                
                                
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                                
                                
                                while (rsetTotals.next()) {
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                    phrase = new Phrase(rsetTotals.getObject(1).toString(), pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(rsetTotals.getObject(3).toString(), pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals.getString(2)), pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    expenses = expenses + rsetTotals.getDouble(2);
                                    
                                    
                                }
                                
                            }
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            
                        //    while (rsetTotals1.next()) {
                                
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Expenses Total", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                               // profit = income - expenses;
                                
                                   
                                  phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(expenses)), pFontHeader);
                                
                                  table.addCell(phrase);
                                
                          //  }
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            
                            //  table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            table.getDefaultCell().setColspan(3);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            table.addCell("  ");
                            
                            
                            java.sql.Statement st6 = connectDB.createStatement();
                            
                          //  java.sql.ResultSet rset6 = st6.executeQuery("select sum(amount) from profit_loss_view WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"'");
                            
                            
                           // while (rset6.next()) {
                                table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Profit/loss", pFontHeader);
                                
                                table.addCell(phrase);
                                
                                //  table.addCell("Profit/Loss");
                                table.getDefaultCell().setColspan(1);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                 profit = income - expenses;
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(profit)), pFontHeader1);
                           
                              //  phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset6.getString(1)), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                // table.addCell(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset6.getString(1)));
                                
                                
                           // }
                            
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
            
            //   java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT sub_code FROM plincome_view order by sub_code");
            
            while (rSet1.next()) {
                
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities = listActVector.toArray();
        
        return listofActivities;
    }
    
    public java.lang.Object[] getListofActivities1() {
        
        java.lang.Object[] listofActivities1 = null;
        
        java.util.Vector listActVector1 = new java.util.Vector(1,1);
        
        
        try {
            
            //  java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT sub_code FROM plexpenses_view order by sub_code");
            
            while (rSet1.next()) {
                
                listActVector1.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities1 = listActVector1.toArray();
        
        return listofActivities1;
    }
    
}





