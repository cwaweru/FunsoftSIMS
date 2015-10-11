/*
 * DefaultInternalFrame.java
 *
 * Created on May 31, 2004, 1:53 PM
 */

package com.afrisoftech.hr;

/**
 *
 * @author  postgres
 */
public class ApplicantResumeDBIntfr extends javax.swing.JInternalFrame {
    
    java.sql.Connection connectDB = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    
    public ApplicantResumeDBIntfr(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
        connectDB = connDb;
        
        pConnDB = pconnDB;
        
        initComponents();
    }
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jSearchDialog1 = new javax.swing.JDialog();
        jSearchPanel1 = new javax.swing.JPanel();
        jTextField1111 = new javax.swing.JTextField();
        jSearchScrollPane1 = new javax.swing.JScrollPane();
        jSearchTable1 = new javax.swing.JTable();
        jButton41 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        try {
            nBCachedRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet2 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet3 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet4 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet5 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet6 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet7 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet8 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet9 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            nBCachedRowSet10 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jSearchDialog2 = new javax.swing.JDialog();
        jSearchPanel11 = new javax.swing.JPanel();
        jTextField11111 = new javax.swing.JTextField();
        jSearchScrollPane11 = new javax.swing.JScrollPane();
        jSearchTable11 = new javax.swing.JTable();
        jButton411 = new javax.swing.JButton();
        jButton511 = new javax.swing.JButton();
        try {
            searchRowSet1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jSearchDialog11 = new javax.swing.JDialog();
        jSearchPanel12 = new javax.swing.JPanel();
        jTextField11112 = new javax.swing.JTextField();
        jSearchScrollPane12 = new javax.swing.JScrollPane();
        jSearchTable12 = new javax.swing.JTable();
        jButton412 = new javax.swing.JButton();
        jButton512 = new javax.swing.JButton();
        try {
            crset1 = new org.netbeans.lib.sql.NBCachedRowSet();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        mainPanel3 = new javax.swing.JPanel();
        labelPanel3 = new javax.swing.JPanel();
        imgPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        actionsPanel3 = new javax.swing.JPanel();
        newAction3 = new javax.swing.JButton();
        updateAction3 = new javax.swing.JButton();
        deleteAction3 = new javax.swing.JButton();
        clearAction3 = new javax.swing.JButton();
        spacerPanel3 = new javax.swing.JPanel();
        helpPanel3 = new javax.swing.JPanel();
        helpAction3 = new javax.swing.JButton();
        subMainPanel3 = new javax.swing.JPanel();
        dataPanel3 = new javax.swing.JPanel();
        firstAction3 = new javax.swing.JButton();
        previousAction3 = new javax.swing.JButton();
        nextAction2 = new javax.swing.JButton();
        lastAction3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        datePicker2 = new com.afrisoftech.lib.DatePicker();
        datePicker3 = new com.afrisoftech.lib.DatePicker();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        mainPanel311 = new javax.swing.JPanel();
        labelPanel311 = new javax.swing.JPanel();
        imgPanel311 = new javax.swing.JPanel();
        jLabel2311 = new javax.swing.JLabel();
        actionsPanel311 = new javax.swing.JPanel();
        newAction311 = new javax.swing.JButton();
        updateAction311 = new javax.swing.JButton();
        deleteAction311 = new javax.swing.JButton();
        clearAction311 = new javax.swing.JButton();
        spacerPanel311 = new javax.swing.JPanel();
        helpPanel311 = new javax.swing.JPanel();
        helpAction311 = new javax.swing.JButton();
        subMainPanel311 = new javax.swing.JPanel();
        dataPanel311 = new javax.swing.JPanel();
        firstAction311 = new javax.swing.JButton();
        previousAction311 = new javax.swing.JButton();
        nextAction211 = new javax.swing.JButton();
        lastAction311 = new javax.swing.JButton();
        jPanel1211 = new javax.swing.JPanel();
        jLabel3111 = new javax.swing.JLabel();
        jLabel4111 = new javax.swing.JLabel();
        jLabel6111 = new javax.swing.JLabel();
        jLabel7111 = new javax.swing.JLabel();
        jComboBox11121 = new javax.swing.JComboBox();
        jTextField41112 = new javax.swing.JTextField();
        jTextField61132 = new javax.swing.JTextField();
        jLabel311112 = new javax.swing.JLabel();
        facilitynameLbl11111 = new javax.swing.JLabel();
        facilityidLbl11111 = new javax.swing.JLabel();
        jTextField61131 = new javax.swing.JTextField();
        jComboBox111211 = new javax.swing.JComboBox();
        jComboBoxx1 = new javax.swing.JComboBox();
        datePicker1 = new com.afrisoftech.lib.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jTextField36 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        fieldsPanel3111 = new javax.swing.JPanel();
        facilitynameLbl11112 = new javax.swing.JLabel();
        facilityidLbl11112 = new javax.swing.JLabel();
        facilityidLbl11211 = new javax.swing.JLabel();
        facilityidLbl11311 = new javax.swing.JLabel();
        facilityidLbl1171 = new javax.swing.JLabel();
        jTextField6111211 = new javax.swing.JTextField();
        jTextField6111111 = new javax.swing.JTextField();
        jTextField611211 = new javax.swing.JTextField();
        jTextField6111612 = new javax.swing.JTextField();
        jTextField611172 = new javax.swing.JTextField();
        facilityidLbl11611 = new javax.swing.JLabel();
        facilityidLbl11411 = new javax.swing.JLabel();
        facilityidLbl11511 = new javax.swing.JLabel();
        jLabel122111 = new javax.swing.JLabel();
        facilitynameLbl1121 = new javax.swing.JLabel();
        jTextField6111531 = new javax.swing.JTextField();
        jTextField61115111 = new javax.swing.JTextField();
        jTextField61115211 = new javax.swing.JTextField();
        jTextField6111411 = new javax.swing.JTextField();
        jTextField6111311 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        mainPanel1 = new javax.swing.JPanel();
        labelPanel1 = new javax.swing.JPanel();
        imgPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        actionsPanel1 = new javax.swing.JPanel();
        newAction1 = new javax.swing.JButton();
        updateAction1 = new javax.swing.JButton();
        deleteAction1 = new javax.swing.JButton();
        clearAction1 = new javax.swing.JButton();
        spacerPanel1 = new javax.swing.JPanel();
        helpPanel1 = new javax.swing.JPanel();
        helpAction1 = new javax.swing.JButton();
        subMainPanel = new javax.swing.JPanel();
        fieldsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        dataPanel = new javax.swing.JPanel();
        firstAction = new javax.swing.JButton();
        previousAction = new javax.swing.JButton();
        nextAction = new javax.swing.JButton();
        lastAction = new javax.swing.JButton();
        jLabel311 = new javax.swing.JLabel();
        jPanel611 = new javax.swing.JPanel();
        jTextField361 = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        mainPanel2 = new javax.swing.JPanel();
        labelPanel2 = new javax.swing.JPanel();
        imgPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        actionsPanel2 = new javax.swing.JPanel();
        newAction2 = new javax.swing.JButton();
        updateAction2 = new javax.swing.JButton();
        deleteAction2 = new javax.swing.JButton();
        clearAction2 = new javax.swing.JButton();
        spacerPanel2 = new javax.swing.JPanel();
        helpPanel2 = new javax.swing.JPanel();
        helpAction2 = new javax.swing.JButton();
        subMainPanel21 = new javax.swing.JPanel();
        fieldsPanel21 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        dataPanel21 = new javax.swing.JPanel();
        firstAction21 = new javax.swing.JButton();
        previousAction21 = new javax.swing.JButton();
        nextAction31 = new javax.swing.JButton();
        lastAction21 = new javax.swing.JButton();
        jLabel3112 = new javax.swing.JLabel();
        jPanel6111 = new javax.swing.JPanel();
        jTextField362 = new javax.swing.JTextField();
        searchButton11 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        mainPanel4 = new javax.swing.JPanel();
        labelPanel4 = new javax.swing.JPanel();
        imgPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        actionsPanel4 = new javax.swing.JPanel();
        newAction4 = new javax.swing.JButton();
        deleteAction4 = new javax.swing.JButton();
        clearAction4 = new javax.swing.JButton();
        spacerPanel4 = new javax.swing.JPanel();
        helpPanel4 = new javax.swing.JPanel();
        helpAction4 = new javax.swing.JButton();
        subMainPanel1 = new javax.swing.JPanel();
        fieldsPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList11 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel312 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList12 = new javax.swing.JList();
        jScrollPane22 = new javax.swing.JScrollPane();
        jList111 = new javax.swing.JList();
        jButton21 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel313 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList13 = new javax.swing.JList();
        jScrollPane25 = new javax.swing.JScrollPane();
        jList112 = new javax.swing.JList();
        jButton22 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel314 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jList14 = new javax.swing.JList();
        jScrollPane26 = new javax.swing.JScrollPane();
        jList113 = new javax.swing.JList();
        jButton23 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jLabel315 = new javax.swing.JLabel();
        jLabel3113 = new javax.swing.JLabel();
        jPanel6112 = new javax.swing.JPanel();
        jTextField363 = new javax.swing.JTextField();
        searchButton12 = new javax.swing.JButton();
        jPanel51 = new javax.swing.JPanel();
        mainPanel21 = new javax.swing.JPanel();
        labelPanel21 = new javax.swing.JPanel();
        imgPanel21 = new javax.swing.JPanel();
        jLabel221 = new javax.swing.JLabel();
        actionsPanel21 = new javax.swing.JPanel();
        newAction21 = new javax.swing.JButton();
        updateAction21 = new javax.swing.JButton();
        deleteAction21 = new javax.swing.JButton();
        clearAction21 = new javax.swing.JButton();
        spacerPanel21 = new javax.swing.JPanel();
        helpPanel21 = new javax.swing.JPanel();
        helpAction21 = new javax.swing.JButton();
        subMainPanel211 = new javax.swing.JPanel();
        fieldsPanel211 = new javax.swing.JPanel();
        jScrollPane211 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        dataPanel211 = new javax.swing.JPanel();
        firstAction211 = new javax.swing.JButton();
        previousAction211 = new javax.swing.JButton();
        nextAction311 = new javax.swing.JButton();
        lastAction211 = new javax.swing.JButton();
        jLabel3114 = new javax.swing.JLabel();
        jPanel6113 = new javax.swing.JPanel();
        jTextField364 = new javax.swing.JTextField();
        searchButton13 = new javax.swing.JButton();
        qualifiableamountLbl = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jSearchDialog1.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchDialog1.setModal(true);
        jSearchDialog1.setUndecorated(true);
        jSearchPanel1.setLayout(new java.awt.GridBagLayout());

        jSearchPanel1.setBorder(new javax.swing.border.EtchedBorder());
        jTextField1111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1111ActionPerformed(evt);
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

        nBCachedRowSet1.setCommand("select distinct lower(type_desc) as type_desc from hr.hr_sport_type order by type_desc");
        nBCachedRowSet1.setConnectionSource(pConnDB);
        nBCachedRowSet2.setCommand("select distinct lower(type_desc) as type_desc from hr.hr_hobby_type order by type_desc");
        nBCachedRowSet2.setConnectionSource(pConnDB);
        nBCachedRowSet3.setCommand("select distinct lower(language_name) as language_name from hr.hr_languages order by language_name");
        nBCachedRowSet3.setConnectionSource(pConnDB);
        nBCachedRowSet4.setCommand("select distinct upper(rec_no) as req from hr.hr_rec_request order by req");
        nBCachedRowSet4.setConnectionSource(pConnDB);
        nBCachedRowSet5.setCommand("select distinct lower(club_name) as club_name from hr.hr_social_clubs order by club_name");
        nBCachedRowSet5.setConnectionSource(pConnDB);
        nBCachedRowSet6.setCommand("select distinct upper(position) as position from hr.hr_rec_request order by position");
        nBCachedRowSet6.setConnectionSource(pConnDB);
        nBCachedRowSet8.setCommand("select distinct upper(source_desc) as source from hr.hr_app_sources order by source");
        nBCachedRowSet8.setConnectionSource(pConnDB);
        nBCachedRowSet9.setCommand("select distinct upper(citizen) as citizen from hr.hr_country order by citizen");
        nBCachedRowSet9.setConnectionSource(pConnDB);
        nBCachedRowSet10.setCommand("select distinct upper(qualification_desc) as qualif from hr.hr_education_qlf order by qualif");
        nBCachedRowSet10.setConnectionSource(pConnDB);
        jSearchDialog2.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchDialog2.setModal(true);
        jSearchDialog2.setUndecorated(true);
        jSearchPanel11.setLayout(new java.awt.GridBagLayout());

        jSearchPanel11.setBorder(new javax.swing.border.EtchedBorder());
        jTextField11111.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField11111CaretUpdate(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jSearchPanel11.add(jTextField11111, gridBagConstraints);

        jSearchTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        jButton411.setText("Select");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel11.add(jButton411, gridBagConstraints);

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
        jSearchDialog2.getContentPane().add(jSearchPanel11, gridBagConstraints);

        searchRowSet1.setCommand("select qualification_desc from hr.hr_education_qlf order by qualification_desc");
        searchRowSet1.setConnectionSource(pConnDB);
        jSearchDialog11.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchDialog11.setModal(true);
        jSearchDialog11.setUndecorated(true);
        jSearchPanel12.setLayout(new java.awt.GridBagLayout());

        jSearchPanel12.setBorder(new javax.swing.border.EtchedBorder());
        jTextField11112.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField11112CaretUpdate(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 300.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel12.add(jTextField11112, gridBagConstraints);

        jSearchTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Names"
            }
        ));
        jSearchTable12.setToolTipText("Click on the target row to select the patient from the search.");
        jSearchTable12.setShowHorizontalLines(false);
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
        jSearchTable12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable12MouseClicked(evt);
            }
        });

        jSearchScrollPane12.setViewportView(jSearchTable12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel12.add(jSearchScrollPane12, gridBagConstraints);

        jButton412.setText("Select");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel12.add(jButton412, gridBagConstraints);

        jButton512.setText("Close");
        jButton512.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton512ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel12.add(jButton512, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog11.getContentPane().add(jSearchPanel12, gridBagConstraints);

        crset1.setConnectionSource(pConnDB);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FILE INFORMATION");
        setVisible(true);
        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        mainPanel3.setLayout(new java.awt.GridBagLayout());

        labelPanel3.setLayout(new java.awt.GridBagLayout());

        labelPanel3.setBorder(new javax.swing.border.TitledBorder(""));
        imgPanel3.setLayout(new java.awt.GridBagLayout());

        imgPanel3.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_tracks.gif")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        imgPanel3.add(jLabel23, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel3.add(imgPanel3, gridBagConstraints);

        actionsPanel3.setLayout(new java.awt.GridBagLayout());

        actionsPanel3.setBorder(new javax.swing.border.TitledBorder("Actions"));
        newAction3.setMnemonic('w');
        newAction3.setText("New");
        newAction3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAction3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel3.add(newAction3, gridBagConstraints);

        updateAction3.setMnemonic('U');
        updateAction3.setText("Update");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel3.add(updateAction3, gridBagConstraints);

        deleteAction3.setMnemonic('D');
        deleteAction3.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel3.add(deleteAction3, gridBagConstraints);

        clearAction3.setMnemonic('C');
        clearAction3.setText("Clear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel3.add(clearAction3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        actionsPanel3.add(spacerPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        labelPanel3.add(actionsPanel3, gridBagConstraints);

        helpPanel3.setLayout(new java.awt.GridBagLayout());

        helpPanel3.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        helpAction3.setMnemonic('H');
        helpAction3.setText("Help");
        helpPanel3.add(helpAction3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel3.add(helpPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel3.add(labelPanel3, gridBagConstraints);

        subMainPanel3.setLayout(new java.awt.GridBagLayout());

        subMainPanel3.setBorder(new javax.swing.border.TitledBorder(""));
        dataPanel3.setLayout(new java.awt.GridBagLayout());

        dataPanel3.setBorder(new javax.swing.border.TitledBorder("Data navagation actions"));
        firstAction3.setMnemonic('F');
        firstAction3.setText("First");
        dataPanel3.add(firstAction3, new java.awt.GridBagConstraints());

        previousAction3.setMnemonic('P');
        previousAction3.setText("Previous");
        dataPanel3.add(previousAction3, new java.awt.GridBagConstraints());

        nextAction2.setMnemonic('N');
        nextAction2.setText("Next");
        dataPanel3.add(nextAction2, new java.awt.GridBagConstraints());

        lastAction3.setMnemonic('L');
        lastAction3.setText("Last");
        dataPanel3.add(lastAction3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel3.add(dataPanel3, gridBagConstraints);

        jPanel12.setLayout(new java.awt.GridBagLayout());

        jPanel12.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel31.setText("Applicant Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel31, gridBagConstraints);

        jLabel41.setText("Requisition No:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel41, gridBagConstraints);

        jLabel61.setText("Date of Application");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel61, gridBagConstraints);

        jLabel71.setText("Application Reciept Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel71, gridBagConstraints);

        jLabel81.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel81, gridBagConstraints);

        jLabel91.setText("Surname");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel91, gridBagConstraints);

        jLabel101.setText("Other Names");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel101, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jTextField11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jTextField21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jTextField51, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jTextField61, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel12.add(datePicker2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel12.add(datePicker3, gridBagConstraints);

        jLabel1.setText("Position Applied For");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel12.add(jLabel1, gridBagConstraints);

        jComboBox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet6, "position", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel12.add(jComboBox1, gridBagConstraints);

        jComboBox3.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet4, "req", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jComboBox3, gridBagConstraints);

        jLabel5.setText("Application Source");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jLabel5, gridBagConstraints);

        jComboBox2.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet8, "source", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel12.add(jComboBox2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        subMainPanel3.add(jPanel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel3.add(subMainPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(mainPanel3, gridBagConstraints);

        jTabbedPane1.addTab("Basic Information", jPanel1);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        mainPanel311.setLayout(new java.awt.GridBagLayout());

        labelPanel311.setLayout(new java.awt.GridBagLayout());

        labelPanel311.setBorder(new javax.swing.border.TitledBorder(""));
        imgPanel311.setLayout(new java.awt.GridBagLayout());

        imgPanel311.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel2311.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_tracks.gif")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        imgPanel311.add(jLabel2311, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel311.add(imgPanel311, gridBagConstraints);

        actionsPanel311.setLayout(new java.awt.GridBagLayout());

        actionsPanel311.setBorder(new javax.swing.border.TitledBorder("Actions"));
        newAction311.setMnemonic('w');
        newAction311.setText("New");
        newAction311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAction311ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel311.add(newAction311, gridBagConstraints);

        updateAction311.setMnemonic('U');
        updateAction311.setText("Update");
        updateAction311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAction311ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel311.add(updateAction311, gridBagConstraints);

        deleteAction311.setMnemonic('D');
        deleteAction311.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel311.add(deleteAction311, gridBagConstraints);

        clearAction311.setMnemonic('C');
        clearAction311.setText("Clear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel311.add(clearAction311, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        actionsPanel311.add(spacerPanel311, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        labelPanel311.add(actionsPanel311, gridBagConstraints);

        helpPanel311.setLayout(new java.awt.GridBagLayout());

        helpPanel311.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        helpAction311.setMnemonic('H');
        helpAction311.setText("Help");
        helpPanel311.add(helpAction311, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel311.add(helpPanel311, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel311.add(labelPanel311, gridBagConstraints);

        subMainPanel311.setLayout(new java.awt.GridBagLayout());

        subMainPanel311.setBorder(new javax.swing.border.TitledBorder(""));
        dataPanel311.setLayout(new java.awt.GridBagLayout());

        dataPanel311.setBorder(new javax.swing.border.TitledBorder("Data navagation actions"));
        firstAction311.setMnemonic('F');
        firstAction311.setText("First");
        dataPanel311.add(firstAction311, new java.awt.GridBagConstraints());

        previousAction311.setMnemonic('P');
        previousAction311.setText("Previous");
        dataPanel311.add(previousAction311, new java.awt.GridBagConstraints());

        nextAction211.setMnemonic('N');
        nextAction211.setText("Next");
        dataPanel311.add(nextAction211, new java.awt.GridBagConstraints());

        lastAction311.setMnemonic('L');
        lastAction311.setText("Last");
        dataPanel311.add(lastAction311, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel311.add(dataPanel311, gridBagConstraints);

        jPanel1211.setLayout(new java.awt.GridBagLayout());

        jPanel1211.setBorder(new javax.swing.border.TitledBorder("Enter the Required Info"));
        jLabel3111.setText("Date of Birth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jLabel3111, gridBagConstraints);

        jLabel4111.setText("Passport No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jLabel4111, gridBagConstraints);

        jLabel6111.setText("Home District");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jLabel6111, gridBagConstraints);

        jLabel7111.setText("Marital Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jLabel7111, gridBagConstraints);

        jComboBox11121.setEditable(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jComboBox11121, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jTextField41112, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jTextField61132, gridBagConstraints);

        jLabel311112.setText("National ID No.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jLabel311112, gridBagConstraints);

        facilitynameLbl11111.setText("Ethnicity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(facilitynameLbl11111, gridBagConstraints);

        facilityidLbl11111.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(facilityidLbl11111, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jTextField61131, gridBagConstraints);

        jComboBox111211.setFont(new java.awt.Font("Dialog", 0, 12));
        jComboBox111211.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jComboBox111211, gridBagConstraints);

        jComboBoxx1.setFont(new java.awt.Font("Dialog", 0, 12));
        jComboBoxx1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE", "MARRIED", "DIVORCED", "PRIEST", "NUN", "WIDOW", "WIDOWER" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jComboBoxx1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(datePicker1, gridBagConstraints);

        jLabel2.setText("Applicant Id");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1211.add(jLabel2, gridBagConstraints);

        jPanel61.setLayout(new java.awt.GridBagLayout());

        jPanel61.setBorder(new javax.swing.border.EtchedBorder());
        jPanel61.setMinimumSize(new java.awt.Dimension(82, 37));
        jTextField36.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel61.add(jTextField36, gridBagConstraints);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif")));
        searchButton.setToolTipText("Search");
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel61.add(searchButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1211.add(jPanel61, gridBagConstraints);

        jLabel6.setText("Nationality");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jLabel6, gridBagConstraints);

        jComboBox8.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (nBCachedRowSet9, "citizen", null, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1211.add(jComboBox8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel311.add(jPanel1211, gridBagConstraints);

        fieldsPanel3111.setLayout(new java.awt.GridBagLayout());

        fieldsPanel3111.setBorder(new javax.swing.border.TitledBorder("Other Details"));
        facilitynameLbl11112.setText("Tel No. 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilitynameLbl11112, gridBagConstraints);

        facilityidLbl11112.setText("Tel No. 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilityidLbl11112, gridBagConstraints);

        facilityidLbl11211.setText("Mobile phone 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilityidLbl11211, gridBagConstraints);

        facilityidLbl11311.setText("Mobile phone 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilityidLbl11311, gridBagConstraints);

        facilityidLbl1171.setText("Email Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilityidLbl1171, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField6111211, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField6111111, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField611211, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField6111612, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField611172, gridBagConstraints);

        facilityidLbl11611.setText("Postal Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilityidLbl11611, gridBagConstraints);

        facilityidLbl11411.setText("Postal Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilityidLbl11411, gridBagConstraints);

        facilityidLbl11511.setText("City");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilityidLbl11511, gridBagConstraints);

        jLabel122111.setText("Town");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jLabel122111, gridBagConstraints);

        facilitynameLbl1121.setText("Website");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(facilitynameLbl1121, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField6111531, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField61115111, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField61115211, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField6111411, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel3111.add(jTextField6111311, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 20.0;
        subMainPanel311.add(fieldsPanel3111, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel311.add(subMainPanel311, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(mainPanel311, gridBagConstraints);

        jTabbedPane1.addTab("Bio Data / Addresses", jPanel6);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        mainPanel1.setLayout(new java.awt.GridBagLayout());

        labelPanel1.setLayout(new java.awt.GridBagLayout());

        labelPanel1.setBorder(new javax.swing.border.TitledBorder(""));
        imgPanel1.setLayout(new java.awt.GridBagLayout());

        imgPanel1.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_tracks.gif")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        imgPanel1.add(jLabel21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel1.add(imgPanel1, gridBagConstraints);

        actionsPanel1.setLayout(new java.awt.GridBagLayout());

        actionsPanel1.setBorder(new javax.swing.border.TitledBorder("Actions"));
        newAction1.setMnemonic('w');
        newAction1.setText("New");
        newAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAction1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel1.add(newAction1, gridBagConstraints);

        updateAction1.setMnemonic('U');
        updateAction1.setText("Update");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel1.add(updateAction1, gridBagConstraints);

        deleteAction1.setMnemonic('D');
        deleteAction1.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel1.add(deleteAction1, gridBagConstraints);

        clearAction1.setMnemonic('C');
        clearAction1.setText("Clear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel1.add(clearAction1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        actionsPanel1.add(spacerPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        labelPanel1.add(actionsPanel1, gridBagConstraints);

        helpPanel1.setLayout(new java.awt.GridBagLayout());

        helpPanel1.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        helpAction1.setMnemonic('H');
        helpAction1.setText("Help");
        helpPanel1.add(helpAction1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel1.add(helpPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel1.add(labelPanel1, gridBagConstraints);

        subMainPanel.setLayout(new java.awt.GridBagLayout());

        subMainPanel.setBorder(new javax.swing.border.TitledBorder(""));
        fieldsPanel.setLayout(new java.awt.GridBagLayout());

        fieldsPanel.setBorder(new javax.swing.border.TitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11)));
        jScrollPane23.setBorder(new javax.swing.border.TitledBorder(null, "Enter details of the selected Level", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11)));
        jScrollPane23.setViewportBorder(new javax.swing.border.TitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12)));
        jTable13.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Education Level", "Qualification Attained", "Grade Obtained", "Institutiuon Attended", "Graduation Year", "Remarks"
            }
        ));
        jTable13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable13MouseClicked(evt);
            }
        });

        jScrollPane23.setViewportView(jTable13);

        jScrollPane1.setViewportView(jScrollPane23);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        fieldsPanel.add(jScrollPane1, gridBagConstraints);

        jScrollPane24.setBorder(new javax.swing.border.TitledBorder(null, "Enter Any Other Proffesional Course Done", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11)));
        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date Of Qualification", "Institution", "Title Course", "Grade", "Remarks"
            }
        ));
        javax.swing.table.TableColumn dateEditor6 = jTable14.getColumnModel().getColumn(0);
        com.afrisoftech.lib.DateCellEditor dateCellEditor6 = new com.afrisoftech.lib.DateCellEditor(new com.afrisoftech.lib.DatePicker(), jTable14);
        dateEditor6.setCellEditor(dateCellEditor6);
        //jTable1.setRowHeight(30);
        javax.swing.table.DefaultTableCellRenderer cellRenderer6 = new javax.swing.table.DefaultTableCellRenderer();
        cellRenderer6.setHorizontalAlignment(cellRenderer6.TRAILING);
        dateEditor6.setCellRenderer(cellRenderer6);
        jTable14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable14MouseClicked(evt);
            }
        });

        jScrollPane24.setViewportView(jTable14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        fieldsPanel.add(jScrollPane24, gridBagConstraints);

        jScrollPane3.setBorder(new javax.swing.border.TitledBorder("Notes on Major Field Of Specialization"));
        jScrollPane3.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        subMainPanel.add(fieldsPanel, gridBagConstraints);

        dataPanel.setLayout(new java.awt.GridBagLayout());

        dataPanel.setBorder(new javax.swing.border.TitledBorder("Data navagation actions"));
        firstAction.setMnemonic('F');
        firstAction.setText("First");
        dataPanel.add(firstAction, new java.awt.GridBagConstraints());

        previousAction.setMnemonic('P');
        previousAction.setText("Previous");
        dataPanel.add(previousAction, new java.awt.GridBagConstraints());

        nextAction.setMnemonic('N');
        nextAction.setText("Next");
        dataPanel.add(nextAction, new java.awt.GridBagConstraints());

        lastAction.setMnemonic('L');
        lastAction.setText("Last");
        dataPanel.add(lastAction, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel.add(dataPanel, gridBagConstraints);

        jLabel311.setText("Applicant Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel.add(jLabel311, gridBagConstraints);

        jPanel611.setLayout(new java.awt.GridBagLayout());

        jPanel611.setBorder(new javax.swing.border.EtchedBorder());
        jPanel611.setMinimumSize(new java.awt.Dimension(82, 37));
        jTextField361.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel611.add(jTextField361, gridBagConstraints);

        searchButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif")));
        searchButton1.setToolTipText("Search");
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
        jPanel611.add(searchButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        subMainPanel.add(jPanel611, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel1.add(subMainPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(mainPanel1, gridBagConstraints);

        jTabbedPane1.addTab(" Qualifications", jPanel3);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        mainPanel2.setLayout(new java.awt.GridBagLayout());

        labelPanel2.setLayout(new java.awt.GridBagLayout());

        labelPanel2.setBorder(new javax.swing.border.TitledBorder(""));
        imgPanel2.setLayout(new java.awt.GridBagLayout());

        imgPanel2.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_tracks.gif")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        imgPanel2.add(jLabel22, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel2.add(imgPanel2, gridBagConstraints);

        actionsPanel2.setLayout(new java.awt.GridBagLayout());

        actionsPanel2.setBorder(new javax.swing.border.TitledBorder("Actions"));
        newAction2.setMnemonic('w');
        newAction2.setText("New");
        newAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAction2ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel2.add(newAction2, gridBagConstraints);

        updateAction2.setMnemonic('U');
        updateAction2.setText("Update");
        updateAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAction2ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel2.add(updateAction2, gridBagConstraints);

        deleteAction2.setMnemonic('D');
        deleteAction2.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel2.add(deleteAction2, gridBagConstraints);

        clearAction2.setMnemonic('C');
        clearAction2.setText("Clear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel2.add(clearAction2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        actionsPanel2.add(spacerPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        labelPanel2.add(actionsPanel2, gridBagConstraints);

        helpPanel2.setLayout(new java.awt.GridBagLayout());

        helpPanel2.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        helpAction2.setMnemonic('H');
        helpAction2.setText("Help");
        helpPanel2.add(helpAction2, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel2.add(helpPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel2.add(labelPanel2, gridBagConstraints);

        subMainPanel21.setLayout(new java.awt.GridBagLayout());

        subMainPanel21.setBorder(new javax.swing.border.TitledBorder(""));
        subMainPanel21.setAlignmentX(10.0F);
        fieldsPanel21.setLayout(new java.awt.GridBagLayout());

        fieldsPanel21.setBorder(new javax.swing.border.TitledBorder("Previous Employments"));
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Begin date", "End date", "Employer", "Position", "Salary", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        javax.swing.table.TableColumn dateEditor2 = jTable11.getColumnModel().getColumn(0);
        com.afrisoftech.lib.DateCellEditor dateCellEditor2 = new com.afrisoftech.lib.DateCellEditor(new com.afrisoftech.lib.DatePicker(), jTable11);
        dateEditor2.setCellEditor(dateCellEditor2);
        //jTable1.setRowHeight(30);
        javax.swing.table.DefaultTableCellRenderer cellRenderer2 = new javax.swing.table.DefaultTableCellRenderer();
        cellRenderer2.setHorizontalAlignment(cellRenderer2.TRAILING);
        dateEditor2.setCellRenderer(cellRenderer2);

        //mbox1 = new javax.swing.JComboBox();
        javax.swing.table.TableColumn dateEditor3 = jTable11.getColumnModel().getColumn(1);
        com.afrisoftech.lib.DateCellEditor dateCellEditor3 = new com.afrisoftech.lib.DateCellEditor(new com.afrisoftech.lib.DatePicker(), jTable11);
        dateEditor3.setCellEditor(dateCellEditor3);
        //jTable1.setRowHeight(30);
        javax.swing.table.DefaultTableCellRenderer cellRenderer3 = new javax.swing.table.DefaultTableCellRenderer();
        cellRenderer3.setHorizontalAlignment(cellRenderer3.TRAILING);
        dateEditor3.setCellRenderer(cellRenderer3);
        jScrollPane21.setViewportView(jTable11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel21.add(jScrollPane21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 20.0;
        subMainPanel21.add(fieldsPanel21, gridBagConstraints);

        dataPanel21.setLayout(new java.awt.GridBagLayout());

        dataPanel21.setBorder(new javax.swing.border.TitledBorder("Data navagation actions"));
        firstAction21.setMnemonic('F');
        firstAction21.setText("First");
        dataPanel21.add(firstAction21, new java.awt.GridBagConstraints());

        previousAction21.setMnemonic('P');
        previousAction21.setText("Previous");
        dataPanel21.add(previousAction21, new java.awt.GridBagConstraints());

        nextAction31.setMnemonic('N');
        nextAction31.setText("Next");
        dataPanel21.add(nextAction31, new java.awt.GridBagConstraints());

        lastAction21.setMnemonic('L');
        lastAction21.setText("Last");
        dataPanel21.add(lastAction21, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel21.add(dataPanel21, gridBagConstraints);

        jLabel3112.setText("Applicant Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel21.add(jLabel3112, gridBagConstraints);

        jPanel6111.setLayout(new java.awt.GridBagLayout());

        jPanel6111.setBorder(new javax.swing.border.EtchedBorder());
        jPanel6111.setMinimumSize(new java.awt.Dimension(82, 37));
        jTextField362.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel6111.add(jTextField362, gridBagConstraints);

        searchButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif")));
        searchButton11.setToolTipText("Search");
        searchButton11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton11.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton11.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton11ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel6111.add(searchButton11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel21.add(jPanel6111, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel2.add(subMainPanel21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(mainPanel2, gridBagConstraints);

        jTabbedPane1.addTab("Work Experience", jPanel5);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        mainPanel4.setLayout(new java.awt.GridBagLayout());

        labelPanel4.setLayout(new java.awt.GridBagLayout());

        labelPanel4.setBorder(new javax.swing.border.TitledBorder(""));
        imgPanel4.setLayout(new java.awt.GridBagLayout());

        imgPanel4.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_tracks.gif")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        imgPanel4.add(jLabel24, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel4.add(imgPanel4, gridBagConstraints);

        actionsPanel4.setLayout(new java.awt.GridBagLayout());

        actionsPanel4.setBorder(new javax.swing.border.TitledBorder("Actions"));
        newAction4.setMnemonic('w');
        newAction4.setText("Insert");
        newAction4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAction4ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel4.add(newAction4, gridBagConstraints);

        deleteAction4.setMnemonic('D');
        deleteAction4.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel4.add(deleteAction4, gridBagConstraints);

        clearAction4.setMnemonic('C');
        clearAction4.setText("Clear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel4.add(clearAction4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        actionsPanel4.add(spacerPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        labelPanel4.add(actionsPanel4, gridBagConstraints);

        helpPanel4.setLayout(new java.awt.GridBagLayout());

        helpPanel4.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        helpAction4.setMnemonic('H');
        helpAction4.setText("Help");
        helpPanel4.add(helpAction4, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel4.add(helpPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel4.add(labelPanel4, gridBagConstraints);

        subMainPanel1.setLayout(new java.awt.GridBagLayout());

        subMainPanel1.setBorder(new javax.swing.border.TitledBorder(""));
        fieldsPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel11.setBorder(new javax.swing.border.TitledBorder("Enter Applicants' Languages"));
        jLabel3.setFont(new java.awt.Font("Dialog", 3, 10));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Available Languages");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel11.add(jLabel3, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton1.setMnemonic('e');
        jButton1.setText("Assign Language");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel11.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel11.add(jSeparator1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel11.add(jLabel4, gridBagConstraints);

        jList1.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setModel(new org.netbeans.lib.sql.models.ListModel (nBCachedRowSet3, "language_name", null, null, null));
        jList1.setDragEnabled(true);
        jList1.setValueIsAdjusting(true);
        jList1.setVisibleRowCount(20);
        jScrollPane11.setViewportView(jList1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel11.add(jScrollPane11, gridBagConstraints);

        jList11.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList11.setDragEnabled(true);
        jList11.setValueIsAdjusting(true);
        jList11.setVisibleRowCount(20);
        jScrollPane2.setViewportView(jList11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel11.add(jScrollPane2, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel11.add(jButton2, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel11.add(jButton3, gridBagConstraints);

        jLabel312.setFont(new java.awt.Font("Dialog", 3, 10));
        jLabel312.setForeground(new java.awt.Color(0, 0, 204));
        jLabel312.setText("Applicant Choosen Languages");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel11.add(jLabel312, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(14, 0, 0, 20);
        fieldsPanel1.add(jPanel11, gridBagConstraints);

        jPanel13.setLayout(new java.awt.GridBagLayout());

        jPanel13.setBorder(new javax.swing.border.TitledBorder("Enter Clubs Here"));
        jLabel32.setFont(new java.awt.Font("Dialog", 3, 10));
        jLabel32.setForeground(new java.awt.Color(0, 0, 204));
        jLabel32.setText("Available Clubs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel13.add(jLabel32, gridBagConstraints);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton11.setMnemonic('e');
        jButton11.setText("Assign Club");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jButton11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel13.add(jSeparator11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jLabel42, gridBagConstraints);

        jList12.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList12.setModel(new org.netbeans.lib.sql.models.ListModel (nBCachedRowSet5, "club_name", null, null, null));
        jList12.setDragEnabled(true);
        jList12.setValueIsAdjusting(true);
        jList12.setVisibleRowCount(20);
        jScrollPane12.setViewportView(jList12);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel13.add(jScrollPane12, gridBagConstraints);

        jList111.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList111.setDragEnabled(true);
        jList111.setValueIsAdjusting(true);
        jList111.setVisibleRowCount(20);
        jScrollPane22.setViewportView(jList111);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel13.add(jScrollPane22, gridBagConstraints);

        jButton21.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton21.setText("Remove");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jButton21, gridBagConstraints);

        jButton31.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton31.setText("Add");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jButton31, gridBagConstraints);

        jLabel313.setFont(new java.awt.Font("Dialog", 3, 10));
        jLabel313.setForeground(new java.awt.Color(0, 0, 204));
        jLabel313.setText("Applicant Choosen Club(s)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel13.add(jLabel313, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(14, 20, 0, 0);
        fieldsPanel1.add(jPanel13, gridBagConstraints);

        jPanel14.setLayout(new java.awt.GridBagLayout());

        jPanel14.setBorder(new javax.swing.border.TitledBorder("Enter Applicants' favourite Sports"));
        jLabel33.setFont(new java.awt.Font("Dialog", 3, 10));
        jLabel33.setForeground(new java.awt.Color(0, 0, 204));
        jLabel33.setText("Available Sports");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel14.add(jLabel33, gridBagConstraints);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton12.setMnemonic('e');
        jButton12.setText("Assign Sports");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel14.add(jButton12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel14.add(jSeparator12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel14.add(jLabel43, gridBagConstraints);

        jList13.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList13.setModel(new org.netbeans.lib.sql.models.ListModel (nBCachedRowSet1, "type_desc", null, null, null));
        jList13.setDragEnabled(true);
        jList13.setValueIsAdjusting(true);
        jList13.setVisibleRowCount(20);
        jScrollPane13.setViewportView(jList13);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 10.0;
        jPanel14.add(jScrollPane13, gridBagConstraints);

        jList112.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList112.setDragEnabled(true);
        jList112.setValueIsAdjusting(true);
        jList112.setVisibleRowCount(20);
        jScrollPane25.setViewportView(jList112);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 10.0;
        jPanel14.add(jScrollPane25, gridBagConstraints);

        jButton22.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton22.setText("Remove");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel14.add(jButton22, gridBagConstraints);

        jButton32.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton32.setText("Add");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel14.add(jButton32, gridBagConstraints);

        jLabel314.setFont(new java.awt.Font("Dialog", 3, 10));
        jLabel314.setForeground(new java.awt.Color(0, 0, 204));
        jLabel314.setText("Applicant Choosen Sports");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel14.add(jLabel314, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 19);
        fieldsPanel1.add(jPanel14, gridBagConstraints);

        jPanel15.setLayout(new java.awt.GridBagLayout());

        jPanel15.setBorder(new javax.swing.border.TitledBorder("Enter Applicants' Hobbies"));
        jLabel34.setFont(new java.awt.Font("Dialog", 3, 10));
        jLabel34.setForeground(new java.awt.Color(0, 0, 204));
        jLabel34.setText("Available Hobbies");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel15.add(jLabel34, gridBagConstraints);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/note[1].gif")));
        jButton13.setMnemonic('e');
        jButton13.setText("Assign Hobby");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel15.add(jButton13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel15.add(jSeparator13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel15.add(jLabel44, gridBagConstraints);

        jList14.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList14.setModel(new org.netbeans.lib.sql.models.ListModel (nBCachedRowSet2, "type_desc", null, null, null));
        jList14.setDragEnabled(true);
        jList14.setValueIsAdjusting(true);
        jList14.setVisibleRowCount(20);
        jScrollPane14.setViewportView(jList14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel15.add(jScrollPane14, gridBagConstraints);

        jList113.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList113.setDragEnabled(true);
        jList113.setValueIsAdjusting(true);
        jList113.setVisibleRowCount(20);
        jScrollPane26.setViewportView(jList113);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel15.add(jScrollPane26, gridBagConstraints);

        jButton23.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton23.setText("Remove");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel15.add(jButton23, gridBagConstraints);

        jButton33.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton33.setText("Add");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel15.add(jButton33, gridBagConstraints);

        jLabel315.setFont(new java.awt.Font("Dialog", 3, 10));
        jLabel315.setForeground(new java.awt.Color(0, 0, 204));
        jLabel315.setText("Applicant Choosen Hobbies");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel15.add(jLabel315, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 20, 0, 0);
        fieldsPanel1.add(jPanel15, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 15.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        subMainPanel1.add(fieldsPanel1, gridBagConstraints);

        jLabel3113.setText("Applicant Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel1.add(jLabel3113, gridBagConstraints);

        jPanel6112.setLayout(new java.awt.GridBagLayout());

        jPanel6112.setBorder(new javax.swing.border.EtchedBorder());
        jPanel6112.setMinimumSize(new java.awt.Dimension(82, 37));
        jTextField363.setEditable(false);
        jTextField363.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField363ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel6112.add(jTextField363, gridBagConstraints);

        searchButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif")));
        searchButton12.setToolTipText("Search");
        searchButton12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton12.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton12.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton12ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel6112.add(searchButton12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        subMainPanel1.add(jPanel6112, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel4.add(subMainPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(mainPanel4, gridBagConstraints);

        jTabbedPane1.addTab("Extra Curricular", jPanel7);

        jPanel51.setLayout(new java.awt.GridBagLayout());

        mainPanel21.setLayout(new java.awt.GridBagLayout());

        labelPanel21.setLayout(new java.awt.GridBagLayout());

        labelPanel21.setBorder(new javax.swing.border.TitledBorder(""));
        imgPanel21.setLayout(new java.awt.GridBagLayout());

        imgPanel21.setBorder(new javax.swing.border.TitledBorder(""));
        jLabel221.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_tracks.gif")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        imgPanel21.add(jLabel221, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel21.add(imgPanel21, gridBagConstraints);

        actionsPanel21.setLayout(new java.awt.GridBagLayout());

        actionsPanel21.setBorder(new javax.swing.border.TitledBorder("Actions"));
        newAction21.setMnemonic('w');
        newAction21.setText("New");
        newAction21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAction21ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel21.add(newAction21, gridBagConstraints);

        updateAction21.setMnemonic('U');
        updateAction21.setText("Update");
        updateAction21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAction21ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel21.add(updateAction21, gridBagConstraints);

        deleteAction21.setMnemonic('D');
        deleteAction21.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel21.add(deleteAction21, gridBagConstraints);

        clearAction21.setMnemonic('C');
        clearAction21.setText("Clear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel21.add(clearAction21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        actionsPanel21.add(spacerPanel21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        labelPanel21.add(actionsPanel21, gridBagConstraints);

        helpPanel21.setLayout(new java.awt.GridBagLayout());

        helpPanel21.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        helpAction21.setMnemonic('H');
        helpAction21.setText("Help");
        helpPanel21.add(helpAction21, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        labelPanel21.add(helpPanel21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel21.add(labelPanel21, gridBagConstraints);

        subMainPanel211.setLayout(new java.awt.GridBagLayout());

        subMainPanel211.setBorder(new javax.swing.border.TitledBorder(""));
        subMainPanel211.setAlignmentX(10.0F);
        fieldsPanel211.setLayout(new java.awt.GridBagLayout());

        fieldsPanel211.setBorder(new javax.swing.border.TitledBorder("Refferees' Details"));
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Organisation", "Title", "Postal Address", "Telephone", "Remarks"
            }
        ));
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });

        jScrollPane211.setViewportView(jTable10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        fieldsPanel211.add(jScrollPane211, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 20.0;
        subMainPanel211.add(fieldsPanel211, gridBagConstraints);

        dataPanel211.setLayout(new java.awt.GridBagLayout());

        dataPanel211.setBorder(new javax.swing.border.TitledBorder("Data navagation actions"));
        firstAction211.setMnemonic('F');
        firstAction211.setText("First");
        dataPanel211.add(firstAction211, new java.awt.GridBagConstraints());

        previousAction211.setMnemonic('P');
        previousAction211.setText("Previous");
        dataPanel211.add(previousAction211, new java.awt.GridBagConstraints());

        nextAction311.setMnemonic('N');
        nextAction311.setText("Next");
        dataPanel211.add(nextAction311, new java.awt.GridBagConstraints());

        lastAction211.setMnemonic('L');
        lastAction211.setText("Last");
        dataPanel211.add(lastAction211, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel211.add(dataPanel211, gridBagConstraints);

        jLabel3114.setText("Applicant Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel211.add(jLabel3114, gridBagConstraints);

        jPanel6113.setLayout(new java.awt.GridBagLayout());

        jPanel6113.setBorder(new javax.swing.border.EtchedBorder());
        jPanel6113.setMinimumSize(new java.awt.Dimension(82, 37));
        jTextField364.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel6113.add(jTextField364, gridBagConstraints);

        searchButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif")));
        searchButton13.setToolTipText("Search");
        searchButton13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton13.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton13.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton13ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel6113.add(searchButton13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        subMainPanel211.add(jPanel6113, gridBagConstraints);

        qualifiableamountLbl.setText("Leadership");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        subMainPanel211.add(qualifiableamountLbl, gridBagConstraints);

        jScrollPane7.setViewportBorder(new javax.swing.border.TitledBorder(""));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Club/Office", "Position", "Begin Date", "End Date", "Remarks"
            }
        ));
        javax.swing.table.TableColumn dateEditor5 = jTable2.getColumnModel().getColumn(2);
        com.afrisoftech.lib.DateCellEditor dateCellEditor5 = new com.afrisoftech.lib.DateCellEditor(new com.afrisoftech.lib.DatePicker(), jTable2);
        dateEditor5.setCellEditor(dateCellEditor5);
        //jTable1.setRowHeight(30);
        javax.swing.table.DefaultTableCellRenderer cellRenderer5 = new javax.swing.table.DefaultTableCellRenderer();
        cellRenderer5.setHorizontalAlignment(cellRenderer5.TRAILING);
        dateEditor5.setCellRenderer(cellRenderer5);

        //mbox1 = new javax.swing.JComboBox();
        javax.swing.table.TableColumn dateEditor8 = jTable2.getColumnModel().getColumn(3);
        com.afrisoftech.lib.DateCellEditor dateCellEditor8 = new com.afrisoftech.lib.DateCellEditor(new com.afrisoftech.lib.DatePicker(), jTable2);
        dateEditor8.setCellEditor(dateCellEditor8);
        //jTable1.setRowHeight(30);
        javax.swing.table.DefaultTableCellRenderer cellRenderer8 = new javax.swing.table.DefaultTableCellRenderer();
        cellRenderer8.setHorizontalAlignment(cellRenderer8.TRAILING);
        dateEditor8.setCellRenderer(cellRenderer3);
        jScrollPane7.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        subMainPanel211.add(jScrollPane7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel21.add(subMainPanel211, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel51.add(mainPanel21, gridBagConstraints);

        jTabbedPane1.addTab("Referees", jPanel51);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        setBounds(0, 0, 703, 451);
    }//GEN-END:initComponents

    private void jButton512ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton512ActionPerformed
jSearchDialog11.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jButton512ActionPerformed

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        // Add your handling code here:
    }//GEN-LAST:event_jTable10MouseClicked

    private void searchButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton13ActionPerformed
searchButton13Clicked();          // Add your handling code here:
    }//GEN-LAST:event_searchButton13ActionPerformed

    private void searchButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton12ActionPerformed
searchButton12Clicked();          // Add your handling code here:
    }//GEN-LAST:event_searchButton12ActionPerformed

    private void searchButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton11ActionPerformed
searchButton11Clicked();        // Add your handling code here:
    }//GEN-LAST:event_searchButton11ActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
searchButton1Clicked();        // Add your handling code here:
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void jSearchTable12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable12MouseClicked
jTextField36.setText(jSearchTable12.getValueAt(jSearchTable12.getSelectedRow(), 0).toString());
 jTextField361.setText(jSearchTable12.getValueAt(jSearchTable12.getSelectedRow(), 0).toString());      
 jTextField362.setText(jSearchTable12.getValueAt(jSearchTable12.getSelectedRow(), 0).toString());
 jTextField363.setText(jSearchTable12.getValueAt(jSearchTable12.getSelectedRow(), 0).toString());
 jTextField364.setText(jSearchTable12.getValueAt(jSearchTable12.getSelectedRow(), 0).toString());
 
 
 
        jSearchDialog11.dispose();              // Add your ha        // Add your handling code here:
    }//GEN-LAST:event_jSearchTable12MouseClicked

    private void jTextField11112CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11112CaretUpdate
try {
           crset1.execute("select app_id,initcap(first_name||' '||second_name||' '||others) AS app_names from hr.hr_appresume_basic where first_name||' '||second_name||' '||others ILIKE '"+jTextField11112.getText().toString()+"%' ORDER BY app_names");
            
            jSearchTable12.setModel(new org.netbeans.lib.sql.models.TableModel(crset1, new org.netbeans.lib.sql.models.TableModel.Column[] {
                new org.netbeans.lib.sql.models.TableModel.Column("app_id", "App no", false),
                new org.netbeans.lib.sql.models.TableModel.Column("app_names", "Name", false)
                
            }));
            jSearchTable12.setShowHorizontalLines(false);
            jSearchScrollPane12.setViewportView(jSearchTable12);
            
          System.out.println("Cannot sort out");  
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
        // Add your handling code he        // Add your handling code here:

/*
try {
           crset1.execute("select staff_id,initcap(first_name||' '||second_name||' '||others) AS staff_names from hr.hr_staffresume_fileinfo where first_name||' '||second_name||' '||others ILIKE '"+jTextField1111.getText().toString()+"%' ORDER BY staff_names");
            
            jSearchTable1.setModel(new org.netbeans.lib.sql.models.TableModel(crset1, new org.netbeans.lib.sql.models.TableModel.Column[] {
                new org.netbeans.lib.sql.models.TableModel.Column("staff_id", "Staff no", false),
                new org.netbeans.lib.sql.models.TableModel.Column("staff_names", "Name", false)
                
            }));
            jSearchTable1.setShowHorizontalLines(false);
            jSearchScrollPane1.setViewportView(jSearchTable1);
            
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
*/

    }//GEN-LAST:event_jTextField11112CaretUpdate

    private void jTextField1111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1111ActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_jTextField1111ActionPerformed

    private void jButton511ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton511ActionPerformed
jSearchDialog2.dispose();          // Add your handling code here:
    }//GEN-LAST:event_jButton511ActionPerformed

    private void jSearchTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable11MouseClicked
jTable13.setValueAt(jSearchTable11.getValueAt(jSearchTable11.getSelectedRow(),0),jTable13.getSelectedRow(), 0);
      //  jTable1.setValueAt(jSearchTable11.getValueAt(jSearchTable11.getSelectedRow(),1),jTable1.getSelectedRow(), 2);
       // jTable1.setValueAt(jSearchTable.getValueAt(jSearchTable.getSelectedRow(),2),jTable1.getSelectedRow(), 4);
        
        jSearchDialog2.dispose();          // Add your handling code here:
    }//GEN-LAST:event_jSearchTable11MouseClicked
private void cmboxMouseClicked() {
        
        System.out.println("Showing dialog");
        java.awt.Point point = jTable13.getLocationOnScreen();
        jSearchDialog2.setSize(400,200);
        jSearchDialog2.setLocation(point);
        jSearchDialog2.show();
    }
    private void jTextField11111CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11111CaretUpdate

        //select distinct upper(qualification_desc) as qualif from hr.hr_education_qlf order by qualif        // Add your handling code here:
        try {
            searchRowSet1.execute("SELECT qualification_desc from hr.hr_education-qlf where qualification_desc ILIKE '"+jTextField1111.getText()+"%' order by qualification_desc");
            
            jSearchTable11.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet1, new org.netbeans.lib.sql.models.TableModel.Column[] {
                new org.netbeans.lib.sql.models.TableModel.Column("qualification_desc", "Description", false)
                //  new org.netbeans.lib.sql.models.TableModel.Column("price", "Price", false),
              //  new org.netbeans.lib.sql.models.TableModel.Column("training_type", "Type", false)
            }));
            jSearchScrollPane11.setViewportView(jSearchTable11);
            System.out.println("Cannot sort out");
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }          // Add your handling code he 
    }//GEN-LAST:event_jTextField11111CaretUpdate

    private void jTable14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable14MouseClicked
jTable14.getSelectedColumn();
            
            kiwi.ui.DateChooser dateChooser = new kiwi.ui.DateChooser();
            
            dateChooser.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_jTable14MouseClicked
/*private void cmboxMouseClicked() {
        
        System.out.println("Showing dialog");
        java.awt.Point point = jTable11.getLocationOnScreen();
        jSearchDialog2.setSize(400,200);
        jSearchDialog2.setLocation(point);
        jSearchDialog2.show();
    }*/
    private void jTable13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable13MouseClicked
if(jTable13.getSelectedColumn() == 0 ){     
           this.cmboxMouseClicked();
         
            
}else if((jTable13.getSelectedColumn() != 0)) {
// Add your handling code her
            
        
}       
        // Add your handling code heyour handling code here:
    }//GEN-LAST:event_jTable13MouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
searchButtonClicked();        // Add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed
      public void searchButtonClicked() {
        
        System.out.println("Showing dialog");
        
        jSearchDialog11.dispose();
        java.awt.Point point = this.jTextField36.getLocationOnScreen();
        
        jSearchDialog11.setSize(400,200);
        
        jSearchDialog11.setLocation(point);
        jSearchDialog11.show();
              
        
      }
          public void searchButton1Clicked() {
        
        System.out.println("Showing dialog");
        
        jSearchDialog11.dispose();
        java.awt.Point point = this.jTextField361.getLocationOnScreen();
        
        jSearchDialog11.setSize(400,200);
        
        jSearchDialog11.setLocation(point);
        jSearchDialog11.show();
              
    }     
         
          
          public void searchButton11Clicked() {
        
        System.out.println("Showing dialog");
        
        jSearchDialog11.dispose();
        java.awt.Point point = this.jTextField362.getLocationOnScreen();
        
        jSearchDialog11.setSize(400,200);
        
        jSearchDialog11.setLocation(point);
        jSearchDialog11.show();
              
          }
          
        public void searchButton12Clicked() {
        
        System.out.println("Showing dialog");
        
        jSearchDialog11.dispose();
        java.awt.Point point = this.jTextField363.getLocationOnScreen();
        
        jSearchDialog11.setSize(400,200);
        
        jSearchDialog11.setLocation(point);
        jSearchDialog11.show();
              
    }     
    
        
        public void searchButton13Clicked() {
        
        System.out.println("Showing dialog");
        
        jSearchDialog11.dispose();
        java.awt.Point point = this.jTextField364.getLocationOnScreen();
        
        jSearchDialog11.setSize(400,200);
        
        jSearchDialog11.setLocation(point);
        jSearchDialog11.show();
              
    }     
    private void newAction21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAction21ActionPerformed
try {
            
            connectDB.setAutoCommit(false);
            
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into hr.hr_referees_xtras (name,org,title,postal,telephone,remarks,staff_id) values(?,?,?,?,?,?,?)");
            for (int i = 0; i < jTable10.getRowCount(); i++){
                if (jTable10.getModel().getValueAt(i,0) != null){
                    
                    pstmt.setObject(1,jTable10.getModel().getValueAt(i,0).toString());
                    pstmt.setObject(2,jTable10.getModel().getValueAt(i,1).toString());
                    pstmt.setObject(3,jTable10.getModel().getValueAt(i,2).toString());
                    pstmt.setObject(4,jTable10.getModel().getValueAt(i,3).toString());
                    pstmt.setObject(5,jTable10.getModel().getValueAt(i,4).toString());
                    pstmt.setObject(6,jTable10.getModel().getValueAt(i,5).toString());
                    pstmt.setString(7,jTextField364.getText());  
                    
                    pstmt.executeUpdate();
                    
                }
            }
            java.sql.PreparedStatement ppstmt = connectDB.prepareStatement("UPDATE hr.hr_referees_xtras set club_office = ?, post = ?, begindate = ?,enddate = ?, remarks = ? WHERE staff_id = '"+jTextField364.getText()+"'");
            for (int k = 0; k < jTable2.getRowCount(); k++){
                if (jTable2.getModel().getValueAt(k,0) != null){
                    
                    ppstmt.setObject(1,jTable2.getModel().getValueAt(k,0).toString());
                    ppstmt.setObject(2,jTable2.getModel().getValueAt(k,1).toString());
                    ppstmt.setObject(3,jTable2.getModel().getValueAt(k,2).toString());
                    ppstmt.setObject(4,jTable2.getModel().getValueAt(k,3).toString());
                    ppstmt.setObject(5,jTable2.getModel().getValueAt(k,4).toString());
                    
                    
                    
                    ppstmt.executeUpdate();
                    connectDB.commit();
                    connectDB.setAutoCommit(true);
                }
            }
            
            javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }        // Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_newAction21ActionPerformed
    
    private void newAction4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAction4ActionPerformed
        
        
        
        java.util.Vector item2add = new java.util.Vector(5, 5);
        
        javax.swing.DefaultListModel listModel = new javax.swing.DefaultListModel();
        
        listModel = (javax.swing.DefaultListModel)jList112.getModel();
        
        java.lang.Object[] selectedValues = null;
        
        java.util.Enumeration listEnum =  listModel.elements();
        
        while(listEnum.hasMoreElements()) {
            
            item2add.addElement(listEnum.nextElement());
            
        }
        
        selectedValues = item2add.toArray();
        
        System.out.println("The values selected are : ["+selectedValues.length+"]");
        
        try {
            //java.sql.Statement pstmt = connectDB.createStatement();
            java.sql.PreparedStatement ppstmt = connectDB.prepareStatement("INSERT INTO hr.hr_appresume_xtra (app_id) VALUES(?)");
            // ppstmt.setString(1,"app_id");
            ppstmt.setString(1,jTextField363.getText());
            ppstmt.executeUpdate();
            
        } catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!!",javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(sq.getMessage());
        }
        //this is for sports
        
        
        try {
            
            listModel = (javax.swing.DefaultListModel)jList112.getModel();
            
            
            
            for (int k = 0; k < selectedValues.length; k++) {
                
                System.out.print("Values : "+"\t"+selectedValues[k]+"\t");
                
            }
            
            java.sql.Array menuSqlArray;
            
            java.lang.String str = this.getSqlString(selectedValues);
            
            
            
            
            //  java.sql.Statement prstmt = connectDB.createStatement();
            java.sql.PreparedStatement pmstmt = connectDB.prepareStatement("UPDATE hr.hr_appresume_xtra SET sports = '{"+str+"}' WHERE app_id = '"+jTextField363.getText()+"'");
            
            
            pmstmt.executeUpdate();
            
            
            
            // this is for hobbies
            
            
            item2add = new java.util.Vector(5, 5);
            
            listModel = new javax.swing.DefaultListModel();
            
            listModel = (javax.swing.DefaultListModel)jList113.getModel();
            
            selectedValues = null;
            
            listEnum =  listModel.elements();
            
            while(listEnum.hasMoreElements()) {
                
                item2add.addElement(listEnum.nextElement());
                
            }
            
            selectedValues = item2add.toArray();
            
            
            
            
            
            
            
            
            for (int j = 0; j < selectedValues.length; j++) {
                
                System.out.print("Values : "+"\t"+selectedValues[j]+"\t");
                
            }
            
            
            java.lang.String str1 = this.getSqlString(selectedValues);
            
            
            
            // java.sql.Statement prpstmt = connectDB.createStatement();
            java.sql.PreparedStatement prpdstmt = connectDB.prepareStatement("UPDATE hr.hr_appresume_xtra SET hobbies = '{"+str1+"}' WHERE app_id = '"+jTextField363.getText()+"'");
            
            
            
            prpdstmt.executeUpdate();
            
            
            
            
            
            
            
            // this is for languages
            
            
            item2add = new java.util.Vector(5, 5);
            
            listModel = new javax.swing.DefaultListModel();
            
            if (jList11.getModel().getSize() > 0) {
                
                listModel = (javax.swing.DefaultListModel)jList11.getModel();
                
                selectedValues = null;
                
                listEnum =  listModel.elements();
                
                while(listEnum.hasMoreElements()) {
                    
                    item2add.addElement(listEnum.nextElement());
                    
                }
                
                selectedValues = item2add.toArray();
            } else {
                
                selectedValues = new Object[0];
                
            }
            
            
            
            for (int n = 0; n < selectedValues.length; n++) {
                
                System.out.print("Values : "+"\t"+selectedValues[n]+"\t");
                
            }
            
            
            
            java.lang.String str2 = this.getSqlString(selectedValues);
            
            
            
            
            
            // java.sql.Statement pstm = connectDB.createStatement();
            java.sql.PreparedStatement pstmnt = connectDB.prepareStatement("UPDATE hr.hr_appresume_xtra SET languages = '{"+str2+"}' WHERE app_id = '"+jTextField363.getText()+"'");
            
            
            
            pstmnt.executeUpdate();
            
            
            
            
            
            
            // And finally this is for clubs
            
            
            item2add = new java.util.Vector(5, 5);
            
            listModel = new javax.swing.DefaultListModel();
            
            listModel = (javax.swing.DefaultListModel)jList111.getModel();
            
            selectedValues = null;
            
            listEnum =  listModel.elements();
            
            while(listEnum.hasMoreElements()) {
                
                item2add.addElement(listEnum.nextElement());
                
            }
            
            selectedValues = item2add.toArray();
            
            
            
            
            for (int m = 0; m < selectedValues.length; m++) {
                
                System.out.print("Values : "+"\t"+selectedValues[m]+"\t");
                
            }
            
            
            
            java.lang.String str3 = this.getSqlString(selectedValues);
            
            
            
            
            
            
            // java.sql.Statement prestmt = connectDB.createStatement();
            java.sql.PreparedStatement pmstamt = connectDB.prepareStatement("UPDATE hr.hr_appresume_xtra SET clubs = '{"+str3+"}' WHERE app_id = '"+jTextField363.getText()+"'");
            
            
            
            
            pmstamt.executeUpdate();
            
            
            System.out.println("----------------------------------------------------------------");
            
            
            
            javax.swing.JOptionPane.showMessageDialog(this, "Successfuly updated the selected items ");
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(sq.getMessage());
        }
        
        
        javax.swing.JOptionPane.showMessageDialog(this, "All the assigned items have been inserted successfully");        // Add your handling code here:
        
        
        
        
        
        
        
        
        // Add your handling code here:
    }//GEN-LAST:event_newAction4ActionPerformed
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        
        // Add your hand        // Add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        // Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        // Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        
        // Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed
    
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        
        java.lang.Object[] listSel = null;
        
        listSel = jList12.getSelectedValues();
        
        javax.swing.ListModel list111Model = jList111.getModel();
        
        int nofItemsList111 = list111Model.getSize();
        
        javax.swing.DefaultListModel newdfListModel = new javax.swing.DefaultListModel();
        
        for (int j = 0; j < list111Model.getSize(); j++) {
            
            newdfListModel.addElement(list111Model.getElementAt(j));
            
        }
        //        javax.swing.DefaultListModel newdfListModel = (javax.swing.DefaultListModel)jList11.getModel();
        
        for (int i = 0; i < listSel.length; i++) {
            
            if (!newdfListModel.contains(listSel[i])) {
                
                newdfListModel.addElement(listSel[i].toString());
                
            }
        }
        
        this.jList111.setModel(newdfListModel);
        
        
        // Add your handling c        // Add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        java.lang.Object[] listSel = null;
        
        listSel = jList1.getSelectedValues();
        
        javax.swing.ListModel list11Model = jList11.getModel();
        
        int nofItemsList11 = list11Model.getSize();
        
        javax.swing.DefaultListModel newdfListModel = new javax.swing.DefaultListModel();
        
        for (int j = 0; j < list11Model.getSize(); j++) {
            
            newdfListModel.addElement(list11Model.getElementAt(j));
            
        }
        //        javax.swing.DefaultListModel newdfListModel = (javax.swing.DefaultListModel)jList11.getModel();
        
        for (int i = 0; i < listSel.length; i++) {
            
            if (!newdfListModel.contains(listSel[i])) {
                
                newdfListModel.addElement(listSel[i].toString());
                
            }
        }
        
        this.jList11.setModel(newdfListModel);
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        
        java.lang.Object[] listSel = null;
        
        listSel = jList14.getSelectedValues();
        
        javax.swing.ListModel list113Model = jList113.getModel();
        
        int nofItemsList113 = list113Model.getSize();
        
        javax.swing.DefaultListModel newdfListModel = new javax.swing.DefaultListModel();
        
        for (int j = 0; j < list113Model.getSize(); j++) {
            
            newdfListModel.addElement(list113Model.getElementAt(j));
            
        }
        //        javax.swing.DefaultListModel newdfListModel = (javax.swing.DefaultListModel)jList11.getModel();
        
        for (int i = 0; i < listSel.length; i++) {
            
            if (!newdfListModel.contains(listSel[i])) {
                
                newdfListModel.addElement(listSel[i].toString());
                
            }
        }
        
        this.jList113.setModel(newdfListModel);
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed
    
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        java.lang.Object[] listSel = null;
        
        listSel = jList111.getSelectedValues();
        
        javax.swing.DefaultListModel newdfListModel = (javax.swing.DefaultListModel)jList111.getModel();
        
        for (int i = 0; i < listSel.length; i++) {
            
            newdfListModel.removeElement(listSel[i]);
            
        }
        
        this.jList111.setModel(newdfListModel);
        // Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        java.lang.Object[] listSel = null;
        
        listSel = jList11.getSelectedValues();
        
        javax.swing.DefaultListModel newdfListModel = (javax.swing.DefaultListModel)jList11.getModel();
        
        for (int i = 0; i < listSel.length; i++) {
            
            newdfListModel.removeElement(listSel[i]);
            
        }
        
        this.jList11.setModel(newdfListModel);
        // Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        java.lang.Object[] listSel = null;
        
        listSel = jList113.getSelectedValues();
        
        javax.swing.DefaultListModel newdfListModel = (javax.swing.DefaultListModel)jList113.getModel();
        
        for (int i = 0; i < listSel.length; i++) {
            
            newdfListModel.removeElement(listSel[i]);
            
        }
        
        this.jList113.setModel(newdfListModel);
        // Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed
    
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        java.lang.Object[] listSel = null;
        
        listSel = jList112.getSelectedValues();
        
        javax.swing.DefaultListModel newdfListModel = (javax.swing.DefaultListModel)jList112.getModel();
        
        for (int i = 0; i < listSel.length; i++) {
            
            newdfListModel.removeElement(listSel[i]);
            
        }
        
        this.jList112.setModel(newdfListModel);
        // Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed
    
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        
        java.lang.Object[] listSel = null;
        
        listSel = jList13.getSelectedValues();
        
        javax.swing.ListModel list112Model = jList112.getModel();
        
        int nofItemsList112 = list112Model.getSize();
        
        javax.swing.DefaultListModel newdfListModel = new javax.swing.DefaultListModel();
        
        for (int j = 0; j < list112Model.getSize(); j++) {
            
            newdfListModel.addElement(list112Model.getElementAt(j));
            
        }
        //        javax.swing.DefaultListModel newdfListModel = (javax.swing.DefaultListModel)jList11.getModel();
        
        for (int i = 0; i < listSel.length; i++) {
            
            if (!newdfListModel.contains(listSel[i])) {
                
                newdfListModel.addElement(listSel[i].toString());
                
            }
        }
        
        this.jList112.setModel(newdfListModel);
        
        // Add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed
    
    private void updateAction21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAction21ActionPerformed
        try {
            
            connectDB.setAutoCommit(false);
            
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("UPDATE hr.hr_appresume_qualif set name = ?,org = ?,title = ?, postal = ?, telephone = ?,remarks = ? WHERE app_id = '"+jTextField364.getText()+"'");
            for (int i = 0; i < jTable10.getRowCount(); i++){
                if (jTable10.getModel().getValueAt(i,0) != null){
                    
                    pstmt.setObject(1,jTable10.getModel().getValueAt(i,0).toString());
                    pstmt.setObject(2,jTable10.getModel().getValueAt(i,1).toString());
                    pstmt.setObject(3,jTable10.getModel().getValueAt(i,2).toString());
                    pstmt.setObject(4,jTable10.getModel().getValueAt(i,3).toString());
                    pstmt.setObject(5,jTable10.getModel().getValueAt(i,4).toString());
                    pstmt.setObject(6,jTable10.getModel().getValueAt(i,5).toString());
                    
                    
                    pstmt.executeUpdate();
                    
                }
            }
            java.sql.PreparedStatement ppstmt = connectDB.prepareStatement("UPDATE hr.hr_appresume_xtra set office = ?, position = ?, begin_date = ?,end_date = ?, remarks = ? WHERE app_id = '"+jTextField364.getText()+"'");
            for (int k = 0; k < jTable2.getRowCount(); k++){
                if (jTable2.getModel().getValueAt(k,0) != null){
                    
                    ppstmt.setObject(1,jTable2.getModel().getValueAt(k,0).toString());
                    ppstmt.setObject(2,jTable2.getModel().getValueAt(k,1).toString());
                    ppstmt.setObject(3,jTable2.getModel().getValueAt(k,2).toString());
                    ppstmt.setObject(4,jTable2.getModel().getValueAt(k,3).toString());
                    ppstmt.setObject(5,jTable2.getModel().getValueAt(k,4).toString());
                    
                    
                    
                    ppstmt.executeUpdate();
                    connectDB.commit();
                    connectDB.setAutoCommit(true);
                }
            }
            
            javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }     // Add your handling code here:
    }//GEN-LAST:event_updateAction21ActionPerformed
    
    private void updateAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAction2ActionPerformed
        try {
            
            connectDB.setAutoCommit(false);
            
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("UPDATE hr.hr_appresume_qualif set begin_date = ?,end_date = ?,employer = ?, positions = ?, salary = ?, rmks = ? WHERE app_id = '"+jTextField362.getText()+"'");
            for (int i = 0; i < jTable11.getRowCount(); i++){
                if (jTable11.getModel().getValueAt(i,0) != null){
                    
                    pstmt.setObject(1,jTable11.getModel().getValueAt(i,0).toString());
                    pstmt.setObject(2,jTable11.getModel().getValueAt(i,1).toString());
                    pstmt.setObject(3,jTable11.getModel().getValueAt(i,2).toString());
                    pstmt.setObject(4,jTable11.getModel().getValueAt(i,3).toString());
                    pstmt.setObject(5,jTable11.getModel().getValueAt(i,4).toString());
                     pstmt.setObject(6,jTable11.getModel().getValueAt(i,5).toString());
                    
                    pstmt.executeUpdate();
                    
                }
            }
            connectDB.commit();
            connectDB.setAutoCommit(true);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }// Add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_updateAction2ActionPerformed
    
    private void updateAction311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAction311ActionPerformed
        
    }//GEN-LAST:event_updateAction311ActionPerformed
    
    private void newAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAction2ActionPerformed
        
        
        
        
        // TODO add your handling code here:
        
        
        
        
        // Add your handling code here:
    }//GEN-LAST:event_newAction2ActionPerformed
    
    private void newAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAction1ActionPerformed
        try {
            
            connectDB.setAutoCommit(false);
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into hr.hr_appresume_qualif (edu_level,qual_attained,grade,institution,gradu_yr,edu_rmks,app_id,specialization) values(?,?,?,?,?,?,?,?)");
            for (int i = 0; i < jTable13.getRowCount(); i++){
                if (jTable13.getModel().getValueAt(i,0) != null){
                    
                    //pstmt.setString(1,jComboBox4.getSelectedItem().toString());
                    pstmt.setObject(1,jTable13.getValueAt(i,0).toString());
                    pstmt.setObject(2,jTable13.getValueAt(i,1).toString());
                    pstmt.setObject(3,jTable13.getValueAt(i,2).toString());
                    pstmt.setObject(4,jTable13.getValueAt(i,3).toString());
                    pstmt.setObject(5,jTable13.getValueAt(i,4).toString());
                    pstmt.setObject(6,jTable13.getValueAt(i,5).toString());
                    pstmt.setString(7,jTextField361.getText());
                    pstmt.setString(8,jTextArea1.getText());
                    
                    
                    
                    pstmt.executeUpdate();
                    
                }
            }
            
            java.sql.PreparedStatement prstmt = connectDB.prepareStatement("update hr.hr_appresume_qualif set qual_date=?,institution2=?,course=?,grade2=?,course_rmks=? where app_id='"+jTextField361.getText()+"'");
            for (int k = 0; k < jTable14.getRowCount(); k++){
                if (jTable14.getModel().getValueAt(k,0) != null){
                    
                    
                    prstmt.setObject(1,jTable14.getValueAt(k,0).toString());
                    prstmt.setObject(2,jTable14.getValueAt(k,1).toString());
                    prstmt.setObject(3,jTable14.getValueAt(k,2).toString());
                    prstmt.setObject(4,jTable14.getValueAt(k,3).toString());
                    prstmt.setObject(5,jTable14.getValueAt(k,4).toString());
                    
                    prstmt.executeUpdate();
                    connectDB.commit();
                    connectDB.setAutoCommit(true);
                    
                    
                    javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
            
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        
        // TODO add your handling code here:        // Add your handling code here:
    }//GEN-LAST:event_newAction1ActionPerformed
    
    private void jTextField363ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField363ActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_jTextField363ActionPerformed
    
    private void newAction311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAction311ActionPerformed
        try {
            
            connectDB.setAutoCommit(false);
   /*         java.sql.PreparedStatement pstmt = connectDB.prepareStatement("UPDATE hr.hr_appresume_basic set birth_date = '"+datePicker1.getDate().toString()+"',id_no = '"+jTextField61132.getText()+"',passport_no = '"+jTextField61131.getText()+"',"+
            "home_district = '"+jTextField41112.getText()+"',gender = '"+jComboBox111211.getSelectedItem().toString()+"',marital = '"+jComboBoxx1.getSelectedItem().toString()+"',ethnicity = '"+jComboBox11121.getSelectedItem().toString()+"',tel_no1 = '"+jTextField611172.getText()+"',"+
            "tel_no2 = '"+jTextField6111612.getText()+"',gsm_no = '"+jTextField611211.getText()+"',gsm_no2 = '"+jTextField6111111.getText()+"',email = '"+jTextField6111211.getText()+"',postal = '"+jTextField6111311.getText()+"',postal_code = '"+jTextField6111411.getText()+"',"+
            "city = '"+jTextField61115211.getText()+"',town = '"+jTextField61115111.getText()+"',web = '"+jTextField6111531.getText()+"' WHERE app_id = '"+jTextField36.getText()+"'");
    */
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("UPDATE hr.hr_appresume_basic set birth_date = ?,id_no = ?,passport_no = ?, home_district = ?, gender = ?,marital = ?,ethnicity = ?, tel_no1 = ?, tel_no2 = ?, gsm_no = ?, gsm_no2 = ?, email = ?,postal = ?, postal_code = ?, city = ?, town = ?, web = ?, nationality = ? WHERE app_id = ?");
            
            pstmt.setString(1,datePicker1.getDate().toString());
            pstmt.setString(2,jTextField61132.getText());
            pstmt.setString(3,jTextField61131.getText());
            pstmt.setString(4,jTextField41112.getText());
            pstmt.setString(5,jComboBox111211.getSelectedItem().toString());
            pstmt.setString(6,jComboBoxx1.getSelectedItem().toString());
            pstmt.setString(7,jComboBox11121.getSelectedItem().toString());
            pstmt.setString(8,jTextField611172.getText());
            pstmt.setString(9,jTextField6111612.getText());
            pstmt.setString(10,jTextField611211.getText());
            pstmt.setString(11,jTextField6111111.getText());
            pstmt.setString(12,jTextField6111211.getText());
            pstmt.setString(13,jTextField6111311.getText());
            pstmt.setString(14,jTextField6111411.getText());
            pstmt.setString(15,jTextField61115211.getText());
            pstmt.setString(16,jTextField61115111.getText());
            pstmt.setString(17,jTextField6111531.getText());
            pstmt.setString(18,jTextField36.getText());
            pstmt.setString(19,jComboBox8.getSelectedItem().toString());
            /*javax.swing.JOptionPane.showMessageDialog(this, "UPDATE hr.hr_appresume_basic set birth_date = '"+datePicker1.getDate().toString()+"',id_no = '"+jTextField61132.getText()+"',passport_no = '"+jTextField61131.getText()+"',"+
            "home_district = '"+jTextField41112.getText()+"',gender = '"+jComboBox111211.getSelectedItem().toString()+"',marital = '"+jComboBoxx1.getSelectedItem().toString()+"',ethnicity = '"+jComboBox11121.getSelectedItem().toString()+"',tel_no1 = '"+jTextField611172.getText()+"',"+
            "tel_no2 = '"+jTextField6111612.getText()+"',gsm_no = '"+jTextField611211.getText()+"',gsm_no2 = '"+jTextField6111111.getText()+"',email = '"+jTextField6111211.getText()+"',postal = '"+jTextField6111311.getText()+"',postal_code = '"+jTextField6111411.getText()+"',"+
            "city = '"+jTextField61115211.getText()+"',town = '"+jTextField61115111.getText()+"',web = '"+jTextField6111531.getText()+"' WHERE app_id = '"+jTextField36.getText()+"'","Information Message!",javax.swing.JOptionPane.INFORMATION_MESSAGE); */
            
            pstmt.executeUpdate();
            connectDB.commit();
            connectDB.setAutoCommit(true);
            javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_newAction311ActionPerformed
    
    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        jSearchDialog1.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed
    
    private void newAction3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAction3ActionPerformed
        try {
            
            connectDB.setAutoCommit(false);
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into hr.hr_appresume_basic (app_id,sname,fname,others,req_no,app_date,recpt_date,app_position,app_source) values(?,?,?,?,?,?,?,?,?)");
            
            pstmt.setObject(1,jTextField61.getText());
            pstmt.setObject(2,jTextField21.getText());
            pstmt.setObject(3,jTextField11.getText());
            pstmt.setObject(4,jTextField51.getText());
            pstmt.setObject(5,jComboBox3.getSelectedItem().toString());
            pstmt.setObject(6,datePicker2.getDate());
            pstmt.setObject(7,datePicker3.getDate());
            pstmt.setObject(8,jComboBox1.getSelectedItem().toString());
            pstmt.setObject(9,jComboBox2.getSelectedItem().toString());
            
            pstmt.executeUpdate();
            connectDB.commit();
            connectDB.setAutoCommit(true);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully","Confirmation Message",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            jTextField36.setText(jTextField61.getText());
            jTextField361.setText(jTextField61.getText());
            jTextField362.setText(jTextField61.getText());
            jTextField363.setText(jTextField61.getText());
            jTextField364.setText(jTextField61.getText());
            
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        }        // Add your handling code here:
    }//GEN-LAST:event_newAction3ActionPerformed
    
    public String getSqlString(java.lang.Object[] arrayfromJList) {
        java.lang.String strToArray = null;
        if (arrayfromJList.length > 0) {
            strToArray = arrayfromJList[0].toString();
            
            
            
            for (int i = 1; i <arrayfromJList.length; i++) {
                
                strToArray = strToArray+", "+arrayfromJList[i].toString();
                
            }
        } else {
            
            strToArray = "";
            
        }
        System.out.println(strToArray);
        
        return strToArray;
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel imgPanel311;
    private javax.swing.JButton jButton21;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JTextField jTextField611211;
    private javax.swing.JPanel dataPanel211;
    private javax.swing.JButton firstAction311;
    private javax.swing.JButton firstAction3;
    private javax.swing.JDialog jSearchDialog11;
    private javax.swing.JButton jButton33;
    private javax.swing.JLabel facilitynameLbl1121;
    private javax.swing.JDialog jSearchDialog1;
    private javax.swing.JTextField jTextField61131;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel imgPanel4;
    private javax.swing.JTextField jTextField61115211;
    private javax.swing.JButton clearAction21;
    private javax.swing.JLabel jLabel2311;
    private javax.swing.JPanel mainPanel1;
    private javax.swing.JList jList112;
    private javax.swing.JList jList111;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel3113;
    private javax.swing.JButton lastAction21;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel3111;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JButton helpAction311;
    private javax.swing.JButton jButton32;
    private javax.swing.JPanel mainPanel21;
    private javax.swing.JComboBox jComboBox11121;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JButton searchButton1;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel imgPanel3;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JTable jTable14;
    private javax.swing.JLabel jLabel32;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet2;
    private javax.swing.JLabel jLabel3114;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jSearchPanel1;
    private javax.swing.JTable jSearchTable11;
    private javax.swing.JTextField jTextField61115111;
    private javax.swing.JPanel subMainPanel211;
    private javax.swing.JButton previousAction;
    private javax.swing.JTable jSearchTable12;
    private javax.swing.JPanel fieldsPanel3111;
    private javax.swing.JButton newAction21;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JPanel imgPanel2;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton updateAction311;
    private javax.swing.JLabel jLabel4111;
    private javax.swing.JButton firstAction211;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JButton clearAction311;
    private com.afrisoftech.lib.DatePicker datePicker2;
    private javax.swing.JPanel actionsPanel21;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JButton updateAction3;
    private javax.swing.JTextField jTextField6111531;
    private javax.swing.JButton clearAction3;
    private javax.swing.JButton updateAction21;
    private javax.swing.JLabel facilitynameLbl11111;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JButton updateAction2;
    private javax.swing.JButton clearAction2;
    private javax.swing.JLabel jLabel6111;
    private javax.swing.JPanel jPanel611;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.JTextField jTextField6111111;
    private javax.swing.JButton jButton411;
    private javax.swing.JButton clearAction1;
    private javax.swing.JTextField jTextField361;
    private javax.swing.JButton helpAction21;
    private javax.swing.JPanel helpPanel2;
    private javax.swing.JPanel actionsPanel4;
    private javax.swing.JButton nextAction211;
    private javax.swing.JLabel facilityidLbl11211;
    private javax.swing.JPanel actionsPanel311;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JButton previousAction311;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton lastAction;
    private javax.swing.JButton deleteAction311;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JList jList113;
    private javax.swing.JButton updateAction1;
    private javax.swing.JList jList11;
    private javax.swing.JPanel mainPanel311;
    private javax.swing.JPanel helpPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel fieldsPanel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nextAction;
    private javax.swing.JTextField jTextField1111;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel mainPanel2;
    private javax.swing.JPanel labelPanel2;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JButton helpAction3;
    private javax.swing.JButton newAction2;
    private javax.swing.JPanel subMainPanel21;
    private javax.swing.JTextField jTextField61132;
    private javax.swing.JButton nextAction2;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton newAction1;
    private javax.swing.JPanel dataPanel311;
    private javax.swing.JPanel labelPanel4;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JButton helpAction1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JPanel imgPanel21;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JButton helpAction2;
    private javax.swing.JPanel subMainPanel;
    private javax.swing.JPanel spacerPanel311;
    private javax.swing.JPanel jSearchPanel12;
    private javax.swing.JButton jButton51;
    private javax.swing.JTextField jTextField611172;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JPanel mainPanel3;
    private javax.swing.JPanel labelPanel3;
    private javax.swing.JTable jSearchTable1;
    private javax.swing.JPanel helpPanel311;
    private javax.swing.JPanel jSearchPanel11;
    private javax.swing.JButton deleteAction1;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel subMainPanel3;
    private javax.swing.JTextField jTextField364;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JButton newAction4;
    private org.netbeans.lib.sql.NBCachedRowSet searchRowSet1;
    private javax.swing.JTextField jTextField363;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JPanel spacerPanel3;
    private javax.swing.JComboBox jComboBoxx1;
    private javax.swing.JLabel facilityidLbl11511;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JPanel labelPanel1;
    private javax.swing.JButton deleteAction4;
    private javax.swing.JLabel facilityidLbl11411;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel helpPanel4;
    private javax.swing.JPanel helpPanel21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel labelPanel21;
    private javax.swing.JButton newAction3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton deleteAction2;
    private javax.swing.JLabel jLabel7111;
    private javax.swing.JTextField jTextField6111211;
    private javax.swing.JButton helpAction4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel actionsPanel1;
    private javax.swing.JPanel subMainPanel1;
    private com.afrisoftech.lib.DatePicker datePicker3;
    private javax.swing.JButton jButton512;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel actionsPanel2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton deleteAction3;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTable jTable11;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField41112;
    private javax.swing.JButton newAction311;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JLabel facilitynameLbl11112;
    private javax.swing.JButton nextAction31;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton previousAction211;
    private javax.swing.JButton jButton511;
    private org.netbeans.lib.sql.NBCachedRowSet crset1;
    private javax.swing.JPanel helpPanel1;
    private javax.swing.JTextField jTextField362;
    private com.afrisoftech.lib.DatePicker datePicker1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel mainPanel4;
    private javax.swing.JButton nextAction311;
    private javax.swing.JButton jButton412;
    private javax.swing.JButton previousAction21;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton firstAction21;
    private javax.swing.JTable jTable13;
    private javax.swing.JButton lastAction3;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JLabel facilityidLbl1171;
    private javax.swing.JTextField jTextField6111411;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jSearchScrollPane11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JPanel dataPanel21;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JList jList14;
    private javax.swing.JPanel fieldsPanel21;
    private javax.swing.JButton jButton23;
    private javax.swing.JTextField jTextField6111612;
    private javax.swing.JButton jButton12;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel jPanel6112;
    private javax.swing.JPanel subMainPanel311;
    private javax.swing.JPanel jPanel6111;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel labelPanel311;
    private javax.swing.JButton firstAction;
    private javax.swing.JLabel jLabel311112;
    private javax.swing.JList jList13;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JButton searchButton12;
    private javax.swing.JList jList1;
    private javax.swing.JPanel spacerPanel21;
    private javax.swing.JLabel jLabel122111;
    private javax.swing.JTable jTable10;
    private javax.swing.JPanel dataPanel3;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet6;
    private javax.swing.JLabel qualifiableamountLbl;
    private javax.swing.JButton previousAction3;
    private javax.swing.JLabel facilityidLbl11311;
    private javax.swing.JLabel jLabel41;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet10;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField6111311;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JList jList12;
    private javax.swing.JButton clearAction4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JLabel jLabel3112;
    private javax.swing.JTextField jTextField11111;
    private javax.swing.JScrollPane jScrollPane211;
    private javax.swing.JTextField jTextField11112;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jButton31;
    private javax.swing.JPanel actionsPanel3;
    private javax.swing.JButton searchButton11;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JComboBox jComboBox111211;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet5;
    private javax.swing.JPanel spacerPanel2;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane2;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet4;
    private javax.swing.JPanel spacerPanel1;
    private javax.swing.JButton lastAction211;
    private javax.swing.JButton deleteAction21;
    private javax.swing.JDialog jSearchDialog2;
    private javax.swing.JPanel spacerPanel4;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet9;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet3;
    private javax.swing.JLabel facilityidLbl11611;
    private javax.swing.JPanel imgPanel1;
    private javax.swing.JPanel jPanel1211;
    private javax.swing.JPanel jPanel6113;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane jSearchScrollPane12;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet7;
    private javax.swing.JLabel facilityidLbl11112;
    private javax.swing.JButton lastAction311;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JScrollPane jSearchScrollPane1;
    private javax.swing.JPanel fieldsPanel211;
    private javax.swing.JButton jButton22;
    private javax.swing.JScrollPane jScrollPane3;
    private org.netbeans.lib.sql.NBCachedRowSet nBCachedRowSet8;
    private javax.swing.JLabel facilityidLbl11111;
    private javax.swing.JButton searchButton13;
    // End of variables declaration//GEN-END:variables
    
}
