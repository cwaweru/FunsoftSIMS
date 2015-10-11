/*
 * countryintfr.java
 *
 * Created on August 13, 2002, 12:15 PM
 */

package com.afrisoftech.accounting;

/**
 *
 * @author  root
 */
public class ReceiptPrefsIntfr extends javax.swing.JInternalFrame {
    
    /** Creates new form countryintfr */
    java.sql.Connection connectDB = null;
    
    java.util.Properties appProps;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public ReceiptPrefsIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB, java.util.Properties props) {
        
        connectDB = connDb;
        
        appProps = props;
        
        pConnDB = pconnDB;
        
        initComponents();
        
        fetchNewPreferences();
/*
        jTextField2.setText(System.getProperty("receiptPageMargin"));
 
        jTextField1.setText(System.getProperty("receiptTitleFontSize"));
 
        jTextField11.setText(System.getProperty("receiptFontSize"));
 
        jTextField12.setText(System.getProperty("papersize_width"));
 
        jTextField4.setText(System.getProperty("papersize_legnth"));
 */
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
            crset11 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        java.awt.Font[] fontList = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

        java.util.Set fontSet = com.lowagie.text.FontFactory.getRegisteredFonts();
        /*

        java.util.Vector fontVector = new java.util.Vector(1,1);

        for (int i = 0; i < fontList.length; i++) {

            fontVector.addElement(fontList[i].getFontName());

        }
        */
        java.lang.Object[] fontNameArray = fontSet.toArray();
        jComboBoxFont = new javax.swing.JComboBox(fontNameArray);

        linesPerPageTxt = new javax.swing.JTextField();
        charactersPerLineTxt = new javax.swing.JTextField();
        linesPerPageLbl = new javax.swing.JLabel();
        charactersPerLineLbl = new javax.swing.JLabel();
        rcptLinesPerPageLbl = new javax.swing.JLabel();
        rcptCharsPerLineLbl = new javax.swing.JLabel();
        rcptLinesPerPageTxt = new javax.swing.JTextField();
        rcptCharsPerLineTxt = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();

        crset1.setCommand("SELECT tag_no  from asset_registration ORDER BY tag_no");
        crset1.setConnectionSource(pConnDB);
        crset11.setCommand("SELECT department_name from pb_departments ORDER BY department_name");
        crset11.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Receipt Preferences");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ColorPreview.gif")));
        setVisible(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
        jButton1.setMnemonic('O');
        jButton1.setText("Save Preferences");
        jButton1.setToolTipText("Click here to enter data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif")));
        jButton3.setMnemonic('l');
        jButton3.setText("Clear Values");
        jButton3.setToolTipText("Click here to clear fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14755_.GIF")));
        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click here to close");
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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel3, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new javax.swing.border.TitledBorder("Enter Receipt Preferences"));
        jLabel1.setText("Page Size Width (Points)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField1, gridBagConstraints);

        jLabel2.setText("Title Font Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jTextField2, gridBagConstraints);

        jLabel4.setText("Margin Allowance (Points)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel6.setText("Body Text Font Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Page Size Length (Points)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(jTextField12, gridBagConstraints);

        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("HINT:  Note that all dimension entries are in points where 1 Inch = 72 Points and 1 CentiMetre = 30 Points.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel8.setText("Font Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jComboBoxFont, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(linesPerPageTxt, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(charactersPerLineTxt, gridBagConstraints);

        linesPerPageLbl.setText("Lines Per Page");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(linesPerPageLbl, gridBagConstraints);

        charactersPerLineLbl.setText("Characters Per Line");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(charactersPerLineLbl, gridBagConstraints);

        rcptLinesPerPageLbl.setText("Receipt Lines Per Page");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(rcptLinesPerPageLbl, gridBagConstraints);

        rcptCharsPerLineLbl.setText("Receipt Characters Per Line");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(rcptCharsPerLineLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(rcptLinesPerPageTxt, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(rcptCharsPerLineTxt, gridBagConstraints);

        jRadioButton1.setText("Print Header");
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setText("Do Not Print Header");
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jRadioButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help.gif")));
        jButton5.setMnemonic('H');
        jButton5.setText("Help");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton5, gridBagConstraints);

        setBounds(0, 0, 739, 368);
    }//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rHeader = null;
        
        if (jRadioButton1.isSelected()){
            rHeader = "True";
        }else{
            if (jRadioButton2.isSelected()){
                rHeader = "False";
            }
        }
        
        try {
            connectDB.setAutoCommit(false);
            java.sql.PreparedStatement pstmt21 = connectDB.prepareStatement("delete from receipt_pref");
            pstmt21.executeUpdate();
            java.sql.PreparedStatement pstmt2 = connectDB.prepareStatement("insert into receipt_pref values(?,?,?,?,?,?,?,?)");
            pstmt2.setObject(1,jTextField1.getText());
            pstmt2.setObject(2,jTextField11.getText());
            pstmt2.setString(3,jTextField12.getText());
            pstmt2.setString(4,jTextField4.getText());
            pstmt2.setString(5,jTextField2.getText());
            pstmt2.setString(6,linesPerPageTxt.getText());
            pstmt2.setString(7,charactersPerLineTxt.getText());
            pstmt2.setString(8,rHeader);
            
            pstmt2.executeUpdate();
            
            
            connectDB.commit();
            connectDB.setAutoCommit(true);
            
        }catch(java.sql.SQLException sq){
            
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            System.out.println(sq.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(), "Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }
        
        System.setProperty("linesperpage",linesPerPageTxt.getText());
        
        System.setProperty("charactersperpage",charactersPerLineTxt.getText());
        
        appProps.setProperty("linesperpage",linesPerPageTxt.getText());
        
        appProps.setProperty("charactersperpage",charactersPerLineTxt.getText());
        
        
        appProps.setProperty("rcptlinesperpage",rcptLinesPerPageTxt.getText());
        
        appProps.setProperty("rcptcharactersperpage",rcptCharsPerLineTxt.getText());
        
        
/*        System.setProperty("receiptPageMargin", jTextField2.getText());
 
        appProps.setProperty("receiptPageMargin", System.getProperty("receiptPageMargin"));
 
        System.setProperty("receiptTitleFontSize", jTextField1.getText());
 
        appProps.setProperty("receiptTitleFontSize", System.getProperty("receiptTitleFontSize"));
 
        System.setProperty("receiptFontSize", jTextField11.getText());
 
        appProps.setProperty("receiptFontSize", System.getProperty("receiptFontSize"));
 
        System.setProperty("papersize_width", jTextField12.getText());
 
        appProps.setProperty("papersize_width", System.getProperty("papersize_width"));
 
        System.setProperty("papersize_legnth", jTextField4.getText());
 
        appProps.setProperty("papersize_legnth", System.getProperty("papersize_legnth"));
 
 //       System.setProperty("font_type_name", jComboBoxFont.getSelectedItem().toString());
 
 //       appProps.setProperty("font_type_name", System.getProperty("font_type_name"));
 
        javax.swing.JOptionPane.showMessageDialog(this, "Receipt preferences updated.");
 
 
 
 
        fetchNewPreferences();
 */
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField12.setText("");
        jTextField11.setText("");
        jTextField4.setText("");
        
        fetchNewPreferences();
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);        // Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // Add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked
    
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked
    
    private void fetchNewPreferences() {
        
        jTextField2.setText(System.getProperty("receiptPageMargin"));
        
        jTextField1.setText(System.getProperty("receiptTitleFontSize"));
        
        jTextField11.setText(System.getProperty("receiptFontSize"));
        
        jTextField4.setText(System.getProperty("papersize_width"));
        
        jTextField12.setText(System.getProperty("papersize_legnth"));
        
        //    jComboBoxFont.setSelectedItem((java.lang.Object)System.getProperty("font_type_name"));
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField rcptCharsPerLineTxt;
    private javax.swing.JTextField rcptLinesPerPageTxt;
    private javax.swing.JLabel rcptCharsPerLineLbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField linesPerPageTxt;
    private org.netbeans.lib.sql.NBCachedRowSet crset11;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel charactersPerLineLbl;
    private javax.swing.JComboBox jComboBoxFont;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel rcptLinesPerPageLbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel linesPerPageLbl;
    private javax.swing.JTextField charactersPerLineTxt;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
}
