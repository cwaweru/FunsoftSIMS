/*
 * loanpymntintfr.java
 *
 * Created on August 13, 2002, 1:09 PM
 */

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 */
public class OtherRecptintfr extends javax.swing.JInternalFrame {
    
    /** Creates new form loanpymntintfr */
     
       java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public OtherRecptintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox131 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel531 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel51 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        crset1.setCommand("select activity from activity where payment_modes != 'Payable' ORDER BY code  ");
        crset1.setConnectionSource(pConnDB);
        crset2.setCommand("select bank_acc_no from bank_branches");
        crset2.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Other Receipts");
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
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
        gridBagConstraints.gridy = 12;
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
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14753_.GIF")));
        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click here to close window");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel7, gridBagConstraints);

        jTextField6.setEditable(false);
        jTextField6.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField6.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextField6, gridBagConstraints);

        jTextField8.setEditable(false);
        jTextField8.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField8.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField8.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(jTextField8, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder("Enter drawee details"));
        jLabel1.setText("Received From");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField4, gridBagConstraints);

        jLabel6.setText("Receipt Details");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel6, gridBagConstraints);

        jComboBox131.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "activity", null, null, null));
        jComboBox131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox131ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jComboBox131, gridBagConstraints);

        jLabel2.setText("Other Receipt Details");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField11, gridBagConstraints);

        jLabel531.setText("Recipt No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel531, gridBagConstraints);

        jTextField31.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField31, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.TitledBorder("Receipt details"));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel3.setText("Drawer's Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(jTextField1, gridBagConstraints);

        jLabel4.setText("Cheque Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(jTextField2, gridBagConstraints);

        jLabel54.setText("Drawer's Bank");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel54, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(jTextField9, gridBagConstraints);

        jLabel53.setText("Amount KShs.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel53, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel3.add(jTextField3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel5.setText("Bank Acct No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jLabel5, gridBagConstraints);

        jComboBox11.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset2, "bank_acc_no", null, null, null));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel4.add(jComboBox11, gridBagConstraints);

        jLabel51.setText("Bank Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jLabel51, gridBagConstraints);

        jTextField7.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel4.add(jTextField7, gridBagConstraints);

        jLabel52.setText("Bank Branch");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jLabel52, gridBagConstraints);

        jTextField5.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel4.add(jTextField5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        jPanel2.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        getContentPane().add(jPanel2, gridBagConstraints);

        setBounds(0, 0, 697, 390);
    }//GEN-END:initComponents

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        
       
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select bank_account_name,branch_name,bank_account_code from bank_branches where bank_acc_no ='"+jComboBox11.getSelectedItem()+"'");
            while (rset.next()){
            jTextField7.setText(rset.getObject(1).toString());
             jTextField5.setText(rset.getObject(2).toString());
            jTextField6.setText(rset.getObject(3).toString());
            }
            } catch (java.sql.SQLException sqe) {
           sqe.printStackTrace();
            System.out.println("Insert not successful");
        } 
        
        // Add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox131ActionPerformed
      jTextField31.setText("");   
      jTextField5.setText(""); 
      jTextField3.setText("");
      jTextField1.setText("");
      jTextField2.setText(""); 
      jLabel7.setText(" ");
         jButton1.setEnabled(true);
      
     try {
             java.sql.Statement stmt = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select code from activity where activity ='"+jComboBox131.getSelectedItem()+"'");
            while (rset.next()){
            jTextField8.setText(rset.getObject(1).toString());
            }
           } catch (java.sql.SQLException sqe) {
           sqe.printStackTrace();
        } 
       // Add your handling code here:
    }//GEN-LAST:event_jComboBox131ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);  // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField7.setText("");
      //jTextField58.setText("");
      jTextField9.setText(""); 
      jTextField5.setText("");
     // jTextField531.setText("");
      jTextField4.setText(""); 
      jTextField11.setText("");
       jTextField31.setText("");   
      jTextField5.setText(""); 
      jTextField3.setText("");
       jTextField1.setText("");
      jTextField2.setText(""); 
      jComboBox131.setSelectedItem(null);
      jComboBox11.setSelectedItem(null);
      // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       javax.swing.JFrame other = new OtherReceipts(connectDB, pConnDB);
     other.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql.toString());
 
        
        java.sql.Connection con;
  
    
         try {
              connectDB.setAutoCommit(false);
             java.sql.Statement ps = connectDB.createStatement();            
            java.sql.ResultSet rst = ps.executeQuery("select nextval('transaction_no_seq')");
            while (rst.next())
            rst.getObject(1).toString();
           
             String transNo = rst.getObject(1).toString();
            
             java.sql.Statement pss = connectDB.createStatement();            
            java.sql.ResultSet rsts = pss.executeQuery("select nextval('receipt_no_seq')");
            while (rsts.next())
            rsts.getObject(1).toString();
             
             String receiptNo = rsts.getObject(1).toString();
            
           java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into other_transactions values(?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?)");
            pstmt.setString(1,jTextField11.getText());
            pstmt.setString(2,jComboBox131.getSelectedItem().toString());
             if (jTextField4.getText().equals("")){
               javax.swing.JOptionPane.showMessageDialog(this,"Received from missing","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
            pstmt.setString(3,jTextField4.getText());
            }
            pstmt.setString(4,jTextField9.getText());
             if (jTextField8.getText().equals("")){
               javax.swing.JOptionPane.showMessageDialog(this,"You must select activity!","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
            pstmt.setString(5,jTextField8.getText());
            }
            pstmt.setString(6,null);
            pstmt.setString(7,jTextField1.getText());
             if (jTextField6.getText().equals("")){
               javax.swing.JOptionPane.showMessageDialog(this,"You did not select bank account","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
            pstmt.setString(8,jTextField6.getText());
            }
            pstmt.setString(9,jComboBox11.getSelectedItem().toString());
            pstmt.setString(10,jTextField2.getText());
            pstmt.setString(11,null);
            pstmt.setString(12,jTextField7.getText());
            pstmt.setString(13,jTextField5.getText());
            pstmt.setString(15,jTextField3.getText());
            pstmt.setString(14,"00");
            pstmt.setDate(16, datenowSql);
            pstmt.setString(17,""+transNo+"");
            pstmt.setBoolean(18,false);
            pstmt.setString(19,""+receiptNo+"");
            pstmt.executeUpdate();
           // pstmt.close();
            
            java.sql.PreparedStatement pstmt1 = connectDB.prepareStatement("insert into cash_book values(?,?,?,?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?)");
            pstmt1.setString(1,jTextField8.getText());
            pstmt1.setString(2,jComboBox131.getSelectedItem().toString());
            pstmt1.setString(3,null);
            pstmt1.setString(4,jTextField4.getText());
            pstmt1.setString(5,null);
            pstmt1.setString(6,jTextField9.getText());
            pstmt1.setString(7,jTextField11.getText());
            pstmt1.setString(8,jTextField6.getText());
            pstmt1.setString(9,jTextField1.getText());
            pstmt1.setString(10,null);
            pstmt1.setString(11,null);
            pstmt1.setString(12,""+receiptNo+"");
            pstmt1.setString(13,jTextField2.getText());
            pstmt1.setString(14,null);
            pstmt1.setString(15,jTextField7.getText());
            pstmt1.setString(16,jTextField5.getText());
            pstmt1.setString(17,jComboBox11.getSelectedItem().toString());
            pstmt1.setString(18,jTextField3.getText());
            pstmt1.setString(19,"00");
            pstmt1.setDate(20, datenowSql);
            pstmt1.setString(21,""+transNo+"");            
         
            pstmt1.executeUpdate();
            pstmt1.close();
            connectDB.commit();
            connectDB.setAutoCommit(true);
            this.getContentPane().removeAll();
            this.initComponents();
            jButton1.setEnabled(false);
            jLabel7.setForeground(java.awt.Color.blue);
            jLabel7.setText("Insert successful");
             }   catch(java.sql.SQLException sq){
             javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                  connectDB.rollback();
              }catch (java.sql.SQLException sql){
              javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
              }
            System.out.println(sq.getMessage());
            jLabel7.setForeground(java.awt.Color.red);
            jLabel7.setText("Sorry. Please Check The Fields");
            } 
       
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox jComboBox131;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jLabel531;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
}
