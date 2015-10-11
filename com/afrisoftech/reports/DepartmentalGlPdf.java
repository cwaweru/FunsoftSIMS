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


public class DepartmentalGlPdf implements java.lang.Runnable {
    
    java.util.Date beginDate = null;
    
    java.util.Date endDate = null;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    double sales = 0.00;
    double directexp = 0.00;
    double grossprofit = 0.00;
    double indirectexp = 0.00;
    double netprofit = 0.00;
    double indirectexptotal = 0.00;
    
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.NORMAL);
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void DepartmentalGlPdf(java.sql.Connection connDb, java.util.Date begindate, java.util.Date endate) {
        
        connectDB = connDb;
        beginDate = begindate;
        endDate = endate;
        
        
        threadSample = new java.lang.Thread(this,"SampleThread");
        
        System.out.println("threadSample created");
        
        threadSample.start();
        
        System.out.println("threadSample fired");
        
    }
    
    public static void main(java.lang.String[] args) {
        
        //		new TrialBalancePdf().TrialBalancePdf();
        
    }
    
    
    public void run() {
        
        System.out.println("System has entered running mode");
        
        while (threadCheck) {
            
            System.out.println("O.K. see how we execute target program");
            
            this.generatePdf();
            
            try {
                
                System.out.println("Right, let's wait for task to complete of fail");
                
                java.lang.Thread.currentThread().sleep(2000);
                
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
                        
                        //   java.sql.Connection conDb = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                        
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
                        
                        headerFoter.setRight(5);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Department Income & Expenditure - Page: ",pFontHeader), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    java.lang.Object[] listofAct = this.getListofActivities();
                    
                    //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                    
                    System.out.println(listofAct.length);
                    
                    for (int i = 0; i < listofAct.length; i++) {
                        try {
                            
                            
                            com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(2);
                            
                            int headerwidths[] = {60,40};
                            
                            table.setWidths(headerwidths);
                            
                            table.setWidthPercentage((100));
                            
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                            
                            table.getDefaultCell().setColspan(2);
                            
                            Phrase phrase = new Phrase("", pFontHeader);
                            
                            
                            try {
                                java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                                
                                
                                java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());
                                java.util.Date endDate11 = dateFormat.parse(beginDate.toLocaleString());//dateInstance.toLocaleString());
                                
                                System.out.println(""+endDate1);
                                //  phrase = new Phrase(bank +" Report: " +dateFormat.format(formattedDate), pFontHeader);
                                
                                //  table.addCell(phrase);
                                table.getDefaultCell().setColspan(1);
                                
                                phrase = new Phrase(listofAct[i].toString() +" Period : From "  +dateFormat.format(endDate11)+" To "+dateFormat.format(endDate1), pFontHeader);
                                
                                table.addCell(phrase);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                phrase = new Phrase("Printed On  :" +date , pFontHeader);
                                
                                table.addCell(phrase);
                            } catch(java.text.ParseException psExec) {
                                
                                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                                
                            }
                            // Phrase phrase = new Phrase(listofAct[i].toString() +": Income & Expenditure : Period : " +dateFormat.format(endDate11)+"' - '"+dateFormat.format(endDate1), pFontHeader);
                            
                            // table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            
                            // table.getDefaultCell().setBackgroundColor(java.awt.Color.LIGHT_GRAY);
                            
                            // phrase = new Phrase("Activity Code",pFontHeader);
                            // table.addCell(phrase);
                              table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                         
                            phrase = new Phrase("Description",pFontHeader);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            phrase = new Phrase("Amount KShs",pFontHeader);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            
                            
                            try {
                                
                                java.sql.Statement st = connectDB.createStatement();
                                
                                java.sql.Statement st2 = connectDB.createStatement();
                                java.sql.Statement st3 = connectDB.createStatement();
                                java.sql.Statement st1 = connectDB.createStatement();
                                java.sql.Statement st4 = connectDB.createStatement();
                                java.sql.Statement st5 = connectDB.createStatement();
                                java.sql.Statement st6 = connectDB.createStatement();
                                java.sql.Statement st7 = connectDB.createStatement();
                                java.sql.Statement st31 = connectDB.createStatement();
                                
                                // java.sql.ResultSet rset = st.executeQuery("SELECT service_type,sum(amount) from dept_income WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND department = '"+listofAct[i].toString()+"' group by service_type,department");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                java.sql.ResultSet rset = st.executeQuery("SELECT sum(amount) from dept_income WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND department = '"+listofAct[i].toString()+"' group by department");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                java.sql.ResultSet rset3 = st3.executeQuery("SELECT activity,sum(amount) from dept_expediture WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND department = '"+listofAct[i].toString()+"' group by activity,department");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                java.sql.ResultSet rset1 = st1.executeQuery("SELECT sum(amount) from dept_income WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND department = '"+listofAct[i].toString()+"'");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                java.sql.ResultSet rset31 = st31.executeQuery("SELECT sum(amount) from dept_expediture WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND department = '"+listofAct[i].toString()+"'");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                java.sql.ResultSet rset4 = st4.executeQuery("select ab.department,sum(tc.basic_salary) from allowances_benefits ab,tax_card tc where tc.staff_no = ab.staff_no AND tc.date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND ab.department = '"+listofAct[i].toString()+"' group by ab.department");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                java.sql.ResultSet rset5 = st5.executeQuery("select ab.cost_center,sum(ab.credit) from st_stock_cardex ab WHERE credit > 0 AND ab.date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND ab.cost_center = '"+listofAct[i].toString()+"' group by ab.cost_center");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                java.sql.ResultSet rset6 = st6.executeQuery("select sb.store_name,sum((sb.receiving - sb.issuing)* bv.avg) from st_sub_stores sb,buying_price_view bv WHERE sb.item = bv.item AND sb.trans_date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND store_name = '"+listofAct[i].toString()+"' group by sb.store_name");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                java.sql.ResultSet rset7 = st7.executeQuery("select sb.store_name,sum((sb.issuing)* bv.avg) from st_sub_stores sb,buying_price_view bv WHERE sb.item = bv.item AND sb.trans_date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND store_name = '"+listofAct[i].toString()+"' group by sb.store_name");// AND tb.transaction_no IS NOT NULL AND tb.gl_code !='' AND ac.code = tb.gl_code  group by tb.gl_code,ac.activity order by tb.gl_code");
                                
                                //  java.sql.ResultSet rsetTotals = st2.executeQuery("SELECT SUM(debit - credit) from trial_balance_view WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND transaction_no IS NOT NULL AND gl_code !=''");
                                
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(" ", pFontHeader);
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("TURNOVER", pFontHeader);
                                table.addCell(phrase);
                                
                                while (rset5.next()) {
                                    
                                    
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Purchases", pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset5.getString(2)),pFontHeader1);
                                    table.addCell(phrase);
                                }
                                while (rset6.next()) {
                                    
                                    
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Closing Stock", pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset6.getString(2)),pFontHeader1);
                                    table.addCell(phrase);
                                }
                                
                                while (rset7.next()) {
                                    
                                    
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Prime Costs", pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset7.getString(2)),pFontHeader1);
                                    table.addCell(phrase);
                                }
                                while (rset.next()) {
                                    
                                    
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Sales Realisation", pFontHeader1);
                                    //  phrase = new Phrase(rset.getString(1), pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(1)),pFontHeader1);
                                    table.addCell(phrase);
                                    sales = rset.getDouble(1);
                                }
                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                while (rset1.next()) {
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Totals", pFontHeader);
                                    table.addCell(phrase);
                                    
                                    
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(1)),pFontHeader);
                                    table.addCell(phrase);
                                }
                                table.getDefaultCell().setBorderColor(java.awt.Color.white);
                                
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(" ", pFontHeader);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("DIRECT OVERHEADS", pFontHeader);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                
                                while (rset4.next()) {
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Dept Salaries", pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset4.getString(2)),pFontHeader1);
                                    table.addCell(phrase);
                                    directexp = rset4.getDouble(2);
                                }
                                
                                
                                grossprofit = sales - directexp;
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Gross Profit", pFontHeader1);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(grossprofit)),pFontHeader1);
                                table.addCell(phrase);
                                
                                
                                table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("INDIRECT OVERHEADS", pFontHeader);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                while (rset3.next()) {
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(rset3.getString(1), pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset3.getString(2)),pFontHeader1);
                                    table.addCell(phrase);
                                    // indirectexp = indirectexp + rset3.getString(2);
                                }
                                
                                
                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                while (rset31.next()) {
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Totals", pFontHeader);
                                    table.addCell(phrase);
                                    
                                    
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset31.getString(1)),pFontHeader);
                                    table.addCell(phrase);
                                    indirectexptotal = rset31.getDouble(1);
                                }
                                  table.getDefaultCell().setBorderColor(java.awt.Color.white);
                             
                                table.getDefaultCell().setColspan(2);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(" ", pFontHeader);
                                table.addCell(phrase);
                                
                                  table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                             table.getDefaultCell().setColspan(1);
                                netprofit = grossprofit - indirectexptotal;
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Net Profit", pFontHeader);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(netprofit)),pFontHeader);
                                table.addCell(phrase);
                                //}
                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                           /* while (rsetTotals.next()) {
                            
                                table.getDefaultCell().setColspan(2);
                            
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("Total", pFontHeader);
                            
                                table.addCell(phrase);
                            
                                table.getDefaultCell().setColspan(1);
                            
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals.getString(1)), pFontHeader);
                            
                                table.addCell(phrase);
                            
                            }
                            */
                                docPdf.add(table);
                                
                            } catch(java.sql.SQLException SqlExec) {
                                
                                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                                
                            }
                            boolean boolNewPage = docPdf.newPage();
                            
                        } catch(com.lowagie.text.BadElementException BadElExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), BadElExec.getMessage());
                            
                        }
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
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT dp.department_name FROM pb_departments dp, ac_ledger lg where dp.department_name = lg.description order by dp.department_name");
            
            while (rSet1.next()) {
                
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities = listActVector.toArray();
        System.out.println("Done list of activities ...");
        return listofActivities;
    }
}





