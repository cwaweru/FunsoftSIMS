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


public class DoctorsLedgerPdf1 implements java.lang.Runnable {
    
    //java.lang.String beginDate = null;
    
    java.util.Date endDate = null;
    java.util.Date beginDate = null;
    
    double osBalance = 0.00;
    double current = 0.00;
    double over30 = 0.00;
    double over60 = 0.00;
    double over90 = 0.00;
    double turnOver = 0.00;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.NORMAL);
    com.lowagie.text.Font pFontHeader2 = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void DoctorsLedgerPdf(java.sql.Connection connDb,java.util.Date begininput_date,java.util.Date eninput_date) {
        //public void OrderedItemsPdf(java.sql.Connection connDb) {
        
        connectDB = connDb;
        beginDate = begininput_date;
        endDate = eninput_date;
        System.out.println("Days Date"+endDate);
        // long enDate = java.util.Date.parse(endDate);
        
        // java.util.Date endDates = new java.util.Date(endDate);
        
        //java
       /* java.util.Calendar calendar = java.util.Calendar.getInstance();
        
                    java.util.Calendar endCal = java.util.Calendar.getInstance();
        
                    endCal.setTimeInMillis(java.util.Date.parse(endDate));
        
                    calendar.set(endCal.getTime().getYear(), 0, 1);
        
                    java.util.Date endDate = calendar.getTime();
        
                    System.out.println("First day of year "+endDate.toString());
        */
        
        
        
        threadSample = new java.lang.Thread(this,"SampleThread");
        
        System.out.println("threadSample created");
        
        threadSample.start();
        
        System.out.println("threadSample fired");
        
    }
    
    public static void main(java.lang.String[] args) {
        
        //		new TransactionsListPdf().TransactionsListPdf();
        
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
        
        java.lang.String input_date_label = null;
        
        java.lang.String month_now_strs = null;
        
        java.lang.String input_date_now_strs = null;
        
        java.lang.String year_now_strs = null;
        
        java.lang.String minute_now_strs = null;
        
        java.lang.String hour_now_strs = null;
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        java.util.Calendar calinst = java.util.Calendar.getInstance();
        
        java.util.Date input_date_now = calinst.getTime();
        
        int input_date_now_str = input_date_now.getDate();
        
        int month_now_str = input_date_now.getMonth();
        
        int year_now_str = input_date_now.getYear();
        
        int hour_now_str = input_date_now.getHours();
        
        int minute_now_str = input_date_now.getMinutes();
        
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
        
        if (input_date_now_str < 10) {
            
            input_date_now_strs = "0"+input_date_now_str;
            
        } else {
            
            input_date_now_strs = ""+input_date_now_str;
            
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
        
        input_date_label = input_date_now_strs+month_now_strs+year_now_strs+"@"+hour_now_strs+minute_now_strs;
        
        return input_date_label;
        
    }
    
    
    public void generatePdf() {
        
        java.lang.Process wait_for_Pdf2Show;
        
        java.util.Calendar cal = java.util.Calendar.getInstance();
        
        java.util.Date input_dateStampPdf = cal.getTime();
        
        java.lang.String pdfDateStamp = input_dateStampPdf.toString();
        
        
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
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName, pFontHeader2),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        
                        //  com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Doctors Ageing  Page: ",pFontHeader), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(7);
                        
                        int headerwidths[] = {22,13,13,13,13,13,13};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        table.setHeaderRows(2);
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(5);
                        Phrase phrase = new Phrase("");
                        try {
                            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                            
                            
                            java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//input_dateInstance.toLocaleString());
                            
                            System.out.println(""+endDate1);
                            //  phrase = new Phrase(bank +" Report: " +input_dateFormat.format(formattedDate), pFontHeader);
                            
                            //  table.addCell(phrase);
                            
                            
                            phrase = new Phrase("Debtors Ledger: " +dateFormat.format(endDate1), pFontHeader);
                            
                            table.addCell(phrase);
                        } catch(java.text.ParseException psExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                            
                        }
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        table.getDefaultCell().setColspan(2);
                        phrase = new Phrase("Printed on : "+date,pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(1);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                        phrase = new Phrase("Name",pFontHeader);
                        table.addCell(phrase);
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        
                        phrase = new Phrase("O/S Balance",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Current",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Over 30 days",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Over 60 Days",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        phrase = new Phrase("Over 90 days",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Turnover",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        
                        try {
                            
                            
                            java.lang.Object[] listofAct = this.getListofActivities();
                            
                            //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                            
                            System.out.println(listofAct.length);
                            
                            for (int i = 0; i < listofAct.length; i++) {
                                java.sql.Statement st2 = connectDB.createStatement();
                                java.sql.Statement st21 = connectDB.createStatement();
                                java.sql.Statement st22 = connectDB.createStatement();
                                java.sql.Statement st23 = connectDB.createStatement();
                                java.sql.Statement st211 = connectDB.createStatement();
                                java.sql.Statement st221 = connectDB.createStatement();
                                java.sql.Statement st231 = connectDB.createStatement();
                                java.sql.Statement st2A = connectDB.createStatement();
                                java.sql.Statement st2B = connectDB.createStatement();
                                java.sql.Statement st2C = connectDB.createStatement();
                                java.sql.Statement stc = connectDB.createStatement();
                                System.out.println("doctor_name Is : ["+listofAct[i]+"].");
                                
                                java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(credit_bal) from ac_doctors_ledger WHERE doctor_name = ? AND doctor_name IS NOT NULL AND input_date < '"+endDate+"'::date and input_date > '"+endDate+"'::date - 30 group by doctor_name");
                                pset.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset = pset.executeQuery();
                                
                                java.sql.PreparedStatement pset1 = connectDB.prepareStatement("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit_bal) END AS debit from ac_doctors_ledger WHERE doctor_name = ? AND input_date < '"+endDate+"'::date - interval '30 days' and input_date > '"+endDate+"'::date - 60 group by doctor_name");
                                pset1.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset1 = pset1.executeQuery();
                                
                                java.sql.PreparedStatement pset2 = connectDB.prepareStatement("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit_bal) END AS debit from ac_doctors_ledger WHERE doctor_name = ? AND input_date < '"+endDate+"'::date - interval '60 days' and input_date > '"+endDate+"'::date - 90 group by doctor_name");
                                pset2.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset2 = pset2.executeQuery();
                                
                                java.sql.PreparedStatement pset3 = connectDB.prepareStatement("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit_bal) END AS debit from ac_doctors_ledger WHERE doctor_name = ? AND input_date < '"+endDate+"'::date - interval '90 days' and input_date > '"+endDate+"'::date - 120 group by doctor_name");
                                pset3.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset3 = pset3.executeQuery();
                                
                                java.sql.PreparedStatement pset3A = connectDB.prepareStatement("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit_bal) END AS debit from ac_doctors_ledger WHERE doctor_name = ? group by doctor_name");
                                pset3A.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset1A = pset3A.executeQuery();
                                
                                java.sql.PreparedStatement pset2B = connectDB.prepareStatement("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit_bal) END AS debit from ac_doctors_ledger WHERE doctor_name = ? group by doctor_name");
                                pset2B.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset2B = pset2B.executeQuery();
                                
                                //java.sql.ResultSet rset = st.executeQuery("select doctor_name,sum(debit    ) from ac_doctors_ledger WHERE input_date BETWEEN '"+beginDate+"' AND '"+endDate+"' and transaction_type = 'Payment' and description = 'debit    ors Payable' OR description = 'Other Payables' AND debit - >0 GROUP BY voucher_no,input_date,doctor_name,item ORDER BY input_date");
                                //  java.sql.ResultSet rset1 = st21.executeQuery("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit-debit) END AS debit from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' AND input_date < '"+endDate+"'::input_date - interval '30 days' and input_date > '"+endDate+"'::input_date - 60 group by doctor_name");
                                // java.sql.ResultSet rset2 = st22.executeQuery("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit-debit) END AS debit from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' AND input_date < '"+endDate+"'::input_date - interval '60 days' and input_date > '"+endDate+"'::input_date - 90 group by doctor_name");
                                // java.sql.ResultSet rset3 = st23.executeQuery("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit-debit) END AS debit from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' AND input_date < '"+endDate+"'::input_date - interval '90 days' and input_date > '"+endDate+"'::input_date - 120 group by doctor_name");
                                //  java.sql.ResultSet rset1A = st2A.executeQuery("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit-debit) END AS debit from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' group by doctor_name");
                                //  java.sql.ResultSet rset2B = st2B.executeQuery("select CASE WHEN (doctor_name IS NULL) THEN '0.00' ELSE sum(credit-debit) END AS debit from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' group by doctor_name");
                                //   java.sql.ResultSet rset3C = stC.executeQuery("select CASE WHEN (payee IS NULL) THEN '0.00' ELSE sum(credit-debit) END AS debit - from ac_doctors_ledger WHERE payee = '"+listofAct[i]+"' AND input_date < curr by payee");//WHERE input_date BETWEEN '"+beginDate+"' AND '"+endDate+"' and transaction_type = 'Payment' and description = 'debit    ors Payable' OR description = 'Other Payables' AND debit - >0");
                                
                                
                                java.sql.PreparedStatement pset11 = connectDB.prepareStatement("select COUNT(doctor_name) from ac_doctors_ledger WHERE doctor_name = ? AND input_date < '"+endDate+"'::date - interval '30 days' and input_date > '"+endDate+"'::date - 60 group by doctor_name");
                                pset11.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset11 = pset11.executeQuery();
                                
                                java.sql.PreparedStatement pset21 = connectDB.prepareStatement("select COUNT(doctor_name) from ac_doctors_ledger WHERE doctor_name = ? AND input_date < '"+endDate+"'::date - interval '60 days' and input_date > '"+endDate+"'::date - 90 group by doctor_name");
                                pset21.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset21 = pset21.executeQuery();
                                java.sql.PreparedStatement pset31 = connectDB.prepareStatement("select COUNT(doctor_name) from ac_doctors_ledger WHERE doctor_name = ? AND input_date < '"+endDate+"'::date - interval '90 days' and input_date > '"+endDate+"'::date - 120 group by doctor_name");
                                pset31.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rset31 = pset31.executeQuery();
                                
                                java.sql.PreparedStatement psetc = connectDB.prepareStatement("select COUNT(doctor_name) from ac_doctors_ledger WHERE doctor_name = ? AND input_date < '"+endDate+"'::date and input_date > '"+endDate+"'::date - 30 group by doctor_name");
                                psetc.setString(1,listofAct[i].toString());
                                java.sql.ResultSet rsetc = psetc.executeQuery();
                                
                                //  java.sql.ResultSet rset11 = st211.executeQuery("select COUNT(doctor_name) from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' AND input_date < '"+endDate+"'::input_date - interval '30 days' and input_date > '"+endDate+"'::input_date - 60 group by doctor_name");//WHERE input_date BETWEEN '"+beginDate+"' AND '"+endDate+"' and transaction_type = 'Payment' and description = 'debit    ors Payable' OR description = 'Other Payables' AND debit - >0");
                                //  java.sql.ResultSet rset21 = st221.executeQuery("select COUNT(doctor_name) from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' AND input_date < '"+endDate+"'::input_date - interval '60 days' and input_date > '"+endDate+"'::input_date - 90 group by doctor_name");//WHERE input_date BETWEEN '"+beginDate+"' AND '"+endDate+"' and transaction_type = 'Payment' and description = 'debit    ors Payable' OR description = 'Other Payables' AND debit - >0");
                                //  java.sql.ResultSet rset31 = st231.executeQuery("select COUNT(doctor_name) from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' AND input_date < '"+endDate+"'::input_date - interval '90 days' and input_date > '"+endDate+"'::input_date - 120 group by doctor_name");//WHERE input_date BETWEEN '"+beginDate+"' AND '"+endDate+"' and transaction_type = 'Payment' and description = 'debit    ors Payable' OR description = 'Other Payables' AND debit - >0");
                                //   java.sql.ResultSet rsetc = stc.executeQuery("select COUNT(doctor_name) from ac_doctors_ledger WHERE doctor_name = '"+listofAct[i]+"' AND input_date < '"+endDate+"'::input_date and input_date > '"+endDate+"'::input_date - 30 group by doctor_name");//WHERE input_date BETWEEN '"+beginDate+"' AND '"+endDate+"' and transaction_type = 'Payment' and description = 'debit    ors Payable' OR description = 'Other Payables' AND debit - >0");
                                
  /*
                                 double osBalance = 0.00;
     double current = 0.00;
     double over30 = 0.00;
     double over60 = 0.00;
     double over90 = 0.00;
     double turnOver = 0.00;
   */
                                int t = 0;
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(""+listofAct[i], pFontHeader1);
                                table.addCell(phrase);
                                
                                
                                while (rsetc.next()){
                                    t = rsetc.getInt(1);
                                }
                                if (t > 0){
                                    while (rset.next()){
                                        
                                        table.getDefaultCell().setColspan(1);
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        osBalance = osBalance + rset.getDouble(1);
                                    }
                                }else{
                                    phrase = new Phrase("0.00" ,pFontHeader1);
                                    table.addCell(phrase);
                                }
                                while (rset1A.next()){
                                    //System.out.println("This Result " +rset1.getString(1));
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1A.getString(1)),pFontHeader1);
                                    table.addCell(phrase);
                                    current = current + rset1A.getDouble(1);
                                }
                                int j = 0;
                                int k = 0;
                                int r = 0;
                                //  while (rset1.next()){
                                while (rset11.next()){
                                    j = rset11.getInt(1);
                                }
                                if (j > 0){
                                    
                                    while (rset1.next()){
                                        System.out.println("This Result " +rset1.getString(1));
                                        table.getDefaultCell().setColspan(1);
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        over30 = over30 + rset1.getDouble(1);
                                    }
                                }else{
                                    phrase = new Phrase("0.00" ,pFontHeader1);
                                    table.addCell(phrase);
                                }
                                
                                while (rset21.next()){
                                    k = rset21.getInt(1);
                                }
                                if (k > 0){
                                    
                                    while (rset2.next()){
                                        System.out.println("This Result " +rset2.getString(1));
                                        table.getDefaultCell().setColspan(1);
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset2.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        over60 = over60 + rset2.getDouble(1);
                                    }
                                }else{
                                    phrase = new Phrase("0.00" ,pFontHeader1);
                                    table.addCell(phrase);
                                }
                                
                          /*      while (rset2.next()){
                           
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset2.getString(1)),pFontHeader1);
                                    table.addCell(phrase);
                                }
                           */
                                
                                while (rset31.next()){
                                    r = rset31.getInt(1);
                                }
                                if (r > 0){
                                    
                                    while (rset3.next()){
                                        System.out.println("This Result " +rset3.getString(1));
                                        table.getDefaultCell().setColspan(1);
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset3.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        over90 = over90 + rset3.getDouble(1);
                                    }
                                }else{
                                    phrase = new Phrase("0.00" ,pFontHeader1);
                                    table.addCell(phrase);
                                }
                                while (rset2B.next()){
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset2B.getString(1)),pFontHeader1);
                                    table.addCell(phrase);
                                    turnOver = turnOver + rset2B.getDouble(1);
                                }
                                
                            }
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            // while (rsetTotals.next()) {
                            
                            table.getDefaultCell().setColspan(1);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Total", pFontHeader);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            // phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals.getString(1)), pFontHeader);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalance)), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(current)), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(over30)), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(over60)), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(over90)), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(turnOver)), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            
                            docPdf.add(table);
                            
                        } catch(java.sql.SQLException SqlExec) {
                            
                            SqlExec.printStackTrace();
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                            
                        }
                        
                     /*   } catch(java.text.ParseException psExec) {
                      
                           javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                      
                       }
                      */
                        
                    } catch(com.lowagie.text.BadElementException BadElExec) {
                        
                        // Bad
                        
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
            java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("SELECT DISTINCT doctor_name FROM ac_doctors_ledger where input_date BETWEEN ? AND ? and doctor_name IS NOT NULL order by doctor_name");
            
            pSet1.setString(1,beginDate.toString());
            pSet1.setString(2,endDate.toString());
            java.sql.ResultSet rSet1 = pSet1.executeQuery();
            
            // java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT doctor_name FROM ac_doctors_ledger where input_date BETWEEN '1-2-2003' AND '11-12-2003' and doctor_name IS NOT NULL order by doctor_name");
            
            while (rSet1.next()) {
                System.out.println(rSet1.getObject(1).toString());
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            System.out.println(rSet1.getObject(1).toString());
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities = listActVector.toArray();
        System.out.println("Done list of activities ...");
        return listofActivities;
    }
}





