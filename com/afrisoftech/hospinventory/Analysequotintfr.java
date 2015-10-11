/*
 * cmmintfr.java
 *
 * Created on August 13, 2002, 9:56 AM
 */

package com.afrisoftech.hospinventory;

/**
 *
 * @author  root
 */
public class Analysequotintfr extends javax.swing.JInternalFrame {
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    /** Creates new form cmmintfr */
    public Analysequotintfr(java.sql.Connection connectDb, org.netbeans.lib.sql.pool.PooledConnectionSource pConnDb) {
        
        connectDB = connectDb;
        
        pConnDB = pConnDb;
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jComboBox11 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        crset1.setCommand("select DISTINCT quotation_no from  received_quotations  where analysed_quotation = 'false'");
        crset1.setConnectionSource(pConnDB);
        crset2.setCommand("select company_name,premium_quoted from received_quotations where quotation_no = '"+jComboBox1.getSelectedItem()+"' order by premium_quoted ASC");
        crset2.setConnectionSource(pConnDB);
        crset2.setExecuteOnLoad(false);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Analyse Quotation");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setDoubleBuffered(true);
        setFont(new java.awt.Font("AR PL KaitiM Big5", 0, 18));
        setFrameIcon(new javax.swing.ImageIcon("/root/ffjuser40ce/sampledir/examples/colorpicker/ColorPreview.gif"));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        setAutoscrolls(true);
        setLayer(10);
        jLabel1.setText("Quotation No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Ranking by price (Ascending Order)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel3, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
        jButton1.setMnemonic('O');
        jButton1.setText("Ok");
        jButton1.setToolTipText("Click here to enter data");
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
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
        gridBagConstraints.gridy = 15;
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

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14755_.GIF")));
        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click here to close ");
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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Utopia", 1, 18));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel4, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suppliers Name", "Amount Quoted", "Rank"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "quotation_no", null, null, null));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jComboBox1, gridBagConstraints);

        jLabel11.setText("Analysis Mode");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel11, gridBagConstraints);

        jScrollPane11.setBorder(new javax.swing.border.TitledBorder("Additional information to aid in selection of prefered supplier"));
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
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        getContentPane().add(jScrollPane11, gridBagConstraints);

        jComboBox11.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "quotation_no", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jComboBox11, gridBagConstraints);

        jButton3.setText("Replace Supplier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton5.setMnemonic('l');
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton5, gridBagConstraints);

        setBounds(0, 0, 560, 350);
    }//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                 this.getContentPane().removeAll();
                 this.initComponents();
                 this.jComboBox1.setSelectedItem(null);
                 this.jComboBox11.setSelectedItem(null);
                
                 
                 // Add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
/*         try {
//            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/insurance","postgres","pilsiner");
            java.sql.Statement pstmt = connectDB.createStatement();
           // pstmt.executeUpdate("insert into AAA values('"+jTable1.getValueAt(numRows,numCols)+"')");
           java.sql.ResultSet rs = pstmt.executeQuery("select DISTINCT policy_type from received_quotations where quotation_no = '"+jComboBox1.getSelectedItem()+"' AND analysed_quotation = 'false'");
       while (rs.next())
  //      jTextField1.setText(rs.getObject(1).toString());
     
 } catch(java.sql.SQLException sqlex){
        System.out.println(sqlex.getMessage());
         }
         
        crset2.setCommand("select company_name,premium_quoted from received_quotations where quotation_no = '"+jComboBox1.getSelectedItem()+"' AND analysed_quotation = 'false' order by premium_quoted ASC");
        crset2.setConnectionSource(pConnDB);
      //  crset2.setPassword("02dde31c1e088885b829e604d93c59537b939677443a01eed560bfde82479bbd037133f02072", true);
           
        try {
            crset2.execute();
                     jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(crset2, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("company_name", "Company name", false),
            new org.netbeans.lib.sql.models.TableModel.Column("premium_quoted", "Premium quoted", false)
        }));
        jScrollPane1.setViewportView(jTable1);
        
        jButton1.setEnabled(true);
        
         } catch (java.sql.SQLException sle) {
               javax.swing.JOptionPane.showMessageDialog(this, sle.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
        
            System.out.println(sle.getMessage());
             sle.printStackTrace();
        }
                
         */// Add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
/*        try {
            java.lang.Class.forName("org.postgresql.Driver");
        }catch (java.lang.ClassNotFoundException sl){
            System.out.println(sl.getMessage());
       
        
        for (int i = 0; i < jTable1.getRowCount(); i++){
        
        try {
//            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/insurance","postgres","pilsiner");
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into analyse_quotation values(?, ?, ?, ?)");
            pstmt.setString(2,jTextField1.getText());
            pstmt.setString(1,jComboBox1.getSelectedItem().toString());
           // pstmt.setObject(3,jComboBox2.getSelectedItem().toString());
            pstmt.setObject(3,jTable1.getValueAt(i,0).toString());
            pstmt.setObject(4,jTable1.getValueAt(i,1).toString());
           // pstmt.setObject(5,jTable1.getValueAt(i,2).toString());
            pstmt.executeUpdate();
            
            jButton1.setEnabled(false);
            
            jLabel4.setForeground(java.awt.Color.blue);
            jLabel4.setText("Insert successful");
            
        }   catch(java.sql.SQLException sq){
            System.out.println(sq.getMessage());
             javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                        
            jLabel4.setForeground(java.awt.Color.red);
            jLabel4.setText("Sorry. Same commission Code already exists");
             }
        }
        
           try {
//            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/insurance","postgres","pilsiner");
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("update received_quotations set analysed_quotation ='true'  where quotation_no = '"+jComboBox1.getSelectedItem()+"'");
          
             pstmt.executeUpdate();
        }   catch(java.sql.SQLException sq){
            System.out.println(sq.getMessage());
             }
        
      
        */// Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       setVisible(false); // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
   // Add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
             // Add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JTable jTable11;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JSeparator jSeparator1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}