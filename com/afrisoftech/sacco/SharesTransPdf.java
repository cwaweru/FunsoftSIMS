//Author Charles Waweru

//Made to test Java support for Threads.

//Revision : Ver 1.0a

//import java.lang.*;

package com.afrisoftech.sacco;
import java.awt.Point;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.*;


public class SharesTransPdf implements java.lang.Runnable {

	
	     public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
     java.lang.String beginDate = null;
    
    java.lang.String endDate = null;
   
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
      
	boolean threadCheck = true;

	java.lang.Thread threadSample;

        com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.NORMAL);

     //   com.lowagie.text.ParagraphFont pgraph = Paragraph();

        
        java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();

	java.lang.Process prThread;

	public void SharesTransPdf(java.sql.Connection connDb, java.lang.String begindate, java.lang.String endate) {
                connectDB = connDb;
                beginDate = begindate;
                endDate = endate;
		threadSample = new java.lang.Thread(this,"SampleThread");

		System.out.println("threadSample created");

		threadSample.start();

		System.out.println("threadSample fired");

	}

	public static void main(java.lang.String[] args) {

//		new SharesTransPdf().SharesTransPdf();

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
        
        com.lowagie.text.Document docPdf = new com.lowagie.text.Document(PageSize.A4.rotate());
        
        try {
            
        try {
        
        com.lowagie.text.pdf.PdfWriter.getInstance(docPdf, new java.io.FileOutputStream(tempFile));
        

     
           String compName = null;
           String date = null;
         try {
            
       //   java.sql.Connection conDb = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
           
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
        
            com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("All Member Shares Transactions - Page: "), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
        
        docPdf.setFooter(footer);

           
        docPdf.open();
        
    
        try {
        
        
        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(7);
        
        int headerwidths[] = {10,10,25,17,8,15,15};
        
        table.setWidths(headerwidths);
        
        table.setWidthPercentage((100));
        
            
           table.getDefaultCell().setBorder(Rectangle.BOTTOM);
            
           table.getDefaultCell().setColspan(7); 
         
           Phrase phrase = new Phrase("Shares Transactions as at: " +endDate, pFontHeader);
         
           table.addCell(phrase);
            
            table.getDefaultCell().setColspan(1);

//            table.getDefaultCell().setBackgroundColor(java.awt.Color.LIGHT_GRAY);
            
             phrase = new Phrase("Date",pFontHeader);
            table.addCell(phrase);
          
            phrase = new Phrase("TSC No.",pFontHeader);
            table.addCell(phrase);
         
            phrase = new Phrase("Member Name",pFontHeader);
            table.addCell(phrase);
         
             phrase = new Phrase("Share Type",pFontHeader);
            table.addCell(phrase);
          
              phrase = new Phrase("Member No.",pFontHeader);
            table.addCell(phrase);
          
              table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
        
           phrase = new Phrase("Debit.",pFontHeader);
            table.addCell(phrase);
                phrase = new Phrase("Credit.",pFontHeader);
            table.addCell(phrase);
                
           table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
           table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
 
         try {
            
              java.sql.Statement st = connectDB.createStatement();
            java.sql.Statement st1 = connectDB.createStatement();
            
              
            java.sql.ResultSet rset = st.executeQuery("select date,payroll_no,initcap(member_name),share_type,member_code,debit,credit from shares_transactions WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND share_type ilike 'Normal Sha%' order by date");
            java.sql.ResultSet rset1 = st1.executeQuery("select SUM(debit),SUM(credit) from shares_transactions WHERE date BETWEEN '"+beginDate+"' AND '"+endDate+"'");
 
            while (rset.next()) {

           table.getDefaultCell().setColspan(1);
                 
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset.getObject(1).toString(), pFontHeader);
           table.addCell(phrase);
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset.getObject(2).toString(), pFontHeader);
            
           table.addCell(phrase);
           
            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset.getObject(3).toString(), pFontHeader);
           table.addCell(phrase);
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset.getObject(4).toString(), pFontHeader);
            
           table.addCell(phrase);
         
            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase(rset.getObject(5).toString(), pFontHeader);
           table.addCell(phrase);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(6)), pFontHeader);
            table.addCell(phrase);
           
            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset.getString(7)), pFontHeader);
           table.addCell(phrase);
          
         }  
            
          table.getDefaultCell().setBorder(Rectangle.TOP | Rectangle.BOTTOM);
           table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
           
            while (rset1.next()) {

           table.getDefaultCell().setColspan(5);
                 
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);         
           phrase = new Phrase("Total", pFontHeader);
           table.addCell(phrase);
         
           table.getDefaultCell().setColspan(1);
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(1)), pFontHeader);
            
           table.addCell(phrase);
           
           table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);         
           phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rset1.getString(2)), pFontHeader);
           table.addCell(phrase);
        
           }
            docPdf.add(table);
            
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
    
        
      
     
             
       
}


			

		
