/*
 * loanpymntintfr.java
 *
 * Created on August 13, 2002, 1:09 PM
 */

package com.afrisoftech.accounting;

/**
 *
 * @author  root
 */
public class PettyCashRefundIntfr extends javax.swing.JInternalFrame {
    
    /** Creates new form loanpymntintfr */
    
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public PettyCashRefundIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        try {
            crset2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            crset21 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            java.lang.Class.forName("org.postgresql.Driver");
        }catch (java.lang.ClassNotFoundException sl){
            System.out.println(sl.getMessage());
        }

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox131 = new javax.swing.JComboBox();
        jLabel531 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        crset1.setCommand("select distinct requisitioner from ac_petty_cash WHERE paid = true AND approved = true ORDER BY requisitioner  ");
        crset1.setConnectionSource(pConnDB);
        crset2.setCommand("select bank_account_no from ac_banks_setup");
        crset2.setConnectionSource(pConnDB);
        crset21.setCommand("select distinct payment_code from ac_cash_points ORDER BY payment_code");
        crset21.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Petty Cash Adjustments\n");
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
        jButton1.setToolTipText("Click here enter data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton2.setMnemonic('E');
        jButton2.setText("Edit");
        jButton2.setToolTipText("Click here to edit data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif")));
        jButton3.setMnemonic('l');
        jButton3.setText("Clear");
        jButton3.setToolTipText("Click here to clear textfields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14755_.GIF")));
        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click here to close window");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel7, gridBagConstraints);

        jTextField6.setEditable(false);
        jTextField6.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField6.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextField6, gridBagConstraints);

        jTextField7.setEditable(false);
        jTextField7.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextField7, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder("Select payee details"));
        jLabel9.setText("Reason");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel9, gridBagConstraints);

        jComboBox131.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "requisitioner", null, null, null));
        jComboBox131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox131ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jComboBox131, gridBagConstraints);

        jLabel531.setText("Payment Details");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel531, gridBagConstraints);

        jTextField31.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jTextField31, gridBagConstraints);

        jLabel2.setText("Voucher No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jTextField11.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField11, gridBagConstraints);

        jLabel53.setText("Amount KSHs.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel53, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jTextField3, gridBagConstraints);

        jLabel6.setText("Requisitioner");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField4, gridBagConstraints);

        jLabel4.setText("Department");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel4, gridBagConstraints);

        jTextField32.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jTextField32, gridBagConstraints);

        jScrollPane1.setBorder(new javax.swing.border.TitledBorder("Supporting Document"));
        jScrollPane1.setViewportView(jTextPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jTextField8.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField8.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jTextField8, gridBagConstraints);

        jButton5.setMnemonic('h');
        jButton5.setText("Help");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton5, gridBagConstraints);

        setBounds(0, 0, 697, 390);
    }//GEN-END:initComponents
    
    private void jComboBox131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox131ActionPerformed
        jLabel7.setText("");
        jButton1.setEnabled(true);
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select credit,description,voucher_no,department from ac_petty_cash where requisitioner ='"+jComboBox131.getSelectedItem()+"'");
            while (rset.next()){
                
                jTextField3.setText(rset.getObject(1).toString());
                jTextField31.setText(rset.getObject(2).toString());
                jTextField11.setText(rset.getObject(3).toString());
                jTextField32.setText(rset.getObject(4).toString());
            }
        } catch (java.sql.SQLException sqe) {
            sqe.printStackTrace();
            //  System.out.println("Insert not successful");
        }   // Add your handling code here:
    }//GEN-LAST:event_jComboBox131ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);   // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jTextField3.setText("");
        jTextField11.setText("");
        jTextField31.setText("");
        
        this.jComboBox131.setSelectedItem(null);
        // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //   javax.swing.JFrame other = new OtherPayments(connectDB, pConnDB);
        //   other.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql.toString());
        
        String glAcc = null;
        String Activity = null;
        String usern = null;
        String transNo = null;
        String user = null;
        
        try {
            
            java.sql.Statement stm121 = connectDB.createStatement();
            java.sql.ResultSet rse121 = stm121.executeQuery("select activity_code,activity,current_user from ac_petty_cash");
            while (rse121.next())
                glAcc = rse121.getObject(1).toString();
            Activity = rse121.getObject(2).toString();
            usern = rse121.getObject(3).toString();
            
            java.sql.Statement stm1 = connectDB.createStatement();
            java.sql.ResultSet rse1 = stm1.executeQuery("select nextval('transaction_no_seq')");
            while (rse1.next())
                transNo = rse1.getObject(1).toString();
            
            java.sql.PreparedStatement pstmt21 = connectDB.prepareStatement("insert into ac_petty_cash values(?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?)");
            
            pstmt21.setString(1,glAcc);
            pstmt21.setString(2,Activity);
            pstmt21.setString(4,jTextField31.getText());
            pstmt21.setString(3,"");
            pstmt21.setString(5,jTextField3.getText());
            pstmt21.setString(6,"00");
            pstmt21.setDate(7,null);;
            pstmt21.setString(8,usern);
            pstmt21.setString(9,"true");
            pstmt21.setDate(11,datenowSql);
            pstmt21.setString(10,jTextField11.getText());
            pstmt21.setString(12,"true");
            pstmt21.setString(13,jTextField32.getText());
            pstmt21.setString(14,jComboBox131.getSelectedItem().toString());
            pstmt21.setString(15,"");
            pstmt21.setString(16,jTextPane1.getText());
            pstmt21.setString(17,transNo);
            pstmt21.executeUpdate();
            
            java.sql.PreparedStatement pstmt8121 = connectDB.prepareStatement("UPDATE pb_activity SET ytd_debit = ytd_debit + '"+jTextField3.getText()+"',mtd_debit = mtd_debit + '"+jTextField3.getText()+"' where code = '"+glAcc+"'");
            pstmt8121.executeUpdate();
            
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into ac_accounts_payable values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)");
            pstmt.setObject(1,glAcc);
            pstmt.setString(2,jComboBox131.getSelectedItem().toString());
            pstmt.setObject(3,jTextField31.getText());
            pstmt.setString(4,jTextField11.getText());
            pstmt.setString(5,jComboBox131.getSelectedItem().toString());
            pstmt.setString(6,jTextField4.getText());
            pstmt.setString(7,"");
            pstmt.setString(8,"");
            pstmt.setString(9,"");
            pstmt.setString(10,"");
            pstmt.setString(11,transNo);
            pstmt.setString(12,"Payment");
            pstmt.setString(14,jTextField3.getText());
            pstmt.setObject(13,"00");
            pstmt.setString(15,"'now'");
            pstmt.setObject(16,"00");
            pstmt.setString(17,"Petty Cash");
            pstmt.setBoolean(18,true);
            pstmt.setBoolean(19,true);
            pstmt.setString(20,usern);
            pstmt.executeUpdate();
            
            java.sql.PreparedStatement pstmt812 = connectDB.prepareStatement("UPDATE pb_activity SET ytd_credit = ytd_credit + '"+jTextField3.getText()+"', mtd_credit = mtd_credit + '"+jTextField3.getText()+"' where code = '"+glAcc+"'");
            pstmt812.executeUpdate();
            
            crset1.execute();
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(sq.getMessage());
        }
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField jTextField7;
    private org.netbeans.lib.sql.NBCachedRowSet crset21;
    private javax.swing.JTextField jTextField3;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JComboBox jComboBox131;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jLabel531;
    // End of variables declaration//GEN-END:variables
    
}
