/*
 * Generated by JDBC Form Wizard
 *
 * Department.java
 *
 * Created on Aug 01, 2003, 12:07 PM
*/

package com.afrisoftech.hospital;

/**
 *
 * @author  root
 * @version 
 */

public class Department1 extends javax.swing.JFrame
{

   java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public Department1(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        pooledConnectionSource1 = new org.netbeans.lib.sql.pool.PooledConnectionSource();
        dataNavigator1 = new org.netbeans.lib.sql.DataNavigator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        nBCachedRowSet1.setCommand("select * from pb_departments");
        nBCachedRowSet1.setConnectionSource(pooledConnectionSource1);
        try {
            nBCachedRowSet1.setTableName("pb_departments");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        pooledConnectionSource1.setDatabase("jdbc:postgresql://192.168.215.120:5432/metro");
        pooledConnectionSource1.setDriver("org.postgresql.Driver");

        setTitle("Departments");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
      //  new Department().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.pool.PooledConnectionSource pooledConnectionSource1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
