/*
 * Generated by JDBC Form Wizard
 *
 * Wards.java
 *
 * Created on Sep 04, 2003, 02:52 PM
*/

package com.afrisoftech.hospital;

/**
 *
 * @author  root
 * @version 
 */

public class Wards extends javax.swing.JFrame
{

    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public Wards(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        nBCachedRowSet1.setCommand("select * from hp_wards order by ward_name");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("hp_wards");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Wards");
        try {
            dataNavigator1.setLayoutButtons(1);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("ward_code", "Ward code", true),
            new org.netbeans.lib.sql.models.TableModel.Column("ward_name", "Ward name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("max_beds", "Max beds", true),
            new org.netbeans.lib.sql.models.TableModel.Column("department", "Department", true),
            new org.netbeans.lib.sql.models.TableModel.Column("wing", "Wing", true),
            new org.netbeans.lib.sql.models.TableModel.Column("deposit", "Deposit", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 528, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
      //  new Wards().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

