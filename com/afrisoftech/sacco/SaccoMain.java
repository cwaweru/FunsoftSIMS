/*
 * sacco.java
 *
 * Created on August 13, 2002, 12:54 AM
 */

package com.afrisoftech.sacco;


import java.beans.PropertyVetoException;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import java.io.IOException;
//import com.afrisoftech.medic.medic;
import javax.help.*;
import javax.help.search.*;


/**
 *
 * @author  root
 */
public class SaccoMain extends javax.swing.JFrame implements java.lang.Runnable {
    
    private boolean isRunning = true;
    
    private static java.lang.String psWord = null;
    
    private boolean domainsReset = false;
    
    private javax.swing.ImageIcon imgIcon;
    
    int GITransactions = 0;
    int BalanceSheet = 1;
    int ProfitLoss = 2;
    int CashBookList = 3;
    int TransactionsList = 4;
    int TrialBalance = 5;
    int journal = 6;
    int Banking = 7;
    int Payments = 8;
    int SharesTransactions = 9;
    int LoanTransactions = 991;
    int MemberStmt = 10;
    int AllLoanStmt = 5550;
    int AllAcct = 11;
    int LoanAcct = 12;
    int MemList = 13;
    int ApprLoans = 14;
    int ListLoansApp = 15;
    int IntPaid = 16;
    int ApprVouch = 17;
    int PayAwtAppr = 18;
    int ProssecingPayroll = 21;
    int selected_Node;
    static int PAYMENTS = 1;
    int RECEIPTS = 2;
    int SHARES = 3;
    int LOANS = 4;
    int MEMBERS = 5;
    int CASHBOOK = 6;
    int JOURNAL = 7;
    int BUDGETING = 8;
    int ASSETMGNT = 9;
    int STATEMENTS = 10;
    int ACCTREPORTS = 11;
    int MGMTREPORTS = 12;
    int DBMAINT = 13;
    int USERPROF = 14;
    int GRAPHICALAN = 15;
    int HELPANDOCS =16;
    int AllocSum = 99;
     int DebtAllocSum = 100;
       int UnAllocSum = 101;
       int AllocRep = 85;
       int ScmAllocSumm = 137;
       int DebtAllocSumm = 138;
     int FinalInvBal = 139;
      int PayerAllocSumm = 140;
      int AllocationDetail = 143;
      int AllocBychq = 175;
       int DebtCredt = 198;
        int PayerAllocDet = 236;
         int CreditsSumm = 5209;
    int MemberResStmt = 5210;
    int AllResign = 5211;
    int ResignByReason = 5212;
    int NewMemList = 5213;
    
     int AllEarnings = 5214;
    int EarningDet = 5215;
    int MemberEarnStmt = 5216;
    int MbrNotPaying = 5220;
    int MbrOverDed = 5221;
    int MbrOverDedRfd = 5228;
     int AllMbrOverDed = 5229;
    int  LoanActiveStmt = 5551;
     int  DataSheet = 5239;
     int  DataSheetNewMbr = 5240;
     int SharesRfd = 5241;
     int LoanBalDataSheet = 5243;
     int BBFMbrTrans = 5249;
     int AllBBFResign = 5251;
    
    javax.swing.JPopupMenu popupMenu = null;
    
    
    
    
    // java.awt.Image imgScaled = imgIconLoaded.getImage();
    /** Creates new form sacco */
/*    public sacco() {
 
 
 
        imgIcon = new javax.swing.ImageIcon(getClass().getResource("/Window.gif"));
 
        this.setIconImage(imgIcon.getImage());
 
  /*
  //  java.awt.Image imgScaled = imgIcon.getImage();
 
   // setIconImage(imgScaled);
 
  //      java.awt.Image img = java.awt.Toolkit.getDefaultToolkit().createImage("/folder_open.gif");
 
        //setIconImage(img1);
     /*  try {
 
        java.lang.Class.forName("org.postgresql.Driver");
 
        } catch(java.lang.ClassNotFoundException cnfExec) {
 
            javax.swing.JOp//tionPane.showMessageDialog("PostgreSQL Driver not found. Please contact system administrator.");
 
        }
 
 
 
        initComponents();
 
 
    } */
    public static java.sql.Connection connectDB = null;
    
    public java.lang.String dbUserName = null;
    
    org.netbeans.lib.sql.pool.PooledConnectionSource pConnDB = null;
    
    java.lang.String path2Acrobat = null;
    
    javax.help.HelpSet helpHS = null;
    
    javax.help.HelpBroker helpBroker;
    
    javax.help.HelpSet apiHS = null;
    
    javax.help.HelpBroker apiHB = null;
    
    static final java.lang.String helpSetName = "EpackSacco";
    
    static final java.lang.String helpSetLable = "E-Pack Sacco System";
    
    /** Creates new form medic */
    public SaccoMain(java.sql.Connection connDB, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB, java.lang.String acrobatPath, java.lang.String psword) {
        
        psWord = psword;
        
        connectDB = connDB;
        
        pConnDB = pconnDB;
      
        
        path2Acrobat = acrobatPath;
        
        try {
            
            java.lang.ClassLoader classLoader = SaccoMain.class.getClassLoader();
            
            java.net.URL urlHelpSet = javax.help.HelpSet.findHelpSet(classLoader, helpSetName);
            
            helpHS = new javax.help.HelpSet(classLoader, urlHelpSet);
            
        } catch(java.lang.Exception exec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, exec.getMessage());
            
        }
        
//        helpBroker = helpHS.createHelpBroker();
        
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        gridBagLayout1 = new java.awt.GridBagLayout();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        fmgrBttn = new javax.swing.JButton();
        calcBttn = new javax.swing.JButton();
        brwsrBttn = new javax.swing.JButton();
        editButtn = new javax.swing.JButton();
        mailBttn = new javax.swing.JButton();
        mtmediaBttn = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        helpButton = new javax.swing.JButton();
        saccoSplitPane = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.tree.DefaultMutableTreeNode top = new javax.swing.tree.DefaultMutableTreeNode("Sacco System View");
        createTreeNodes(top);

        jTree1 = null;

        jTree1 = new javax.swing.JTree(top);

        jTree1.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);

        //Listen for when the selection changes.
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {

            public void valueChanged(javax.swing.event.TreeSelectionEvent e) {

                javax.swing.tree.DefaultMutableTreeNode node = (javax.swing.tree.DefaultMutableTreeNode)

                jTree1.getLastSelectedPathComponent();

                if (node == null) return;

                Object nodeInfo = node.getUserObject();

                if (node.isLeaf()) {

                    invokeTreeActionPlan(nodeInfo.toString());

                } else {
                    // displayURL(helpURL);
                }
            }
        });

        saccopn = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        setupmn = new javax.swing.JMenu();
        regionmn = new javax.swing.JMenu();
        countrymnit = new javax.swing.JMenuItem();
        branchmnit = new javax.swing.JMenuItem();
        distdivmnit = new javax.swing.JMenuItem();
        deptmnit = new javax.swing.JMenuItem();
        workstmnit = new javax.swing.JMenuItem();
        bankssetnitup = new javax.swing.JMenu();
        banksmnit = new javax.swing.JMenuItem();
        banhbranchmnit = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        companypmnit = new javax.swing.JMenuItem();
        suffmnit = new javax.swing.JMenuItem();
        offmnit = new javax.swing.JMenuItem();
        membertypemnit = new javax.swing.JMenuItem();
        staffmn = new javax.swing.JMenu();
        employmttermsmnit = new javax.swing.JMenuItem();
        staffdetailsmnit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        sharetypesmnit = new javax.swing.JMenuItem();
        loansbmn = new javax.swing.JMenu();
        loansecmnit = new javax.swing.JMenuItem();
        loansmnit = new javax.swing.JMenuItem();
        loanpurpmnit = new javax.swing.JMenuItem();
        deferejmnit = new javax.swing.JMenuItem();
        loanmaxmnit = new javax.swing.JMenuItem();
        actvintfr = new javax.swing.JMenuItem();
        propertysetupmnit = new javax.swing.JMenuItem();
        commismnit = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        depreciationmn = new javax.swing.JMenu();
        depreciationmnit = new javax.swing.JMenuItem();
        depreciationmethodmnit = new javax.swing.JMenuItem();
        repomnit = new javax.swing.JMenuItem();
        sharescontribmnit = new javax.swing.JMenuItem();
        bbfsetupsmn = new javax.swing.JMenu();
        benefitsdefinemnit = new javax.swing.JMenuItem();
        refundsetupsmnit = new javax.swing.JMenuItem();
        adjustdedmnit = new javax.swing.JMenuItem();
        schememn = new javax.swing.JMenu();
        schemeprovmnit = new javax.swing.JMenuItem();
        schemeregmnit = new javax.swing.JMenuItem();
        schemeallmnit = new javax.swing.JMenuItem();
        suspschemepovmnit = new javax.swing.JMenuItem();
        suspschememnit = new javax.swing.JMenuItem();
        usersmnit = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JSeparator();
        exit = new javax.swing.JMenuItem();
        processingmn = new javax.swing.JMenu();
        membmnit1 = new javax.swing.JMenuItem();
        saccomnit = new javax.swing.JMenuItem();
        recvallocformmnit = new javax.swing.JMenuItem();
        processparmnit = new javax.swing.JMenuItem();
        approveinvmnit = new javax.swing.JMenuItem();
        refundmn = new javax.swing.JMenu();
        sharesrefmnit = new javax.swing.JMenuItem();
        deductionRefundsmnit = new javax.swing.JMenuItem();
        loanprssmn = new javax.swing.JMenu();
        loanappmnit = new javax.swing.JMenuItem();
        loanapprvmnit = new javax.swing.JMenuItem();
        loansprmnit = new javax.swing.JMenuItem();
        sharrcptmnit1 = new javax.swing.JMenuItem();
        loanoffsetmnit = new javax.swing.JMenuItem();
        sharetransmn = new javax.swing.JMenu();
        otherSharerecptsmnit = new javax.swing.JMenuItem();
        convertRfd2Sharemnit = new javax.swing.JMenuItem();
        bbfOperationsmn = new javax.swing.JMenu();
        mbrregmnit = new javax.swing.JMenuItem();
        bbfopeningbalancemnit11 = new javax.swing.JMenuItem();
        bbfdedadjmnit = new javax.swing.JMenuItem();
        processparmnit111 = new javax.swing.JMenuItem();
        allocatebbfbbfmnit11 = new javax.swing.JMenuItem();
        bbfrefundsmnit11 = new javax.swing.JMenuItem();
        gledgermn = new javax.swing.JMenu();
        cashbkmn = new javax.swing.JMenu();
        otherrecptmnit = new javax.swing.JMenuItem();
        raisevouchmnit = new javax.swing.JMenuItem();
        approvevouchmnit = new javax.swing.JMenuItem();
        otherprmnit = new javax.swing.JMenuItem();
        bankingmnit = new javax.swing.JMenuItem();
        bankreconcmnit = new javax.swing.JMenuItem();
        cahflowmngmnit = new javax.swing.JMenuItem();
        jrnloansmnit = new javax.swing.JMenuItem();
        resetcodesmnit = new javax.swing.JMenuItem();
        currtransmn = new javax.swing.JMenu();
        usdollarmnit = new javax.swing.JMenuItem();
        euromnit = new javax.swing.JMenuItem();
        assetmnit = new javax.swing.JMenuItem();
        pettycashmn = new javax.swing.JMenu();
        receivecashmnit = new javax.swing.JMenuItem();
        raisecashVouchmnit = new javax.swing.JMenuItem();
        payvouchermnit = new javax.swing.JMenuItem();
        printvouchermnit = new javax.swing.JMenuItem();
        reportsmn = new javax.swing.JMenu();
        mreportsmn = new javax.swing.JMenu();
        memberListsmn = new javax.swing.JMenu();
        memberListmnit = new javax.swing.JMenuItem();
        activeMemberListmnit = new javax.swing.JMenuItem();
        newmembrptmnit = new javax.swing.JMenuItem();
        MemberDetailsmnit = new javax.swing.JMenuItem();
        withdrawalmn = new javax.swing.JMenu();
        allMbrWithdrawalmnit = new javax.swing.JMenuItem();
        mbrResignbyReasonmnit = new javax.swing.JMenuItem();
        withdrawalByReasonmnit = new javax.swing.JMenuItem();
        memberstatementnmit = new javax.swing.JMenuItem();
        openingbalmnit = new javax.swing.JMenuItem();
        sharesmn1mn = new javax.swing.JMenu();
        sharetransmnit = new javax.swing.JMenuItem();
        MemberBalmnit1 = new javax.swing.JMenuItem();
        sharesrfdmnit = new javax.swing.JMenuItem();
        detMemberSaremnit = new javax.swing.JMenuItem();
        loanrepmn = new javax.swing.JMenu();
        MemberStmtmnit = new javax.swing.JMenuItem();
        approvedloansmnit = new javax.swing.JMenuItem();
        loantransmnit = new javax.swing.JMenuItem();
        listloansappliedmnit = new javax.swing.JMenuItem();
        loanawaitapprmnit = new javax.swing.JMenuItem();
        loansecguarmnit = new javax.swing.JMenuItem();
        loansecguarsammrymnit = new javax.swing.JMenuItem();
        loaninarreasmnit = new javax.swing.JMenuItem();
        deductionsmn = new javax.swing.JMenu();
        mbrnotdeductesmnit = new javax.swing.JMenuItem();
        allOverDedmnit = new javax.swing.JMenuItem();
        overdeductedmbrsmnit = new javax.swing.JMenuItem();
        overdeductionrfdmnit = new javax.swing.JMenuItem();
        saccoearningsmn = new javax.swing.JMenu();
        detailedEarningStmtmnit = new javax.swing.JMenuItem();
        allsaccoearningsmnit = new javax.swing.JMenuItem();
        earningspeMembermnit = new javax.swing.JMenuItem();
        interestpaidmnit1 = new javax.swing.JMenuItem();
        dividedpaidmnit1 = new javax.swing.JMenuItem();
        dividlistmnit1 = new javax.swing.JMenuItem();
        sinkingfundmnit = new javax.swing.JMenuItem();
        sinkingpermembermnit = new javax.swing.JMenuItem();
        loanintrmnit1 = new javax.swing.JMenuItem();
        dataSheetmn = new javax.swing.JMenu();
        dataSheetmnit = new javax.swing.JMenuItem();
        newMbrDtaSheetmnit = new javax.swing.JMenuItem();
        mbrnotpayingloanmnit = new javax.swing.JMenuItem();
        allocationmn = new javax.swing.JMenu();
        allocsummnit = new javax.swing.JMenuItem();
        unallocpymmnit = new javax.swing.JMenuItem();
        invwithbalmnit = new javax.swing.JMenuItem();
        allocsummperdebtmnit = new javax.swing.JMenuItem();
        allocsumnit = new javax.swing.JMenuItem();
        allocchqmnit = new javax.swing.JMenuItem();
        bbfreportsmn = new javax.swing.JMenu();
        bbfmembersmnit = new javax.swing.JMenuItem();
        bbfmembertransmnit = new javax.swing.JMenuItem();
        totalbbfcontributionmnit = new javax.swing.JMenuItem();
        bbfmbrtranamnit = new javax.swing.JMenuItem();
        allMbrrefunnMnit = new javax.swing.JMenuItem();
        memberrfdsmnit = new javax.swing.JMenuItem();
        individualrfdsmnit = new javax.swing.JMenuItem();
        lnfmn = new javax.swing.JMenu();
        swinglnfmnit1 = new javax.swing.JCheckBoxMenuItem();
        winlnfmnit1 = new javax.swing.JCheckBoxMenuItem();
        motiflnfmnit1 = new javax.swing.JCheckBoxMenuItem();
        macmnit1 = new javax.swing.JCheckBoxMenuItem();
        skinmn = new javax.swing.JMenu();
        xpmnit1 = new javax.swing.JRadioButtonMenuItem();
        macos1mnit1 = new javax.swing.JRadioButtonMenuItem();
        whiltmnit1 = new javax.swing.JRadioButtonMenuItem();
        modernmnit1 = new javax.swing.JRadioButtonMenuItem();
        aquamnit1 = new javax.swing.JRadioButtonMenuItem();
        beosmnit1 = new javax.swing.JRadioButtonMenuItem();
        bbjmnit11 = new javax.swing.JRadioButtonMenuItem();
        utilitymn = new javax.swing.JMenu();
        opbalmnit = new javax.swing.JMenuItem();
        dailyrtmnit = new javax.swing.JMenuItem();
        cpactdatamnit = new javax.swing.JMenuItem();
        validatamnit = new javax.swing.JMenuItem();
        bkupmnit = new javax.swing.JMenuItem();
        optimdbmnit = new javax.swing.JMenuItem();
        monthlymn = new javax.swing.JMenu();
        lnintrestmnit = new javax.swing.JMenuItem();
        clsacctmnit = new javax.swing.JMenuItem();
        yrroutinemn = new javax.swing.JMenu();
        divdedcalcmnit = new javax.swing.JMenuItem();
        deposintmnit = new javax.swing.JMenuItem();
        yclsacctmnit = new javax.swing.JMenuItem();
        divdcapitmnit = new javax.swing.JMenuItem();
        interestcapmnit = new javax.swing.JMenuItem();
        dividcaptmnit = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JSeparator();
        chgpasswdmnit = new javax.swing.JMenuItem();
        updatedomainsmnit = new javax.swing.JMenuItem();
        restoredatamnit = new javax.swing.JMenuItem();
        hlpsetsmnit = new javax.swing.JMenuItem();
        setaccperiodmnit = new javax.swing.JMenuItem();
        mbVerifymnit = new javax.swing.JMenuItem();
        helpmn = new javax.swing.JMenu();
        hlpcontmnit = new javax.swing.JMenuItem();
        aboutmn = new javax.swing.JMenuItem();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(this.getCompanyName());
        setBackground(new java.awt.Color(204, 204, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jToolBar1.addSeparator(new java.awt.Dimension(3,20));
        jToolBar1.setBorder(new javax.swing.border.EtchedBorder());
        jToolBar1.setFloatable(false);
        jToolBar1.setMinimumSize(new java.awt.Dimension(500, 25));
        jToolBar1.setPreferredSize(new java.awt.Dimension(231, 25));
        jToolBar1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jPanel1.setPreferredSize(new java.awt.Dimension(219, 35));
        fmgrBttn.setToolTipText("File Manager");
        fmgrBttn.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
        fmgrBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        fmgrBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmgrBttnActionPerformed(evt);
            }
        });

        jPanel1.add(fmgrBttn);

        calcBttn.setToolTipText("Calculator");
        calcBttn.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
        calcBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        calcBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBttnActionPerformed(evt);
            }
        });

        jPanel1.add(calcBttn);

        brwsrBttn.setToolTipText("Internet browser");
        brwsrBttn.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
        brwsrBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        brwsrBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brwsrBttnActionPerformed(evt);
            }
        });

        jPanel1.add(brwsrBttn);

        editButtn.setToolTipText("Word processor");
        editButtn.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
        editButtn.setPreferredSize(new java.awt.Dimension(25, 25));
        editButtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtnActionPerformed(evt);
            }
        });

        jPanel1.add(editButtn);

        mailBttn.setToolTipText("Email utility");
        mailBttn.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
        mailBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        mailBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailBttnActionPerformed(evt);
            }
        });

        jPanel1.add(mailBttn);

        mtmediaBttn.setToolTipText("Multimedia player");
        mtmediaBttn.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
        mtmediaBttn.setMaximumSize(new java.awt.Dimension(20, 37));
        mtmediaBttn.setMinimumSize(new java.awt.Dimension(30, 37));
        mtmediaBttn.setPreferredSize(new java.awt.Dimension(25, 25));
        mtmediaBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtmediaBttnActionPerformed(evt);
            }
        });

        jPanel1.add(mtmediaBttn);

        jToolBar1.add(jPanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jToolBar1, gridBagConstraints);

        jToolBar2.setBorder(new javax.swing.border.EtchedBorder());
        jToolBar2.setFloatable(false);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jPanel2.setPreferredSize(new java.awt.Dimension(39, 35));
        helpButton.setToolTipText("Get system help");
        helpButton.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
        helpButton.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(helpButton);

        jToolBar2.add(jPanel2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jToolBar2, gridBagConstraints);

        saccoSplitPane.setResizeWeight(0.04);
        jScrollPane1.setViewportView(jTree1);

        saccoSplitPane.setLeftComponent(jScrollPane1);

        saccopn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                saccopnComponentShown(evt);
            }
        });

        saccopn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saccopnMousePressed(evt);
            }
        });

        saccoSplitPane.setRightComponent(saccopn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(saccoSplitPane, gridBagConstraints);

        jMenuBar1.setBorder(new javax.swing.border.TitledBorder(null, "Sacco System Menu Bar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier", 2, 8), new java.awt.Color(0, 0, 153)));
        jMenuBar1.setFont(new java.awt.Font("Serif", 0, 12));
        setupmn.setText("Setup");
        regionmn.setText("Area sets..");
        countrymnit.setText("Country ");
        countrymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countrymnitActionPerformed(evt);
            }
        });

        regionmn.add(countrymnit);
        branchmnit.setText("Sacco Branches");
        branchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchmnitActionPerformed(evt);
            }
        });

        regionmn.add(branchmnit);
        distdivmnit.setText("Districts ");
        distdivmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distdivmnitActionPerformed(evt);
            }
        });

        regionmn.add(distdivmnit);
        deptmnit.setText("KNUT Division ");
        deptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptmnitActionPerformed(evt);
            }
        });

        regionmn.add(deptmnit);
        workstmnit.setText("KNUT Zone");
        workstmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workstmnitActionPerformed(evt);
            }
        });

        regionmn.add(workstmnit);
        setupmn.add(regionmn);
        bankssetnitup.setText("Banks");
        bankssetnitup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankssetnitupActionPerformed(evt);
            }
        });

        banksmnit.setText("Banks");
        banksmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banksmnitActionPerformed(evt);
            }
        });

        bankssetnitup.add(banksmnit);
        banhbranchmnit.setText("Bank Branches");
        banhbranchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banhbranchmnitActionPerformed(evt);
            }
        });

        bankssetnitup.add(banhbranchmnit);
        setupmn.add(bankssetnitup);
        setupmn.add(jSeparator2);
        companypmnit.setText("Company Profile");
        companypmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companypmnitActionPerformed(evt);
            }
        });

        setupmn.add(companypmnit);
        suffmnit.setText("Suffix");
        suffmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suffmnitActionPerformed(evt);
            }
        });

        setupmn.add(suffmnit);
        offmnit.setText("Officials");
        offmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offmnitActionPerformed(evt);
            }
        });

        setupmn.add(offmnit);
        membertypemnit.setText("Member Type");
        membertypemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membertypemnitActionPerformed(evt);
            }
        });

        setupmn.add(membertypemnit);
        staffmn.setText("Staff");
        employmttermsmnit.setText("Employment terms");
        employmttermsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employmttermsmnitActionPerformed(evt);
            }
        });

        staffmn.add(employmttermsmnit);
        staffdetailsmnit.setText("Staff Details");
        staffdetailsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffdetailsmnitActionPerformed(evt);
            }
        });

        staffmn.add(staffdetailsmnit);
        setupmn.add(staffmn);
        setupmn.add(jSeparator3);
        sharetypesmnit.setText("Type of Shares");
        sharetypesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharetypesmnitActionPerformed(evt);
            }
        });

        setupmn.add(sharetypesmnit);
        loansbmn.setText("Loan Settings..");
        loansecmnit.setText("Loan Security");
        loansecmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansecmnitActionPerformed(evt);
            }
        });

        loansbmn.add(loansecmnit);
        loansmnit.setText("Loans");
        loansmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansmnitActionPerformed(evt);
            }
        });

        loansbmn.add(loansmnit);
        loanpurpmnit.setText("Loan Purpose");
        loanpurpmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanpurpmnitActionPerformed(evt);
            }
        });

        loansbmn.add(loanpurpmnit);
        deferejmnit.setText("Loan Reject/Defer");
        deferejmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deferejmnitActionPerformed(evt);
            }
        });

        loansbmn.add(deferejmnit);
        loanmaxmnit.setText("Max. Loan Setup");
        loanmaxmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanmaxmnitActionPerformed(evt);
            }
        });

        loansbmn.add(loanmaxmnit);
        setupmn.add(loansbmn);
        actvintfr.setText("Accounts Setup");
        actvintfr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actvintfrActionPerformed(evt);
            }
        });

        setupmn.add(actvintfr);
        propertysetupmnit.setText("Property Setup");
        propertysetupmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertysetupmnitActionPerformed(evt);
            }
        });

        setupmn.add(propertysetupmnit);
        commismnit.setText("Calculating Parameters");
        commismnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commismnitActionPerformed(evt);
            }
        });

        setupmn.add(commismnit);
        setupmn.add(jSeparator4);
        depreciationmn.setText("Depreciation");
        depreciationmnit.setText("Depreciation");
        depreciationmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depreciationmnitActionPerformed(evt);
            }
        });

        depreciationmn.add(depreciationmnit);
        depreciationmethodmnit.setText("Depreciation Methods");
        depreciationmethodmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depreciationmethodmnitActionPerformed(evt);
            }
        });

        depreciationmn.add(depreciationmethodmnit);
        setupmn.add(depreciationmn);
        repomnit.setText("Reports setup");
        repomnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repomnitActionPerformed(evt);
            }
        });

        setupmn.add(repomnit);
        sharescontribmnit.setMnemonic('x');
        sharescontribmnit.setText("Minimum Shares");
        sharescontribmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharescontribmnitActionPerformed(evt);
            }
        });

        setupmn.add(sharescontribmnit);
        bbfsetupsmn.setText("BBF Setups");
        benefitsdefinemnit.setText("BBF Benefits");
        benefitsdefinemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benefitsdefinemnitActionPerformed(evt);
            }
        });

        bbfsetupsmn.add(benefitsdefinemnit);
        refundsetupsmnit.setText("BBF Refunds");
        refundsetupsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundsetupsmnitActionPerformed(evt);
            }
        });

        bbfsetupsmn.add(refundsetupsmnit);
        setupmn.add(bbfsetupsmn);
        adjustdedmnit.setText("Deduction Adjustments");
        adjustdedmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjustdedmnitActionPerformed(evt);
            }
        });

        setupmn.add(adjustdedmnit);
        schememn.setText("Payer/Schemes");
        schemeprovmnit.setText("Payer/Debtors");
        schemeprovmnit.setToolTipText("");
        schemeprovmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schemeprovmnitActionPerformed(evt);
            }
        });

        schememn.add(schemeprovmnit);
        schemeregmnit.setText("Schemes Registration");
        schemeregmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schemeregmnitActionPerformed(evt);
            }
        });

        schememn.add(schemeregmnit);
        schemeallmnit.setText("Scheme Membership Register");
        schemeallmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schemeallmnitActionPerformed(evt);
            }
        });

        schememn.add(schemeallmnit);
        suspschemepovmnit.setText("Suspend Payer/Debtors");
        suspschemepovmnit.setToolTipText("");
        suspschemepovmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspschemepovmnitActionPerformed(evt);
            }
        });

        schememn.add(suspschemepovmnit);
        suspschememnit.setText("Scheme Management");
        suspschememnit.setToolTipText("");
        suspschememnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspschememnitActionPerformed(evt);
            }
        });

        schememn.add(suspschememnit);
        setupmn.add(schememn);
        usersmnit.setText("User Profiles");
        usersmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersmnitActionPerformed(evt);
            }
        });

        setupmn.add(usersmnit);
        setupmn.add(jSeparator9);
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        setupmn.add(exit);
        jMenuBar1.add(setupmn);
        processingmn.setText("Processing");
        membmnit1.setText("Member Registry");
        membmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membmnit1ActionPerformed(evt);
            }
        });

        processingmn.add(membmnit1);
        saccomnit.setText("Opening balances");
        saccomnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saccomnitActionPerformed(evt);
            }
        });

        processingmn.add(saccomnit);
        recvallocformmnit.setText("Receive Allocation Form");
        recvallocformmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recvallocformmnitActionPerformed(evt);
            }
        });

        processingmn.add(recvallocformmnit);
        processparmnit.setText("Process Monthly Deductions");
        processparmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processparmnitActionPerformed(evt);
            }
        });

        processingmn.add(processparmnit);
        approveinvmnit.setText("Allocate Payments");
        approveinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveinvmnitActionPerformed(evt);
            }
        });

        processingmn.add(approveinvmnit);
        refundmn.setText("Refunds");
        sharesrefmnit.setText("Withdrawals/Shares Refund");
        sharesrefmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharesrefmnitActionPerformed(evt);
            }
        });

        refundmn.add(sharesrefmnit);
        deductionRefundsmnit.setText("Deduction Refunds");
        deductionRefundsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deductionRefundsmnitActionPerformed(evt);
            }
        });

        refundmn.add(deductionRefundsmnit);
        processingmn.add(refundmn);
        loanprssmn.setText("Loans");
        loanappmnit.setText("Loan Applications");
        loanappmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanappmnitActionPerformed(evt);
            }
        });

        loanprssmn.add(loanappmnit);
        loanapprvmnit.setText("Loan Approval");
        loanapprvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanapprvmnitActionPerformed(evt);
            }
        });

        loanprssmn.add(loanapprvmnit);
        loansprmnit.setText("Loan Disbursement");
        loansprmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansprmnitActionPerformed(evt);
            }
        });

        loanprssmn.add(loansprmnit);
        sharrcptmnit1.setText("Other Loan Receipts");
        sharrcptmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharrcptmnit1ActionPerformed(evt);
            }
        });

        loanprssmn.add(sharrcptmnit1);
        loanoffsetmnit.setText("Loan offset by shares");
        loanoffsetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanoffsetmnitActionPerformed(evt);
            }
        });

        loanprssmn.add(loanoffsetmnit);
        processingmn.add(loanprssmn);
        sharetransmn.setText("Share Operations");
        otherSharerecptsmnit.setText("Other Share Receipts");
        otherSharerecptsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherSharerecptsmnitActionPerformed(evt);
            }
        });

        sharetransmn.add(otherSharerecptsmnit);
        convertRfd2Sharemnit.setText("Convert Refund to Shares");
        convertRfd2Sharemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertRfd2SharemnitActionPerformed(evt);
            }
        });

        sharetransmn.add(convertRfd2Sharemnit);
        processingmn.add(sharetransmn);
        jMenuBar1.add(processingmn);
        bbfOperationsmn.setText("BBF Operations");
        mbrregmnit.setText("Member Registration");
        mbrregmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbrregmnitActionPerformed(evt);
            }
        });

        bbfOperationsmn.add(mbrregmnit);
        bbfopeningbalancemnit11.setText("BBF Opening Balances");
        bbfopeningbalancemnit11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbfopeningbalancemnit11ActionPerformed(evt);
            }
        });

        bbfOperationsmn.add(bbfopeningbalancemnit11);
        bbfdedadjmnit.setText("Month Ded Adjustments");
        bbfdedadjmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbfdedadjmnitActionPerformed(evt);
            }
        });

        bbfOperationsmn.add(bbfdedadjmnit);
        processparmnit111.setText("Process BBF");
        processparmnit111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processparmnit111ActionPerformed(evt);
            }
        });

        bbfOperationsmn.add(processparmnit111);
        allocatebbfbbfmnit11.setText("Allocate BBF Payments");
        allocatebbfbbfmnit11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocatebbfbbfmnit11ActionPerformed(evt);
            }
        });

        bbfOperationsmn.add(allocatebbfbbfmnit11);
        bbfrefundsmnit11.setText("BBF Refunds");
        bbfrefundsmnit11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbfrefundsmnit11ActionPerformed(evt);
            }
        });

        bbfOperationsmn.add(bbfrefundsmnit11);
        jMenuBar1.add(bbfOperationsmn);
        gledgermn.setText("GLedger");
        cashbkmn.setText("Cash Book");
        otherrecptmnit.setText("Receipts");
        otherrecptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherrecptmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(otherrecptmnit);
        raisevouchmnit.setText("Raise Voucher");
        raisevouchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raisevouchmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(raisevouchmnit);
        approvevouchmnit.setText("Approve Voucher");
        approvevouchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvevouchmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(approvevouchmnit);
        otherprmnit.setText("Payments");
        otherprmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherprmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(otherprmnit);
        bankingmnit.setText("Banking");
        bankingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankingmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(bankingmnit);
        bankreconcmnit.setText("Bank Reconciliation");
        bankreconcmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankreconcmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(bankreconcmnit);
        cahflowmngmnit.setText("CashFlow Management");
        cahflowmngmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cahflowmngmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(cahflowmngmnit);
        gledgermn.add(cashbkmn);
        jrnloansmnit.setText("Journal");
        jrnloansmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrnloansmnitActionPerformed(evt);
            }
        });

        gledgermn.add(jrnloansmnit);
        resetcodesmnit.setText("Reset Codes");
        resetcodesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetcodesmnitActionPerformed(evt);
            }
        });

        gledgermn.add(resetcodesmnit);
        currtransmn.setText("Currency Translation");
        usdollarmnit.setText("US Dollars");
        usdollarmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usdollarmnitActionPerformed(evt);
            }
        });

        currtransmn.add(usdollarmnit);
        euromnit.setText("Euro");
        euromnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euromnitActionPerformed(evt);
            }
        });

        currtransmn.add(euromnit);
        gledgermn.add(currtransmn);
        assetmnit.setText("Asset Management");
        gledgermn.add(assetmnit);
        pettycashmn.setMnemonic('C');
        pettycashmn.setText("Cash");
        receivecashmnit.setText("Receive Cash");
        receivecashmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivecashmnitActionPerformed(evt);
            }
        });

        pettycashmn.add(receivecashmnit);
        raisecashVouchmnit.setText("Payment Journal");
        raisecashVouchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raisecashVouchmnitActionPerformed(evt);
            }
        });

        pettycashmn.add(raisecashVouchmnit);
        payvouchermnit.setText("Journal Approval");
        payvouchermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payvouchermnitActionPerformed(evt);
            }
        });

        pettycashmn.add(payvouchermnit);
        printvouchermnit.setText("Print Voucher");
        pettycashmn.add(printvouchermnit);
        gledgermn.add(pettycashmn);
        jMenuBar1.add(gledgermn);
        reportsmn.setText("Reports");
        mreportsmn.setText("Member Reports");
        memberListsmn.setText("Lists");
        memberListmnit.setText("All Members List");
        memberListmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberListmnitActionPerformed(evt);
            }
        });

        memberListsmn.add(memberListmnit);
        activeMemberListmnit.setText("Active Members List");
        activeMemberListmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeMemberListmnitActionPerformed(evt);
            }
        });

        memberListsmn.add(activeMemberListmnit);
        newmembrptmnit.setText("New Members");
        newmembrptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newmembrptmnitActionPerformed(evt);
            }
        });

        memberListsmn.add(newmembrptmnit);
        MemberDetailsmnit.setText("Individual Member Details");
        MemberDetailsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberDetailsmnitActionPerformed(evt);
            }
        });

        memberListsmn.add(MemberDetailsmnit);
        mreportsmn.add(memberListsmn);
        withdrawalmn.setText("Withdrawals");
        withdrawalmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawalmnActionPerformed(evt);
            }
        });

        allMbrWithdrawalmnit.setText("Withdrawal General");
        allMbrWithdrawalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMbrWithdrawalmnitActionPerformed(evt);
            }
        });

        withdrawalmn.add(allMbrWithdrawalmnit);
        mbrResignbyReasonmnit.setText("Member Resignation by Reason");
        mbrResignbyReasonmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbrResignbyReasonmnitActionPerformed(evt);
            }
        });

        withdrawalmn.add(mbrResignbyReasonmnit);
        withdrawalByReasonmnit.setText("Withdrawal per member");
        withdrawalByReasonmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawalByReasonmnitActionPerformed(evt);
            }
        });

        withdrawalmn.add(withdrawalByReasonmnit);
        mreportsmn.add(withdrawalmn);
        memberstatementnmit.setText("Member Transactions");
        memberstatementnmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberstatementnmitActionPerformed(evt);
            }
        });

        mreportsmn.add(memberstatementnmit);
        openingbalmnit.setText("Opening balances");
        openingbalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openingbalmnitActionPerformed(evt);
            }
        });

        mreportsmn.add(openingbalmnit);
        reportsmn.add(mreportsmn);
        sharesmn1mn.setText("Shares");
        sharetransmnit.setText("Member Shares List");
        sharetransmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharetransmnitActionPerformed(evt);
            }
        });

        sharesmn1mn.add(sharetransmnit);
        MemberBalmnit1.setText("Member Share transactions");
        MemberBalmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberBalmnit1ActionPerformed(evt);
            }
        });

        sharesmn1mn.add(MemberBalmnit1);
        sharesrfdmnit.setText("Loan Offset By Shares");
        sharesrfdmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharesrfdmnitActionPerformed(evt);
            }
        });

        sharesmn1mn.add(sharesrfdmnit);
        detMemberSaremnit.setText("Detailed member shares statement");
        detMemberSaremnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detMemberSaremnitActionPerformed(evt);
            }
        });

        sharesmn1mn.add(detMemberSaremnit);
        reportsmn.add(sharesmn1mn);
        loanrepmn.setText("Loan Reports");
        MemberStmtmnit.setText("Detailed active loan statement");
        MemberStmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberStmtmnitActionPerformed(evt);
            }
        });

        loanrepmn.add(MemberStmtmnit);
        approvedloansmnit.setText("Approved Loans");
        approvedloansmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedloansmnitActionPerformed(evt);
            }
        });

        loanrepmn.add(approvedloansmnit);
        loantransmnit.setText("Loan transactions");
        loantransmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loantransmnitActionPerformed(evt);
            }
        });

        loanrepmn.add(loantransmnit);
        listloansappliedmnit.setText("List Of Loans Applied For");
        listloansappliedmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listloansappliedmnitActionPerformed(evt);
            }
        });

        loanrepmn.add(listloansappliedmnit);
        loanawaitapprmnit.setText("Loan Awaiting Approval");
        loanawaitapprmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanawaitapprmnitActionPerformed(evt);
            }
        });

        loanrepmn.add(loanawaitapprmnit);
        loansecguarmnit.setText("Loan Security Guarantors");
        loansecguarmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansecguarmnitActionPerformed(evt);
            }
        });

        loanrepmn.add(loansecguarmnit);
        loansecguarsammrymnit.setText("Guarantors in Summary");
        loansecguarsammrymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansecguarsammrymnitActionPerformed(evt);
            }
        });

        loanrepmn.add(loansecguarsammrymnit);
        loaninarreasmnit.setText("Loan in arrears");
        loaninarreasmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaninarreasmnitActionPerformed(evt);
            }
        });

        loanrepmn.add(loaninarreasmnit);
        reportsmn.add(loanrepmn);
        deductionsmn.setText("Deductions");
        mbrnotdeductesmnit.setText("Under-deductions");
        mbrnotdeductesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbrnotdeductesmnitActionPerformed(evt);
            }
        });

        deductionsmn.add(mbrnotdeductesmnit);
        allOverDedmnit.setText("Over-deduction Totals");
        allOverDedmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allOverDedmnitActionPerformed(evt);
            }
        });

        deductionsmn.add(allOverDedmnit);
        overdeductedmbrsmnit.setText("Detailed Over-deductions");
        overdeductedmbrsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overdeductedmbrsmnitActionPerformed(evt);
            }
        });

        deductionsmn.add(overdeductedmbrsmnit);
        overdeductionrfdmnit.setText("Overdeduction refunds");
        overdeductionrfdmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overdeductionrfdmnitActionPerformed(evt);
            }
        });

        deductionsmn.add(overdeductionrfdmnit);
        reportsmn.add(deductionsmn);
        saccoearningsmn.setText("Sacco Earnings");
        detailedEarningStmtmnit.setText("Detailed Earning Statement");
        detailedEarningStmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailedEarningStmtmnitActionPerformed(evt);
            }
        });

        saccoearningsmn.add(detailedEarningStmtmnit);
        allsaccoearningsmnit.setText("All Sacco Earnings");
        allsaccoearningsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allsaccoearningsmnitActionPerformed(evt);
            }
        });

        saccoearningsmn.add(allsaccoearningsmnit);
        earningspeMembermnit.setText("Earnings Per Member");
        earningspeMembermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earningspeMembermnitActionPerformed(evt);
            }
        });

        saccoearningsmn.add(earningspeMembermnit);
        interestpaidmnit1.setText("Interest Paid");
        interestpaidmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestpaidmnit1ActionPerformed(evt);
            }
        });

        saccoearningsmn.add(interestpaidmnit1);
        dividedpaidmnit1.setText("Divided Paid");
        dividedpaidmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividedpaidmnit1ActionPerformed(evt);
            }
        });

        saccoearningsmn.add(dividedpaidmnit1);
        dividlistmnit1.setText("Dividend List");
        dividlistmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividlistmnit1ActionPerformed(evt);
            }
        });

        saccoearningsmn.add(dividlistmnit1);
        sinkingfundmnit.setText("Sinking Fund");
        saccoearningsmn.add(sinkingfundmnit);
        sinkingpermembermnit.setText("Sinking Fund Per Member");
        saccoearningsmn.add(sinkingpermembermnit);
        loanintrmnit1.setText("Loan Interest Paid");
        loanintrmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanintrmnit1ActionPerformed(evt);
            }
        });

        saccoearningsmn.add(loanintrmnit1);
        reportsmn.add(saccoearningsmn);
        dataSheetmn.setText("Data Sheet");
        dataSheetmnit.setText("Loan Datasheet");
        dataSheetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSheetmnitActionPerformed(evt);
            }
        });

        dataSheetmn.add(dataSheetmnit);
        newMbrDtaSheetmnit.setText("New Member Date Sheet");
        newMbrDtaSheetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMbrDtaSheetmnitActionPerformed(evt);
            }
        });

        dataSheetmn.add(newMbrDtaSheetmnit);
        mbrnotpayingloanmnit.setText("Members not paying(Loan)");
        mbrnotpayingloanmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbrnotpayingloanmnitActionPerformed(evt);
            }
        });

        dataSheetmn.add(mbrnotpayingloanmnit);
        reportsmn.add(dataSheetmn);
        allocationmn.setText("Allocations");
        allocationmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocationmnActionPerformed(evt);
            }
        });

        allocsummnit.setText("Allocation Summary");
        allocsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocsummnitActionPerformed(evt);
            }
        });

        allocationmn.add(allocsummnit);
        unallocpymmnit.setText("Unallocated Forms");
        unallocpymmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unallocpymmnitActionPerformed(evt);
            }
        });

        allocationmn.add(unallocpymmnit);
        invwithbalmnit.setText("Forms With Balances");
        invwithbalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invwithbalmnitActionPerformed(evt);
            }
        });

        allocationmn.add(invwithbalmnit);
        allocsummperdebtmnit.setText("Allocation Summary Per Debtor");
        allocsummperdebtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocsummperdebtmnitActionPerformed(evt);
            }
        });

        allocationmn.add(allocsummperdebtmnit);
        allocsumnit.setText("Allocation Detailed");
        allocsumnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocsumnitActionPerformed(evt);
            }
        });

        allocationmn.add(allocsumnit);
        allocchqmnit.setText("Allocation By Form");
        allocchqmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocchqmnitActionPerformed(evt);
            }
        });

        allocationmn.add(allocchqmnit);
        reportsmn.add(allocationmn);
        bbfreportsmn.setText("BBF reports");
        bbfmembersmnit.setText("BBF members");
        bbfmembersmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbfmembersmnitActionPerformed(evt);
            }
        });

        bbfreportsmn.add(bbfmembersmnit);
        bbfmembertransmnit.setText("BBF Transactions(All)");
        bbfmembertransmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbfmembertransmnitActionPerformed(evt);
            }
        });

        bbfreportsmn.add(bbfmembertransmnit);
        totalbbfcontributionmnit.setText("All Member Contributions");
        totalbbfcontributionmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbbfcontributionmnitActionPerformed(evt);
            }
        });

        bbfreportsmn.add(totalbbfcontributionmnit);
        bbfmbrtranamnit.setText("BBF Transactions(Detailed)");
        bbfmbrtranamnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbfmbrtranamnitActionPerformed(evt);
            }
        });

        bbfreportsmn.add(bbfmbrtranamnit);
        allMbrrefunnMnit.setText("BBF Refunds(All)");
        allMbrrefunnMnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMbrrefunnMnitActionPerformed(evt);
            }
        });

        bbfreportsmn.add(allMbrrefunnMnit);
        memberrfdsmnit.setText("Members Refunded");
        bbfreportsmn.add(memberrfdsmnit);
        individualrfdsmnit.setText("Refund Per Member");
        bbfreportsmn.add(individualrfdsmnit);
        reportsmn.add(bbfreportsmn);
        jMenuBar1.add(reportsmn);
        lnfmn.setText("Feel");
        swinglnfmnit1.setText("Metal");
        buttonGroup2.add(swinglnfmnit1);
        swinglnfmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swinglnfmnit1ActionPerformed(evt);
            }
        });

        lnfmn.add(swinglnfmnit1);
        winlnfmnit1.setText("Windows");
        buttonGroup2.add(winlnfmnit1);
        winlnfmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winlnfmnit1ActionPerformed(evt);
            }
        });

        lnfmn.add(winlnfmnit1);
        motiflnfmnit1.setText("Motif");
        buttonGroup2.add(motiflnfmnit1);
        motiflnfmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motiflnfmnit1ActionPerformed(evt);
            }
        });

        lnfmn.add(motiflnfmnit1);
        macmnit1.setText("Mac OS");
        buttonGroup2.add(macmnit1);
        macmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macmnit1ActionPerformed(evt);
            }
        });

        lnfmn.add(macmnit1);
        skinmn.setText("Themes");
        skinmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skinmnActionPerformed(evt);
            }
        });

        xpmnit1.setText("XP Luna");
        buttonGroup3.add(xpmnit1);
        xpmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xpmnit1ActionPerformed(evt);
            }
        });

        skinmn.add(xpmnit1);
        macos1mnit1.setText("Macintosh");
        buttonGroup3.add(macos1mnit1);
        macos1mnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macos1mnit1ActionPerformed(evt);
            }
        });

        skinmn.add(macos1mnit1);
        whiltmnit1.setText("Whistler");
        buttonGroup3.add(whiltmnit1);
        whiltmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiltmnit1ActionPerformed(evt);
            }
        });

        skinmn.add(whiltmnit1);
        modernmnit1.setText("Modern");
        buttonGroup3.add(modernmnit1);
        modernmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modernmnit1ActionPerformed(evt);
            }
        });

        skinmn.add(modernmnit1);
        aquamnit1.setText("Aqua");
        buttonGroup3.add(aquamnit1);
        aquamnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquamnit1ActionPerformed(evt);
            }
        });

        skinmn.add(aquamnit1);
        beosmnit1.setText("BEOS");
        buttonGroup3.add(beosmnit1);
        beosmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beosmnit1ActionPerformed(evt);
            }
        });

        skinmn.add(beosmnit1);
        bbjmnit11.setText("BBJ");
        buttonGroup3.add(bbjmnit11);
        bbjmnit11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbjmnit11ActionPerformed(evt);
            }
        });

        skinmn.add(bbjmnit11);
        lnfmn.add(skinmn);
        jMenuBar1.add(lnfmn);
        utilitymn.setText("Utility");
        utilitymn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilitymnActionPerformed(evt);
            }
        });

        opbalmnit.setText("Opening Balance");
        opbalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opbalmnitActionPerformed(evt);
            }
        });

        utilitymn.add(opbalmnit);
        dailyrtmnit.setText("Dairy  Routine");
        utilitymn.add(dailyrtmnit);
        cpactdatamnit.setText("Compact Data");
        cpactdatamnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpactdatamnitActionPerformed(evt);
            }
        });

        utilitymn.add(cpactdatamnit);
        validatamnit.setText("Validate Data");
        validatamnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validatamnitActionPerformed(evt);
            }
        });

        utilitymn.add(validatamnit);
        bkupmnit.setText("Back Up");
        bkupmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkupmnitActionPerformed(evt);
            }
        });

        utilitymn.add(bkupmnit);
        optimdbmnit.setText("Database Optimization");
        optimdbmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optimdbmnitActionPerformed(evt);
            }
        });

        utilitymn.add(optimdbmnit);
        monthlymn.setText("Monthly Routine");
        monthlymn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlymnActionPerformed(evt);
            }
        });

        lnintrestmnit.setText("Loan Interest Calculation");
        lnintrestmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnintrestmnitActionPerformed(evt);
            }
        });

        monthlymn.add(lnintrestmnit);
        clsacctmnit.setText("Close Account");
        clsacctmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsacctmnitActionPerformed(evt);
            }
        });

        monthlymn.add(clsacctmnit);
        utilitymn.add(monthlymn);
        yrroutinemn.setText("Yearly Routine");
        divdedcalcmnit.setText("Divided Calculations");
        yrroutinemn.add(divdedcalcmnit);
        deposintmnit.setText("Deposit Interest Calculation");
        yrroutinemn.add(deposintmnit);
        yclsacctmnit.setText("Closing Accounts");
        yclsacctmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yclsacctmnitActionPerformed(evt);
            }
        });

        yrroutinemn.add(yclsacctmnit);
        divdcapitmnit.setText("Divided Capitalisation");
        yrroutinemn.add(divdcapitmnit);
        interestcapmnit.setText("Interest Capitalisation");
        yrroutinemn.add(interestcapmnit);
        utilitymn.add(yrroutinemn);
        dividcaptmnit.setText("Divided Capitalisation");
        utilitymn.add(dividcaptmnit);
        utilitymn.add(jSeparator10);
        chgpasswdmnit.setText("Change Password");
        chgpasswdmnit.setToolTipText("Click to change your existing password.");
        chgpasswdmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpasswdmnitActionPerformed(evt);
            }
        });

        utilitymn.add(chgpasswdmnit);
        updatedomainsmnit.setText("Update Domains");
        updatedomainsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedomainsmnitActionPerformed(evt);
            }
        });

        utilitymn.add(updatedomainsmnit);
        restoredatamnit.setText("Restore Data");
        utilitymn.add(restoredatamnit);
        hlpsetsmnit.setText("Depreciation");
        hlpsetsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlpsetsmnitActionPerformed(evt);
            }
        });

        utilitymn.add(hlpsetsmnit);
        setaccperiodmnit.setText("Set Accounting Period");
        setaccperiodmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaccperiodmnitActionPerformed(evt);
            }
        });

        utilitymn.add(setaccperiodmnit);
        mbVerifymnit.setText("Verify Member Details");
        mbVerifymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbVerifymnitActionPerformed(evt);
            }
        });

        utilitymn.add(mbVerifymnit);
        jMenuBar1.add(utilitymn);
        helpmn.setText("Help");
        helpmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpmnActionPerformed(evt);
            }
        });

        hlpcontmnit.setText("Help TOC");
        helpmn.add(hlpcontmnit);
        aboutmn.setText("About ");
        aboutmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutmnActionPerformed(evt);
            }
        });

        helpmn.add(aboutmn);
        jMenuBar1.add(helpmn);
        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 767, 300);
    }//GEN-END:initComponents

    private void helpmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpmnActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_helpmnActionPerformed

    private void membmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membmnit1ActionPerformed
javax.swing.JInternalFrame memb = new Membersintfr(connectDB,pConnDB);
        saccopn.add(memb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            memb.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_membmnit1ActionPerformed

    private void bbfdedadjmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbfdedadjmnitActionPerformed
 com.afrisoftech.sacco.DedAdjustmentsIntfr prod = new com.afrisoftech.sacco.DedAdjustmentsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}           // Add your handling code here:
    }//GEN-LAST:event_bbfdedadjmnitActionPerformed

    private void bbfopeningbalancemnit11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbfopeningbalancemnit11ActionPerformed
com.afrisoftech.sacco.BBFOpeninBalIntfr prod = new com.afrisoftech.sacco.BBFOpeninBalIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}          // Add your handling code here:
    }//GEN-LAST:event_bbfopeningbalancemnit11ActionPerformed

    private void allocatebbfbbfmnit11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocatebbfbbfmnit11ActionPerformed
com.afrisoftech.sacco.AllocateBBFDedIntfr prod = new com.afrisoftech.sacco.AllocateBBFDedIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}             // Add your handling code here:
    }//GEN-LAST:event_allocatebbfbbfmnit11ActionPerformed

    private void bbfrefundsmnit11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbfrefundsmnit11ActionPerformed
com.afrisoftech.sacco.BBFRefundintfr prod = new com.afrisoftech.sacco.BBFRefundintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}             // Add your handling code here:
    }//GEN-LAST:event_bbfrefundsmnit11ActionPerformed

    private void processparmnit111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processparmnit111ActionPerformed
com.afrisoftech.sacco.ProcesBBFDedIntfr prod = new com.afrisoftech.sacco.ProcesBBFDedIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}           // Add your handling code here:
    }//GEN-LAST:event_processparmnit111ActionPerformed

    private void mbrregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbrregmnitActionPerformed
       javax.swing.JInternalFrame memb = new Membersintfr(connectDB,pConnDB);
        saccopn.add(memb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            memb.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_mbrregmnitActionPerformed

    private void allMbrrefunnMnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMbrrefunnMnitActionPerformed
com.afrisoftech.lib.DatePanel7 dates = new com.afrisoftech.lib.DatePanel7(this, true, this.AllBBFResign, connectDB);
        
        dates.setVisible(true);            // Add your handling code here:
    }//GEN-LAST:event_allMbrrefunnMnitActionPerformed

    private void bbfmembertransmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbfmembertransmnitActionPerformed
java.lang.Object[] memNosBBF = null;
        
        memNosBBF = this.getMemberNoBBF();
        
        System.out.println(memNosBBF);
        
        java.lang.Object memObjBBF = javax.swing.JOptionPane.showInputDialog(this, "Please enter Member TSC No.", "Process Member Details", javax.swing.JOptionPane.OK_CANCEL_OPTION, imgIcon, memNosBBF, memNosBBF[0]);
        
        java.lang.String membNoBBF = memObjBBF.toString();
        
        com.afrisoftech.sacco.BBFAllMbrSharesPdf mBalance = new com.afrisoftech.sacco.BBFAllMbrSharesPdf();
        
        mBalance.BBFAllMbrSharesPdf(membNoBBF, connectDB);         // Add your handling code here:
    }//GEN-LAST:event_bbfmembertransmnitActionPerformed

    private void totalbbfcontributionmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbbfcontributionmnitActionPerformed
 BBFSharesListingPdf policy = new BBFSharesListingPdf();
        policy.BBFSharesListingPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_totalbbfcontributionmnitActionPerformed

    private void bbfmbrtranamnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbfmbrtranamnitActionPerformed
    
        com.afrisoftech.lib.BBFSelectDatePanel dates = new com.afrisoftech.lib.BBFSelectDatePanel(this,pConnDB, true, this.BBFMbrTrans, connectDB);
        
        dates.setVisible(true);
        
        // Add your handling code here:
    }//GEN-LAST:event_bbfmbrtranamnitActionPerformed

    private void mbrnotpayingloanmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbrnotpayingloanmnitActionPerformed
com.afrisoftech.lib.DataSheetTSCDatePanel dates = new com.afrisoftech.lib.DataSheetTSCDatePanel(this, true, this.LoanBalDataSheet, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_mbrnotpayingloanmnitActionPerformed

    private void bbfmembersmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbfmembersmnitActionPerformed
   BBFMembersListPdf policy = new BBFMembersListPdf();
        policy.BBFMembersListPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_bbfmembersmnitActionPerformed

    private void newMbrDtaSheetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMbrDtaSheetmnitActionPerformed
com.afrisoftech.lib.DataSheetTSCDatePanel dates = new com.afrisoftech.lib.DataSheetTSCDatePanel(this, true, this.DataSheetNewMbr, connectDB);
        
        dates.setVisible(true);          // Add your handling code here:
    }//GEN-LAST:event_newMbrDtaSheetmnitActionPerformed

    private void dataSheetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataSheetmnitActionPerformed
com.afrisoftech.lib.DataSheetTSCDatePanel dates = new com.afrisoftech.lib.DataSheetTSCDatePanel(this, true, this.DataSheet, connectDB);
        
        dates.setVisible(true);           // Add your handling code here:
    }//GEN-LAST:event_dataSheetmnitActionPerformed

    private void allOverDedmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allOverDedmnitActionPerformed
 com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.AllMbrOverDed, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_allOverDedmnitActionPerformed

    private void overdeductionrfdmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overdeductionrfdmnitActionPerformed
com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.MbrOverDedRfd, connectDB);
        
        dates.setVisible(true);           // Add your handling code here:
    }//GEN-LAST:event_overdeductionrfdmnitActionPerformed

    private void convertRfd2SharemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertRfd2SharemnitActionPerformed
     javax.swing.JInternalFrame prod = new RefundOffsetIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_convertRfd2SharemnitActionPerformed

    private void otherSharerecptsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherSharerecptsmnitActionPerformed
     javax.swing.JInternalFrame prod = new SharesRcptintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_otherSharerecptsmnitActionPerformed

    private void overdeductedmbrsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overdeductedmbrsmnitActionPerformed
 com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.MbrOverDed, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_overdeductedmbrsmnitActionPerformed

    private void earningspeMembermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earningspeMembermnitActionPerformed
com.afrisoftech.lib.MemberEarningDatePanel dates = new com.afrisoftech.lib.MemberEarningDatePanel(this,pConnDB, true, this.MemberEarnStmt, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_earningspeMembermnitActionPerformed

    private void detailedEarningStmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailedEarningStmtmnitActionPerformed
      com.afrisoftech.lib.EarningBySourcePanel dates = new com.afrisoftech.lib.EarningBySourcePanel(this, true, this.EarningDet, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_detailedEarningStmtmnitActionPerformed

    private void allsaccoearningsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allsaccoearningsmnitActionPerformed
      com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.AllEarnings, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_allsaccoearningsmnitActionPerformed

    private void deductionRefundsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deductionRefundsmnitActionPerformed
       javax.swing.JInternalFrame prod = new RefundDispymtIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_deductionRefundsmnitActionPerformed

    private void activeMemberListmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeMemberListmnitActionPerformed
          ActiveMembersListPdf policy = new ActiveMembersListPdf();
        policy.ActiveMembersListPdf(connectDB); // Add your handling code here:
    }//GEN-LAST:event_activeMemberListmnitActionPerformed

    private void mbrResignbyReasonmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbrResignbyReasonmnitActionPerformed
com.afrisoftech.lib.ResignByReasonPanel dates = new com.afrisoftech.lib.ResignByReasonPanel(this, true, this.ResignByReason, connectDB);
        
        dates.setVisible(true);           // Add your handling code here:
    }//GEN-LAST:event_mbrResignbyReasonmnitActionPerformed

    private void allMbrWithdrawalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMbrWithdrawalmnitActionPerformed
com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.AllResign, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_allMbrWithdrawalmnitActionPerformed

    private void withdrawalmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawalmnActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_withdrawalmnActionPerformed

    private void withdrawalByReasonmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawalByReasonmnitActionPerformed
com.afrisoftech.lib.MemberResDatePanel dates = new com.afrisoftech.lib.MemberResDatePanel(this,pConnDB, true, this.MemberResStmt, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_withdrawalByReasonmnitActionPerformed

    private void detMemberSaremnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detMemberSaremnitActionPerformed
java.lang.Object[] memNos = null;
        
        memNos = this.getMemberNo();
        
        System.out.println(memNos);
        
        java.lang.Object memObj = javax.swing.JOptionPane.showInputDialog(this, "Please enter Member TSC No.", "Process Member Details", javax.swing.JOptionPane.OK_CANCEL_OPTION, imgIcon, memNos, memNos[0]);
        
        java.lang.String membNo = memObj.toString();
        
        com.afrisoftech.sacco.DetMemberSharePdf mBalance = new com.afrisoftech.sacco.DetMemberSharePdf();
        
        mBalance.DetMemberSharePdf(membNo, connectDB);          // Add your handling code here:
    }//GEN-LAST:event_detMemberSaremnitActionPerformed

    private void sharrcptmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharrcptmnit1ActionPerformed
 javax.swing.JInternalFrame prod = new LoanRepaymentIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
                // Add your handling code here:
    }//GEN-LAST:event_sharrcptmnit1ActionPerformed

    private void loanintrmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanintrmnit1ActionPerformed
com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.IntPaid, connectDB);
        
        dates.setVisible(true);           // Add your handling code here:
    }//GEN-LAST:event_loanintrmnit1ActionPerformed

    private void interestpaidmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestpaidmnit1ActionPerformed
InterestPaidPdf policy = new InterestPaidPdf();
        policy.InterestPaidPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_interestpaidmnit1ActionPerformed

    private void dividedpaidmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividedpaidmnit1ActionPerformed
 DividendPaidPdf policy = new DividendPaidPdf();
        policy.DividendPaidPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_dividedpaidmnit1ActionPerformed

    private void dividlistmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividlistmnit1ActionPerformed
 DividendListPdf policy = new DividendListPdf();
        policy.DividendListPdf(connectDB);         // Add your handling code here:
    }//GEN-LAST:event_dividlistmnit1ActionPerformed

    private void memberstatementnmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberstatementnmitActionPerformed
 com.afrisoftech.lib.DatePanel3 dates = new com.afrisoftech.lib.DatePanel3(this,pConnDB, true, this.MemberStmt, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_memberstatementnmitActionPerformed

    private void MemberBalmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberBalmnit1ActionPerformed
 
        java.lang.Object[] memNos = null;
        
        memNos = this.getMemberNo();
        
        System.out.println(memNos);
        
        java.lang.Object memObj = javax.swing.JOptionPane.showInputDialog(this, "Please enter Member TSC No.", "Process Member Details", javax.swing.JOptionPane.OK_CANCEL_OPTION, imgIcon, memNos, memNos[0]);
        
        java.lang.String membNo = memObj.toString();
        
        com.afrisoftech.sacco.MemberBalPdf mBalance = new com.afrisoftech.sacco.MemberBalPdf();
        
        mBalance.MemberBalPdf(membNo, connectDB);        // Add your handling code here:
    }//GEN-LAST:event_MemberBalmnit1ActionPerformed

    private void MemberStmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberStmtmnitActionPerformed
com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.LoanActiveStmt, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_MemberStmtmnitActionPerformed

    private void mbrnotdeductesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbrnotdeductesmnitActionPerformed
      com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.MbrNotPaying, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_mbrnotdeductesmnitActionPerformed

    private void loanoffsetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanoffsetmnitActionPerformed
     com.afrisoftech.sacco.LoanOffsetingIntfr prod = new com.afrisoftech.sacco.LoanOffsetingIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_loanoffsetmnitActionPerformed

    private void loantransmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loantransmnitActionPerformed
com.afrisoftech.lib.HosScemesDatePanel2 dates = new com.afrisoftech.lib.HosScemesDatePanel2(this,pConnDB, true, this.AllLoanStmt, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_loantransmnitActionPerformed

    private void openingbalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openingbalmnitActionPerformed
  OpeningBalPdf policy = new OpeningBalPdf();
        policy.OpeningBalPdf(connectDB); 
        // Add your handling code here:OpeningBalPdf        // Add your handling code here:
    }//GEN-LAST:event_openingbalmnitActionPerformed

    private void allocchqmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocchqmnitActionPerformed
  com.afrisoftech.lib.HosChqsPanel dates = new com.afrisoftech.lib.HosChqsPanel(this,pConnDB, true, this.AllocBychq, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_allocchqmnitActionPerformed

    private void allocsumnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocsumnitActionPerformed
com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.AllocationDetail, connectDB);
        
        dates.setVisible(true);          // Add your handling code here:
    }//GEN-LAST:event_allocsumnitActionPerformed

    private void allocsummperdebtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocsummperdebtmnitActionPerformed
com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.PayerAllocSumm, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_allocsummperdebtmnitActionPerformed

    private void invwithbalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invwithbalmnitActionPerformed
 com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.FinalInvBal, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_invwithbalmnitActionPerformed

    private void allocationmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocationmnActionPerformed
  com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.ScmAllocSumm, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_allocationmnActionPerformed

    private void unallocpymmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unallocpymmnitActionPerformed
  com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.UnAllocSum, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_unallocpymmnitActionPerformed

    private void allocsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocsummnitActionPerformed
 com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.AllocSum, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_allocsummnitActionPerformed

    private void recvallocformmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recvallocformmnitActionPerformed
      com.afrisoftech.sacco.ReceiveAllocFormintfr prod = new com.afrisoftech.sacco.ReceiveAllocFormintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_recvallocformmnitActionPerformed

    private void adjustdedmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjustdedmnitActionPerformed
    com.afrisoftech.sacco.DedAdjustmentsIntfr prod = new com.afrisoftech.sacco.DedAdjustmentsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_adjustdedmnitActionPerformed

    private void refundsetupsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundsetupsmnitActionPerformed
com.afrisoftech.sacco.BbfRefundSetupIntfr prod = new com.afrisoftech.sacco.BbfRefundSetupIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_refundsetupsmnitActionPerformed

    private void benefitsdefinemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benefitsdefinemnitActionPerformed
    com.afrisoftech.sacco.BbfBenefitsSetupIntfr prod = new com.afrisoftech.sacco.BbfBenefitsSetupIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_benefitsdefinemnitActionPerformed

    private void approveinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveinvmnitActionPerformed
  com.afrisoftech.sacco.AllocateSaccoDedIntfr prod = new com.afrisoftech.sacco.AllocateSaccoDedIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_approveinvmnitActionPerformed

    private void processparmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processparmnitActionPerformed
    com.afrisoftech.sacco.ProcesSaccoDedIntfr prod = new com.afrisoftech.sacco.ProcesSaccoDedIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_processparmnitActionPerformed

    private void saccomnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saccomnitActionPerformed
SaccoDeductionsintfr comp = new SaccoDeductionsintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_saccomnitActionPerformed

    private void suspschememnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspschememnitActionPerformed
 CloseSuspSchemeIntfr comp = new CloseSuspSchemeIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_suspschememnitActionPerformed

    private void suspschemepovmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspschemepovmnitActionPerformed
   CloseSuspProvIntfr comp = new CloseSuspProvIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_suspschemepovmnitActionPerformed

    private void schemeallmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemeallmnitActionPerformed
SchemeAlloteesIntfr comp = new  SchemeAlloteesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_schemeallmnitActionPerformed

    private void schemeregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemeregmnitActionPerformed

        SchemesIntfr comp = new SchemesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_schemeregmnitActionPerformed

    private void schemeprovmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemeprovmnitActionPerformed
 HCProviderIntfr comp = new HCProviderIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_schemeprovmnitActionPerformed

    private void sharescontribmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharescontribmnitActionPerformed
 /*   MinimumContributionIntfr comp = new MinimumContributionIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   */   // Add your handling code here:
    }//GEN-LAST:event_sharescontribmnitActionPerformed
    
    private void aboutmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutmnActionPerformed
        AboutBoxintfr comp = new AboutBoxintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_aboutmnActionPerformed
            
    private void sharesrefmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharesrefmnitActionPerformed
        javax.swing.JInternalFrame prod = new SharesRfdintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_sharesrefmnitActionPerformed
                
    private void newmembrptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newmembrptmnitActionPerformed
        com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.NewMemList, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_newmembrptmnitActionPerformed
    
    private void mbVerifymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbVerifymnitActionPerformed
        javax.swing.JInternalFrame comp = new MemberVerifyintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_mbVerifymnitActionPerformed
    
    private void raisecashVouchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raisecashVouchmnitActionPerformed
        javax.swing.JInternalFrame comp = new RaiseCashJournalintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_raisecashVouchmnitActionPerformed
    
    private void payvouchermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payvouchermnitActionPerformed
        javax.swing.JInternalFrame comp = new CashJourAppintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_payvouchermnitActionPerformed
    
    private void receivecashmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivecashmnitActionPerformed
        javax.swing.JInternalFrame comp = new CashReceiptsintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_receivecashmnitActionPerformed
        
    private void setaccperiodmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaccperiodmnitActionPerformed
        javax.swing.JInternalFrame comp = new ChangePeriodintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_setaccperiodmnitActionPerformed
    
    private void yclsacctmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yclsacctmnitActionPerformed
        javax.swing.JInternalFrame comp = new CasbookYearintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_yclsacctmnitActionPerformed
        
    private void cahflowmngmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cahflowmngmnitActionPerformed
        javax.swing.JInternalFrame comp = new CashFlowalintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_cahflowmngmnitActionPerformed
    
    private void approvevouchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvevouchmnitActionPerformed
        javax.swing.JInternalFrame comp = new VoucherApprintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_approvevouchmnitActionPerformed
    
    private void depreciationmethodmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depreciationmethodmnitActionPerformed
        javax.swing.JInternalFrame comp = new DepreciationMethodsintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_depreciationmethodmnitActionPerformed
                
    private void hlpsetsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlpsetsmnitActionPerformed
        float charges = 00;
        float amt = 00;
        String method = null;
        
        try {
            connectDB.setAutoCommit(false);
            java.sql.PreparedStatement pstm = connectDB.prepareStatement("INSERT INTO depreciation_charge (description,buying_price,depreciation_charge,transaction_no,date) SELECT description,amount,amount-amount,transaction_no,date from depreciation_assets_view EXCEPT select description,buying_price,depreciation_charge,transaction_no,date from depreciation_charge");
            pstm.executeUpdate();
            
            
            
           java.sql.Statement pstmt2 = connectDB.createStatement();
            
            java.sql.ResultSet rs2 = pstmt2.executeQuery("select depreciation_method from depreciation_method");
            // java.sql.ResultSet rs1 = pstmt1.executeQuery("select sum(amount) from depreciation_charges");
            
            while (rs2.next()){
                //jTextField4.setText(rs.getObject(1).toString());
                method = rs2.getString(1);
                // System.out.println(amt);
            }
            
            if(method.equals("Straight Line Method")){
                
                
    
                
                   
                java.sql.PreparedStatement pstm4 = connectDB.prepareStatement("INSERT INTO depreciation_charge (description,buying_price,depreciation_charge,transaction_no,date) SELECT description,(amount - amount),amount,transaction_no FROM staightline_calc_view");
                pstm4.executeUpdate();
                
              
                
                
                
                
            }else{
                java.sql.PreparedStatement pstm1 = connectDB.prepareStatement("INSERT INTO depreciation_charge (description,buying_price,depreciation_charge,transaction_no,date) SELECT description,(amount - amount),amount,transaction_no FROM depreciation_calc_view");
                pstm1.executeUpdate();
                
            }
            connectDB.commit();
            connectDB.setAutoCommit(true);
            System.out.println("Successful");
        }   catch(java.sql.SQLException sq){
            javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sq.getMessage());
            try {
                connectDB.rollback();
            }catch (java.sql.SQLException sql){
                javax.swing.JOptionPane.showMessageDialog(this,sql.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        // Add your handling code here:
    }//GEN-LAST:event_hlpsetsmnitActionPerformed
    
    private void depreciationmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depreciationmnitActionPerformed
        javax.swing.JInternalFrame comp = new Depreciationintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){} // Add your handling code here:
    }//GEN-LAST:event_depreciationmnitActionPerformed
    
    private void raisevouchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raisevouchmnitActionPerformed
        javax.swing.JInternalFrame comp = new RaiseVoucherintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){} // Add your handling code here:
    }//GEN-LAST:event_raisevouchmnitActionPerformed
    
    private void propertysetupmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertysetupmnitActionPerformed
        javax.swing.JInternalFrame comp = new PropertySetupintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_propertysetupmnitActionPerformed
    
    private void sharetypesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharetypesmnitActionPerformed
        SharesSetupintfr comp = new SharesSetupintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_sharetypesmnitActionPerformed
            
    private void bankingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankingmnitActionPerformed
        javax.swing.JInternalFrame comp = new Bankingintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_bankingmnitActionPerformed
    
    private void updatedomainsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedomainsmnitActionPerformed
        
        this.domainsReset = true;
        
        this.updateActivityDomains();
        
        this.domainsReset = false;
        
        // Add your handling code here:
    }//GEN-LAST:event_updatedomainsmnitActionPerformed
    
    private void chgpasswdmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpasswdmnitActionPerformed
        com.afrisoftech.lib.ChangePassword chgPasswd = new com.afrisoftech.lib.ChangePassword(this, true, connectDB, psWord);
        
        chgPasswd.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_chgpasswdmnitActionPerformed
                
    private void resetcodesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetcodesmnitActionPerformed
        javax.swing.JFrame lapp = new Activities(connectDB,pConnDB);
        lapp.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_resetcodesmnitActionPerformed
    
    private void validatamnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validatamnitActionPerformed
        
        SampleVacuumDB smpthr_dbcc = new SampleVacuumDB();
        
        
        int dbcc_int =  javax.swing.JOptionPane.showOptionDialog(this, "Are you sure to start the DB Checker?", "System DBCC dialog", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, new java.lang.String[]{"Start DBCC Immediately", "Schedule DBCC Process", "Cancel DBCC Checker"}, "Schedule DBCC Process");
        
        switch (dbcc_int) {
            
            case javax.swing.JOptionPane.YES_OPTION :
                
                smpthr_dbcc.SampleVacuumDB();
                
                break;
                
            case javax.swing.JOptionPane.NO_OPTION :
                
                javax.swing.JOptionPane.showMessageDialog(this, "Not implemented yet!");
                
                break;
                
            case javax.swing.JOptionPane.CANCEL_OPTION :
                
                javax.swing.JOptionPane.showMessageDialog(this, "You have cancelled the DBCC operation");
                
                break;
                
            default : ;;
            
        }
        
        smpthr_dbcc.stop();
        // Add your handling code here:
    }//GEN-LAST:event_validatamnitActionPerformed
    
    private void optimdbmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optimdbmnitActionPerformed
        
        SampleDbOptim smpthr_dboptim = new SampleDbOptim();
        
        
        int dboptim_int =  javax.swing.JOptionPane.showOptionDialog(this, "Are you sure to start the DB Optimizer?", "System DB Optimizer dialog", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, new java.lang.String[]{"Optimize DB  Immediately", "Schedule DB Optimizer", "Cancel Optimizer process"}, "Schedule DB Optimizer");
        
        switch (dboptim_int) {
            
            case javax.swing.JOptionPane.YES_OPTION :
                
                smpthr_dboptim.SampleDbOptim();
                
                break;
                
            case javax.swing.JOptionPane.NO_OPTION :
                
                javax.swing.JOptionPane.showMessageDialog(this, "Not implemented yet!");
                
                break;
                
            case javax.swing.JOptionPane.CANCEL_OPTION :
                
                javax.swing.JOptionPane.showMessageDialog(this, "You have cancelled the DB Optimizer operation");
                
                break;
                
            default : ;;
            
        }
        
        smpthr_dboptim.stop();
        // Add your handling code here:
    }//GEN-LAST:event_optimdbmnitActionPerformed
                
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        int exitOption = javax.swing.JOptionPane.showConfirmDialog(this, "Do you really want to exit application?", "Caution before closing application!", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (exitOption == javax.swing.JOptionPane.YES_OPTION) {
            
            System.exit(0);
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_formWindowClosing
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        int exitOption = javax.swing.JOptionPane.showConfirmDialog(this, "Do you really want to exit application?", "Caution before closing application!", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (exitOption == javax.swing.JOptionPane.YES_OPTION) {
            
            System.exit(0);
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    
    private void jrnloansmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrnloansmnitActionPerformed
        javax.swing.JInternalFrame currint = new Journalsintfr(connectDB, pConnDB);
        saccopn.add(currint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            currint.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}// Add your handling code here:
    }//GEN-LAST:event_jrnloansmnitActionPerformed
    
    private void actvintfrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actvintfrActionPerformed
        javax.swing.JInternalFrame currint = new Activitiesintfr(connectDB,pConnDB);
        saccopn.add(currint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            currint.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_actvintfrActionPerformed
    
    private void clsacctmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsacctmnitActionPerformed
        javax.swing.JInternalFrame comp = new CasbookClosemonthintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_clsacctmnitActionPerformed
        
    private void lnintrestmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnintrestmnitActionPerformed
        javax.swing.JInternalFrame comp = new InterestCalcintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_lnintrestmnitActionPerformed
        
    private void bkupmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkupmnitActionPerformed
        
        SampleThread smpthr_backup = new SampleThread();
        
        
        int backup_int =  javax.swing.JOptionPane.showOptionDialog(this, "Are you sure to start the backup?", "System Backup dialog", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, new java.lang.String[]{"Backup Immediate", "Schedule Backup", "Don't start backup"}, "Schedule Backup");
        
        switch (backup_int) {
            
            case javax.swing.JOptionPane.YES_OPTION :
                
                smpthr_backup.SampleThread();
                
                break;
                
            case javax.swing.JOptionPane.NO_OPTION :
                
                javax.swing.JOptionPane.showMessageDialog(this, "Not implemented yet!");
                
                break;
                
            case javax.swing.JOptionPane.CANCEL_OPTION :
                
                javax.swing.JOptionPane.showMessageDialog(this, "You have cancelled the backup operation");
                
                break;
                
            default : ;;
            
        }
        
        smpthr_backup.stop();
        
        // Add your handling code here:
    }//GEN-LAST:event_bkupmnitActionPerformed
    
    private void bankreconcmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankreconcmnitActionPerformed
        javax.swing.JInternalFrame comp = new BankReconintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
        comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        
        // Add your handling code here:
    }//GEN-LAST:event_bankreconcmnitActionPerformed
    
    private void euromnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euromnitActionPerformed
        
        // Add your handling code here:
    }//GEN-LAST:event_euromnitActionPerformed
    
    private void usdollarmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usdollarmnitActionPerformed
      /* try {
            java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptb set school = (school - ("+jTextField3.getText()+" + "+jTextField12.getText()+")) where m_number = '"+jComboBox1.getSelectedItem()+"';commit work");
            java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; UPDATE cash_book SET debit = round(debit*(select exchange_rate from exchange_rate where currency ='US DOLLAR'),2),credit = round(credit*(select exchange_rate from exchange_rate where currency ='US DOLLAR'),2);commit work");
             pstmt.executeUpdate();
        }   catch(java.sql.SQLException sq){
            System.out.println(sq.getMessage());
       
             }*/   // Add your handling code here:
    }//GEN-LAST:event_usdollarmnitActionPerformed
    
    private void saccopnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_saccopnComponentShown
        // Add your handling code here:
    }//GEN-LAST:event_saccopnComponentShown
        
    private void bbjmnit11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbjmnit11ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "bbjthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/bbjthemepack.zip"));
        // Add your handling code here:
    }//GEN-LAST:event_bbjmnit11ActionPerformed
    
    private void swinglnfmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swinglnfmnit1ActionPerformed
        
        this.changeTheme("javax.swing.plaf.metal.MetalLookAndFeel", null);
        
        // Add your handling code here:
    }//GEN-LAST:event_swinglnfmnit1ActionPerformed
    
    private void winlnfmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winlnfmnit1ActionPerformed
        
        //  System.setProperty("os.name", "Windows");
        
        
        this.changeTheme("com.sun.java.swing.plaf.windows.WindowsLookAndFeel", null);
        
        // Add your handling code here:
    }//GEN-LAST:event_winlnfmnit1ActionPerformed
    
    private void motiflnfmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motiflnfmnit1ActionPerformed
        
        this.changeTheme("com.sun.java.swing.plaf.motif.MotifLookAndFeel", null);
        
        // Add your handling code here:
    }//GEN-LAST:event_motiflnfmnit1ActionPerformed
    
    private void macmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macmnit1ActionPerformed
        
        this.changeTheme("it.unitn.ing.swing.plaf.macos.MacOSLookAndFeel", null);
        
        // Add your handling code here:
    }//GEN-LAST:event_macmnit1ActionPerformed
    
    private void skinmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skinmnActionPerformed
        
        //  this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "xplunathemepack.zip");
        
        // Add your handling code here:
    }//GEN-LAST:event_skinmnActionPerformed
    
    private void beosmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beosmnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "beosthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/beosthemepack.zip"));
        
        // Add your handling code here:
    }//GEN-LAST:event_beosmnit1ActionPerformed
    
    private void aquamnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquamnit1ActionPerformed
        
        //       this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "aquathemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/aquathemepack.zip"));
        
        // Add your handling code here:
    }//GEN-LAST:event_aquamnit1ActionPerformed
    
    private void modernmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modernmnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "modernthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/modernthemepack.zip"));
        
        // Add your handling code here:
    }//GEN-LAST:event_modernmnit1ActionPerformed
    
    private void whiltmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiltmnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "whistlerthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/whistlerthemepack.zip"));
        
        // Add your handling code here:
    }//GEN-LAST:event_whiltmnit1ActionPerformed
    
    private void macos1mnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macos1mnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "macosthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/macosthemepack.zip"));
        
        // Add your handling code here:
    }//GEN-LAST:event_macos1mnit1ActionPerformed
    
    private void xpmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xpmnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "xplunathemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/xplunathemepack.zip"));
        
        // Add your handling code here:
    }//GEN-LAST:event_xpmnit1ActionPerformed
        
    private void cpactdatamnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpactdatamnitActionPerformed
        
        SampleDbCompact smpthr_dbcompact = new SampleDbCompact();
        
        
        int dbcompact_int =  javax.swing.JOptionPane.showOptionDialog(this, "Are you sure to start Compacting the database?", "System DB Compacter dialog", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, new java.lang.String[]{"Compact DB Immediately", "Schedule DB Compacter Process", "Cancel the DB Compacter Process"}, "Schedule DB Compacter Process");
        
        switch (dbcompact_int) {
            
            case javax.swing.JOptionPane.YES_OPTION :
                
                smpthr_dbcompact.SampleDbCompact();
                
                break;
                
            case javax.swing.JOptionPane.NO_OPTION :
                
                javax.swing.JOptionPane.showMessageDialog(this, "Not implemented yet!");
                
                break;
                
            case javax.swing.JOptionPane.CANCEL_OPTION :
                
                javax.swing.JOptionPane.showMessageDialog(this, "You have cancelled the DB Compacter operation");
                
                break;
                
            default : ;;
            
        }
        
        smpthr_dbcompact.stop();
        
        
        // Add your handling code here:
    }//GEN-LAST:event_cpactdatamnitActionPerformed
            
    private void deferejmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deferejmnitActionPerformed
        javax.swing.JInternalFrame comp = new DeferRejectintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_deferejmnitActionPerformed
    
    private void bankssetnitupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankssetnitupActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_bankssetnitupActionPerformed
    
    private void usersmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersmnitActionPerformed
     
        javax.swing.JInternalFrame comp = new Usersetupintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_usersmnitActionPerformed
                        
    private void memberListmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberListmnitActionPerformed
        MemberListPdf policy = new MemberListPdf();
        policy.MemberListPdf(connectDB); // Add your handling code here:
    }//GEN-LAST:event_memberListmnitActionPerformed
    
    private void MemberDetailsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberDetailsmnitActionPerformed
        
        java.lang.Object[] memNos = null;
        
        memNos = this.getMemberNo();
        
        System.out.println(memNos);
        
        java.lang.Object memObj = javax.swing.JOptionPane.showInputDialog(this, "Please enter Member TSC No.", "Process Member Details", javax.swing.JOptionPane.OK_CANCEL_OPTION, imgIcon, memNos, memNos[0]);
        
        java.lang.String membNo = memObj.toString();
        
        com.afrisoftech.sacco.MemberDetailsPdf mdetails = new com.afrisoftech.sacco.MemberDetailsPdf();
        
        mdetails.MemberDetailsPdf(membNo, connectDB);
        
        
        
        
        
     /*   javax.swing.JInternalFrame comp = new mdetailsrepintfr();
         saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
           try {
        comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    */     // Add your handling code here:
    }//GEN-LAST:event_MemberDetailsmnitActionPerformed
    
    private void sharetransmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharetransmnitActionPerformed
       /* com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true,SharesTransactions , connectDB);
        
        dates.setVisible(true);*/
        SharesListingPdf policy = new SharesListingPdf();
        policy.SharesListingPdf(connectDB);
        
        
      /*SharesTransPdf policy = new SharesTransPdf();
             policy.SharesTransPdf(connectDB);   */   // Add your handling code here:
    }//GEN-LAST:event_sharetransmnitActionPerformed
                        
    private void sharesrfdmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharesrfdmnitActionPerformed
      com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.SharesRfd, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_sharesrfdmnitActionPerformed
                
    private void loaninarreasmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaninarreasmnitActionPerformed
        LoanInArreasPdf policy = new LoanInArreasPdf();
        policy.LoanInArreasPdf(connectDB);       // Add your handling code here:
    }//GEN-LAST:event_loaninarreasmnitActionPerformed
    
    private void loansecguarsammrymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansecguarsammrymnitActionPerformed
        LoanSecguarSamPdf policy = new LoanSecguarSamPdf();
        policy.LoanSecguarSamPdf(connectDB); // Add your handling code here:
    }//GEN-LAST:event_loansecguarsammrymnitActionPerformed
    
    private void loansecguarmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansecguarmnitActionPerformed
        java.lang.Object[] memNos = null;
        
        memNos = this.getLoanNo();
        
        System.out.println(memNos);
        
        java.lang.Object memObj = javax.swing.JOptionPane.showInputDialog(this, "Please enter Loan No.", "Process Member Details", javax.swing.JOptionPane.OK_CANCEL_OPTION, imgIcon, memNos, memNos[0]);
        
        java.lang.String membNo = memObj.toString();
        
        com.afrisoftech.sacco.LoanSecGuarPdf mdetails = new com.afrisoftech.sacco.LoanSecGuarPdf();
        
        mdetails.LoanSecGuarPdf(membNo, connectDB);
        
        // Add your handling code here:
    }//GEN-LAST:event_loansecguarmnitActionPerformed
        
    private void loanawaitapprmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanawaitapprmnitActionPerformed
        LoansAwaitingAppPdf policy = new LoansAwaitingAppPdf();
        policy.LoansAwaitingAppPdf(connectDB);       // Add your handling code here:
    }//GEN-LAST:event_loanawaitapprmnitActionPerformed
        
    private void listloansappliedmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listloansappliedmnitActionPerformed
        com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.ListLoansApp, connectDB);
        
        dates.setVisible(true);
        
        // Add your handling code here:
    }//GEN-LAST:event_listloansappliedmnitActionPerformed
    
    private void approvedloansmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedloansmnitActionPerformed
        com.afrisoftech.lib.DatePanel dates = new com.afrisoftech.lib.DatePanel(this, true, this.ApprLoans, connectDB);
        
        dates.setVisible(true);
        
        // Add your handling code here:
    }//GEN-LAST:event_approvedloansmnitActionPerformed
    
    private void otherrecptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherrecptmnitActionPerformed
        javax.swing.JInternalFrame comp = new OtherRecptintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_otherrecptmnitActionPerformed
    
    private void saccopnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saccopnMousePressed
        
        if (evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK){
            
            //         this.jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_saccopnMousePressed
    
    private void monthlymnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlymnActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_monthlymnActionPerformed
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        int exitOption = javax.swing.JOptionPane.showConfirmDialog(this, "Do you really want to exit application?", "Caution before closing application!", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (exitOption == javax.swing.JOptionPane.YES_OPTION) {
            
            System.exit(0);
            
        }
        
        // Add your handling code here:
    }//GEN-LAST:event_exitActionPerformed
    
    private void mtmediaBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtmediaBttnActionPerformed
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        
        try {
            
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                
                rt.exec("kscd");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            else if (System.getProperty("os.name").equalsIgnoreCase("Windows 2000")) {
                
                rt.exec("D:/Program Files/Windows Media Player/mplayer2.exe");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
                
            }
            
            
            
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }         // Add your handling code here:
    }//GEN-LAST:event_mtmediaBttnActionPerformed
    
    private void mailBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailBttnActionPerformed
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        
        try {
            
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                
                rt.exec("kmail");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            else if (System.getProperty("os.name").equalsIgnoreCase("Windows 2000")) {
                
                rt.exec("C:/Program Files/Microsoft Office/Office/outlook");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
                
            }
            
            
            
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }         // Add your handling code here:
    }//GEN-LAST:event_mailBttnActionPerformed
    
    private void editButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtnActionPerformed
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        
        try {
            
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                
                rt.exec("kedit");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            else if (System.getProperty("os.name").equalsIgnoreCase("Windows 2000")) {
                
                rt.exec("C:/Program Files/Microsoft Office/Office/winword.exe");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
                
            }
            
            
            
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }         // Add your handling code here:
    }//GEN-LAST:event_editButtnActionPerformed
    
    private void brwsrBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brwsrBttnActionPerformed
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        
        try {
            
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                
                rt.exec("netscape");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            else if (System.getProperty("os.name").equalsIgnoreCase("Windows 2000")) {
                
                rt.exec("d:/Program Files/Internet Explorer/iexplore.exe");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
                
            }
            
            
            
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }         // Add your handling code here:
    }//GEN-LAST:event_brwsrBttnActionPerformed
    
    private void calcBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBttnActionPerformed
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        
        try {
            
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                
                rt.exec("kcalc");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            else if (System.getProperty("os.name").equalsIgnoreCase("Windows 2000")) {
                
                rt.exec("calc");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
                
            }
            
            
            
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }         // Add your handling code here:
    }//GEN-LAST:event_calcBttnActionPerformed
    
    private void fmgrBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmgrBttnActionPerformed
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        
        try {
            
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                
                rt.exec("konqueror");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            else if (System.getProperty("os.name").equalsIgnoreCase("Windows 2000")) {
                
                rt.exec("explorer");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
                
            }
            
            
            
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }      // Add your handling code here:
    }//GEN-LAST:event_fmgrBttnActionPerformed
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        //      this.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
        
        //   this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        
        // Add your handling code here:
    }//GEN-LAST:event_formComponentShown
    
    private void sharesummmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharesummmnitActionPerformed
        try {
            try {
                try {
                    try{
                        javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                        javax.swing.SwingUtilities.updateComponentTreeUI(this);
                    }catch (javax.swing.UnsupportedLookAndFeelException un){}
                }catch (java.lang.IllegalAccessException il){}
            }catch (java.lang.InstantiationException inst){
                System.out.println("Win Look and feel classes not found");
            } //System.out.println(nf.getMessage());
        }catch (java.lang.ClassNotFoundException nf){}
        
        /* javax.swing.JInternalFrame worst1 = new WorkStation1();
     saccopn.add(worst1, javax.swing.JLayeredPane.DEFAULT_LAYER); */    // Add your handling code here:
    }//GEN-LAST:event_sharesummmnitActionPerformed
    
    private void banksmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banksmnitActionPerformed
        javax.swing.JInternalFrame currint = new Banksintfr(connectDB,pConnDB);
        saccopn.add(currint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            currint.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_banksmnitActionPerformed
    
    private void banhbranchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banhbranchmnitActionPerformed
        javax.swing.JInternalFrame currint = new BankBranchesintfr(connectDB,pConnDB);
        saccopn.add(currint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            currint.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_banhbranchmnitActionPerformed
    
    private void employmttermsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employmttermsmnitActionPerformed
        javax.swing.JInternalFrame currint = new StaffTypintfr(connectDB,pConnDB);
        saccopn.add(currint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            currint.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_employmttermsmnitActionPerformed
    
    private void staffdetailsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffdetailsmnitActionPerformed
        javax.swing.JInternalFrame currint = new Staffintfr(connectDB,pConnDB);
        saccopn.add(currint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            currint.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_staffdetailsmnitActionPerformed
    
    private void loanmaxmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanmaxmnitActionPerformed
        javax.swing.JInternalFrame currint = new LoanMaxsetupintfr(connectDB,pConnDB);
        saccopn.add(currint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            currint.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_loanmaxmnitActionPerformed
    
    private void membertypemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membertypemnitActionPerformed
        javax.swing.JInternalFrame prod = new MemberTypeintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_membertypemnitActionPerformed
    
    private void opbalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opbalmnitActionPerformed
        //javax.swing.JInternalFrame prod = new balancesintfr();
        OpeningBalintfr prod = new OpeningBalintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_opbalmnitActionPerformed
    
    private void utilitymnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilitymnActionPerformed
        //javax.swing.JInternalFrame prod = new balanceintfr();
        //saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        // Add your handling code here:
    }//GEN-LAST:event_utilitymnActionPerformed
    
    private void loanpurpmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanpurpmnitActionPerformed
        javax.swing.JInternalFrame prod = new LoanPurposeintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_loanpurpmnitActionPerformed
    
    private void loansmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansmnitActionPerformed
        javax.swing.JInternalFrame prod = new Loansintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_loansmnitActionPerformed
                
    private void loanapprvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanapprvmnitActionPerformed
        int LoanNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.ResultSet rset = stmt.executeQuery("SELECT COUNT(*) from loan_application WHERE loan_status ='Not Processed'");
            while (rset.next()){
                LoanNo = rset.getInt(1);
            }
        } catch (java.sql.SQLException sqlEx) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlEx.getMessage());
            
        }
        if (LoanNo < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "No pending loan applications to process.");
        } else {
            
            javax.swing.JInternalFrame prod = new LoanApprovintfr(connectDB,pConnDB);
            saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
            
            try {
                prod.setSelected(true);
            } catch(java.beans.PropertyVetoException pvt){}
        }
        // Add your handling code here:
    }//GEN-LAST:event_loanapprvmnitActionPerformed
    
    private void otherprmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherprmnitActionPerformed
        javax.swing.JInternalFrame prod = new OtherPymintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_otherprmnitActionPerformed
    
    private void loansprmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansprmnitActionPerformed
       javax.swing.JInternalFrame prod = new  LoanDisPymntIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        
        
        /*javax.swing.JInternalFrame prod = new  LoanPymntintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
         */
        // Add your handling code here:
    }//GEN-LAST:event_loansprmnitActionPerformed
    
    private void branchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchmnitActionPerformed
        javax.swing.JInternalFrame prod = new  Branchintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_branchmnitActionPerformed
    
    private void workstmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workstmnitActionPerformed
//        javax.swing.JInternalFrame prod = new  WorkStationintfr(connectDB,pConnDB);
//        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
//        try {
//            prod.setSelected(true);
//        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_workstmnitActionPerformed
    
    private void distdivmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distdivmnitActionPerformed
        javax.swing.JInternalFrame prod = new Distrintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_distdivmnitActionPerformed
    
    private void countrymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countrymnitActionPerformed
        javax.swing.JInternalFrame prod = new Countryintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_countrymnitActionPerformed
    
    private void deptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptmnitActionPerformed
        javax.swing.JInternalFrame prod = new Deptintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_deptmnitActionPerformed
    
    private void commismnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commismnitActionPerformed
        javax.swing.JInternalFrame prod = new Commintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_commismnitActionPerformed
    
    private void loanappmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanappmnitActionPerformed
        
        this.setCursor(javax.swing.JFrame.WAIT_CURSOR);
        
        javax.swing.JInternalFrame prod = new LoanApplintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
            this.setCursor(javax.swing.JFrame.DEFAULT_CURSOR);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_loanappmnitActionPerformed
    
    private void loansecmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansecmnitActionPerformed
        javax.swing.JInternalFrame prod = new LoanSecintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_loansecmnitActionPerformed
    
    private void suffmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suffmnitActionPerformed
        javax.swing.JInternalFrame prod = new Suffixintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_suffmnitActionPerformed
    
    private void repomnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repomnitActionPerformed
        javax.swing.JInternalFrame rep = new Reportintfr(connectDB,pConnDB);
        saccopn.add(rep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            rep.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_repomnitActionPerformed
    
    private void offmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offmnitActionPerformed
        javax.swing.JInternalFrame offic = new Offintfr(connectDB,pConnDB);
        saccopn.add(offic, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            offic.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_offmnitActionPerformed
        
    private void companypmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companypmnitActionPerformed
        
        int resOptt =  javax.swing.JOptionPane.showOptionDialog(this, "Do you want to open a new Company ?", "Set Company", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, new java.lang.String[]{"New Company", "Open Existing Company", "Cancel"}, "Open Existing Company");
        
        
        if (resOptt == javax.swing.JOptionPane.YES_OPTION) {
            javax.swing.JInternalFrame dismth = new CompNameintfr(connectDB,pConnDB);
            saccopn.add(dismth, javax.swing.JLayeredPane.DEFAULT_LAYER);
            try {
                dismth.setSelected(true);
            } catch(java.beans.PropertyVetoException pvt){}
            
     
        }
        
        isRunning = true;
        
        java.lang.Thread tread = new java.lang.Thread(this);
        
        tread.start();
        // Add your handling code here:
    }//GEN-LAST:event_companypmnitActionPerformed
    
    /** Exit the Application */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        SaccoMain stockInstance = new SaccoMain(connect2DB(), getPooledConnectionSource(), getPath2Acrobat(), psWord);
        
        stockInstance.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        stockInstance.setVisible(true);
        
    }
    
    public static java.sql.Connection connect2DB() {
        
        java.sql.Connection connDBStock = null;
        
        try {
            
            java.lang.Class.forName("org.postgresql.Driver");
            
        } catch(java.lang.ClassNotFoundException cnf) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), cnf.getMessage());
            
        }
        
        try {
            
            connDBStock = java.sql.DriverManager.getConnection("jdbc:postgresql://192.168.215.105:5432/knut_210106","postgres","pilsiner");
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        return connDBStock;
        
    }
    
   
    public void menuItemsDisabler(java.lang.Object[] menuList2Disable) {
        
        java.lang.reflect.Field[] fieldsArray = null;
        
        javax.swing.JMenuItem disMenuItems = null;
        
        
        try {
            java.lang.Class classMain = java.lang.Class.forName("com.afrisoftech.sacco.SaccoMain");
            
            try {
                
                fieldsArray = classMain.getDeclaredFields();
                
                for (int n = 0; n  < fieldsArray.length; n++) {
                    
                    if (fieldsArray[n].getName().endsWith("mnit")) {
                        
                        disMenuItems = (javax.swing.JMenuItem)fieldsArray[n].get(this);
                        
                        System.out.println(fieldsArray[n].getName()+"\t"+"\t"+"\t"+disMenuItems.getText());
                        
                        
                        disMenuItems.setEnabled(false);
                        
                        for (int m = 0; m < menuList2Disable.length; m++) {
                            
                            if (fieldsArray[n].getName().equals(menuList2Disable[m])) {
                                
                                java.lang.Object obj = (java.lang.Object)fieldsArray[n];
                                
                                try{
                                    
                                    javax.swing.JMenuItem men2dis = (javax.swing.JMenuItem)fieldsArray[n].get(this);
                                    
                                    men2dis.setEnabled(true);
                                    
                                } catch(java.lang.IllegalAccessException illAcc){
                                    
                                    System.out.println(illAcc.getMessage());
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
                
            } catch(java.lang.IllegalAccessException illAcc){
                
                System.out.println(illAcc.getMessage());
                
            }
            
        } catch(java.lang.ClassNotFoundException clsNotFnd){
            
            javax.swing.JOptionPane.showMessageDialog(this, "Class sacco.sacco not found in the classpath");
            
        }
        
    }
    
    public void updateActivityDomains() {
        
        if (domainsReset) {
            
            try {
                
                java.sql.PreparedStatement pstmt_del = this.connectDB.prepareStatement("DELETE FROM menu_item_list");
                
                pstmt_del.execute();
                
            } catch(java.sql.SQLException sqlExec) {
                
                javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                
            }
            
            try {
                
                java.lang.Class classMain = java.lang.Class.forName("com.afrisoftech.sacco.SaccoMain");
                
                java.lang.reflect.Field[] fieldsArray = classMain.getDeclaredFields();
                
                for (int n = 0; n  < fieldsArray.length; n++) {
                    
                    if (fieldsArray[n].getName().endsWith("mnit")) {
                        
                        
                        try {
                            
                            
                            javax.swing.JMenuItem disMenuItems = (javax.swing.JMenuItem)fieldsArray[n].get(this);
                            
                            
                            try {
                                
                                
                                Class.forName("org.postgresql.Driver");
                                
                                
                            } catch (java.lang.ClassNotFoundException cnfExec) {
                                
                                
                                System.out.println("Can't locate PostgreSQL driver");
                                
                                
                            }
                            
                            try {
                                
                                java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into menu_item_list values(?, ?, ?)");
                                
                                System.out.println("Ready to insert menu items");
                                
                                pstmt.setString(1,fieldsArray[n].getName());
                                
                                pstmt.setString(2,disMenuItems.getText());
                                
                                pstmt.setString(3,"sacco_main");
                                
                                pstmt.executeUpdate();
                                
                            } catch(java.sql.SQLException sq){
                                
                                javax.swing.JOptionPane.showMessageDialog(this,sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
                                
                                System.out.println(sq.getMessage());
                                
                            }
                            
                            
                            
                        } catch(java.lang.IllegalAccessException illAcc){
                            
                            System.out.println(illAcc.getMessage());
                            
                        }
                    }
                    
                }
                
            } catch(java.lang.ClassNotFoundException clsNotFnd){
                
                javax.swing.JOptionPane.showMessageDialog(this, "Class sacco.sacco not found in the classpath");
                
            }
        }
        
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
                        
                        jToolBar1.updateUI();
                        
                        //   this.jPopupMenu1.updateUI();
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this);
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this.getRootPane());
                        
                        //    javax.swing.SwingUtilities.updateComponentTreeUI(this.jPopupMenu1);
                        
                        this.jMenuBar1.setBorder(new javax.swing.border.TitledBorder(null, "Sacco System Menu Bar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier", 2, 8), new java.awt.Color(0, 0, 153)));
                        
                        
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
    
    private void changeTheme(java.lang.String lnf, java.lang.String themepack) {
        
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
                        
                        jToolBar1.updateUI();
                        
                        //   this.jPopupMenu1.updateUI();
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this);
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this.getRootPane());
                        
                        //    javax.swing.SwingUtilities.updateComponentTreeUI(this.jPopupMenu1);
                        
                        this.jMenuBar1.setBorder(new javax.swing.border.TitledBorder(null, "Sacco System Menu Bar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier", 2, 8), new java.awt.Color(0, 0, 153)));
                        
                        
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
    
    public java.lang.String getCompanyName() {
        
        java.lang.String title = null;
        

        try {
            
            
            java.sql.Statement stmt1 = this.connectDB.createStatement();
            
            java.sql.ResultSet rs1 = stmt1.executeQuery("select company_name from company_profile");
            
            while (rs1.next()) {
                
                title = (rs1.getString(1));
            }
            
        }catch (java.sql.SQLException sqlEx){
            
            
        }
        return title;
    }
    
    public java.lang.String getDateLable() {
        
        java.lang.String date_label = null;
        
        java.lang.String month_now_strs = null;
        
        java.lang.String date_now_strs = null;
        
        java.lang.String year_now_strs = null;
        
        java.lang.String minute_now_strs = null;
        
        java.lang.String hour_now_strs = null;
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        java.util.Calendar calinst = java.util.Calendar.getInstance();
        
        java.util.Date date_now = calinst.getTime();
        
        int date_now_str = date_now.getDate();
        
        int month_now_str = date_now.getMonth();
        
        int year_now_str = date_now.getYear();
        
        int hour_now_str = date_now.getHours();
        
        int minute_now_str = date_now.getMinutes();
        
        int year_now_abs = year_now_str - 100;
        
        if (year_now_abs < 10) {
            
            year_now_strs = "200"+year_now_abs;
            
        } else {
            
            year_now_strs = "20"+year_now_abs;
            
        }
        
        switch (month_now_str) {
            
            case 0 : month_now_strs = "JAN";
            
            break;
            
            case 1 : month_now_strs = "FEB";
            
            break;
            
            case 2 : month_now_strs = "MAR";
            
            break;
            
            case 3 : month_now_strs = "APR";
            
            break;
            
            case 4 : month_now_strs = "MAY";
            
            break;
            
            case 5 : month_now_strs = "JUN";
            
            break;
            
            case 6 : month_now_strs = "JUL";
            
            break;
            
            case 7 : month_now_strs = "AUG";
            
            break;
            
            case 8 : month_now_strs = "SEP";
            
            break;
            
            case 9 : month_now_strs = "OCT";
            
            break;
            
            case 10 : month_now_strs = "NOV";
            
            break;
            
            case 11 : month_now_strs = "DEC";
            
            break;
            
            default :         if (month_now_str < 10){
                
                month_now_strs = "0"+month_now_str;
                
            } else {
                
                month_now_strs = ""+month_now_str;
                
            }
            
        }
        
        if (date_now_str < 10) {
            
            date_now_strs = "0"+date_now_str;
            
        } else {
            
            date_now_strs = ""+date_now_str;
            
        }
        
        if (minute_now_str < 10) {
            
            minute_now_strs = "0"+minute_now_str;
            
        } else {
            
            minute_now_strs = ""+minute_now_str;
            
        }
        
        if (hour_now_str < 10) {
            
            hour_now_strs = "0"+hour_now_str;
            
        } else {
            
            hour_now_strs = ""+hour_now_str;
            
        }
        
        date_label = date_now_strs+month_now_strs+year_now_strs+"@"+hour_now_strs+minute_now_strs;
        
        return date_label;
        
    }
    
    public void backupImmediate(){
        
        java.lang.Runtime rt_backup = java.lang.Runtime.getRuntime();
        
        java.lang.String backup_date_stamp = this.getDateLable();
        
        try {
            
            java.lang.Process backup_proc;
            
            backup_proc = rt_backup.exec("pg_dump sako -f SAKO_"+backup_date_stamp+".sql");
            
            try {
                
                backup_proc.waitFor();
                
            } catch(java.lang.InterruptedException IntruptExec){
                
                javax.swing.JOptionPane.showMessageDialog(this, IntruptExec.getLocalizedMessage());
                
            }
            
            int backup_proc_return = backup_proc.exitValue();
            
            
            if (backup_proc_return == 0) {
                
                javax.swing.JOptionPane.showMessageDialog(this, "Backup of the SAKO database successfully completed on "+backup_date_stamp);
                
            } else {
                
                javax.swing.JOptionPane.showMessageDialog(this, "Backup of the SAKO database failed at "+backup_date_stamp);
                
            }
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
    }
    
    public void stop() {
        
        Thread.currentThread().stop();
        
    }
    
    public void run() {
        this.setCursor(javax.swing.JFrame.WAIT_CURSOR);
        while(isRunning) {
            
            //         int comp_dlg  = javax.swing.JOptionPane.showConfirmDialog(this, "About to open Company profile", "Company profile dialogue", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
            
            //       if (comp_dlg == javax.swing.JOptionPane.YES_OPTION){
            
            //               this.backupImmediate();
            
            //               isRunning = false;
            
            
            javax.swing.JInternalFrame comp = new CompanyPrfintfr(connectDB, pConnDB);
            
            
            
            
            saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            
            
            
            isRunning = false;
            
            try {
                Thread.currentThread().sleep(1000);
            } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
            try {
                comp.setSelected(true);
                
                this.setCursor(javax.swing.JFrame.DEFAULT_CURSOR);
                
            } catch(java.beans.PropertyVetoException pvt){}
        }
        //}
        
        if (!isRunning) {
            
            stop();
            
            Thread.currentThread().destroy();
        }
        
    }
    
    public void launchIntfr(java.lang.String instIntfrName, java.lang.String intfrClass){
        
    }
    
    public java.lang.Object[] getMemberNo() {
        
        java.util.Vector memVector = new java.util.Vector(1,1);
        
        java.lang.Object[] memObj = null;
        
        
        
        try {
            
            //            java.sql.Connection dbConn = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement connStmt = this.connectDB.createStatement();
            
            java.sql.ResultSet rSet = connStmt.executeQuery("SELECT DISTINCT payroll_no FROM member");
            
            while (rSet.next()) {
                
                memVector.addElement(rSet.getObject(1).toString());
                
            }
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
        
         memObj = memVector.toArray();
        
        return memObj;
    }
        
         public java.lang.Object[] getMemberNoBBF() {
        
        java.util.Vector memVectorBBF = new java.util.Vector(1,1);
        
        java.lang.Object[] memObjBBF = null;
        
        
        
        try {
            
            //            java.sql.Connection dbConn = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement connStmtBBF = this.connectDB.createStatement();
            
            java.sql.ResultSet rSetBBF = connStmtBBF.executeQuery("SELECT DISTINCT payroll_no FROM member where bbf_status ilike 'join bbf'");
            
            while (rSetBBF.next()) {
                
                memVectorBBF.addElement(rSetBBF.getObject(1).toString());
                
            }
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
        
        memObjBBF = memVectorBBF.toArray();
        
        return memObjBBF;
        
    }
    
    public java.lang.Object[] getLoanNo() {
        
        java.util.Vector memVector = new java.util.Vector(1,1);
        
        java.lang.Object[] memObj = null;
        
        
        
        try {
            
            // java.sql.Connection dbConn = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
            
            java.sql.Statement connStmt = connectDB.createStatement();
            
            java.sql.ResultSet rSet = connStmt.executeQuery("SELECT DISTINCT loan_acc_no FROM approved_loans");
            
            while (rSet.next()) {
                
                memVector.addElement(rSet.getObject(1).toString());
                
            }
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
        
        memObj = memVector.toArray();
        
        return memObj;
        
    }
    public static org.netbeans.lib.sql.pool.PooledConnectionSource getPooledConnectionSource() {
        
        org.netbeans.lib.sql.pool.PooledConnectionSource pooledConnectionSource1 = new org.netbeans.lib.sql.pool.PooledConnectionSource();
        
        pooledConnectionSource1.setDatabase("jdbc:postgresql://192.168.215.105:5432/knut_210106");
        
        pooledConnectionSource1.setDriver("org.postgresql.Driver");
        
        pooledConnectionSource1.setPassword("02ac219a6b011019ea966757de3451d2399ce04dd82596d3ba4266a8845ab7f80861", true);
        
        pooledConnectionSource1.setUsername("postgres");
        
        return pooledConnectionSource1;
    }
    
    public javax.swing.JPopupMenu createPopupMenu(javax.swing.JMenuBar jMenuBar) {
        
        
        
        javax.swing.JPopupMenu popMenuContext = null;
        
        jMenuBar1.countComponents();
        
        return popMenuContext;
    }
    
    public static java.lang.String getPath2Acrobat() {
        //        java.lang.String dbServerIp = null;
        java.lang.String acroPath = null;
        
        java.lang.String myAppFileUrl = null;
        
        myAppFileUrl =  System.getProperty("user.dir")
        
        + System.getProperty("file.separator")
        
        + "myapp.properties";
        
        try {
            
            java.io.FileInputStream propInFile = new java.io.FileInputStream(myAppFileUrl);
            
            
            
            
            //       java.io.FileOutputStream propOutFile = new java.io.FileOutputStream("myapp.properties");
            
            java.util.Properties appProp = new java.util.Properties();
            
            try {
                
                appProp.load(propInFile);
                
                //            dbServerIp = appProp.getProperty("dbServerIpAdd", "127.0.0.1");
                
                acroPath = appProp.getProperty("acrobatPath","c:/Program Files/Adobe/Acrobat 5.0/Reader/AcroRd32.exe ");
                
                //            System.out.println(dbServerIp);
                System.out.println(acroPath);
                
                //  return dbServerIp;
                
                
            } catch (java.io.IOException ioExec){
                
                System.out.println(ioExec.getMessage());
                
            }
            
            // return dbServerIp;
            
        } catch (java.lang.Exception exc){
            
            System.out.println(exc.getMessage());
            
            //    javax.swing.JOptionPane.showMessageDialog(this, "Properties file not found!");
            
        }
        
        return acroPath;
        
    }
    
    private void createTreeNodes(javax.swing.tree.DefaultMutableTreeNode treeNodes) {
        
        javax.swing.tree.DefaultMutableTreeNode processingNode = null;
        
        javax.swing.tree.DefaultMutableTreeNode glNode = null;
        
        javax.swing.tree.DefaultMutableTreeNode reportsNode = null;
        
        javax.swing.tree.DefaultMutableTreeNode toolNode = null;
        
        javax.swing.tree.DefaultMutableTreeNode processingNode1 = null;
        
        javax.swing.tree.DefaultMutableTreeNode glNode1 = null;
        
        javax.swing.tree.DefaultMutableTreeNode reportsNode1 = null;
        
        javax.swing.tree.DefaultMutableTreeNode toolNode1 = null;
        
        processingNode = new javax.swing.tree.DefaultMutableTreeNode("Operations");
        
        treeNodes.add(processingNode);
        
        processingNode1 = new javax.swing.tree.DefaultMutableTreeNode("Payments");
        
        processingNode.add(processingNode1);
        
        processingNode1 = new javax.swing.tree.DefaultMutableTreeNode("Receipts");
        
        processingNode.add(processingNode1);
        
        processingNode1 = new javax.swing.tree.DefaultMutableTreeNode("Shares");
        
        processingNode.add(processingNode1);
        
        processingNode1 = new javax.swing.tree.DefaultMutableTreeNode("Loans");
        
        processingNode.add(processingNode1);
        
        processingNode1 = new javax.swing.tree.DefaultMutableTreeNode("Members");
        
        processingNode.add(processingNode1);
        
        glNode = new javax.swing.tree.DefaultMutableTreeNode("General Ledger");
        
        treeNodes.add(glNode);
        
        glNode1 = new javax.swing.tree.DefaultMutableTreeNode("Cash Book");
        
        glNode.add(glNode1);
        
        glNode1 = new javax.swing.tree.DefaultMutableTreeNode("Journal");
        
        glNode.add(glNode1);
        
        glNode1 = new javax.swing.tree.DefaultMutableTreeNode("Budgeting");
        
        glNode.add(glNode1);
        
        glNode1 = new javax.swing.tree.DefaultMutableTreeNode("Asset Management");
        
        glNode.add(glNode1);
        
        reportsNode = new javax.swing.tree.DefaultMutableTreeNode("Reports");
        
        treeNodes.add(reportsNode);
        
        reportsNode1 = new javax.swing.tree.DefaultMutableTreeNode("Statements");
        
        reportsNode.add(reportsNode1);
        
        reportsNode1 = new javax.swing.tree.DefaultMutableTreeNode("Accounting Reports");
        
        reportsNode.add(reportsNode1);
        
        reportsNode1 = new javax.swing.tree.DefaultMutableTreeNode("Loan Reports");
        
        reportsNode.add(reportsNode1);
        
        reportsNode1 = new javax.swing.tree.DefaultMutableTreeNode("Management Reports");
        
        reportsNode.add(reportsNode1);
        
        toolNode = new javax.swing.tree.DefaultMutableTreeNode("Utilities");
        
        treeNodes.add(toolNode);
        
        toolNode1 = new javax.swing.tree.DefaultMutableTreeNode("Database Maintenance");
        
        toolNode.add(toolNode1);
        
        toolNode1 = new javax.swing.tree.DefaultMutableTreeNode("User Profiles & Security");
        
        toolNode.add(toolNode1);
        
        toolNode1 = new javax.swing.tree.DefaultMutableTreeNode("Graphical Analysis");
        
        toolNode.add(toolNode1);
        
        toolNode1 = new javax.swing.tree.DefaultMutableTreeNode("Help and Documentation");
        
        toolNode.add(toolNode1);
        
    }
    
    private void invokeTreeActionPlan(java.lang.String selectedNode) {
        
        if (selectedNode == "Payments") {
            
            System.out.println("Selected "+selectedNode.toString());
            
        } else if (selectedNode == "Graphical Analysis") {
            
            System.out.println("Selected "+selectedNode.toString());
            
        }
        
        // }
       /*    int selected_Node;
    int PAYMENTS = 1;
    int RECEIPTS = 2;
    int SHARES = 3;
    int LOANS = 4;
    int MEMBERS = 5;
    int CASHBOOK = 6;
    int JOURNAL = 7;
    int BUDGETING = 8;
    int ASSETMGNT = 9;
    int STATEMENTS = 10;
    int ACCTREPORTS = 11;
    int MGMTREPORTS = 12;
    int DBMAINT = 13;
    int USERPROF = 14;
    int GRAPHICALAN = 15;
    int HELPANDOCS =16;
        */
        String month_now_strs;
        switch (selected_Node) {
            
            case 1 :
                
                break;
                
            case 2 : month_now_strs = "FEB";
            
/*            break;
 
            case 2 : month_now_strs = "MAR";
 
            break;
 
            case 3 : month_now_strs = "APR";
 
            break;
 
            case 4 : month_now_strs = "MAY";
 
            break;
 
            case 5 : month_now_strs = "JUN";
 
            break;
 
            case 6 : month_now_strs = "JUL";
 
            break;
 
            case 7 : month_now_strs = "AUG";
 
            break;
 
            case 8 : month_now_strs = "SEP";
 
            break;
 
            case 9 : month_now_strs = "OCT";
 
            break;
 
            case 10 : month_now_strs = "NOV";
 
            break;
 
            case 11 : month_now_strs = "DEC";
 
            break;
 
            default :         if (month_now_str < 10){
 
                                 month_now_strs = "0"+month_now_str;
 
                                 } else {
 
                                 month_now_strs = ""+month_now_str;
 
                             }
 */
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenu bbfsetupsmn;
    private javax.swing.JMenuItem offmnit;
    private javax.swing.JMenuItem printvouchermnit;
    private javax.swing.JMenuItem bkupmnit;
    private javax.swing.JMenuItem dividlistmnit1;
    private javax.swing.JMenuItem yclsacctmnit;
    private javax.swing.JMenuItem updatedomainsmnit;
    private javax.swing.JRadioButtonMenuItem bbjmnit11;
    private javax.swing.JMenuItem invwithbalmnit;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JMenu bankssetnitup;
    private javax.swing.JMenuItem MemberDetailsmnit;
    private javax.swing.JMenu loanrepmn;
    private javax.swing.JMenuItem openingbalmnit;
    private javax.swing.JMenu currtransmn;
    private javax.swing.JMenu bbfOperationsmn;
    private javax.swing.JMenuItem memberstatementnmit;
    private javax.swing.JMenuItem allMbrrefunnMnit;
    private javax.swing.JMenu processingmn;
    private javax.swing.JMenuItem sinkingfundmnit;
    private javax.swing.JMenuItem lnintrestmnit;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenuItem companypmnit;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton helpButton;
    private javax.swing.JMenuItem otherprmnit;
    private javax.swing.JMenuItem deductionRefundsmnit;
    private javax.swing.JMenuItem sharetransmnit;
    private javax.swing.JMenuItem validatamnit;
    private javax.swing.JMenu sharesmn1mn;
    private javax.swing.JMenuItem payvouchermnit;
    private javax.swing.JMenuItem bbfmembersmnit;
    private javax.swing.JMenuItem bankreconcmnit;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JMenu dataSheetmn;
    private javax.swing.JRadioButtonMenuItem xpmnit1;
    private javax.swing.JMenu utilitymn;
    private javax.swing.JRadioButtonMenuItem modernmnit1;
    private javax.swing.JMenuItem sharetypesmnit;
    private javax.swing.JMenuItem schemeregmnit;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem loanmaxmnit;
    private javax.swing.JMenuItem mbrnotdeductesmnit;
    private javax.swing.JMenuItem loanappmnit;
    private javax.swing.JMenu helpmn;
    private javax.swing.JMenuItem restoredatamnit;
    private javax.swing.JMenuItem bbfdedadjmnit;
    private javax.swing.JMenuItem mbrResignbyReasonmnit;
    private javax.swing.JMenu lnfmn;
    private javax.swing.JMenuItem actvintfr;
    private javax.swing.JMenuItem depreciationmethodmnit;
    private javax.swing.JMenuItem adjustdedmnit;
    private javax.swing.JMenuItem sharesrefmnit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem cpactdatamnit;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuItem otherrecptmnit;
    private javax.swing.JMenuItem newMbrDtaSheetmnit;
    private javax.swing.JMenuItem dividedpaidmnit1;
    private javax.swing.JMenuItem approvevouchmnit;
    private javax.swing.JMenu cashbkmn;
    private javax.swing.JMenu withdrawalmn;
    private java.awt.GridBagLayout gridBagLayout1;
    private javax.swing.JMenuItem raisevouchmnit;
    private javax.swing.JMenuItem repomnit;
    private javax.swing.JSplitPane saccoSplitPane;
    private javax.swing.JButton mtmediaBttn;
    private javax.swing.JRadioButtonMenuItem macos1mnit1;
    private javax.swing.JMenuItem dividcaptmnit;
    private javax.swing.JMenuItem mbVerifymnit;
    private javax.swing.JMenuItem unallocpymmnit;
    private javax.swing.JMenuItem cahflowmngmnit;
    private javax.swing.JMenuItem allocatebbfbbfmnit11;
    private javax.swing.JButton mailBttn;
    private javax.swing.JButton calcBttn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem loansecguarsammrymnit;
    private javax.swing.JMenuItem usdollarmnit;
    private javax.swing.JMenu depreciationmn;
    private javax.swing.JMenu monthlymn;
    private javax.swing.JMenuItem staffdetailsmnit;
    private javax.swing.JMenuItem loanawaitapprmnit;
    private javax.swing.JMenu gledgermn;
    private javax.swing.JMenuItem bbfrefundsmnit11;
    private javax.swing.JMenuItem resetcodesmnit;
    private javax.swing.JMenuItem loansmnit;
    private javax.swing.JMenu staffmn;
    private javax.swing.JMenuItem euromnit;
    private javax.swing.JMenuItem bbfopeningbalancemnit11;
    private javax.swing.JMenuItem optimdbmnit;
    public javax.swing.JDesktopPane saccopn;
    private javax.swing.JMenuItem banksmnit;
    private javax.swing.JMenu reportsmn;
    private javax.swing.JMenuItem loanoffsetmnit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem deferejmnit;
    private javax.swing.JMenuItem totalbbfcontributionmnit;
    private javax.swing.JMenu saccoearningsmn;
    private javax.swing.JMenuItem deptmnit;
    private javax.swing.JMenuItem allsaccoearningsmnit;
    private javax.swing.JMenu memberListsmn;
    private javax.swing.JMenuItem loansecguarmnit;
    private javax.swing.JMenuItem employmttermsmnit;
    private javax.swing.JMenu allocationmn;
    private javax.swing.JMenuItem memberrfdsmnit;
    private javax.swing.JMenuItem overdeductedmbrsmnit;
    private javax.swing.JMenuItem usersmnit;
    private javax.swing.JMenuItem detailedEarningStmtmnit;
    private javax.swing.JMenuItem sharescontribmnit;
    private javax.swing.JMenu regionmn;
    private javax.swing.JMenuItem deposintmnit;
    private javax.swing.JMenuItem loaninarreasmnit;
    private javax.swing.JMenuItem hlpsetsmnit;
    private javax.swing.JMenuItem allocsummperdebtmnit;
    private javax.swing.JMenuItem individualrfdsmnit;
    private javax.swing.JMenuItem membertypemnit;
    private javax.swing.JMenu loansbmn;
    private javax.swing.JMenuItem approveinvmnit;
    private javax.swing.JMenuItem hlpcontmnit;
    private javax.swing.JMenuItem bankingmnit;
    private javax.swing.JMenuItem assetmnit;
    private javax.swing.JMenu pettycashmn;
    private javax.swing.JCheckBoxMenuItem motiflnfmnit1;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JMenu schememn;
    private javax.swing.JMenuItem dailyrtmnit;
    private javax.swing.JMenuItem activeMemberListmnit;
    private javax.swing.JMenuItem loanpurpmnit;
    private javax.swing.JMenuItem countrymnit;
    private javax.swing.JMenuItem interestpaidmnit1;
    private javax.swing.JMenuItem allMbrWithdrawalmnit;
    private javax.swing.JMenuItem divdcapitmnit;
    private javax.swing.JMenuItem processparmnit111;
    private javax.swing.JMenuItem opbalmnit;
    private javax.swing.JMenuItem propertysetupmnit;
    private javax.swing.JMenuItem banhbranchmnit;
    private javax.swing.JMenuItem loansecmnit;
    private javax.swing.JRadioButtonMenuItem beosmnit1;
    private javax.swing.JMenuItem distdivmnit;
    private javax.swing.JMenuItem interestcapmnit;
    private javax.swing.JMenuItem suspschememnit;
    private javax.swing.JMenuItem suffmnit;
    private javax.swing.JMenuItem chgpasswdmnit;
    private javax.swing.JMenuItem receivecashmnit;
    private javax.swing.JMenuItem loanintrmnit1;
    private javax.swing.JMenu deductionsmn;
    private javax.swing.JMenuItem processparmnit;
    private javax.swing.JMenuItem saccomnit;
    private javax.swing.JCheckBoxMenuItem macmnit1;
    private javax.swing.JMenuItem sharrcptmnit1;
    private javax.swing.JMenuItem allOverDedmnit;
    private javax.swing.JMenuItem allocsummnit;
    private javax.swing.JMenuItem loantransmnit;
    private javax.swing.JMenuItem schemeprovmnit;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JMenuItem sharesrfdmnit;
    private javax.swing.JButton brwsrBttn;
    private javax.swing.JMenuItem divdedcalcmnit;
    private javax.swing.JMenuItem overdeductionrfdmnit;
    private javax.swing.JMenuItem setaccperiodmnit;
    private javax.swing.JCheckBoxMenuItem winlnfmnit1;
    private javax.swing.JRadioButtonMenuItem whiltmnit1;
    private javax.swing.JMenuItem schemeallmnit;
    private javax.swing.JMenuItem loanapprvmnit;
    private javax.swing.JMenuItem bbfmbrtranamnit;
    private javax.swing.JMenu sharetransmn;
    private javax.swing.JMenuItem withdrawalByReasonmnit;
    private javax.swing.JMenuItem earningspeMembermnit;
    private javax.swing.JRadioButtonMenuItem aquamnit1;
    private javax.swing.JMenuItem loansprmnit;
    private javax.swing.JMenuItem newmembrptmnit;
    private javax.swing.JMenuItem MemberStmtmnit;
    private javax.swing.JMenuItem dataSheetmnit;
    private javax.swing.JMenuItem aboutmn;
    private javax.swing.JMenuItem branchmnit;
    private javax.swing.JMenu loanprssmn;
    private javax.swing.JMenu refundmn;
    private javax.swing.JMenuItem allocsumnit;
    private javax.swing.JMenuItem allocchqmnit;
    private javax.swing.JMenuItem mbrnotpayingloanmnit;
    private javax.swing.JMenuItem benefitsdefinemnit;
    private javax.swing.JMenuItem refundsetupsmnit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu bbfreportsmn;
    private javax.swing.JMenuItem raisecashVouchmnit;
    private javax.swing.JMenuItem detMemberSaremnit;
    private javax.swing.JMenuItem membmnit1;
    private javax.swing.JMenuItem approvedloansmnit;
    private javax.swing.JMenuItem sinkingpermembermnit;
    private javax.swing.JMenuItem otherSharerecptsmnit;
    private javax.swing.JMenuItem mbrregmnit;
    private javax.swing.JMenu setupmn;
    private javax.swing.JMenuItem commismnit;
    private javax.swing.JMenuItem jrnloansmnit;
    private javax.swing.JMenuItem clsacctmnit;
    private javax.swing.JMenu skinmn;
    private javax.swing.JMenuItem workstmnit;
    private javax.swing.JButton fmgrBttn;
    private javax.swing.JMenu yrroutinemn;
    private javax.swing.JButton editButtn;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem bbfmembertransmnit;
    private javax.swing.JMenu mreportsmn;
    private javax.swing.JMenuItem convertRfd2Sharemnit;
    private javax.swing.JMenuItem MemberBalmnit1;
    private javax.swing.JMenuItem memberListmnit;
    private javax.swing.JMenuItem recvallocformmnit;
    private javax.swing.JMenuItem listloansappliedmnit;
    private javax.swing.JMenuItem depreciationmnit;
    private javax.swing.JMenuItem suspschemepovmnit;
    private javax.swing.JCheckBoxMenuItem swinglnfmnit1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
    
}
