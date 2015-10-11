/*
 * ImportDat.java
 *
 * Created on April 25, 2003, 3:10 PM
 */

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 */
public class ImportDat {
    
    /** Creates a new instance of ImportDat */
    public ImportDat(java.lang.String fileName) {
        
        this.parseDatFile(fileName);
       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.lang.String fileWithData = args[0];
        
        ImportDat data2process = new  ImportDat(fileWithData);
        
    }
    
    public void parseDatFile(java.lang.String dataFile) {
        
        java.lang.String m_number = null;
        java.lang.String sch_contrib = null;
        java.lang.String norm_contrib = null;
        java.lang.String loan_repaymnt = null;
        
        java.io.FileInputStream dataIOInFile = null;
        
        java.lang.String path2dataFile = null;
        
        java.util.Properties parseInst = new java.util.Properties();
        
        path2dataFile = "/root";
        
        java.io.File file2parse = new java.io.File(path2dataFile+System.getProperty("file.separator")+dataFile);
       
        System.out.println(path2dataFile+System.getProperty("file.separator")+dataFile);
        
                try {
        
                     dataIOInFile = new java.io.FileInputStream(file2parse);
                     
                } catch(java.io.FileNotFoundException fnfExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), fnfExec.getMessage());
                    
                }
        
                try {
                    
                    parseInst.load(dataIOInFile);
            
                    m_number = parseInst.getProperty("emp_no");
                    
                    System.out.println(m_number);
                    
                    sch_contrib = parseInst.getProperty("sch_cont");

                    System.out.println(sch_contrib);
                    
                    norm_contrib = parseInst.getProperty("norm_cont");
                    
                    System.out.println(norm_contrib);                    
                    
                    loan_repaymnt = parseInst.getProperty("loan_repay");
                    
                    System.out.println(loan_repaymnt);
                    
                } catch(java.io.IOException IOexec) {
                    
                  javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), IOexec.getMessage());
                  
                }
        
        try {
            
            java.lang.Class.forName("org.postgresql.Driver");
            
        } catch(java.lang.ClassNotFoundException cnfExec) {
            
             javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), cnfExec.getMessage());
             
        }
        
        try {
            
            java.sql.Connection connDB = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.PreparedStatement pstmt = connDB.prepareStatement("insert into test_import values(?,?,?,?)");
            
            pstmt.setObject(1,m_number);
            pstmt.setObject(2,sch_contrib);            
            pstmt.setObject(3,norm_contrib);            
            pstmt.setObject(4,loan_repaymnt); 
            
            pstmt.executeUpdate();
            
        } catch(java.sql.SQLException sqlExec) {
            
             javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
             
        }
        
    }
}
