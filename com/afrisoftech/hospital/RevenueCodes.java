/*
 * Generated by JDBC Form Wizard
 *
 * RevenueCodes.java
 *
 * Created on Sep 04, 2003, 02:42 PM
*/

package com.afrisoftech.hospital;

/**
 *
 * @author  root
 * @version 
 */

public class RevenueCodes extends javax.swing.JFrame
{

    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    java.lang.String comboBox = null;
    
    public RevenueCodes(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB, java.lang.String cmbox) {
        
        connectDB = connDb;
        
        pConnDB = pconnDB;
        
        comboBox = cmbox;
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

        nBCachedRowSet1.setCommand("select * from pb_operating_parameters WHERE main_service = '"+comboBox+"' order by service_type");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("pb_operating_parameters");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Revenue Codes");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("service_type", "Service type", true),
            new org.netbeans.lib.sql.models.TableModel.Column("main_service", "Main service", true),
            new org.netbeans.lib.sql.models.TableModel.Column("rate", "Rate", true),
            new org.netbeans.lib.sql.models.TableModel.Column("gl_account", "Gl account", false)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 508, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
      //  new RevenueCodes().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

