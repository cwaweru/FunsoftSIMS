/*
 * companyprflintfr.java
 *
 * Created on August 13, 2002, 11:36 AM
 */

package com.afrisoftech.hospinventory;

/**
 *
 * @author  root
 */
public class OpeningBalancesintfr extends javax.swing.JInternalFrame {
    
    private  javax.swing.JComboBox cmbox2 = new javax.swing.JComboBox();
    private  javax.swing.JComboBox cmbox = new javax.swing.JComboBox();
    javax.swing.JSpinner dateSpinner = null;
    javax.swing.JSpinner dateSpinner1 = null;
    
    
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public OpeningBalancesintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        try {
            crset2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jSearchDialog = new javax.swing.JDialog();
        jSearchPanel = new javax.swing.JPanel();
        jTextField111 = new javax.swing.JTextField();
        jSearchScrollPane = new javax.swing.JScrollPane();
        jSearchTable = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        try {
            searchRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            crset111 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        datePicker1 = new com.afrisoftech.lib.DatePicker();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        crset1.setConnectionSource(pConnDB);
        crset2.setCommand("select store_name from st_main_stores");
        crset2.setConnectionSource(pConnDB);
        nBCachedRowSet1.setCommand("select distinct cost_center from receive_requisation order by cost_center");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        jSearchDialog.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchDialog.setModal(true);
        jSearchDialog.setUndecorated(true);
        jSearchPanel.setLayout(new java.awt.GridBagLayout());

        jSearchPanel.setBorder(new javax.swing.border.EtchedBorder());
        jTextField111.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField111CaretUpdate(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jSearchPanel.add(jTextField111, gridBagConstraints);

        jSearchTable.setShowHorizontalLines(false);
        /*    try {
            searchRowSet.setCommand("select product,selling_price,gl_code FROM st_stock_prices WHERE department = 'Pharmacy' order by product");
            searchRowSet.setConnectionSource(pConnDB);

            searchRowSet.execute();

            // crset2.setExecuteOnLoad(true);
            jSearchTable.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet, new org.netbeans.lib.sql.models.TableModel.Column[] {
                new org.netbeans.lib.sql.models.TableModel.Column("product", "Description", false),
                new org.netbeans.lib.sql.models.TableModel.Column("selling_price", "Amount", false),
                new org.netbeans.lib.sql.models.TableModel.Column("gl_code", "Gl_code", false)

            }));
            // jSearchScrollPane.setViewportView(jSearchTable);

        } catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            System.out.println(sqlex.getMessage());
        }
        */
        jSearchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTableMouseClicked(evt);
            }
        });

        jSearchScrollPane.setViewportView(jSearchTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel.add(jSearchScrollPane, gridBagConstraints);

        jButton9.setText("Dispose");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel.add(jButton9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog.getContentPane().add(jSearchPanel, gridBagConstraints);

        searchRowSet1.setConnectionSource(pConnDB);
        crset111.setCommand("select distinct store_name from st_main_stores");
        crset111.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Main Store Opening Balances");
        setToolTipText("Please Enter The Qty Difference You Want To update");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
        jLabel12.setFont(new java.awt.Font("Utopia", 3, 18));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        getContentPane().add(jLabel12, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder(null, "Select store here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10)));
        jLabel1.setText(" Store");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset111, "store_name", null, null, null));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jComboBox1, gridBagConstraints);

        jLabel2.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(datePicker1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.TitledBorder(null, "Enter items & their balances. Plese NOTE that the value you enter will henceforth be taken as the quantity in stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10)));
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
                {null, null, null, null, null}
            },
            new String [] {
                "Item Description", "Units", "Saleable Qty.", "Expired Qty.", "Damaged Qty."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(false);
        // java.lang.Object[] strCmb = {"Payable","Receivable","Both"};

        //javax.swing.JComboBox cmBox = new javax.swing.JComboBox(strCmb);

        /*  javax.swing.SpinnerDateModel spinerDate = new javax.swing.SpinnerDateModel();
        dateSpinner = new javax.swing.JSpinner(spinerDate);

        javax.swing.table.TableColumn teditor = this.jTable1.getColumn("Expiry Date");

        teditor.setCellEditor(new javax.swing.DefaultCellEditor(dateSpinner));

        */

        /*
        cmbox2 = new javax.swing.JComboBox();

        try {

            crset1.setConnectionSource(pConnDB);
            crset1.execute("select description from stock_item ORDER BY description");

            cmbox2.setModel(new org.netbeans.lib.sql.models.ComboBoxModel(crset1, "description", null, null,null));

            javax.swing.table.TableColumn seditor = this.jTable1.getColumn("Item Description");

            seditor.setCellEditor(new javax.swing.DefaultCellEditor(cmbox2));

            /*  cmbox2.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    cmbox2ActionPerformed(evt);
                }
            });
            *
        } catch(java.sql.SQLException sqlExec) {

            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());

        }
        */

        javax.swing.table.TableColumn column = null;
        for (int i = 0; i < 5; i++) {
            column = jTable1.getColumnModel().getColumn(i);
            if (i == 0) {

                column.setPreferredWidth(300); //sport column is bigger
            } else {
                if (i == 1) {
                    column.setPreferredWidth(100);
                } else {
                    //if (i == 2) {
                        column.setPreferredWidth(100);
                        // }  else
                    //column.setPreferredWidth(50);

                }
            }
        }
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(new javax.swing.border.EtchedBorder());
        jButton1.setMnemonic('O');
        jButton1.setText("Ok");
        jButton1.setToolTipText("click to store data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jButton1, gridBagConstraints);

        jButton5.setMnemonic('r');
        jButton5.setText("Remove Row");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jButton5, gridBagConstraints);

        jButton3.setMnemonic('l');
        jButton3.setText("Clear");
        jButton3.setToolTipText("click to clear fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jButton3, gridBagConstraints);

        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click to close");
        jButton4.setSelected(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel3, gridBagConstraints);

        setBounds(0, 0, 750, 459);
    }//GEN-END:initComponents
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.jSearchDialog.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
    
    private void jSearchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTableMouseClicked
        jTable1.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(),0),jTable1.getSelectedRow(), 0);
        jTable1.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(),1),jTable1.getSelectedRow(), 1);
        this.jSearchDialog.dispose();
        // Add your handling code here:
    }//GEN-LAST:event_jSearchTableMouseClicked
    
    private void jTextField111CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField111CaretUpdate
        if(jTextField111.getCaretPosition() > 2){
            try {
                //  searchRowSet1.execute("select description,units FROM st_stock_item WHERE department ilike '"+jComboBox1.getSelectedItem().toString()+"%' and description ilike '"+jTextField111.getText()+"%' order by description");
                searchRowSet1.execute("select description,units  FROM st_stock_item WHERE description ILIKE '"+jTextField111.getText()+"%' and department ilike '"+this.jComboBox1.getSelectedItem().toString()+"%' order by description");
                
                jSearchTable.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
                    new org.netbeans.lib.sql.models.TableModel.Column("description", "Desc.", false),
                    new org.netbeans.lib.sql.models.TableModel.Column("units", "Units", false)
                    //  new org.netbeans.lib.sql.models.TableModel.Column("gl_code", "Gl code", false)
                }));
                jSearchScrollPane.setViewportView(jSearchTable);
                System.out.println("Cannot sort out");
            } catch(java.sql.SQLException sqlExec) {
                
                javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                
            }
        }// Add your handling code here:
    }//GEN-LAST:event_jTextField111CaretUpdate
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.getSelectedColumn() == 0) {
            
            this.cmbox1MouseClicked();
        }         // Add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
    private void cmbox1MouseClicked() {
        
        System.out.println("Showing dialog");
        java.awt.Point point = jScrollPane1.getLocationOnScreen();
        jSearchDialog.setSize(400,200);
        jSearchDialog.setLocation(point);
        jSearchDialog.show();
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);        // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
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
        }        // Add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        jButton1.setEnabled(true);
    /*    crset1.setCommand("select distinct item_description FROM receive_requisation WHERE cost_center = '"+jComboBox1.getSelectedItem()+"' AND issiued = false");
         crset1.setConnectionSource(pConnDB);
     
    cmbox.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "item_description", null, null, null));
    javax.swing.table.TableColumn s = this.jTable1.getColumn("Item description");
    s.setCellEditor(new javax.swing.DefaultCellEditor(cmbox));
                cmbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxActionPerformed(evt);
            }
        });
     
     */
        // Add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int k = 0; k < jTable1.getRowCount(); k++ ) {
            for (int r = 0; r < jTable1.getColumnCount(); r++ ) {
                jTable1.getModel().setValueAt(null,k,r);
            }
        }
        
        this.jComboBox1.setSelectedItem(null);
        //  jComboBox11.setSelectedItem(null); // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        try {
            try {
                
                connectDB.setAutoCommit(false);
                for (int i = 0; i< jTable1.getRowCount(); i++) {
                    
                    if (jTable1.getModel().getValueAt(i,2) != null){
                        
                        double actual = 0.00;
                        double comp = 0.00;
                        double total = 0.00;
                        double price = 0.00;
                        String units = null;
                        String user = null;
                        double quantity = Double.parseDouble(jTable1.getModel().getValueAt(i, 2).toString());
                        double expired = Double.parseDouble(jTable1.getModel().getValueAt(i, 3).toString());
                        double damaged = Double.parseDouble(jTable1.getModel().getValueAt(i, 4).toString());
                        
                        actual = quantity + expired + damaged;
                        java.sql.Statement pstmt6 = connectDB.createStatement();
                        java.sql.ResultSet rs6 = pstmt6.executeQuery("select item_code,quantity_instock,buying_price from st_stock_item where description ilike '"+jTable1.getValueAt(i,0)+"' and department = '"+jComboBox1.getSelectedItem().toString()+"'");
                        while (rs6.next())
                            units = rs6.getObject(1).toString();
                        comp = rs6.getDouble(2);
                        price = rs6.getDouble(3);
                        
                        java.sql.Statement pst2 = connectDB.createStatement();
                        java.sql.ResultSet rs = pst2.executeQuery("select current_user");
                        while (rs.next())
                            user = rs.getObject(1).toString();
                        
                        java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into st_stock_count values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)");
                        pstmt.setObject(1,units);
                        pstmt.setObject(2,jTable1.getValueAt(i,0));
                        pstmt.setDouble(3,comp);
                        pstmt.setString(8,jComboBox1.getSelectedItem().toString());
                        pstmt.setObject(4,jTable1.getValueAt(i,2));
                        pstmt.setObject(5,jTable1.getValueAt(i,3));
                        pstmt.setObject(6,jTable1.getValueAt(i,4));
                        pstmt.setDouble(7,actual-comp);
                        pstmt.setString(9,user);
                        pstmt.setString(10,"0.00");
                        pstmt.setObject(11,"'now'");
                        pstmt.setObject(12,"'now'");
                        pstmt.setDouble(13,quantity*price);
                        pstmt.setDouble(14,price);
                        pstmt.setObject(15,jTable1.getValueAt(i,1));
                        pstmt.setObject(16,datePicker1.getDate().toString());
                        pstmt.executeUpdate();
                        double quantities = Double.parseDouble(jTable1.getModel().getValueAt(i, 2).toString());
                        
                        java.sql.PreparedStatement pstmt31 = connectDB.prepareStatement("UPDATE st_stock_item set quantity_instock = '"+jTable1.getValueAt(i,2).toString()+"' where department = '"+jComboBox1.getSelectedItem().toString()+"' and description = '"+jTable1.getValueAt(i,0).toString()+"'");
                        pstmt31.executeUpdate();
                    }
                }
                
                connectDB.commit();
                connectDB.setAutoCommit(true);
                
                jLabel12.setForeground(java.awt.Color.blue);
                javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfuly","Information message!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                
                this.jButton1.setEnabled(false);
                // javax.swing.JOptionPane.showMessageDialog(this, "Enter quantity issued","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                for (int k = 0; k < jTable1.getRowCount(); k++ ) {
                    for (int r = 0; r < jTable1.getColumnCount(); r++ ) {
                        jTable1.getModel().setValueAt(null,k,r);
                    }
                }
                
                this.jComboBox1.setSelectedItem(null);
            }   catch(java.sql.SQLException sq){
                javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                
                try {
                    connectDB.rollback();
                }catch (java.sql.SQLException sql){
                    javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } catch(java.lang.Exception ex) {
            System.out.println(ex.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this, "TRANSACTION ERROR : Please double check your entries.", "Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    private void cmboxActionPerformed(java.awt.event.ActionEvent evt) {
 /*    crset2.setCommand("select DISTINCT item_description from order_details where order_no = '"+jComboBox1.getSelectedItem()+"'");
     crset2.setConnectionSource(pconn1);
  */
        int i = jTable1.getSelectedRow();
        
        
        try {
            java.sql.Statement pstmt = connectDB.createStatement();
            //java.sql.ResultSet rs = pstmt.executeQuery("select sum(quantity_received-quantity_issued) from issiuing where item = '"+cmbox.getSelectedItem()+"'");
            java.sql.ResultSet rs = pstmt.executeQuery("select quantity from receive_requisation where item_description = '"+cmbox.getSelectedItem()+"' AND issiued = false");
            
            while (rs.next()){
                jTable1.setValueAt(rs.getObject(1),i,1);
                //  jTextField8.setText(rs.getObject(2).toString());
                
            }
            
            java.sql.Statement pstmt1 = connectDB.createStatement();
            //java.sql.ResultSet rs = pstmt.executeQuery("select sum(quantity_received-quantity_issued) from issiuing where item = '"+cmbox.getSelectedItem()+"'");
            java.sql.ResultSet rs1 = pstmt1.executeQuery("select sum(quantity_received - quantity_issued) from stock_cardex where item = '"+cmbox.getSelectedItem()+"' GROUP BY item");
            
            while (rs1.next()){
                jTable1.setValueAt(rs1.getObject(1),i,2);
                //  jTextField8.setText(rs.getObject(2).toString());
                
            }
            
        } catch(java.sql.SQLException sqlex){
            System.out.println(sqlex.getMessage());
        }
        
        // Add your handling code here:
    }
      /* private void cmbox2ActionPerformed(java.awt.event.ActionEvent evt){
      int i = jTable1.getSelectedRow();
       
 }
       */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jSearchDialog;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet searchRowSet1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jSearchScrollPane;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jSearchPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jTextField111;
    private javax.swing.JButton jButton9;
    private javax.swing.JTable jSearchTable;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JButton jButton4;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private org.netbeans.lib.sql.NBCachedRowSet crset111;
    private com.afrisoftech.lib.DatePicker datePicker1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
