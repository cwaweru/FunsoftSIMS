/*
 * Generated by JDBC Form Wizard
 *
 * memberdetails.java
 *
 * Created on May 19, 2003, 12:01 AM
*/

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 * @version 
 */

public class MemberDetails extends javax.swing.JFrame
{
  java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public MemberDetails(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        nBCachedRowSet1.setCommand("select * from member");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("member");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }

        setTitle("Members");
        try {
            dataNavigator1.setLayoutButtons(1);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("m_number", "M number", true),
            new org.netbeans.lib.sql.models.TableModel.Column("first_name", "First name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("middle_name", "Middle name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("last_name", "Last name", true),
            new org.netbeans.lib.sql.models.TableModel.Column("suffix", "Suffix", true),
            new org.netbeans.lib.sql.models.TableModel.Column("employer", "Employer", true),
            new org.netbeans.lib.sql.models.TableModel.Column("official_designation", "Designation", true),
            new org.netbeans.lib.sql.models.TableModel.Column("payroll_no", "Payroll no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("id_no", "Id no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("department", "KNUT Division", true),
            new org.netbeans.lib.sql.models.TableModel.Column("workstation", "KNUT Zone", true),
            new org.netbeans.lib.sql.models.TableModel.Column("termsof_service", "Terms", true),
            new org.netbeans.lib.sql.models.TableModel.Column("previous _emp", "Prev  emp", true),
            new org.netbeans.lib.sql.models.TableModel.Column("previous_sacco", "Prev sacco", true),
            new org.netbeans.lib.sql.models.TableModel.Column("birth_date", "Birth date", true)
        }));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 900, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
     //   new memberdetails().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
