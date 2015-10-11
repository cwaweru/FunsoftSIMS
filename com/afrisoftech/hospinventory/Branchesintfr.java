/*
 * Members.java
 *
 * Created on August 13, 2002, 3:36 PM
 */

package com.afrisoftech.hospinventory;

/**
 *
 * @author  root
 */
public class Branchesintfr extends javax.swing.JInternalFrame {
    javax.swing.table.TableColumn column = null;
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    /** Creates new form Members */
    public Branchesintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
        pConnDB = pconnDB;
        
        connectDB = connDb;
        
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
            crset11 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton512 = new javax.swing.JButton();

        crset1.setCommand("select  branch_name from branches order by branch_name ");
        crset1.setConnectionSource(pConnDB);
        crset11.setCommand("select  center_name from cost_stores order by center_name   ");
        crset11.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Department/Store");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFont(new java.awt.Font("SansSerif", 0, 10));
        setFrameIcon(new javax.swing.ImageIcon("/root/ffjuser40ce/sampledir/examples/colorpicker/ColorPreview.gif"));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder("Set Department/Stores here"));
        jButton1.setMnemonic('o');
        jButton1.setText("Ok");
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
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setMnemonic('e');
        jButton2.setText("Edit");
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
        jPanel1.add(jButton2, gridBagConstraints);

        jButton3.setMnemonic('l');
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton3, gridBagConstraints);

        jButton4.setMnemonic('c');
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton4, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Patient Store", "Markup %"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(false);
        javax.swing.table.TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jTable1.getColumnModel().getColumn(i);
            if (i == 0) {

                column.setPreferredWidth(25); //sport column is bigger
            } else {
                if (i == 0) {
                    column.setPreferredWidth(300);

                } else{
                    column.setPreferredWidth(20);
                }
            }
        }

        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel2, gridBagConstraints);

        jButton512.setMnemonic('R');
        jButton512.setText("RemoveRow");
        jButton512.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton512ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jButton512, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        setBounds(0, 0, 750, 450);
    }//GEN-END:initComponents
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StoresBranches suff = new StoresBranches(connectDB, pConnDB);
        
        suff.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);        // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int k = 0; k < jTable1.getRowCount(); k++ ) {
            for (int r = 0; r < jTable1.getColumnCount(); r++ ) {
                jTable1.getModel().setValueAt(null,k,r);
            }
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton512ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton512ActionPerformed
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
        }        // Add your handling code here:
    }//GEN-LAST:event_jButton512ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql1= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql1.toString());
        
        java.sql.Timestamp datenowSql= new java.sql.Timestamp(dateNow);
        
        System.out.println(datenowSql.toString());
        
        try {
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into st_stores values( ?, initcap(?),?,?,?)");
            for (int i = 0; i < jTable1.getRowCount(); i++){
                if (jTable1.getModel().getValueAt(i,0) != null){
                    pstmt.setObject(2,jTable1.getValueAt(i,0).toString());
                    if( jTable1.getValueAt(i,1).equals(null)){
                        javax.swing.JOptionPane.showMessageDialog(this,"Enter Store name","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                    }else{
                        pstmt.setObject(1, jTable1.getValueAt(i,1).toString());
                        
                    }
                    pstmt.setDate(3,datenowSql1);
                    if( jTable1.getValueAt(i,2).equals(null)){
                        pstmt.setBoolean(4,false);
                    }else{
                        pstmt.setObject(4, jTable1.getValueAt(i,2).toString());
                        
                    }
                     pstmt.setObject(5, jTable1.getValueAt(i,3).toString());
                      pstmt.executeUpdate();
                    
                    
                }
            }
            
            jLabel2.setForeground(java.awt.Color.blue);
                    jLabel2.setText("Insert successful");
            
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this,"ERROR: "+ sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(sq.getMessage());
            jLabel2.setForeground(java.awt.Color.red);
            jLabel2.setText("Sorry. Data not saved");
        }
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jButton512;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private org.netbeans.lib.sql.NBCachedRowSet crset11;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JButton jButton4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}