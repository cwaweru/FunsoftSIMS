/*
 * Generated by JDBC Form Wizard
 *
 * membershipdtls.java
 *
 * Created on Dec 10, 2002, 10:47 AM
*/

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 * @version 
 */

public class MembershipDtls extends javax.swing.JFrame
{

    
       java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public MembershipDtls(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
        connectDB = connDb;
        
        pConnDB = pconnDB;
        
        initComponents();
    }   
   
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        try {
            nBCachedRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        pooledConnectionSource1 = new org.netbeans.lib.sql.pool.PooledConnectionSource();
        dataNavigator1 = new org.netbeans.lib.sql.DataNavigator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        nBCachedRowSet1.setCommand("select * from member");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        nBCachedRowSet1.setReadOnly(true);
        try {
            nBCachedRowSet1.setTableName("member");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        nBCachedRowSet2.setCommand("select * from member");
        nBCachedRowSet2.setConnectionSource(pooledConnectionSource1);
        pooledConnectionSource1.setDatabase("jdbc:postgresql://localhost:5432/sacco");
        pooledConnectionSource1.setDriver("org.postgresql.Driver");
        pooledConnectionSource1.setPassword("029dd3e3e93a0152df33501a61a3dff50f362c407a77126296a7cc4b0135bf4f320d", true);
        pooledConnectionSource1.setUsername("postgres");

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setTitle("Membership Details");
        dataNavigator1.setRowSet(nBCachedRowSet1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 290;
        getContentPane().add(dataNavigator1, gridBagConstraints);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("m_number", "M number", true),
            new org.netbeans.lib.sql.models.TableModel.Column("application_date", "Application date", true),
            new org.netbeans.lib.sql.models.TableModel.Column("admission_date", "Admission date", true),
            new org.netbeans.lib.sql.models.TableModel.Column("minutes_no", "Minutes no", true),
            new org.netbeans.lib.sql.models.TableModel.Column("membership_type", "Membership type", true),
            new org.netbeans.lib.sql.models.TableModel.Column("first_deduction_due", "First deduction due", true),
            new org.netbeans.lib.sql.models.TableModel.Column("date_min_approved", "Date min approved", true)
        }));
        jTable1.setPreferredScrollableViewportSize(new java.awt.Dimension(700, 400));
        jTable1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jTable1.setSelectionModel(new org.netbeans.lib.sql.models.SQLListSelectionModel (nBCachedRowSet1));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = -157;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        setBounds(0, 0, 800, 300);
    }//GEN-END:initComponents

    public static void main(String[] args)
    {
 //       new membershipdtls().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet2;
    private org.netbeans.lib.sql.pool.PooledConnectionSource pooledConnectionSource1;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
