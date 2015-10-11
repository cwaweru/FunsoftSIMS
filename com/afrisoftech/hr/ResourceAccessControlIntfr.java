/*
 * PolicyAdministrationIntfr.java
 *
 * Created on January 27, 2005, 4:07 PM
 */

package com.afrisoftech.hr;

/**
 *
 * @author  Administrator
 */
public class ResourceAccessControlIntfr extends javax.swing.JInternalFrame {
    
   java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public ResourceAccessControlIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
        connectDB = connDb;
        
        pConnDB = pconnDB;
        
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
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
        try {
            nBCachedRowSet3 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet4 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet5 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        mainpanel = new javax.swing.JPanel();
        datapanel02 = new javax.swing.JPanel();
        insertbtm = new javax.swing.JButton();
        selectbtm = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        editpanel2 = new javax.swing.JPanel();
        newbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        helppanel2 = new javax.swing.JPanel();
        helpbtn = new javax.swing.JButton();
        fieldspanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField411 = new javax.swing.JTextField();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel211 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel212 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel511 = new javax.swing.JLabel();

        nBCachedRowSet1.setCommand("select DISTINCT UPPER (res_code) as res_code FROM hr.hr_resource_acctype ORDER BY res_code");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        nBCachedRowSet2.setCommand("select DISTINCT UPPER (res_name) as res_name FROM hr.hr_resource_acctype ORDER BY res_name");
        nBCachedRowSet2.setConnectionSource(pConnDB);
        nBCachedRowSet3.setCommand("select DISTINCT UPPER (department_name) as name FROM hr.hr_department ORDER BY name");
        nBCachedRowSet3.setConnectionSource(pConnDB);
        nBCachedRowSet4.setCommand("nBCachedRowSet4: section");
        nBCachedRowSet4.setConnectionSource(pConnDB);
        nBCachedRowSet5.setCommand("select DISTINCT UPPER (station_name) as station FROM hr.hr_duty_stations ORDER BY station");
        nBCachedRowSet5.setConnectionSource(pConnDB);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("RESOURCE ACCESS CONTROL");
        setVisible(true);
        mainpanel.setLayout(new java.awt.GridBagLayout());

        mainpanel.setBorder(new javax.swing.border.TitledBorder(""));
        datapanel02.setLayout(new java.awt.GridBagLayout());

        datapanel02.setBorder(new javax.swing.border.MatteBorder(null));
        insertbtm.setText("Insert");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datapanel02.add(insertbtm, gridBagConstraints);

        selectbtm.setText("Select");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datapanel02.add(selectbtm, gridBagConstraints);

        deletebtn.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datapanel02.add(deletebtn, gridBagConstraints);

        updatebtn.setText("Update");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datapanel02.add(updatebtn, gridBagConstraints);

        closebtn.setText("Close");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datapanel02.add(closebtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 0);
        mainpanel.add(datapanel02, gridBagConstraints);

        editpanel2.setLayout(new java.awt.GridBagLayout());

        editpanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        newbtn.setText("New");
        newbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbtnActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        editpanel2.add(newbtn, gridBagConstraints);

        cancelbtn.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        editpanel2.add(cancelbtn, gridBagConstraints);

        editbtn.setText("Edit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        editpanel2.add(editbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        mainpanel.add(editpanel2, gridBagConstraints);

        helppanel2.setLayout(new java.awt.GridBagLayout());

        helppanel2.setBorder(new javax.swing.border.TitledBorder(""));
        helpbtn.setText("Help");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        helppanel2.add(helpbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        mainpanel.add(helppanel2, gridBagConstraints);

        fieldspanel11.setLayout(new java.awt.GridBagLayout());

        fieldspanel11.setBorder(new javax.swing.border.TitledBorder("Enter the Required Details"));
        jLabel12.setText("Resource Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jLabel12, gridBagConstraints);

        jLabel21.setText("Duty Station");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jLabel21, gridBagConstraints);

        jLabel51.setText("In force");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jLabel51, gridBagConstraints);

        jLabel91.setText("Resource ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jLabel91, gridBagConstraints);

        jLabel111.setText("Begin Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        fieldspanel11.add(jLabel111, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jTextField41, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet5, "station", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jComboBox1, gridBagConstraints);

        jComboBox2.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet1, "res_code", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jComboBox2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jCheckBox1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jTextField411, gridBagConstraints);

        jComboBox11.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet2, "res_name", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jComboBox11, gridBagConstraints);

        jComboBox12.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet4, "section", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jComboBox12, gridBagConstraints);

        jLabel211.setText("Section");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jLabel211, gridBagConstraints);

        jComboBox13.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet3, "name", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jComboBox13, gridBagConstraints);

        jLabel212.setText("Department");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jLabel212, gridBagConstraints);

        jScrollPane1.setViewportBorder(new javax.swing.border.TitledBorder("Remarks/Comments"));
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 83;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        fieldspanel11.add(jScrollPane1, gridBagConstraints);

        jLabel511.setText("Expiry Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldspanel11.add(jLabel511, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 0);
        mainpanel.add(fieldspanel11, gridBagConstraints);

        getContentPane().add(mainpanel, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 498, 412);
    }//GEN-END:initComponents

    private void newbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbtnActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_newbtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel21;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JButton selectbtm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel511;
    private javax.swing.JTextField jTextField411;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet2;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JButton insertbtm;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet5;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel fieldspanel11;
    private javax.swing.JPanel datapanel02;
    private javax.swing.JComboBox jComboBox11;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet4;
    private javax.swing.JButton helpbtn;
    private javax.swing.JButton newbtn;
    private javax.swing.JPanel editpanel2;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel111;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet3;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton editbtn;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JButton cancelbtn;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JButton closebtn;
    private javax.swing.JPanel helppanel2;
    // End of variables declaration//GEN-END:variables
    
}
