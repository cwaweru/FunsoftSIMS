/*
 * loanpymntintfr.java
 *
 * Created on August 13, 2002, 1:09 PM
 */

package com.afrisoftech.hospinventory;

/**
 *
 * @author  root
 */
public class Receivequotationintfr extends javax.swing.JInternalFrame {
     
    private  javax.swing.JComboBox cmbox = new javax.swing.JComboBox();
    
    /** Creates new form loanpymntintfr */
    public Receivequotationintfr() {
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
            crset2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            crset3 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try  {
            java.lang.Class.forName("org.postgresql.Driver");
            System.out.println("Found driver");
        } catch(java.lang.ClassNotFoundException cnf){
            System.out.println("driver not found");
        }
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();

        pconn1.setDatabase("jdbc:postgresql://localhost:5432/hospital");
        pconn1.setDriver("org.postgresql.Driver");
        pconn1.setPassword("02e991b12ffcc369fd7f7e922d5b2dc07b5ee12b9fd73c68d21a9999c08bc720c6a22a", true);
        pconn1.setUsername("postgres");
        crset1.setCommand("select description from print_quotations ");
        crset1.setConnectionSource(pconn1);
        crset1.setPassword("02aab2f7a38cf049f483c9f0d517c2c0cce4e7eb1901adec9ba54786ab62fc64", true);
        try {
            crset1.setUrl("jdbc:postgresql://localhost:5432/hospital");
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        crset2.setCommand("select distinct quotation_no from print_quotations ");
        crset2.setConnectionSource(pconn1);
        crset2.setPassword("02954ef6b48275e6a9d6d979a43e2d56434f72777a3c4e163b2a", true);
        crset3.setCommand("select company_name from suppliers order by company_name");
        crset3.setConnectionSource(pconn1);
        crset3.setPassword("02eab3c2fa9bc2128f076b156c3d0b389553c31c5b8ad2135a73ce617402956bcefd1164", true);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Received Quotations");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

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
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setMnemonic('E');
        jButton2.setText("Edit");
        jButton2.setToolTipText("Click here to edit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setMnemonic('n');
        jButton3.setText("Cancel");
        jButton3.setToolTipText("Click here to clear fields");
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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click here to close ");
        jButton4.setSelected(true);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        jLabel53.setText("Supplier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel53, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jSeparator2, gridBagConstraints);

        jLabel6.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(jTextField4, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel9.setText("Quotation No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel9, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ITEM DESCRIPTION", "SUPPLIER QTY QUOTED", "QUANTITY REQUESTED", "QUANTITY IN STOCK", "PRICE PER UNIT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });

        cmbox.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "description", null, null, null));
        //javax.swing.table.TableColumn s = this.jTable1.getColumnModel().getColumn(0);
        javax.swing.table.TableColumn s = this.jTable1.getColumn("ITEM DESCRIPTION");
        s.setCellEditor(new javax.swing.DefaultCellEditor(cmbox));
        cmbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset2, "quotation_no", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jComboBox1, gridBagConstraints);

        jComboBox2.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset3, "company_name", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jComboBox2, gridBagConstraints);

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Criteria", "Information", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        getContentPane().add(jScrollPane11, gridBagConstraints);

        setBounds(0, 0, 697, 504);
    }//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int k = 0; k < jTable1.getRowCount(); k++ ) {
        for (int r = 0; r < jTable1.getColumnCount(); r++ ) {
         jTable1.getModel().setValueAt(null,k,r);
        }
    }
    
//     jTextField21.setText("");
//     jComboBox111.setSelectedItem(null);
       for (int k = 0; k < jTable11.getRowCount(); k++ ) {
        for (int r = 0; r < jTable11.getColumnCount(); r++ ) {
         jTable11.getModel().setValueAt(null,k,r);
        }
    }
    
//     jTextField21.setText("");
//     jComboBox111.setSelectedItem(null);// Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        /*      
          javax.swing.JComboBox cmbox = new javax.swing.JComboBox();
   //cmbox.setEditable(true);
    cmbox.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "description", null, null, null));
    //javax.swing.table.TableColumn s = this.jTable1.getColumnModel().getColumn(0);
   javax.swing.table.TableColumn s = this.jTable1.getColumn("ITEM DESCRIPTION");
    s.setCellEditor(new javax.swing.DefaultCellEditor(cmbox));
 */   

    
 
    
    
    
       // Add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated
 private void cmboxActionPerformed(java.awt.event.ActionEvent evt){
      int i = jTable1.getSelectedRow();
     try {
            java.lang.Class.forName("org.postgresql.Driver");
        } catch(java.lang.ClassNotFoundException nt) {
            System.out.println(nt.getMessage());
        }
     try {
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital","postgres","pilsiner");
            java.sql.Statement pstmt = con.createStatement();
           // pstmt.executeUpdate("insert into AAA values('"+jTable1.getValueAt(numRows,numCols)+"')");
          java.sql.ResultSet rs = pstmt.executeQuery("select quantity_requested from print_quotations where description = '"+cmbox.getSelectedItem()+"' and quotation_no = '"+jComboBox1.getSelectedItem()+"'");
     while (rs.next())
            //jTextField4.setText(rs.getObject(1).toString());
            jTable1.setValueAt(rs.getObject(1),i,2);
            //jTable1.setValueAt(rs.getObject(2),i,3);
            //jTable1.setValueAt(rs.getObject(3),i,6);
 } catch(java.sql.SQLException sqlex){
        System.out.println(sqlex.getMessage());
 }
 //}
 
     try {
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital","postgres","pilsiner");
            java.sql.Statement pstmt = con.createStatement();
           // pstmt.executeUpdate("insert into AAA values('"+jTable1.getValueAt(numRows,numCols)+"')");
          java.sql.ResultSet rs = pstmt.executeQuery("select quote_by_date from print_quotations where description = '"+cmbox.getSelectedItem()+"' and quotation_no = '"+jComboBox1.getSelectedItem()+"'");
     while (rs.next())
            //jTextField4.setText(rs.getObject(1).toString());
            jTable1.setValueAt(rs.getObject(1),i,5);
            
 } catch(java.sql.SQLException sqlex){
        System.out.println(sqlex.getMessage());
 }
     
   try {
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital","postgres","pilsiner");
            java.sql.Statement pstmt = con.createStatement();
           // pstmt.executeUpdate("insert into AAA values('"+jTable1.getValueAt(numRows,numCols)+"')");
          java.sql.ResultSet rs = pstmt.executeQuery("select suppliers from print_quotations where description = '"+cmbox.getSelectedItem()+"' and quotation_no = '"+jComboBox1.getSelectedItem()+"'");
     while (rs.next())
            //jTextField4.setText(rs.getObject(1).toString());
            jTable1.setValueAt(rs.getObject(1),i,6);
            
 } catch(java.sql.SQLException sqlex){
        System.out.println(sqlex.getMessage());
 }
 }  
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      for (int i = 0;  i < jTable1.getRowCount(); i++) {
      
        try {
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital","postgres","pilsiner");
            java.sql.PreparedStatement pstmt = con.prepareStatement("insert into received_quotations values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1,jComboBox1.getSelectedItem().toString());
            pstmt.setString(2,jComboBox2.getSelectedItem().toString());
            pstmt.setString(3,jTextField4.getText());
            pstmt.setObject(4,jTable1.getValueAt(i,0));
            pstmt.setObject(5,jTable1.getValueAt(i,1));
            pstmt.setObject(6,jTable1.getValueAt(i,2));
            pstmt.setObject(7,jTable1.getValueAt(i,3));
            pstmt.setObject(8,jTable1.getValueAt(i,4));
            pstmt.setObject(9,jTable1.getValueAt(i,5));
            pstmt.executeUpdate();
            jLabel7.setForeground(java.awt.Color.blue);
            jLabel7.setText("Have inserted data successfully");
                }   catch(java.sql.SQLException sq){
                     javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
           
                    
                    jLabel7.setForeground(java.awt.Color.red);
                    jLabel7.setText("Data not inserted");
            System.out.println(sq.getMessage());
              }
      }
        /* try {
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            java.sql.PreparedStatement pstmt = con.prepareStatement ("update loan_update set loan_amount = loan_amount - ("+getTextfld+") where loan_account_no = '"+jComboBox1.getSelectedItem()+"'");
            //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
             pstmt.executeUpdate();
        }   catch(java.sql.SQLException sq){
            System.out.println(sq.getMessage());
            
             }*/
   
              // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    //javax.swing.JFrame lpay = new loanpayment();
     //lpay.setVisible(true);// Add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked
 //private void cmboxActionPerformed(javax.swing. 
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       // Add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
     // jTextField1.setText("");
      //jTextField2.setText(""); 
      //jTextField3.setText("");
      jTextField4.setText("");
      //jTextField12.setText("");// Add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
    this.setVisible(false);        // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private org.netbeans.lib.sql.NBCachedRowSet crset3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JTable jTable11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JLabel jLabel7;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel53;
    private org.netbeans.lib.sql.pool.PooledConnectionSource pconn1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
