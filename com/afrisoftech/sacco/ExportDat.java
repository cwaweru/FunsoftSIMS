/*
 * ExportDat.java
 *
 * Created on April 25, 2003, 3:10 PM
 */

package com.afrisoftech.sacco;

/**
 *
 * @author  Charles Waweru
 * @Revision 1.0a
 */
public class ExportDat {
    
    /** Creates a new instance of ExportDat */
    public ExportDat(java.lang.String fileName) {
        
        this.parseDatFile(fileName);
       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.lang.String file2StoreData = args[0];
        
        ExportDat data2process = new  ExportDat(file2StoreData);
        
    }
    
    public void parseDatFile(java.lang.String dataFile) {
        
        java.lang.String m_number = null;
        java.lang.String sch_contrib = null;
        java.lang.String norm_contrib = null;
        java.lang.String loan_repaymnt = null;
        
        java.io.FileInputStream dataIOInFile = null;
        
        java.io.FileOutputStream dataIOOutFile = null;
        
        java.lang.String path2dataFile = null;
        java.lang.String path2dataOutFile = null;        
        
        java.util.Properties parseInst = new java.util.Properties();
        
        java.util.Properties parseOutInst = new java.util.Properties();
        
        path2dataFile = "c:/testdata";
        path2dataOutFile = "c:/testdata";        
        
        java.io.File file2parse = new java.io.File(path2dataFile+System.getProperty("file.separator")+dataFile);
        java.io.File file2parse2 = new java.io.File(path2dataOutFile+System.getProperty("file.separator")+dataFile);
       
        System.out.println(path2dataFile+System.getProperty("file.separator")+dataFile);
        
                try {
        
                     dataIOInFile = new java.io.FileInputStream(file2parse);
                  //   dataIOInFile.close();
                     
                     dataIOOutFile = new java.io.FileOutputStream(file2parse2);
                     
                } catch(java.io.FileNotFoundException fnfExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), fnfExec.getMessage());
                    
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
                       try {
                    
                    parseInst.load(dataIOInFile);
                    dataIOInFile.close();
//                    parseOutInst.store(dataIOOutFile, new String("member_no,sch_contrib,norm_cont,loan_repay"));

                    m_number = parseInst.getProperty("emp_no");
                    parseOutInst.setProperty("1","0056 5600 3450 4500");
                   // parseOutInst.setProperty("emp_no","0057");
                    System.out.println(m_number);
                    
                    sch_contrib = parseInst.getProperty("sch_cont");
                    parseOutInst.setProperty("sch_cont","5600");
                    System.out.println(sch_contrib);
                    
                    norm_contrib = parseInst.getProperty("norm_cont");
                    parseOutInst.setProperty("norm_cont","3450");
                    System.out.println(norm_contrib);                    
                    
                    loan_repaymnt = parseInst.getProperty("loan_repay");
                    parseOutInst.setProperty("loan_repay","4500");
                    System.out.println(loan_repaymnt);
                    
                    parseOutInst.store(dataIOOutFile, new String("member_no,sch_contrib,norm_cont,loan_repay"));
                    
                } catch(java.io.IOException IOexec) {
                    
                  javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), IOexec.getMessage());
                  
                } 
    }
}
