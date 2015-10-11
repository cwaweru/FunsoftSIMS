/*
 * banksintfr.java
 *
 * Created on August 13, 2002, 3:24 PM
 */

package com.sacco;

/**
 *
 * @author  root
 */
public class CasbookClosemonthintfr extends javax.swing.JInternalFrame {
    
    /** Creates new form banksintfr */
   javax.swing.JSpinner beginDateSpinner = null;
 
    
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
  
    public CasbookClosemonthintfr(java.sql.Connection connDB, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
           connectDB = connDB;
           
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

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Close Month");
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
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14755_.GIF")));
        jButton4.setMnemonic('c');
        jButton4.setText("Close");
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
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jSeparator1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel3, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        try {
            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);
            java.util.Date dateInstance = java.util.Calendar.getInstance().getTime();
            //        java.lang.String dateString2Parse = null;
            //        dateString2Parse = String.valueOf(dateInstance.getDate())+"-"+String.valueOf(dateInstance.getMonth()+1)+"-200"+String.valueOf(dateInstance.getYear()-100);

            java.util.Date formattedDate = dateFormat.parse(dateInstance.toLocaleString());
            System.out.println(dateFormat.format(formattedDate));
            javax.swing.SpinnerDateModel beginDate = new javax.swing.SpinnerDateModel(formattedDate, null, null,java.util.Calendar.DAY_OF_MONTH);
            // javax.swing.SpinnerDateModel endDate = new javax.swing.SpinnerDateModel(formattedDate, null, null,java.util.Calendar.DAY_OF_MONTH);

            beginDateSpinner = new javax.swing.JSpinner(beginDate);
            // endDateSpinner = new javax.swing.JSpinner(endDate);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            jPanel1.add(beginDateSpinner, gridBagConstraints);

        } catch(java.text.ParseException parseExec) {

            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), parseExec.getMessage());

        }
        jPanel1.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel2.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jTextField1.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jTextField1, gridBagConstraints);

        setBounds(0, 0, 560, 181);
    }//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);// Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        long dateNow = calendar.getTimeInMillis();
        
        java.sql.Date datenowSql= new java.sql.Date(dateNow);
        
        System.out.println(datenowSql.toString());
 
        
        java.sql.Connection con;
             
             String debitNo; 
             String creditNo;
             String glCode;
             String dateNo;
             String memNo; 
             String memName;
             String shareTyp;
             String glNo;
             String actNo;
             String debit;
             String credit;
              String actCodes;
         try {
              connectDB.setAutoCommit(false);
          
            java.sql.Statement ps3 = connectDB.createStatement();            
            java.sql.ResultSet rst3 = ps3.executeQuery("select CAST(date('"+beginDateSpinner.getValue().toString()+"') AS DATE) + 1");
            while (rst3.next())
            rst3.getObject(1).toString();
            dateNo = rst3.getObject(1).toString();
           
                          
            java.sql.Statement ps1 = connectDB.createStatement();            
            java.sql.ResultSet rst1 = ps1.executeQuery("select gl_code,sum(debit),sum(credit),bank from cash_book where date_part('month',CAST(date(date) AS DATE)) = date_part('month',CAST((date('"+beginDateSpinner.getValue().toString()+"')) AS DATE)) and closed = 'false' group by gl_code,bank");
            while (rst1.next()){
                     
            debitNo = rst1.getObject(2).toString();
            creditNo = rst1.getObject(3).toString();
            glCode = rst1.getObject(1).toString();
            String bName = rst1.getObject(4).toString();
             java.sql.Statement ps = connectDB.createStatement();            
            java.sql.ResultSet rst = ps.executeQuery("select nextval('transaction_no_seq')");
            while (rst.next())
            rst.getObject(1).toString();
             ps.close();
             rst.close();
             
             String transNo = rst.getObject(1).toString();
             
         
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into cash_book values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1,"0000");
            pstmt.setString(2," ");
            pstmt.setString(3,null);
            pstmt.setString(4,"");
            pstmt.setString(5,null);
            pstmt.setString(6,null);
            pstmt.setString(7,null);
            pstmt.setString(8,""+glCode+"");
            pstmt.setString(9,null);
            pstmt.setString(10,null);
            pstmt.setString(11,null);
            pstmt.setString(12,null);
            pstmt.setString(13,null);
            pstmt.setString(14,null);
            pstmt.setString(15,""+bName+"");
            pstmt.setString(16,null);
            pstmt.setString(17,null);
            pstmt.setString(18,""+debitNo+"");
            pstmt.setString(19,""+creditNo+"");
            pstmt.setString(20,""+dateNo+"");
            pstmt.setString(21,""+transNo+"");            
            pstmt.setBoolean(22,false);
            pstmt.setString(23,"false");
            pstmt.setString(24,"Opening Balance");
            
           pstmt.executeUpdate();
            } 
            
                 java.sql.Statement ps7 = connectDB.createStatement();            
            java.sql.ResultSet rst7 = ps7.executeQuery("select activity_code,sum(debit),sum(credit) from other_transactions where date_part('month',CAST(date(date) AS DATE)) = date_part('month',CAST((date('"+beginDateSpinner.getValue().toString()+"')) AS DATE)) and closed = 'false' group by gl_code,activity_code");
            
            while (rst7.next()){
                
            java.sql.Statement ps11 = connectDB.createStatement();            
            java.sql.ResultSet rst11 = ps11.executeQuery("select nextval('transaction_no_seq')");
            while (rst11.next())
            rst11.getObject(1).toString();
             ps11.close();
             rst11.close();
             
             String transNo2 = rst11.getObject(1).toString();
             
             this.jTextField1.setText(rst7.getObject(1).toString());   
         
            String actCd = rst7.getObject(1).toString();
           // String GlCode = rst7.getObject(2).toString();
            String Debit = rst7.getObject(2).toString();
            String Credit = rst7.getObject(3).toString();
            
            
         java.sql.PreparedStatement pstmt1 = connectDB.prepareStatement("insert into other_transactions values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt1.setString(1,null);
            pstmt1.setString(2,"");
            pstmt1.setString(3,null);
            pstmt1.setString(4,null);
            pstmt1.setString(5,""+actCd+"");
            pstmt1.setString(6,null);
            pstmt1.setString(7,null);
            pstmt1.setString(8,"00");
            pstmt1.setString(9,"");
            pstmt1.setString(10,null);
            pstmt1.setString(11,"");
            pstmt1.setString(12,"N/A");
            pstmt1.setString(13,"");
            pstmt1.setString(14,""+Debit+"");
            pstmt1.setString(15,""+Credit+"");
            pstmt1.setString(16,""+dateNo+"");
            pstmt1.setString(17,""+transNo2+"");            
            pstmt1.setBoolean(18,false);
            pstmt1.setString(19,"");
            pstmt1.setString(20,"");
            pstmt1.setString(21,"Opening Balance");
          
           pstmt1.executeUpdate();
           
             
           }
            
             java.sql.Statement ps6 = connectDB.createStatement();            
            java.sql.ResultSet rst6 = ps6.executeQuery("select activity_code,sum(debit),sum(credit),share_type from shares_transactions where date_part('month',CAST(date(date) AS DATE)) = date_part('month',CAST((date('"+beginDateSpinner.getValue().toString()+"')) AS DATE)) and closed = 'false' group by gl_code,activity_code,share_type");
            
            while (rst6.next()){
                
            java.sql.Statement ps10 = connectDB.createStatement();            
            java.sql.ResultSet rst10 = ps10.executeQuery("select nextval('transaction_no_seq')");
            while (rst10.next())
            rst10.getObject(1).toString();
             ps10.close();
             rst10.close();
             
             String transNo1 = rst10.getObject(1).toString();
             
             this.jTextField1.setText(rst6.getObject(1).toString());   
       
             shareTyp = rst6.getObject(4).toString();
             //glNo = rst6.getObject(1).toString();
             actNo = rst6.getObject(1).toString();
             debit = rst6.getObject(2).toString();
             credit = rst6.getObject(3).toString();
             System.out.println(rst6.getObject(1).toString());
          
             java.sql.PreparedStatement pstmt7 = connectDB.prepareStatement("insert into shares_transactions values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt7.setString(1,"00");
            pstmt7.setString(2,"");
            pstmt7.setString(3,null);
            pstmt7.setString(4,"");
            pstmt7.setString(5,null);
            pstmt7.setString(6,null);
            pstmt7.setString(7,"");
            pstmt7.setString(8,"");
            pstmt7.setString(9,"");
            pstmt7.setString(10,""+shareTyp+"");
            pstmt7.setString(11,""+debit+"");
            pstmt7.setString(12,""+credit+"");
            pstmt7.setString(13,"00");
            pstmt7.setString(14,""+actNo+"");
            pstmt7.setString(15,""+dateNo+"");
          //  pstmt1.setDate(1, datenowSql);
            pstmt7.setString(16,""+transNo1+"");
            pstmt7.setBoolean(17,false);
            pstmt7.setString(18,null);
            pstmt7.setString(19,"");
            pstmt7.setString(20,"Opening Balance");
           
           
            pstmt7.executeUpdate();
 
            }
            
                      java.sql.Statement pss = connectDB.createStatement();            
            java.sql.ResultSet rsts = pss.executeQuery("select activity_code,sum(debit),sum(credit),loan_purpose from loan_transactions where date_part('month',CAST(date(date) AS DATE)) = date_part('month',CAST((date('"+beginDateSpinner.getValue().toString()+"')) AS DATE)) and closed = 'false' and gl_code !='' group by gl_code,activity_code,loan_purpose");
            
            while (rsts.next()){
                
            java.sql.Statement pss1 = connectDB.createStatement();            
            java.sql.ResultSet rsts1 = pss1.executeQuery("select nextval('transaction_no_seq')");
            while (rsts1.next())
            rsts1.getObject(1).toString();
             pss1.close();
             rsts1.close();
             
             String transNo3 = rsts1.getObject(1).toString();
             
            
            String Lpup = rsts.getObject(4).toString();
            //String GeCode = rsts.getString(2);
            String ActCode = rsts.getString(1);
            String Dbit = rsts.getObject(2).toString();
            String Crdit = rsts.getObject(3).toString();
            // System.out.println(rst6.getObject(1).toString());
            
         java.sql.PreparedStatement pstmts = connectDB.prepareStatement("insert into loan_transactions values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmts.setString(1,"");
            pstmts.setString(2,"");
            pstmts.setString(3,"");
            pstmts.setString(4,""+Lpup+"");
            pstmts.setString(5,"");
            pstmts.setString(6,"");
            pstmts.setString(7,"");
            pstmts.setString(8,"");
            pstmts.setString(9,"");
            pstmts.setString(10,"");
            pstmts.setString(11,"");
            pstmts.setString(12,"00");
            pstmts.setString(13,"00");
            pstmts.setString(14,"00");
            pstmts.setString(15,"00");
            pstmts.setString(16,"00");
                       
            pstmts.setString(17,""+Dbit+"");
            pstmts.setString(18,""+Crdit+"");
              
            pstmts.setString(19,"");
            pstmts.setString(20,"Opening Balance");
           
            pstmts.setString(21,"00");
            pstmts.setString(22,""+ActCode+"");
            pstmts.setString(23,""+dateNo+"");
            pstmts.setString(24,""+transNo3+"");            
             
           pstmts.executeUpdate();
           
             
           }
           
             java.sql.PreparedStatement pstmts2 = connectDB.prepareStatement ("update loan_transactions set closed = 'true' where date_part('month',CAST(date(date) AS DATE)) = date_part('month',CAST((date('"+beginDateSpinner.getValue().toString()+"')) AS DATE))");
          
             pstmts2.executeUpdate();
         
             java.sql.PreparedStatement pstmt10 = connectDB.prepareStatement ("update other_transactions set closed = 'true' where date_part('month',CAST(date(date) AS DATE)) = date_part('month',CAST((date('"+beginDateSpinner.getValue().toString()+"')) AS DATE))");
          
             pstmt10.executeUpdate();
              java.sql.PreparedStatement pstmt5 = connectDB.prepareStatement ("update shares_transactions set closed = 'true' where date_part('month',CAST(date(date) AS DATE)) = date_part('month',CAST((date('"+beginDateSpinner.getValue().toString()+"')) AS DATE))");
          
             pstmt5.executeUpdate();
         java.sql.PreparedStatement pstmt9 = connectDB.prepareStatement ("update cash_book set closed = 'true' where date_part('month',CAST(date(date) AS DATE)) = date_part('month',CAST((date('"+beginDateSpinner.getValue().toString()+"')) AS DATE))");
          
             pstmt9.executeUpdate();
             
             connectDB.commit();
            connectDB.setAutoCommit(true);
            
            jLabel3.setForeground(java.awt.Color.blue);
            jLabel3.setText("Insert Successful");
         
        
//             con.close();
          }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                 try {
                  connectDB.rollback();
                  }catch (java.sql.SQLException sql){
                  javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
              }
            System.out.println(sq.getMessage());
          }
       
       
       // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
          // Add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
            // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
