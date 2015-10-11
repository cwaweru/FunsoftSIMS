/*
 * loanpymntintfr.java
 *
 * Created on August 13, 2002, 1:09 PM
 */

package com.afrisoftech.hospital;

/**
 *
 * @author  root
 */
public class VitalSignRecIntfr1 extends javax.swing.JInternalFrame {
    
    /** Creates new form loanpymntintfr */
    
    private javax.swing.JComboBox cmbox;
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public VitalSignRecIntfr1(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
        connectDB = connDb;
        
        pConnDB = pconnDB;
        
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new com.afrisoftech.dbadmin.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox131 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vital Signs Recording");
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
        jButton1.setToolTipText("Click here enter data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14755_.GIF")));
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
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel7, gridBagConstraints);

        jTextField6.setEditable(false);
        jTextField6.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField6.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextField6, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select patient here"));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Temp.", "Pulse(BPM)", "Resp(VPM)", "BP", "Wt(Kg)", "Height(M)", "BMI", "Sugar", "Remarks"
            }
        ));
        jTable1.setShowHorizontalLines(false);
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });

        jScrollPane2.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel9.setText("Admission No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel2.add(jLabel9, gridBagConstraints);

        jComboBox131.setModel(com.afrisoftech.lib.ComboBoxModel.ComboBoxModel(connectDB, "select distinct admission_no from hp_admission where discharge = false ORDER BY admission_no ASC"));
        jComboBox131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox131ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jComboBox131, gridBagConstraints);

        jLabel1.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jTextField1.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(jTextField1, gridBagConstraints);

        jComboBox1.setModel(com.afrisoftech.lib.ComboBoxModel.ComboBoxModel(connectDB, "select first_name||' '||middle_name as name from pb_doctors_list order by name"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jComboBox1, gridBagConstraints);

        jLabel2.setText("Doctor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Patient Category");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        jTextField21.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(jTextField21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel1, gridBagConstraints);

        jButton5.setMnemonic('h');
        jButton5.setText("Help");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton5, gridBagConstraints);

        jButton6.setMnemonic('r');
        jButton6.setText("Remove Row");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jButton6, gridBagConstraints);

        setBounds(0, 0, 726, 390);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
     if (jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1) != null) {
        float floatCol2 = java.lang.Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
 
        float floatCol3 = java.lang.Float.parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
 
        float resVal = floatCol2 * floatCol3;
 
        java.lang.Float resFloat =new java.lang.Float(resVal);
 
        if (jTable1.getSelectedColumn() == 6) {
 
            jTable1.setValueAt(resFloat, jTable1.getSelectedRow(), 7);
 
        }
     }
 
        // Add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased
    
    private void jComboBox131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox131ActionPerformed
        jLabel7.setText("");
        try {
           
            java.sql.Statement stmt11 = connectDB.createStatement();
            java.sql.ResultSet rset11 = stmt11.executeQuery("select patient_name from hp_admission where admission_no  ='"+jComboBox131.getSelectedItem()+"'");
            while (rset11.next()){
               // jTextField2.setText(rset11.getObject(1).toString());
                jTextField1.setText(rset11.getObject(1).toString());
            }
              
            
            java.sql.Statement stmt1 = connectDB.createStatement();
            java.sql.ResultSet rset1 = stmt1.executeQuery("select patient_category,payment_mode from hp_patient_card where patient_no  ='"+jComboBox131.getSelectedItem()+"'");
            while (rset1.next()){
                jTextField21.setText(rset1.getObject(1).toString());
            }
        } catch (java.sql.SQLException sqe) {
            sqe.printStackTrace();
            //  System.out.println("Insert not successful");
        }   // Add your handling code here:
    }//GEN-LAST:event_jComboBox131ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);   // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    private void cmboxActionPerformed(java.awt.event.ActionEvent evt){
        java.lang.Object selectedGuaran = cmbox.getSelectedItem();
        int i = jTable1.getSelectedRow();
        
        if (selectedGuaran != null) {
            
            try {
                //java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital","postgres","pilsiner");
                java.sql.Statement pstmt = connectDB.createStatement();
                java.sql.ResultSet rs = pstmt.executeQuery("select rate,gl_account from pb_operating_parameters where service_type = '"+selectedGuaran+"' UNION ALL select sp.selling_price,ac.code from st_stock_prices sp,pb_activity ac where ac.activity ='Stock' AND product = '"+selectedGuaran+"'");
                while (rs.next()){
                    //jTextField4.setText(rs.getObject(1).toString());
                    jTable1.setValueAt(rs.getObject(1),i,3);
                    jTable1.setValueAt(rs.getObject(2),i,5);
                }
            } catch(java.sql.SQLException sqlex){
                System.out.println(sqlex.getMessage());
            }
        }
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
        jTextField21.setText("");
        jTextField6.setText("");
        for (int k = 0; k < jTable1.getRowCount(); k++ ) {
            for (int r = 0; r < jTable1.getColumnCount(); r++ ) {
                jTable1.getModel().setValueAt(null,k,r);
            }
        }
        this.jComboBox131.setSelectedItem(null);
        // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //        javax.swing.JFrame other = new OtherPayments(connectDB, pConnDB);
        //    other.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql1= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql1.toString());
        
        java.sql.Timestamp datenowSql= new java.sql.Timestamp(dateNow);
        
        System.out.println(datenowSql.toString());
        
        String billNo = null;
        
        
        try {
            connectDB.setAutoCommit(false);
            
            
            
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into hp_signs_record values(?,?,?,?,?, ?,?,?,?, ?, ?, ?, ?)");
            
            for (int i = 0; i < jTable1.getRowCount(); i++){
                if (jTable1.getModel().getValueAt(i,0) != null){
                    pstmt.setString(1,jComboBox131.getSelectedItem().toString());
                    pstmt.setObject(3,jTable1.getValueAt(i,0).toString());
                    pstmt.setString(2,jTextField1.getText());
                    pstmt.setObject(3,jTable1.getValueAt(i,0).toString());
                    pstmt.setObject(4,jTable1.getValueAt(i,1).toString());
                    pstmt.setObject(5,jTable1.getValueAt(i,2).toString());
                    pstmt.setObject(6,jTable1.getValueAt(i,3).toString());
                    pstmt.setObject(7,jTable1.getValueAt(i,4).toString());
                    pstmt.setObject(8,jTable1.getValueAt(i,5).toString());
                    pstmt.setObject(9,jTable1.getValueAt(i,6).toString());
                    pstmt.setObject(10,jTable1.getValueAt(i,7).toString());
                    pstmt.setObject(11,jTable1.getValueAt(i,8).toString());
                    pstmt.setObject(12,jTable1.getValueAt(i,9).toString());
                    pstmt.setString(13,jComboBox1.getSelectedItem().toString());
                    //  pstmt.setTimestamp(14,datenowSql);
                    pstmt.executeUpdate();
                }
            }
            connectDB.commit();
            connectDB.setAutoCommit(true);
            jLabel7.setForeground(java.awt.Color.blue);
            jLabel7.setText("Insert successful");
            
            jTextField1.setText("");
            jTextField21.setText("");
            jTextField6.setText("");
            for (int k = 0; k < jTable1.getRowCount(); k++ ) {
                for (int r = 0; r < jTable1.getColumnCount(); r++ ) {
                    jTable1.getModel().setValueAt(null,k,r);
                }
            }
            //  jComboBox2.setSelectedItem(null);
        }catch(java.sql.SQLException sq){
            
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            System.out.println(sq.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(), "Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }   // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox131;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
    
}