/*
 * Generated by JDBC Form Wizard
 *
 * distr.java
 *
 * Created on Aug 15, 2002, 02:07 PM
*/

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 * @version 
 */

public class Distr extends javax.swing.JFrame
{

          java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public Distr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        nBCachedRowSet1.setCommand("select * from district");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        nBCachedRowSet1.setReadOnly(true);
        try {
            nBCachedRowSet1.setTableName("district");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("District Data");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("code", "Code", false),
            new org.netbeans.lib.sql.models.TableModel.Column("district", "District", false)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 400, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
      //  new distr().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    // End of variables declaration//GEN-END:variables

}

