/*
 * logindlg.java
 *
 * Created on October 18, 2002, 10:54 PM
 */


package com.afrisoftech.sys;

//import com.afrisoftech.medic.*;





/**
 *
 * @author  root
 */
public class SecureLogin2HR extends javax.swing.JDialog {
    
    java.lang.String noText = "";
    
    java.lang.String dbServerIp;
    
    java.sql.Connection connDB = null;
    
   
    org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB = null;
    
    com.afrisoftech.hr.HRMain hrInst;
    
    java.lang.String path2Acrobat;
    
    java.lang.String defaultlnf;
    
    java.lang.String cashpoint;
    
    java.lang.String papersize_width;
    
    java.lang.String papersize_legnth;
    
    java.lang.String backgrdimg;
    
    java.lang.String defaulttheme;
    
    java.lang.String dbPort;
    
    java.lang.String activeDatabase;
    
    java.util.Properties sysProp;
    
    java.lang.String passwd;
    
    private org.netbeans.lib.sql.PasswordInfo pwdInfo;
    
    private java.lang.String userName;
    // dbServerIp = this.getdbServerIpAdd();
    
    /** Creates new form logindlg */
    
    public SecureLogin2HR(java.awt.Frame parent, boolean modal, java.sql.Connection connectDB, org.netbeans.lib.sql.pool.PooledConnectionSource pconnectDB, java.lang.String logonName) {
        
        super(parent, modal);
        
        connDB = connectDB;
        
        pconnDB = pconnectDB;
        
        userName = logonName;
        
       // dbServerIp = this.getdbServerIpAdd();
        
        
        
       // initComponents();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Dialog - Inventory/Pharmacy");
        setFont(new java.awt.Font("Lucida Sans", 1, 10));
        setModal(true);
        setName("syslogindlg");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 420;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(204, 255, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please enter valid system username and password");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(new java.awt.Insets(1, 1, 1, 1), new java.awt.Color(0, 255, 255)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("User Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLabel3, gridBagConstraints);

        jTextField1.setColumns(7);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jTextField1, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.gif")));
        jButton1.setMnemonic('L');
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minusarm.gif")));
        jButton2.setMnemonic('R');
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD14755_.GIF")));
        jButton3.setMnemonic('A');
        jButton3.setText("Abort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton3, gridBagConstraints);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPasswordField1, gridBagConstraints);

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(377, 209));
        setLocation((screenSize.width-377)/2,(screenSize.height-209)/2);
    }//GEN-END:initComponents
    
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        
        if (evt.getModifiers() == java.awt.event.KeyEvent.VK_ENTER){
            
            System.out.println("Key Typed");
            
            // formKeyTyped(evt);
            
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
        if (evt.getModifiers() == java.awt.event.KeyEvent.VK_ENTER){
            
            //   formKeyTyped(evt);
            
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER){
            
            //        System.out.println("Papa");
            
          //  this.logOn2System();
            
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_jPasswordField1KeyTyped
    
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER){
            
          //  this.logOn2System();
            
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped
    
    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER){
            
        //    this.logOn2System();
            
        }
        
        
        // Add your handling code here:
    }//GEN-LAST:event_formKeyTyped
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
     //   this.logOn2System();
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.jTextField1.setText(null);
        
        this.jPasswordField1.setText(null);
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        System.exit(0);
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        
        setVisible(false);
        
        dispose();
        
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        
//       new Login2HospInventory(new javax.swing.JFrame(), true).setVisible(true);
        
//    }
    
    //  public class DbServerIP extends javax.swing.AbstractAction {
    
    public java.lang.String getdbServerIpAdd() {
        
        java.lang.String dbServerIp = null;
        
        java.lang.String myAppFileUrl = null;
        
        myAppFileUrl =  System.getProperty("user.dir")
        
        + System.getProperty("file.separator")
        
        + "hosprop.properties";
        
        try {
            
            java.io.FileInputStream propInFile = new java.io.FileInputStream(myAppFileUrl);
            
            
            
            //       java.io.FileOutputStream propOutFile = new java.io.FileOutputStream("myapp.properties");
            
            java.util.Properties appProp = new java.util.Properties();
            
            try {
                System.out.println("Properties file : "+myAppFileUrl);
                
                appProp.load(propInFile);
                
                dbServerIp = appProp.getProperty("dbServerIpAdd", "127.0.0.1");
                
                System.out.println("Database Server IP : "+dbServerIp);
                
                activeDatabase = appProp.getProperty("activeDatabase");
                
                System.setProperty("activeDatabase", activeDatabase);
                
                dbPort = appProp.getProperty("dbPort", "5432");
                
                System.setProperty("dbPort", dbPort);
                                
                path2Acrobat = appProp.getProperty("path2Acrobat", "c:/Program Files/Adobe/Acrobat 5.0/Reader/AcroRd32.exe");
                
                defaultlnf = appProp.getProperty("defaultlnf", "com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
                
                backgrdimg = appProp.getProperty("backgrdimg", "c:/Tests/clouds.jpg");
                
                cashpoint = appProp.getProperty("cashpoint");
                
                papersize_width = appProp.getProperty("papersize_width", java.lang.String.valueOf(270));
                
                System.setProperty("papersize_width", papersize_width);
                
                papersize_legnth = appProp.getProperty("papersize_legnth", java.lang.String.valueOf(270));
                
                System.setProperty("papersize_legnth", papersize_legnth);
                
                System.setProperty("backgrdimg",backgrdimg);
                
                System.setProperty("cashpoint", cashpoint);
                
                System.out.println("Cash Point "+System.getProperty("cashpoint"));
                
                System.setProperty("defaultlnf", defaultlnf);
                
                defaulttheme = appProp.getProperty("defaulttheme", "xplunathemepack.zip");
                
                System.setProperty("defaulttheme", defaulttheme);
                
                System.setProperty("acrobatpath",path2Acrobat);
                
                passwd = System.getProperty("password");
                
                System.out.println(dbServerIp);
                
                propInFile.close();
                
                //  return dbServerIp;
                
                
            } catch (java.io.IOException ioExec){
                
                System.out.println(ioExec.getMessage());
                
            }
            
            // return dbServerIp;
            
        } catch (java.lang.Exception exc){
            
            System.out.println(exc.getMessage());
            
            //    javax.swing.JOptionPane.showMessageDialog(this, "Properties file not found!");
            
        }
        
        return dbServerIp;
        
    }
    
    public void menuItemDisabler(java.lang.String[] menuItems2disable, javax.swing.JFrame appChosen, javax.swing.JMenuBar appMenuBar) {
        
        int noOfMnit = menuItems2disable.length;
        
    }
    
    /*    public void submitLogin() {
     
        java.lang.String userName = this.jTextField1.getText();
     
        java.lang.String passWord = this.jPasswordField1.getText();
     
        if (!userName.equals("") && !passWord.equals("")) {
     
            try {
     
                Class.forName("org.postgresql.Driver");
     
            } catch(java.lang.ClassNotFoundException clsExec){
     
                        java.awt.Toolkit.getDefaultToolkit().beep();
     
                        javax.swing.JOptionPane.showMessageDialog(this, "Please check your network connection or contact system administrator" +
                        " and password!", "Error!", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
     
     
        if (userName.equals("") && passWord.equals("")) {
     
        java.awt.Toolkit.getDefaultToolkit().beep();
     
        javax.swing.JOptionPane.showMessageDialog(this, "Can't have null username" +
     
        " and password!", "Warning!", javax.swing.JOptionPane.WARNING_MESSAGE);
     }
        else {
     
            if(userName.equals("") && !passWord.equals("")){
     
                        java.awt.Toolkit.getDefaultToolkit().beep();
     
                        javax.swing.JOptionPane.showMessageDialog(this, "Can't have null " +
                        "username!", "Warning!", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
            else {
                if(!userName.equals("") && passWord.equals("")){
     
                    java.awt.Toolkit.getDefaultToolkit().beep();
     
                    javax.swing.JOptionPane.showMessageDialog(this, "Can't have null " +
                    "password!", "Warning!", javax.swing.JOptionPane.WARNING_MESSAGE);
     
                }
     
            }
        }
     
        }
     
     
        }*/
    
    public com.afrisoftech.hr.HRMain logOn2System() {
        
        com.afrisoftech.hr.HRMain secureHRMain = null;
        
/*        userName = this.jTextField1.getText();
        
        char passsWord[] = this.jPasswordField1.getPassword();
        
        java.lang.String passWord = java.lang.String.copyValueOf(passsWord);
        
        pwdInfo = new org.netbeans.lib.sql.PasswordInfo(passWord);
        
        System.out.println(pwdInfo.getPassword());
        
        System.out.println(passWord);
        
        sysProp = System.getProperties();
        
        sysProp.setProperty("password",passWord);
        
        System.setProperty("currentuser",userName);
        
       */ 
        
        //java.lang.String dbServerIpAdd = this.getdbServerIpAdd();
        
        javax.swing.MenuElement[] menuItems = null;
        
        java.sql.Statement resStatement = null;
        
        //    javax.swing.JMenuItem menuItem = new javax.swing.JMenuItem;
        
        
        
//        if (!userName.equals("") && !passWord.equals("")) {
            
            try {
                
//                connDB = this.getDbConnection(userName, passWord);
                
//                pconnDB = this.getPooledConnectionSource();
                
                if (!connDB.equals(null)) {
                    
                    System.out.println("Conneted to database successfully");
                    
                    resStatement = connDB.createStatement();
                    
                }
                System.out.println("Created statement");
                
                java.sql.ResultSet reSet = resStatement.executeQuery("select menu_item from secure_passwd where access_priv ='t' AND login_name ='"+userName+"'");
                
                System.out.println("selected");
                
                while (reSet.next()) {
                    
                    
                    
                    java.lang.reflect.Field[] field;
                    
                    try {
                        
                        java.lang.Class cl = Class.forName("com.afrisoftech.hr.HRMain");
                        
                        field = cl.getDeclaredFields();
                        
                        System.out.println("Class loaded");
                        
                        for (int j = 0; j < field.length; j++){
                            
                            if (field[j].getName().endsWith("mnit")){
                                
                            }
                            
                        }
                        
                    } catch(java.lang.Exception Exc){
                        
                        System.out.println("Error");
                    }
                    
                    
                    hrInst = new com.afrisoftech.hr.HRMain(connDB, pconnDB, path2Acrobat, passwd);//, this.path2Acrobat, this.pwdInfo.getPassword());
                    
                    //sysProp.put("hospmain", hospitalInst);
                    
                    java.lang.Object[] menuList2enable = this.getSystemMenuItems2Enable(this.getMenuItems2Enable(userName));
                    
                    hrInst.menuItemsDisabler(menuList2enable);
                    
                    secureHRMain = hrInst;
                    
                    //   hospitalInst.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
                    
                    //hospitalStockInst.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                    //                     inventoryInst.setVisible(true);
                   // hospitalStockInst.getPath2Acrobat();
                    
                    System.out.println(reSet.getString(1));
                    
                }
                
                
                
             //   hospitalStockInst.setVisible(true);
                
             //   this.setVisible(false);
                
             //   this.dispose();
                
            } catch (java.sql.SQLException sqlExec) {
                
                java.awt.Toolkit.getDefaultToolkit().beep();
                
                sqlExec.printStackTrace();
                
                javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                
            }
            
       /* }
        
        else {
            
            if (userName.equals("") && passWord.equals("")) {
                
                java.awt.Toolkit.getDefaultToolkit().beep();
                
                javax.swing.JOptionPane.showMessageDialog(this, "Can't have null username" +
                " and password!", "Warning!", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
            else {
                
                if(userName.equals("") && !passWord.equals("")){
                    
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    
                    javax.swing.JOptionPane.showMessageDialog(this, "Can't have null " +
                    "username!", "Warning!", javax.swing.JOptionPane.WARNING_MESSAGE);
                }
                else {
                    if(!userName.equals("") && passWord.equals("")){
                        
                        java.awt.Toolkit.getDefaultToolkit().beep();
                        
                        javax.swing.JOptionPane.showMessageDialog(this, "Can't have null " +
                        "password!", "Warning!", javax.swing.JOptionPane.WARNING_MESSAGE);
                        
                    }
                    
                }
            }
        }
        */
        return secureHRMain;
        
    }
    
    public java.lang.String[] getMenuItems2Enable(java.lang.String logiName) {
        
        java.sql.ResultSet rsetArray;
        
        java.lang.String[] menus2enable = null;
        
        java.sql.Array menuListArray = null;
        
        java.util.Vector menuVector = new java.util.Vector(1,1);
        
        try {
            
            java.sql.Statement stmtDB = connDB.createStatement();
            
            java.sql.ResultSet rSet = stmtDB.executeQuery("SELECT menu_list FROM secure_menu_access WHERE login_name ='"+logiName+"' AND sys_name = 'hospital_hr'");
            
            while (rSet.next()) {
                
                menuListArray = rSet.getArray(1);
                
                menus2enable = (java.lang.String[])menuListArray.getArray();
                
                
            }
            
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getLocalizedMessage());
            
        }
        
        System.out.println("These are items to enable \n");
        
        for (int k = 0; k < menus2enable.length; k++) {
            
            System.out.println(menus2enable[k]);
            
        }
        
        return menus2enable;
        
        
        
    }
    
    public java.lang.Object[] getSystemMenuItems2Enable(java.lang.String[] menus2enable) {
        
        java.lang.Object[] menuList2enable = null;
        
        java.util.Vector menuListVector = new java.util.Vector(1,1);
        
        for (int i = 0; i < menus2enable.length; i++) {
            
            try {
                
                java.sql.Statement stmtDB = connDB.createStatement();
                
                java.sql.ResultSet rSet = stmtDB.executeQuery("SELECT menu_item FROM menu_item_list WHERE item_desc='"+menus2enable[i]+"' AND app_name = 'hospital_hr'");
                
                while (rSet.next()) {
                    
                    menuListVector.addElement(rSet.getString(1));
                    
                }
                
            } catch(java.sql.SQLException sqlExec) {
                
                javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getLocalizedMessage());
                
            }
            
        }
        
        return menuList2enable = menuListVector.toArray();
        
    }
    
/*    public java.sql.Connection getDbConnection(java.lang.String userName, java.lang.String passWord) throws java.sql.SQLException {
        
        java.sql.Connection connection = null;
        
        try {
            
            java.lang.Class.forName("org.postgresql.Driver");
            
        } catch(java.lang.ClassNotFoundException cnf) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), cnf.getMessage());
            
        }
        
        try {
            
            connection = java.sql.DriverManager.getConnection("jdbc:postgresql://"+this.dbServerIp+":"+dbPort+"/"+activeDatabase, userName, passWord);
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), "ERROR : Logon denied due to incorrect password!");
            
        }
        
        return connection;
    }
    
    public org.netbeans.lib.sql.pool.PooledConnectionSource getPooledConnectionSource() {
        
        org.netbeans.lib.sql.pool.PooledConnectionSource pooledConnectionSource1 = new org.netbeans.lib.sql.pool.PooledConnectionSource();
        
        pooledConnectionSource1.setDatabase("jdbc:postgresql://"+this.dbServerIp+":"+dbPort+"/"+activeDatabase);
        
        pooledConnectionSource1.setDriver("org.postgresql.Driver");
        
        pooledConnectionSource1.setPassword(pwdInfo);
        
        
        
        pooledConnectionSource1.setUsername(userName);
        
        return pooledConnectionSource1;
    }
    
    */
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
