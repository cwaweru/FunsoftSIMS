
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
public class AllocateAllowanceintfr extends javax.swing.JInternalFrame implements java.lang.Runnable {
    
    /** Creates new form Members */
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    private javax.swing.JComboBox cmbox;
    
    
    public AllocateAllowanceintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
            rset1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            crset2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jSearchDialog2 = new javax.swing.JDialog();
        jSearchPanel2 = new javax.swing.JPanel();
        jTextField113 = new javax.swing.JTextField();
        jSearchScrollPane2 = new javax.swing.JScrollPane();
        jSearchTable2 = new javax.swing.JTable();
        jButton52 = new javax.swing.JButton();
        try {
            searchRowSet2 = new org.netbeans.lib.sql.NBCachedRowSet();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel612 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField91 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        rset1.setCommand("select employee_no from master_file order by employee_no");
        rset1.setConnectionSource(pConnDB);
        crset2.setCommand("");
        crset2.setConnectionSource(pConnDB);
        jSearchDialog2.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchDialog2.setModal(true);
        jSearchDialog2.setUndecorated(true);
        jSearchPanel2.setLayout(new java.awt.GridBagLayout());

        jSearchPanel2.setBorder(new javax.swing.border.EtchedBorder());
        jTextField113.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField113CaretUpdate(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 300.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel2.add(jTextField113, gridBagConstraints);

        jSearchTable2.setToolTipText("Click on the target row to select the patient from the search.");
        jSearchTable2.setShowHorizontalLines(false);
        /*javax.swing.table.TableColumn column = null;

        for (int i = 0; i < 4; i++) {

            column = jSearchTable2.getColumnModel().getColumn(i);

            if (i == 1) {

                column.setPreferredWidth(400);
                //sport column is bigger
            } else {

                column.setPreferredWidth(200);

            }
        }
        */
        jSearchTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable2MouseClicked(evt);
            }
        });

        jSearchScrollPane2.setViewportView(jSearchTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel2.add(jSearchScrollPane2, gridBagConstraints);

        jButton52.setText("Dispose");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel2.add(jButton52, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog2.getContentPane().add(jSearchPanel2, gridBagConstraints);

        searchRowSet2.setConnectionSource(pConnDB);

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

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel612.setText("Staff No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel612, gridBagConstraints);

        jLabel2.setText("Staff Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jTextField2.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jTextField2, gridBagConstraints);

        jTextField3.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jTextField3, gridBagConstraints);

        jLabel3.setText("Department");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(new javax.swing.border.EtchedBorder());
        jTextField91.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jTextField91, gridBagConstraints);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif")));
        searchButton.setToolTipText("Search");
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel4.add(searchButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel4, gridBagConstraints);

        jLabel1.setText("Category");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel1, gridBagConstraints);

        jTextField1.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = -20;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jPanel1, gridBagConstraints);

        jPanel21.setLayout(new java.awt.GridBagLayout());

        jPanel21.setBorder(new javax.swing.border.TitledBorder("Enter Benefits Allocated Here"));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Allowance Type", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(false);
        cmbox = new javax.swing.JComboBox();
        //cmbox3 = new javax.swing.JComboBox();

        try {

            crset2.setConnectionSource(pConnDB);
            crset2.execute("select description from deductions_allowances EXCEPT select tax_type from tax_setup ORDER BY description ");

            cmbox.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset2, "description", null, null, null));
            javax.swing.table.TableColumn s = this.jTable1.getColumn("Allowance Type");
            s.setCellEditor(new javax.swing.DefaultCellEditor(cmbox));
            cmbox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cmboxActionPerformed(evt);
                }
            });
        } catch(java.sql.SQLException sqlExec) {

            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());

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
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 13.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
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
    
    private void jSearchTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable2MouseClicked
        jTextField2.setText(jSearchTable2.getValueAt(jSearchTable2.getSelectedRow(), 1).toString());
        jTextField91.setText(jSearchTable2.getValueAt(jSearchTable2.getSelectedRow(), 0).toString());
        jTextField3.setText(jSearchTable2.getValueAt(jSearchTable2.getSelectedRow(), 2).toString());
        jTextField1.setText(jSearchTable2.getValueAt(jSearchTable2.getSelectedRow(), 3).toString());
        
        jSearchDialog2.dispose();
        // Add your handling code here:
    }//GEN-LAST:event_jSearchTable2MouseClicked
    
    private void jTextField113CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField113CaretUpdate
        if(jTextField113.getCaretPosition() < 2){
            
            System.out.println("Nothing");
        }else{
            
            try {
                
                searchRowSet2.execute("select employee_no,first_name||' '||middle_name||' '||last_name AS name,department,company_name from master_file where first_name||' '||middle_name||' '||last_name ILIKE '"+jTextField113.getText()+"%'");//||' '||second_name||' '||last_name");
                
                jSearchTable2.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet2, new org.netbeans.lib.sql.models.TableModel.Column[] {
                    new org.netbeans.lib.sql.models.TableModel.Column("employee_no", "Staff No", false),
                    new org.netbeans.lib.sql.models.TableModel.Column("name", "Name", false),
                    new org.netbeans.lib.sql.models.TableModel.Column("department", "Department", false),
                    new org.netbeans.lib.sql.models.TableModel.Column("company_name", "Category", false)
                    //  new org.netbeans.lib.sql.models.TableModel.Column("residence", "Residence", false)
                }));
                jSearchTable2.setShowHorizontalLines(false);
                jSearchScrollPane2.setViewportView(jSearchTable2);
                
                
            } catch(java.sql.SQLException sqlExec) {
                
                javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                
            }
        }          // Add your handling code here:
    }//GEN-LAST:event_jTextField113CaretUpdate
    
    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        jSearchDialog2.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchButtonClicked();         // Add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed
    private void searchButtonClicked() {
        
        System.out.println("Showing dialog");
        
        // java.awt.Point point = this.jComboBox1311.getLocationOnScreen();
        java.awt.Point point = this.jTextField91.getLocationOnScreen();
        
        jSearchDialog2.setSize(400,200);
        
        jSearchDialog2.setLocation(point);
        
        jSearchDialog2.show();
        
        
        
    }         private void cmboxActionPerformed(java.awt.event.ActionEvent evt){
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
        javax.swing.JFrame pat = new AllocateAllowance(connectDB, pConnDB, jTextField91.getText());
        pat.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_jButton152ActionPerformed
    
    private void jButton301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton301ActionPerformed
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql.toString());
        try {
            String Desc = null;
            String Desc2 = null;
            String User1 = null;
            // java.lang.Object name = "false";
            try {
                connectDB.setAutoCommit(false);
                for (int i = 0; i < jTable1.getRowCount(); i++){
                    if (jTable1.getModel().getValueAt(i,0) != null){
                        java.sql.Statement pss = connectDB.createStatement();
                        java.sql.ResultSet rst = pss.executeQuery("select allowance_deduction from deductions_allowances where description ILIKE '"+jTable1.getModel().getValueAt(i,0).toString()+"%'");
                        while (rst.next())
                            Desc2 = rst.getObject(1).toString();
                        
                        java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into allowances_benefits values(?,?,?,?,?,?,?,?,?)");
                        pstmt.setString(1,jTextField91.getText());
                        pstmt.setString(2,jTextField2.getText());
                        pstmt.setString(3,jTextField3.getText());
                        pstmt.setObject(4,jTable1.getValueAt(i,0).toString());
                        pstmt.setObject(5,jTable1.getValueAt(i,1).toString());
                        // pstmt.setDate(6, datenowSql);
                        pstmt.setString(6,jTextField3.getText());
                        pstmt.setString(7, Desc2);
                        pstmt.setString(8,"false");
                        pstmt.setString(9,jTextField1.getText());
                        pstmt.executeUpdate();
                        
                    }
                }
                connectDB.commit();
                connectDB.setAutoCommit(true);
                
                jLabel4.setForeground(java.awt.Color.blue);
                javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), "Data saved","Information Message!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                
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
            
        } catch(java.lang.Exception ex) {
            System.out.println(ex.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this, "TRANSACTION ERROR : Please double check your entries.", "Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_jButton301ActionPerformed
    
    public void run() {
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jButton52;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JButton jButton301;
    private javax.swing.JButton jButton252;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JButton jButton202;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jSearchPanel2;
    private org.netbeans.lib.sql.NBCachedRowSet searchRowSet2;
    private org.netbeans.lib.sql.NBCachedRowSet rset1;
    private javax.swing.JDialog jSearchDialog2;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jSearchScrollPane2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField113;
    private javax.swing.JLabel jLabel612;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jButton152;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jSearchTable2;
    // End of variables declaration//GEN-END:variables
    
}
