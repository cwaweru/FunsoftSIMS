/*
 * DatePanel.java
 *
 * Created on May 1, 2003, 7:40 PM
 */

package com.afrisoftech.lib;

/**
 *
 * @author  root
 */
public class ChangePassword extends javax.swing.JDialog {
   
     int reportName;
     
    
     java.sql.Connection connectDB = null;

      java.lang.String secrets = null;
    /** Creates new form DatePanel */
    public ChangePassword(java.awt.Frame parent, boolean modal, java.sql.Connection connectDb, java.lang.String secreta) {
        
       super(parent, modal);
       
       connectDB = connectDb;
       
       secrets = secreta;
  //      dateStartEnd = new java.util.Vector(1,1);
        
        initComponents();
        
 //       return dateStartEnd; 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setTitle("Changing User password");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(new javax.swing.border.EtchedBorder());
        jLabel1.setText("New Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Retype New Pasword");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel4.setText("Current Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel4, gridBagConstraints);

        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(jPasswordField1, gridBagConstraints);

        jPasswordField2.setToolTipText("Must be aleast 8 characters long.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(jPasswordField2, gridBagConstraints);

        jPasswordField3.setToolTipText("Same as \"New Password\" above.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(jPasswordField3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 5);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.EtchedBorder());
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Change your password here.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(new javax.swing.border.EtchedBorder());
        jButton2.setMnemonic('n');
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jButton2, gridBagConstraints);

        jButton1.setMnemonic('C');
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(350, 180));
        setLocation((screenSize.width-350)/2,(screenSize.height-180)/2);
    }//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        this.dispose();
        // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
    
        java.lang.String currPassWord = null;
        
        currPassWord = this.jPasswordField1.getText();
        
        if (!(currPassWord.equals(secrets))) {
            
                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), "You have typed your current password incorrectly");
        
 //       jPasswordField1.grabFocus();
        
        }

        
        // Add your handling code here:
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        java.lang.String currPassWord = null;
        
        currPassWord = this.jPasswordField1.getText();
                
        java.lang.String currentUser = null;
        
        if (currPassWord.equals(secrets)) {

        
             if (this.jPasswordField2.getText().equals(this.jPasswordField3.getText())) {
        
                 try {
            
                     java.sql.Statement stmt1 = connectDB.createStatement();
            
                        java.sql.ResultSet rset1 = stmt1.executeQuery("SELECT CURRENT_USER");
            
                         while (rset1.next()) {
                
                         currentUser = rset1.getString(1);
                
                         }
            
//                     java.sql.PreparedStatement pstmt = connectDB.prepareStatement("ALTER USER "+currentUser+" WITH PASSWORD '"+jPasswordField2.getText()+"'"); 
            
                        java.sql.Statement stmt = connectDB.createStatement();
                        
                        stmt.executeUpdate("ALTER USER "+currentUser+" WITH PASSWORD '"+jPasswordField2.getText()+"'");
                        
//                        pstmt.executeUpdate();
            
                    javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), "Password changed for user : "+currentUser);
            
                    this.dispose();
            
                     } catch(java.sql.SQLException SQLExec) {
            
                         SQLExec.printStackTrace();
                         
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), SQLExec.getLocalizedMessage());
            
                    }
        
              } else {
            
                 javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), "New password must be confirmed by an identical entry on the Retyped password entry.");
            
             }
             
        }else {
                 
                 javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), "You hava typed your current password incorrectly.");
                  
       }
            
        
          // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    //  new DatePanel(new javax.swing.JFrame(), true).show();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jButton2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
    
}
