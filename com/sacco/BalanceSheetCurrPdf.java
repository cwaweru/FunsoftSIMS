//Author Charles Waweru

//Made to test Java support for Threads.

//Revision : Ver 1.0a

//import java.lang.*;

package com.sacco;
import java.awt.Point;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.*;


public class BalanceSheetCurrPdf implements java.lang.Runnable {

	
    public static java.sql.Connection connectDB = null;
    
    java.lang.String beginDate = null;
    
   // java.lang.String endDate = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
      
	boolean threadCheck = true;

	java.lang.Thread threadSample;

        com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
         com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.NORMAL);

     //   com.lowagie.text.ParagraphFont pgraph = Paragraph();

        
        java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();

	java.lang.Process prThread;

	public void BalanceSheetPdf(java.sql.Connection connDb, java.lang.String begindate) {
                connectDB = connDb;
                beginDate = begindate;
                //endDate = endate;
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
        

                              
 /*        try { 
            
            java.lang.Class.forName("org.postgresql.Driver");
            
        } catch(java.lang.ClassNotFoundException cnfExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), cnfExec.getMessage());
            
        }
 */
 

           String compName = null;
           String date = null;
         try {
            
      //    java.sql.Connection conDb = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
           
            java.sql.Statement st3 = connectDB.createStatement();
             java.sql.Statement st4 = connectDB.createStatement(); 
            
          java.sql.ResultSet rset2 = st3.executeQuery("SELECT company_name from company_profile");
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
        
            com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Balance Sheet - Page: "), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
        
        docPdf.setFooter(footer);

           
        docPdf.open();
        
    
        try {
        
        
        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(3);
        
        int headerwidths[] = {30,40,30};
        
        table.setWidths(headerwidths);
        
        table.setWidthPercentage((100));
        
            
           table.getDefaultCell().setBorder(Rectangle.BOTTOM);
            
           table.getDefaultCell().setColspan(3); 
         
           Phrase phrase = new Phrase("Balance Sheet AS At"    +beginDate, pFontHeader);
         
           table.addCell(phrase);
            
            table.getDefaultCell().setColspan(1);

            table.getDefaultCell().setBackgroundColor(java.awt.Color.LIGHT_GRAY);
      
            table.addCell("");

            table.addCell("");
            
            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT); 
            
            table.addCell("Amount KShs.");            
          
           table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
           table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
 
         try {
            
            java.lang.Object[] listofAct = this.getListofActivities(); 
            
            java.lang.Object[] listofAct1 = this.getListofActivities1(); 
            java.lang.Object[] listofAct2 = this.getListofActivities2();
        //    java.sql.Connection conDb1 = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            System.out.println(listofAct.length);
            java.sql.Statement st4 = connectDB.createStatement();
             java.sql.ResultSet rset4 = st4.executeQuery("SELECT SUM(amount) from assets_view WHERE date <= '"+beginDate+"'"); 
         
            for (int i = 0; i < listofAct.length; i++) {
            
            java.sql.Statement st = connectDB.createStatement();
            
            java.sql.Statement st2 = connectDB.createStatement();            
          
            java.sql.Statement st3 = connectDB.createStatement();
            
            java.sql.ResultSet rset3 = st3.executeQuery("select DISTINCT at.description from accounts_setup at,balance_sheet_view bv,sub_activities sa,activity ac where at.main_code = '"+listofAct[i].toString()+"' and bv.gl_code = ac.code and ac.sub_code = sa.sub_code and sa.main_code = at.main_code and at.class = 'ba'");
            
            java.sql.ResultSet rset = st.executeQuery("select bv.gl_code,initcap(bv.description),sum(bv.amount) from balance_sheet_view bv,activity ac,accounts_setup at,sub_activities sa where at.main_code = '"+listofAct[i].toString()+"' and sa.main_code = '"+listofAct[i].toString()+"' and ac.sub_code = sa.sub_code and bv.gl_code = ac.code and at.class = 'ba' AND bv.date <='"+beginDate+"' group by bv.gl_code,bv.description order by bv.gl_code");
            
            java.sql.ResultSet rsetTotals = st2.executeQuery("SELECT SUM(amount) from balance_sheet_view bv,activity ac,sub_activities sa,accounts_setup at where sa.main_code = '"+listofAct[i].toString()+"' and sa.main_code = at.main_code and sa.sub_code = ac.sub_code and bv.gl_code = ac.code and at.class = 'ba' AND bv.date <= '"+beginDate+"' group by sa.main_code"); 
            
              
            //rsetTotals1 = st3.executeQuery("SELECT SUM(debit),SUM(credit) from"); 
           table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
           
                table.getDefaultCell().setColspan(3); 
                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT); 
                table.addCell("  ");
 

           table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
           
           
           
           while (rset3.next()) {

           table.getDefaultCell().setColspan(3);
                
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset3.getObject(1).toString(), pFontHeader1);

           table.addCell(phrase);

           }
           
           while (rset.next()) {

           table.getDefaultCell().setColspan(1);
                 
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset.getObject(1).toString(), pFontHeader1);
           table.addCell(phrase);
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset.getObject(2).toString(), pFontHeader1);
            
           table.addCell(phrase);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(3)), pFontHeader1);

           table.addCell(phrase);
         }     
     
           while (rsetTotals.next()) {

           table.getDefaultCell().setColspan(2);
              table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);     
           table.getDefaultCell().setBorder(Rectangle.TOP |Rectangle.BOTTOM); 
         
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase("Sub Total", pFontHeader);

           table.addCell(phrase);

           table.getDefaultCell().setColspan(1);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals.getString(1)), pFontHeader);

           table.addCell(phrase);
           } 
            
           
            }
            
             table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                table.getDefaultCell().setColspan(3); 
                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT); 
                table.addCell("  ");
 
            while (rset4.next()) {
         
                table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);      
                table.getDefaultCell().setBorder(Rectangle.BOTTOM);
         
           table.getDefaultCell().setColspan(2);
            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase("Total Assets", pFontHeader);

           table.addCell(phrase);
          table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);      
                  table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);      
          table.getDefaultCell().setBorder(Rectangle.BOTTOM);
      
           table.getDefaultCell().setColspan(1);
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset4.getString(1)), pFontHeader);

           table.addCell(phrase);
           }   
          
            
             table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);  
             java.sql.Statement st5 = connectDB.createStatement();
             java.sql.ResultSet rset5 = st5.executeQuery("SELECT SUM(amount) from liabilities_view WHERE date <= '"+beginDate+"'"); 
         
            for (int i = 0; i < listofAct1.length; i++) {
            
            java.sql.Statement st6 = connectDB.createStatement();
            
            java.sql.Statement st7 = connectDB.createStatement();            
          
            java.sql.Statement st8 = connectDB.createStatement();
            
            java.sql.ResultSet rset8 = st8.executeQuery("select DISTINCT at.description from accounts_setup at,balance_sheet_view bv,sub_activities sa,activity ac where at.main_code = '"+listofAct1[i].toString()+"' and bv.gl_code = ac.code and ac.sub_code = sa.sub_code and sa.main_code = at.main_code and at.class = 'bl'");
            
            java.sql.ResultSet rset6 = st6.executeQuery("select bv.gl_code,bv.description,sum(bv.amount) from balance_sheet_view bv,activity ac,accounts_setup at,sub_activities sa where at.main_code = '"+listofAct1[i].toString()+"' and sa.main_code = '"+listofAct1[i].toString()+"' and ac.sub_code = sa.sub_code and bv.gl_code = ac.code and at.class = 'bl' AND bv.date <= '"+beginDate+"' group by bv.gl_code,bv.description order by bv.gl_code");
            
            java.sql.ResultSet rset7 = st7.executeQuery("SELECT SUM(amount) from balance_sheet_view bv,activity ac,sub_activities sa,accounts_setup at where sa.main_code = '"+listofAct1[i].toString()+"' and sa.main_code = at.main_code and sa.sub_code = ac.sub_code and bv.gl_code = ac.code and at.class = 'bl' AND bv.date <= '"+beginDate+"' group by sa.main_code"); 
            
              
            //rsetTotals1 = st3.executeQuery("SELECT SUM(debit),SUM(credit) from"); 
           table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
           
                table.getDefaultCell().setColspan(3); 
                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT); 
                table.addCell("  ");
 

           table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
           
           
           
           while (rset8.next()) {
           table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
           table.getDefaultCell().setColspan(3);
                
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset8.getObject(1).toString(), pFontHeader1);

           table.addCell(phrase);

           }
           
           while (rset6.next()) {

           table.getDefaultCell().setColspan(1);
                 
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset6.getObject(1).toString(), pFontHeader);
           table.addCell(phrase);
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset6.getObject(2).toString(), pFontHeader1);
            
           table.addCell(phrase);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset6.getString(3)), pFontHeader1);

           table.addCell(phrase);
         }     
     
           while (rset7.next()) {

          
               table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
               table.getDefaultCell().setColspan(2);
               table.getDefaultCell().setBorder(Rectangle.TOP); 
      
         
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase("Sub Total", pFontHeader);

           table.addCell(phrase);

           table.getDefaultCell().setColspan(1);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset7.getString(1)), pFontHeader);

           table.addCell(phrase);
           } 
           
            
           table.getDefaultCell().setColspan(3); 
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT); 
           table.addCell("  ");
       table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);     

           
            }
            while (rset5.next()) {

           table.getDefaultCell().setColspan(2);
             
          table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase("Total Liabilities", pFontHeader);
          table.getDefaultCell().setBorder(Rectangle.BOTTOM);
            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);     
   
           table.addCell(phrase);

           table.getDefaultCell().setColspan(1);

           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset5.getString(1)), pFontHeader);

           table.addCell(phrase);
           }   
        float num_a = 0;
        float num_b = 0;
        float num_c = 0; 
        float totals = 0;
        int j = 0;
             java.sql.Statement st13 = connectDB.createStatement();
             java.sql.ResultSet rset13 = st13.executeQuery(" SELECT description,sub_code,(select sum(amount) from pl_account_view WHERE date <= '"+beginDate+"') from sub_activities where identifier Like 'pl%'");
             java.sql.Statement st9 = connectDB.createStatement();
             java.sql.ResultSet rset9 = st9.executeQuery("SELECT SUM(amount) from equity_view WHERE date <= '"+beginDate+"'"); 
         
            java.sql.Statement st14 = connectDB.createStatement();
             java.sql.ResultSet rset14= st14.executeQuery("select(select sum(amount) from pl_account_view WHERE date <= '"+beginDate+"') + (select sum(amount) from equity_view WHERE date <= '"+beginDate+"')"); 
             java.sql.Statement st16 = connectDB.createStatement();
             java.sql.ResultSet rset16= st16.executeQuery("select(select sum(amount) from pl_account_view WHERE date <= '"+beginDate+"') + (select sum(amount) from equity_view WHERE date <= '"+beginDate+"') + (select sum(amount) from liabilities_view WHERE date <= '"+beginDate+"')"); 
 
            for (int i = 0; i < listofAct2.length; i++) {
            
            java.sql.Statement st10 = connectDB.createStatement();
            
            java.sql.Statement st8 = connectDB.createStatement();            
          
            java.sql.Statement st11 = connectDB.createStatement();
            
          //   java.sql.ResultSet rset10 = st10.executeQuery("select * from equity_view");
           
            
            java.sql.ResultSet rset11 = st11.executeQuery("select DISTINCT at.description from accounts_setup at,balance_sheet_view bv,sub_activities sa,activity ac where at.main_code = '"+listofAct2[i].toString()+"' and bv.gl_code = ac.code and ac.sub_code = sa.sub_code and sa.main_code = at.main_code and at.class = 'bli'");
       
            java.sql.Statement st15 = connectDB.createStatement();
            java.sql.ResultSet rset15 = st15.executeQuery("select bv.gl_code,bv.description,sum(bv.amount) from balance_sheet_view bv,activity ac,accounts_setup at,sub_activities sa where at.main_code = '"+listofAct2[i].toString()+"' and sa.main_code = '"+listofAct2[i].toString()+"' and ac.sub_code = sa.sub_code and bv.gl_code = ac.code and at.class = 'bli' AND bv.date <= '"+beginDate+"' group by bv.gl_code,bv.description order by bv.gl_code");
  
           
                 table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                table.getDefaultCell().setColspan(3); 
                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT); 
                table.addCell("  ");
 
      
           while (rset11.next()) {
            table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
           table.getDefaultCell().setColspan(3);
   
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset11.getObject(1).toString(), pFontHeader1);
            System.out.println( rset11.getObject(1).toString());
           
           table.addCell(phrase);

           }
           
           while (rset15.next()) {
           table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
           table.getDefaultCell().setColspan(1);
                 
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset15.getObject(1).toString(), pFontHeader1);
           table.addCell(phrase);
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset15.getObject(2).toString(), pFontHeader1);
           System.out.println(rset15.getObject(2).toString()); 
           table.addCell(phrase);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
        // table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset15.getString(3)), pFontHeader1);

           table.addCell(phrase);
         }     
            }
           while (rset13.next()) {

           //table.getDefaultCell().setColspan(2);
                 
         //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
          // table.getDefaultCell().
         //  phrase = new Phrase("Profit & Loss", pFontHeader);
           
           
           table.getDefaultCell().setColspan(1);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);  
         
           phrase = new Phrase(rset13.getObject(2).toString(), pFontHeader1);

           table.addCell(phrase);

           
           table.getDefaultCell().setColspan(1);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);  
         
           phrase = new Phrase(rset13.getObject(1).toString(), pFontHeader1);

           table.addCell(phrase);

           
          // table.addCell(phrase);

           table.getDefaultCell().setColspan(1);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset13.getString(3)), pFontHeader1);

           table.addCell(phrase);

            }
   
               while (rset14.next()) {

           table.getDefaultCell().setColspan(2);
           table.getDefaultCell().setBorder(Rectangle.TOP);
           table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);   
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
          // table.getDefaultCell().
           phrase = new Phrase("Total Equity", pFontHeader);

           table.addCell(phrase);

           table.getDefaultCell().setColspan(1);
           table.getDefaultCell().setBorderColor(java.awt.Color.BLACK); 
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
          
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset14.getString(1)), pFontHeader1);

           table.addCell(phrase);
      
           
          
            }
             
          table.getDefaultCell().setColspan(3); 
          table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT); 
          table.addCell("  ");
          table.getDefaultCell().setBorderColor(java.awt.Color.WHITE); 
 
           
                 while (rset16.next()) {

           table.getDefaultCell().setColspan(2);
          
           table.getDefaultCell().setBorderColor(java.awt.Color.BLACK); 
           table.getDefaultCell().setBorder(Rectangle.BOTTOM);
     
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
          // table.getDefaultCell().
           phrase = new Phrase("Total Liabilities + Equity", pFontHeader);

           table.addCell(phrase);

           table.getDefaultCell().setColspan(1);
      //   table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);   
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);  
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset16.getString(1)), pFontHeader1);
         
           //  phrase = new Phrase("KS" +totals1, pFontHeader1);
         //    System.out.println( "KSS" +totals1);
            table.addCell(phrase);
      
         
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
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT main_code FROM accounts_setup where class = 'ba' order by main_code");
            
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
        
        java.util.Vector listActVector = new java.util.Vector(1,1);
        
      
        
        try {
            
              
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT main_code FROM accounts_setup where class = 'bl' order by main_code");
            
            while (rSet1.next()) {
                
                listActVector.addElement(rSet1.getObject(1).toString());
                
            }
            
            }catch (java.sql.SQLException sqlExec) {
                
                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
                
            }
            
            listofActivities1 = listActVector.toArray();
            
            return listofActivities1;
    }       
       
          public java.lang.Object[] getListofActivities2() {
     
        java.lang.Object[] listofActivities2 = null;
        
        java.util.Vector listActVector = new java.util.Vector(1,1);
        
     
        
        try {
            
          //  java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/insurance","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT main_code FROM accounts_setup where class = 'bli' order by main_code");
            
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
       
}


			

		
