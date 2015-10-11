//Author Francis Waweru

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


public class CashMonthlyRevPdf1 implements java.lang.Runnable {
    double Tsales = 0.00;
    double Txrays = 0.00;
    double Tdental = 0.00;
    double Tcons = 0.00;
    double Tpham = 0.00;
    double Tlab = 0.00;
    double Tnurs = 0.00;
    double Tthea = 0.00;
    double Twps = 0.00;
    double Tconstn = 0.00;
    double Tother = 0.00;
    double TCashs = 0.00;
    double Tnhif = 0.00;
    double Tdebtors = 0.00;
    double Treceived = 0.00;
    double Unhif = 0.00;
    double Udebtors = 0.00;
    double Twaivers = 0.00;
    double Uexemp = 0.00;
    double Uabs = 0.00;
    double Tfacility = 0.00;
    double Tpmo = 0.00;
    double Tbanked = 0.00;
    double Tamt = 0.00;
    double Tpetty = 0.00;
    double Tudebtors = 0.00;
    double Tunhif = 0.00;
    String dent = null;
    
    
    int over = 0;
    int name = 0;
    
    int numberSeq = 0;
    
    int iterations = 0;
    
    com.afrisoftech.lib.DBObject dbObject;
    
    java.lang.String Debtor = null;
    
    java.util.Date endDate = null;
    
    java.util.Date beginDate = null;
    
    com.afrisoftech.lib.PeriodicDates periodicDates = null;
    
    com.afrisoftech.timeseries.AgeingSeries ageingSeries= null;
    
    com.afrisoftech.timeseries.DailyAgeing dailySeries = null;
    
    java.util.Date ageingDates[][] = null;
    
  /*  double osBalance = 0.00;
   
    double current = 0.00;
   
    double over30 = 0.00;
   
    double over60 = 0.00;
   
    double over90 = 0.00;
   
    double turnOver = 0.00;
   */
    
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.TIMES, 8, Font.NORMAL);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.TIMES,8, Font.NORMAL);
    com.lowagie.text.Font pFontHeader2 = FontFactory.getFont(FontFactory.TIMES, 10, Font.BOLD);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void CashMonthlyRevPdf(java.sql.Connection connDb,java.util.Date begindate,java.util.Date endate) {
        //public void OrderedItemsPdf(java.sql.Connection connDb) {
        // Debtor = combox;
        connectDB = connDb;
        beginDate = begindate;
        endDate = endate;
        iterations = endDate.getDate() - beginDate.getDate();
        dbObject = new com.afrisoftech.lib.DBObject();
        System.out.println("Days Date"+endDate);
        // periodicDates = new com.afrisoftech.lib.PeriodicDates(endDate, 3);
        ageingSeries = new com.afrisoftech.timeseries.AgeingSeries(1, endate);
        dailySeries = new com.afrisoftech.timeseries.DailyAgeing(iterations+1, endate);
        
        // long enDate = java.util.Date.parse(endDate);
        
        
        
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
        
        java.lang.Object[][] dailyDates = dailySeries.getAgeingDateSeries();
        
        // ageingDates = ageingSeries.getAgeingDateSeries();
        
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
            
            java.lang.String debitTotal = null;
            
            java.lang.String creditTotal = null;
            
            //   com.lowagie.text.Document docPdf = new com.lowagie.text.Document();
            
            com.lowagie.text.Document docPdf = new com.lowagie.text.Document(PageSize.A3.rotate());
            
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
                        while(rset2.next()){
                            compName = rset2.getObject(1).toString();
                        }
                        while(rset4.next()){
                            date = rset4.getObject(1).toString();
                        }
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName, pFontHeader2),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        
                        //  com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        headerFoter.setAlignment(com.lowagie.text.HeaderFooter.ALIGN_CENTER);
                        // docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Cash Monthly Collection  Page: ",pFontHeader), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    // docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    
                    double Totals = 0.00;
                    double OS = 0.00;
                    try {
                        
                        
                        //com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(rangeDates.length+1);
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(25);
                        
                        String headerWidths = null;
                        
                        java.util.Vector headerVector = new java.util.Vector(1,1);
                        
                        int z = rangeDates.length;
                        
                        
                        int headerwidths[] = {3,15,10,10,10,10,10,10,10,10,10,10,10,10,12,10,2,10,2,10,10,2,10,10,10};
                        
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        table.setHeaderRows(2);
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
                        
                        table.getDefaultCell().setColspan(25);
                        Phrase phrase = new Phrase("");
                        for (int x = 0; x < rangeDates.length; x++) {
                            try {
                                java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                                com.afrisoftech.lib.DateFormatter dateFormatter = new com.afrisoftech.lib.DateFormatter(dateFormat.parse(rangeDates[x][0].toString().trim()), "MMMM");
                                
                                java.lang.String monthString = dateFormatter.getDateString();
                                
                                com.afrisoftech.lib.DateFormatter dateFormatters = new com.afrisoftech.lib.DateFormatter(dateFormat.parse(rangeDates[x][0].toString().trim()), "yyyy");
                                
                                java.lang.String yearString = dateFormatters.getDateString();
                                
                                //  try {
                                //java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                                
                                //java.util.Date endDate2 = dateFormat.parse(endDate.toLocaleString());
                                
                                table.getDefaultCell().setColspan(6);
                                phrase = new Phrase("MONTHLY COLLECTIONS BY FACILITY ", pFontHeader2);
                                
                                table.addCell(phrase);
                                table.getDefaultCell().setColspan(9);
                                phrase = new Phrase("Facility :   "+compName.toUpperCase() , pFontHeader2);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(3);
                                phrase = new Phrase("Month :   " +monthString.toUpperCase() , pFontHeader2);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(3);
                                phrase = new Phrase("Year :   "+yearString.toUpperCase() , pFontHeader2);
                                
                                table.addCell(phrase);
                                
                                
                              /*  } catch(java.text.ParseException psExec) {
                               
                                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                               
                                }*/
                            } catch(java.text.ParseException prs) {
                                prs.printStackTrace();
                            }
                        }
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT | PdfCell.ALIGN_BOTTOM);
                        table.getDefaultCell().setColspan(4);
                        phrase = new Phrase("Printed on : "+date,pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(1);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                        phrase = new Phrase("DATE",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT | PdfCell.ALIGN_BOTTOM);
                        
                        phrase = new Phrase("TOTAL SALES",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(10);
                        phrase = new Phrase("BREAKDOWN BY DEPARTMENT - Specify if Breakdown is by :  [  ] SALES  [  ] CASH COLLECTION",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(3);
                        phrase = new Phrase("CASH RECEIPTS",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(2);
                        phrase = new Phrase("TOTAL CASH",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(5);
                        phrase = new Phrase("BANKING",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(3);
                        phrase = new Phrase("REVENUE NOT COLLECTED",pFontHeader);
                        table.addCell(phrase);
                        
                        
                        
                        table.getDefaultCell().setColspan(2);
                        phrase = new Phrase("MONTHLY BREAKDOWN OF OTHER INCOME",pFontHeader);
                        //table.addCell(phrase);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                        
                        table.getDefaultCell().setBorder(Rectangle.LEFT | Rectangle.RIGHT);
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase(" ",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
                        table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase("This figure is based on Total services given to all patients, whether Cash, Debt",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Consultancy",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Pharmacy",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Laboratory ",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Dental ",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Xray ",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Nursing",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Theatre",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Ward Procedures ",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Consultants ",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Category ",pFontHeader);
                        // table.addCell(phrase);
                        
                        phrase = new Phrase("Amount ",pFontHeader);
                        // table.addCell(phrase);
                        
                        phrase = new Phrase("Others ",pFontHeader);
                        table.addCell(phrase);
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase("CASH Collections from daily Services ",pFontHeader);
                        table.addCell(phrase);
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase("NHIF Receipts ",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("OTHER Debtor Receipts ",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(2);
                        phrase = new Phrase("Add Cash Collections NHIF and Other Receipts ",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(2);
                        phrase = new Phrase("Amount Banked in Main A/C ",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Amount Banked Other A/C ",pFontHeader);
                        // table.addCell(phrase);
                        table.getDefaultCell().setColspan(1);
                        
                        phrase = new Phrase("Petty Cash ",pFontHeader);
                        table.addCell(phrase);
                        
                        
                        table.getDefaultCell().setColspan(2);
                        phrase = new Phrase("Total Banking ",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase("NHIF Debts ",pFontHeader);
                        table.addCell(phrase);
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase("Other Debtors ",pFontHeader);
                        table.addCell(phrase);
                        table.getDefaultCell().setColspan(1);
                        phrase = new Phrase("Waivers ",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        
                        
                        try {
                            
                            double GrandTotal = 0.00;
                            double Over120Total = 0.00;
                            java.lang.Object[] listofAct = this.getListofActivities();
                            java.lang.Object[] listofAct1 = this.getListofActivities1();
                            double TurnOver = 0.00;
                            double Over120 = 0.00;
                            double TotalCount = 0.00;
                            
                            
                            
                            table.getDefaultCell().setColspan(1);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            table.getDefaultCell().setColspan(1);
                            java.sql.Statement stmta1 = connectDB.createStatement();
                            
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
                            
                            
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            
                            
                            int dayTotal = 0;
                            String mot = null;
                            String opp = null;
                            String the = null;
                            String labs = null;
                            String xray = null;
                            String pha = null;
                            String ip = null;
                            String mat = null;
                            String aot = null;
                            
                            //    for (int p = 1; p <= 31 ; p++) {
                            
                            
                            
                            
                            for (int i = 0; i < listofAct.length; i++) {
                                double sales = 0.00;
                                double xrays = 0.00;
                                double dental = 0.00;
                                double cons = 0.00;
                                double pham = 0.00;
                                double lab = 0.00;
                                double nurs = 0.00;
                                double thea = 0.00;
                                double wps = 0.00;
                                double constn = 0.00;
                                double other = 0.00;
                                double debtor = 0.00;
                                double Cashs = 0.00;
                                double nhif = 0.00;
                                double banking = 0.00;
                                double waiver = 0.00;
                                double petty = 0.00;
                                double udebtor = 0.00;
                                double unhif = 0.00;
                                java.sql.Statement st01 = connectDB.createStatement();
                                
                                
                                java.sql.PreparedStatement pset = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND transaction_type != 'Banking'");
                                java.sql.ResultSet rset = pset.executeQuery();
                                
                                java.sql.PreparedStatement pset11a = connectDB.prepareStatement("select gl_account from pb_operating_parameters WHERE category ilike 'CF'");
                                java.sql.ResultSet rset11a = pset11a.executeQuery();
                                while (rset11a.next()){
                                    ip = rset11a.getString(1);
                                }
                                
                                java.sql.PreparedStatement pset1 = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+ip+"' AND transaction_type != 'Banking'");//< '"+endDate+"'::date and date > '"+endDate+"'::date - 30 group by dealer");
                                java.sql.ResultSet rset1 = pset1.executeQuery();
                                
                                
                                java.sql.PreparedStatement psetj = connectDB.prepareStatement("select gl_account from pb_operating_parameters WHERE category ilike 'PF'");
                                java.sql.ResultSet rsetj = psetj.executeQuery();
                                while (rsetj.next()){
                                    pha = rsetj.getString(1);
                                }
                                
                                java.sql.PreparedStatement psetj1 = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+pha+"'");
                                java.sql.ResultSet rsetj1 = psetj1.executeQuery();
                                
                                java.sql.PreparedStatement pset121 = connectDB.prepareStatement("select gl_account from pb_operating_parameters WHERE category ilike 'DET'");
                                java.sql.ResultSet rset121 = pset121.executeQuery();
                                while (rset121.next()){
                                    dent = rset121.getString(1);
                                }
                                
                                java.sql.PreparedStatement pset1211 = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+dent+"'");
                                java.sql.ResultSet rset1211 = pset1211.executeQuery();
                                
                                
                                java.sql.PreparedStatement pset11 = connectDB.prepareStatement("select gl_account from pb_operating_parameters WHERE category ilike 'XRY'");
                                java.sql.ResultSet rset11 = pset11.executeQuery();
                                while (rset11.next()){
                                    xray = rset11.getString(1);
                                }
                                
                                java.sql.PreparedStatement psets1e = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+xray+"'");
                                java.sql.ResultSet rsets1e = psets1e.executeQuery();
                                
                                java.sql.PreparedStatement pset111 = connectDB.prepareStatement("select gl_account from pb_operating_parameters WHERE category ilike 'LAB'");
                                java.sql.ResultSet rset111 = pset111.executeQuery();
                                while (rset111.next()){
                                    labs = rset111.getString(1);
                                }
                                
                                java.sql.PreparedStatement pset12 = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+labs+"'");
                                java.sql.ResultSet rset12 = pset12.executeQuery();
                                
                                java.sql.PreparedStatement psets1 = connectDB.prepareStatement("select gl_account from pb_operating_parameters WHERE category ilike 'THE'");
                                java.sql.ResultSet rsets1 = psets1.executeQuery();
                                while (rsets1.next()){
                                    the = rsets1.getString(1);
                                }
                                
                                java.sql.PreparedStatement psetp1 = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+the+"'");
                                java.sql.ResultSet rsetp1 = psetp1.executeQuery();
                                
                                java.sql.PreparedStatement psetd1 = connectDB.prepareStatement("select gl_account from pb_operating_parameters WHERE category ilike 'NUR'");
                                java.sql.ResultSet rsetd1 = psetd1.executeQuery();
                                while (rsetd1.next()){
                                    mot = rsetd1.getString(1);
                                }
                                
                                java.sql.PreparedStatement psetd = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+mot+"'");
                                java.sql.ResultSet rsetd = psetd.executeQuery();
                                
                                java.sql.PreparedStatement pseth = connectDB.prepareStatement("select gl_account from pb_operating_parameters WHERE category ilike 'WP'");
                                java.sql.ResultSet rseth = pseth.executeQuery();
                                while (rseth.next()){
                                    opp = rseth.getString(1);
                                }
                                
                                java.sql.PreparedStatement psetp1q = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+opp+"'");
                                java.sql.ResultSet rseth1 = psetp1q.executeQuery();
                                
                                java.sql.PreparedStatement psetw1 = connectDB.prepareStatement("select distinct gl_account from pb_operating_parameters WHERE category ilike 'CA' ORDER BY gl_account");
                                java.sql.ResultSet rsetw1 = psetw1.executeQuery();
                                while (rsetw1.next()){
                                    mat = rsetw1.getString(1);
                                }
                                
                                java.sql.PreparedStatement psetw = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+mat+"'");
                                java.sql.ResultSet rsetw = psetw.executeQuery();
                                
                                
                                java.sql.PreparedStatement psethb = connectDB.prepareStatement("select distinct gl_account from pb_operating_parameters WHERE category ilike 'AOT%' GROUP BY gl_account ORDER BY gl_account");
                                java.sql.ResultSet rsethb = psethb.executeQuery();
                                while (rsethb.next()){
                                    aot = rsethb.getString(1);
                                }
                                java.sql.PreparedStatement psetwq = connectDB.prepareStatement("select distinct activity from pb_activity WHERE code = '"+aot+"'");
                                
                                java.sql.ResultSet rsetwq = psetwq.executeQuery();
                                
                                java.sql.PreparedStatement psetwq1 = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND activity_code = '"+aot+"'");//(activity_code NOT LIKE '"+pha+"' OR activity_code NOT LIKE '"+opp+"' OR activity_code NOT LIKE '"+mot+"' OR activity_code NOT LIKE '"+the+"' OR activity_code NOT LIKE '"+xray+"' OR activity_code NOT LIKE '"+mot+"')");
                                java.sql.ResultSet rsetwq1 = psetwq1.executeQuery();
                                
                                java.sql.PreparedStatement psetwn = connectDB.prepareStatement("select sum(credit-debit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND transaction_type ILIKE 'Waiver'");
                                java.sql.ResultSet rsetwn = psetwn.executeQuery();
                                
                                java.sql.PreparedStatement psetbk = connectDB.prepareStatement("select sum(credit-debit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND transaction_type ILIKE 'Banking'");
                                java.sql.ResultSet rsetbk = psetbk.executeQuery();
                                
                                java.sql.PreparedStatement psetbp = connectDB.prepareStatement("select sum(credit-debit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND dealer ILIKE 'Petty%'");
                                java.sql.ResultSet rsetbp = psetbp.executeQuery();
                                
                                java.sql.PreparedStatement psetr = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND (receipt_no NOT LIKE 'AC%' OR receipt_no NOT LIKE '' OR receipt_no IS NOT NULL) AND transaction_type != 'Banking'");
                                java.sql.ResultSet rsetr = psetr.executeQuery();
                                
                                java.sql.PreparedStatement psetz = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND transaction_type ILIKE 'Receipts' AND (dealer ILIKE 'nhif%' OR dealer ILIKE 'n.h.i.f%' OR dealer ILIKE 'n h%')");
                                java.sql.ResultSet rsetz = psetz.executeQuery();
                                
                                java.sql.PreparedStatement psetc = connectDB.prepareStatement("select sum(debit-credit) from ac_cash_collection WHERE date = '"+listofAct[i]+"' AND transaction_type ILIKE 'Receipts' AND (dealer NOT ILIKE 'nhif%' OR dealer NOT ILIKE 'n.h.i.f%') and receipt_no ilike 'AC%'");
                                java.sql.ResultSet rsetc = psetc.executeQuery();
                                
                                java.sql.PreparedStatement psetr1 = connectDB.prepareStatement("select sum(debit-credit) from ac_debtors WHERE date = '"+listofAct[i]+"' AND (dealer NOT ILIKE 'nhif%' OR dealer NOT ILIKE 'n.h.i.f%') AND transaction_type ilike 'Raise%'");
                                java.sql.ResultSet rsetr1 = psetr1.executeQuery();
                                
                                java.sql.PreparedStatement psetz1 = connectDB.prepareStatement("select sum(debit-credit) from ac_debtors WHERE date = '"+listofAct[i]+"' AND transaction_type ILIKE 'Raise%' AND (dealer ILIKE 'nhif%' OR dealer ILIKE 'n.h.i.f%' OR dealer ILIKE 'n h%')");
                                java.sql.ResultSet rsetz1 = psetz1.executeQuery();
                                
                                table.getDefaultCell().setColspan(1);
                                table.getDefaultCell().setMinimumHeight(17);
                                numberSeq = numberSeq+1;
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                phrase = new Phrase(""+numberSeq+"   ", pFontHeader);
                                table.addCell(phrase);
                                
                                
                                while (rset.next()){
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    table.getDefaultCell().setColspan(1);
                                    sales = rset.getDouble(1);
                                    Tsales = Tsales + sales;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(sales),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                while (rset1.next()){
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    cons = rset1.getDouble(1);
                                    Tcons = Tcons + cons;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(cons),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                while (rsetj1.next()){
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    table.getDefaultCell().setColspan(1);
                                    
                                    pham = rsetj1.getDouble(1);
                                    Tpham = Tpham + pham;
                                    // table.addCell(phrase);
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(pham),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                while (rset12.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    lab = rset12.getDouble(1);
                                    Tlab = Tlab + lab;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(lab),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                while (rset1211.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    dental = rset1211.getDouble(1);
                                    Tdental = Tdental + dental;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(dental),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                              /*  while (rset121.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    jans = rset121.getDouble(1);
                                    Tlab = Tlab + jans;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(jans),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                               
                                }
                               */
                                while (rsets1e.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    xrays = rsets1e.getDouble(1);
                                    Txrays = Txrays + xrays;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(xrays),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                
                                while (rsetd.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    nurs = rsetd.getDouble(1);
                                    Tnurs = Tnurs + nurs;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(nurs),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                while (rsetp1.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    thea = rsetp1.getDouble(1);
                                    Tthea = Tthea + thea;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(thea),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                
                                while (rseth1.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    wps = rseth1.getDouble(1);
                                    Twps = Twps + wps;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(wps),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                while (rsetw.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    constn = rsetw.getDouble(1);
                                    Tconstn = Tconstn + constn;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(constn),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                
                                while (rsetwq1.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    
                                    other = rsetwq1.getDouble(1);
                                    Tother = Tother + other;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(other),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                //   while (rsetr.next()){
                                table.getDefaultCell().setColspan(1);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                Cashs = cons+pham+lab+dental+xrays+nurs+thea+wps+constn+other;
                                TCashs = TCashs + Cashs;
                                //                                    Tcash = Tcash + Cashs;
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(cons+pham+lab+dental+xrays+nurs+thea+wps+constn+other),"0.00")),pFontHeader1);
                                table.addCell(phrase);
                                
                                // }
                                
                                while (rsetz.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    nhif = rsetz.getDouble(1);
                                    Tnhif = Tnhif + nhif;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(nhif),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                
                                while (rsetc.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    debtor = rsetc.getDouble(1);
                                    Tdebtors = Tdebtors + debtor;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(debtor),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                
                                
                                table.getDefaultCell().setColspan(2);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                // janu = rsetw.getDouble(1);
                                // table.addCell(phrase);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Cashs+debtor+nhif),"0.00")),pFontHeader1);
                                table.addCell(phrase);
                                Treceived = Treceived + (Cashs+debtor+nhif);
                                
                                
                                table.getDefaultCell().setColspan(2);
                                
                                while (rsetbk.next()){
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    banking = rsetbk.getDouble(1);
                                    Tfacility =Tfacility + banking;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(banking),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    // table.addCell(phrase);
                                }
                                
                                table.getDefaultCell().setColspan(1);
                                
                                while (rsetbp.next()){
                                    //  table.getDefaultCell().setColspan(1);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    petty = rsetbp.getDouble(1);
                                    Tpetty =Tpetty + petty;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(petty),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                table.getDefaultCell().setColspan(2);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(banking),"0.00")),pFontHeader1);
                                table.addCell(phrase);
                                
                                Tbanked = Tbanked + banking;
                                
                                while (rsetz1.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    unhif = rsetz1.getDouble(1);
                                    Tunhif = Tunhif + unhif;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(unhif),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                
                                while (rsetr1.next()){
                                    table.getDefaultCell().setColspan(1);
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    udebtor = rsetr1.getDouble(1);
                                    Tudebtors = Tudebtors + udebtor;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(udebtor),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                while (rsetwn.next()){
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                    waiver = rsetwn.getDouble(1);
                                    Twaivers = Twaivers + waiver;
                                    phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(waiver),"0.00")),pFontHeader1);
                                    table.addCell(phrase);
                                    
                                }
                                
                                // }
                            }
                            
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            table.getDefaultCell().setMinimumHeight(18);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase("Total      "+ new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tsales),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tcons),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tpham),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tlab),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tdental),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Txrays),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tnurs),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tthea),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Twps),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tconstn),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tother),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(TCashs),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tnhif),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tdebtors),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(2);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Treceived),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(1);
                            
                            table.getDefaultCell().setColspan(2);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tfacility),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tfacility),"0.00")),pFontHeader1);
                            // table.addCell(phrase);
                            table.getDefaultCell().setColspan(1);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tpetty),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            table.getDefaultCell().setColspan(2);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tbanked),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tunhif),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Tudebtors),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(dbObject.getDBObject(java.lang.String.valueOf(Twaivers),"0.00")),pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setBorder(Rectangle.TOP);
                            
                            table.getDefaultCell().setMinimumHeight(18);
                            table.getDefaultCell().setColspan(25);
                            phrase = new Phrase(" ",pFontHeader1);
                            table.addCell(phrase);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            
                            table.getDefaultCell().setColspan(5);
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            phrase = new Phrase("Prepared By __________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("Aprroved By __________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("Entered By __________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase(" ",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(6);
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
                            
                            phrase = new Phrase("Total Claims made to NHIF this Month :  KSHS",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase("",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(5);
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            phrase = new Phrase("Signature  ____________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("Signature  ____________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("Signature  ___________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase(" ",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(6);
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
                            
                            phrase = new Phrase("Total Owed to facility at the End-of-Month :  KSHS",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase("",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            
                            
                            table.getDefaultCell().setColspan(5);
                            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                            phrase = new Phrase("Date Prepared ________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("Date Approved ________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(5);
                            phrase = new Phrase("Date Entered ________________________",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase(" ",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(6);
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
                            
                            phrase = new Phrase("Other Debtors Owed to facility at the End-of-Month :  KSHS",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(2);
                            phrase = new Phrase("",pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            docPdf.add(table);
                            
                        } catch(java.sql.SQLException SqlExec) {
                            
                            SqlExec.printStackTrace();
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                            
                        }
                        
                        //  }
                        
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
                    
                    wait_for_Pdf2Show = rt.exec("xpdf "+tempFile+"");
                    
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
        int interval = 0;
        java.lang.Object[][] rangeDates = dailySeries.getAgeingDateSeries();
        java.lang.Object[][] monthDates = ageingSeries.getAgeingDateSeries();
        
        java.lang.Object[] listofActivities = null;
        
        java.util.Vector listActVector = new java.util.Vector(1,1);
        
        
        //for (int k = 0;  k < monthDates.length; k++){
        for (int k = monthDates.length - 1; k >= 0; k--) {
            
            for (int t = 0; t < rangeDates.length; t++) {
                
                listActVector.addElement(rangeDates[t][k]);
                
            }
        }
        
        listofActivities = listActVector.toArray();
        System.out.println("Done list of activities ...");
        return listofActivities;
        
    }
    
    
    
    public java.lang.Object[] getListofActivities1() {
        
        java.lang.Object[] listofActivities1 = null;
        
        java.util.Vector listActVector1 = new java.util.Vector(1,1);
        
        
        try {
            
            //    java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.PreparedStatement pSet1 = connectDB.prepareStatement("select distinct gl_account from pb_operating_parameters WHERE category ilike 'AOT%' GROUP BY gl_account ORDER BY gl_account");
            
            
            java.sql.ResultSet rSet1 = pSet1.executeQuery();
            
            while (rSet1.next()) {
                System.out.println(rSet1.getObject(1).toString());
                listActVector1.addElement(rSet1.getObject(1).toString());
                
            }
            
            //System.out.println(rSet1.getObject(1).toString());
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        listofActivities1 = listActVector1.toArray();
        System.out.println("Done list of activities ...");
        return listofActivities1;
    }
    
    
}





