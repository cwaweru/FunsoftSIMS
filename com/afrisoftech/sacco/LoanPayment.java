/*
 * Generated by JDBC Form Wizard
 *
 * LoanPayment.java
 *
 * Created on Jun 22, 2003, 08:03 PM
*/

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 * @version 
 */

public class LoanPayment extends javax.swing.JFrame
{

     java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
        javax.swing.JSpinner beginDateSpinner = null;
    
      javax.swing.JSpinner endDateSpinner = null;

      public LoanPayment(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        nBCachedRowSet1.setCommand("select * from loan_transactions");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("loan_transactions");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Loan Disbursment");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("date", "Date", true),
            new org.netbeans.lib.sql.models.TableModel.Column("loan_account_no", "Loan account no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("member_name", "Member name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("member_no", "Member no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("loan_purpose", "Loan purpose", true),
            new org.netbeans.lib.sql.models.TableModel.Column("cheque_no", "Cheque no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("voucher_no", "Voucher no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("payee", "Payee", true),
            new org.netbeans.lib.sql.models.TableModel.Column("bank_account_no", "Bank account no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("bank_name", "Bank name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("bank_branch", "Bank branch", true),
            new org.netbeans.lib.sql.models.TableModel.Column("debit", "Debit", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 800, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
  //      new LoanPayment().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

