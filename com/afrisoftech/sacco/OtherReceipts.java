/*
 * Generated by JDBC Form Wizard
 *
 * OtherReceipts.java
 *
 * Created on Jun 23, 2003, 09:39 AM
*/

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 * @version 
 */

public class OtherReceipts extends javax.swing.JFrame
{

      java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public OtherReceipts(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        nBCachedRowSet1.setCommand("select * from other_transactions");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("other_transactions");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Receipts");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("other_details", "Other details", true),
            new org.netbeans.lib.sql.models.TableModel.Column("description", "Description", true),
            new org.netbeans.lib.sql.models.TableModel.Column("name", "Name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("drawers_bank", "Drawers bank", true),
            new org.netbeans.lib.sql.models.TableModel.Column("activity_code", "Activity code", true),
            new org.netbeans.lib.sql.models.TableModel.Column("drawee", "Drawee", true),
            new org.netbeans.lib.sql.models.TableModel.Column("gl_code", "Gl code", true),
            new org.netbeans.lib.sql.models.TableModel.Column("bank_acc-no", "Bank acc-no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("cheque_no", "Cheque no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("bank", "Bank", true),
            new org.netbeans.lib.sql.models.TableModel.Column("bank_branch", "Bank branch", true),
            new org.netbeans.lib.sql.models.TableModel.Column("credit", "Credit", true),
            new org.netbeans.lib.sql.models.TableModel.Column("date", "Date", true),
            new org.netbeans.lib.sql.models.TableModel.Column("receipt_no", "Receipt no", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 700, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
      //  new OtherReceipts().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

