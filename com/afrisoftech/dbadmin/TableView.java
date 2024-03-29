/*
 * TableView.java
 *
 * Created on March 23, 2004, 9:30 AM
 */

package com.afrisoftech.dbadmin;

/**
 *
 * @author  root
 */
public class TableView extends javax.swing.JInternalFrame implements java.lang.Runnable {
    
    /** Creates new form TableView */
    java.lang.String tableName = null;
    
    
    boolean dateFilterBoolean = false;
    
   // org.jdesktop.swing.JXTable jxTable = null;
    
    java.lang.String customQueryString = null;
    
    javax.swing.JTable exportTable;
    
    boolean exportTableBoolean = true;
    
    java.lang.Thread threadExportTable = null;
    
    java.awt.GridBagConstraints gridBagConstraints;
    
    java.sql.Connection connectDB = null;
    
    javax.swing.JTable dataViewTable = null;
    
    java.util.Vector dataViewVector;
    
    java.util.Vector columnVector;
    
    com.afrisoftech.lib.DBObject dbObject;
    
    java.util.Vector childVector;
    
    java.lang.String[] dataViewTableHeader;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    com.afrisoftech.dbadmin.XMLExport xmlExport;
    
    com.afrisoftech.dbadmin.ExcelExport excelExport;
    
    com.afrisoftech.dbadmin.HTMLExport htmlExport;
    
    com.afrisoftech.dbadmin.PDFExport pdfExport;
    
    public TableView(java.sql.Connection connDb, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB) {
        
       // jxTable = new org.jdesktop.swing.JXTable(3,10);
        
      // jxTable = new com.afrisoftech.dbadmin.JTable();
        
        dbObject = new com.afrisoftech.lib.DBObject();
        
        connectDB = connDb;
        
        pConnDB = pconnDB;
        
        /*
        org.jdesktop.swing.decorator.Highlighter[]   highlighters = new org.jdesktop.swing.decorator.Highlighter[] {
            new org.jdesktop.swing.decorator.AlternateRowHighlighter(java.awt.Color.CYAN,
            java.awt.Color.WHITE,  null),
            //            new org.jdesktop.swing.decorator.PatternHighlighter(java.awt.Color.pink, java.awt.Color.pink, "[*].*", 0, 2,0)
            /* new org.jdesktop.swing.decorator.PatternHighlighter(java.awt.Color.cyan, java.awt.Color.RED,".*",1,2, 0),*/
            
        /*new org.jdesktop.swing.decorator.HierarchicalColumnHighlighter()
            
        };
        
        org.jdesktop.swing.decorator.HighlighterPipeline highlighterPipeline = new org.jdesktop.swing.decorator.HighlighterPipeline(highlighters);
        
        jxTable.setHighlighters(highlighterPipeline);
        */
      //  jxTable.setRowHeight(20);
        
        initComponents();
        
//        jxTable.setModel(exportTable.getModel());
        
        datesPanel.setVisible(false);
        
//        jScrollPaneDBAdmin.setViewportView(jxTable);
/*        datePickerBegin.setVisible(false);
 
        datePickerEnd.setVisible(false);
 */
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupTableView = new javax.swing.ButtonGroup();
        buttonPanel = new javax.swing.JPanel();
        fetchData = new javax.swing.JButton();
        fullData = new javax.swing.JButton();
        clearTable = new javax.swing.JButton();
        closeForm = new javax.swing.JButton();
        actionsPanel = new javax.swing.JPanel();
        rdchkPanel = new javax.swing.JPanel();
        partialFetchCheckBox = new javax.swing.JCheckBox();
        tempFileDelRadio = new javax.swing.JRadioButton();
        createTempFileRadio = new javax.swing.JCheckBox();
        tableActionsPanel = new javax.swing.JPanel();
        export2Excel = new javax.swing.JButton();
        export2Xml = new javax.swing.JButton();
        export2Html = new javax.swing.JButton();
        export2Pdf = new javax.swing.JButton();
        spacerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customQuery = new javax.swing.JButton();
        viewPreferences = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPaneDBAdmin = new javax.swing.JScrollPane();
        jPanelTable = new javax.swing.JPanel();
        datesPanel = new javax.swing.JPanel();
        datePickerBegin = new com.afrisoftech.lib.DatePicker();
        datePickerEnd = new com.afrisoftech.lib.DatePicker();
        jLabelBeginDate = new javax.swing.JLabel();
        jLabelEndDate = new javax.swing.JLabel();
        helpPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Database Table Analyser");
        setVisible(true);
        buttonPanel.setLayout(new java.awt.GridBagLayout());

        buttonPanel.setBorder(new javax.swing.border.TitledBorder("General Actions"));
        fetchData.setMnemonic('F');
        fetchData.setText("Partial Fetch");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(fetchData, gridBagConstraints);

        fullData.setMnemonic('u');
        fullData.setText("Full Fetch");
        fullData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullDataActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(fullData, gridBagConstraints);

        clearTable.setMnemonic('C');
        clearTable.setText("Clear");
        clearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTableActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(clearTable, gridBagConstraints);

        closeForm.setMnemonic('s');
        closeForm.setText("Close");
        closeForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFormActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(closeForm, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(buttonPanel, gridBagConstraints);

        actionsPanel.setLayout(new java.awt.GridBagLayout());

        rdchkPanel.setLayout(new java.awt.GridBagLayout());

        rdchkPanel.setBorder(new javax.swing.border.TitledBorder("Table Actions"));
        partialFetchCheckBox.setText("Apply date filter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rdchkPanel.add(partialFetchCheckBox, gridBagConstraints);

        tempFileDelRadio.setText("Delete temp export files");
        buttonGroupTableView.add(tempFileDelRadio);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rdchkPanel.add(tempFileDelRadio, gridBagConstraints);

        createTempFileRadio.setText("Create temp export files");
        buttonGroupTableView.add(createTempFileRadio);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rdchkPanel.add(createTempFileRadio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        actionsPanel.add(rdchkPanel, gridBagConstraints);

        tableActionsPanel.setLayout(new java.awt.GridBagLayout());

        tableActionsPanel.setBorder(new javax.swing.border.TitledBorder("Export Actions"));
        export2Excel.setMnemonic('E');
        export2Excel.setText("Export to Excel");
        export2Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export2ExcelActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        tableActionsPanel.add(export2Excel, gridBagConstraints);

        export2Xml.setMnemonic('l');
        export2Xml.setText("Export to XML");
        export2Xml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export2XmlActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        tableActionsPanel.add(export2Xml, gridBagConstraints);

        export2Html.setMnemonic('M');
        export2Html.setText("Export to HTML");
        export2Html.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export2HtmlActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        tableActionsPanel.add(export2Html, gridBagConstraints);

        export2Pdf.setMnemonic('D');
        export2Pdf.setText("Export to PDF");
        export2Pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export2PdfActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        tableActionsPanel.add(export2Pdf, gridBagConstraints);

        spacerPanel.setLayout(new java.awt.GridBagLayout());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        spacerPanel.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 50.0;
        tableActionsPanel.add(spacerPanel, gridBagConstraints);

        customQuery.setMnemonic('Q');
        customQuery.setText("Custom Query");
        customQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customQueryActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        tableActionsPanel.add(customQuery, gridBagConstraints);

        viewPreferences.setMnemonic('f');
        viewPreferences.setText("Table View Preferences");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        tableActionsPanel.add(viewPreferences, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 3.0;
        actionsPanel.add(tableActionsPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(actionsPanel, gridBagConstraints);

        tablePanel.setLayout(new java.awt.GridBagLayout());

        tablePanel.setBorder(new javax.swing.border.TitledBorder("Table View"));
        jScrollPaneDBAdmin.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneDBAdmin.setAutoscrolls(true);
        jPanelTable.setLayout(new java.awt.GridBagLayout());

        jScrollPaneDBAdmin.setViewportView(jPanelTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 50.0;
        tablePanel.add(jScrollPaneDBAdmin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 100.0;
        getContentPane().add(tablePanel, gridBagConstraints);

        datesPanel.setLayout(new java.awt.GridBagLayout());

        datesPanel.setBorder(new javax.swing.border.TitledBorder("Date Picker"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        datesPanel.add(datePickerBegin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        datesPanel.add(datePickerEnd, gridBagConstraints);

        jLabelBeginDate.setText("Begin Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datesPanel.add(jLabelBeginDate, gridBagConstraints);

        jLabelEndDate.setText("End Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datesPanel.add(jLabelEndDate, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(datesPanel, gridBagConstraints);

        helpPanel.setLayout(new java.awt.GridBagLayout());

        helpPanel.setBorder(new javax.swing.border.TitledBorder("Assistance"));
        jButton1.setMnemonic('H');
        jButton1.setText("Help");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        helpPanel.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(helpPanel, gridBagConstraints);

        pack();
    }//GEN-END:initComponents
    
    private void fullDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullDataActionPerformed
        
        populateTableView(tableName);
        // Add your handling code here:
    }//GEN-LAST:event_fullDataActionPerformed
    
    private void clearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTableActionPerformed
        
        dataViewTable = null;
        
        jScrollPaneDBAdmin.setViewportView(dataViewTable);
        
        // Add your handling code here:
    }//GEN-LAST:event_clearTableActionPerformed
    
    private void closeFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFormActionPerformed
        
        this.dispose();
        
        // Add your handling code here:
    }//GEN-LAST:event_closeFormActionPerformed
    
    private void customQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customQueryActionPerformed
        
        com.afrisoftech.dbadmin.QueryDialog queryDialog = new com.afrisoftech.dbadmin.QueryDialog(new java.awt.Frame(), false, this);
        
        queryDialog.setVisible(true);
        
        // Add your handling code here:
    }//GEN-LAST:event_customQueryActionPerformed
    
    private void export2PdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export2PdfActionPerformed
        
        threadExportTable = new java.lang.Thread(this, "Export2PDF");
        
        threadExportTable.start();
        
        // Add your handling code here:
    }//GEN-LAST:event_export2PdfActionPerformed
    
    private void export2HtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export2HtmlActionPerformed
        
        threadExportTable = new java.lang.Thread(this, "Export2HTML");
        
        threadExportTable.start();
        
        // Add your handling code here:
    }//GEN-LAST:event_export2HtmlActionPerformed
    
    private void export2ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export2ExcelActionPerformed
        
        threadExportTable = new java.lang.Thread(this, "Export2Excel");
        
        threadExportTable.start();
        
        // Add your handling code here:
    }//GEN-LAST:event_export2ExcelActionPerformed
    
    private void export2XmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export2XmlActionPerformed
        
        threadExportTable = new java.lang.Thread(this, "Export2Xml");
        
        threadExportTable.start();
        
        // Add your handling code here:
    }//GEN-LAST:event_export2XmlActionPerformed
    
    public void populateTableView(java.lang.String selectedTable) {
        
        this.invalidate();
        
        createTableVectors(selectedTable);
        
        dataViewTable = new javax.swing.JTable(dataViewVector, columnVector) {
            
            
            
        };
        
        int columnCount = columnVector.capacity();
        
        for (int i = 0; i < columnCount; i++) {
            
            dataViewTable.getColumnModel().getColumn(i).setWidth(200);
            
        }
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        
        gridBagConstraints.gridx = 0;
        
        gridBagConstraints.gridy = 1;
        
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        
        gridBagConstraints.weightx = 1.0;
        
        gridBagConstraints.weighty = 100.0;
        
        jPanelTable.removeAll();
        
      // jxTable.setModel(dataViewTable.getModel());
        
//        jPanelTable.add(dataViewTable, gridBagConstraints);

  //      jPanelTable.add(jxTable, gridBagConstraints);        
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        
        gridBagConstraints.gridx = 0;
        
        gridBagConstraints.gridy = 0;
        
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        
        gridBagConstraints.weightx = 1.0;
        
        gridBagConstraints.weighty = 1.0;
        
     //   jxTable.getTableHeader().setBackground(java.awt.Color.GREEN);
        
  //      jxTable.getTableHeader().setForeground(java.awt.Color.BLUE);
        
//        dataViewTable.getTableHeader().setBackground(java.awt.Color.GREEN);
        
//        dataViewTable.getTableHeader().setForeground(java.awt.Color.BLUE);        
        //        jScrollPaneDBAdmin.setRowHeaderView(jPanelTable);
        
        //        dataViewTable.getTableHeader().setOpaque(true);
//        jPanelTable.add(dataViewTable.getTableHeader(), gridBagConstraints);        
 //       jPanelTable.add(jxTable.getTableHeader(), gridBagConstraints);
//       jScrollPaneDBAdmin.setViewportView(jxTable);  
//        tableHeaderPane.add(jxTable.getTableHeader());
        jScrollPaneDBAdmin.setViewportView(jPanelTable);
        
        
        
        tablePanel.setBorder(new javax.swing.border.TitledBorder("Table View for table ["+tableName.toUpperCase()+"]"));
        
        //        jScrollPaneDBAdmin.setSize(5000,1000);
        
        //        jScrollPaneDBAdmin.setViewportView(dataViewTable);
        
        //        this.invalidate();
        
        exportTable = dataViewTable;
        
        this.validate();
        
        
    }
    
    public void createTableVectors(java.lang.String selectedTable) {
        
        dateFilterBoolean = false;
        
        tableName = selectedTable.toUpperCase();
        
        dataViewVector = new java.util.Vector(1,1);
        
        int rowCount = 0;
        
        try {
/*
            java.sql.PreparedStatement pstmtcountVector = connectDB.prepareStatement("SELECT COUNT(*) FROM "+selectedTable);
 
            java.sql.ResultSet rsetCountVector = pstmtcountVector.executeQuery();
 
            while(rsetCountVector.next()) {
 
                rowCount = rsetCountVector.getInt(1);
 
            }
 */
            customQueryString = "select * from "+selectedTable;
            
            java.sql.PreparedStatement pstmtVector = connectDB.prepareStatement(customQueryString);
            
            java.sql.ResultSet rsetVector = pstmtVector.executeQuery();
            
            java.sql.ResultSetMetaData rsetMetaData = rsetVector.getMetaData();
            
            pstmtVector.setCursorName("myCursor");
            
            String cursorName = rsetVector.getCursorName();
            
            System.out.println("Cursor name = ["+cursorName+"]");
            
            int columnCount = rsetMetaData.getColumnCount();
            
            //            System.out.println("Column count : ["+columnCount+"]");
            
            //            childVector = new java.util.Vector(columnCount);
            
            //            System.out.println("Done childVector");
            
            columnVector = new java.util.Vector(columnCount);
            
            //            System.out.println("Done columnVector");
            
            for (int i = 0; i < columnCount; i++) {
                //                System.out.println("Done with Headers"+rsetMetaData.getColumnName(i + 1).toUpperCase());
                columnVector.add(i,rsetMetaData.getColumnName(i + 1).toUpperCase());
                
                if (rsetMetaData.getColumnName(i + 1).matches("date") || rsetMetaData.getColumnName(i + 1).endsWith("date") || rsetMetaData.getColumnName(i + 1).startsWith("date")) {
                    
                    dateFilterBoolean = true;
                    
                    datesPanel.setVisible(true);
                    
                } else {
                    
                    if (!dateFilterBoolean) {
                        
                        datesPanel.setVisible(false);
                        
                    }
                }
                
                //                System.out.println("Done with Headers"+rsetMetaData.getColumnName(i + 1).toUpperCase());
                
            }
            
            //            int i = 0;
            
            while (rsetVector.next()) {
                childVector = new java.util.Vector(columnCount);
                //                childVector.removeAllElements();
                
                for (int j = 0; j < columnCount; j++) {
                    
                    childVector.addElement(dbObject.getDBObject(rsetVector.getString(j + 1), "-"));
                    
                }
                
                dataViewVector.add(childVector);
                
            }
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), sqlExec.getMessage());
            
        }
        
    }
    
    public javax.swing.JTable getExportTable() {
        
        javax.swing.JTable table2Export = null;
        
        if (exportTable != null) {
            
            table2Export = exportTable;
            
        }
        
        return table2Export;
        
    }
    
    public void run() {
        
        if (exportTableBoolean == false) {
            
            exportTableBoolean = true;
            
        }
        
        while (exportTableBoolean) {
            
            System.out.println("Export process started for thread ["+Thread.currentThread().getName()+"]");
            
            if (Thread.currentThread().getName().matches("Export2Excel")) {
                
                System.out.println("Exporting Export2Excel");
                
                excelExport = new com.afrisoftech.dbadmin.ExcelExport(this.getExportTable(), tableName);
                
            } else if (Thread.currentThread().getName().matches("Export2Xml")) {
                
                xmlExport = new com.afrisoftech.dbadmin.XMLExport(this.getExportTable(), tableName);
                
            } else if (Thread.currentThread().getName().matches("Export2HTML")) {
                
                htmlExport = new com.afrisoftech.dbadmin.HTMLExport(this.getExportTable(), tableName);
                
            } else if (Thread.currentThread().getName().matches("Export2PDF")) {
                
                pdfExport = new com.afrisoftech.dbadmin.PDFExport(this.getExportTable(), tableName);
                
            }
            
            
            try {
                
                Thread.currentThread().sleep(100);
                
            } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
            
            exportTableBoolean = false;
            
        }
        
        
    }
    
    protected void setQueryString(java.lang.String queryString) {
        
        customQueryString = queryString;
        
    }
    
    protected void populateCustomQueryTable() {
        
        this.invalidate();
        
        createCustomTableVectors(null);//tableName);
        
        dataViewTable = new javax.swing.JTable(dataViewVector, columnVector);
        
        int columnCount = columnVector.capacity();
        
        for (int i = 0; i < columnCount; i++) {
            
            dataViewTable.getColumnModel().getColumn(i).setWidth(200);
            
        }
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        
        gridBagConstraints.gridx = 0;
        
        gridBagConstraints.gridy = 1;
        
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        
        gridBagConstraints.weightx = 1.0;
        
        gridBagConstraints.weighty = 100.0;
        
        jPanelTable.removeAll();
        
   //     jxTable.setModel(dataViewTable.getModel());
        
//        jPanelTable.add(dataViewTable, gridBagConstraints);

    //    jPanelTable.add(jxTable, gridBagConstraints);         
//        jPanelTable.add(dataViewTable, gridBagConstraints);
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        
        gridBagConstraints.gridx = 0;
        
        gridBagConstraints.gridy = 0;
        
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        
        gridBagConstraints.weightx = 1.0;
        
        gridBagConstraints.weighty = 1.0;
        
  //      dataViewTable.getTableHeader().setBackground(java.awt.Color.GREEN);
        
        dataViewTable.getTableHeader().setForeground(java.awt.Color.BLUE);
        
        //        jScrollPaneDBAdmin.setRowHeaderView(jPanelTable);
        
        //        dataViewTable.getTableHeader().setOpaque(true);
        
       // jPanelTable.add(jxTable.getTableHeader(), gridBagConstraints);
        
        jScrollPaneDBAdmin.setViewportView(jPanelTable);
        
        tablePanel.setBorder(new javax.swing.border.TitledBorder("Table View for ["+tableName.toUpperCase()+"]"));
        
        
        
        //        jScrollPaneDBAdmin.setSize(5000,1000);
        
        //        jScrollPaneDBAdmin.setViewportView(dataViewTable);
        
        //        this.invalidate();
        
        exportTable = dataViewTable;
        
        this.validate();
        
        
        
    }
    
    protected void createCustomTableVectors(java.lang.String queryString) {
        
        dateFilterBoolean = false;
        
        boolean pastFrom = false;
        //        tableName = selectedTable.toUpperCase();
        
        dataViewVector = new java.util.Vector(1,1);
        
        int rowCount = 0;
        
        try {
/*
            java.sql.PreparedStatement pstmtcountVector = connectDB.prepareStatement("SELECT COUNT(*) FROM "+selectedTable);
 
            java.sql.ResultSet rsetCountVector = pstmtcountVector.executeQuery();
 
            while(rsetCountVector.next()) {
 
                rowCount = rsetCountVector.getInt(1);
 
            }
 */
            java.util.StringTokenizer sqlTokenizer = new java.util.StringTokenizer(customQueryString);
            
            while (sqlTokenizer.hasMoreTokens()) {
                
                if (pastFrom) {
                    
                    tableName = sqlTokenizer.nextToken();
                    
                    pastFrom = false;
                    
                }
                
                if (sqlTokenizer.nextToken() == "from") {
                    
                    pastFrom = true;
                    
                }
                
            }
            
/*            int tableFrom = customQueryString.indexOf("from");
 
            tableName = customQueryString.substring(tableFrom + 5);
 */
            java.sql.PreparedStatement pstmtVector = connectDB.prepareStatement(customQueryString);
            
            java.sql.ResultSet rsetVector = pstmtVector.executeQuery();
            
            java.sql.ResultSetMetaData rsetMetaData = rsetVector.getMetaData();
            
            //    tableName = rsetMetaData.getTableName(1);
            
            int columnCount = rsetMetaData.getColumnCount();
            
            //            System.out.println("Column count : ["+columnCount+"]");
            
            //            childVector = new java.util.Vector(columnCount);
            
            //            System.out.println("Done childVector");
            
            columnVector = new java.util.Vector(columnCount);
            
            //            System.out.println("Done columnVector");
            
            for (int i = 0; i < columnCount; i++) {
                //                System.out.println("Done with Headers"+rsetMetaData.getColumnName(i + 1).toUpperCase());
                columnVector.add(i,rsetMetaData.getColumnName(i + 1).toUpperCase());
                
                if (rsetMetaData.getColumnName(i + 1).matches("date") || rsetMetaData.getColumnName(i + 1).endsWith("date") || rsetMetaData.getColumnName(i + 1).startsWith("date")) {
                    
                    dateFilterBoolean = true;
                    
                    datesPanel.setVisible(true);
                    
                } else {
                    
                    if (!dateFilterBoolean) {
                        
                        datesPanel.setVisible(false);
                        
                    }
                    
                }
                
                //                System.out.println("Done with Headers"+rsetMetaData.getColumnName(i + 1).toUpperCase());
                
            }
            
            //            int i = 0;
            
            while (rsetVector.next()) {
                childVector = new java.util.Vector(columnCount);
                //                childVector.removeAllElements();
                
                for (int j = 0; j < columnCount; j++) {
                    
                    childVector.addElement(dbObject.getDBObject(rsetVector.getString(j + 1), "-"));
                    
                }
                
                dataViewVector.add(childVector);
                
            }
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), sqlExec.getMessage());
            
        }
        
    }
    
    protected java.lang.String createDateFilter() {
        
        java.lang.String dateFilter = " ";
        
        if ((datePickerBegin.getDate().equals(null)) && (datePickerEnd.getDate().equals(null))) {
            
            dateFilter = dateFilter + "where date between '"+datePickerBegin.getDate().toString()+"' and '"+datePickerEnd.getDate().toString()+"'";
            
        } else if (datePickerEnd.getDate().equals(null)) {
            
            dateFilter = dateFilter + "where date > '"+datePickerBegin.getDate().toString()+"'";
            
        } else if (datePickerEnd.getDate().equals(null)){
            
            dateFilter = dateFilter + "where date < '"+datePickerEnd.getDate().toString()+"'";
            
        }
        
        return dateFilter;
        
    }
/*
    protected class TableViewModel extends javax.swing.table.DefaultTableModel {
 
        java.util.Vector tableDataVector = dataViewVector;
 
        java.util.Vector tableColumnVector = columnVector;
 
        public int getRowCount() {
 
            return tableDataVector.toArray().length;
 
        }
 
        public int getColumnCount() {
 
            return tableColumnVector.toArray().length;
 
        }
 
        public java.lang.Object getValueAt(int row, int column) {
 
            return
 
        }
 
    }
 */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPaneDBAdmin;
    private javax.swing.JCheckBox partialFetchCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton tempFileDelRadio;
    private javax.swing.JButton export2Pdf;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton clearTable;
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel spacerPanel;
    private javax.swing.JButton export2Excel;
    private javax.swing.JCheckBox createTempFileRadio;
    private javax.swing.JLabel jLabelEndDate;
    private javax.swing.JButton viewPreferences;
    private javax.swing.JButton export2Xml;
    private com.afrisoftech.lib.DatePicker datePickerEnd;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JButton export2Html;
    private javax.swing.JPanel helpPanel;
    private javax.swing.ButtonGroup buttonGroupTableView;
    private com.afrisoftech.lib.DatePicker datePickerBegin;
    private javax.swing.JButton fetchData;
    private javax.swing.JPanel rdchkPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton fullData;
    private javax.swing.JPanel tableActionsPanel;
    private javax.swing.JLabel jLabelBeginDate;
    private javax.swing.JPanel datesPanel;
    private javax.swing.JButton customQuery;
    private javax.swing.JButton closeForm;
    // End of variables declaration//GEN-END:variables
    
}
