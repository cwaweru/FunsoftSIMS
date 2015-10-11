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


public class StatementAccDetailPdf implements java.lang.Runnable {
    java.lang.String staffName = null;
    
    java.lang.String tscNo = null;
    
    java.lang.String loanNo = null;
    
    com.afrisoftech.lib.DBObject dbObject;
    
    java.util.Date beginDate = null;
    
    java.util.Date endDate = null;
    
    com.lowagie.text.HeaderFooter headerFoter;
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    boolean threadCheck = true;
    
    
    //  java.lang.String memNo2Use = null;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.NORMAL);
    com.lowagie.text.Font pFontHeader1 = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    com.lowagie.text.Font pFontHeader11 = FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD);
    com.lowagie.text.Font pFontHeader2 = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
     com.lowagie.text.Font pFontHeader3 = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
    com.lowagie.text.Font pFontHeader4 = FontFactory.getFont(FontFactory.HELVETICA, 6, Font.NORMAL);
   
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    //  public void FinalPatientInvoicePdf(java.sql.Connection connDb, java.lang.String begindate, java.lang.String endate, java.lang.String combox) {
    public void StatementAccDetailPdf(java.sql.Connection connDb, java.util.Date begindate, java.util.Date endate,java.lang.String combox,java.lang.String combox1,java.lang.String combox2) {
        
        dbObject = new com.afrisoftech.lib.DBObject();
        
        staffName = combox;
        tscNo = combox1;
        loanNo = combox2;
        
        connectDB = connDb;
        
        beginDate = begindate;
        
        endDate = endate;
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
            
            this.generatePdf(loanNo);
            
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
    
    
    public void generatePdf(java.lang.String loanNo) {
        
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
            double TotalDebit = 0.00;
            double TotalCredit = 0.00;
            double current = 0.00;
            double osBalancebf = 0.00;
            double runBal = 0.00;
            
            try {
                
                try {
                    
                    com.lowagie.text.pdf.PdfWriter.getInstance(docPdf, new java.io.FileOutputStream(tempFile));
                    
                    
                    String compName = null;
                    String date = null;
                    try {
                        
                        java.sql.Statement st3 = connectDB.createStatement();
                        java.sql.Statement st4 = connectDB.createStatement();
                        
                        java.sql.ResultSet rset2 = st3.executeQuery("SELECT company_name from company_profile");
                        java.sql.ResultSet rset4 = st4.executeQuery("SELECT date('now') as Date");
                        while(rset2.next())
                            compName = rset2.getObject(1).toString();
                        
                        while(rset4.next())
                            date = rset4.getObject(1).toString();
                        
                        com.lowagie.text.HeaderFooter headerFoter = new com.lowagie.text.HeaderFooter(new Phrase(""+compName+"                          Printed On: "+date+""),false);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 14, Font.BOLDITALIC,java.awt.Color.blue)));
                        
                        headerFoter.setRight(5);
                        
                        docPdf.setHeader(headerFoter);
                        
                    } catch(java.sql.SQLException SqlExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                        
                    }
                    
                    docPdf.open();
                    
                    try {
                        java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                        
                        
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        
                        long dateNow = calendar.getTimeInMillis();
                        
                        java.sql.Date datenowSql= new java.sql.Date(dateNow);
                        
                        System.out.println(datenowSql.toString());
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(5);
                        
                        int headerwidths[] = {20,35,15,15,15};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((100));
                        
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        
                        
                        table.getDefaultCell().setColspan(5);
                       table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                        Phrase phrase = new Phrase("Member Loan Statement for the period between " +dateFormat.format(beginDate)+" and "+dateFormat.format(endDate), pFontHeader2);
                        
                        table.addCell(phrase);
                          
                        
                        table.getDefaultCell().setColspan(1);
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        try {
                            double principal = 0.00;
                            double monthPrincipal = 0.00;
                            double totalInt = 0.00;
                            double monthInt = 0.00;
                            double monthInst = 0.00;
                            double expTotal = 0.00;
                            double LoanRate = 0.00;
                            double LoanPeriod = 0.00;
                            double Debit = 0.00;
                            double Credit = 0.00;
                            double Debits = 0.00;
                            double Credits = 0.00;
                            
                            java.sql.Statement st22 = connectDB.createStatement();
                            java.sql.Statement st11 = connectDB.createStatement();
                            java.sql.Statement st = connectDB.createStatement();
                            java.sql.Statement st1 = connectDB.createStatement();
                            java.sql.Statement st2 = connectDB.createStatement();
                            java.sql.Statement st3 = connectDB.createStatement();
                            java.sql.Statement st4 = connectDB.createStatement();
                            java.sql.Statement st41 = connectDB.createStatement();
                            java.sql.Statement st5 = connectDB.createStatement();
                            java.sql.Statement st22D = connectDB.createStatement();
                            java.sql.Statement stk = connectDB.createStatement();
                            java.sql.Statement st22X = connectDB.createStatement();
                            java.sql.Statement st2X = connectDB.createStatement();
                            
                            
                            
                            
                            java.sql.ResultSet rset = stk.executeQuery("select distinct staff_no,initcap(staff_name) as name, loan_no from loan_details_stmt_view where loan_no = '"+loanNo+"'");
                            java.sql.ResultSet rset1 = st1.executeQuery("select initcap(transaction_type),debit,credit, sum(credit + debit) as balance, date from loan_trans_view2 where loan_account_no = '"+loanNo+"' and date between '"+beginDate+"' and '"+endDate+"' group by transaction_type,debit,credit,date order by date");// UNION select pd.date::date,initcap(pd.scheme_staff_no), (sh.first_name||' '||sh.second_name||' '||sh.last_name) as name,pd.reference,sum(pd.credit),pd.patient_no from hp_patient_card pd,hp_inpatient_register sh where pd.patient_no = sh.patient_no and pd.isurer = '"+memNo+"' AND pd.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pd.credit > 0 group by pd.date::date,pd.scheme_staff_no, name,pd.reference,pd.invoice_no,pd.patient_no order by pd.invoice_no");
                            java.sql.ResultSet rset2 = st5.executeQuery("select monthly_repayment,expected_interest from loan_transactions where loan_account_no = '"+loanNo+"' and date between '"+beginDate+"' and '"+endDate+"' group by monthly_repayment,expected_interest, date order by date");// UNION select pd.date::date,initcap(pd.scheme_staff_no), (sh.first_name||' '||sh.second_name||' '||sh.last_name) as name,pd.reference,sum(pd.credit),pd.patient_no from hp_patient_card pd,hp_inpatient_register sh where pd.patient_no = sh.patient_no and pd.isurer = '"+memNo+"' AND pd.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pd.credit > 0 group by pd.date::date,pd.scheme_staff_no, name,pd.reference,pd.invoice_no,pd.patient_no order by pd.invoice_no");
                            java.sql.ResultSet rset22 = st22D.executeQuery("select interest,principal from sacco_deductions_view  where trans_type ilike 'loan' and loan_no = '"+loanNo+"' order by loan_no");// UNION select pd.date::date,initcap(pd.scheme_staff_no), (sh.first_name||' '||sh.second_name||' '||sh.last_name) as name,pd.reference,sum(pd.credit),pd.patient_no from hp_patient_card pd,hp_inpatient_register sh where pd.patient_no = sh.patient_no and pd.isurer = '"+memNo+"' AND pd.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pd.credit > 0 group by pd.date::date,pd.scheme_staff_no, name,pd.reference,pd.invoice_no,pd.patient_no order by pd.invoice_no");
                            java.sql.ResultSet rset22X = st22X.executeQuery("select principal, monthly_repayment, interest, debit, expected_interest, (monthly_repayment+interest) as insalments from loan_transactions where loan_account_no ilike '"+loanNo+"' and principal > 0 group by principal, monthly_repayment, interest, debit, expected_interest");// UNION select pd.date::date,initcap(pd.scheme_staff_no), (sh.first_name||' '||sh.second_name||' '||sh.last_name) as name,pd.reference,sum(pd.credit),pd.patient_no from hp_patient_card pd,hp_inpatient_register sh where pd.patient_no = sh.patient_no and pd.isurer = '"+memNo+"' AND pd.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pd.credit > 0 group by pd.date::date,pd.scheme_staff_no, name,pd.reference,pd.invoice_no,pd.patient_no order by pd.invoice_no");
                            java.sql.ResultSet rset2X = st2X.executeQuery("select payment_period,rate from approved_loans where approval_no = '"+loanNo+"'");// UNION select pd.date::date,initcap(pd.scheme_staff_no), (sh.first_name||' '||sh.second_name||' '||sh.last_name) as name,pd.reference,sum(pd.credit),pd.patient_no from hp_patient_card pd,hp_inpatient_register sh where pd.patient_no = sh.patient_no and pd.isurer = '"+memNo+"' AND pd.date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' and pd.credit > 0 group by pd.date::date,pd.scheme_staff_no, name,pd.reference,pd.invoice_no,pd.patient_no order by pd.invoice_no");
                            
                            java.sql.ResultSet rsetTotals2 = st22.executeQuery("select sum(debit-credit) from loan_transactions where loan_account_no = '"+loanNo+"' AND date::date < '"+beginDate+"' group by date order by date");
                            
                            while (rset22X.next()) {
                                principal = rset22X.getDouble(1);
                                monthPrincipal = rset22X.getDouble(2);
                                totalInt = rset22X.getDouble(5);
                                monthInt = rset22X.getDouble(3);
                                monthInst = rset22X.getDouble(6);
                                expTotal = rset22X.getDouble(4);
                                
                            }
                            
                            while (rset2X.next()) {
                                LoanPeriod = rset2X.getDouble(1);
                                
                                LoanRate = rset2X.getDouble(2);
                                
                            }
                            
                            while (rset.next()) {
                           
                                table.getDefaultCell().setColspan(1);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase("TSC No :  "+rset.getObject(1).toString(), pFontHeader3);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(2);
                                  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                      phrase = new Phrase("Name : "+rset.getObject(2).toString(), pFontHeader3);
                                table.addCell(phrase);
                                
                                
                                table.getDefaultCell().setColspan(2);
                                phrase = new Phrase("Loan No :  "+rset.getObject(3).toString(), pFontHeader3);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(5);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                                
                                
                                phrase = new Phrase(" ",pFontHeader4);
                                table.addCell(phrase);
                                
                                
                                
                                // }
                                
                                // while (rset2X.next()) {
                                
                                table.getDefaultCell().setColspan(3);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                
                                phrase = new Phrase("Repayment Period :  "+LoanPeriod+ " months", pFontHeader1);
                                //phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency("Repayment Period : "+java.lang.String.valueOf(LoanPeriod)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(2);
                                phrase = new Phrase("Interest Rate :  "+LoanRate+ " %", pFontHeader1);
                                // phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(LoanRate)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                // }
                                
                                // while (rset22X.next()) {
                                
                                table.getDefaultCell().setColspan(3);
                                phrase = new Phrase("Principal :  "+principal, pFontHeader1);
                                //phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(principal)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(2);
                                phrase = new Phrase("Monthly Principal :  "+monthPrincipal, pFontHeader1);
                                //phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(monthPrincipal)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                
                                table.getDefaultCell().setColspan(3);
                                phrase = new Phrase("Total Interest :  "+totalInt, pFontHeader1);
                                // phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(TotalDebit)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                
                                table.getDefaultCell().setColspan(2);
                                phrase = new Phrase("Monthly Interest :  "+monthInt, pFontHeader1);
                                // phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(monthInt)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                
                                table.getDefaultCell().setColspan(3);
                                phrase = new Phrase("Total (Principal + Total Interest) :  "+expTotal, pFontHeader1);
                                //phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(expTotal)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(2);
                                phrase = new Phrase("Total Monthly Instal : "+monthInst, pFontHeader1);
                                // phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(monthInst)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(5);
                                phrase = new Phrase(" ",pFontHeader4);
                                
                                 table.addCell(phrase);
                                
                            }
                            
                            
                            table.getDefaultCell().setColspan(5);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            phrase = new Phrase("  ");
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("Date",pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("Description.",pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("Debit ",pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("Credit ",pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase("Running Amt. ",pFontHeader1);
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            table.getDefaultCell().setBorderWidth(Rectangle.TOP);
                            
                            while (rsetTotals2.next()){
                                
                                table.getDefaultCell().setColspan(3);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                phrase = new Phrase("BAL/BF", pFontHeader1);
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                table.getDefaultCell().setColspan(2);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(rsetTotals2.getString(1)),pFontHeader1);
                                osBalancebf = rsetTotals2.getDouble(1);
                                table.addCell(phrase);
                                
                                
                            }
                            
                            while (rset1.next()){
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                                table.getDefaultCell().setBorderWidth(Rectangle.TOP);
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset1.getObject(5), "-"), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setColspan(1);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset1.getObject(1), "-"), pFontHeader);
                                
                                table.addCell(phrase);
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                table.getDefaultCell().setColspan(1);
                                phrase = new Phrase(dbObject.getDBObject(rset1.getObject(2), "-"), pFontHeader);
                                
                                table.addCell(phrase);
                                Debits = rset1.getDouble(2);
                                TotalDebit = TotalDebit + Debits;
                                table.getDefaultCell().setColspan(1);
                                
                                phrase = new Phrase(dbObject.getDBObject(rset1.getObject(3), "-"), pFontHeader);
                                table.addCell(phrase);
                                
                                Credits = rset1.getDouble(3);
                                TotalCredit = TotalCredit + Credits;
                                
                                table.getDefaultCell().setColspan(1);
                                
                                runBal = runBal + (Debits-Credits);
                                phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(runBal+osBalancebf)),pFontHeader1);
                                
                                table.addCell(phrase);
                                
                            }
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            table.getDefaultCell().setColspan(2);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Total", pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(TotalDebit)),pFontHeader1);
                            
                            table.addCell(phrase);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(TotalCredit)),pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(TotalDebit - TotalCredit+osBalancebf)),pFontHeader1);
                            
                            table.addCell(phrase);
                            
                            
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
    
    
    
    
    
}


