/*
 * DatePanel.java
 *
 * Created on May 1, 2003, 7:40 PM
 */

package com.afrisoftech.lib;

/**
 *
 * @author  root
 */
public class DataSheetTSCDatePanel extends javax.swing.JDialog {
    
    int reportName;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    java.sql.Connection connectDB = null;
    
    java.util.Vector dateStartEnd = null;
    
    javax.swing.JSpinner beginDateSpinner = null;
    
    javax.swing.JSpinner endDateSpinner = null;
    
    /** Creates new form DatePanel */
  //  public ResignByReasonPanel(java.awt.Frame parent, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB, boolean modal, int repName, java.sql.Connection connectDb) {
       public DataSheetTSCDatePanel(java.awt.Frame parent, boolean modal, int repName, java.sql.Connection connectDb) {
      
        super(parent, modal);
        
        reportName = repName;
        
        connectDB = connectDb;
        
       // pConnDB = pconnDB;
        //      dateStartEnd = new java.util.Vector(1,1);
        
        initComponents();
        
        //       return dateStartEnd;
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
        jSearchDialog1 = new javax.swing.JDialog();
        jSearchPanel1 = new javax.swing.JPanel();
        jTextField1111 = new javax.swing.JTextField();
        jSearchScrollPane1 = new javax.swing.JScrollPane();
        jSearchTable1 = new javax.swing.JTable();
        jButton41 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        try {
            searchRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        datePicker1 = new com.afrisoftech.lib.DatePicker();
        datePicker2 = new com.afrisoftech.lib.DatePicker();

        crset1.setConnectionSource(pConnDB);
        jSearchDialog1.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchDialog1.setModal(true);
        jSearchDialog1.setUndecorated(true);
        jSearchPanel1.setLayout(new java.awt.GridBagLayout());

        jSearchPanel1.setBorder(new javax.swing.border.EtchedBorder());
        jTextField1111.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1111CaretUpdate(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 300.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel1.add(jTextField1111, gridBagConstraints);

        jSearchTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jSearchTable1.setToolTipText("Click on the target row to select the patient from the search.");
        jSearchTable1.setShowHorizontalLines(false);
        /*javax.swing.table.TableColumn column = null;

        for (int i = 0; i < 4; i++) {

            column = jSearchTable.getColumnModel().getColumn(i);

            if (i == 1) {

                column.setPreferredWidth(400);
                //sport column is bigger
            } else {

                column.setPreferredWidth(200);

            }
        }
        */
        jSearchTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable1MouseClicked(evt);
            }
        });

        jSearchScrollPane1.setViewportView(jSearchTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel1.add(jSearchScrollPane1, gridBagConstraints);

        jButton41.setText("Select");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel1.add(jButton41, gridBagConstraints);

        jButton51.setText("Close");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel1.add(jButton51, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog1.getContentPane().add(jSearchPanel1, gridBagConstraints);

        searchRowSet1.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setTitle("Data Sheet Select panel");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(new javax.swing.border.EtchedBorder());
        jButton2.setText("Cancel");
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
        jPanel3.add(jButton2, gridBagConstraints);

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
        jPanel3.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(new javax.swing.border.TitledBorder(null, "Select TSC no here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(153, 0, 153)));
        jLabel5.setText("TSC No. that ends with");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jLabel5, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jComboBox1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel4, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        /*
        try{
            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);
            java.util.Date dateInstance = java.util.Calendar.getInstance().getTime();

            // java.util.Date formattedDate1 = rset.getDate(1);

            java.util.Date formattedDate = dateFormat.parse(dateInstance.toLocaleString());
            System.out.println(dateFormat.format(formattedDate));
            javax.swing.SpinnerDateModel beginDate = new javax.swing.SpinnerDateModel(formattedDate, null, null,java.util.Calendar.DAY_OF_MONTH);
            javax.swing.SpinnerDateModel endDate = new javax.swing.SpinnerDateModel(formattedDate, null, null,java.util.Calendar.DAY_OF_MONTH);

            beginDateSpinner = new javax.swing.JSpinner(beginDate);
            endDateSpinner = new javax.swing.JSpinner(endDate);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            jPanel1.add(beginDateSpinner, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            jPanel1.add(endDateSpinner, gridBagConstraints);

        } catch(java.text.ParseException parseExec) {

            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), parseExec.getMessage());

        }*/

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(new javax.swing.border.EtchedBorder());
        jLabel1.setText("Begin Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        jTextField1.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jTextField1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel1.add(datePicker1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel1.add(datePicker2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(400, 210));
        setLocation((screenSize.width-400)/2,(screenSize.height-210)/2);
    }//GEN-END:initComponents

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
// jSearchDialog1.dispose();          // Add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jSearchTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable1MouseClicked
 //jTextField36.setText(jSearchTable1.getValueAt(jSearchTable1.getSelectedRow(), 0).toString());
        //      jTextField2.setText(jSearchTable1.getValueAt(jSearchTable1.getSelectedRow(), 1).toString());
               // jTextField22.setText(jSearchTable1.getValueAt(jSearchTable1.getSelectedRow(), 2).toString());
             
               /* try {
                    // if(this.jCheckBox1.isSelected()){
                    java.sql.Statement stmt1 = connectDB.createStatement();
                    java.sql.ResultSet rset1 = stmt1.executeQuery("select patient_category,payment_mode from hp_patient_card where patient_no  ='"+jTextField36.getText()+"' order by date desc limit 1");
                    while (rset1.next()){
                        jTextField2.setText(rset1.getObject(1).toString());
                        jTextField4.setText(rset1.getObject(2).toString());
                    }
                    
                } catch (java.sql.SQLException sqe) {
                    sqe.printStackTrace();
                    //  System.out.println("Insert not successful");
                }
                
                
            }
        }
                */
       // jSearchDialog1.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jSearchTable1MouseClicked

    private void jTextField1111CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1111CaretUpdate
/*if(this.jTextField1111.getCaretPosition() < 3){
            System.out.print("Nothing");
        }else{
        if(this.jCheckBox1.isSelected()){
        try {
                    searchRowSet1.execute("select payroll_no, member_name as name from member_resignation where payroll_no ILIKE '"+jTextField1111.getText().toString()+"%' and reason ilike '"+jComboBox1.getSelectedItem().toString()+"' ORDER BY payroll_no");
                    
                    jSearchTable1.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
                        new org.netbeans.lib.sql.models.TableModel.Column("name", "Staff Name", false),
                        new org.netbeans.lib.sql.models.TableModel.Column("payroll_no", "TSC No", false)
                       //  new org.netbeans.lib.sql.models.TableModel.Column("loan_no", "Loan No.", false)
                    }));
                    jSearchTable1.setShowHorizontalLines(false);
                    jSearchScrollPane1.setViewportView(jSearchTable1);
                    
                    
                } catch(java.sql.SQLException sqlExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                    
                }
        }else{
            try {
                     searchRowSet1.execute("select payroll_no, member_name as name from member_resignation and member_name ILIKE '"+jTextField1111.getText().toString()+"%' and reason ilike '"+jComboBox1.getSelectedItem().toString()+"' ORDER BY payroll_no");
                    
                    jSearchTable1.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
                        new org.netbeans.lib.sql.models.TableModel.Column("name", "Staff Name", false),
                        new org.netbeans.lib.sql.models.TableModel.Column("payroll_no", "TSC No", false)
                       //  new org.netbeans.lib.sql.models.TableModel.Column("loan_no", "Loan No.", false)
                    }));
                    jSearchTable1.setShowHorizontalLines(false);
                    jSearchScrollPane1.setViewportView(jSearchTable1);
                    
                    
                } catch(java.sql.SQLException sqlExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                    
                }
        }
        }
        */            // Add your handling code here:
    }//GEN-LAST:event_jTextField1111CaretUpdate
 /* private void searchButton11Clicked() {
        
        System.out.println("Showing dialog");
    
                jSearchDialog1.dispose();
                java.awt.Point point = this.jTextField36.getLocationOnScreen();
                
                jSearchDialog1.setSize(400,200);
                
                jSearchDialog1.setLocation(point);
                jSearchDialog1.show();
            
        
    }*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.getReport(reportName);
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //    new DatePanel(new javax.swing.JFrame(), true).show();
    }
    
    public java.util.Vector getBeginEndDates() {
        
        dateStartEnd = new java.util.Vector(1,1);
        
        dateStartEnd.addElement(beginDateSpinner.getValue().toString());
        
        dateStartEnd.addElement(endDateSpinner.getValue().toString());
        
        return dateStartEnd;
        
    }
    
    public void getReport(int reportName) {
        
        switch (reportName) {
           case 5212:
                            
            {
                com.afrisoftech.sacco.MbrResignByReasonPdf policy = new com.afrisoftech.sacco.MbrResignByReasonPdf();
                            
              //  policy.MbrResignByReasonPdf(connectDB, this.datePicker1.getDate().toString(), this.datePicker2.getDate().toString(), this.jComboBox1);
   policy.MbrResignByReasonPdf(connectDB, this.datePicker1.getDate().toString(), this.datePicker2.getDate().toString(), this.jComboBox1.getSelectedItem().toString());

               this.dispose();
               
             } break;
            
          case 5239:
                            
            {
                com.afrisoftech.sacco.DataSheetPdf policy = new com.afrisoftech.sacco.DataSheetPdf();
                            
                policy.DataSheetPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(), this.jComboBox1.getSelectedItem().toString());

               this.dispose();
               
             } break;
             
              case 5240:
                            
            {
                com.afrisoftech.sacco.DataSheetNewMbrsPdf policy = new com.afrisoftech.sacco.DataSheetNewMbrsPdf();
                            
                policy.DataSheetNewMbrsPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(), this.jComboBox1.getSelectedItem().toString());

               this.dispose();
               
             } break;
             
              case 5243:
                            
            {
                com.afrisoftech.sacco.MbrLoanbalDataSheetPdf policy = new com.afrisoftech.sacco.MbrLoanbalDataSheetPdf();
                            
                policy.MbrLoanbalDataSheetPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(), this.jComboBox1.getSelectedItem().toString());

               this.dispose();
               
             } break;
                         default :  ;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.afrisoftech.lib.DatePicker datePicker2;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1111;
    private javax.swing.JPanel jPanel4;
    private org.netbeans.lib.sql.NBCachedRowSet searchRowSet1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jSearchPanel1;
    private javax.swing.JDialog jSearchDialog1;
    private javax.swing.JButton jButton41;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JButton jButton51;
    private javax.swing.JTable jSearchTable1;
    private com.afrisoftech.lib.DatePicker datePicker1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane jSearchScrollPane1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
}
