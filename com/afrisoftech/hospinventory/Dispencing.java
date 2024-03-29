/*
 * Generated by JDBC Form Wizard
 *
 * Dispencing.java
 *
 * Created on Oct 23, 2003, 07:07 PM
*/

package com.afrisoftech.hospinventory;

/**
 *
 * @author  root
 * @version 
 */

public class Dispencing extends javax.swing.JFrame
{

    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public Dispencing(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        nBCachedRowSet1.setCommand("select * from hp_pharmacy where date_prescribed = current_date order by description");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("hp_pharmacy");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Dispencing");
        try {
            dataNavigator1.setLayoutButtons(1);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("prescription_no", "Prescription no", false),
            new org.netbeans.lib.sql.models.TableModel.Column("patient_name", "Patient name", false),
            new org.netbeans.lib.sql.models.TableModel.Column("description", "Description", false),
            new org.netbeans.lib.sql.models.TableModel.Column("units", "Units", false),
            new org.netbeans.lib.sql.models.TableModel.Column("quantity", "Quantity", false),
            new org.netbeans.lib.sql.models.TableModel.Column("price", "Price", false),
            new org.netbeans.lib.sql.models.TableModel.Column("amount", "Amount", false),
            new org.netbeans.lib.sql.models.TableModel.Column("doctor", "Doctor", false)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(565, 300));
        setLocation((screenSize.width-565)/2,(screenSize.height-300)/2);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
      //  new Dispencing().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

