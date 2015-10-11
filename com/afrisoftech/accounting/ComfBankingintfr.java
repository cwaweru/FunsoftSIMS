
/*
 * loanpymntintfr.java
 *
 * Created on August 13, 2002, 1:09 PM
 */

package com.afrisoftech.accounting;

/**
 *
 * @author  root
 */
public class ComfBankingintfr extends javax.swing.JInternalFrame {
    
    /** Creates new form loanpymntintfr */
      java.sql.Connection connectDB = null;
      
      javax.swing.table.TableModel tableModel = null;
      
      javax.swing.JSpinner beginDateSpinner = null;
    
      javax.swing.JSpinner endDateSpinner = null;
  
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    
    public ComfBankingintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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
            crset3 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            crset4 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try  {
            java.lang.Class.forName("org.postgresql.Driver");
            System.out.println("Found driver");
        } catch(java.lang.ClassNotFoundException cnf){
            System.out.println("driver not found");
        }
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField71 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        datePicker1 = new com.afrisoftech.lib.DatePicker();
        datePicker2 = new com.afrisoftech.lib.DatePicker();
        jLabel4 = new javax.swing.JLabel();

        crset2.setCommand("select DISTINCT account_name from ac_cash_book order by account_name");
        crset2.setConnectionSource(pConnDB);
        crset3.setCommand("select DISTINCT member_no from cash_book  WHERE member_no ~ '^00' order by member_no");
        crset3.setConnectionSource(pConnDB);
        crset4.setCommand("select cheque_no, debit,credit from cash_book ");
        crset4.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Comfirm Bankings");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ColorPreview.gif")));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButton1.setMnemonic('O');
        jButton1.setText("Ok");
        jButton1.setToolTipText("Click here to enter data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton3.setMnemonic('l');
        jButton3.setText("Clear");
        jButton3.setToolTipText("Click here to clear fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click here to close ");
        jButton4.setSelected(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel7, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(new javax.swing.border.TitledBorder(null, "Select Cashbook No.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11)));
        /*        tableModel = jTable1.getModel();

        tableModel.addTableModelListener(new javax.swing.event.TableModelListener() {

            public void tableChanged(javax.swing.event.TableModelEvent evt) {

                tableModelTableChanged(evt);

            }

        });
        */
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        jPanel3.add(jScrollPane1, gridBagConstraints);

        jTextField71.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(jTextField71, gridBagConstraints);

        jLabel9.setText("Account No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel9, gridBagConstraints);

        jLabel2.setText("Cash Book No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jLabel2, gridBagConstraints);

        jComboBox2.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset2, "account_name", null, null, null));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jComboBox2, gridBagConstraints);

        jLabel1.setText("Slip No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(jTextField1, gridBagConstraints);

        jLabel3.setText("Date Banked");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(datePicker1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel3.add(datePicker2, gridBagConstraints);

        jLabel4.setText("Slip Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 15.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPanel3, gridBagConstraints);

        setBounds(0, 0, 697, 500);
    }//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        this.dispose();
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       jButton1.setEnabled(true);
       this.jLabel7.setText("");
       
       int rowsNo = 0; 
       
       try {
           java.sql.Statement stmt = connectDB.createStatement();
           java.sql.Statement stmt1 = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("select account_no from ac_cash_book where account_name ='"+jComboBox2.getSelectedItem()+"' and banked = false AND date = '"+datePicker1.getDate().toString()+"'");
           java.sql.ResultSet rset1 = stmt1.executeQuery("select count(debit) from ac_cash_book where account_name ='"+jComboBox2.getSelectedItem()+"' and banked = false AND date = '"+datePicker1.getDate().toString()+"' group by bank_name");
           
           while (rset1.next()) {
               
               rowsNo = rset1.getInt(1);
               
           }
           if (rowsNo < 1) {
                      javax.swing.JOptionPane.showMessageDialog(this, "There are no items to Bank");
                } else {

                while (rset.next()){

                   jTextField71.setText(rset.getObject(1).toString());
                 //  jTextField1.setText(rset.getObject(2).toString());
                }
                 
             
        
        crset4.setCommand("select cheque_no,debit from ac_cash_book where account_name ='"+jComboBox2.getSelectedItem()+"' AND debit > 0 AND date = '"+datePicker1.getDate()+"' and banked = false");
        crset4.setConnectionSource(pConnDB);
    
       // try {
            crset4.execute();
        
       // crset2.setExecuteOnLoad(true);
        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(crset4, new org.netbeans.lib.sql.models.TableModel.Column[] {
           new org.netbeans.lib.sql.models.TableModel.Column("cheque_no", "Cheque No.", false),
           new org.netbeans.lib.sql.models.TableModel.Column("debit", "Banked Amt", false)
         //  new org.netbeans.lib.sql.models.TableModel.Column("amount_banked", "Actual Amt Banked", true),
         //  new org.netbeans.lib.sql.models.TableModel.Column("date_banked", "Date Banked", true),
           
            }));
            
            tableModel = jTable1.getModel();
            
          /*  tableModel.addTableModelListener(new javax.swing.event.TableModelListener(){
               //  public void tableChanged(javax.swing.event.TableModelEvent evt){
               //      tableModelTableChanged(evt);
                 }});
        */
        jScrollPane1.setViewportView(jTable1);
                
                }
        
       }catch(java.sql.SQLException sqlex){
          javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
 
        System.out.println(sqlex.getMessage());
                
        }
       
         

         
 // Add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
  // Add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
       
        this.getContentPane().removeAll();
        this.initComponents();
    
      
       // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
        
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql.toString());
 
        
          try {
             
               connectDB.setAutoCommit(false);
             
                 for (int i=0; i < jTable1.getRowCount(); i++) {
                //      if (jTable1.getModel().getValueAt(i,5) != null){
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("UPDATE ac_cash_book SET date_banked = '"+datePicker2.getDate().toString()+"',slip_no = '"+jTextField1.getText()+"', date_confirmed = date('now'), banked = true WHERE date = '"+datePicker1.getDate()+"' AND account_no = '"+jTextField71.getText()+"'");
            //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
             pstmt.executeUpdate();
           
                 } 
             
                javax.swing.JOptionPane.showMessageDialog(this,"Data Inserted Successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
         
            connectDB.commit();
            connectDB.setAutoCommit(true);
            jButton1.setEnabled(false);
           //      }
        }   catch(java.sql.SQLException sq){
                
            try {
                
                connectDB.rollback();
                
            } catch(java.sql.SQLException sql) {
                
             javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                
            }
            
             javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
       
            System.out.println(sq.getMessage());
        }
        /*
       try{
             connectDB.setAutoCommit(false);
            // jButton5ActionPerformed(evt);
            
           java.sql.PreparedStatement pstmt7 = connectDB.prepareStatement("insert into banking values(?,?,?,?)");
              for (int i = 0; i < jTable1.getRowCount(); i++){
               if (jTable1.getModel().getValueAt(i,6) != null){
            //pstmt7.setString(1,jTextField12.getText());       
            pstmt7.setObject(1,jTable1.getValueAt(i,2).toString());
            pstmt7.setObject(2,jTable1.getValueAt(i,5).toString());
            pstmt7.setObject(3,jTable1.getValueAt(i,6).toString());
            pstmt7.setObject(4,jTable1.getValueAt(i,7).toString());
                
               }
              }
           pstmt7.executeUpdate();
         
            connectDB.commit();
            connectDB.setAutoCommit(true);
           
             this.getContentPane().removeAll();
            this.initComponents();
             jLabel7.setForeground(java.awt.Color.blue);
            jLabel7.setText("Insert successful");
     
             }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                  try {
                  connectDB.rollback();
                  }catch (java.sql.SQLException sql){
                  javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
              }
            System.out.println(sq.getMessage());
              }
        
     
         */
      
            
    }//GEN-LAST:event_jButton1ActionPerformed

  /*      
     public void tableModelTableChanged(javax.swing.event.TableModelEvent evt) {

         double totals = 0.00;
         
         int i = 0;
         
         for (int j = 0; j < jTable1.getRowCount(); j++) {
             
             System.out.println(jTable1.getModel().getValueAt(j, 4).toString());
             
            if (Boolean.valueOf(jTable1.getModel().getValueAt(j, 4).toString()) == java.lang.Boolean.FALSE) {
             
             totals = totals + Double.parseDouble(jTable1.getModel().getValueAt(j, 2).toString()) + Double.parseDouble(jTable1.getModel().getValueAt(j, 3).toString());
             
             i++;
           }
         }
         
         jTextField6.setText(Double.toString(totals));
         
         jTextField2.setText(Integer.toString(i));
         
         System.out.println(totals);
         
         System.out.println(i);
         
         System.out.println("This table has changed");
         
     }     
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private com.afrisoftech.lib.DatePicker datePicker2;
    private org.netbeans.lib.sql.NBCachedRowSet crset3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private org.netbeans.lib.sql.NBCachedRowSet crset4;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JButton jButton4;
    private com.afrisoftech.lib.DatePicker datePicker1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
