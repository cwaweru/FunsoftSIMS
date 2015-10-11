/*
 * Generated by JDBC Form Wizard
 *
 * Doctors.java
 *
 * Created on Sep 10, 2003, 11:10 AM
*/

package com.afrisoftech.hospital;

/**
 *
 * @author  root
 * @version 
 */

public class Doctors extends javax.swing.JFrame
{

    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public Doctors(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        dataNavigator1 = new org.netbeans.lib.sql.DataNavigator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();

        nBCachedRowSet1.setCommand("select * from pb_doctors_list order by staff_no");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        try {
            nBCachedRowSet1.setTableName("pb_doctors_list");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        nBCachedRowSet1.addInsertRowListener(new org.netbeans.lib.sql.InsertRowListener() {
            public void rowInserted(javax.sql.RowSetEvent evt) {
                nBCachedRowSet1RowInserted(evt);
            }
        });

        setTitle("Doctors");
        try {
            dataNavigator1.setLayoutButtons(1);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        dataNavigator1.setRowSet(nBCachedRowSet1);
        getContentPane().add(dataNavigator1, java.awt.BorderLayout.SOUTH);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel1.setText("Staff no");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel1, gridBagConstraints);

        jTextField1.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "staff_no"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jTextField1, gridBagConstraints);

        jLabel2.setText("First name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel2, gridBagConstraints);

        jTextField2.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "first_name"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jTextField2, gridBagConstraints);

        jLabel3.setText("Middle name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel3, gridBagConstraints);

        jTextField3.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "middle_name"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jTextField3, gridBagConstraints);

        jLabel4.setText("Last name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel4, gridBagConstraints);

        jTextField4.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "last_name"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jTextField4, gridBagConstraints);

        jLabel5.setText("Specialisation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel5, gridBagConstraints);

        jTextField5.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "specialisation"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jTextField5, gridBagConstraints);

        jLabel6.setText("Profession regno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel6, gridBagConstraints);

        jTextField6.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "profession_regno"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jTextField6, gridBagConstraints);

        jLabel7.setText("Id no");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel7, gridBagConstraints);

        jTextField7.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "id_no"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jTextField7, gridBagConstraints);

        jLabel8.setText("Estate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel8, gridBagConstraints);

        jTextField8.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "estate"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField8, gridBagConstraints);

        jLabel9.setText("House no");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel9, gridBagConstraints);

        jTextField9.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "house_no"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField9, gridBagConstraints);

        jLabel10.setText("Tel no");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel10, gridBagConstraints);

        jTextField10.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "tel_no"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField10, gridBagConstraints);

        jLabel11.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel11, gridBagConstraints);

        jTextField11.setDocument(new org.netbeans.lib.sql.models.TextDocument (nBCachedRowSet1, "sex"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField11, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 552, 300);
    }//GEN-END:initComponents

    private void nBCachedRowSet1RowInserted(javax.sql.RowSetEvent evt)//GEN-FIRST:event_nBCachedRowSet1RowInserted
    {
        // Add your handling code here:
    }//GEN-LAST:event_nBCachedRowSet1RowInserted

    public static void main(String[] args)
    {
       // new Doctors().show();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jLabel4;
    private org.netbeans.lib.sql.DataNavigator dataNavigator1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
