/*
 * Generated by JDBC Form Wizard
 *
 * TaxBracket.java
 *
 * Created on Aug 29, 2003, 10:54 AM
 */

package com.afrisoftech.hospayroll;

/**
 *
 * @author  root
 * @version
 */

public class TaxBracket extends javax.swing.JFrame {
    
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    java.lang.String comboBox = null;
    
    public TaxBracket(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB, java.lang.String cmbox) {
        
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

        nBCachedRowSet1.setCommand("select * from tax_bracket WHERE tax_type = '"+comboBox+"' order by tax_type");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("tax_bracket");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Tax Barcket");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("date", "Date", true),
            new org.netbeans.lib.sql.models.TableModel.Column("tax_type", "Tax type", true),
            new org.netbeans.lib.sql.models.TableModel.Column("effective_from", "Effective from", true),
            new org.netbeans.lib.sql.models.TableModel.Column("lower_limit", "Lower limit", true),
            new org.netbeans.lib.sql.models.TableModel.Column("upper_limit", "Upper limit", true),
            new org.netbeans.lib.sql.models.TableModel.Column("charge", "Charge", true),
            new org.netbeans.lib.sql.models.TableModel.Column("rate", "Rate", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 645, 300);
    }//GEN-END:initComponents
    
    public static void main(String[] args) {
        //       new TaxBracket().show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}

