/*
 * DefaultInternalFrame.java
 *
 * Created on May 31, 2004, 1:53 PM
 */

package com.afrisoftech.hr;

/**
 *
 * @author  postgres
 */
public class CountryIntfr extends javax.swing.JInternalFrame {
    
    java.sql.Connection connectDB = null;
    
    javax.swing.table.TableModel tableModel = null;
    
    javax.swing.JSpinner beginDateSpinner = null;
    
    javax.swing.JSpinner endDateSpinner = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    /** Creates new form DefaultInternalFrame */
    public CountryIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        mainPanel = new javax.swing.JPanel();
        labelPanel = new javax.swing.JPanel();
        imgPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        actionsPanel = new javax.swing.JPanel();
        newAction = new javax.swing.JButton();
        updateAction = new javax.swing.JButton();
        deleteAction = new javax.swing.JButton();
        clearAction = new javax.swing.JButton();
        spacerPanel = new javax.swing.JPanel();
        helpPanel = new javax.swing.JPanel();
        helpAction = new javax.swing.JButton();
        subMainPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldsPanel = new javax.swing.JPanel();
        countryidLbl = new javax.swing.JLabel();
        countryidTxt = new javax.swing.JTextField();
        countrynameLbl = new javax.swing.JLabel();
        countrynameTxt = new javax.swing.JTextField();
        continentLbl = new javax.swing.JLabel();
        continentCbx = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        dataPanel = new javax.swing.JPanel();
        firstAction = new javax.swing.JButton();
        previousAction = new javax.swing.JButton();
        nextAction = new javax.swing.JButton();
        lastAction = new javax.swing.JButton();

        nBCachedRowSet1.setCommand("select DISTINCT continent_name from hr.hr_continent");
        nBCachedRowSet1.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Country");
        setVisible(true);
        mainPanel.setLayout(new java.awt.GridBagLayout());

        labelPanel.setLayout(new java.awt.GridBagLayout());

        labelPanel.setBorder(new javax.swing.border.TitledBorder(""));
        imgPanel.setLayout(new java.awt.GridBagLayout());

        imgPanel.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_tracks.gif")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        imgPanel.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel.add(imgPanel, gridBagConstraints);

        actionsPanel.setLayout(new java.awt.GridBagLayout());

        actionsPanel.setBorder(new javax.swing.border.TitledBorder("Actions"));
        newAction.setMnemonic('w');
        newAction.setText("New");
        newAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newActionActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel.add(newAction, gridBagConstraints);

        updateAction.setMnemonic('U');
        updateAction.setText("Update");
        updateAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel.add(updateAction, gridBagConstraints);

        deleteAction.setMnemonic('D');
        deleteAction.setText("Delete");
        deleteAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel.add(deleteAction, gridBagConstraints);

        clearAction.setMnemonic('C');
        clearAction.setText("Clear");
        clearAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel.add(clearAction, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        actionsPanel.add(spacerPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        labelPanel.add(actionsPanel, gridBagConstraints);

        helpPanel.setLayout(new java.awt.GridBagLayout());

        helpPanel.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        helpAction.setMnemonic('H');
        helpAction.setText("Help");
        helpAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionActionPerformed(evt);
            }
        });

        helpPanel.add(helpAction, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel.add(helpPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(labelPanel, gridBagConstraints);

        subMainPanel.setLayout(new java.awt.GridBagLayout());

        subMainPanel.setBorder(new javax.swing.border.TitledBorder(""));
        buttonPanel.setLayout(new java.awt.GridBagLayout());

        buttonPanel.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel1.setText("Please register your country here");
        buttonPanel.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel.add(buttonPanel, gridBagConstraints);

        fieldsPanel.setLayout(new java.awt.GridBagLayout());

        fieldsPanel.setBorder(new javax.swing.border.TitledBorder("Data manipulation utility"));
        countryidLbl.setText("Country ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel.add(countryidLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        fieldsPanel.add(countryidTxt, gridBagConstraints);

        countrynameLbl.setText("Country Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel.add(countrynameLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        fieldsPanel.add(countrynameTxt, gridBagConstraints);

        continentLbl.setText("Continent");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel.add(continentLbl, gridBagConstraints);

        continentCbx.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet1, "continent_name", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel.add(continentCbx, gridBagConstraints);

        jLabel3.setText("Citizenship");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 20.0;
        subMainPanel.add(fieldsPanel, gridBagConstraints);

        dataPanel.setLayout(new java.awt.GridBagLayout());

        dataPanel.setBorder(new javax.swing.border.TitledBorder("Data navagation actions"));
        firstAction.setMnemonic('F');
        firstAction.setText("First");
        firstAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionActionPerformed(evt);
            }
        });

        dataPanel.add(firstAction, new java.awt.GridBagConstraints());

        previousAction.setMnemonic('P');
        previousAction.setText("Previous");
        previousAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionActionPerformed(evt);
            }
        });

        dataPanel.add(previousAction, new java.awt.GridBagConstraints());

        nextAction.setMnemonic('N');
        nextAction.setText("Next");
        nextAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionActionPerformed(evt);
            }
        });

        dataPanel.add(nextAction, new java.awt.GridBagConstraints());

        lastAction.setMnemonic('L');
        lastAction.setText("Last");
        lastAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionActionPerformed(evt);
            }
        });

        dataPanel.add(lastAction, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel.add(dataPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(subMainPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mainPanel, gridBagConstraints);

        setBounds(0, 0, 633, 300);
    }//GEN-END:initComponents
    
    private void helpActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpActionActionPerformed
    
    private void clearActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionActionPerformed
    
    private void deleteActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionActionPerformed
    
    private void updateActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionActionPerformed
    
    private void newActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newActionActionPerformed
      try {
            
            connectDB.setAutoCommit(false);
            
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into hr.hr_country (country_id,country_name,citizen,continet) values(?,upper(?),upper(?),?)");
            pstmt.setObject(1,countryidTxt.getText());
            pstmt.setObject(2,countrynameTxt.getText());
            pstmt.setObject(3,jTextField1.getText());
            pstmt.setObject(4,continentCbx.getSelectedItem().toString());
           
            pstmt.executeUpdate();
            connectDB.commit();
            connectDB.setAutoCommit(true);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
  
            
   
}   catch(java.sql.SQLException sq){
    javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
    try {
        connectDB.rollback();
    }catch (java.sql.SQLException sql){
        javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
    }
   
}   // TODO add your handling code here:
    }//GEN-LAST:event_newActionActionPerformed
    
    private void lastActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastActionActionPerformed
    
    private void nextActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionActionPerformed
    
    private void previousActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previousActionActionPerformed
    
    private void firstActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstActionActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton nextAction;
    private javax.swing.JTextField countryidTxt;
    private javax.swing.JTextField countrynameTxt;
    private javax.swing.JLabel countryidLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton clearAction;
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel spacerPanel;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JButton firstAction;
    private javax.swing.JButton newAction;
    private javax.swing.JLabel continentLbl;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton updateAction;
    private javax.swing.JButton previousAction;
    private javax.swing.JPanel helpPanel;
    private javax.swing.JPanel subMainPanel;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JButton deleteAction;
    private javax.swing.JButton lastAction;
    private javax.swing.JComboBox continentCbx;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel labelPanel;
    private javax.swing.JLabel countrynameLbl;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton helpAction;
    // End of variables declaration//GEN-END:variables
    
}