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
public class Closingintfr extends javax.swing.JInternalFrame {
    
    /** Creates new form loanpymntintfr */
    javax.swing.table.TableModel tableModel = null;
    
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public Closingintfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
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

        pooledConnectionSource1 = new org.netbeans.lib.sql.pool.PooledConnectionSource();
        try {
            nBCachedRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            crset2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet11 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet111 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet12 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet13 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            java.lang.Class.forName("org.postgresql.Driver");
        }catch (java.lang.ClassNotFoundException sl){
            System.out.println(sl.getMessage());
        }

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable21 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();

        pooledConnectionSource1.setDatabase("jdbc:postgresql://localhost:5432/medic");
        pooledConnectionSource1.setDriver("org.postgresql.Driver");
        pooledConnectionSource1.setPassword("02ca3bac3933aa5c25dd37a18e46a8574b8eff4c82f9269d5df855983e7a74aee10f", true);
        pooledConnectionSource1.setUsername("postgres");
        nBCachedRowSet1.setCommand("select activity_code,description,sum(debit -credit) from ac_accounts_payable group by description,activity_code");
        nBCachedRowSet1.setConnectionSource(pooledConnectionSource1);
        nBCachedRowSet1.setPassword("025e5de94c23e770142d2f436b6884b6cec06a0e49fa605bb6d0b492d56915", true);
        crset2.setCommand("select distinct account_name as account_name FROM ac_cash_book  ORDER BY account_name asc");
        crset2.setConnectionSource(pConnDB);
        nBCachedRowSet11.setCommand(" select ac.activity_code,ac.description,sum(ac.debit -ac.credit) from ac_ledger ac group by ac.description,ac.activity_code EXCEPT select gl_code,description,sum(amount) from pl_account_view group by gl_code,description UNION SELECT sub_code,description,(select sum(amount) from pl_account_view) from pb_sub_activities where identifier Like 'pl%'");
        nBCachedRowSet11.setConnectionSource(pooledConnectionSource1);
        nBCachedRowSet11.setPassword("02d93b2720f756c23491def880a12e4d8c4b0be5c3be90403e8019f688a4785f8d57", true);
        nBCachedRowSet111.setCommand("select gl_code,account_name,sum(debit -credit) AS amount from ac_cash_book group by account_name,gl_code");
        nBCachedRowSet111.setConnectionSource(pooledConnectionSource1);
        nBCachedRowSet111.setPassword("02a996125f21cc8c4acab31171dee6c1d6bfb79e6766d4564ae7857d34afe8", true);
        nBCachedRowSet12.setCommand("select * from patient_card_view  WHERE amount <>0");
        nBCachedRowSet12.setConnectionSource(pooledConnectionSource1);
        nBCachedRowSet12.setPassword("029df0add35a90a767c1b04f4380f42684cd3f9bd9bd80f3f3be0cbfe86375c1e62f", true);
        nBCachedRowSet13.setCommand("select activity_code,item,sum(debit -quantity_ordered) from st_stock_cardex group by item,activity_code");
        nBCachedRowSet13.setConnectionSource(pooledConnectionSource1);
        nBCachedRowSet13.setPassword("027b84265eb3c982ae3c34f4c3bc85752c0dfcde76a92b042bd8031898a3", true);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Closing Accounts");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ColorPreview.gif")));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        setAutoscrolls(true);
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
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
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
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel7, gridBagConstraints);

        jTextField6.setEditable(false);
        jTextField6.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField6.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextField6, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.TitledBorder(""));
        jScrollPane2.setBorder(new javax.swing.border.TitledBorder("Cash Book"));
        jTable2.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet111, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("gl_code", "Gl code", false),
            new org.netbeans.lib.sql.models.TableModel.Column("account_name", "Account name", false),
            new org.netbeans.lib.sql.models.TableModel.Column("amount", "Amount", false)
        }));
        jScrollPane2.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        jScrollPane21.setBorder(new javax.swing.border.TitledBorder("Norminal Ledger"));
        jTable21.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet11, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("activity_code", "Activity code", false),
            new org.netbeans.lib.sql.models.TableModel.Column("description", "Description", false),
            new org.netbeans.lib.sql.models.TableModel.Column("sum", "Amount", false)
        }));
        jScrollPane21.setViewportView(jTable21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel2.add(jScrollPane21, gridBagConstraints);

        jScrollPane11.setBorder(new javax.swing.border.TitledBorder("Patients Ledger"));
        tableModel = jTable1.getModel();

        tableModel.addTableModelListener(new javax.swing.event.TableModelListener() {

            public void tableChanged(javax.swing.event.TableModelEvent evt) {

                tableModelTableChanged(evt);

            }

        });
        jTable11.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet12, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("activity_code", "Activity code", false),
            new org.netbeans.lib.sql.models.TableModel.Column("main_service", "Main service", false),
            new org.netbeans.lib.sql.models.TableModel.Column("amount", "Amount", false)
        }));
        jScrollPane11.setViewportView(jTable11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(jScrollPane11, gridBagConstraints);

        jScrollPane1.setBorder(new javax.swing.border.TitledBorder("Debtors/Creditors Ledger"));
        tableModel = jTable1.getModel();

        tableModel.addTableModelListener(new javax.swing.event.TableModelListener() {

            public void tableChanged(javax.swing.event.TableModelEvent evt) {

                tableModelTableChanged(evt);

            }

        });
        jTable1.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("activity_code", "Activity code", false),
            new org.netbeans.lib.sql.models.TableModel.Column("description", "Description", false),
            new org.netbeans.lib.sql.models.TableModel.Column("sum", "Amount", false)
        }));
        tableModel = jTable1.getModel();

        tableModel.addTableModelListener(new javax.swing.event.TableModelListener() {

            public void tableChanged(javax.swing.event.TableModelEvent evt) {

                tableModelTableChanged(evt);

            }

        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        jScrollPane12.setBorder(new javax.swing.border.TitledBorder("Stock Ledger"));
        tableModel = jTable1.getModel();

        tableModel.addTableModelListener(new javax.swing.event.TableModelListener() {

            public void tableChanged(javax.swing.event.TableModelEvent evt) {

                tableModelTableChanged(evt);

            }

        });
        jTable12.setModel(new org.netbeans.lib.sql.models.TableModel(nBCachedRowSet13, new org.netbeans.lib.sql.models.TableModel.Column[] {
            new org.netbeans.lib.sql.models.TableModel.Column("activity_code", "Activity code", false),
            new org.netbeans.lib.sql.models.TableModel.Column("item", "Item", false),
            new org.netbeans.lib.sql.models.TableModel.Column("sum", "Amount", false)
        }));
        jScrollPane12.setViewportView(jTable12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel2.add(jScrollPane12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 8.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        getContentPane().add(jPanel2, gridBagConstraints);

        setBounds(0, 0, 697, 424);
    }//GEN-END:initComponents
        
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);   // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String billNo = null;
        
        String transNo = null;
        String payMode = null;
        String patientAcc = null;
        String cardNo = null;
        String AccDesc = null;
        String scheme = null;
        String cardName = null;
        String isurer = null;
        String expDate = null;
        String staffNo = null;
        String glAcc = null;
        String user = null;
        try {
            connectDB.setAutoCommit(false);
            
          /*  java.sql.Statement stm1 = connectDB.createStatement();
            java.sql.ResultSet rse1 = stm1.executeQuery("select payment_mode,card_no,scheme,card_name,isurer,expiry_date,scheme_staff_no from hp_patient_card where patient_no ='"+jComboBox131.getSelectedItem()+"'");
            while (rse1.next())
           
                // patientAcc = rse1.getObject(1).toString();
                payMode = rse1.getObject(1).toString();
           
            cardNo = rse1.getObject(2).toString();
            scheme = rse1.getObject(3).toString();
            cardName = rse1.getObject(4).toString();
            isurer = rse1.getObject(5).toString();
            expDate = rse1.getObject(6).toString();
            staffNo = rse1.getObject(7).toString();
           */
            
            java.sql.Statement stm12 = connectDB.createStatement();
            java.sql.ResultSet rse12 = stm12.executeQuery("select code,activity from pb_activity where activity_category ='PR'");
            while (rse12.next())
                
                patientAcc = rse12.getObject(1).toString();
            AccDesc = rse12.getObject(2).toString();
            
            java.sql.Statement ps11 = connectDB.createStatement();
            java.sql.ResultSet rst11 = ps11.executeQuery("select nextval('billing_no_seq'),current_user");
            while (rst11.next())
                
                rst11.getObject(1).toString();
            billNo = rst11.getObject(1).toString();
            user = rst11.getObject(2).toString();
            
            java.sql.Statement ps = connectDB.createStatement();
            java.sql.ResultSet rst = ps.executeQuery("select nextval('transaction_no_seq')");
            while (rst.next())
                rst.getObject(1).toString();
            
            transNo = rst.getObject(1).toString();
            
            for (int i = 0; i < jTable1.getRowCount(); i++){
                if (jTable1.getModel().getValueAt(i,0) != null){
                    java.sql.Statement stm121 = connectDB.createStatement();
                    java.sql.ResultSet rse121 = stm121.executeQuery("select activity from pb_activity where code ='"+jTable1.getModel().getValueAt(i,4).toString()+"'");
                    while (rse121.next())
                        
                        glAcc = rse121.getObject(1).toString();
                    
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into hp_patient_card values(?,?,?,?,?,?,?, ?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?)");
                    //1 for (int i = 0; i < jTable1.getRowCount(); i++){
                    
                    
                    pstmt.setObject(1,jTable1.getValueAt(i,0).toString());
                    
                    pstmt.setObject(2,jTable1.getValueAt(i,1).toString());
                    pstmt.setString(3,"");
                    pstmt.setString(4,"Cash");
                    pstmt.setString(5,billNo);
                    pstmt.setString(7,scheme);
                    pstmt.setString(6,cardNo);
                    pstmt.setString(8,cardName);
                    pstmt.setString(9,isurer);
                    pstmt.setString(10,expDate);
                    pstmt.setString(11,"");
                    pstmt.setObject(12,jTable1.getValueAt(i,3).toString());
                    pstmt.setString(13,"00");
                    pstmt.setString(14,"'now'");
                    pstmt.setObject(15,patientAcc);
                    pstmt.setString(16,glAcc);
                    pstmt.setString(17,"1");
                    pstmt.setObject(18,staffNo);
                    pstmt.setBoolean(19,true);
                    pstmt.setString(20,"Billing");
                    pstmt.setBoolean(21,false);
                    pstmt.setString(22,AccDesc);
                    pstmt.setString(23,billNo);
                    pstmt.setString(24,user);
                    
                    pstmt.executeUpdate();
                    
                    java.sql.PreparedStatement pstmt2 = connectDB.prepareStatement("insert into ac_ledger values(?,?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)");
                    pstmt2.setObject(1,jTable1.getValueAt(i,4).toString());
                    pstmt2.setString(2,glAcc);
                    pstmt2.setObject(3,jTable1.getValueAt(i,0).toString());
                    
                    pstmt2.setString(4,"");
                    pstmt2.setString(5,"");
                    pstmt2.setString(6,"");
                    pstmt2.setString(7,"");
                    pstmt2.setString(8,"");
                    pstmt2.setString(9,"");
                    pstmt2.setString(10,"");
                    pstmt2.setString(11,"");
                    pstmt2.setString(12,"");
                    pstmt2.setString(13,"");
                    pstmt2.setString(14,jTable1.getValueAt(i,1).toString());
                    pstmt2.setString(15,"Billing");
                    pstmt2.setString(16,"0.00");
                    pstmt2.setObject(17,jTable1.getValueAt(i,3).toString());
                    pstmt2.setString(18,"'now'");
                    pstmt2.setString(19,transNo);
                    pstmt2.setString(20,"false");
                    pstmt2.setString(21,"false");
                    pstmt2.setString(22,"false");
                    pstmt2.setString(23,user);
                    pstmt2.executeUpdate();
                }
            }
            
            connectDB.commit();
            connectDB.setAutoCommit(true);
            javax.swing.JOptionPane.showMessageDialog(this, "Insert Done Successfully","Comfirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            // jTextField1.setText("");
            //            jTextField2.setText("");
            //            jTextField3.setText("");
            for (int k = 0; k < jTable1.getRowCount(); k++ ) {
                for (int r = 0; r < jTable1.getColumnCount(); r++ ) {
                    jTable1.getModel().setValueAt(null,k,r);
                }
            }
            
            //            this.jComboBox131.setSelectedItem(null);
            //            jTextField3.setText("0.00");
            
            //  jComboBox2.setSelectedItem(null);
        }catch(java.sql.SQLException sq){
            
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            System.out.println(sq.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(), "Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void tableModelTableChanged(javax.swing.event.TableModelEvent evt) {
        
     /*   double totals = 0.00;
        //  double totals = Double.parseDouble(jTextField1.getText());
        int i = 0;
        
        for (int j = 0; j < jTable1.getRowCount(); j++) {
            
            System.out.println(jTable1.getModel().getValueAt(j, 4).toString());
            
            if (Boolean.valueOf(jTable1.getModel().getValueAt(j, 4).toString()) == java.lang.Boolean.FALSE) {
                
                totals = totals - Double.parseDouble(jTable1.getModel().getValueAt(j, 3).toString());
                
                i++;
            }
        }
        
        //  jTextField1.setText(Double.toString(totals));
        
        //   jTextField2.setText(Integer.toString(i));
        
        System.out.println(totals);
        
        System.out.println(i);
        
        System.out.println("This table has changed");
        */
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable jTable2;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet12;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet111;
    private javax.swing.JScrollPane jScrollPane1;
    private org.netbeans.lib.sql.NBCachedRowSet crset2;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet13;
    private javax.swing.JTable jTable21;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTable jTable11;
    private javax.swing.JScrollPane jScrollPane2;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JTable jTable12;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private org.netbeans.lib.sql.pool.PooledConnectionSource pooledConnectionSource1;
    private javax.swing.JButton jButton4;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
