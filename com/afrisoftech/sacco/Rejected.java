/*
 * Generated by JDBC Form Wizard
 *
 * rejecte.java
 *
 * Created on Feb 04, 2003, 05:16 PM
*/

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 * @version 
 */

public class Rejected extends javax.swing.JFrame
{

     
       java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public Rejected(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
        connectDB = connDb;
        
        pConnDB = pconnDB;
        
        initComponents();
    }   
   
    private void initComponents() {//GEN-BEGIN:initComponents
        try {
            nBCachedRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        dataNavigator1 = new org.netbeans.lib.sql.DataNavigator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        nBCachedRowSet1.setCommand("select * from reject_reason");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("reject_reason");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Reject Reason");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("reject_code", "Reject code", true),
            new org.netbeans.lib.sql.models.TableModel.Column("reason", "Reason", true),
            new org.netbeans.lib.sql.models.TableModel.Column("date", "Date", false)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 600, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
 //       new rejecte().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    // End of variables declaration//GEN-END:variables

}

