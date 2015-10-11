/*
 * CheckShiftStatus.java
 *
 * Created on February 6, 2008, 3:25 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.afrisoftech.lib;

/**
 *
 * @author funsoft
 */
public class CheckShiftStatus {
    
    /** Creates a new instance of CheckShiftStatus */
    public CheckShiftStatus() {
    }
    
    public static boolean checkShiftStatus(java.sql.Connection connectDB, java.lang.String shiftNumber){
        
        boolean shiftStatus = false;
        
        try {
        
        java.sql.PreparedStatement pstmt = connectDB.prepareStatement("SELECT status FROM ac_shifts WHERE shift_no = ?");
        
        pstmt.setObject(1, shiftNumber);
        
        java.sql.ResultSet shiftRset = pstmt.executeQuery();
        
        while(shiftRset.next()){
            
           shiftStatus = shiftRset.getObject(1).toString().equalsIgnoreCase("Closed")?false:true;
                       
        }
        
        } catch(java.sql.SQLException sqle){
            
            sqle.printStackTrace();
            
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), sqle.getMessage());
            
        }    
        
        return shiftStatus;
        
    }
    
}
