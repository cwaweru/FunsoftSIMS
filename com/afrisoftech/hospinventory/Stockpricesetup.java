/*
 * Generated by JDBC Form Wizard
 *
 * stockpricesetup.java
 *
 * Created on Nov 14, 2002, 12:30 PM
*/

package com.afrisoftech.hospinventory;

/**
 *
 * @author  root
 * @version 
 */

public class Stockpricesetup extends javax.swing.JFrame
{

    public Stockpricesetup()
    {
        initComponents();
    }

    private void initComponents() {//GEN-BEGIN:initComponents
        pooledConnectionSource1 = new org.netbeans.lib.sql.pool.PooledConnectionSource();
        try {
            nBCachedRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        dataNavigator1 = new org.netbeans.lib.sql.DataNavigator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        pooledConnectionSource1.setDatabase("jdbc:postgresql://localhost:5432/hospital");
        pooledConnectionSource1.setDriver("org.postgresql.Driver");
        pooledConnectionSource1.setPassword("02c58616714940a4d952145838f11544f6f5debbb79a6f52b88e22d6cb", true);
        pooledConnectionSource1.setUsername("postgres");
        nBCachedRowSet1.setCommand("select * from stock_price_setup");
        nBCachedRowSet1.setConnectionSource(pooledConnectionSource1);
        try {
            nBCachedRowSet1.setTableName("stock_price_setup");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Stock Price Setup Data");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("code", "Code", true),
            new org.netbeans.lib.sql.models.TableModel.Column("description", "Description", true),
            new org.netbeans.lib.sql.models.TableModel.Column("amount_limit", "Amount limit", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 400, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
        new Stockpricesetup().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.pool.PooledConnectionSource pooledConnectionSource1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

