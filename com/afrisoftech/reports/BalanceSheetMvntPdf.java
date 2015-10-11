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


public class BalanceSheetMvntPdf implements java.lang.Runnable {
    
    
    public static java.sql.Connection connectDB = null;
    
    double assets = 0.00;
    double liabilities = 0.00;
    double equity = 0.00;
    double profitloss = 0.00;
    double totalLiabEquity = 0.00;
    double subTotal = 0.00;
    
    com.afrisoftech.lib.DBObject dbObject;
    
    com.afrisoftech.timeseries.AgeingSeries ageingSeries = null;
    
    java.util.Date beginDate = null;
    
    java.lang.String dateLastyear = null;
    
    java.util.Date endDate = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.NORMAL);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void BalanceSheetMvntPdf(java.sql.Connection connDb, java.util.Date begindate,java.util.Date endate) {
        
        connectDB = connDb;
        
        beginDate = begindate;
        
        endDate = endate;
        
        dbObject = new com.afrisoftech.lib.DBObject();
        
        ageingSeries = new com.afrisoftech.timeseries.AgeingSeries(2, endate);
        
        threadSample = new java.lang.Thread(this,"SampleThread");
        
        System.out.println("threadSample created");
        
        threadSample.start();
        
        System.out.println("threadSample fired");
        
    }
    
    public static void main(java.lang.String[] args) {
        
        //	new BalanceSheetPdf().BalanceSheetPdf();
        
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
        
        java.lang.Object[][] ageingDates = ageingSeries.getAgeingDateSeries();
        
        ageingDates = ageingSeries.getAgeingDateSeries();
        
        
        double columnTotals1[] = new double[ageingDates.length];
        double assets[] = new double[ageingDates.length];
        
        
        double Liab[] = new double[ageingDates.length];
        double Equity[] = new double[ageingDates.length];
        
        double profitLoss[] = new double[ageingDates.length];
        double profitLossl[] = new double[ageingDates.length];
        // double Equity[] = new double[ageingDates.length];
        
        java.util.Calendar calLast = java.util.Calendar.getInstance();
        
        calLast.roll(java.util.Calendar.YEAR, -1);
        
        dateLastyear = calLast.getTime().toString();
        
        System.out.println(this.dateLastyear);
        
        java.lang.Process wait_for_Pdf2Show;
        
        java.util.Calendar cal = java.util.Calendar.getInstance();
        
        java.util.Date dateStampPdf = cal.getTime();
        
        java.lang.String pdfDateStamp = dateStampPdf.toString();
        
        int interval = 0;
        
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
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName,pFontHeader),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        
                        //  com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Balance Sheet - Page: ",pFontHeader), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(4);
                        
                        int headerwidths[] = {20,40,20,20};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        Phrase phrase = new Phrase("");
                        
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(2);
                        try {
                            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                            
                            
                            java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());
                            
                            System.out.println(""+endDate1);
                            
                            
                            phrase = new Phrase("BALANCE SHEET AS AT : " +dateFormat.format(endDate1), pFontHeader);
                            
                            table.addCell(phrase);
                        } catch(java.text.ParseException psExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                            
                        }
                        
                        
                        table.getDefaultCell().setColspan(2);
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        phrase = new Phrase("Printed on : " +date, pFontHeader1);
                        
                        table.addCell(phrase);
                        //    table.getDefaultCell().setBackgroundColor(java.awt.Color.LIGHT_GRAY);
                        
                        // table.addCell("");
                        table.getDefaultCell().setColspan(2);
                        
                        table.addCell("");
                        table.getDefaultCell().setColspan(1);
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        
                        for (int x = 0; x < ageingDates.length; x++) {
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            //int days = 1;
                            try {
                                
                                java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                                com.afrisoftech.lib.DateFormatter dateFormatter = new com.afrisoftech.lib.DateFormatter(dateFormat.parse(ageingDates[x][0].toString().trim()), "MMM/yy");
                                
                                java.lang.String monthString = dateFormatter.getDateString();
                                
                                int days = 1;
                                
                                phrase = new Phrase(monthString, pFontHeader);
                                
                                interval = x;
                                
                                table.addCell(phrase);
                                
                                
                            } catch(java.text.ParseException prs) {
                                prs.printStackTrace();
                            }
                            
                        }
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        try {
                            
                            java.lang.Object[] listofAct = this.getListofActivities();
                            
                            java.lang.Object[] listofAct1 = this.getListofActivities1();
                            
                            java.lang.Object[] listofAct2 = this.getListofActivities2();
                            //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
                            
                            System.out.println(listofAct.length);
                            java.sql.Statement st4 = connectDB.createStatement();
                            
                            double Total = 0.00;
                            
                            for (int i = 0; i < listofAct.length; i++) {
                                
                                double columnTotals[] = new double[ageingDates.length];
                                
                                java.lang.Object[] listofActb = this.getListofActivitiesb(listofAct[i]);
                                
                                java.sql.Statement st = connectDB.createStatement();
                                
                                java.sql.Statement st1 = connectDB.createStatement();
                                
                                java.sql.Statement st2 = connectDB.createStatement();
                                
                                java.sql.Statement st3 = connectDB.createStatement();
                                
                                //  java.sql.ResultSet rset3 = st3.executeQuery("select DISTINCT at.description from pb_accounts_setup at,ac_trial_balance bv,pb_sub_activities sa,pb_activity ac where at.main_code = '"+listofAct[i].toString()+"' and bv.code = ac.code and ac.sub_code = sa.sub_code and sa.main_code = at.main_code and at.class = 'ba'");
                                java.sql.PreparedStatement pset3 = connectDB.prepareStatement("select DISTINCT UPPER(at.description) from pb_accounts_setup at,ac_trial_balance bv,pb_sub_activities sa,pb_activity ac where at.main_code = ? and bv.code = ac.code and ac.sub_code = sa.sub_code and sa.main_code = at.main_code and at.class = 'ba'");
                                pset3.setString(1,listofAct[i].toString().toUpperCase());
                                java.sql.ResultSet rset3 = pset3.executeQuery();
                                
                                //  java.sql.ResultSet rset = st.executeQuery("select sa.sub_code,upper(sa.description) from ac_trial_balance bv,pb_activity ac,pb_accounts_setup at,pb_sub_activities sa where at.main_code = '"+listofAct[i].toString()+"' and sa.main_code = '"+listofAct[i].toString()+"' and ac.sub_code = sa.sub_code and bv.code = ac.code and at.class = 'ba' group by sa.sub_code,sa.description order by sa.sub_code");
                                
                                
                                
                                table.getDefaultCell().setColspan(4);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                               // table.addCell("  ");
                                
                                
                                
                                while (rset3.next()) {
                                    table.getDefaultCell().setColspan(4);
                                    phrase = new Phrase(dbObject.getDBObject(rset3.getObject(1).toString(), "-"), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    for (int x = 0; x < listofActb.length; x++) {
                                        
                                        // java.sql.PreparedStatement pset31 = connectDB.prepareStatement("select sa.sub_code,upper(sa.description) from ac_trial_balance bv,pb_activity ac,pb_accounts_setup at,pb_sub_activities sa where at.main_code = ? and sa.main_code = ? and ac.sub_code = sa.sub_code and bv.code = ac.code and at.class = 'ba' group by sa.sub_code,sa.description order by sa.sub_code");
                                        
                                        java.sql.PreparedStatement pset31 = connectDB.prepareStatement("select sa.sub_code,upper(sa.description) from ac_trial_balance bv,pb_activity ac,pb_sub_activities sa where sa.sub_code = ? and ac.sub_code = sa.sub_code and bv.code = ac.code group by sa.sub_code,sa.description order by sa.sub_code");
                                        pset31.setString(1,listofActb[x].toString().toUpperCase());
                                        java.sql.ResultSet rset = pset31.executeQuery();
                                        
                                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                        
                                        while (rset.next()) {
                                            
                                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                            
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            
                                            
                                            table.getDefaultCell().setColspan(1);
                                            
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase(dbObject.getDBObject(rset.getObject(1).toString().toUpperCase(), "-"), pFontHeader1);
                                            table.addCell(phrase);
                                            
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase(dbObject.getDBObject(rset.getObject(2).toString().toUpperCase(), "-"), pFontHeader1);
                                            
                                            table.addCell(phrase);
                                            
                                            double currTotal = 0.00;
                                            for (int t = 0; t < ageingDates.length; t++) {
                                                double actTotal = 0.00;
                                                double actTotal1 = 0.00;
                                                
                                                System.out.println("Checking dates : "+ageingDates[t][1].toString());
                                                // java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(bv.mtd_debit-bv.mtd_credit) from ac_trial_balance bv,pb_sub_activities sa where sa.sub_code = ? AND bv.date between '"+ageingDates[t][0]+"' AND '"+ageingDates[t][1]+"' and bv.sub_code = sa.sub_code  group by sa.sub_code order by sa.sub_code");
                                                java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(bv.mtd_debit-bv.mtd_credit) from ac_trial_balance bv,pb_sub_activities sa where sa.sub_code = ? AND bv.date <= '"+ageingDates[t][1]+"' and bv.sub_code = sa.sub_code  group by sa.sub_code order by sa.sub_code");
                                                
                                                pset.setString(1,listofActb[x].toString().toUpperCase());
                                                java.sql.ResultSet rset1 = pset.executeQuery();
                                                
                                                while (rset1.next()) {
                                                    actTotal = rset1.getDouble(1);
                                                    Total = Total + rset1.getDouble(1);
                                                    subTotal = subTotal + rset1.getDouble(1);
                                                    // columnTotals[t] = columnTotals[t] + rset1.getDouble(1);
                                                }
                                                
                                                
                                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                                
                                                if (t == 1){
                                                    
                                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(actTotal)), pFontHeader1);
                                                    table.addCell(phrase);
                                                    currTotal = actTotal;
                                                    
                                                }else{
                                                    
                                                    actTotal = actTotal + currTotal;
                                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(actTotal)), pFontHeader1);
                                                    table.addCell(phrase);
                                                }
                                                
                                                columnTotals[t] = columnTotals[t] + actTotal;
                                            }
                                            
                                        }
                                    }
                                    
                                    table.getDefaultCell().setColspan(2);
                                    
                                    table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                    table.getDefaultCell().setBorder(Rectangle.TOP | Rectangle.BOTTOM);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Sub Total".toUpperCase(), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    for (int x = 0; x < ageingDates.length; x++) {
                                        
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(columnTotals[x])), pFontHeader);
                                        
                                        table.addCell(phrase);
                                        
                                        assets[x] = assets[x] + columnTotals[x];
                                        
                                    }
                                }
                            }
                            
                            
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            table.getDefaultCell().setColspan(4);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            table.addCell("  ");
                            
                            table.getDefaultCell().setColspan(2);
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Total Assets".toUpperCase(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            for (int x = 0; x < ageingDates.length; x++) {
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(assets[x])), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                
                            }
                            
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            java.sql.Statement st5 = connectDB.createStatement();
                            
                            
                            table.getDefaultCell().setColspan(4);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            table.addCell("  ");
                            
                            for (int i = 0; i < listofAct1.length; i++) {
                                double columnTotalsLiab[] = new double[ageingDates.length];
                                
                                java.lang.Object[] listofActl = this.getListofActivitiesb(listofAct1[i]);
                                
                                java.sql.PreparedStatement pset3 = connectDB.prepareStatement("select DISTINCT upper(at.description) from pb_accounts_setup at,ac_trial_balance bv,pb_sub_activities sa,pb_activity ac where at.main_code = ? and bv.code = ac.code and ac.sub_code = sa.sub_code and sa.main_code = at.main_code and at.class = 'bl'");
                                pset3.setString(1,listofAct1[i].toString().toUpperCase());
                                java.sql.ResultSet rset3 = pset3.executeQuery();
                                
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                                while (rset3.next()) {
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    table.getDefaultCell().setColspan(4);
                                    phrase = new Phrase(dbObject.getDBObject(rset3.getObject(1).toString(), "-"), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    for (int x = 0; x < listofActl.length; x++) {
                                        // java.sql.PreparedStatement pset31 = connectDB.prepareStatement("select sa.sub_code,upper(sa.description) from ac_trial_balance bv,pb_activity ac,pb_accounts_setup at,pb_sub_activities sa where at.main_code = ? and sa.main_code = ? and ac.sub_code = sa.sub_code and bv.code = ac.code and at.class = 'ba' group by sa.sub_code,sa.description order by sa.sub_code");
                                        
                                        java.sql.PreparedStatement pset31 = connectDB.prepareStatement("select sa.sub_code,upper(sa.description) from ac_trial_balance bv,pb_activity ac,pb_sub_activities sa where sa.sub_code = ? and ac.sub_code = sa.sub_code and bv.code = ac.code group by sa.sub_code,sa.description order by sa.sub_code");
                                        pset31.setString(1,listofActl[x].toString().toUpperCase());
                                        java.sql.ResultSet rset = pset31.executeQuery();
                                        
                                        while (rset.next()) {
                                            
                                            
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            
                                            
                                            table.getDefaultCell().setColspan(1);
                                            
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase(dbObject.getDBObject(rset.getObject(1).toString().toUpperCase(), "-"), pFontHeader1);
                                            table.addCell(phrase);
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase(dbObject.getDBObject(rset.getObject(2).toString().toUpperCase(), "-"), pFontHeader1);
                                            
                                            table.addCell(phrase);
                                            
                                            
                                            for (int t = 0; t < ageingDates.length; t++) {
                                                double actTotal = 0.00;
                                                
                                                java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(bv.mtd_credit-bv.mtd_debit) from ac_trial_balance bv,pb_sub_activities sa where sa.sub_code = ? AND bv.date <= '"+ageingDates[t][1]+"' and bv.sub_code = sa.sub_code  group by sa.sub_code order by sa.sub_code");
                                                pset.setString(1,listofActl[x].toString().toUpperCase());
                                                //pset.setString(2,listofAct[i].toString().toUpperCase());
                                                java.sql.ResultSet rset1 = pset.executeQuery();
                                                //  java.sql.ResultSet rsetTotals = st2.executeQuery("SELECT SUM(bv.mtd_debit-bv.mtd_credit) from ac_trial_balance bv,pb_activity ac,pb_sub_activities sa,pb_accounts_setup at where sa.main_code = '"+listofAct[i].toString()+"' AND bv.date between '"+ageingDates[t][0]+"' AND '"+ageingDates[t][1]+"' and sa.main_code = at.main_code and sa.sub_code = ac.sub_code and bv.code = ac.code and at.class = 'ba' group by sa.main_code");
                                                
                                                System.out.println("This stage has been passed 1");
                                                //rsetTotals1 = st3.executeQuery("SELECT SUM(debit),SUM(credit) from");
                                                table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                                
                                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                                
                                                
                                                while (rset1.next()) {
                                                    actTotal = rset1.getDouble(1);
                                                    Total = Total + rset1.getDouble(1);
                                                    subTotal = subTotal + rset1.getDouble(1);
                                                    columnTotalsLiab[t] = columnTotalsLiab[t] + rset1.getDouble(1);
                                                }
                                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(actTotal)), pFontHeader1);
                                                
                                                table.addCell(phrase);
                                            }
                                            
                                        }
                                    }
                                    table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                    table.getDefaultCell().setBorder(Rectangle.TOP |Rectangle.BOTTOM);
                                    
                                    table.getDefaultCell().setColspan(2);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase("Sub Total".toUpperCase(), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    for (int x = 0; x < ageingDates.length; x++) {
                                        
                                        phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(columnTotalsLiab[x])), pFontHeader);
                                        
                                        table.addCell(phrase);
                                        
                                        Liab[x] = Liab[x] + columnTotalsLiab[x];
                                        
                                    }
                                }
                            }
                            
                            
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            table.getDefaultCell().setColspan(4);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            table.addCell("  ");
                            
                            
                            
                            
                            table.getDefaultCell().setColspan(2);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Total Liabilities".toUpperCase(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            table.getDefaultCell().setColspan(1);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                         
                            for (int x = 0; x < ageingDates.length; x++) {
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Liab[x])), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                System.out.println("This stage has been passed 2");
                                
                            }
                            
                            
                            float num_a = 0;
                            float num_b = 0;
                            float num_c = 0;
                            float totals = 0;
                            int j = 0;
                            
                            table.getDefaultCell().setColspan(4);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            table.addCell("  ");
                            
                            for (int i = 0; i < listofAct2.length; i++) {
                                
                                double columnTotalsEquity[] = new double[ageingDates.length];
                                
                                java.lang.Object[] listofActeq = this.getListofActivitieseq(listofAct2[i]);
                                
                                java.sql.PreparedStatement pset3 = connectDB.prepareStatement("select DISTINCT upper(at.description) from pb_accounts_setup at where at.main_code = ? and at.class = 'bli'");
                                pset3.setString(1,listofAct2[i].toString().toUpperCase());
                                java.sql.ResultSet rset3 = pset3.executeQuery();
                                
                                table.getDefaultCell().setColspan(4);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                table.addCell("  ");
                                
                                
                                while (rset3.next()) {
                                    table.getDefaultCell().setColspan(4);
                                    phrase = new Phrase(dbObject.getDBObject(rset3.getObject(1).toString().toUpperCase(), "-"), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    for (int x = 0; x < listofActeq.length; x++) {
                                        // java.sql.PreparedStatement pset31 = connectDB.prepareStatement("select sa.sub_code,upper(sa.description) from ac_trial_balance bv,pb_activity ac,pb_accounts_setup at,pb_sub_activities sa where at.main_code = ? and sa.main_code = ? and ac.sub_code = sa.sub_code and bv.code = ac.code and at.class = 'ba' group by sa.sub_code,sa.description order by sa.sub_code");
                                        
                                        java.sql.PreparedStatement pset31 = connectDB.prepareStatement("select sa.sub_code,upper(sa.description) from ac_trial_balance bv,pb_activity ac,pb_sub_activities sa where sa.sub_code = ? and ac.sub_code = sa.sub_code and bv.code = ac.code group by sa.sub_code,sa.description order by sa.sub_code");
                                        pset31.setString(1,listofActeq[x].toString().toUpperCase());
                                        java.sql.ResultSet rset = pset31.executeQuery();
                                        
                                        while (rset.next()) {
                                            
                                            
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            
                                            
                                            table.getDefaultCell().setColspan(1);
                                            
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase(dbObject.getDBObject(rset.getObject(1).toString(), "-"), pFontHeader1);
                                            table.addCell(phrase);
                                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                            phrase = new Phrase(dbObject.getDBObject(rset.getObject(2).toString(), "-"), pFontHeader1);
                                            
                                            table.addCell(phrase);
                                            
                                            
                                            for (int t = 0; t < ageingDates.length; t++) {
                                                
                                                double actTotal = 0.00;
                                                
                                                java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(bv.mtd_credit-bv.mtd_debit) from ac_trial_balance bv,pb_sub_activities sa where sa.sub_code = ? AND bv.date <= '"+ageingDates[t][1]+"' and bv.sub_code = sa.sub_code  group by sa.sub_code order by sa.sub_code");
                                                pset.setString(1,listofActeq[x].toString().toUpperCase());
                                                java.sql.ResultSet rset1 = pset.executeQuery();
                                                
                                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                                
                                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                                
                                                
                                                while (rset1.next()) {
                                                    actTotal = rset1.getDouble(1);
                                                    
                                                    columnTotalsEquity[t] = columnTotalsEquity[t] + rset1.getDouble(1);
                                                }
                                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(actTotal)), pFontHeader1);
                                                
                                                table.addCell(phrase);
                                                Equity[t] = Equity[t] + actTotal;
                                                
                                                System.out.println("This stage has been passed Equity");
                                            }
                                            
                                        }
                                    }
                                }
                            }
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            
                            java.sql.PreparedStatement pset31 = connectDB.prepareStatement("SELECT distinct sub_code,UPPER(description) FROM pb_sub_activities where identifier ilike 'pl%'");
                            java.sql.ResultSet rset = pset31.executeQuery();
                            
                            while (rset.next()) {
                                
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset.getObject(1).toString(), "-"), pFontHeader1);
                                table.addCell(phrase);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset.getObject(2).toString(), "-"), pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                
                                for (int t = 0; t < ageingDates.length; t++) {
                                    double actTotal = 0.00;
                                    double actTotall = 0.00;
                                    java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(pb.mtd_credit-pb.mtd_debit) from ac_trial_balance pb where (pb.activity_category ilike 'i%' or pb.activity_category ilike 'cf%') and pb.date <= '"+ageingDates[t][1]+"'");
                                    java.sql.PreparedStatement psetl = connectDB.prepareStatement("select sum(pb.mtd_credit-pb.mtd_debit) from ac_trial_balance pb where (pb.activity_category ilike 'E%' or pb.activity_category ilike 'cs%' or pb.activity_category ilike 'sw%') and pb.date <= '"+ageingDates[t][1]+"'");
                                    
                                    //  java.sql.PreparedStatement pset = connectDB.prepareStatement("SELECT sum(bv.mtd_debit-bv.mtd_credit) FROM pb_accounts_setup at,ac_trial_balance bv,pb_sub_activities sa WHERE bv.sub_code = sa.sub_code and sa.main_code = at.main_code AND bv.date <= '"+ageingDates[t][1]+"' and at.class ilike 'p%'"); //select sum(bv.mtd_debit-bv.mtd_credit) from ac_trial_balance bv,pb_sub_activities sa where sa.sub_code = ? AND bv.date between '"+ageingDates[t][0]+"' AND '"+ageingDates[t][1]+"' and bv.sub_code = sa.sub_code  group by sa.sub_code order by sa.sub_code");
                                    java.sql.ResultSet rset1 = pset.executeQuery();
                                    java.sql.ResultSet rsetl = psetl.executeQuery();
                                    table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    
                                    while (rset1.next()) {
                                        actTotal = rset1.getDouble(1);
                                        profitLoss[t] = profitLoss[t] + rset1.getDouble(1);
                                    }
                                    
                                    while (rsetl.next()) {
                                        actTotall = rsetl.getDouble(1);
                                        profitLossl[t] = profitLossl[t] + rsetl.getDouble(1);
                                    }
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(actTotal+actTotall)), pFontHeader1);
                                    
                                    table.addCell(phrase);
                                    
                                    System.out.println("This stage has been passed PL");
                                }
                                
                                
                                table.getDefaultCell().setColspan(2);
                                //  table.getDefaultCell().setBorder(Rectangle.TOP | Rectangle.BOTTOM);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                // table.getDefaultCell().
                                phrase = new Phrase("Total Equity".toUpperCase(), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                                table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                                
                                table.getDefaultCell().setColspan(1);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                for (int x = 0; x < ageingDates.length; x++) {
                                    
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Equity[x]+profitLoss[x]+profitLossl[x])), pFontHeader);
                                    
                                    table.addCell(phrase);
                                    
                                    System.out.println("This stage has been passed PLT");
                                    
                                }
                                
                                
                            }
                            
                            table.getDefaultCell().setColspan(4);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            table.addCell("  ");
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            table.getDefaultCell().setColspan(2);
                            
                            //  table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            // table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            
                            phrase = new Phrase("Total Liabilities + Equity".toUpperCase(), pFontHeader);
                            
                            table.addCell(phrase);
                            
                            
                            table.getDefaultCell().setColspan(1);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            for (int x = 0; x < ageingDates.length; x++) {
                                
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Equity[x]+profitLoss[x]+Liab[x]+profitLossl[x])), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                System.out.println("This stage has been passed PLLT");
                            }
                            
                            
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
            
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT main_code FROM pb_accounts_setup where class = 'ba' order by main_code");
            
            while (rSet1.next()) {
                
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities = listActVector.toArray();
        
        return listofActivities;
    }
    
    public java.lang.Object[] getListofActivitiesb(java.lang.Object subCode) {
        
        java.lang.Object[] listofActivitiesb = null;
        
        java.util.Vector listActVectorb = new java.util.Vector(1,1);
        
        try {
            
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT sub_code FROM pb_sub_activities where main_code = '"+subCode+"' order by sub_code");
            
            while (rSet1.next()) {
                
                listActVectorb.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivitiesb = listActVectorb.toArray();
        
        return listofActivitiesb;
    }
    
    public java.lang.Object[] getListofActivities1() {
        
        java.lang.Object[] listofActivities1 = null;
        
        java.util.Vector listActVector = new java.util.Vector(1,1);
        
        
        
        try {
            
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT main_code FROM pb_accounts_setup where class = 'bl' order by main_code");
            
            while (rSet1.next()) {
                
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities1 = listActVector.toArray();
        
        return listofActivities1;
    }
    
    public java.lang.Object[] getListofActivitiesl(java.lang.Object subCodel) {
        
        java.lang.Object[] listofActivitiesl = null;
        
        java.util.Vector listActVectorl = new java.util.Vector(1,1);
        
        try {
            
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT sub_code FROM pb_sub_activities where main_code = '"+subCodel+"' order by sub_code");
            
            while (rSet1.next()) {
                
                listActVectorl.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivitiesl = listActVectorl.toArray();
        
        return listofActivitiesl;
    }
    
    public java.lang.Object[] getListofActivities2() {
        
        java.lang.Object[] listofActivities2 = null;
        
        java.util.Vector listActVector = new java.util.Vector(1,1);
        
        
        
        try {
            
            //  java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/insurance","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT main_code FROM pb_accounts_setup where class = 'bli' order by main_code");
            
            while (rSet1.next()) {
                
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities2 = listActVector.toArray();
        
        System.out.println("Total list of activities = "+listofActivities2.length);
        
        return listofActivities2;
    }
    
    public java.lang.Object[] getListofActivitieseq(java.lang.Object subCodeq) {
        
        java.lang.Object[] listofActivitieseq = null;
        
        java.util.Vector listActVectoreq = new java.util.Vector(1,1);
        
        try {
            
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT sub_code FROM pb_sub_activities where main_code = '"+subCodeq+"' order by sub_code");
            
            while (rSet1.next()) {
                
                listActVectoreq.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivitieseq = listActVectoreq.toArray();
        
        return listofActivitieseq;
    }
    
}





