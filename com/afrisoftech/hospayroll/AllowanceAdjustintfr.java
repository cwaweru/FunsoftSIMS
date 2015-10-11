/*
 * Members.java
 *
 * Created on August 13, 2002, 3:36 PM
 */

package com.afrisoftech.hospayroll;

/**
 *
 * @author  root
 */
public class AllowanceAdjustintfr extends javax.swing.JInternalFrame implements java.lang.Runnable {
    
    /** Creates new form Members */
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    private javax.swing.JComboBox cmbox;
    
    
    public AllowanceAdjustintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
            crset2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jPanel52 = new javax.swing.JPanel();
        jButton152 = new javax.swing.JButton();
        jButton202 = new javax.swing.JButton();
        jButton252 = new javax.swing.JButton();
        jSeparator71 = new javax.swing.JSeparator();
        jButton301 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        crset2.setCommand("");
        crset2.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Allocate Allowances & Benefits ");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFont(new java.awt.Font("SansSerif", 0, 10));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ColorPreview.gif")));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        jPanel52.setLayout(new java.awt.GridBagLayout());

        /*int intCheck = 0;

        try {

            java.sql.Statement stmtCheck = connectDB.createStatement();

            java.sql.ResultSet rsetCheck = stmtCheck.executeQuery("SELECT COUNT(*) FROM company_profile");

            while (rsetCheck.next()) {

                intCheck = rsetCheck.getInt(1);

            }

        } catch(java.sql.SQLException sqlExec) {

            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());

        }

        if (intCheck > 0) {

            jTextField2.setEditable(false);

            java.awt.Toolkit.getDefaultToolkit().beep();

            javax.swing.JOptionPane.showMessageDialog(this, "MESSAGE : Company already set up!. Contact System Administrator");

        }
        */

        jButton152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton152.setMnemonic('E');
        jButton152.setText("Edit");
        jButton152.setToolTipText("Click here to edit data");
        jButton152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton152ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jButton152, gridBagConstraints);

        jButton202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif")));
        jButton202.setMnemonic('r');
        jButton202.setText("Refresh");
        jButton202.setToolTipText("Click here to clear fields");
        jButton202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton202ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jButton202, gridBagConstraints);

        jButton252.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14753_.GIF")));
        jButton252.setMnemonic('c');
        jButton252.setText("Close");
        jButton252.setToolTipText("Click here to close window");
        jButton252.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton252ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jButton252, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jSeparator71, gridBagConstraints);

        jButton301.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
        jButton301.setMnemonic('O');
        jButton301.setText("Ok");
        jButton301.setToolTipText("Click here to enter data");
        jButton301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton301ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jButton301, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jLabel4, gridBagConstraints);

        jPanel21.setLayout(new java.awt.GridBagLayout());

        jPanel21.setBorder(new javax.swing.border.TitledBorder("Enter Benefits Allocated Here"));
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
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
                "Staff_no", "Grade", "Allowance Type", "Previous Amt", "New Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try {

            crset2.setCommand("select staff_no,grade,description,amount,null as new_amount from allowances_benefits order by staff_no");
            crset2.setConnectionSource(pConnDB);

            crset2.execute();

            jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(crset2, new org.netbeans.lib.sql.models.TableModel.Column[] {
                new org.netbeans.lib.sql.models.TableModel.Column("staff_no", "Staff No.", false),
                new org.netbeans.lib.sql.models.TableModel.Column("grade", "Grade", false),

                new org.netbeans.lib.sql.models.TableModel.Column("description", "Description", false),
                new org.netbeans.lib.sql.models.TableModel.Column("amount", "Prev. Amount", false),
                new org.netbeans.lib.sql.models.TableModel.Column("new_amount", "New Amount", true)
            }));

            jScrollPane1.setViewportView(jTable1);

        } catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            System.out.println(sqlex.getMessage());

        }
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel21.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        jPanel52.add(jPanel21, gridBagConstraints);

        jButton5.setMnemonic('R');
        jButton5.setText("RemoveRow");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jButton5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel52, gridBagConstraints);

        setBounds(0, 0, 750, 449);
    }//GEN-END:initComponents
    private void cmboxActionPerformed(java.awt.event.ActionEvent evt){
        int i = jTable1.getSelectedRow();
        
        
        
     /* try {
          //java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital","postgres","pilsiner");
          java.sql.Statement pstmt = connectDB.createStatement();
          java.sql.ResultSet rs = pstmt.executeQuery("select first_name||' '||middle_name||' '||last_name from member where m_number = '"+cmbox.getSelectedItem()+"'");
          while (rs.next()){
              //jTextField4.setText(rs.getObject(1).toString());
              jTable1.setValueAt(rs.getObject(1),i,1);
          }
      } catch(java.sql.SQLException sqlex){
          System.out.println(sqlex.getMessage());
      }
      
      */
        
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int rows2Delete = jTable1.getSelectedRowCount();
        
        int[] selectedRows = jTable1.getSelectedRows();
        
        if (rows2Delete < 1) {
            
            java.awt.Toolkit.getDefaultToolkit().beep();
            
            javax.swing.JOptionPane.showMessageDialog(this, "There are no selected rows to delete!");
            
        } else {
            
            if (rows2Delete > 1) {
                
                for (int i = 0; i < selectedRows.length; i++) {
                    
                    
                    
                    javax.swing.table.DefaultTableModel defTableModel = (javax.swing.table.DefaultTableModel)jTable1.getModel();
                    
                    defTableModel.removeRow(selectedRows[i]);
                    
                }
                
                
                
            } else {
                
                javax.swing.table.DefaultTableModel defTableModel = (javax.swing.table.DefaultTableModel)jTable1.getModel();
                
                defTableModel.removeRow(jTable1.getSelectedRow());
            }
        }  // Add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton252ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton252ActionPerformed
        setVisible(false);   // Add your handling code here:
    }//GEN-LAST:event_jButton252ActionPerformed
    
    private void jButton202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton202ActionPerformed
        
        this.getContentPane().removeAll();
        
        this.initComponents();
        
        
        //     Add your handling code here:
    }//GEN-LAST:event_jButton202ActionPerformed
    
    private void jButton152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton152ActionPerformed
        //      javax.swing.JFrame pat = new CompanyProfile(connectDB, pConnDB);
        //    pat.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_jButton152ActionPerformed
    
    private void jButton301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton301ActionPerformed
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql.toString());
        try{
            connectDB.setAutoCommit(false);
            for (int i = 0; i < jTable1.getRowCount(); i++){
                  if (jTable1.getModel().getValueAt(i,4) != null){
                  
                double floatCol2 = java.lang.Double.parseDouble(jTable1.getValueAt(i, 4).toString());
                
                double floatCol3 = java.lang.Double.parseDouble(jTable1.getValueAt(i, 3).toString());
             
                double totalSum = floatCol2 + floatCol3;
                
                java.sql.PreparedStatement pstmt2 = connectDB.prepareStatement("UPDATE allowances_benefits SET amount ='"+totalSum+"' WHERE description = '"+jTable1.getValueAt(i,2).toString()+"' AND staff_no = '"+jTable1.getValueAt(i,0).toString()+"'");
                pstmt2.executeUpdate();
                
                  }
            }
                connectDB.commit();
                connectDB.setAutoCommit(true);
        
            jLabel4.setForeground(java.awt.Color.blue);
            jLabel4.setText("Insert successful");
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            jLabel4.setForeground(java.awt.Color.red);
            jLabel4.setText("Sorry.insert not successful");
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton301ActionPerformed
    
    public void run() {
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JButton jButton301;
    private javax.swing.JButton jButton252;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JButton jButton202;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JButton jButton152;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
