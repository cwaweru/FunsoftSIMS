/*
 * StaffLoanProcessingIntfr.java
 *
 * Created on February 1, 2005, 6:24 PM
 */

package com.afrisoftech.hr;

/**
 *
 * @author  root
 */
public class ExternalInterviewersIntfr extends javax.swing.JInternalFrame {
    
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public ExternalInterviewersIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        mainPanel3 = new javax.swing.JPanel();
        labelPanel3 = new javax.swing.JPanel();
        imgPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        actionsPanel3 = new javax.swing.JPanel();
        newAction3 = new javax.swing.JButton();
        updateAction3 = new javax.swing.JButton();
        deleteAction3 = new javax.swing.JButton();
        clearAction3 = new javax.swing.JButton();
        spacerPanel3 = new javax.swing.JPanel();
        helpPanel3 = new javax.swing.JPanel();
        helpAction3 = new javax.swing.JButton();
        subMainPanel3 = new javax.swing.JPanel();
        dataPanel3 = new javax.swing.JPanel();
        firstAction3 = new javax.swing.JButton();
        previousAction3 = new javax.swing.JButton();
        nextAction2 = new javax.swing.JButton();
        lastAction3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("External Interviewers");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        mainPanel3.setLayout(new java.awt.GridBagLayout());

        labelPanel3.setLayout(new java.awt.GridBagLayout());

        labelPanel3.setBorder(new javax.swing.border.TitledBorder(""));
        imgPanel3.setLayout(new java.awt.GridBagLayout());

        imgPanel3.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_tracks.gif")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        imgPanel3.add(jLabel23, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel3.add(imgPanel3, gridBagConstraints);

        actionsPanel3.setLayout(new java.awt.GridBagLayout());

        actionsPanel3.setBorder(new javax.swing.border.TitledBorder("Actions"));
        newAction3.setMnemonic('w');
        newAction3.setText("New");
        newAction3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAction3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel3.add(newAction3, gridBagConstraints);

        updateAction3.setMnemonic('U');
        updateAction3.setText("Update");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel3.add(updateAction3, gridBagConstraints);

        deleteAction3.setMnemonic('D');
        deleteAction3.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel3.add(deleteAction3, gridBagConstraints);

        clearAction3.setMnemonic('C');
        clearAction3.setText("Clear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel3.add(clearAction3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        actionsPanel3.add(spacerPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        labelPanel3.add(actionsPanel3, gridBagConstraints);

        helpPanel3.setLayout(new java.awt.GridBagLayout());

        helpPanel3.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        helpAction3.setMnemonic('H');
        helpAction3.setText("Help");
        helpPanel3.add(helpAction3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel3.add(helpPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel3.add(labelPanel3, gridBagConstraints);

        subMainPanel3.setLayout(new java.awt.GridBagLayout());

        subMainPanel3.setBorder(new javax.swing.border.TitledBorder(""));
        dataPanel3.setLayout(new java.awt.GridBagLayout());

        dataPanel3.setBorder(new javax.swing.border.TitledBorder("Data navagation actions"));
        firstAction3.setMnemonic('F');
        firstAction3.setText("First");
        dataPanel3.add(firstAction3, new java.awt.GridBagConstraints());

        previousAction3.setMnemonic('P');
        previousAction3.setText("Previous");
        dataPanel3.add(previousAction3, new java.awt.GridBagConstraints());

        nextAction2.setMnemonic('N');
        nextAction2.setText("Next");
        dataPanel3.add(nextAction2, new java.awt.GridBagConstraints());

        lastAction3.setMnemonic('L');
        lastAction3.setText("Last");
        dataPanel3.add(lastAction3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel3.add(dataPanel3, gridBagConstraints);

        jPanel12.setLayout(new java.awt.GridBagLayout());

        jPanel12.setBorder(new javax.swing.border.TitledBorder(""));
        jScrollPane2.setBorder(new javax.swing.border.TitledBorder(null, "Enter Datails of External Interviewers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 11)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Title", "Institution", "Telephone", "Postal Address", "Remarks"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        subMainPanel3.add(jPanel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel3.add(subMainPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mainPanel3, gridBagConstraints);

        pack();
    }//GEN-END:initComponents

    private void newAction3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAction3ActionPerformed
   try {
            
            connectDB.setAutoCommit(false);
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into hr.hr_ext_interviewers (name,title,inst,tel,postal,remarks) values(?,?,?,?,?,?)");
            for (int i = 0; i < jTable1.getRowCount(); i++){
                if (jTable1.getModel().getValueAt(i,0) != null){
                    
                    pstmt.setString(1,jTable1.getValueAt(i,0).toString());
                    pstmt.setString(2,jTable1.getValueAt(i,1).toString());
                    pstmt.setObject(3,jTable1.getValueAt(i,2).toString());
                    pstmt.setString(4,jTable1.getValueAt(i,3).toString());
                    pstmt.setString(5,jTable1.getValueAt(i,4).toString());
                    pstmt.setString(6,jTable1.getValueAt(i,5).toString());
                   
                    
                    pstmt.executeUpdate();
                    connectDB.commit();
                    connectDB.setAutoCommit(true);
                    javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
            
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        }            // Add your handling code here:
    }//GEN-LAST:event_newAction3ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton lastAction3;
    private javax.swing.JPanel imgPanel3;
    private javax.swing.JPanel actionsPanel3;
    private javax.swing.JButton updateAction3;
    private javax.swing.JButton clearAction3;
    private javax.swing.JPanel spacerPanel3;
    private javax.swing.JButton helpAction3;
    private javax.swing.JButton firstAction3;
    private javax.swing.JButton deleteAction3;
    private javax.swing.JButton nextAction2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel dataPanel3;
    private javax.swing.JButton newAction3;
    private javax.swing.JButton previousAction3;
    private javax.swing.JPanel mainPanel3;
    private javax.swing.JPanel labelPanel3;
    private javax.swing.JPanel subMainPanel3;
    private javax.swing.JPanel helpPanel3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}