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
public class SaccoDeductionsintfr extends javax.swing.JInternalFrame implements java.lang.Runnable {
    
    /** Creates new form Members */
    private javax.swing.JComboBox cmbox;
    private javax.swing.JComboBox cmbox1;
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public SaccoDeductionsintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
        try {
            crset21 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jSearchDialog = new javax.swing.JDialog();
        jSearchPanel = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jSearchScrollPane = new javax.swing.JScrollPane();
        jSearchTable = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        try {
            searchRowSet = new org.netbeans.lib.sql.NBCachedRowSet();
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        datePicker1 = new com.afrisoftech.lib.DatePicker();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        crset2.setCommand("");
        crset2.setConnectionSource(pConnDB);
        crset21.setCommand(" select distinct upper(description) as description from deductions_allowances order by description");
        crset21.setConnectionSource(pConnDB);
        jSearchDialog.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchDialog.setModal(true);
        jSearchDialog.setUndecorated(true);
        jSearchPanel.setLayout(new java.awt.GridBagLayout());

        jSearchPanel.setBorder(new javax.swing.border.EtchedBorder());
        jTextField11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField11CaretUpdate(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jSearchPanel.add(jTextField11, gridBagConstraints);

        jSearchTable.setModel(new org.netbeans.lib.sql.models.TableModel(null));
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

        searchRowSet.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Contributions/Deductions");
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
        gridBagConstraints.gridx = 4;
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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jButton252, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 6;
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
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jLabel4, gridBagConstraints);

        jPanel21.setLayout(new java.awt.GridBagLayout());

        jPanel21.setBorder(new javax.swing.border.TitledBorder("Enter deductions here"));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Staff No.", "Staff Name", "Sacco No.", "Amount KShs.", "Monthly Deductions", "Interest"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(false);
        /*         cmbox1 = new javax.swing.JComboBox();
        cmbox = new javax.swing.JComboBox();
        try {

            crset2.setConnectionSource(pConnDB);
            crset2.execute("select DISTINCT employee_no from master_file ORDER BY employee_no");

            cmbox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel(crset2, "employee_no", null, null,null));

            javax.swing.table.TableColumn seditor = this.jTable1.getColumn("Staff No.");

            seditor.setCellEditor(new javax.swing.DefaultCellEditor(cmbox1));

            cmbox1.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    cmbox1ActionPerformed(evt);
                }
            });
        } catch(java.sql.SQLException sqlExec) {

            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());

        }
        */

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        jPanel21.add(jScrollPane1, gridBagConstraints);

        jLabel1.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        jPanel21.add(jLabel1, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset21, "description", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel21.add(jComboBox1, gridBagConstraints);

        jLabel3.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel21.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel21.add(datePicker1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jButton5, gridBagConstraints);

        jButton1.setMnemonic('d');
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel52, gridBagConstraints);

        setBounds(0, 0, 750, 449);
    }//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            for (int k = 0; k < jTable1.getRowCount(); k++){
                if (jTable1.getModel().getValueAt(k,0) != null){
                    
                    java.sql.PreparedStatement pstmt31w = connectDB.prepareStatement("delete from sacco_deductions WHERE staff_no ilike '"+jTable1.getValueAt(k,0).toString()+"%' and sacco_name ilike '"+jComboBox1.getSelectedItem().toString()+"%'");
                    pstmt31w.executeUpdate();
                }
            }
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), "Data deleted successfully","Information Message!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
        } catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sqlex.getMessage());
            
        }        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.jSearchDialog.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
    
    private void jSearchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTableMouseClicked
        jTable1.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(),0),jTable1.getSelectedRow(), 0);
        jTable1.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(),1),jTable1.getSelectedRow(), 1);
        
        jSearchDialog.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jSearchTableMouseClicked
    
    private void jTextField11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11CaretUpdate
        if(jTextField11.getCaretPosition() < 2){
            
            System.out.println("Nothing");
        }else{
            
            try {
                
                searchRowSet.execute("select employee_no,first_name||' '||middle_name||' '||last_name AS name,department from master_file where first_name||' '||middle_name||' '||last_name ILIKE '"+jTextField11.getText()+"%' ORDER BY first_name||' '||middle_name||' '||last_name");//||' '||second_name||' '||last_name");
                
                jSearchTable.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet, new org.netbeans.lib.sql.models.TableModel.Column[] {
                    new org.netbeans.lib.sql.models.TableModel.Column("employee_no", "Staff No", false),
                    new org.netbeans.lib.sql.models.TableModel.Column("name", "Name", false),
                    new org.netbeans.lib.sql.models.TableModel.Column("department", "Department", false)
                    //   new org.netbeans.lib.sql.models.TableModel.Column("year_of_birth", "Year of birth", false),
                    //  new org.netbeans.lib.sql.models.TableModel.Column("residence", "Residence", false)
                }));
                jSearchTable.setShowHorizontalLines(false);
                jSearchScrollPane.setViewportView(jSearchTable);
                
                
            } catch(java.sql.SQLException sqlExec) {
                
                javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                
            }
        }        // Add your handling code here:
    }//GEN-LAST:event_jTextField11CaretUpdate
    private void cmboxMouseClicked() {
        
        System.out.println("Showing dialog");
        java.awt.Point point = jTable1.getLocationOnScreen();
        jSearchDialog.setSize(400,200);
        jSearchDialog.setLocation(point);
        jSearchDialog.show();
        
        
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.getSelectedColumn() == 0) {
            
            this.cmboxMouseClicked();
        }           // Add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
  /*  private void cmbox1ActionPerformed(java.awt.event.ActionEvent evt){
        int i = jTable1.getSelectedRow();
   
        try {
   
            java.sql.Statement pstm = connectDB.createStatement();
            java.sql.ResultSet rset1 = pstm.executeQuery("select first_name||' '||middle_name||' '||last_name from master_file where employee_no = '"+cmbox1.getSelectedItem()+"'");
            while (rset1.next()){
                jTable1.setValueAt(rset1.getObject(1),i,1);
            }
        } catch(java.sql.SQLException sqlex){
            System.out.println(sqlex.getMessage());
        }
    }*/
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
        javax.swing.JFrame pat = new SaccoDeduction(connectDB, pConnDB,jComboBox1.getSelectedItem().toString());
        pat.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_jButton152ActionPerformed
    
    private void jButton301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton301ActionPerformed
        try {
            String Types = null;
            try {
                connectDB.setAutoCommit(false);
                java.sql.Statement pss = connectDB.createStatement();
                java.sql.ResultSet rst = pss.executeQuery("select allowance_deduction from deductions_allowances where description ILIKE '"+jComboBox1.getSelectedItem().toString()+"%'");
                while (rst.next()){
                    Types = rst.getObject(1).toString();
                }
                java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into sacco_deductions values(?,?,?,?,?,?,?,?,?,?)");
                for (int i = 0; i < jTable1.getRowCount(); i++){
                    if (jTable1.getModel().getValueAt(i,0) != null){
                        if (jComboBox1.getSelectedItem() == null){
                            javax.swing.JOptionPane.showMessageDialog(this,"Enter Staff Name","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                        }else{
                            pstmt.setObject(1,jTable1.getValueAt(i,0).toString());
                        }
                        //                  pstmt.setObject(1,jTable1.getValueAt(i,0).toString());
                        pstmt.setObject(2,jTable1.getValueAt(i,1).toString());
                        if (jTable1.getModel().getValueAt(i,3) == null){
                            javax.swing.JOptionPane.showMessageDialog(this,"Enter amount deducted","Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                            
                        }else{
                            pstmt.setObject(3,jTable1.getValueAt(i,3).toString());
                        }
                        pstmt.setObject(4,jTable1.getValueAt(i,4).toString());
                        pstmt.setObject(5,jTable1.getValueAt(i,2).toString());
                        pstmt.setString(6,datePicker1.getDate().toString());
                        pstmt.setString(7,jComboBox1.getSelectedItem().toString());
                        pstmt.setObject(8,jTable1.getValueAt(i,5).toString());
                        pstmt.setObject(9,jTable1.getValueAt(i,3).toString());
                        pstmt.setString(10,Types);
                        // pstmt.setBoolean(7,true);
                        pstmt.executeUpdate();
                        
                    }
                }
                
                connectDB.commit();
                connectDB.setAutoCommit(true);
                
                javax.swing.JOptionPane.showMessageDialog(this,"Insert Done Successfully","Comfirmation Message!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JDialog jSearchDialog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jSearchScrollPane;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JButton jButton301;
    private javax.swing.JButton jButton252;
    private javax.swing.JPanel jSearchPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JButton jButton202;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JButton jButton9;
    private javax.swing.JTable jSearchTable;
    private javax.swing.JButton jButton5;
    private org.netbeans.lib.sql.NBCachedRowSet searchRowSet;
    private javax.swing.JPanel jPanel21;
    private com.afrisoftech.lib.DatePicker datePicker1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JButton jButton152;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
