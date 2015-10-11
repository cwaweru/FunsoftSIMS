/*
 * banksintfr.java
 *
 * Created on August 13, 2002, 3:24 PM
 */

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 */
public class Staffintfr extends javax.swing.JInternalFrame {
    
    /** Creates new form banksintfr */
     java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public Staffintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        try {
            crset11 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        crset1.setCommand("select department from departments order by department");
        crset1.setConnectionSource(pConnDB);
        crset11.setCommand("select s_type from staff_type order by s_type");
        crset11.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Staff");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon("/root/ffjuser40ce/sampledir/examples/colorpicker/ColorPreview.gif"));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        jButton1.setForeground(new java.awt.Color(204, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
        jButton1.setMnemonic('o');
        jButton1.setText("Ok");
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton2.setMnemonic('e');
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif")));
        jButton3.setMnemonic('n');
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14753_.GIF")));
        jButton4.setMnemonic('c');
        jButton4.setText("Close");
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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel3, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder("Enter staff details here"));
        jLabel1.setText("Staff No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jTextField1, gridBagConstraints);

        jLabel41.setText("Staff Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel41, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField31, gridBagConstraints);

        jLabel6.setText("Tel. No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField4, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "department", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jComboBox1, gridBagConstraints);

        jLabel2.setText("Department");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField2, gridBagConstraints);

        jLabel5.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField5, gridBagConstraints);

        jLabel12.setText("Town");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField10, gridBagConstraints);

        jLabel7.setText("Pager No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel8.setText("ID No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jTextField6, gridBagConstraints);

        jLabel9.setText("Estate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        jPanel2.add(jLabel9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jTextField7, gridBagConstraints);

        jLabel10.setText("House");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        jPanel2.add(jLabel10, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel2.add(jTextField8, gridBagConstraints);

        jLabel11.setText("Sex");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        jPanel2.add(jLabel11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel2.add(jTextField9, gridBagConstraints);

        jComboBox2.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset11, "s_type", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jComboBox2, gridBagConstraints);

        jLabel4.setText("Staff Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        jPanel2.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPanel2, gridBagConstraints);

        setBounds(0, 0, 700, 450);
    }//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       setVisible(false); // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      jTextField1.setText("");
      this.jComboBox1.setSelectedItem(null);
     jTextField2.setText("");
      this.jComboBox2.setSelectedItem(null);
      jTextField31.setText("");
      jTextField4.setText("");  
    //  jTextField3.setText("");
      jTextField5.setText("");
      jTextField6.setText("");
      jTextField7.setText("");
      jTextField8.setText("");
      jTextField9.setText("");
       jTextField10.setText("");
      // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       javax.swing.JFrame bank = new Staff(connectDB,pConnDB);
        bank.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql.toString());
     
       
        try {
            connectDB.setAutoCommit(false);
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into staff values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
             if(jTextField1.getText().equals("")){
           javax.swing.JOptionPane.showMessageDialog(this,"Enter Staff No.","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
          
            pstmt.setString(1,jTextField1.getText());
            }
              if(jTextField31.getText().equals("")){
           javax.swing.JOptionPane.showMessageDialog(this,"Enter Staff Name","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
          
            pstmt.setString(2,jTextField31.getText());
            }
              if(jTextField2.getText().equals("")){
           javax.swing.JOptionPane.showMessageDialog(this,"Enter staff address","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
          
            pstmt.setString(3,jTextField2.getText());
            }
            pstmt.setString(4,jTextField4.getText());
            pstmt.setString(5,jComboBox1.getSelectedItem().toString());
            pstmt.setString(6,jTextField5.getText());
            pstmt.setString(7,jTextField10.getText());
            pstmt.setString(8,jTextField6.getText());
            pstmt.setString(9,jTextField7.getText());
            pstmt.setString(10,jTextField8.getText());
             pstmt.setString(11,jTextField9.getText());
            pstmt.setString(12,jComboBox2.getSelectedItem().toString());
           pstmt.setDate(13,datenowSql);
          // pstmt.setString(14,jTextField2.getText());
            pstmt.executeUpdate();
            connectDB.commit();
            connectDB.setAutoCommit(true);
            
           jTextField10.setText("");  
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField31.setText("");
            jTextField4.setText("");  
           // jTextField3.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            this.jComboBox1.setSelectedItem(null);
            this.jComboBox2.setSelectedItem(null);
          
           
            jLabel3.setForeground(java.awt.Color.blue);
            jLabel3.setText("Insert successful");
             }   catch(java.sql.SQLException sq){
                   javax.swing.JOptionPane.showMessageDialog(this,"ERROR: "+ sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                    System.out.println(sq.getMessage());
                         try {
                  connectDB.rollback();
                    }catch (java.sql.SQLException sql){
                    javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            jLabel3.setForeground(java.awt.Color.red);
            jLabel3.setText("Sorry.Same Code already exists");
            }
      
           
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
          // Add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      // Add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
   
        // Add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
          // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jLabel9;
    private org.netbeans.lib.sql.NBCachedRowSet crset11;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
}