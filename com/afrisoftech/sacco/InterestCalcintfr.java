/*
 * workstationintfr.java
 *
 * Created on August 14, 2002, 1:52 PM
 */

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 */
public class InterestCalcintfr extends javax.swing.JInternalFrame {
    
    /** Creates new form workstationintfr */
      java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public InterestCalcintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
            crset1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        crset1.setCommand("SELECT date('now')");
        crset1.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Interest Calculation");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ColorPreview.gif")));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
        jButton1.setMnemonic('O');
        jButton1.setText("Ok");
        jButton1.setToolTipText("Click here to enter data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14755_.GIF")));
        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click here to close window");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel3, gridBagConstraints);

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "date", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jComboBox1, gridBagConstraints);

        setBounds(0, 0, 474, 310);
    }//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     setVisible(false);        // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        try {
           //ava.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("INSERT INTO loan_transactions (loan_account_no,member_no,member_name,loan_purpose,cheque_no,voucher_no, "+
            "drawer,payee,bank_account_no,bank_name,bank_branch,principal,monthly_repayment,interest,principal_paid,interest_paid,debit,credit,contra_account,reason,gl_code,"+
            "activity_code) SELECT loan_account_no,member_no,member_name,loan_purpose,'','','','','','','',0,0, SUM(loan_transactions.principal - loan_transactions.principal_paid) * "+
            "(SELECT ('1'::numeric / approved_loans.loan_period) FROM approved_loans WHERE (approved_loans.loan_acc_no = loan_transactions.loan_account_no)) * (SELECT (commissions.rate / "+
            "'100'::numeric) FROM commissions WHERE (commissions.type = loan_transactions.loan_purpose)) ::numeric,0,0,0,0,'','','','' FROM loan_transactions GROUP BY "+
            "loan_transactions.loan_account_no,loan_transactions.member_no,loan_transactions.member_name,loan_transactions.loan_purpose");
           pstmt.executeUpdate();
            jLabel3.setForeground(java.awt.Color.blue);
            jLabel3.setText("Insert successful");
        }   catch(java.sql.SQLException sq){
             javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            System.out.println(sq.getMessage());
            jLabel3.setForeground(java.awt.Color.red);
            jLabel3.setText("Sorry. Another Workstation Code already exists");
            }  // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       // Add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    // End of variables declaration//GEN-END:variables
    
}
