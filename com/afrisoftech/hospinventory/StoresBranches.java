/*
 * Generated by JDBC Form Wizard
 *
 * StoresBranches.java
 *
 * Created on Jun 25, 2004, 04:02 PM
*/

package com.afrisoftech.hospinventory;

/**
 *
 * @author  root
 * @version 
 */

public class StoresBranches extends javax.swing.JFrame
{
java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    public StoresBranches(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB)
    {
         pConnDB = pconnDB;
        
        connectDB = connDb;
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

        nBCachedRowSet1.setCommand("select * from st_stores");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("st_stores");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Sub Stores");
        try {
            dataNavigator1.setLayoutButtons(1);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("store_name", "Store name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("store_code", "Store code", true),
            new org.netbeans.lib.sql.models.TableModel.Column("date", "Date", true),
            new org.netbeans.lib.sql.models.TableModel.Column("patient_store", "Patient store", true),
            new org.netbeans.lib.sql.models.TableModel.Column("mark_up", "Mark up", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(462, 300));
        setLocation((screenSize.width-462)/2,(screenSize.height-300)/2);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
       // new StoresBranches().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

