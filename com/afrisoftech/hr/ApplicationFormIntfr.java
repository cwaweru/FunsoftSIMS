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
public class ApplicationFormIntfr extends javax.swing.JInternalFrame {
    
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public ApplicationFormIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        jLabel31 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBox1121 = new javax.swing.JComboBox();
        datePicker23 = new com.afrisoftech.lib.DatePicker();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("APPLICATION FORM");
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
        jLabel31.setText("Applicant ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel31, gridBagConstraints);

        jLabel41.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel41, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jComboBox1121, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel12.add(datePicker23, gridBagConstraints);

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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1121;
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
    private com.afrisoftech.lib.DatePicker datePicker23;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel dataPanel3;
    private javax.swing.JButton newAction3;
    private javax.swing.JButton previousAction3;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel mainPanel3;
    private javax.swing.JPanel labelPanel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel subMainPanel3;
    private javax.swing.JPanel helpPanel3;
    // End of variables declaration//GEN-END:variables
    
}
