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


public class ShiftsTotalPdf implements java.lang.Runnable {
    
    public static java.sql.Connection connectDB = null;
    java.lang.String bank = null;
    java.util.Date beginDate = null;
    
    com.afrisoftech.lib.DBObject dbObject;
    
    java.util.Date endDate = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    boolean threadCheck = true;
    
    java.lang.Thread threadSample;
    
    com.lowagie.text.Font pFontHeader = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.BOLD);
    com.lowagie.text.Font pFontNum = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.NORMAL);
    
    //   com.lowagie.text.ParagraphFont pgraph = Paragraph();
    
    
    java.lang.Runtime rtThreadSample = java.lang.Runtime.getRuntime();
    
    java.lang.Process prThread;
    
    public void ShiftsTotalPdf(java.sql.Connection connDb,java.util.Date begindate,java.util.Date endate) {
        
        dbObject = new com.afrisoftech.lib.DBObject();
        
        //bank = combox;
        
        connectDB = connDb;
        
        beginDate = begindate;
        
        endDate = endate;
        
        threadSample = new java.lang.Thread(this,"SampleThread");
        
        System.out.println("threadSample created");
        
        threadSample.start();
        
        System.out.println("threadSample fired");
        
    }
    
    public static void main(java.lang.String[] args) {
        
        //	new CashBookListPdf().CashBookListPdf();
        
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
                    
                    
                    
     /*    try {
      
            java.lang.Class.forName("org.postgresql.Driver");
      
        } catch(java.lang.ClassNotFoundException cnfExec) {
      
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), cnfExec.getMessage());
      
        }
      */
                    double Cash = 0.00;
                    double Chq = 0.00;
                    double Card = 0.00;
                    double Refund = 0.00;
                    double Net = 0;
                     double Rct = 0;
                    String compName = null;
                    String date = null;
                    
                    
                    com.lowagie.text.HeaderFooter footer = new com.lowagie.text.HeaderFooter(new Phrase("Shift Report Summary  - Page: ",pFontHeader), true);// FontFactory.getFont(com.lowagie.text.FontFactory.HELVETICA, 12, Font.BOLDITALIC,java.awt.Color.blue));
                    
                    docPdf.setFooter(footer);
                    
                    
                    docPdf.open();
                    
                    try {
                        
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        
                        long dateNow = calendar.getTimeInMillis();
                        
                        java.sql.Date datenowSql= new java.sql.Date(dateNow);
                        
                        System.out.println(datenowSql.toString());
                        
                        //  java.lang.Object listofStaffNos[] = this.getListofStaffNos();
                        
                        
                        com.lowagie.text.pdf.PdfPTable table1 = new com.lowagie.text.pdf.PdfPTable(8);
                        //  com.lowagie.text.Table table = new com.lowagie.text.Table(7);
                        
                        // table.endHeaders();
                        
                        int headerwidths[] = {12,15,30,15,10,15,10,18};
                        
                        table1.setWidths(headerwidths);
                        //  if (docPdf.getPageNumber() > 1) {
                        //  table1.setHeaderRows(4);
                        //  }
                        table1.setWidthPercentage((100));
                        
                        
                        table1.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table1.getDefaultCell().setColspan(8);
                        
                        Phrase phrase = new Phrase();
                        
                        //  table.addCell(phrase);
                        
                        table1.getDefaultCell().setColspan(1);
                        table1.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table1.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        try {
                            java.sql.Statement st3 = connectDB.createStatement();
                            java.sql.ResultSet rset3 = st3.executeQuery("select header_name,current_date from pb_header");
                            while (rset3.next())
                                table1.getDefaultCell().setColspan(8);
                            
                            table1.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_CENTER);
                            phrase = new Phrase(rset3.getObject(1).toString(), pFontHeader);
                            table1.addCell(phrase);
                            date = rset3.getObject(2).toString();
                        } catch(java.sql.SQLException SqlExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SqlExec.getMessage());
                            
                        }
                        docPdf.add(table1);
                    } catch(com.lowagie.text.BadElementException BadElExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), BadElExec.getMessage());
                        
                    }
                    
                    try {
                        
                        
                        com.lowagie.text.pdf.PdfPTable table = new com.lowagie.text.pdf.PdfPTable(11);
                        
                        int headerwidths[] = {8,10,5,15,12,12,9,13,12,13,10};
                        
                        table.setWidths(headerwidths);
                        
                        table.setWidthPercentage((105));
                        
                        table.setHeaderRows(2);
                        
                        table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                        
                        table.getDefaultCell().setColspan(11);
                        Phrase phrase = new Phrase("", pFontHeader);
                        
                        
                        //try {
                        //  java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                        
                        
                        // java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());
                        //java.util.Date endDate11 = dateFormat.parse(beginDate.toLocaleString());//dateInstance.toLocaleString());
                        //
                        //System.out.println(""+endDate1);
                        //  phrase = new Phrase(bank +" Report: " +dateFormat.format(formattedDate), pFontHeader);
                        
                        //  table.addCell(phrase);
                        table.getDefaultCell().setColspan(7);
                        
                        phrase = new Phrase("Shifts Totals" , pFontHeader);
                        
                        table.addCell(phrase);
                        table.getDefaultCell().setColspan(4);
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        
                        phrase = new Phrase("Printed On  :" +date , pFontHeader);
                        
                        table.addCell(phrase);
                           /* } catch(java.text.ParseException psExec) {
                            
                                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                            
                            }*/
                        // Phrase phrase = new Phrase("Patients List As At:" +endDate, pFontHeader);
                        
                        //table.addCell(phrase);
                        try {
                            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);//MEDIUM);
                            
                            
                            java.util.Date endDate1 = dateFormat.parse(endDate.toLocaleString());//dateInstance.toLocaleString());
                            java.util.Date endDate11 = dateFormat.parse(beginDate.toLocaleString());//dateInstance.toLocaleString());
                            
                            System.out.println(""+endDate1);
                            //  phrase = new Phrase(bank +" Report: " +dateFormat.format(formattedDate), pFontHeader);
                            
                            //  table.addCell(phrase);
                            table.getDefaultCell().setColspan(11);
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Period - From : "  +dateFormat.format(endDate11)+" To : "+dateFormat.format(endDate1), pFontHeader);
                            
                            table.addCell(phrase);
                            
                        } catch(java.text.ParseException psExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), psExec.getMessage());
                            
                        }
                        
                        table.getDefaultCell().setColspan(1);
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                        
                        
                        
                        //    table.getDefaultCell().setBackgroundColor(java.awt.Color.LIGHT_GRAY);
                        
                        phrase = new Phrase("Shift No",pFontHeader);
                        table.addCell(phrase);
                        phrase = new Phrase("Cashier",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Rcpts",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                        
                        phrase = new Phrase("Cash",pFontHeader);
                        table.addCell(phrase);
                        
                        
                        phrase = new Phrase("Chq",pFontHeader);
                        table.addCell(phrase);
                        
                        
                        phrase = new Phrase("C/Card",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Refund",pFontHeader);
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Net Amt",pFontHeader);
                        table.addCell(phrase);
                        
                        table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                        
                        phrase = new Phrase("S/Date", pFontHeader);
                        
                        table.addCell(phrase);
                        
                        phrase = new Phrase("E/Date", pFontHeader);
                        
                        table.addCell(phrase);
                        
                        phrase = new Phrase("Status", pFontHeader);
                        
                        table.addCell(phrase);
                        
                        // phrase = new Phrase("% Bal.", pFontHeader);
                        
                        //  table.addCell(phrase);
                        
                        table.getDefaultCell().setBackgroundColor(java.awt.Color.WHITE);
                        table.getDefaultCell().setBorderColor(java.awt.Color.WHITE);
                        
                        
                        try {
                            
                            java.lang.Object[] listofAct = this.getListofStaffNos();
                            
                            
                            System.out.println(listofAct.length);
                            //java.sql.Statement st12 = connectDB.createStatement();
                            
                            //  java.sql.ResultSet rset12 = st12.executeQuery("SELECT DISTINCT count(patient_no) FROM hp_admission WHERE discharge = false");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                            
                            for (int i = 0; i < listofAct.length; i++) {
                                
                                java.sql.Statement st1 = connectDB.createStatement();
                                
                                java.sql.Statement st2 = connectDB.createStatement();
                                java.sql.Statement st21 = connectDB.createStatement();
                                // java.sql.Statement st1 = connectDB.createStatement();
                                
                                java.sql.Statement st11 = connectDB.createStatement();
                                java.sql.Statement st12 = connectDB.createStatement();
                                java.sql.Statement st13 = connectDB.createStatement();
                                
                                java.sql.Statement st14 = connectDB.createStatement();
                                java.sql.Statement st15 = connectDB.createStatement();
                                
                                
                                java.sql.Statement st16 = connectDB.createStatement();
                                
                                // java.sql.ResultSet rset12 = st12.executeQuery("select count(ad.patient_no) from hp_admission ad where ad.patient_no ='"+listofAct[i]+"' ORDER BY patient_no DESC LIMIT 1");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                
                                //java.sql.ResultSet rset1 = st.executeQuery("select ad.date_admitted,ad.patient_no,ad.patient_name,ad.ward,ad.bed_no,ad.mode_of_payment,sum(pc.credit),sum(pc.debit) from hp_admission ad,hp_patient_card pc where ad.discharge =false and pc.patient_no = ad.patient_no and pc.date >= ad.date_admitted group by ad.date_admitted,ad.mode_of_payment,ad.patient_no,ad.patient_name,ad.ward,ad.bed_no");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                java.sql.ResultSet rset1 = st1.executeQuery("select sum(debit) from ac_cash_collection where shift_no ='"+listofAct[i]+"' and payment_mode ilike 'Cash%'");// and date between '"+beginDate+"'::date and  '"+endDate+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                java.sql.ResultSet rset11 = st11.executeQuery("select shift_no,initcap(user_name) from ac_shifts where shift_no ='"+listofAct[i]+"'");// and start_date::date > '"+beginDate+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                java.sql.ResultSet rset21 = st21.executeQuery("select distinct count(receipt_no) from ac_cash_collection  where shift_no ='"+listofAct[i]+"'");//and date between '"+beginDate+"'::date and  '"+endDate+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                java.sql.ResultSet rset12 = st12.executeQuery("select sum(debit) from ac_cash_collection where shift_no ='"+listofAct[i]+"' and payment_mode ilike '%Cheque%'");//and date between '"+beginDate+"'::date and  '"+endDate+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                java.sql.ResultSet rset13 = st13.executeQuery("select sum(debit) from ac_cash_collection where shift_no ='"+listofAct[i]+"' and payment_mode ilike 'Credit Card%'");// and date between '"+beginDate+"'::date and  '"+endDate+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                java.sql.ResultSet rset14 = st14.executeQuery("select start_date::date,end_date::date,status from ac_shifts where shift_no ='"+listofAct[i]+"' ");// and start_date::date > '"+beginDate+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                java.sql.ResultSet rset15 = st15.executeQuery("select sum(credit) from ac_cash_collection where shift_no ='"+listofAct[i]+"'");//and date between '"+beginDate+"'::date and  '"+endDate+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                java.sql.ResultSet rset16 = st16.executeQuery("select sum(debit - credit) from ac_cash_collection where shift_no ='"+listofAct[i]+"'");// and date between '"+beginDate+"'::date and  '"+endDate+"'");// tn,debit_note db WHERE tn.policy_no != '' and tn.policy_no = db.policy_no GROUP BY tn.policy_no,db.policy_class");
                                
                                // java.sql.ResultSet rsetTotals = st2.executeQuery("SELECT sum(debit),SUM(credit) from general_ledger_view WHERE date::date BETWEEN '"+beginDate+"' AND '"+endDate+"' AND gl_code = '"+bank+"'");
                                
                                
                                while (rset11.next()){
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset11.getObject(1), "-"),pFontNum);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset11.getObject(2), "-"),pFontNum);
                                    
                                    table.addCell(phrase);
                                }
                                
                                while (rset21.next())
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                phrase = new Phrase(dbObject.getDBObject(rset21.getObject(1), "0"),pFontNum);
                                Rct = Rct + rset21.getDouble(1);
                                table.addCell(phrase);
                                
                                
                                
                                table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                                
                                while (rset1.next())
                                    //table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset1.getObject(1), "0.00"),pFontNum);
                                Cash = Cash + rset1.getDouble(1);
                                table.addCell(phrase);
                                
                                
                                
                                while (rset12.next())
                                    //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset12.getObject(1), "0.0"),pFontNum);
                                Chq = Chq + rset12.getDouble(1);
                                table.addCell(phrase);
                                
                                
                                
                                while (rset13.next())
                                    //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset13.getObject(1), "0.0"),pFontNum);
                                Card = Card + rset13.getDouble(1);
                                table.addCell(phrase);
                                
                                while (rset15.next())
                                    //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset15.getObject(1), "0.0"),pFontNum);
                                Refund = Refund + rset15.getDouble(1);
                                table.addCell(phrase);
                                while (rset16.next())
                                    //  table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset16.getObject(1), "0.0"),pFontNum);
                                Net = Net + rset16.getDouble(1);
                                table.addCell(phrase);
                                
                                while (rset14.next()){
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset14.getObject(1), "-"),pFontNum);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset14.getObject(2), "-"),pFontNum);
                                    
                                    table.addCell(phrase);
                                    
                                    table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                                    phrase = new Phrase(dbObject.getDBObject(rset14.getObject(3), "-"),pFontNum);
                                    
                                    table.addCell(phrase);
                                }
                                
                            }
                            
                            table.getDefaultCell().setBorderColor(java.awt.Color.BLACK);
                            
                            table.getDefaultCell().setBorder(Rectangle.BOTTOM | Rectangle.TOP);
                            
                            table.getDefaultCell().setColspan(2);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase("Total", pFontHeader);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(1);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_RIGHT);
                            phrase = new Phrase(""+Rct,pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Cash)),pFontHeader);
                            
                            table.addCell(phrase);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Chq)),pFontHeader);
                            
                            table.addCell(phrase);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Card)),pFontHeader);
                            
                            table.addCell(phrase);
                            
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Refund)),pFontHeader);
                            
                            table.addCell(phrase);
                            phrase = new Phrase(new com.afrisoftech.sys.Format2Currency().Format2Currency(java.lang.String.valueOf(Net)),pFontHeader);
                            
                            table.addCell(phrase);
                            
                            table.getDefaultCell().setColspan(3);
                            
                            table.getDefaultCell().setHorizontalAlignment(PdfCell.ALIGN_LEFT);
                            phrase = new Phrase(" ", pFontHeader);
                            
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
    
    public java.lang.Object[] getListofStaffNos() {
        
        java.lang.Object[] listofStaffNos = null;
        
        java.util.Vector listStaffNoVector = new java.util.Vector(1,1);
        
        
        try {
            
            //    java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            
            java.sql.ResultSet rSet1 = stmt1.executeQuery("SELECT DISTINCT shift_no FROM ac_cash_collection WHERE date between '"+beginDate+"'::date and  '"+endDate+"' and shift_no is not null and shift_no !=''");
            
            while (rSet1.next()) {
                
                listStaffNoVector.addElement(rSet1.getObject(1).toString());
                
            }
            
        }catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        
        listofStaffNos = listStaffNoVector.toArray();
        System.out.println("Done list of Staff Nos ...");
        return listofStaffNos;
    }
    
    
}





