/*
 * Generated by JDBC Form Wizard
 *
 * Lapplication.java
 *
 * Created on Jun 21, 2003, 08:10 AM
*/

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 * @version 
 */

public class Lapplication extends javax.swing.JFrame
{
    private  javax.swing.JComboBox cmbox = new javax.swing.JComboBox();
  javax.swing.JComboBox cmbox2 =null;
      java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public Lapplication(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        nBCachedRowSet1.setCommand("select * from loan_application");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("loan_application");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Personal Details");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("date", "Date", true),
            new org.netbeans.lib.sql.models.TableModel.Column("loan_account_no", "Loan account no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("member_no", "Member no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("member_name", "Member name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("monthly_income", "Monthly income", true),
            new org.netbeans.lib.sql.models.TableModel.Column("monthly_expenditure", "Monthly expenditure", true),
            new org.netbeans.lib.sql.models.TableModel.Column("position_in_sacco", "Position in sacco", true),
            new org.netbeans.lib.sql.models.TableModel.Column("workstation", "Workstation", true),
            new org.netbeans.lib.sql.models.TableModel.Column("birth_date", "Birth date", true),
            new org.netbeans.lib.sql.models.TableModel.Column("department", "Department", true),
            new org.netbeans.lib.sql.models.TableModel.Column("service_terms", "Service terms", true),
            new org.netbeans.lib.sql.models.TableModel.Column("applicant_shares", "Applicant shares", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 900, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
//        new Lapplication().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
