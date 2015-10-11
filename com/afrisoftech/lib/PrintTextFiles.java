/*
 * PrintTextFiles.java
 *
 * Created on February 4, 2006, 11:58 AM
 */

package com.afrisoftech.lib;

/**
 *
 * @author  root
 */
public class PrintTextFiles {
    private static java.io.BufferedInputStream textFileInputStream;
    
    private static javax.print.SimpleDoc textPrintDocument;
    
    private static javax.print.DocPrintJob textDocPrintJob;
    
    private static javax.print.attribute.PrintRequestAttributeSet textPrintAttributeSet;
    
    private static  javax.print.DocFlavor textFileDocFlavor;
    /** Creates a new instance of PrintTextFiles */
    public PrintTextFiles() {
    }
    
    public static void printInvoiceTextFile(java.lang.String textFilePath){
        System.out.println("Selected default printer ["+System.getProperty("invoices_printer")+"]");
        textFileDocFlavor = javax.print.DocFlavor.INPUT_STREAM.AUTOSENSE;
        textPrintAttributeSet = new javax.print.attribute.HashPrintRequestAttributeSet();
//        javax.print.attribute.standard.MediaSize printMediaSize = new javax.print.attribute.standard.MediaSize(java.lang.Integer.parseInt(System.getProperty("invoice_textpagesize_x")), java.lang.Integer.parseInt(System.getProperty("invoice_textpagesize_y")), javax.print.attribute.Size2DSyntax.MM);
        javax.print.attribute.standard.PrintQuality printQuality = javax.print.attribute.standard.PrintQuality.DRAFT;
        //      textPrintAttributeSet.add(printMediaSize);
        // textPrintAttributeSet.add(printQuality);
        javax.print.PrintService printServices[] = javax.print.PrintServiceLookup.lookupPrintServices(textFileDocFlavor, textPrintAttributeSet);
        textDocPrintJob = null;
//        System.out.println("Printer Name : "+);
        for (int i = 0; i < printServices.length; i++){
            System.out.println("Printer Name : ["+printServices[i].getName()+"]");
            if (printServices[i].getName().equalsIgnoreCase(System.getProperty("invoices_printer"))){
                
                textDocPrintJob = printServices[i].createPrintJob();
                
                break;
            }
            
        }
        try {
            System.out.println("What is null ? :"+ textDocPrintJob +" , "+textFileInputStream+" , "+textFileDocFlavor);
            textFileInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(textFilePath));
            
            textPrintDocument = new javax.print.SimpleDoc(textFileInputStream,textFileDocFlavor, null);
            try{
                textDocPrintJob.print(textPrintDocument,textPrintAttributeSet);
            } catch(javax.print.PrintException prExec){
                prExec.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), prExec.getMessage(), "ERROR: Printer problem", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch(java.io.FileNotFoundException fnf){
            fnf.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), fnf.getMessage(), "ERROR: Printer problem", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public static void printReceiptTextFile(java.lang.String textFilePath){
        System.out.println("Selected default printer ["+System.getProperty("receipt_printer")+"]");
        textFileDocFlavor = javax.print.DocFlavor.INPUT_STREAM.AUTOSENSE;
        textPrintAttributeSet = new javax.print.attribute.HashPrintRequestAttributeSet();
   //     javax.print.attribute.standard.MediaSize printMediaSize = new javax.print.attribute.standard.MediaSize(java.lang.Integer.parseInt(System.getProperty("invoice_textpagesize_x")), java.lang.Integer.parseInt(System.getProperty("invoice_textpagesize_y")), javax.print.attribute.Size2DSyntax.MM);
        javax.print.attribute.standard.PrintQuality printQuality = javax.print.attribute.standard.PrintQuality.DRAFT;
        //      textPrintAttributeSet.add(printMediaSize);
        // textPrintAttributeSet.add(printQuality);
        javax.print.PrintService printServices[] = javax.print.PrintServiceLookup.lookupPrintServices(textFileDocFlavor, textPrintAttributeSet);
        textDocPrintJob = null;
//        System.out.println("Printer Name : "+);
        for (int i = 0; i < printServices.length; i++){
            System.out.println("Printer Name : ["+printServices[i].getName()+"]");
            if (printServices[i].getName().equalsIgnoreCase(System.getProperty("receipt_printer", "Generic / Text Only"))){
                
                textDocPrintJob = printServices[i].createPrintJob();
                
                break;
            }
            
        }
        try {
            System.out.println("What is null ? :"+ textDocPrintJob +" , "+textFileInputStream+" , "+textFileDocFlavor);
            textFileInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(textFilePath));
            
            textPrintDocument = new javax.print.SimpleDoc(textFileInputStream,textFileDocFlavor, null);
            try{
                textDocPrintJob.print(textPrintDocument,textPrintAttributeSet);
            } catch(javax.print.PrintException prExec){
                prExec.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), prExec.getMessage(), "ERROR: Printer problem", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch(java.io.FileNotFoundException fnf){
            fnf.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), fnf.getMessage(), "ERROR: Printer problem", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
}
