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
public class HosLoanStockDatePanel extends javax.swing.JDialog {
    
    int reportName;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    java.sql.Connection connectDB = null;
    
    java.util.Vector dateStartEnd = null;
    
    javax.swing.JSpinner beginDateSpinner = null;
    
    javax.swing.JSpinner endDateSpinner = null;
    
    /** Creates new form DatePanel */
    public HosLoanStockDatePanel(java.awt.Frame parent, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB, boolean modal, int repName, java.sql.Connection connectDb) {
        
        super(parent, modal);
        
        reportName = repName;
        
        connectDB = connectDb;
        
        pConnDB = pconnDB;
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
        jSearchDialog11 = new javax.swing.JDialog();
        jSearchPanel11 = new javax.swing.JPanel();
        jTextField11111 = new javax.swing.JTextField();
        jSearchScrollPane11 = new javax.swing.JScrollPane();
        jSearchTable11 = new javax.swing.JTable();
        jButton511 = new javax.swing.JButton();
        try {
            searchRowSet11 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        datePicker1 = new com.afrisoftech.lib.DatePicker();
        datePicker2 = new com.afrisoftech.lib.DatePicker();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jTextField361 = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();

        crset1.setCommand("select DISTINCT lender_name from pb_loan order by lender_name");
        crset1.setConnectionSource(pConnDB);
        jSearchDialog11.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchDialog11.setModal(true);
        jSearchDialog11.setUndecorated(true);
        jSearchPanel11.setLayout(new java.awt.GridBagLayout());

        jSearchPanel11.setBorder(new javax.swing.border.EtchedBorder());
        jTextField11111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11111ActionPerformed(evt);
            }
        });

        jTextField11111.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField11111CaretUpdate(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 300.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel11.add(jTextField11111, gridBagConstraints);

        jSearchTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jSearchTable11.setToolTipText("Click on the target row to select the patient from the search.");
        jSearchTable11.setShowHorizontalLines(false);
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
        jSearchTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable11MouseClicked(evt);
            }
        });

        jSearchScrollPane11.setViewportView(jSearchTable11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel11.add(jSearchScrollPane11, gridBagConstraints);

        jButton511.setText("Close");
        jButton511.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton511ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel11.add(jButton511, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog11.getContentPane().add(jSearchPanel11, gridBagConstraints);

        searchRowSet11.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setTitle("Begin & End Date");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

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
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(datePicker1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(datePicker2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(new javax.swing.border.EtchedBorder());
        jButton2.setMnemonic('c');
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
        jPanel3.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(new javax.swing.border.TitledBorder("Select creditor here.."));
        jLabel4.setText("Lender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jLabel4, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset1, "lender_name", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel4.add(jComboBox1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel4, gridBagConstraints);

        jLabel3.setText("Invoice No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel3, gridBagConstraints);

        jPanel61.setLayout(new java.awt.GridBagLayout());

        jPanel61.setBorder(new javax.swing.border.EtchedBorder());
        jPanel61.setMinimumSize(new java.awt.Dimension(82, 37));
        jTextField361.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel61.add(jTextField361, gridBagConstraints);

        searchButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif")));
        searchButton1.setToolTipText("Search Patient's Invoice");
        searchButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton1.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton1.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel61.add(searchButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(jPanel61, gridBagConstraints);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(425, 247));
        setLocation((screenSize.width-425)/2,(screenSize.height-247)/2);
    }//GEN-END:initComponents
    
    private void jTextField11111CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11111CaretUpdate
        try {
            searchRowSet11.execute("select trim(invoice_no) as scheme,date as name from ac_accounts_payable where invoice_no ILIKE '"+jTextField11111.getText().toString()+"%' and dealer = '"+this.jComboBox1.getSelectedItem()+"' and date between '"+this.datePicker1.getDate()+"' and '"+this.datePicker2.getDate()+"' ORDER BY date");
            
            jSearchTable11.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet11, new org.netbeans.lib.sql.models.TableModel.Column[] {
                new org.netbeans.lib.sql.models.TableModel.Column("scheme", "Invoice No.", false),
                new org.netbeans.lib.sql.models.TableModel.Column("name", "Date", false)
                
            }));
            jSearchTable11.setShowHorizontalLines(false);
            jSearchScrollPane11.setViewportView(jSearchTable11);
            
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }    // Add your handling code here:
    }//GEN-LAST:event_jTextField11111CaretUpdate
    
    private void jButton511ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton511ActionPerformed
        jSearchDialog11.dispose();
        // Add your handling code here:
    }//GEN-LAST:event_jButton511ActionPerformed
    
    private void jSearchTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable11MouseClicked
        jTextField361.setText(jSearchTable11.getValueAt(jSearchTable11.getSelectedRow(), 0).toString());
        // jTextField11.setText(jSearchTable1.getValueAt(jSearchTable1.getSelectedRow(), 1).toString());
        
        jSearchDialog11.dispose();          // Add your handling code here:
    }//GEN-LAST:event_jSearchTable11MouseClicked
    
    private void jTextField11111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11111ActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_jTextField11111ActionPerformed
    
    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        searchButton111Clicked();        // Add your handling code here:
    }//GEN-LAST:event_searchButton1ActionPerformed
    private void searchButton111Clicked() {
        
        System.out.println("Showing dialog");
        
        jSearchDialog11.dispose();
        
        java.awt.Point point = this.jTextField361.getLocationOnScreen();
        jSearchDialog11.setLocation(point);
        
        jSearchDialog11.setSize(400,200);
        
        
        jSearchDialog11.show();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        dispose();
        // Add your handling code here:
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
            
            
         /*   
            case 36:
                
            {
                com.afrisoftech.reports.DiscCreditorsInvoicesPdf policy = new com.afrisoftech.reports.DiscCreditorsInvoicesPdf();
                
                policy.DiscCreditorsInvoicesPdf(connectDB, this.datePicker1.getDate().toLocaleString(), this.datePicker2.getDate().toLocaleString(),jComboBox1.getSelectedItem().toString(),this.jTextField361.getText());
                
                
                this.dispose();
                
            } break;
            */
            
            case 4701:
                
            {
                com.afrisoftech.reports.LoanStatementPdf policy = new com.afrisoftech.reports.LoanStatementPdf();
                
                policy.LoanStatementPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(),jComboBox1.getSelectedItem().toString());
                
                
                this.dispose();
                
            } break;
            
         /*   
            case 68:
                
            {
                com.afrisoftech.reports.InvPerCreditorsPdf policy = new com.afrisoftech.reports.InvPerCreditorsPdf();
                
                policy.InvPerCreditorsPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(),jComboBox1.getSelectedItem().toString());
                
                
                this.dispose();
                
            } break;
            
            case 69:
                
            {
                com.afrisoftech.reports.PaymentsPerCreditorsPdf policy = new com.afrisoftech.reports.PaymentsPerCreditorsPdf();
                
                policy.PaymentsPerCreditorsPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(),jComboBox1.getSelectedItem().toString());
                
                
                this.dispose();
                
            } break;
            case 181:
                
            {
                com.afrisoftech.reports.CreditorsInvSummPdf policy = new com.afrisoftech.reports.CreditorsInvSummPdf();
                
                policy.CreditorsInvSummPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(),jComboBox1.getSelectedItem().toString());
                
                
                this.dispose();
                
            } break;
            
            case 180:
                
            {
                com.afrisoftech.reports.CreditorsStmtPdf policy = new com.afrisoftech.reports.CreditorsStmtPdf();
                
                policy.CreditorsStmtPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(),jComboBox1.getSelectedItem().toString());
                
                
                this.dispose();
                
            } break;
            
             case 1102:
                
            {
                com.afrisoftech.hospinventory.OrdersSummBySuppPdf policy = new com.afrisoftech.hospinventory.OrdersSummBySuppPdf();
                
                policy.OrdersSummBySuppPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate(),jComboBox1.getSelectedItem().toString());
                
                
                this.dispose();
                
            } break;
            
 /*           case 37:
  
            {
                com.afrisoftech.nocreports.AgeingPerCreditorsPdf policy = new com.afrisoftech.nocreports.AgeingPerCreditorsPdf();
  
                policy.AgeingPerCreditorsPdf(connectDB, this.datePicker1.getDate().toLocaleString(), this.datePicker2.getDate().toLocaleString(),jComboBox1.getSelectedItem().toString());
  
  
                this.dispose();
  
            } break;
      /*
            case 10:
  
            {
                com.afrisoftech.sacco.MemberStatementPdf policy = new com.afrisoftech.sacco.MemberStatementPdf();
  
                policy.MemberStatementPdf(connectDB, this.beginDateSpinner.getValue().toString(), this.endDateSpinner.getValue().toString(),this.jComboBox1.getSelectedItem().toString());
  
                this.dispose();
  
            }*/
            default :  ;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private com.afrisoftech.lib.DatePicker datePicker2;
    private javax.swing.JButton searchButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField11111;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jSearchScrollPane11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JDialog jSearchDialog11;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jSearchTable11;
    private javax.swing.JTextField jTextField361;
    private org.netbeans.lib.sql.NBCachedRowSet searchRowSet11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jButton511;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JPanel jSearchPanel11;
    private javax.swing.JComboBox jComboBox1;
    private com.afrisoftech.lib.DatePicker datePicker1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
