/*
 * DefaultInternalFrame.java
 *
 * Created on May 31, 2004, 1:53 PM
 */

package com.afrisoftech.kitchen;

/**
 *
 * @author  postgres
 */
public class RoosterCritariaIntfr extends javax.swing.JInternalFrame {
    
    /** Creates new form DefaultInternalFrame */
   java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public RoosterCritariaIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        mainPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dataPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        fieldsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Rooster Cretaria");
        setVisible(true);
        mainPanel.setLayout(new java.awt.GridBagLayout());

        buttonPanel.setLayout(new java.awt.GridBagLayout());

        buttonPanel.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel1.setText("Please allocate your staff to locations");
        buttonPanel.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(buttonPanel, gridBagConstraints);

        dataPanel.setLayout(new java.awt.GridBagLayout());

        dataPanel.setBorder(new javax.swing.border.TitledBorder(""));
        jButton1.setText("Insert");
        dataPanel.add(jButton1, new java.awt.GridBagConstraints());

        jButton11.setText("Select");
        dataPanel.add(jButton11, new java.awt.GridBagConstraints());

        jButton12.setText("Delete");
        dataPanel.add(jButton12, new java.awt.GridBagConstraints());

        jButton13.setText("Update");
        dataPanel.add(jButton13, new java.awt.GridBagConstraints());

        jButton14.setText("Close");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        dataPanel.add(jButton14, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(dataPanel, gridBagConstraints);

        fieldsPanel.setLayout(new java.awt.GridBagLayout());

        fieldsPanel.setBorder(new javax.swing.border.TitledBorder(""));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Staff Name", "Staff No", "Location 1", "Location 2", "Location 3", "Period of stay"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 20.0;
        mainPanel.add(fieldsPanel, gridBagConstraints);

        labelPanel.setLayout(new java.awt.GridBagLayout());

        labelPanel.setBorder(new javax.swing.border.TitledBorder(""));
        jButton2.setText("New");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel.add(jButton2, gridBagConstraints);

        jButton21.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel.add(jButton21, gridBagConstraints);

        jButton22.setText("Edit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel.add(jButton22, gridBagConstraints);

        jButton23.setText("Help");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel.add(jButton23, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(labelPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mainPanel, gridBagConstraints);

        setBounds(0, 0, 571, 285);
    }//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
this.dispose();
        // Add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.JButton jButton11;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton jButton13;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel labelPanel;
    private javax.swing.JButton jButton22;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
