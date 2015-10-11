/*
 * SplashScreenDialog.java
 *
 * Created on October 26, 2003, 12:19 PM
 */


package com.afrisoftech.sys;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.plaf.*;
/**
 *
 * @author  root
 */
public class SaccoSplashScreenDialog extends javax.swing.JDialog implements java.lang.Runnable {
   
    int noOfWrongEntries = 0;
    
    boolean errorStatus = false;
    
    boolean securitySettings = true;
    
    boolean securityFinished = true;
    
    java.lang.String noText = "";
    
    java.lang.String dbServerIp;
    
    java.sql.Connection connDB = null;
    
    java.lang.Thread loginThread;
    
    com.afrisoftech.sys.SplashScreenDialog splashScreen;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB = null;
    
    com.afrisoftech.hospital.HospitalMain hospitalInst;
    
    java.lang.String path2Acrobat;
    
    java.lang.String defaultlnf;
    
    java.lang.String cashpoint;
    
    java.lang.String papersize_width;
    
    java.lang.String papersize_legnth;
    
    java.lang.String backgrdimg;
    
    java.lang.String defaulttheme;
    
    java.lang.String dbPort;
    
    java.lang.String font_type_name;
    
    java.lang.String activeDatabase;
    
    java.lang.String receiptFontSize;
    
    java.lang.String receiptTitleFontSize;
    
    java.lang.String receiptPageMargin;
    
    java.util.Properties sysProp;
    
    java.lang.String docsdir;
    
    java.lang.String defaultSplitPane;
    
    private org.netbeans.lib.sql.PasswordInfo pwdInfo;
    
    private java.lang.String userName;
    
    
//    private ProgressThread progressThread;
    
    public static Thread login2SaccoThread;
    
    public String phraseSeparator;
    
    public String lineCharacter;
    
    public String dottedLineCharacter;
    
    public String newLineCharacter;
    
    public String linesPerPage;
                
    public String charactersPerLine;
    
    public String rcptLinesPerPage;
    
    public String rcptCharsPerPage;
    
    public String defaultPrinter;
    
    
    protected javax.swing.JProgressBar splashProgressBar;
    
    public static SaccoSplashScreenDialog saccoSplashDialog;
    
    com.afrisoftech.sys.Login2Sacco login2Sacco;
    
    
 //   public static java.lang.Thread login2HospitalThread;
    
    boolean splashStart = true;
    
    boolean starting = true;
    
//    java.lang.String backgrdimg;
    
    javax.swing.ImageIcon desktopPaneIcon;
    
//    java.util.Properties sysProp;
    
    /** Creates new form SplashScreenDialog */
    public SaccoSplashScreenDialog(java.awt.Frame parent, boolean modal) {
        
        
        super(parent, modal);
        
        loadImage();
        
        desktopPaneIcon = new javax.swing.ImageIcon(System.getProperty("backgrdimg","c:/Tests/clouds.jpg"));
        
        splashProgressBar = new javax.swing.JProgressBar();
        java.lang.String myAppFileUrl = null;
        
        myAppFileUrl =  System.getProperty("user.dir")
        
        + System.getProperty("file.separator")
        
        + "hosprop.properties";
        
        try {
            //catch java.lang.ClassNotFoundException(this.show(This is not true));     
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
                
                receiptPageMargin = appProp.getProperty("receiptPageMargin", "0");
                
                System.setProperty("receiptPageMargin", receiptPageMargin);
                
                receiptFontSize = appProp.getProperty("receiptFontSize", "10");
                
                System.setProperty("receiptFontSize", this.receiptFontSize);
                
                receiptTitleFontSize = appProp.getProperty("receiptTitleFontSize", "12");
                
                System.setProperty("receiptTitleFontSize", this.receiptTitleFontSize);
                
                dbPort = appProp.getProperty("dbPort", "5432");
                
                System.setProperty("dbPort", dbPort);
                
                path2Acrobat = appProp.getProperty("path2Acrobat", "c:/Program Files/Adobe/Acrobat 5.0/Reader/AcroRd32.exe");
                
                defaultlnf = appProp.getProperty("defaultlnf", "com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
                
                backgrdimg = appProp.getProperty("backgrdimg", "c:/Tests/clouds.jpg");
                
                cashpoint = appProp.getProperty("cashpoint");
                
                docsdir = appProp.getProperty("docsdir");
                
                defaultPrinter = appProp.getProperty("defaultprinter","PRN");
                
                System.setProperty("docsdir", docsdir);
                
                System.setProperty("defaultprinter",defaultPrinter);
                
                papersize_width = appProp.getProperty("papersize_width", java.lang.String.valueOf(270));
                
                System.setProperty("papersize_width", papersize_width);
                
                papersize_legnth = appProp.getProperty("papersize_legnth", java.lang.String.valueOf(270));
                
                System.setProperty("papersize_legnth", papersize_legnth);
                
                font_type_name = appProp.getProperty("font_type_name", "monospaced.plain");
                
                System.setProperty("backgrdimg",backgrdimg);
                
                
                System.setProperty("defaultlnf", defaultlnf);
                
                defaulttheme = appProp.getProperty("defaulttheme", "xplunathemepack.zip");
                
                System.setProperty("defaulttheme", defaulttheme);
                
                System.setProperty("acrobatpath",path2Acrobat);
                
                System.setProperty("activedatabase", "MEDIC");
                
                System.out.println(dbServerIp);
                
                defaultSplitPane = appProp.getProperty("defaultsplitpane", "Hospital Operations");
                
                System.setProperty("defaultsplitpane", defaultSplitPane);
                
                phraseSeparator = appProp.getProperty("phrase.separator", "  ");
                
                lineCharacter = appProp.getProperty("line.character", "_");
                
                dottedLineCharacter = appProp.getProperty("dotted.line.character", "-");
                
                newLineCharacter = appProp.getProperty("new.line.character", " \n ");
                
                linesPerPage = appProp.getProperty("linesperpage", "62");
                
                charactersPerLine = appProp.getProperty("charactersperline", "70");
                
                rcptLinesPerPage = appProp.getProperty("rcptlinesperpage","16");
                
                rcptCharsPerPage = appProp.getProperty("rcptcharactersperpage","72");                
                 
                System.setProperty("phrase.separator", phraseSeparator);
                
                System.setProperty("line.character", lineCharacter);
                
                System.setProperty("dotted.line.character", dottedLineCharacter);
                
                System.setProperty("new.line.character", newLineCharacter);
                
                System.setProperty("linesperpage",linesPerPage);
                
                System.setProperty("charactersperline",charactersPerLine);
                
                System.setProperty("rcptlinesperpage",rcptLinesPerPage);
                
                System.setProperty("rcptcharactersperline",rcptCharsPerPage);
               
                
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
        
        changeThemeByUrl(System.getProperty("defaultlnf", "com.l2fprod.gui.plaf.skin.SkinLookAndFeel"), getClass().getResource("/"+System.getProperty("defaulttheme", "xplunathemepack.zip")));
        
        initComponents();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        splashPopupMenu = new javax.swing.JPopupMenu();
        exitmnit = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        splashMainPanel = new javax.swing.JPanel() {

            public void paintComponent(java.awt.Graphics g) {

                java.awt.Dimension d = getSize();

                g.drawImage(desktopPaneIcon.getImage(), 0, 0, d.width, d.height,null);
                System.out.println("still drawing");
                setOpaque(false);

                super.paintComponent(g);

            }

        };
        ;
        spacerLabel = new javax.swing.JLabel();
        legalPanel = new javax.swing.JPanel();
        legalLabel = new javax.swing.JLabel();

        exitmnit.setText("Abort system startup.");
        exitmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitmnitActionPerformed(evt);
            }
        });
        splashPopupMenu.add(exitmnit);

        jLabel1.setText("jLabel1");

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        splashMainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.pink, java.awt.Color.red, java.awt.Color.orange, java.awt.Color.lightGray));
        splashMainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                splashMainPanelMousePressed(evt);
            }
        });
        splashMainPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 100.0;
        splashMainPanel.add(spacerLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        getContentPane().add(splashMainPanel, gridBagConstraints);

        legalPanel.setBackground(new java.awt.Color(0, 0, 51));
        legalPanel.setLayout(new java.awt.GridBagLayout());

        legalLabel.setBackground(new java.awt.Color(0, 0, 51));
        legalLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        legalLabel.setForeground(new java.awt.Color(255, 255, 255));
        legalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        legalLabel.setText("Funsoft is a registered trademark of System Partners Limited");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        legalPanel.add(legalLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(legalPanel, gridBagConstraints);

        setSize(new java.awt.Dimension(609, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void splashMainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_splashMainPanelMousePressed
        
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
            
            splashPopupMenu.show(splashMainPanel, evt.getX(), evt.getY());
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_splashMainPanelMousePressed
    
    private void exitmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitmnitActionPerformed
        
        System.exit(0);
        // Add your handling code here:
    }//GEN-LAST:event_exitmnitActionPerformed
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // Add your handling code here:
    }//GEN-LAST:event_formMousePressed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     /*   
       java.util.HashMap fontAttributes = new java.util.HashMap();
       fontAttributes.put(java.awt.font.TextAttribute.FAMILY, "Dialog");
       fontAttributes.put(java.awt.font.TextAttribute.SIZE, new java.lang.Float(12.0));
       fontAttributes.put(java.awt.font.TextAttribute.WIDTH, java.awt.font.TextAttribute.WIDTH_CONDENSED);
       fontAttributes.put(java.awt.font.TextAttribute.WEIGHT, java.awt.font.TextAttribute.WEIGHT_LIGHT);
        Font FONT_STANDARD = new Font(fontAttributes);
//        Font FONT_STANDARD = new Font("Helvetica",Font.PLAIN,11);        
        FontUIResource FONT_UI_RES_STANDARD = new FontUIResource(FONT_STANDARD);
        Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource) UIManager.put(key,FONT_UI_RES_STANDARD);
        }
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {}
        */

        saccoSplashDialog = new SaccoSplashScreenDialog(new javax.swing.JFrame(), false);

        
        saccoSplashDialog.setVisible(true);
        
        
        login2SaccoThread = new java.lang.Thread(saccoSplashDialog, "Login2Sacco");
        
        login2SaccoThread.start();
        
    }
    
    public void run() {
        
        while (splashStart) {
            
            if (starting) {
                
                try {
                    
                    Thread.currentThread().sleep(300);
                    
                } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
                
                //splashStart = false;
                //}
                
                login2Sacco = new com.afrisoftech.sys.Login2Sacco(new javax.swing.JFrame(), false, saccoSplashDialog, login2SaccoThread);
                
                login2Sacco.setVisible(true);
                
                //   infoLable.setText("   Applying security settings  ");
                
                // splashProgressBar.setIndeterminate(true);
                
                
                login2Sacco.dispose();
                
                saccoSplashDialog.requestFocus();
                
                this.validate();
                
                //starting = false;
                
            } else {
                
                //this.show();
                
            }
            
            try {
                
                Thread.currentThread().sleep(500);
                
            } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
            
            splashStart = false;
        }
        
    }
    
    public void loadImage() {
        
        java.lang.String myAppFileUrl = null;
        
        myAppFileUrl =  System.getProperty("user.dir")
        
        + System.getProperty("file.separator")
        
        + "hosprop.properties";
        
        try {
            
            java.io.FileInputStream propInFile = new java.io.FileInputStream(myAppFileUrl);
            
            
            
            //       java.io.FileOutputStream propOutFile = new java.io.FileOutputStream("myapp.properties");
            
            java.util.Properties appProp = new java.util.Properties();
            
            try {
                
                appProp.load(propInFile);
                
                backgrdimg = appProp.getProperty("backgrdimg", "c:/Tests/clouds.jpg");
                
                System.setProperty("backgrdimg",backgrdimg);
                
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
        
    }
    
    protected void addVisibles() {
        
        javax.swing.JLabel logonLabel = new javax.swing.JLabel("Loading security settings. Please wait...");
        logonLabel.setFont(new java.awt.Font("Helvetica", 0, 12));
        java.awt.GridBagConstraints gridBagConstraints2 = new java.awt.GridBagConstraints();
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.gridy = 4;
        gridBagConstraints2.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints2.weightx = 300.0;
        gridBagConstraints2.weighty = 1.0;
        gridBagConstraints2.insets = new java.awt.Insets(0, 5, 0, 5);
        splashMainPanel.add(logonLabel, gridBagConstraints2);
        
        java.awt.GridBagConstraints gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 5;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.weightx = 300.0;
        gridBagConstraints1.weighty = 0.0;
        gridBagConstraints1.insets = new java.awt.Insets(0, 0, 0, 0);
        //splashProgressBar.setOpaque(false);
        splashProgressBar.setForeground(new java.awt.Color(213, 98, 28));//java.awt.Color.cyan);
        //splashProgressBar.setBorderPainted(false);
        splashProgressBar.setPreferredSize(new java.awt.Dimension(splashProgressBar.getWidth(),6));
        splashMainPanel.add(splashProgressBar, gridBagConstraints1);
        //  System.out.println("Added progress bar !!!");
        this.invalidate();
    }
   public void changeThemeByUrl(java.lang.String lnf, java.net.URL themepack) {
        
        java.lang.String themepackPath = null;
        
        
        com.l2fprod.gui.plaf.skin.Skin skin = null;
        
        try {
            
            skin = com.l2fprod.gui.plaf.skin.SkinLookAndFeel.loadThemePack(themepack);
            
        } catch(java.lang.Exception exec) {
            
            
        }
        
        
        com.l2fprod.gui.plaf.skin.SkinLookAndFeel.setSkin(skin);
        
        java.awt.Component[] component_array = null;
        
        
        component_array = this.getComponents();
        
        try {
            
            try {
                
                try {
                    
                    try {
                        
                        
                        javax.swing.UIManager.setLookAndFeel(lnf);
                        
                        // jToolBar1.updateUI();
                        
                        //   this.jPopupMenu1.updateUI();
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this);
                        
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this.getRootPane());
                        
//                        updateNewComponentsUI();
                        
                        //    javax.swing.SwingUtilities.updateComponentTreeUI(this.jPopupMenu1);
                        
                        // this.jMenuBar1.setBorder(new javax.swing.border.TitledBorder(null, "Hospital System Menu Bar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier", 2, 8), new java.awt.Color(0, 0, 153)));
                        
                        
                    } catch(java.lang.ClassNotFoundException cnfExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(this, cnfExec.getMessage());
                        
                    }
                    
                    
                } catch(java.lang.InstantiationException instExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(this, instExec.getMessage());
                    
                }
                
            } catch(java.lang.IllegalAccessException illegExec) {
                
                javax.swing.JOptionPane.showMessageDialog(this, illegExec.getMessage());
                
            }
            
        } catch(javax.swing.UnsupportedLookAndFeelException unsuppExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, unsuppExec.getMessage());
            
        }
        
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitmnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel legalLabel;
    private javax.swing.JPanel legalPanel;
    private javax.swing.JLabel spacerLabel;
    private javax.swing.JPanel splashMainPanel;
    private javax.swing.JPopupMenu splashPopupMenu;
    // End of variables declaration//GEN-END:variables
    
}
