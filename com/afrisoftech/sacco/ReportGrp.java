/*
 * Generated by JDBC Form Wizard
 *
 * reportgrp.java
 *
 * Created on May 03, 2003, 08:40 AM
*/

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 * @version 
 */

public class ReportGrp extends javax.swing.JFrame
{

    
       java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public ReportGrp(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        nBCachedRowSet1.setCommand("select * from report_groups");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("report_groups");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Report Group");
        try {
            dataNavigator1.setLayoutButtons(1);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("code", "Code", true),
            new org.netbeans.lib.sql.models.TableModel.Column("description", "Description", true),
            new org.netbeans.lib.sql.models.TableModel.Column("date", "Date", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 450, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
 //       new reportgrp().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    // End of variables declaration//GEN-END:variables

}

