/*
 * oparamsintfr.java
 *
 * Created on August 13, 2002, 5:31 PM
 */

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 */
public class DeferRejectintfr extends javax.swing.JInternalFrame {
    
    /** Creates new form oparamsintfr */
          java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public DeferRejectintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        activity = new javax.swing.JPanel();
        jButton122 = new javax.swing.JButton();
        jButton222 = new javax.swing.JButton();
        jButton321 = new javax.swing.JButton();
        jButton421 = new javax.swing.JButton();
        jSeparator211 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField113 = new javax.swing.JTextField();
        jLabel311 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jTextField1111 = new javax.swing.JTextField();
        maxLoan = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jButton4211 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        crset1.setCommand("select type from currency_type order by type");
        crset1.setConnectionSource(pConnDB);
        crset2.setCommand("select l_type from loan order by l_type");
        crset2.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setTitle("Loan Reject/Defer Setup");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ColorPreview.gif")));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        jTabbedPane1.setBorder(new javax.swing.border.TitledBorder(""));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        activity.setLayout(new java.awt.GridBagLayout());

        jButton122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
        jButton122.setMnemonic('O');
        jButton122.setText("Ok");
        jButton122.setToolTipText("Click here to enter data");
        jButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton122ActionPerformed(evt);
            }
        });

        jButton122.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton122MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        activity.add(jButton122, gridBagConstraints);

        jButton222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton222.setMnemonic('E');
        jButton222.setText("Edit");
        jButton222.setToolTipText("Click here to edit data");
        jButton222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton222ActionPerformed(evt);
            }
        });

        jButton222.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton222MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        activity.add(jButton222, gridBagConstraints);

        jButton321.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif")));
        jButton321.setMnemonic('n');
        jButton321.setText("Cancel");
        jButton321.setToolTipText("Click here to clear textfields");
        jButton321.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton321ActionPerformed(evt);
            }
        });

        jButton321.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton321MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        activity.add(jButton321, gridBagConstraints);

        jButton421.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14753_.GIF")));
        jButton421.setMnemonic('C');
        jButton421.setText("Close");
        jButton421.setToolTipText("Click here to close window");
        jButton421.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton421ActionPerformed(evt);
            }
        });

        jButton421.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton421MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        activity.add(jButton421, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        activity.add(jSeparator211, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        activity.add(jLabel2, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder("Enter reasons for rejecting loan here"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField113, gridBagConstraints);

        jLabel311.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel311.setText("Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel311, gridBagConstraints);

        jLabel411.setText("Reason for Rejecting ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel411, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField1111, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        activity.add(jPanel1, gridBagConstraints);

        jTabbedPane1.addTab("Reject Entry", activity);

        maxLoan.setLayout(new java.awt.GridBagLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
        jButton4.setMnemonic('o');
        jButton4.setText("Ok");
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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        maxLoan.add(jButton4, gridBagConstraints);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif")));
        jButton5.setMnemonic('l');
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        maxLoan.add(jButton5, gridBagConstraints);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton6.setMnemonic('e');
        jButton6.setText("Edit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        maxLoan.add(jButton6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        maxLoan.add(jSeparator2, gridBagConstraints);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        maxLoan.add(jLabel12, gridBagConstraints);

        jButton4211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14753_.GIF")));
        jButton4211.setMnemonic('C');
        jButton4211.setText("Close");
        jButton4211.setToolTipText("Click here to close window");
        jButton4211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4211ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        maxLoan.add(jButton4211, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.TitledBorder("Enter reasons for defering loan here"));
        jLabel10.setText("Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel10, gridBagConstraints);

        jLabel11.setText("Reason for Defer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jPanel2.add(jTextField5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel2.add(jTextField6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        maxLoan.add(jPanel2, gridBagConstraints);

        jTabbedPane1.addTab("Defer Entry", maxLoan);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        setBounds(0, 0, 600, 239);
    }//GEN-END:initComponents

    private void jButton4211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4211ActionPerformed
        setVisible(false);        // Add your handling code here:
    }//GEN-LAST:event_jButton4211ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.jTextField5.setText("");
            this.jTextField6.setText(""); // Add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        javax.swing.JFrame act = new Defer(connectDB,pConnDB);
       act.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try {
           // java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into defer_reason values(?, ?)");
            pstmt.setString(1,jTextField5.getText());
            pstmt.setString(2,jTextField6.getText());
           // pstmt.setString(3,jComboBox1.getSelectedItem().toString());
            pstmt.executeUpdate();
            jLabel12.setForeground(java.awt.Color.blue);
            jLabel12.setText("Insert successful");
             }   catch(java.sql.SQLException sq){
             javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
     
            System.out.println(sq.getMessage());
       }  // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton421ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton421ActionPerformed
      setVisible(false);   // Add your handling code here:
    }//GEN-LAST:event_jButton421ActionPerformed

    private void jButton321ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton321ActionPerformed
        this.jTextField1111.setText("");
      this.jTextField113.setText(""); // Add your handling code here:
    }//GEN-LAST:event_jButton321ActionPerformed

    private void jButton222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton222ActionPerformed
         javax.swing.JFrame act = new Rejected(connectDB,pConnDB);
       act.setVisible(true);// Add your handling code here:
    }//GEN-LAST:event_jButton222ActionPerformed

    private void jButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton122ActionPerformed
        
        try {
           // java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into reject_reason values(?, ?)");
            pstmt.setString(1,jTextField113.getText());
            pstmt.setString(2,jTextField1111.getText());
           // pstmt.setString(3,jComboBox1.getSelectedItem().toString());
            pstmt.executeUpdate();
            jLabel2.setForeground(java.awt.Color.blue);
            jLabel2.setText("Insert successful");
             }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
      
            System.out.println(sq.getMessage());
           }   // Add your handling code here:
    }//GEN-LAST:event_jButton122ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // Add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
            
    // Add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
      
     // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton421MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton421MouseClicked
       // Add your handling code here:
    }//GEN-LAST:event_jButton421MouseClicked

    private void jButton321MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton321MouseClicked
     // Add your handling code here:
    }//GEN-LAST:event_jButton321MouseClicked

    private void jButton222MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton222MouseClicked
      // Add your handling code here:
    }//GEN-LAST:event_jButton222MouseClicked

    private void jButton122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton122MouseClicked
      // Add your handling code here:
    }//GEN-LAST:event_jButton122MouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel maxLoan;
    private javax.swing.JButton jButton421;
    private javax.swing.JTextField jTextField1111;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jLabel411;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JButton jButton4211;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JSeparator jSeparator211;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton122;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jButton321;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton222;
    private javax.swing.JPanel activity;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jTextField113;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    
}