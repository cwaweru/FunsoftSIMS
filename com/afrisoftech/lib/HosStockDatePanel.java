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
public class HosStockDatePanel extends javax.swing.JDialog {
    
    int reportName;
    
    
    java.sql.Connection connectDB = null;
    
    java.util.Vector dateStartEnd = null;
    
    javax.swing.JSpinner beginDateSpinner = null;
    
    javax.swing.JSpinner endDateSpinner = null;
    
    /** Creates new form DatePanel */
    public HosStockDatePanel(java.awt.Frame parent, boolean modal, int repName, java.sql.Connection connectDb) {
        
        super(parent, modal);
        
        reportName = repName;
        
        connectDB = connectDb;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datePicker1 = new com.afrisoftech.lib.DatePicker();
        datePicker2 = new com.afrisoftech.lib.DatePicker();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setTitle("Begin & End Date");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        /*        try {
            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM);
            java.util.Date dateInstance = java.util.Calendar.getInstance().getTime();
            //        java.lang.String dateString2Parse = null;
            //        dateString2Parse = String.valueOf(dateInstance.getDate())+"-"+String.valueOf(dateInstance.getMonth()+1)+"-200"+String.valueOf(dateInstance.getYear()-100);

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

        }
        */
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(datePicker1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(datePicker2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 10, 20);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.EtchedBorder());
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select Begin and End Dates");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jPanel2, gridBagConstraints);

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
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(350, 180));
        setLocation((screenSize.width-350)/2,(screenSize.height-180)/2);
    }//GEN-END:initComponents

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
            
            case 0:
                
            {
                com.afrisoftech.hospinventory.OrderedItemsPdf policy = new com.afrisoftech.hospinventory.OrderedItemsPdf();
                
                policy.OrderedItemsPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate());
                
                this.dispose();
                
            } break;
            
            case 1:
                
            {
                com.afrisoftech.hospinventory.IssuedItemsPdf policy = new com.afrisoftech.hospinventory.IssuedItemsPdf();
                
                policy.IssuedItemsPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate());
                
                this.dispose();
                
            } break;
            
            case 2:
                
            {
                com.afrisoftech.hospinventory.ReceivedItemsPdf policy = new com.afrisoftech.hospinventory.ReceivedItemsPdf();
                
                policy.ReceivedItemsPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate());
                
                this.dispose();
                
            } break;
            
            case 3:
                
            {
                com.afrisoftech.hospinventory.RequisationPdf policy = new com.afrisoftech.hospinventory.RequisationPdf();
                
                policy.RequisationPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate());
                
                this.dispose();
                
            } break;
            
            case 4:
                
            {
                com.afrisoftech.hospinventory.OutstOrdersPdf policy = new com.afrisoftech.hospinventory.OutstOrdersPdf();
                
                policy.OutstOrdersPdf(connectDB, this.datePicker1.getDate(), this.datePicker2.getDate());
                
                this.dispose();
                
            } break;
            
  /*          case 5:
   
            {
                com.afrisoftech.sacco.TrialBalancePdf policy = new com.afrisoftech.sacco.TrialBalancePdf();
   
                policy.TrialBalancePdf(connectDB, this.beginDateSpinner.getValue().toString(), this.endDateSpinner.getValue().toString());
   
               this.dispose();
   
            } break;
   
             case 6:
   
            {
                com.afrisoftech.sacco.JournalPdf policy = new com.afrisoftech.sacco.JournalPdf();
   
                policy.JournalPdf(connectDB, this.beginDateSpinner.getValue().toString(), this.endDateSpinner.getValue().toString());
   
               this.dispose();
   
            } break;
   
              case 8:
   
            {
                com.afrisoftech.sacco.PaymentsPdf policy = new com.afrisoftech.sacco.PaymentsPdf();
   
                policy.PaymentsPdf(connectDB, this.beginDateSpinner.getValue().toString(), this.endDateSpinner.getValue().toString());
   
               this.dispose();
   
            } break;
   
               case 9:
   
            {
                com.afrisoftech.sacco.SharesTransPdf policy = new com.afrisoftech.sacco.SharesTransPdf();
   
                policy.SharesTransPdf(connectDB, this.beginDateSpinner.getValue().toString(), this.endDateSpinner.getValue().toString());
   
               this.dispose();
   
            } break;
   
   */
            default :  ;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.afrisoftech.lib.DatePicker datePicker2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel1;
    private com.afrisoftech.lib.DatePicker datePicker1;
    // End of variables declaration//GEN-END:variables
    
}