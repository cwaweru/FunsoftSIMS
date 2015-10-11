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


public class AnnualDebtorsAgeingPdf implements java.lang.Runnable {
    double credit_bal = 0.00;
    double columnsTo = 0.00;
    //double over30 = 0.00;
    // double over60 = 0.00;
    //  double over90 = 0.00;
    // double turnOver = 0.00;
    int over = 0;
    int name = 0;
    
    com.afrisoftech.lib.DBObject dbObject;
    java.lang.String Debtor = null;
    java.util.Date endDate = null;
    java.util.Date beginDate = null;
    // com.afrisoftech.lib.PeriodicDates periodicDates = null;
    com.afrisoftech.timeseries.YearyAgeing ageingSeries= null;
    java.util.Date ageingDates[][] = null;
    
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
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA,8, Font.NORMAL);
    com.lowagie.text.Font pFontHeader2 = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void AnnualDebtorsAgeingPdf(java.sql.Connection connDb,java.util.Date begindate,java.util.Date endate) {
        //public void OrderedItemsPdf(java.sql.Connection connDb) {
        // Debtor = combox;
        connectDB = connDb;
        beginDate = begindate;
        endDate = endate;
        dbObject = new com.afrisoftech.lib.DBObject();
        System.out.println("Days Date"+endDate);
        //   periodicDates = new com.afrisoftech.lib.PeriodicDates(endDate, 3);
        ageingSeries = new com.afrisoftech.timeseries.YearyAgeing(4, endate);
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
        
        java.lang.Object[][] rangeDates = ageingSeries.getAgeingDateSeries();
        
        //  ageingDates = ageingSeries.getAgeingDateSeries();
        
        double columnTotals[] = new double[rangeDates.length];
        
        java.lang.Process wait_for_Pdf2Show;
        
        java.util.Calendar cal = java.util.Calendar.getInstance();
        
        java.util.Date dateStampPdf = cal.getTime();
        
        java.lang.String pdfDateStamp = dateStampPdf.toString();
        
        int interval = 0;
        
        try {
            
            java.io.File tempFile = java.io.File.createTempFile("REP"+this.getDateLable()+"_", ".pdf");
            
            tempFile.deleteOnExit();
            
            java.lang.Runtime rt = java.lang.Runtime.getRuntime();
            
            java.lang.String balanceTotal = null;
            
            java.lang.String credit_balTotal = null;
            
            com.lowagie.text.Document docPdf = new com.lowagie.text.Document();
            
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            
            long dateNow = calendar.getTimeInMillis();
            
            java.sql.Date datenowSql= new java.sql.Date(dateNow);
            
            System.out.println(datenowSql.toString());
            
            
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
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Ageing  Page: ",pFontHeader), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    
                    double Totals = 0.00;
                    double OS = 0.00;
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(rangeDates.length+4);
                        
                        String headerWidths = null;
                        
                        java.util.Vector headerVector = new java.util.Vector(1,1);
                        
                        int z = rangeDates.length;
                        
                        int headerwidths[] = {35,13,13,13,13,13,13,13};//,13,13};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((107));
                        
                        table.setHeaderRows(2);
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(8);
                        Phrase phrase = new Phrase("");
                        table.getDefaultCell().setColspan(5);
                        try {
                            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                            
                            
                            java.util.Date endDate2 = dateFormat.parse(endDate.toLocaleString());
                            
                            phrase = new Phrase("Annual Debtors Ageing as at " +dateFormat.format(endDate2), pFontHeader);
                            
                            table.addCell(phrase);
                        } catch(java.text.ParseException psExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                            
                        }
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        table.getDefaultCell().setColspan(3);
                        phrase = new Phrase("Printed on : "+date,pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(1);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                        phrase = new Phrase("Name",pFontHeader);
                        table.addCell(phrase);
                        interval = 0;
                        for (int i = rangeDates.length - 1; i >= 0; i--) {
                            
                            try {
                                
                                java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                                com.afrisoftech.lib.DateFormatter dateFormatter = new com.afrisoftech.lib.DateFormatter(dateFormat.parse(rangeDates[i][0].toString().trim()), "yyyy");
                                
                                java.lang.String monthString = dateFormatter.getDateString();
                                
                                int days = 1;
                                
                                phrase = new Phrase(monthString, pFontHeader);
                                //                                phrase = new Phrase("+ "+x*days +" Month",pFontHeader);
                               // interval = i;
                                // }
                                
                                table.addCell(phrase);
                                
                                
                            } catch(java.text.ParseException prs) {
                                prs.printStackTrace();
                            }
                            interval++;
                        }
                        phrase = new Phrase("Over "+((interval + 1) * 1)+" Years",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("UnAlloc.",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("O/S",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        //table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        
                        try {
                            
                            double GrandTotal = 0.00;
                            double Over120Total = 0.00;
                            java.lang.Object[] listofAct = this.getListofActivities();
                            
                            //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                            
                            System.out.println(listofAct.length);
                            
                            for (int i = 0; i < listofAct.length; i++) {
                                double TurnOver = 0.00;
                                double Over120 = 0.00;
                                double TotalCount = 0.00;
                                
                                
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                table.getDefaultCell().setColspan(1);
                                java.sql.Statement stmta1 = connectDB.createStatement();
                                java.sql.PreparedStatement pSeta1 = connectDB.prepareStatement("SELECT count(account_no) FROM ac_debtors where  account_no = '"+listofAct[i]+"' and balance > 0");
                                java.sql.PreparedStatement pset22 = connectDB.prepareStatement("select DISTINCT account_no||' '||scheme_name from ac_schemes WHERE account_no = ? ");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                pset22.setString(1,listofAct[i].toString().toUpperCase());
                                java.sql.ResultSet rSeta1 = pSeta1.executeQuery();
                                while (rSeta1.next()) {
                                    name = rSeta1.getInt(1);
                                    
                                }
                                if (name > 0){
                                    java.sql.ResultSet rset22 = pset22.executeQuery();
                                    
                                    while (rset22.next()){
                                        
                                        table.getDefaultCell().setColspan(1);
                                        phrase = new Phrase(dbObject.getDBObject(rset22.getObject(1), "-"),pFontHeader1);
                                        table.addCell(phrase);
                                        // columnTotals[t] = columnTotals[t] + rset.getDouble(1);
                                        
                                        
                                    }
                                    
                                    
                                    
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
                                    System.out.println("Dealer Is : ["+listofAct[i]+"].");
                                     
                                    //java.sql.PreparedStatement pset1 = connectDB.prepareStatement("select sum(balance) from ac_debtors WHERE account_no = ?  AND date <= '"+rangeDates[rangeDates.length - 1][0]+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                  
                                    
                                    java.sql.PreparedStatement pset1 = connectDB.prepareStatement("select sum(balance) from ac_debtors WHERE account_no = ?  AND date <= '"+rangeDates[0][0]+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                    pset1.setString(1,listofAct[i].toString());
                                    java.sql.ResultSet rset1 = pset1.executeQuery();
                                    
                                    java.sql.PreparedStatement pset111 = connectDB.prepareStatement("select sum(balance-credit_bal) from ac_debtors WHERE account_no = ?  AND date <= '"+endDate+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                    pset111.setString(1,listofAct[i].toString());
                                    java.sql.ResultSet rset111 = pset111.executeQuery();
                                    java.sql.Statement st02 = connectDB.createStatement();
                                    
                                    java.sql.PreparedStatement pset112 = connectDB.prepareStatement("select sum(credit_bal) from ac_debtors WHERE account_no = ? AND date <= '"+endDate+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                    pset112.setString(1,listofAct[i].toString());
                                    java.sql.ResultSet rset112 = pset112.executeQuery();
                                    
                                    
                                    for (int t = rangeDates.length - 1; t >= 0; t--) {
                                        
                                        java.sql.Statement st01 = connectDB.createStatement();
                                        
                                        java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(balance) from ac_debtors WHERE account_no = ?  AND date between '"+rangeDates[t][0]+"' AND '"+rangeDates[t][1]+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                        pset.setString(1,listofAct[i].toString().toUpperCase());
                                        java.sql.ResultSet rset = pset.executeQuery();
                                        
                                        
                                        while (rset.next()){
                                            
                                            table.getDefaultCell().setColspan(1);
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(1)),pFontHeader1);
                                            table.addCell(phrase);
                                            columnTotals[t] = columnTotals[t] + rset.getDouble(1);
                                            System.out.println("This is the total " +rset.getDouble(1));
                                            
                                        }
                                        TotalCount = TotalCount + rset.getDouble(1);
                                        
                                        
                                        
                                    }
                                    
                                    while (rset1.next()){
                                        System.out.println("This Result " +rset1.getString(1));
                                        table.getDefaultCell().setColspan(1);
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(1)),pFontHeader1);
                                        // phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency("0"),pFontHeader1);
                                        
                                        Over120 = rset1.getDouble(1);
                                        table.addCell(phrase);
                                        Over120Total = Over120Total+ rset1.getDouble(1);
                                        TurnOver = TotalCount + Over120;
                                        
                                    }
                                    
                                    
                                    
                                    
                                    while (rset112.next()){
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset112.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        OS = OS + rset112.getDouble(1);
                                    }
                                    
                                    
                                    
                                    //table.addCell(phrase);
                                    // Over120 = Over120+Over120;
                                    while (rset111.next()){
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset111.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        Totals = Totals + rset111.getDouble(1);
                                    }
                                }else{
                                    table.getDefaultCell().setColspan(1);
                                    //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase("-",pFontHeader1);
                                    table.addCell(phrase);
                                    
                                    
                                    
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
                                    System.out.println("Dealer Is : ["+listofAct[i]+"].");
                                    
                                    
                                    java.sql.PreparedStatement pset1 = connectDB.prepareStatement("select sum(balance) from ac_debtors WHERE account_no = ?  AND date <= '"+rangeDates[rangeDates.length - 1][0]+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                    pset1.setString(1,listofAct[i].toString());
                                    java.sql.ResultSet rset1 = pset1.executeQuery();
                                    
                                    java.sql.PreparedStatement pset111 = connectDB.prepareStatement("select sum(balance-credit_bal) from ac_debtors WHERE account_no = ?  AND date <= '"+endDate+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                    pset111.setString(1,listofAct[i].toString());
                                    java.sql.ResultSet rset111 = pset111.executeQuery();
                                    java.sql.Statement st02 = connectDB.createStatement();
                                    
                                    java.sql.PreparedStatement pset112 = connectDB.prepareStatement("select sum(credit_bal) from ac_debtors WHERE account_no = ? AND date <= '"+endDate+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                    pset112.setString(1,listofAct[i].toString());
                                    java.sql.ResultSet rset112 = pset112.executeQuery();
                                    
                                    
                                    for (int t = rangeDates.length - 1; t >= 0; t--) {
                                        
                                        java.sql.Statement st01 = connectDB.createStatement();
                                        
                                        java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(balance) from ac_debtors WHERE account_no = ?  AND date between '"+rangeDates[t][1]+"' AND '"+rangeDates[t][0]+"'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                        pset.setString(1,listofAct[i].toString().toUpperCase());
                                        java.sql.ResultSet rset = pset.executeQuery();
                                        
                                        //   for (int k = 0; k < rangeDates.length; k++) {
                                        
                                        
                                        
                                        while (rset.next()){
                                            
                                            table.getDefaultCell().setColspan(1);
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(1)),pFontHeader1);
                                            table.addCell(phrase);
                                            columnTotals[t] = columnTotals[t] + rset.getDouble(1);
                                            
                                            
                                        }
                                        TotalCount = TotalCount + rset.getDouble(1);
                                        
                                        
                                        
                                    }
                                    
                                    while (rset1.next()){
                                        System.out.println("This Result " +rset1.getString(1));
                                        table.getDefaultCell().setColspan(1);
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(1)),pFontHeader1);
                                        // phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency("0"),pFontHeader1);
                                        
                                        Over120 = rset1.getDouble(1);
                                        table.addCell(phrase);
                                        Over120Total = Over120Total+ rset1.getDouble(1);
                                        TurnOver = TotalCount + Over120;
                                        
                                    }
                                    
                                    
                                    
                                    while (rset112.next()){
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset112.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        OS = OS + rset112.getDouble(1);
                                    }
                                    
                                    
                                    
                                    //table.addCell(phrase);
                                    // Over120 = Over120+Over120;
                                    while (rset111.next()){
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset111.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        Totals = Totals + rset111.getDouble(1);
                                    }
                                    
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
                            for (int x = rangeDates.length - 1; x >= 0; x--) {
                                
                                // phrase = new Phrase("Current"+2*x,pFontHeader);
                                // table.addCell(phrase);
                                
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(columnTotals[x])), pFontHeader);
                                
                                table.addCell(phrase);
                                columnsTo = columnsTo + columnTotals[x];
                            }
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Over120Total)), pFontHeader);
                            
                            table.addCell(phrase);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(OS)), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf((columnsTo+Over120Total)-OS)), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            
                            
                            //  }
                            
                            
                            
                            
                  /*              }else{
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    phrase = new Phrase("0.00" ,pFontHeader1);
                                    table.addCell(phrase);
                                }
                   
                                int j = 0;
                                int k = 0;
                                int r = 0;
                                int d = 0;
                                //  while (rset1.next()){
                                while (rset11.next()){
                                    j = rset11.getInt(1);
                                }
                                if (j > 0){
                   */
                            
                            //     }
                            
                            
                            //     table.addCell(phrase);
                                /*
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
                                 
                                while (rsetc1.next()){
                                    d = rsetc1.getInt(1);
                                }
                                if (d > 0){
                                    while (rset32.next()){
                                 
                                        table.getDefaultCell().setColspan(1);
                                 
                                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset32.getString(1)),pFontHeader1);
                                        table.addCell(phrase);
                                        turnOver = turnOver + rset32.getDouble(1);
                                    }
                                }else{
                                    phrase = new Phrase("0.00" ,pFontHeader1);
                                    table.addCell(phrase);
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
                                 
                                 
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(current)), pFontHeader);
                                 
                            table.addCell(phrase);
                                 
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(osBalance)), pFontHeader);
                                 
                            table.addCell(phrase);
                       /*
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(over30)), pFontHeader);
                                 
                            table.addCell(phrase);
                                 
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(over60)), pFontHeader);
                                 
                            table.addCell(phrase);
                                 
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(over90)), pFontHeader);
                                 
                            table.addCell(phrase);
                                 
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(turnOver)), pFontHeader);
                                 
                            table.addCell(phrase);
                                 */
                            //  }
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
            // java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("SELECT DISTINCT dealer FROM ac_debtors where date BETWEEN ? AND ? and dealer IS NOT NULL order by dealer");
            java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("SELECT DISTINCT account_no,payee FROM ac_debtors where account_no IS NOT NULL and account_no !='' and balance > 0 order by account_no");
            
            // pSet1.setString(1,beginDate.toString());
            // pSet1.setString(2,endDate.toString());
            
            // java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT dealer FROM ac_debtors where date BETWEEN '1-2-2003' AND '11-12-2003' and dealer IS NOT NULL order by dealer");
            
            java.sql.ResultSet rSet1 = pSet1.executeQuery();
            
            while (rSet1.next()) {
                System.out.println(rSet1.getObject(1).toString());
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            
            //System.out.println(rSet1.getObject(1).toString());
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities = listActVector.toArray();
        System.out.println("Done list of activities ...");
        return listofActivities;
    }
}





