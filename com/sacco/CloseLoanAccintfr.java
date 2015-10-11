/*
 * loanpymntintfr.java
 *
 * Created on August 13, 2002, 1:09 PM
 */

package com.sacco;

/**
 *
 * @author  root
 */
public class CloseLoanAccintfr extends javax.swing.JInternalFrame {
    
    /** Creates new form loanpymntintfr */
      
       java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
        javax.swing.JSpinner beginDateSpinner = null;
    
      javax.swing.JSpinner endDateSpinner = null;

      public CloseLoanAccintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        pconn1 = new org.netbeans.lib.sql.pool.PooledConnectionSource();
        try {
            crset1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            crset3 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        buttonGroup1 = new javax.swing.ButtonGroup();
        try {
            crset2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        pconn1.setDatabase("jdbc:postgresql://localhost:5432/sako");
        pconn1.setDriver("org.postgresql.Driver");
        pconn1.setUsername("postgres");
        crset1.setCommand("select distinct loan_account_no from loan_transactions order by loan_account_no");
        crset1.setConnectionSource(pConnDB);
        crset3.setCommand("select branch_name from bank_branches order by branch_name");
        crset3.setConnectionSource(pConnDB);
        crset2.setCommand("select bank_acc_no from bank_branches");
        crset2.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Closing Loan Accounts");
        setToolTipText("Caution!! Make sure you have entered all the necessary information before clicking");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ColorPreview.gif")));
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
        gridBagConstraints.gridy = 17;
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
        gridBagConstraints.gridy = 17;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif")));
        jButton3.setMnemonic('n');
        jButton3.setText("Cancel");
        jButton3.setToolTipText("Click here to clear text fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 17;
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
        gridBagConstraints.gridy = 17;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel3, gridBagConstraints);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Cursor", 0, 12));
        jTextField8.setForeground((java.awt.Color) javax.swing.UIManager.getDefaults().get("InternalFrame.borderColor"));
        jTextField8.setBorder(null);
        jTextField8.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(jTextField8, gridBagConstraints);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Cursor", 0, 12));
        jTextField10.setForeground((java.awt.Color) javax.swing.UIManager.getDefaults().get("InternalFrame.borderColor"));
        jTextField10.setBorder(null);
        jTextField10.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        getContentPane().add(jTextField10, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        try {
            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);
            java.util.Date dateInstance = java.util.Calendar.getInstance().getTime();
            //        java.lang.String dateString2Parse = null;
            //        dateString2Parse = String.valueOf(dateInstance.getDate())+"-"+String.valueOf(dateInstance.getMonth()+1)+"-200"+String.valueOf(dateInstance.getYear()-100);

            java.util.Date formattedDate = dateFormat.parse(dateInstance.toLocaleString());
            System.out.println(dateFormat.format(formattedDate));
            javax.swing.SpinnerDateModel beginDate = new javax.swing.SpinnerDateModel(formattedDate, null, null,java.util.Calendar.DAY_OF_MONTH);
            //   javax.swing.SpinnerDateModel endDate = new javax.swing.SpinnerDateModel(formattedDate, null, null,java.util.Calendar.DAY_OF_MONTH);

            beginDateSpinner = new javax.swing.JSpinner(beginDate);
            //     endDateSpinner = new javax.swing.JSpinner(endDate);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 3;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            jPanel1.add(beginDateSpinner, gridBagConstraints);

        } catch(java.text.ParseException parseExec) {

            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), parseExec.getMessage());

        }
        jPanel1.setBorder(new javax.swing.border.TitledBorder("Select Member account here"));
        jLabel1.setText("Loan No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "lpad", null, null, null));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jPanel1.add(jComboBox1, gridBagConstraints);

        jLabel2.setText("Member Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jTextField11.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField11, gridBagConstraints);

        jLabel4.setText("Date Closed");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBorder(new javax.swing.border.TitledBorder(null, "Reason for suspension", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(jPanel6, gridBagConstraints);

        jCheckBox1.setText("Suspend");
        buttonGroup1.add(jCheckBox1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setText("Reinstate");
        buttonGroup1.add(jCheckBox2);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jCheckBox2, gridBagConstraints);

        setBounds(0, 0, 700, 500);
    }//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     this.setVisible(false);           // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     // jTextField1.setText("");
//      jTextField2.setText(""); 
//      jTextField3.setText(""); 
//      jTextField4.setText("");
      jTextField11.setText(""); 
//      jTextField5.setText("");
//      jTextField9.setText("");
//      jTextField12.setText(""); 
//      jTextField13.setText("");
//      jTextField14.setText("");
//      jTextField6.setText(""); 
//      jTextField15.setText("");
   //   jTextField7.setText("");
      jComboBox1.setSelectedItem("");
//      jComboBox12.setSelectedItem("");
      // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  //     javax.swing.JFrame lpay = new sharesrefund(connectDB,pConnDB);
   //  lpay.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
                 String selectedchkbx;
                 String selectedchkbx1;
        if (this.jCheckBox1.isSelected())
            selectedchkbx = jCheckBox1.getText();
       // else
       //     if (this.jCheckBox2.isSelected())
           //     selectedchkbx = jCheckBox2.getText();
      ///  else
            //if (this.jCheckBox3.isSelected())
           //     selectedchkbx = jCheckBox3.getText();
        
         else
               // if (this.jCheckBox3.isSelected())
                selectedchkbx = jCheckBox2.getText();
                 
                    if (this.jCheckBox1.isSelected())
            selectedchkbx1 = jCheckBox1.getText();
       // else
       //     if (this.jCheckBox2.isSelected())
           //     selectedchkbx = jCheckBox2.getText();
      ///  else
            //if (this.jCheckBox3.isSelected())
           //     selectedchkbx = jCheckBox3.getText();
        
         else
               // if (this.jCheckBox3.isSelected())
                selectedchkbx1 = "Active";
            
            
        System.out.println(selectedchkbx);

        try {
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("begin work; update member set status ='"+selectedchkbx1+"' where m_number = '"+jComboBox1.getSelectedItem()+"';commit work");
              pstmt.executeUpdate();
        }   catch(java.sql.SQLException sq){
            System.out.println(sq.getMessage());
            
             } 
       
         
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql.toString());
 
        
        java.sql.Connection con;
  
    
         try {
           
           
             
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into member_suspension values(?,?,?,?)");
            pstmt.setString(1,jComboBox1.getSelectedItem().toString());
            pstmt.setString(2,jTextPane1.getText());
             pstmt.setString(3,selectedchkbx);
              pstmt.setObject(4,beginDateSpinner.getValue().toString());
         
            pstmt.executeUpdate();
             
            jLabel7.setForeground(java.awt.Color.blue);
            jLabel7.setText("Insert Successful");
      
            //con.close();
                }   catch(java.sql.SQLException sq){
              javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
       
            System.out.println(sq.getMessage());
              }
       // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         this.jTextField8.setVisible(false);
              jTextField10.setVisible(false);
              int j = 0;
       
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select first_name||' '||middle_name||' '||last_name from member where m_number ='"+jComboBox1.getSelectedItem()+"'");
            while (rset.next())
            jTextField11.setText(rset.getObject(1).toString());
            } catch (java.sql.SQLException sqe) {
           sqe.printStackTrace();
            System.out.println("Insert not successful");
        }  
         /*  try {
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            System.out.println("Connection to database established");
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select scode from share where type ='Deposit'");
            while (rset.next())
            jTextField8.setText(rset.getObject(1).toString());
            } catch (java.sql.SQLException sqe) {
           sqe.printStackTrace();
            System.out.println("Insert not successful");
        }  
        */
     /*          float num_a = 0;
               float num_b = 0;
               float num_c = 0;
               float num_d = 0;
              jTextField12.setText("00");
              jTextField13.setText("00");
              jTextField14.setText("00");
              jTextField15.setText("00");
     
      try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select sum(credit)-sum(debit) from shares_refund where member_code ='"+jComboBox1.getSelectedItem()+"' AND share_type = 'Deposits'");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(member_code) from shares_refund where member_code ='"+jComboBox1.getSelectedItem()+"' AND share_type = 'Deposits'");
            while (rset1.next()) {
                j = rset1.getInt(1);
            }
             if (j > 0){
            while (rset.next())
            jTextField12.setText(rset.getObject(1).toString());
             } else {
                 jTextField14.setText("0.00");
             }
            } catch (java.sql.SQLException sqe) {
           sqe.printStackTrace();
            System.out.println("Insert not successful");
        }  
      
          try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select sum(credit)-sum(debit) from shares_refund where member_code ='"+jComboBox1.getSelectedItem()+"' AND share_type = 'Normal Shares'");
             java.sql.ResultSet rset1 = stmt1.executeQuery("select count(member_code) from shares_refund where member_code ='"+jComboBox1.getSelectedItem()+"' AND share_type = 'Normal Shares'");
            while (rset1.next()) {
                j = rset1.getInt(1);
            }
             if (j > 0){
            while (rset.next())
            jTextField13.setText(rset.getObject(1).toString());
             } else {
                 jTextField13.setText("0.00");
             }
            } catch (java.sql.SQLException sqe) {
           sqe.printStackTrace();
            System.out.println("Insert not successful");
        }  
            try {
             java.sql.Statement stmt = connectDB.createStatement();
             java.sql.Statement stmt1 = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select sum(credit)-sum(debit) from shares_refund where member_code ='"+jComboBox1.getSelectedItem()+"' AND share_type = 'School Shares'");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(member_code) from shares_refund where member_code ='"+jComboBox1.getSelectedItem()+"' AND share_type = 'School Shares'");
            while (rset1.next()) {
                j = rset1.getInt(1);
            }
             if (j > 0){
            while (rset.next())
            jTextField14.setText(rset.getObject(1).toString());
             } else {
                 jTextField14.setText("0.00");
             }
            } catch (java.sql.SQLException sqe) {
           sqe.printStackTrace();
            System.out.println("Insert not successful");
        }  
    
            try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select sum(principal + interest)-sum(principal_paid + interest_paid) from loan_transactions where member_no ='"+jComboBox1.getSelectedItem()+"'");
             java.sql.ResultSet rset1 = stmt1.executeQuery("select count(member_no) from loan_transactions where member_no ='"+jComboBox1.getSelectedItem()+"'");
            while (rset1.next()) {
                j = rset1.getInt(1);
            }
             if (j > 0){
            while (rset.next())
            jTextField15.setText(rset.getString(1));
           } else 
               jTextField15.equals("00");
            } catch (java.sql.SQLException sqe) {
           sqe.printStackTrace();
            System.out.println("Insert not successful");
        }  
     
           num_a = java.lang.Float.parseFloat(jTextField12.getText());
           num_b = java.lang.Float.parseFloat(jTextField13.getText());
           num_c = java.lang.Float.parseFloat(jTextField14.getText());
           num_d = java.lang.Float.parseFloat(jTextField15.getText());
       //float num_b = java.lang.Float.parseFloat(jTextField6.getText());
      // float num_c = java.lang.Float.parseFloat(jTextField7.getText());
       
        float total_num = num_c + num_b + num_a - num_d;
        System.out.println(total_num);
                
         
            this.jTextField6.setText(""+total_num+"");
                
               
      */        
            //   jTextField12.setVisible(false);
         // Add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField8;
    private org.netbeans.lib.sql.pool.PooledConnectionSource pconn1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset3;
    // End of variables declaration//GEN-END:variables
    
}
