/*
 * AboutBoxintfr.java
 *
 * Created on July 12, 2003, 10:27 PM
 */

package com.afrisoftech.sacco;

/**
 *
 * @author  root
 */
public class AboutBoxintfr extends javax.swing.JInternalFrame {

    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    String java_Version = System.getProperty("java.version");
    
    String java_Home = System.getProperty("java.home");
    
    String systemDatabase = null;
    
    String dbVersion = null;
    
    String osName = System.getProperty("os.name")+" "+System.getProperty("os.version");
    
    String dbDriver = null;
    
    String sysTime = null;
    
    public AboutBoxintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
        connectDB = connDb;
        
        pConnDB = pconnDB;
        
        try {
            
            this.systemDatabase = connectDB.getMetaData().getDatabaseProductName()+" Ver "+connectDB.getMetaData().getDatabaseProductVersion();
        
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
            
        dbDriver = pConnDB.getDriver();
        
        java.util.Calendar cal = java.util.Calendar.getInstance();
        
        sysTime = cal.getTime().toString();
        
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setTitle("About Box");
        setVisible(true);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder("System Details"));
        jTabbedPane1.setBorder(new javax.swing.border.EtchedBorder());
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setNextFocusableComponent(this.jPanel3);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setEditable(false);
        jTextArea1.setText("E-Pack Sacco System Version 1.2 r 2.0\n\n");
        jTextArea1.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jTextArea1, gridBagConstraints);

        jTabbedPane1.addTab("Legal Information", jPanel2);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setNextFocusableComponent(this.jPanel2);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(new javax.swing.border.TitledBorder(""));
        jTable1.setFont(new java.awt.Font("Serif", 0, 10));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.setValueAt("Java Version",0,0);
        jTable1.setValueAt(java_Version,0,1);
        jTable1.setValueAt("Java Home",1,0);
        jTable1.setValueAt(java_Home,1,1);
        jTable1.setValueAt("OS Name",2,0);
        jTable1.setValueAt(osName,2,1);
        jTable1.setValueAt("Database",3,0);
        jTable1.setValueAt(systemDatabase,3,1);
        jTable1.setValueAt("DB Driver",4,0);
        jTable1.setValueAt(dbDriver,4,1);
        jTable1.setValueAt("System Time",5,0);
        jTable1.setValueAt(sysTime,5,1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jTable1, gridBagConstraints);

        jTabbedPane1.addTab("System Details", jPanel3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jPanel1.add(jTabbedPane1, gridBagConstraints);

        jButton1.setMnemonic('C');
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton11.setMnemonic('M');
        jButton11.setText("System Details");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jButton11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(512, 300));
        setLocation((screenSize.width-512)/2,(screenSize.height-300)/2);
    }//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        
        this.jButton11.setText("Legal Info.");
        
        // Add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        this.jButton11.setText("System Details");
        
        // Add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        if (this.jButton11.getText() == "System Details") {
            
            this.jTabbedPane1.setSelectedComponent(jPanel3);

            this.jButton11.setText("Legal Info.");
            
        } else {
            
            this.jTabbedPane1.setSelectedComponent(jPanel2);
            
            this.jButton11.setText("System Details");
            
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    
}
