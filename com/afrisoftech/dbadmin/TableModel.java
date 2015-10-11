/*
 * TableModel.java
 *
 * Created on April 1, 2006, 2:32 PM
 */

package com.afrisoftech.dbadmin;

/**
 *
 * @author  root
 */
public class TableModel {
    
    //    static java.sql.Connection connectDB = null;
    
    javax.swing.JTable dataViewTable = null;
    
    static java.util.Vector dataViewVector;
    
    static javax.swing.JTable searchTable;
    
    static java.util.Vector columnVector;
    
    static com.afrisoftech.lib.DBObject dbObject;
    
    static java.util.Vector childVector;
    
    java.awt.GridBagConstraints gridBagConstraints;
    
    /** Creates a new instance of TableModel */
/*    public TableModel(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
 
        connectDB = connDb;
 
        //        pConnDB = pconnDB;
 
    }
 */
    public static javax.swing.table.DefaultTableModel createTableVectors(java.sql.Connection connectDB, java.lang.String queryString) {
        
        dbObject  = new com.afrisoftech.lib.DBObject();
        
        dataViewVector = new java.util.Vector(1,1);
        
        javax.swing.table.DefaultTableModel defaultTableModel = new javax.swing.table.DefaultTableModel();
        
        try {
            
            java.sql.PreparedStatement pstmtVector = connectDB.prepareStatement(queryString);
            
            java.sql.ResultSet rsetVector = pstmtVector.executeQuery();
            
            java.sql.ResultSetMetaData rsetMetaData = rsetVector.getMetaData();
            
            int columnCount = rsetMetaData.getColumnCount();
            
            columnVector = new java.util.Vector(columnCount);
            
            for (int i = 0; i < columnCount; i++) {
                
                columnVector.add(i,rsetMetaData.getColumnName(i + 1).toUpperCase());
                
            }
            
            while (rsetVector.next()) {
                
                childVector = new java.util.Vector(columnCount);
                
                for (int j = 0; j < columnCount; j++) {
                    
                    if(rsetVector.getMetaData().getColumnType(j + 1) == java.sql.Types.NUMERIC){
                        
                        childVector.addElement(new java.lang.Double(dbObject.getDBObject(rsetVector.getObject(j + 1), "")));
                        
                    } else if((rsetVector.getMetaData().getColumnType(j + 1) == java.sql.Types.BOOLEAN) || (rsetVector.getMetaData().getColumnType(j + 1) == java.sql.Types.BIT)) {
                        
                        System.out.println("We have boolean field");
                        
                        childVector.addElement(new java.lang.Boolean(dbObject.getDBObject(rsetVector.getObject(j + 1), "")));
                        
                    } else {
                        childVector.addElement(dbObject.getDBObject(rsetVector.getString(j + 1), ""));
                        
                    }
                }
                
                dataViewVector.add(childVector);
                
            }
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), sqlExec.getMessage());
            
        }
        
        defaultTableModel.setDataVector(dataViewVector, columnVector);
/*
        searchTable = new javax.swing.JTable(defaultTableModel){
 
            public Class getColumnClass(int c) {
 
                return getValueAt(0, c).getClass();
            }
 
 
        };
 */
        // return searchTable;
        return defaultTableModel;
        
    }
    
}
