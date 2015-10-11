/*
 * sacco.java
 *
 * Created on August 13, 2002, 12:54 AM
 */

package com.afrisoftech.hospital;


import java.beans.PropertyVetoException;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import java.io.IOException;
import com.afrisoftech.hospinventory.*;
import com.afrisoftech.hospayroll.*;
import javax.help.*;
import javax.help.search.*;
import javax.swing.text.*;


/**
 *
 * @author  root
 */
public class HospitalMain extends javax.swing.JFrame implements java.lang.Runnable {
    
    private String newline = "\n";
    
    private String newTab = "\t";
    
    boolean isRunning = true;
    
    boolean allowed2Access = false;
    
    boolean threadSales = false;
    
    boolean cashierRunning = false;
    
    boolean cashRunning = false;
    
    boolean patientRunning = false;
    
    boolean loadingMode = false;
    
    static java.lang.String psWord = null;
    
    boolean domainsReset = false;
    
    boolean shiftStatus = false;
    
    boolean stopStatus = false;
    
    boolean aliveStatus = false;
    
    boolean billPaymentIntfr_isShowing = false;
    
    private java.lang.Thread patientThread;
    private java.lang.Thread cashThread;
    private ProgressThread progressThread;
    
    private javax.swing.JProgressBar progressBar;
      public static java.util.Properties appProp;
    javax.swing.ProgressMonitor progressMonitor;
    
    private javax.swing.Action openShiftAction;
    
    private javax.swing.Action patientRegistrationAction;
    
    private com.afrisoftech.dbadmin.TableView tableView;
    //   private javax.swing.ProgressMonitor progressMonitor;
    private com.afrisoftech.dbadmin.GraphicalView graphicalView;
    
    private java.lang.Object[][] tableData = null;
    
    public java.util.Vector tableColumnsVector = null;
    
    java.lang.String myAppOutFileUrl;
    
   // static java.util.Properties appProp;
    
    static java.util.Properties appOutProp;
    
    //    private java.lang.Thread activePaneThread;
    
    int Outorders = 4;
    
    int PaySlip = 0;
    
    int treeRowCount = 0;
    
    int P9 = 1;
    int Deductions = 2;
    int ChqPayments = 3;
    int PayeList = 4;
    int CashPayments = 5;
    int SchemesContr = 6;
    int NetPay = 7;
    int DeptNetPay = 8;
    int PayMaster = 9;
    int Tax = 10;
    int StaffEarning = 11;
    int SaccoList = 12;
    int EmpList = 13;   //    java.lang.String cashpoint = "cashpoint001";
    
    
    
    javax.swing.ImageIcon imgIcon;
    
    int GITransactions = 0;
    int BalanceSheet = 1;
    int ProfitLoss = 2;
    int CashBookList = 3;
    int TransactionsList = 4;
    int TrialBalance = 5;
    int PatList = 6;
    int ReceiptperPat = 26;
    int DetailedTrialbalance = 8;
    int SharesTransactions = 9;
    int DetailedPatStmt = 10;
    int DepartmentRev = 11;
    int PatientStatement = 12;
    int ReceiptsList = 13;
    int CreditorsA = 14;
    int DailyRev = 15;
    int PatientBill = 16;
    int ApprVouch = 17;
    int PayAwtAppr = 18;
    int CreditorsInv = 19;
    int ShiftNo = 20;
    int FinalInv = 21;
    int AccntStatement = 22;
    int Payments = 23;
    int Bookings = 24;
    int TotalReceipts = 25;
    int ReceiptsCopy = 26;
    int Debtors = 27;
    int DoctorsLedger = 28;
    int InpatDiag = 29;
    int StoresRev = 30;
    int DeptIncExp = 31;
    int PatPerDept = 32;
    int PetyCash = 33;
    int RaisePetyCash = 34;
    int SuppCreditorsInv = 36;
    int GRT = 3600;
    int TransPerAcc = 35;
    int OutPatientBill = 38;
    int Creditors = 37;
    int PayerInv = 39;
    int DebtorsStmt = 40;
    int SubmStmt = 41;
    int InvPerSchm = 42;
    int AttSheet = 43;
    int DischSheet = 44;
    int InPatAttSheet = 45;
    int DetStmt = 46;
    int CredtStmt = 47;
    int DocStmt = 48;
    int InvByInv = 49;
    int NhifCredits = 50;
    int AgeingByPayer = 51;
    int DocVouch = 52;
    int Vouch = 53;
    int OtherVouch = 54;
    int PettyVouch = 55;
    int FinalInPatInv = 56;
    int PharmSales = 57;
    int UnFinInv = 58;
    int FinInv = 59;
    int DebtorsRct = 60;
    int TotalSchemeInv = 61;
    int PatBal = 62;
    int RevRep = 64;
    int CashSaleRep = 65;
    int TotalInpatRecp = 66;
    int PayerRct = 67;
    int InvPerCreditors = 68;
    int PaymtsPerCreditors = 69;
    int NhifInv = 70;
    int OpRev = 71;
    int IpRev = 72;
    int OpRevBrk = 73;
    int IpRevByAcc = 74;
    int OpRevByAcc = 75;
    int DocPaidInv = 77;
    int DocPaidCashInv = 78;
    int Expenses = 79;
    int FinalInPatInvTotal = 80;
    int FinalInPatInvCash = 81;
    int AdmissionSheet = 82;
    int TimeLog = 83;
    int PharmPerfom = 84;
    int AllocRep = 85;
    int SupplierInvoices = 87;
    int LabResults = 89;
    int PatLabResults = 90;
    int PatTimeLog = 91;
    int PatDiag = 92;
    int SchemeStaff = 93;
    int DrugsPrbd = 94;
    int DoctorsStmt = 98;
    int AllocSum = 99;
    int DebtAllocSum = 100;
    int UnAllocSum = 101;
    int DebtStmtDet = 102;
    int AppInvSch = 104;
    int UnAppInvSch = 105;
    int DebtStmtAppr = 106;
    int DebtStmtUnAppr = 107;
    int Dispatch = 108;
    int DispatchPerScm = 109;
    int DispatchListing = 110;
    int DispatchPerDebt = 111;
    int DoctorsVouch = 112;
    int DoctorsVouchDet = 113;
    int DoctorsPayments = 114;
    int PaymentsPerDoctor = 115;
    int Wht = 116;
    int WhtPerDoc = 117;
    int PayerAgeingSumm = 118;
    int PettyCashShift = 119;
    int PaymentsPerDoctorSumm = 120;
    int DoctorStmUnPaid = 121;
    int UncollectedShifts = 122;
    int DebtorsStmtBrk = 123;    
    int UnDispInv = 124;
    int SalesBelowMk = 125;
    int ProvSumm = 126;
    int ProvPerDebtor = 127;
    int ProvPerSchm = 128;
    int DocEarnDeductions = 129;
    int DoctorStmScm = 130;
    int DocStmtPerDebtor = 131;
    int DocPaidupPerDebtor = 132;
    int DocPaidupPerScm = 133;
    int ShiftsTotal = 134;
    int TransByacc = 135;
    int NhifDisp = 136;
    int ScmAllocSumm = 137;
    int DebtAllocSumm = 138;
    int FinalInvBal = 139;
    int PayerAllocSumm = 140;
    int DispInvSumm = 141;
    int DebtOSBAlSumm = 142;
    int AllocationDetail = 143;
    int UnpaidDisp = 144;
    int BankRecc = 145;
    int UnReconcItems = 146;
    int UnReconcItemsPerbk = 148;
    int FinalInvSumm = 149;
    int BankingPerBK = 150;
    int BankingSumm = 151;
    int SchemeSales = 152;
    int WHTSUMM = 153;
    int AttendPerScm = 156;
    int DiagSumm = 157;
    int StmtSummPerDebt = 158;
    int InpatBillSamm = 163;
    int CreditNotes = 166;
    int CancelledChqs = 167;
    int WardOccSt = 168;
    int DispPerPayerSumm = 169;
    int DetInvByInv = 170;
    int FinInDetInv = 171;
    int DebtStmSummary = 172;
    int FinalInPatCredit = 173;
    int OpCredit = 174;
    int AllocBychq = 175;
    int AttPerscmDet = 176;
    int CreditorsStmt =180;
    int InvPerCreditorDisc = 181;
    int Paymentpercrdet = 182;
    int PayerActAcc = 183;
    int BankRecDiscr = 188;
    int ConfDisp = 189;
    int ShiftDet = 190;
    int DebtCollector = 192;
    int TransSumm = 193;
    int RevPrices = 194;
    int DocProv = 195;
    int DocProvSumm = 196;
    int DocScmProvSumm = 197;
    int DebtCredt = 198;
    int ScmPerf = 211;
    int PayerPfm = 213;
    int Journals = 216;
    int PymStmt = 217;
    int WrtByScm = 219;
    int ConfBookings = 220;
    int PaidBills = 221;
    int AmbulRep = 222;
    int DispConfPerScm = 224;
    int DispConfPerPayer = 225;
    int ScmAmm = 226;
    int PayerStaffAmd = 228;
    int WrtSumm = 229;
    int CasFlowOeprt = 230;
    int DebtCollSumm = 232;
    int ScmSalesSumm = 233;
    int AnnualTb = 234;
    int AnnualPl = 235;
    int PayerAllocDet = 236;
    int Ddnote = 237;
    
    int AnnualPayerAg = 200;
    int AnnualPayerAgSumm = 201;
    int OpAttSumm = 204;
    int CorporateTax = 500;
    int TaxReturn = 501;
    int AnnualDebtors = 502;
    int WeeklyRev = 503;
    int DailysRev = 504;
    int YearlyRev = 505;
    int MonthlyRev = 506;
    int QuarterlyRev = 507;
    int CashAnalysis = 508;
    int DiagnosisAnalysis = 509;
    int MonthlyDiagSummary = 510;
    int WeeklySummaryRev = 511;
    int IpAnalySummaryRev = 512;
    int AieB = 513;
    int MonthlyRevComp = 514;
    int QuarterlyRevComp = 515;
    int labResults = 516;
    int journalInd = 517;
    int InvByInvTxt = 518;
    int InvIpTxt = 519;
    int interimTxt = 520;
    int ProfitLossTxt = 521;
    int IpUnFinInv = 522;
    int TrialbalanceMvt = 523;
    int ApproveTB = 524;
    int DetSchStmt = 525;
    
    int CreditorsAgeingByCat =1331;
    int PayrollLedger = 1332;
    int LoanStmt = 4701;
    int LoanStockAgeing = 4702;
    int DebtCrNote = 5203;
    int RsbClaimsByScm = 5206;
    int RtClaimsByScm = 5205;
    int RtClaimsSumm = 5204;
    int PaymentsSumm = 5207;
    int CreditsSumm = 5209;
    int Births = 5211;
    int admByWard = 5212;
    int SchmDet = 5213;
    int PayerTnover = 5215;
    int MarketerTnover = 5216;
    int IPDays = 5217;
    int CashSalesBrd = 5122;
    int Deaths = 5220;
    int Sickoffs = 5221;
    
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
    // Initialize tree consatants to use in case analysis
    int TREE_PAYMENTS = 0;
    int TREE_RECEIPTS = 1;
    int TREE_PATIENT_BILLS = 2;
    int TREE_INVOICES = 3;
    int TREE_DIAGNOSTICS = 4;
    int TREE_CASHBOOK = 5;
    int TREE_JOURNAL = 6;
    int TREE_BUDGETING = 7;
    int TREE_ASSET_MANAGEMENT = 8;
    int TREE_STATEMENTS = 9;
    int TREE_ACCOUNTING_REPORTS = 9;
    int TREE_PATIENT_REPORTS = 10;
    int TREE_DBA_TASKS = 11;
    int TREE_USER_PROFILES = 12;
    int TREE_GRAPHICAL_ANALYSIS = 13;
    int TREE_DOCUMENTATION = 14;
    int columnCount;
    javax.swing.JPopupMenu popupMenu = null;
    
    javax.swing.PopupFactory progressBarPopupFactory;
    
    javax.swing.Popup progressBarPopup;
    
    ConnectionStatus connectionStatus;
    
    
    //javax.swing.ProgressMonitor progressMonitor;
    
    
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
 
 
    java.lang.String backgrdimg;
 
    javax.swing.ImageIcon desktopPaneIcon;
 
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
    
    static final java.lang.String helpSetName = "EpackHimsHelp";
    
    static final java.lang.String helpSetLable = "Hospital Information Management System (HIMS)";
    
    int min;
    
    int max;
    
    public java.lang.String queryString = null;
    
    java.lang.String homeUrl;
    
    java.lang.String backgrdimg;
    
    javax.swing.ImageIcon desktopPaneIcon;
    
    javax.swing.tree.DefaultMutableTreeNode top;
    
    com.afrisoftech.lib.ParseMenuBar parseMenuBar;
    
    com.afrisoftech.hr.HRMain hrMain;
    
    com.afrisoftech.hospayroll.PayrollMain payrollMain;
    
    com.afrisoftech.hospital.HospitalMain hospitalMain;
    
    com.afrisoftech.hospinventory.StockMain stockMain;
 
    com.afrisoftech.sacco.SaccoMain saccoMain;    
    
    javax.swing.tree.DefaultMutableTreeNode topStock;
    
    javax.swing.JScrollPane treeScrollPaneDBAdmin;
    
    javax.swing.JScrollPane treeScrollPaneGraphicals;
    
    javax.swing.tree.DefaultMutableTreeNode toPayroll;
    
    javax.swing.tree.DefaultMutableTreeNode topReports;
    
    javax.swing.tree.DefaultMutableTreeNode topDBAdmin;
    
      //public static java.util.Properties appProp;
      
    javax.swing.tree.DefaultMutableTreeNode topGraphicals;
    
    com.l2fprod.common.swing.JTaskPane operationsTaskPane;
    
    com.l2fprod.common.swing.JTaskPane hrmTaskPane;
    
    com.l2fprod.common.swing.JTaskPane operationsTaskPane1;
    
    com.l2fprod.common.swing.JTaskPane acctsMainTaskPane;
    
    com.l2fprod.common.swing.JTaskPane stockTaskPane;
    
    com.l2fprod.common.swing.JTaskPane saccoTaskPane;
    
    com.l2fprod.common.swing.JTaskPane payrollTaskPane;
    
    com.l2fprod.common.swing.JTaskPane reportTaskPane;
    
    com.afrisoftech.lib.ParseMenuBar1 parseMenuBar1;
    
    public java.lang.String selectedTable;
    
    com.l2fprod.common.swing.JOutlookBar jOutLookBar;
    
    public boolean isCustomQuery = false;
    
    
    /** Creates new form medic */
    public HospitalMain(java.sql.Connection connDB, org.netbeans.lib.sql.pool.PooledConnectionSource pconnDB, java.lang.String acrobatPath, java.lang.String psword, com.afrisoftech.hospinventory.StockMain secureStockMain, com.afrisoftech.hospayroll.PayrollMain securePayrollMain, com.afrisoftech.hr.HRMain secureHRMain, com.afrisoftech.sacco.SaccoMain secureSaccoMain) {
        
        operationsTaskPane = new com.l2fprod.common.swing.JTaskPane();
        
        acctsMainTaskPane = new com.l2fprod.common.swing.JTaskPane();
        
        reportTaskPane = new com.l2fprod.common.swing.JTaskPane();
        
        stockTaskPane = new com.l2fprod.common.swing.JTaskPane();
        
        hrmTaskPane = new com.l2fprod.common.swing.JTaskPane();
        
        payrollTaskPane = new com.l2fprod.common.swing.JTaskPane();
        
        saccoTaskPane = new com.l2fprod.common.swing.JTaskPane();        
        
        topReports = new javax.swing.tree.DefaultMutableTreeNode("Hospital Reports View");
        
        openShiftAction = new HospitalMain.OpenShiftAction();
        
        openShiftAction.putValue(javax.swing.Action.SMALL_ICON, new javax.swing.ImageIcon(getClass().getResource("/openfold.gif")));
        
        openShiftAction.putValue(javax.swing.Action.NAME, "Open New Shift");
        
        openShiftAction.putValue(javax.swing.Action.SHORT_DESCRIPTION, "Open a new shift by clicking on this icon");
        
        patientRegistrationAction = new HospitalMain.PatientRegistrationAction();
        
        patientRegistrationAction.putValue(javax.swing.Action.SMALL_ICON, new javax.swing.ImageIcon(getClass().getResource("/openfold.gif")));
        
        patientRegistrationAction.putValue(javax.swing.Action.NAME, "Patient Registration");
        
        patientRegistrationAction.putValue(javax.swing.Action.SHORT_DESCRIPTION, "Launch patient registration");
        
        
        desktopPaneIcon = new javax.swing.ImageIcon(System.getProperty("backgrdimg","c:/Tests/clouds.jpg"));
        
        homeUrl = System.getProperty("user.dir")
        
        + System.getProperty("file.separator");
        
        min = 0;
        
        max =100;
        
        progressBar = new javax.swing.JProgressBar();
        
        progressBar.setMinimum(min);
        
        progressBar.setMaximum(max);
        
        progressBar.setValue(min);
        
        progressBarPopupFactory = javax.swing.PopupFactory.getSharedInstance();
        
        progressBarPopup = progressBarPopupFactory.getPopup(this, progressBar, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2);
        
        java.lang.String myAppFileUrl = null;
        
        myAppFileUrl =  System.getProperty("user.dir")
        
        + System.getProperty("file.separator")
        
        + "hosprop.properties";
        
        try {
            
            java.io.FileInputStream propInFile = new java.io.FileInputStream(myAppFileUrl);
            
            appProp = new java.util.Properties();
            
            try {
                
                appProp.load(propInFile);
                
                //            dbServerIp = appProp.getProperty("dbServerIpAdd", "127.0.0.1");
                
                //acroPath = appProp.getProperty("acrobatPath","c:/Program Files/Adobe/Acrobat 5.0/Reader/AcroRd32.exe ");
                
                //            System.out.println(dbServerIp);
                //System.out.println(acroPath);
                
                //  return dbServerIp;
                
                
            } catch (java.io.IOException ioExec){
                
                System.out.println(ioExec.getMessage());
                
            }
            
            // return dbServerIp;
            
        } catch (java.lang.Exception exc){
            
            System.out.println(exc.getMessage());
            
            //    javax.swing.JOptionPane.showMessageDialog(this, "Properties file not found!");
            
        }
        myAppOutFileUrl = null;
        
        myAppOutFileUrl =  System.getProperty("user.dir")
        
        + System.getProperty("file.separator")
        
        + "hosprop.properties";
        
        System.out.println("Properties file : "+myAppOutFileUrl);
        //        System.setProperty("cashpoint", cashpoint);
        
        System.setProperty("billpmnt", "notShowing");
        
        psWord = psword;
        
        connectDB = connDB;
        
        pConnDB = pconnDB;
        
        connectionStatus = new HospitalMain.ConnectionStatus(this);
        
        connectionStatus.start();
        
        if (securePayrollMain == null) {
            
//            payrollMain = new com.afrisoftech.hospayroll.PayrollMain(connectDB, pConnDB);
            
        } else {
            
 //           payrollMain = securePayrollMain;
            
        }
       
        if (hrMain == null) {
            
//            hrMain = new com.afrisoftech.hr.HRMain(connectDB, pConnDB,null,null);
            
        } else {
            
 //           hrMain = secureHRMain;
            
        }
        
        if (secureStockMain == null) {
            
            stockMain = new com.afrisoftech.hospinventory.StockMain(connectDB, pConnDB,null,null);
            
        } else {
            
            stockMain = secureStockMain;
            
        }
        
        
        if (secureSaccoMain == null) {
            
            saccoMain = new com.afrisoftech.sacco.SaccoMain(connectDB, pConnDB, null, null);
            
        } else {
            
            saccoMain = secureSaccoMain;
            
        }
                
        
 /*       if (secureHospitalMain == null) {
  
       //     hospitalMain = new com.afrisoftech.hospital.HospitalMain(connect2DB(), getPooledConnectionSource(), getPath2Acrobat(), psWord, null, null, null);
  
        } else {
  
            hospitalMain = secureHospitalMain;
  
        }
  */
        
        path2Acrobat = acrobatPath;
        
        try {
            
            java.lang.ClassLoader classLoader = HospitalMain.class.getClassLoader();
            
            java.net.URL urlHelpSet = javax.help.HelpSet.findHelpSet(classLoader, helpSetName);
            
            helpHS = new javax.help.HelpSet(classLoader, urlHelpSet);
            
        } catch(java.lang.Exception exec) {
            
            exec.printStackTrace();
            
            javax.swing.JOptionPane.showMessageDialog(this, exec.getMessage());
            
        }
        
        helpBroker = helpHS.createHelpBroker();
        
        initComponents();
        
        
        this.changeThemeByUrl(System.getProperty("defaultlnf", "com.l2fprod.gui.plaf.skin.SkinLookAndFeel"), getClass().getResource("/"+System.getProperty("defaulttheme", "xplunathemepack.zip")));
        tableView = new com.afrisoftech.dbadmin.TableView(connectDB, pConnDB);
        graphicalView = new com.afrisoftech.dbadmin.GraphicalView(connectDB, pConnDB);
       /* if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
        
            this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/xplunathemepack.zip"));
        
        
        }
        
        else {
        
            this.changeTheme("com.sun.java.swing.plaf.windows.WindowsLookAndFeel", null);
        
        }
        */
        this.mainSplitPane.setOpaque(false);
        
        this.saccopn.setOpaque(false);
        
        this.jToolBar3.setFloatable(false);
        
        this.jToolBar31.setFloatable(false);
        
        userLabel.setText("Logged-on USER : [ "+System.getProperty("currentuser")+" ]");
        
        connectionLabel.setText("DB Connection Status : [CONNECTED]");
        
        try {
            
            activePane.setText("Database Info. : [ "+connectDB.getMetaData().getDatabaseProductName()+" Ver "+connectDB.getMetaData().getDatabaseProductVersion()+" ]");
            
            activeDatabase.setText("Database URL : [ "+connectDB.getMetaData().getURL()+" ]");
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
        
        //        activeDatabase.setText("Active Database : ["+System.getProperty("activedatabase")+"]");
        
        //Set One touch expansion status to true f.
        
        // helpSplitPane.setOneTouchExpandable(true);
        
        mainSplitPane.setOneTouchExpandable(true);
        
        //payrollSplitPane.setOneTouchExpandable(true);
        
        //pharmacySplitPane.setOneTouchExpandable(true);
        
        //reportsSplitPane.setOneTouchExpandable(true);
        
        //dbadminSplitPane.setOneTouchExpandable(true);
        
        //crmSplitPane.setOneTouchExpandable(true);
        
        //graphicalsSplitPane.setOneTouchExpandable(true);
        
        saccopn.setOpaque(false);
        
/*        activePaneThread = new java.lang.Thread(this, "activepane");
 
        activePaneThread.start();
 */
        System.out.println("Default split pane component : ["+System.getProperty("defaultsplitpane")+"]");
        
        //        jTabbedPane1.setSelectedComponent(getDefaultSplitPane(System.getProperty("defaultsplitpane", "Hospital Operations")));
        
        
        
        setTitle(getCompanyName());
        
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/funsoft_logo.gif")).getImage());
        
        
        //  }
        
        
        // }
        
        //treeScrollPane.setViewportView(createOutLookBar());
        
        //treeScrollPane.add(createOutLookBar());
        
        //  payrollMain.payrollpn = payrollpn;
        
        // stockMain.medicdspane = medicdspane;
        
        //  mainSplitPane1.setVisible(false);
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
        operationsPopupMenu = new javax.swing.JPopupMenu();
        inventoryPopupMenu = new javax.swing.JPopupMenu();
        payrollPopupMenu = new javax.swing.JPopupMenu();
        reportsPopupMenu = new javax.swing.JPopupMenu();
        inventoryMenuBar = new javax.swing.JMenuBar();
        payrollMenuBar = new javax.swing.JMenuBar();
        reportsMenuBar = new javax.swing.JMenuBar();
        operationsPopupButtonGroup = new javax.swing.ButtonGroup();
        reportsPopupButtonGroup = new javax.swing.ButtonGroup();
        payrollPopupButtonGroup = new javax.swing.ButtonGroup();
        inventoryPopupButtonGroup = new javax.swing.ButtonGroup();
        inventoryMenuBarButtonGroup = new javax.swing.ButtonGroup();
        operationsMenuBarButtonGroup = new javax.swing.ButtonGroup();
        reportsMenuBarButtonGroup = new javax.swing.ButtonGroup();
        payrollMenuBarButtonGroup = new javax.swing.ButtonGroup();
        graphViewDialog = new javax.swing.JDialog();
        valuesAxisSelector = new javax.swing.JPanel();
        columnSelectorScrollPane = new javax.swing.JScrollPane();
        columnSelectorTable = new javax.swing.JTable();
        xaxisColumnPanel = new javax.swing.JPanel();
        xaxisComboBox = new javax.swing.JComboBox();
        xaxisLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        submitQuery = new javax.swing.JButton();
        cancelQuery = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        barChart = new javax.swing.JRadioButton();
        pieChart = new javax.swing.JRadioButton();
        xyChart = new javax.swing.JRadioButton();
        closeDialog = new javax.swing.JButton();
        help = new javax.swing.JButton();
        chartButtonGroup = new javax.swing.ButtonGroup();
        hrMenuBar = new javax.swing.JMenuBar();
        hrmPopupMenu = new javax.swing.JPopupMenu();
        hrPopupButtonGroup = new javax.swing.ButtonGroup();
        saccoPopupMenu = new javax.swing.JPopupMenu();
        saccoPopupButtonGroup = new javax.swing.ButtonGroup();
        saccoMenuBarButtonGroup = new javax.swing.ButtonGroup();
        saccoMenuBar = new javax.swing.JMenuBar();
        mainPanel = new javax.swing.JPanel() {

            public void paintComponent(java.awt.Graphics g) {

                java.awt.Dimension d = getSize();

                g.drawImage(desktopPaneIcon.getImage(), 0, 0, d.width, d.height,null);
                System.out.println("still drawing");
                setOpaque(false);

                super.paintComponent(g);

            }

        };

        mainSplitPane = new javax.swing.JSplitPane();
        treePane = new javax.swing.JPanel();
        desktopPane = new javax.swing.JPanel() {

            public void paintComponent(java.awt.Graphics g) {

                java.awt.Dimension d = getSize();

                g.drawImage(desktopPaneIcon.getImage(), 0, 0, d.width, d.height,null);
                System.out.println("still drawing");
                setOpaque(false);

                super.paintComponent(g);

            }

        };

        saccopn = new kiwi.ui.KDesktopPane();
        /*new javax.swing.JDesktopPane(){

            public void paintComponent(java.awt.Graphics g) {

                java.awt.Dimension d = getSize();

                g.drawImage(desktopPaneIcon.getImage(), 0, 0, d.width, d.height,null);
                System.out.println("still drawing");
                setOpaque(false);

                super.paintComponent(g);

            }

        };
        */
        jToolBar3 = new javax.swing.JToolBar();
        fmgrBttn = new javax.swing.JButton();
        calcBttn = new javax.swing.JButton();
        brwsrBttn = new javax.swing.JButton();
        editButtn = new javax.swing.JButton();
        mtmediaBttn1 = new javax.swing.JButton();
        mailBttn = new javax.swing.JButton();
        mtmediaBttn = new javax.swing.JButton();
        jToolBar31 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        helpButton = new javax.swing.JButton();
        helpButton.addActionListener(new javax.help.CSH.DisplayHelpAfterTracking(helpBroker));
        jToolBar311 = new javax.swing.JToolBar();
        operationsToolBar = new javax.swing.JButton();
        pharmacyToolBar = new javax.swing.JButton();

        payrollToolBar = new javax.swing.JButton();
        reportsToolBar = new javax.swing.JButton();
        openShift = new javax.swing.JButton();
        closeShift = new javax.swing.JButton();
        suspendShift = new javax.swing.JButton();
        optimizeDB = new javax.swing.JButton();
        compactDB = new javax.swing.JButton();
        backupDB = new javax.swing.JButton();
        taskBar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        connectionLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        activePane = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        activeDatabase = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        setupmn = new javax.swing.JMenu();
        countryditrmn = new javax.swing.JMenu();
        countrymnit = new javax.swing.JMenuItem();
        districtmnit = new javax.swing.JMenuItem();
        jSeparator41 = new javax.swing.JSeparator();
        profilemn = new javax.swing.JMenu();
        lgalstatussetupmnit = new javax.swing.JMenuItem();
        hosptalmnit = new javax.swing.JMenuItem();
        headermnit = new javax.swing.JMenuItem();
        interimnoticemnit = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JSeparator();
        Financialmn = new javax.swing.JMenu();
        glaccountsmnit = new javax.swing.JMenuItem();
        jSeparator67 = new javax.swing.JSeparator();
        banksmnit = new javax.swing.JMenuItem();
        creditcardsmnit = new javax.swing.JMenuItem();
        paymentmodesmnit = new javax.swing.JMenuItem();
        cashpointmnit = new javax.swing.JMenuItem();
        patientdepositsmnit = new javax.swing.JMenuItem();
        jSeparator68 = new javax.swing.JSeparator();
        iplimitmnit = new javax.swing.JMenuItem();
        accrualsmnit = new javax.swing.JMenuItem();
        jSeparator69 = new javax.swing.JSeparator();
        deductionsmnit = new javax.swing.JMenuItem();
        Corporatemnit = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JSeparator();
        LegalDocumentmn = new javax.swing.JMenu();
        docregistermnit = new javax.swing.JMenuItem();
        impdocregmnit = new javax.swing.JMenuItem();
        jSeparator64 = new javax.swing.JSeparator();
        departmentalmn = new javax.swing.JMenu();
        depatmnit = new javax.swing.JMenuItem();
        Operatingchamn = new javax.swing.JMenu();
        Operatingparamertersmnit = new javax.swing.JMenuItem();
        TheatreChargesmnit = new javax.swing.JMenuItem();
        adjpricesmnit = new javax.swing.JMenuItem();
        laboratorymn = new javax.swing.JMenu();
        labspecimensmnit = new javax.swing.JMenuItem();
        labtestsmnit = new javax.swing.JMenuItem();
        labresultsmnit = new javax.swing.JMenuItem();
        jSeparator31 = new javax.swing.JSeparator();
        patientCategorymn = new javax.swing.JMenu();
        patcategmnit = new javax.swing.JMenuItem();
        patientcollateralmnit = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JSeparator();
        wardsetupmn = new javax.swing.JMenu();
        wardprocmnit = new javax.swing.JMenuItem();
        bedsetupmnit = new javax.swing.JMenuItem();
        jSeparator26 = new javax.swing.JSeparator();
        medicalRecordsmn = new javax.swing.JMenu();
        diseasesmnit = new javax.swing.JMenuItem();
        jSeparator65 = new javax.swing.JSeparator();
        staffmn = new javax.swing.JMenu();
        docnursmnit = new javax.swing.JMenuItem();
        closedocaccmnit = new javax.swing.JMenuItem();
        jSeparator66 = new javax.swing.JSeparator();
        schememn = new javax.swing.JMenu();
        schemeprovmnit = new javax.swing.JMenuItem();
        schemeregmnit = new javax.swing.JMenuItem();
        schemeallmnit = new javax.swing.JMenuItem();
        suspschemepovmnit = new javax.swing.JMenuItem();
        suspschememnit = new javax.swing.JMenuItem();
        Ammendstaffregmnit = new javax.swing.JMenuItem();
        jSeparator70 = new javax.swing.JSeparator();
        nhifrebatesmnit = new javax.swing.JMenuItem();
        limitconsmnit = new javax.swing.JMenuItem();
        jSeparator71 = new javax.swing.JSeparator();
        approvedagentsmnit = new javax.swing.JMenuItem();
        jSeparator25 = new javax.swing.JSeparator();
        userprofmnit1 = new javax.swing.JMenuItem();
        jSeparator81 = new javax.swing.JSeparator();
        exitmnITb = new javax.swing.JMenuItem();
        patientmanagemn = new javax.swing.JMenu();
        patientregstmnit = new javax.swing.JMenuItem();
        patientregnummnit = new javax.swing.JMenuItem();
        serviceAccptslipmnit = new javax.swing.JMenuItem();
        generalmnit = new javax.swing.JMenuItem();
        jSeparator29 = new javax.swing.JSeparator();
        SchemeInvoicinmn = new javax.swing.JMenu();
        schememnit = new javax.swing.JMenuItem();
        Directinfomnit = new javax.swing.JMenuItem();
        debtinvoicingmnit = new javax.swing.JMenuItem();
        jSeparator79 = new javax.swing.JSeparator();
        approveinvmnit = new javax.swing.JMenuItem();
        approveinvmnit1 = new javax.swing.JMenuItem();
        mergdispmnit = new javax.swing.JMenuItem();
        DispConfirmationmnit = new javax.swing.JMenuItem();
        DispConfSummnit = new javax.swing.JMenuItem();
        jSeparator80 = new javax.swing.JSeparator();
        CreditnoteSchmnit = new javax.swing.JMenuItem();
        inpatcashinvmnit = new javax.swing.JMenuItem();
        jSeparator30 = new javax.swing.JSeparator();
        labmn = new javax.swing.JMenu();
        labprocmnit = new javax.swing.JMenuItem();
        labtestsresultmnit = new javax.swing.JMenuItem();
        labregmnit = new javax.swing.JMenuItem();
        labpendingmnit = new javax.swing.JMenuItem();
        xraymnit = new javax.swing.JMenuItem();
        theatremn = new javax.swing.JMenu();
        bookingschmnit = new javax.swing.JMenuItem();
        theatrediagmnit = new javax.swing.JMenuItem();
        theatreprocmnit = new javax.swing.JMenuItem();
        surgicalitemmnit = new javax.swing.JMenuItem();
        inpatientmn = new javax.swing.JMenu();
        admmssionntmnit = new javax.swing.JMenuItem();
        patdischmnit = new javax.swing.JMenuItem();
        wardproceduresmnit = new javax.swing.JMenuItem();
        nhifcreditsmnit = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JSeparator();
        patienttransfrmn = new javax.swing.JMenu();
        wardtfrmnit = new javax.swing.JMenuItem();
        Bedtrnsfrmnit = new javax.swing.JMenuItem();
        Bedchargesmnit = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        bedmagmentmn = new javax.swing.JMenu();
        bedmangtmnit = new javax.swing.JMenuItem();
        newbedmnit = new javax.swing.JMenuItem();
        bedbrekgsmnit = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JSeparator();
        billadjmn = new javax.swing.JMenu();
        billadjustmentmnit = new javax.swing.JMenuItem();
        surgicaladjmnit = new javax.swing.JMenuItem();
        medicalrecordsmn = new javax.swing.JMenu();
        bthregistermnit = new javax.swing.JMenuItem();
        jSeparator61 = new javax.swing.JSeparator();
        clinicsapp = new javax.swing.JMenu();
        bookingschsmnit = new javax.swing.JMenuItem();
        bookingsconfchmnit = new javax.swing.JMenuItem();
        vitalsignmnit = new javax.swing.JMenuItem();
        docnotesmnit = new javax.swing.JMenuItem();
        patientdiagnosismnit = new javax.swing.JMenuItem();
        refferalsmnit = new javax.swing.JMenuItem();
        jSeparator62 = new javax.swing.JSeparator();
        deathregistermnit = new javax.swing.JMenuItem();
        deathnotficationmnit = new javax.swing.JMenuItem();
        bodycollectionmnit = new javax.swing.JMenuItem();
        permitcollectormnit = new javax.swing.JMenuItem();
        jSeparator63 = new javax.swing.JSeparator();
        sickleavemnit = new javax.swing.JMenuItem();
        morturymn = new javax.swing.JMenu();
        admissmnit = new javax.swing.JMenuItem();
        mortdischmnit = new javax.swing.JMenuItem();
        gledgermn = new javax.swing.JMenu();
        cashbkmn = new javax.swing.JMenu();
        receiptsmn = new javax.swing.JMenu();
        receiptsmnit = new javax.swing.JMenuItem();
        inReceiptsmnit = new javax.swing.JMenuItem();
        Receiptsmnit = new javax.swing.JMenuItem();
        otherrecptmnit = new javax.swing.JMenuItem();
        rctdocfeesmnit = new javax.swing.JMenuItem();
        jSeparator72 = new javax.swing.JSeparator();
        directcashsalesmnit = new javax.swing.JMenuItem();
        inpatreceiptadjmnit = new javax.swing.JMenuItem();
        refundsmnit = new javax.swing.JMenuItem();
        raisevouchmnit = new javax.swing.JMenuItem();
        approvevouchmnit = new javax.swing.JMenuItem();
        jSeparator73 = new javax.swing.JSeparator();
        paymenmn = new javax.swing.JMenu();
        otherprmnit = new javax.swing.JMenuItem();
        Lumpotherprmnit = new javax.swing.JMenuItem();
        consultantspmnit = new javax.swing.JMenuItem();
        paymntadjmnit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        bankingmnit = new javax.swing.JMenuItem();
        Bankingmnit = new javax.swing.JMenuItem();
        bankreconcmnit = new javax.swing.JMenuItem();
        comfbankingmnit = new javax.swing.JMenuItem();
        bnkchargesmnit = new javax.swing.JMenuItem();
        jSeparator74 = new javax.swing.JSeparator();
        creditallocmnit = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        jrnloansmnit = new javax.swing.JMenuItem();
        pettycashmn = new javax.swing.JMenu();
        raisecashVouchmnit = new javax.swing.JMenuItem();
        payvouchermnit = new javax.swing.JMenuItem();
        pettycashpaymnit = new javax.swing.JMenuItem();
        printvouchermnit = new javax.swing.JMenuItem();
        jSeparator75 = new javax.swing.JSeparator();
        allocation = new javax.swing.JMenu();
        SchemeAllocmnit = new javax.swing.JMenuItem();
        partlyallocinvmnit = new javax.swing.JMenuItem();
        allocbypayermnit = new javax.swing.JMenuItem();
        adjustinvmnit = new javax.swing.JMenuItem();
        allocatewtocrtmnit = new javax.swing.JMenuItem();
        automatedwoffsmnit = new javax.swing.JMenuItem();
        appdocinvmnit = new javax.swing.JMenuItem();
        jSeparator76 = new javax.swing.JSeparator();
        miscsCreditorsmnit = new javax.swing.JMenuItem();
        jSeparator77 = new javax.swing.JSeparator();
        debtorsTransactionsmn = new javax.swing.JMenu();
        credittransfmnit = new javax.swing.JMenuItem();
        miscdebtorsmnit = new javax.swing.JMenuItem();
        mergschaccmnit = new javax.swing.JMenuItem();
        changepayermnit = new javax.swing.JMenuItem();
        chgintrmnit = new javax.swing.JMenuItem();
        returnedclms = new javax.swing.JMenu();
        rtclaimsmnit = new javax.swing.JMenuItem();
        resubmitclaimsmnit = new javax.swing.JMenuItem();
        Provisiontransmn = new javax.swing.JMenu();
        provisionsmnit = new javax.swing.JMenuItem();
        provisionsperdebtormnit = new javax.swing.JMenuItem();
        writeoffs = new javax.swing.JMenu();
        Writeoffsmnit = new javax.swing.JMenuItem();
        Writeoffscrtmnit = new javax.swing.JMenuItem();
        jSeparator78 = new javax.swing.JSeparator();
        shiftmn = new javax.swing.JMenu();
        closeshiftmnit = new javax.swing.JMenuItem();
        suspendmnit = new javax.swing.JMenuItem();
        assetsmn = new javax.swing.JMenu();
        Depreciationmnit = new javax.swing.JMenuItem();
        Depreciationratesmnit = new javax.swing.JMenuItem();
        AssetAllocmnit = new javax.swing.JMenuItem();
        asstregmnit = new javax.swing.JMenuItem();
        assetlocmnit = new javax.swing.JMenuItem();
        insurancemnit = new javax.swing.JMenuItem();
        assetrepmnit = new javax.swing.JMenuItem();
        Loanregmnit = new javax.swing.JMenuItem();
        budgetmn = new javax.swing.JMenu();
        budgetsectmint = new javax.swing.JMenuItem();
        budgetdeptmnit = new javax.swing.JMenuItem();
        budgettotalmnit = new javax.swing.JMenuItem();
        budgetamendmnit = new javax.swing.JMenuItem();
        managementmn = new javax.swing.JMenu();
        Deprecmnit = new javax.swing.JMenuItem();
        Deprecatesmnit = new javax.swing.JMenuItem();
        AssetAlmnit = new javax.swing.JMenuItem();
        asrepmnit = new javax.swing.JMenuItem();
        astregmnit = new javax.swing.JMenuItem();
        aslocmnit = new javax.swing.JMenuItem();
        insuncemnit = new javax.swing.JMenuItem();
        jSeparator32 = new javax.swing.JSeparator();
        BedOccmnit = new javax.swing.JMenuItem();
        Revmnit = new javax.swing.JMenuItem();
        Aiemnit = new javax.swing.JMenuItem();
        AieRepmnit = new javax.swing.JMenuItem();
        reportsmn = new javax.swing.JMenu();
        inpatmn = new javax.swing.JMenu();
        Pregistermn = new javax.swing.JMenu();
        ordersmnit = new javax.swing.JMenuItem();
        admissiomnit = new javax.swing.JMenuItem();
        dischargesmnit = new javax.swing.JMenuItem();
        Wardsmn = new javax.swing.JMenu();
        quotationmnit = new javax.swing.JMenuItem();
        admissbywardmnit = new javax.swing.JMenuItem();
        patbedoccupancymnit = new javax.swing.JMenuItem();
        wardoccstatisticsmnit = new javax.swing.JMenuItem();
        bedoccupancymnit = new javax.swing.JMenuItem();
        wardoccupancymnit = new javax.swing.JMenuItem();
        ipdaysmnit = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JSeparator();
        Interiminvoicemn = new javax.swing.JMenu();
        interimtxt = new javax.swing.JMenuItem();
        interiminvmnit = new javax.swing.JMenuItem();
        billsummnit = new javax.swing.JMenuItem();
        patientaccmnit = new javax.swing.JMenuItem();
        finalinvmn = new javax.swing.JMenu();
        finalinpatinvsummnit = new javax.swing.JMenuItem();
        finalinpatinvmnit = new javax.swing.JMenuItem();
        finalindetpatinvmnit = new javax.swing.JMenuItem();
        InPatInvCashmnit = new javax.swing.JMenuItem();
        InPatsInvTotalmnit1 = new javax.swing.JMenuItem();
        Finalinvoicetxt = new javax.swing.JMenuItem();
        jSeparator35 = new javax.swing.JSeparator();
        suppliersmnit = new javax.swing.JMenuItem();
        outstandingordersmnit = new javax.swing.JMenuItem();
        outpatmn = new javax.swing.JMenu();
        dailyissiuesmnit = new javax.swing.JMenuItem();
        Attendancesummnit = new javax.swing.JMenuItem();
        attsheetmnit = new javax.swing.JMenuItem();
        patperdeptmnit = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JSeparator();
        printreceiptmnit = new javax.swing.JMenuItem();
        intinvmnit = new javax.swing.JMenuItem();
        invbyinvmnit = new javax.swing.JMenuItem();
        Outpatientinvoicetxt = new javax.swing.JMenuItem();
        Detinvbyinvmnit = new javax.swing.JMenuItem();
        patstmtmnit = new javax.swing.JMenuItem();
        detailedpatstmtmnit = new javax.swing.JMenuItem();
        jSeparator24 = new javax.swing.JSeparator();
        stockbalancesmnit = new javax.swing.JMenuItem();
        stockjournalsmnit = new javax.swing.JMenuItem();
        patlabresultsmnit = new javax.swing.JMenuItem();
        jSeparator82 = new javax.swing.JSeparator();
        patacctmn = new javax.swing.JMenu();
        invoicesmn = new javax.swing.JMenu();
        unfinalisedinvmnit = new javax.swing.JMenuItem();
        unfinalisedinvmnit1 = new javax.swing.JMenuItem();
        finalisedinvmnit = new javax.swing.JMenuItem();
        totalschemeinvlistmnit = new javax.swing.JMenuItem();
        pativoicesmnit = new javax.swing.JMenuItem();
        jSeparator33 = new javax.swing.JSeparator();
        invoicemnit = new javax.swing.JMenuItem();
        distinvmnit = new javax.swing.JMenuItem();
        nhifinvoicemnit = new javax.swing.JMenuItem();
        nhifcredits = new javax.swing.JMenuItem();
        jSeparator34 = new javax.swing.JSeparator();
        IPCreditmnit = new javax.swing.JMenuItem();
        Opcreditmnit = new javax.swing.JMenuItem();
        Debtorscrnotemnit = new javax.swing.JMenuItem();
        creditnotesmnit = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JSeparator();
        Receiptmn = new javax.swing.JMenu();
        patreceiptsmnit = new javax.swing.JMenuItem();
        allreceiptsmnit = new javax.swing.JMenuItem();
        receiptscopymnit = new javax.swing.JMenuItem();
        receiptperpayermnit = new javax.swing.JMenuItem();
        debreceiptsmnit = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JSeparator();
        detstmtmn = new javax.swing.JMenu();
        statementofaccmnit = new javax.swing.JMenuItem();
        detailedstmtmnit = new javax.swing.JMenuItem();
        scmepfmmnit = new javax.swing.JMenuItem();
        schmsdebtCollmnit = new javax.swing.JMenuItem();
        schemesalesmnit = new javax.swing.JMenuItem();
        detailedstmtmnit1 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JSeparator();
        Statementsmn = new javax.swing.JMenu();
        submStmtmnit = new javax.swing.JMenuItem();
        debtorsStmtmnit = new javax.swing.JMenuItem();
        DebtStatementmnit = new javax.swing.JMenuItem();
        payerdetStmtmnit = new javax.swing.JMenuItem();
        stmtsummperdebtmnit = new javax.swing.JMenuItem();
        debtorsyearlybalmnit = new javax.swing.JMenuItem();
        debtosbalmnit = new javax.swing.JMenuItem();
        exceedlimitsmnit = new javax.swing.JMenuItem();
        extactscmmnit = new javax.swing.JMenuItem();
        payerperfmmnit = new javax.swing.JMenuItem();
        payertnovermnit = new javax.swing.JMenuItem();
        detdebtorsStmtmnit = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JSeparator();
        ageingmn = new javax.swing.JMenu();
        compdebtorsmnit = new javax.swing.JMenuItem();
        payerageingmnit = new javax.swing.JMenuItem();
        payerageingsummnit = new javax.swing.JMenuItem();
        annualageingmnit = new javax.swing.JMenuItem();
        anualPayeragmnit = new javax.swing.JMenuItem();
        annualpayersummnit = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JSeparator();
        SchemeDetailsmn = new javax.swing.JMenu();
        schemestaffmnit = new javax.swing.JMenuItem();
        scmattendsummnit = new javax.swing.JMenuItem();
        attdperscmdetmnit = new javax.swing.JMenuItem();
        payerstaffamdmnit = new javax.swing.JMenuItem();
        Scmammnit = new javax.swing.JMenuItem();
        jSeparator85 = new javax.swing.JSeparator();
        scmstatusmnit = new javax.swing.JMenuItem();
        scmperfrmnit = new javax.swing.JMenuItem();
        autolimitsmnit = new javax.swing.JMenuItem();
        payeractaccmnit = new javax.swing.JMenuItem();
        scmabtlimitmnit = new javax.swing.JMenuItem();
        jSeparator86 = new javax.swing.JSeparator();
        accabtexpiremnit = new javax.swing.JMenuItem();
        expiredaccmnit = new javax.swing.JMenuItem();
        closedschemesmnit = new javax.swing.JMenuItem();
        jSeparator87 = new javax.swing.JSeparator();
        marketertnovermnit = new javax.swing.JMenuItem();
        creditorsmn = new javax.swing.JMenu();
        creditorsinvmnit = new javax.swing.JMenuItem();
        invpercrdmnit = new javax.swing.JMenuItem();
        supplierinvmnit = new javax.swing.JMenuItem();
        invpersuppliermnit = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JSeparator();
        CrdVouchermnit = new javax.swing.JMenuItem();
        Paymentsmnit = new javax.swing.JMenuItem();
        paymentspercreditormnit = new javax.swing.JMenuItem();
        payeepymtmnit = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JSeparator();
        crdstmtmnit = new javax.swing.JMenuItem();
        crdtstmtmnit = new javax.swing.JMenuItem();
        storesrevmnit = new javax.swing.JMenuItem();
        jSeparator43 = new javax.swing.JSeparator();
        payrollledgermnit = new javax.swing.JMenuItem();
        jSeparator44 = new javax.swing.JSeparator();
        Creditorsmnit = new javax.swing.JMenuItem();
        ageingbycatmnit = new javax.swing.JMenuItem();
        grtsuppliermnit1 = new javax.swing.JMenuItem();
        managmn = new javax.swing.JMenu();
        Doctorslistmn = new javax.swing.JMenu();
        doctorslistmnit = new javax.swing.JMenuItem();
        nursesmnit = new javax.swing.JMenuItem();
        accstatusmnit = new javax.swing.JMenuItem();
        jSeparator54 = new javax.swing.JSeparator();
        Voucherdetailsmn = new javax.swing.JMenu();
        docVouchermnit = new javax.swing.JMenuItem();
        detvouchmnit = new javax.swing.JMenuItem();
        paymentVouchermnit = new javax.swing.JMenuItem();
        jSeparator55 = new javax.swing.JSeparator();
        doctorsStamntmn = new javax.swing.JMenu();
        paymentsperdocmnit = new javax.swing.JMenuItem();
        paymentperdocSummnit = new javax.swing.JMenuItem();
        jSeparator58 = new javax.swing.JSeparator();
        doctorsstmtmnit = new javax.swing.JMenuItem();
        doctstmtpaidinvmnit = new javax.swing.JMenuItem();
        doctorsstatementmnit = new javax.swing.JMenuItem();
        stmtscmmnit = new javax.swing.JMenuItem();
        jSeparator60 = new javax.swing.JSeparator();
        docunpaidinvmnit = new javax.swing.JMenuItem();
        jSeparator59 = new javax.swing.JSeparator();
        stmtperdebtmnit = new javax.swing.JMenuItem();
        paidupperdebtmnit = new javax.swing.JMenuItem();
        paidupbyscmnit = new javax.swing.JMenuItem();
        jSeparator56 = new javax.swing.JSeparator();
        whtstamentsmn = new javax.swing.JMenu();
        whtmnit = new javax.swing.JMenuItem();
        whtperdocmnit = new javax.swing.JMenuItem();
        whtsummnit = new javax.swing.JMenuItem();
        jSeparator57 = new javax.swing.JSeparator();
        doctorslistsrmtmn = new javax.swing.JMenu();
        doctorspaymentsmnit = new javax.swing.JMenuItem();
        doctorledgermnit = new javax.swing.JMenuItem();
        paidupsummmnit = new javax.swing.JMenuItem();
        docbalsummnit = new javax.swing.JMenuItem();
        docearndeductmnit = new javax.swing.JMenuItem();
        jSeparator83 = new javax.swing.JSeparator();
        financeopermn = new javax.swing.JMenu();
        CashierRepmn = new javax.swing.JMenu();
        chartaccountsmnit = new javax.swing.JMenuItem();
        shiftrepmnit = new javax.swing.JMenuItem();
        shiftrepDetmnit = new javax.swing.JMenuItem();
        uncollectedshiftsmnit = new javax.swing.JMenuItem();
        shiftstotalmnit = new javax.swing.JMenuItem();
        totalinpatrecmnit = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JSeparator();
        Salesmn = new javax.swing.JMenu();
        Cashanalysismnit = new javax.swing.JMenuItem();
        Cashsalesmnit = new javax.swing.JMenuItem();
        CashSalesbrdmnit = new javax.swing.JMenuItem();
        Salesmnit = new javax.swing.JMenuItem();
        markupbelowmnit = new javax.swing.JMenuItem();
        jSeparator45 = new javax.swing.JSeparator();
        RevReportmd = new javax.swing.JMenu();
        dailyrevmnit = new javax.swing.JMenuItem();
        revperdepmnit = new javax.swing.JMenuItem();
        transperaccmnit = new javax.swing.JMenuItem();
        revrepmnit = new javax.swing.JMenuItem();
        oprevrptmnit = new javax.swing.JMenuItem();
        oprevbyaccmnit = new javax.swing.JMenuItem();
        iprevrptmnit = new javax.swing.JMenuItem();
        iprevbyaccmnit = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JSeparator();
        oprevbrkdwnmnit = new javax.swing.JMenuItem();
        jSeparator47 = new javax.swing.JSeparator();
        pettycashRepmn = new javax.swing.JMenu();
        pettycashpmtmnit = new javax.swing.JMenuItem();
        pettycashreqmnit = new javax.swing.JMenuItem();
        pettycashVouchmnit = new javax.swing.JMenuItem();
        pettycashshiftsmnit = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JSeparator();
        otherVouchermnit = new javax.swing.JMenuItem();
        jSeparator27 = new javax.swing.JSeparator();
        expensesmnit = new javax.swing.JMenuItem();
        jSeparator28 = new javax.swing.JSeparator();
        journalmnit = new javax.swing.JMenuItem();
        jSeparator46 = new javax.swing.JSeparator();
        pharmacymnit = new javax.swing.JMenuItem();
        glreportsmn = new javax.swing.JMenu();
        transactionslsmnitmnit = new javax.swing.JMenuItem();
        jSeparator48 = new javax.swing.JSeparator();
        CashBookmn = new javax.swing.JMenu();
        cashBookmnit = new javax.swing.JMenuItem();
        postdatedchqmnit = new javax.swing.JMenuItem();
        cancelledchqmnit = new javax.swing.JMenuItem();
        cbookbalancesmnit = new javax.swing.JMenuItem();
        banksummnit = new javax.swing.JMenuItem();
        cashflowoptmnit = new javax.swing.JMenuItem();
        jSeparator49 = new javax.swing.JSeparator();
        Bankrepmn = new javax.swing.JMenu();
        bankingsmnit = new javax.swing.JMenuItem();
        bankreccmnit = new javax.swing.JMenuItem();
        Unreconcitemsmnit = new javax.swing.JMenuItem();
        unrecitemsmnit = new javax.swing.JMenuItem();
        bankrecdiscrpmnit = new javax.swing.JMenuItem();
        jSeparator50 = new javax.swing.JSeparator();
        profitlossmn = new javax.swing.JMenu();
        pnlmnit = new javax.swing.JMenuItem();
        anualplmnit = new javax.swing.JMenuItem();
        pnlmnit1 = new javax.swing.JMenuItem();
        jSeparator51 = new javax.swing.JSeparator();
        Trialbalancemn = new javax.swing.JMenu();
        trialbalancemnit = new javax.swing.JMenuItem();
        DtlTrialBalancemnit1 = new javax.swing.JMenuItem();
        Annualtbmnit = new javax.swing.JMenuItem();
        Annualtbmnit1 = new javax.swing.JMenuItem();
        jSeparator481 = new javax.swing.JSeparator();
        acctdetmnit = new javax.swing.JMenuItem();
        jSeparator491 = new javax.swing.JSeparator();
        lbalancesheetmnit = new javax.swing.JMenuItem();
        jSeparator501 = new javax.swing.JSeparator();
        deptincexpmnit = new javax.swing.JMenuItem();
        jSeparator511 = new javax.swing.JSeparator();
        transbyaccmnit = new javax.swing.JMenuItem();
        Transsummnit = new javax.swing.JMenuItem();
        jSeparator52 = new javax.swing.JSeparator();
        journalsmnit = new javax.swing.JMenuItem();
        paymentssummnit = new javax.swing.JMenuItem();
        jSeparator53 = new javax.swing.JSeparator();
        Taxesmn = new javax.swing.JMenu();
        CorporateTaxmnit = new javax.swing.JMenuItem();
        taxreturnmnit = new javax.swing.JMenuItem();
        ManagementReportmn = new javax.swing.JMenu();
        Dailyrevmnit = new javax.swing.JMenuItem();
        jSeparator36 = new javax.swing.JSeparator();
        weeklyrevmnit = new javax.swing.JMenuItem();
        weeklyrevCompmnit = new javax.swing.JMenuItem();
        jSeparator37 = new javax.swing.JSeparator();
        Monthrevmnit = new javax.swing.JMenuItem();
        MonthrevCompmnit = new javax.swing.JMenuItem();
        jSeparator38 = new javax.swing.JSeparator();
        Quarterrevmnit = new javax.swing.JMenuItem();
        QuartelyRevCompmnit = new javax.swing.JMenuItem();
        jSeparator39 = new javax.swing.JSeparator();
        Yearyrevmnit = new javax.swing.JMenuItem();
        jSeparator40 = new javax.swing.JSeparator();
        Diagnosisanalysismnit = new javax.swing.JMenuItem();
        MonthlyDiagAnalysismnit = new javax.swing.JMenuItem();
        jSeparator42 = new javax.swing.JSeparator();
        InpatientAnalysismnit = new javax.swing.JMenuItem();
        jSeparator84 = new javax.swing.JSeparator();
        listsmn = new javax.swing.JMenu();
        revenuemnit = new javax.swing.JMenuItem();
        schemesmnit = new javax.swing.JMenuItem();
        specimensmnit = new javax.swing.JMenuItem();
        timelogmnit = new javax.swing.JMenuItem();
        pharmperformmnit = new javax.swing.JMenuItem();
        laboratoryresultsmnit = new javax.swing.JMenuItem();
        chekinmnit = new javax.swing.JMenuItem();
        patientdiagmnit = new javax.swing.JMenuItem();
        Diagnosissummnit = new javax.swing.JMenuItem();
        revpricelistmnit = new javax.swing.JMenuItem();
        jSeparator841 = new javax.swing.JSeparator();
        claimsmn = new javax.swing.JMenu();
        unapprovedinvmn = new javax.swing.JMenu();
        Perschememnit = new javax.swing.JMenuItem();
        Perdebtormnit = new javax.swing.JMenuItem();
        Summarymnit = new javax.swing.JMenuItem();
        approvedinvmn = new javax.swing.JMenu();
        Schememnit = new javax.swing.JMenuItem();
        debtormnit = new javax.swing.JMenuItem();
        dispatchschmn = new javax.swing.JMenu();
        dispatchmnit = new javax.swing.JMenuItem();
        displistmnit = new javax.swing.JMenuItem();
        dispperscmnit = new javax.swing.JMenuItem();
        dispperdebtmnit = new javax.swing.JMenuItem();
        nhifdispmnit = new javax.swing.JMenuItem();
        DispatchSummnit = new javax.swing.JMenuItem();
        unpaidDispInvmnit = new javax.swing.JMenuItem();
        dispatchperpayersummnit = new javax.swing.JMenuItem();
        Dispdelnotemnit = new javax.swing.JMenuItem();
        dispconf = new javax.swing.JMenu();
        confdispsummnit = new javax.swing.JMenuItem();
        confdispperscmnit = new javax.swing.JMenuItem();
        dispconfperpayermnit = new javax.swing.JMenuItem();
        dormaccmnit = new javax.swing.JMenuItem();
        debtcollsummnit = new javax.swing.JMenuItem();
        ScmsalesSummnit = new javax.swing.JMenuItem();
        retuenedclaims = new javax.swing.JMenu();
        rtclaimssummnit = new javax.swing.JMenuItem();
        rtclaimsbyscmnit = new javax.swing.JMenuItem();
        resubmissionbyschmnit = new javax.swing.JMenuItem();
        allocationmn = new javax.swing.JMenu();
        allocsummnit = new javax.swing.JMenuItem();
        debtallocsumnit = new javax.swing.JMenuItem();
        allocationrepmnit = new javax.swing.JMenuItem();
        scmallocsummnit = new javax.swing.JMenuItem();
        debtrectallocmnit = new javax.swing.JMenuItem();
        invwithbalmnit = new javax.swing.JMenuItem();
        allocsummperdebtmnit = new javax.swing.JMenuItem();
        allocsumnit = new javax.swing.JMenuItem();
        allocchqmnit = new javax.swing.JMenuItem();
        creditsbypayermnit = new javax.swing.JMenuItem();
        Payerallocdetmnit = new javax.swing.JMenuItem();
        creditsSummnit = new javax.swing.JMenuItem();
        unallocpymmnit = new javax.swing.JMenuItem();
        provisionsmn = new javax.swing.JMenu();
        Provisionssummnit = new javax.swing.JMenuItem();
        provperdebtmnit = new javax.swing.JMenuItem();
        provperschmnit = new javax.swing.JMenuItem();
        provperdocmnit = new javax.swing.JMenuItem();
        docprovsummnit = new javax.swing.JMenuItem();
        provdocscmnit = new javax.swing.JMenuItem();
        wrt = new javax.swing.JMenu();
        wrtperscmnit = new javax.swing.JMenuItem();
        wrtsummnit = new javax.swing.JMenuItem();
        jSeparator821 = new javax.swing.JSeparator();
        loanstock = new javax.swing.JMenu();
        loanstmtmnit = new javax.swing.JMenuItem();
        loanageingmnit = new javax.swing.JMenuItem();
        jSeparator831 = new javax.swing.JSeparator();
        Labmn = new javax.swing.JMenu();
        labresultsindmnit = new javax.swing.JMenuItem();
        laborresultsmnit = new javax.swing.JMenuItem();
        labsspecimensmnit = new javax.swing.JMenuItem();
        PatientRecordsmn = new javax.swing.JMenu();
        clinicsbookings = new javax.swing.JMenu();
        Bookingsmnit = new javax.swing.JMenuItem();
        ConfirmedBookingsmnit = new javax.swing.JMenuItem();
        newbornsmnit = new javax.swing.JMenuItem();
        deathsmnit = new javax.swing.JMenuItem();
        sickoffsmnit = new javax.swing.JMenuItem();
        viewsmn = new javax.swing.JMenu();
        namesearchmnit = new javax.swing.JMenuItem();
        departmentmnit = new javax.swing.JMenuItem();
        patstmtsmnit = new javax.swing.JMenuItem();
        patdocstmtmnit = new javax.swing.JMenuItem();
        changepaymodesmnit = new javax.swing.JMenuItem();
        changeiplimitmnit = new javax.swing.JMenuItem();
        patstmtsummnit = new javax.swing.JMenuItem();
        jSeparator88 = new javax.swing.JSeparator();
        invammendmnit = new javax.swing.JMenuItem();
        merginvmnit = new javax.swing.JMenuItem();
        jSeparator89 = new javax.swing.JSeparator();
        schmdetmnit = new javax.swing.JMenuItem();
        jSeparator881 = new javax.swing.JSeparator();
        AmendCreditmnit = new javax.swing.JMenuItem();
        AmendCashbookmnit = new javax.swing.JMenuItem();
        systemn = new javax.swing.JMenu();
        stockmnit1 = new javax.swing.JMenuItem();
        accountsmnit1 = new javax.swing.JMenuItem();
        assetmgtmnit1 = new javax.swing.JMenuItem();
        fahrmnit1 = new javax.swing.JMenuItem();
        reportsmnit1 = new javax.swing.JMenuItem();
        docsmnit1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
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
        xpskinmn = new javax.swing.JMenu();
        officexpmn = new javax.swing.JMenuItem();
        office2003mn = new javax.swing.JMenuItem();
        studio2k5mn = new javax.swing.JMenuItem();
        utilitymn = new javax.swing.JMenu();
        opbalmnit = new javax.swing.JMenuItem();
        cpactdatamnit = new javax.swing.JMenuItem();
        validatamnit = new javax.swing.JMenuItem();
        bkupmnit = new javax.swing.JMenuItem();
        optimdbmnit = new javax.swing.JMenuItem();
        monthlyroutinemnit = new javax.swing.JMenuItem();
        yearlyrotinemnit = new javax.swing.JMenuItem();
        setaccperiodmnit = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JSeparator();
        chgpasswdmnit = new javax.swing.JMenuItem();
        updatedomainsmnit1 = new javax.swing.JMenuItem();
        restoredatamnit = new javax.swing.JMenuItem();
        Yearlyhlpsetsmnit = new javax.swing.JMenuItem();
        Approvemnit = new javax.swing.JMenuItem();
        mbVerifymnit = new javax.swing.JMenuItem();
        receiptPrefsmnit = new javax.swing.JMenuItem();
        docsdirmnit = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        changeBackgoundImagemnit1 = new javax.swing.JMenuItem();
        reportPrefsmnit = new javax.swing.JMenuItem();
        writeofflimitsmnit = new javax.swing.JMenuItem();
        helpmn = new javax.swing.JMenu();
        hlpcontmnit = new javax.swing.JMenuItem();
        hlpcontmnit.addActionListener(new CSH.DisplayHelpFromSource(helpBroker));
        aboutmn = new javax.swing.JMenuItem();

        graphViewDialog.getContentPane().setLayout(new java.awt.GridBagLayout());

        graphViewDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        graphViewDialog.setTitle("Column Filter");
        graphViewDialog.setModal(true);
        valuesAxisSelector.setLayout(new java.awt.GridBagLayout());

        valuesAxisSelector.setBorder(new javax.swing.border.TitledBorder("Column Selector"));
        columnSelectorScrollPane.setViewportView(columnSelectorTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        valuesAxisSelector.add(columnSelectorScrollPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 50.0;
        gridBagConstraints.weighty = 50.0;
        graphViewDialog.getContentPane().add(valuesAxisSelector, gridBagConstraints);

        xaxisColumnPanel.setLayout(new java.awt.GridBagLayout());

        xaxisColumnPanel.setBorder(new javax.swing.border.TitledBorder("X-Axis Selector"));
        xaxisComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xaxisComboBoxActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        xaxisColumnPanel.add(xaxisComboBox, gridBagConstraints);

        xaxisLabel.setText("Select X-Axis variable");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        xaxisColumnPanel.add(xaxisLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        graphViewDialog.getContentPane().add(xaxisColumnPanel, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new javax.swing.border.TitledBorder("Actions"));
        submitQuery.setText("Submit Values");
        submitQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitQueryActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(submitQuery, gridBagConstraints);

        cancelQuery.setText("Cancel Query");
        cancelQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelQueryActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(cancelQuery, gridBagConstraints);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        barChart.setMnemonic('B');
        barChart.setText("Bar Chart");
        chartButtonGroup.add(barChart);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(barChart, gridBagConstraints);

        pieChart.setMnemonic('P');
        pieChart.setText("Pie Chart");
        chartButtonGroup.add(pieChart);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(pieChart, gridBagConstraints);

        xyChart.setMnemonic('X');
        xyChart.setText("XY Chart");
        chartButtonGroup.add(xyChart);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(xyChart, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jPanel2.add(jPanel7, gridBagConstraints);

        closeDialog.setText("Close");
        closeDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDialogActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(closeDialog, gridBagConstraints);

        help.setText("Help");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(help, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        graphViewDialog.getContentPane().add(jPanel2, gridBagConstraints);

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        mainPanel.setLayout(new java.awt.GridBagLayout());

        mainSplitPane.setDividerLocation(250);
        mainSplitPane.setName("Hospital Operations");
        mainSplitPane.setOneTouchExpandable(true);
        mainSplitPane.setOpaque(false);
        mainSplitPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                mainSplitPaneComponentShown(evt);
            }
        });

        treePane.setLayout(new java.awt.GridBagLayout());

        treePane.setBorder(new javax.swing.border.EtchedBorder());
        mainSplitPane.setLeftComponent(treePane);

        desktopPane.setLayout(new java.awt.GridBagLayout());

        desktopPane.setBorder(new javax.swing.border.EtchedBorder());
        desktopPane.setOpaque(false);
        saccopn.setOpaque(false);
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 50.0;
        desktopPane.add(saccopn, gridBagConstraints);

        mainSplitPane.setRightComponent(desktopPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        mainPanel.add(mainSplitPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 500.0;
        getContentPane().add(mainPanel, gridBagConstraints);

        jToolBar3.setBorder(new javax.swing.border.EtchedBorder());
        jToolBar3.setFloatable(false);
        fmgrBttn.setToolTipText("File Manager");
        fmgrBttn.setBorder(new javax.swing.border.TitledBorder(""));
        fmgrBttn.setMaximumSize(new java.awt.Dimension(26, 26));
        fmgrBttn.setMinimumSize(new java.awt.Dimension(26, 26));
        fmgrBttn.setPreferredSize(new java.awt.Dimension(26, 26));
        fmgrBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmgrBttnActionPerformed(evt);
            }
        });

        jToolBar3.add(fmgrBttn);

        calcBttn.setToolTipText("Calculator");
        calcBttn.setAlignmentX(0.5F);
        calcBttn.setBorder(new javax.swing.border.TitledBorder(""));
        calcBttn.setMaximumSize(new java.awt.Dimension(26, 26));
        calcBttn.setMinimumSize(new java.awt.Dimension(26, 26));
        calcBttn.setPreferredSize(new java.awt.Dimension(26, 26));
        calcBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBttnActionPerformed(evt);
            }
        });

        jToolBar3.add(calcBttn);

        brwsrBttn.setToolTipText("Internet browser");
        brwsrBttn.setBorder(new javax.swing.border.TitledBorder(""));
        brwsrBttn.setMaximumSize(new java.awt.Dimension(26, 26));
        brwsrBttn.setMinimumSize(new java.awt.Dimension(26, 26));
        brwsrBttn.setPreferredSize(new java.awt.Dimension(26, 26));
        brwsrBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brwsrBttnActionPerformed(evt);
            }
        });

        jToolBar3.add(brwsrBttn);

        editButtn.setToolTipText("Word processor");
        editButtn.setBorder(new javax.swing.border.TitledBorder(""));
        editButtn.setMaximumSize(new java.awt.Dimension(26, 26));
        editButtn.setMinimumSize(new java.awt.Dimension(26, 26));
        editButtn.setPreferredSize(new java.awt.Dimension(26, 26));
        editButtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtnActionPerformed(evt);
            }
        });

        jToolBar3.add(editButtn);

        mtmediaBttn1.setToolTipText("Multimedia player");
        mtmediaBttn1.setBorder(new javax.swing.border.TitledBorder(""));
        mtmediaBttn1.setMaximumSize(new java.awt.Dimension(26, 26));
        mtmediaBttn1.setMinimumSize(new java.awt.Dimension(26, 26));
        mtmediaBttn1.setPreferredSize(new java.awt.Dimension(26, 26));
        mtmediaBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtmediaBttn1ActionPerformed(evt);
            }
        });

        jToolBar3.add(mtmediaBttn1);

        mailBttn.setToolTipText("Email utility");
        mailBttn.setBorder(new javax.swing.border.TitledBorder(""));
        mailBttn.setMaximumSize(new java.awt.Dimension(26, 26));
        mailBttn.setMinimumSize(new java.awt.Dimension(26, 26));
        mailBttn.setPreferredSize(new java.awt.Dimension(26, 26));
        mailBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailBttnActionPerformed(evt);
            }
        });

        jToolBar3.add(mailBttn);

        mtmediaBttn.setToolTipText("Multimedia player");
        mtmediaBttn.setBorder(new javax.swing.border.TitledBorder(""));
        mtmediaBttn.setMaximumSize(new java.awt.Dimension(26, 26));
        mtmediaBttn.setMinimumSize(new java.awt.Dimension(26, 26));
        mtmediaBttn.setPreferredSize(new java.awt.Dimension(26, 26));
        mtmediaBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtmediaBttnActionPerformed(evt);
            }
        });

        jToolBar3.add(mtmediaBttn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jToolBar3, gridBagConstraints);

        jToolBar31.setBorder(new javax.swing.border.EtchedBorder());
        jToolBar31.setFloatable(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        jToolBar31.add(jPanel1);

        helpButton.setToolTipText("Get system help");
        helpButton.setBorder(new javax.swing.border.TitledBorder(""));
        helpButton.setMaximumSize(new java.awt.Dimension(40, 26));
        helpButton.setMinimumSize(new java.awt.Dimension(40, 26));
        helpButton.setPreferredSize(new java.awt.Dimension(40, 26));
        jToolBar31.add(helpButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jToolBar31, gridBagConstraints);

        jToolBar311.setBorder(new javax.swing.border.EtchedBorder());
        jToolBar311.setFloatable(false);
        operationsToolBar.setToolTipText("Operations");
        operationsToolBar.setBorder(new javax.swing.border.TitledBorder(""));
        operationsToolBar.setMaximumSize(new java.awt.Dimension(26, 26));
        operationsToolBar.setMinimumSize(new java.awt.Dimension(26, 26));
        operationsToolBar.setPreferredSize(new java.awt.Dimension(26, 26));
        operationsToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationsToolBarActionPerformed(evt);
            }
        });

        jToolBar311.add(operationsToolBar);

        pharmacyToolBar.setToolTipText("Pharmacy");
        pharmacyToolBar.setBorder(new javax.swing.border.TitledBorder(""));
        pharmacyToolBar.setMaximumSize(new java.awt.Dimension(26, 26));
        pharmacyToolBar.setMinimumSize(new java.awt.Dimension(26, 26));
        pharmacyToolBar.setPreferredSize(new java.awt.Dimension(26, 26));
        pharmacyToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyToolBarActionPerformed(evt);
            }
        });

        jToolBar311.add(pharmacyToolBar);

        payrollToolBar.setToolTipText("Payroll");
        payrollToolBar.setBorder(new javax.swing.border.TitledBorder(""));
        payrollToolBar.setMaximumSize(new java.awt.Dimension(26, 26));
        payrollToolBar.setMinimumSize(new java.awt.Dimension(26, 26));
        payrollToolBar.setPreferredSize(new java.awt.Dimension(26, 26));
        payrollToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollToolBarActionPerformed(evt);
            }
        });

        jToolBar311.add(payrollToolBar);

        reportsToolBar.setToolTipText("Reports");
        reportsToolBar.setBorder(new javax.swing.border.TitledBorder(""));
        reportsToolBar.setMaximumSize(new java.awt.Dimension(26, 26));
        reportsToolBar.setMinimumSize(new java.awt.Dimension(26, 26));
        reportsToolBar.setPreferredSize(new java.awt.Dimension(26, 26));
        reportsToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsToolBarActionPerformed(evt);
            }
        });

        jToolBar311.add(reportsToolBar);

        openShift.setToolTipText("Open Shift");
        openShift.setAction(openShiftAction);
        openShift.setBorder(new javax.swing.border.TitledBorder(""));
        openShift.setMaximumSize(new java.awt.Dimension(26, 26));
        openShift.setMinimumSize(new java.awt.Dimension(26, 26));
        openShift.setPreferredSize(new java.awt.Dimension(26, 26));
        openShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openShiftActionPerformed(evt);
            }
        });

        jToolBar311.add(openShift);

        closeShift.setToolTipText("Close Shift");
        closeShift.setBorder(new javax.swing.border.TitledBorder(""));
        closeShift.setMaximumSize(new java.awt.Dimension(26, 26));
        closeShift.setMinimumSize(new java.awt.Dimension(26, 26));
        closeShift.setPreferredSize(new java.awt.Dimension(26, 26));
        closeShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeShiftActionPerformed(evt);
            }
        });

        jToolBar311.add(closeShift);

        suspendShift.setToolTipText("Suspend Shift");
        suspendShift.setBorder(new javax.swing.border.TitledBorder(""));
        suspendShift.setMaximumSize(new java.awt.Dimension(26, 26));
        suspendShift.setMinimumSize(new java.awt.Dimension(26, 26));
        suspendShift.setPreferredSize(new java.awt.Dimension(26, 26));
        suspendShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspendShiftActionPerformed(evt);
            }
        });

        jToolBar311.add(suspendShift);

        optimizeDB.setToolTipText("DB Optimize");
        optimizeDB.setBorder(new javax.swing.border.TitledBorder(""));
        optimizeDB.setMaximumSize(new java.awt.Dimension(26, 26));
        optimizeDB.setMinimumSize(new java.awt.Dimension(26, 26));
        optimizeDB.setPreferredSize(new java.awt.Dimension(26, 26));
        optimizeDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optimizeDBActionPerformed(evt);
            }
        });

        jToolBar311.add(optimizeDB);

        compactDB.setToolTipText("DB Compact");
        compactDB.setBorder(new javax.swing.border.TitledBorder(""));
        compactDB.setMaximumSize(new java.awt.Dimension(26, 26));
        compactDB.setMinimumSize(new java.awt.Dimension(26, 26));
        compactDB.setPreferredSize(new java.awt.Dimension(26, 26));
        compactDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compactDBActionPerformed(evt);
            }
        });

        jToolBar311.add(compactDB);

        backupDB.setToolTipText("DB Backup");
        backupDB.setBorder(new javax.swing.border.TitledBorder(""));
        backupDB.setMaximumSize(new java.awt.Dimension(26, 26));
        backupDB.setMinimumSize(new java.awt.Dimension(26, 26));
        backupDB.setPreferredSize(new java.awt.Dimension(26, 26));
        backupDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupDBActionPerformed(evt);
            }
        });

        jToolBar311.add(backupDB);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jToolBar311, gridBagConstraints);

        taskBar.setLayout(new java.awt.GridBagLayout());

        taskBar.setBorder(new javax.swing.border.EtchedBorder());
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(new javax.swing.border.EtchedBorder());
        userLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText(" ");
        userLabel.setLabelFor(patientdepositsmnit);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel3.add(userLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        taskBar.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(new javax.swing.border.EtchedBorder());
        connectionLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        connectionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        connectionLabel.setText(" ");
        connectionLabel.setLabelFor(patientdepositsmnit);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel4.add(connectionLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        taskBar.add(jPanel4, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBorder(new javax.swing.border.EtchedBorder());
        activePane.setFont(new java.awt.Font("Dialog", 0, 10));
        activePane.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activePane.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel5.add(activePane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        taskBar.add(jPanel5, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBorder(new javax.swing.border.EtchedBorder());
        activeDatabase.setFont(new java.awt.Font("Dialog", 0, 10));
        activeDatabase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeDatabase.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel6.add(activeDatabase, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        taskBar.add(jPanel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(taskBar, gridBagConstraints);

        jMenuBar1.setFont(new java.awt.Font("Serif", 0, 12));
        setupmn.setMnemonic('S');
        setupmn.setText("Setup ");
        countryditrmn.setText("Country/Districts");
        countrymnit.setText("Country");
        countrymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countrymnitActionPerformed(evt);
            }
        });

        countryditrmn.add(countrymnit);
        districtmnit.setText("District");
        districtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtmnitActionPerformed(evt);
            }
        });

        countryditrmn.add(districtmnit);
        setupmn.add(countryditrmn);
        setupmn.add(jSeparator41);
        profilemn.setText("Profile Setup");
        lgalstatussetupmnit.setText("Legal Status Setup");
        lgalstatussetupmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgalstatussetupmnitActionPerformed(evt);
            }
        });

        profilemn.add(lgalstatussetupmnit);
        hosptalmnit.setText("Hospital Profile");
        hosptalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hosptalmnitActionPerformed(evt);
            }
        });

        profilemn.add(hosptalmnit);
        headermnit.setText("Statements Header");
        headermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headermnitActionPerformed(evt);
            }
        });

        profilemn.add(headermnit);
        interimnoticemnit.setText("Footer Interim");
        interimnoticemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interimnoticemnitActionPerformed(evt);
            }
        });

        profilemn.add(interimnoticemnit);
        setupmn.add(profilemn);
        setupmn.add(jSeparator21);
        Financialmn.setText("Financial & Cash Point");
        glaccountsmnit.setText("Chart Of Accounts");
        glaccountsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glaccountsmnitActionPerformed(evt);
            }
        });

        Financialmn.add(glaccountsmnit);
        Financialmn.add(jSeparator67);
        banksmnit.setText("Banks");
        banksmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banksmnitActionPerformed(evt);
            }
        });

        Financialmn.add(banksmnit);
        creditcardsmnit.setText("Credit Cards");
        creditcardsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditcardsmnitActionPerformed(evt);
            }
        });

        Financialmn.add(creditcardsmnit);
        paymentmodesmnit.setText("Payment Modes");
        paymentmodesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentmodesmnitActionPerformed(evt);
            }
        });

        Financialmn.add(paymentmodesmnit);
        cashpointmnit.setText("Cash Points");
        cashpointmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashpointmnitActionPerformed(evt);
            }
        });

        Financialmn.add(cashpointmnit);
        patientdepositsmnit.setText("Type Of Transactions");
        patientdepositsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientdepositsmnitActionPerformed(evt);
            }
        });

        Financialmn.add(patientdepositsmnit);
        Financialmn.add(jSeparator68);
        iplimitmnit.setText("Inpatient limit");
        iplimitmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iplimitmnitActionPerformed(evt);
            }
        });

        Financialmn.add(iplimitmnit);
        accrualsmnit.setText("Accruals");
        accrualsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accrualsmnitActionPerformed(evt);
            }
        });

        Financialmn.add(accrualsmnit);
        Financialmn.add(jSeparator69);
        deductionsmnit.setText("Tax Rates & Deductions");
        deductionsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deductionsmnitActionPerformed(evt);
            }
        });

        Financialmn.add(deductionsmnit);
        Corporatemnit.setText("Corporate Disallowables");
        Corporatemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorporatemnitActionPerformed(evt);
            }
        });

        Financialmn.add(Corporatemnit);
        setupmn.add(Financialmn);
        setupmn.add(jSeparator6);
        LegalDocumentmn.setText("Legal Documents Register");
        docregistermnit.setText("Document Register");
        docregistermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docregistermnitActionPerformed(evt);
            }
        });

        LegalDocumentmn.add(docregistermnit);
        impdocregmnit.setText("Important Doc. Register");
        impdocregmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impdocregmnitActionPerformed(evt);
            }
        });

        LegalDocumentmn.add(impdocregmnit);
        setupmn.add(LegalDocumentmn);
        setupmn.add(jSeparator64);
        departmentalmn.setText("Departments Setup");
        depatmnit.setText("Departments");
        depatmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depatmnitActionPerformed(evt);
            }
        });

        departmentalmn.add(depatmnit);
        Operatingchamn.setText("Operating Parameters");
        Operatingparamertersmnit.setText("Operating Parameters");
        Operatingparamertersmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperatingparamertersmnitActionPerformed(evt);
            }
        });

        Operatingchamn.add(Operatingparamertersmnit);
        TheatreChargesmnit.setText("Theatre Fixed Rates");
        TheatreChargesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheatreChargesmnitActionPerformed(evt);
            }
        });

        Operatingchamn.add(TheatreChargesmnit);
        adjpricesmnit.setText("Adjust Rates");
        adjpricesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjpricesmnitActionPerformed(evt);
            }
        });

        Operatingchamn.add(adjpricesmnit);
        departmentalmn.add(Operatingchamn);
        laboratorymn.setText("Lab");
        laboratorymn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboratorymnActionPerformed(evt);
            }
        });

        labspecimensmnit.setText("Lab Specimens");
        labspecimensmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labspecimensmnitActionPerformed(evt);
            }
        });

        laboratorymn.add(labspecimensmnit);
        labtestsmnit.setText("Lab Tests");
        labtestsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labtestsmnitActionPerformed(evt);
            }
        });

        laboratorymn.add(labtestsmnit);
        labresultsmnit.setText("Lab Parameters");
        labresultsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labresultsmnitActionPerformed(evt);
            }
        });

        laboratorymn.add(labresultsmnit);
        departmentalmn.add(laboratorymn);
        setupmn.add(departmentalmn);
        setupmn.add(jSeparator31);
        patientCategorymn.setText("Patient Categories");
        patcategmnit.setText("Patient Categories");
        patcategmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patcategmnitActionPerformed(evt);
            }
        });

        patientCategorymn.add(patcategmnit);
        patientcollateralmnit.setText("Patient Collateral");
        patientcollateralmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientcollateralmnitActionPerformed(evt);
            }
        });

        patientCategorymn.add(patientcollateralmnit);
        setupmn.add(patientCategorymn);
        setupmn.add(jSeparator8);
        wardsetupmn.setText("Wards Classification");
        wardprocmnit.setText("Wards");
        wardprocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardprocmnitActionPerformed(evt);
            }
        });

        wardsetupmn.add(wardprocmnit);
        bedsetupmnit.setText("Bed Setup");
        bedsetupmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedsetupmnitActionPerformed(evt);
            }
        });

        wardsetupmn.add(bedsetupmnit);
        setupmn.add(wardsetupmn);
        setupmn.add(jSeparator26);
        medicalRecordsmn.setText("Medical Records Categories");
        diseasesmnit.setText("Diseases Setup");
        diseasesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseasesmnitActionPerformed(evt);
            }
        });

        medicalRecordsmn.add(diseasesmnit);
        setupmn.add(medicalRecordsmn);
        setupmn.add(jSeparator65);
        staffmn.setText("Staff Registry");
        docnursmnit.setText("Doctor & Nurses");
        docnursmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docnursmnitActionPerformed(evt);
            }
        });

        staffmn.add(docnursmnit);
        closedocaccmnit.setText("Close/Suspend Doc Acc.");
        closedocaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closedocaccmnitActionPerformed(evt);
            }
        });

        staffmn.add(closedocaccmnit);
        setupmn.add(staffmn);
        setupmn.add(jSeparator66);
        schememn.setText("Medical Schemes");
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
        Ammendstaffregmnit.setText("Staff Register");
        Ammendstaffregmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmmendstaffregmnitActionPerformed(evt);
            }
        });

        schememn.add(Ammendstaffregmnit);
        schememn.add(jSeparator70);
        nhifrebatesmnit.setText("N.H.I.F Rebate");
        nhifrebatesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhifrebatesmnitActionPerformed(evt);
            }
        });

        schememn.add(nhifrebatesmnit);
        limitconsmnit.setText("Limit Constants");
        limitconsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitconsmnitActionPerformed(evt);
            }
        });

        schememn.add(limitconsmnit);
        schememn.add(jSeparator71);
        approvedagentsmnit.setText("Approved Agents");
        approvedagentsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedagentsmnitActionPerformed(evt);
            }
        });

        schememn.add(approvedagentsmnit);
        setupmn.add(schememn);
        setupmn.add(jSeparator25);
        userprofmnit1.setText("User Profiles");
        userprofmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userprofmnit1ActionPerformed(evt);
            }
        });

        setupmn.add(userprofmnit1);
        setupmn.add(jSeparator81);
        exitmnITb.setMnemonic('x');
        exitmnITb.setText("Exit");
        exitmnITb.setToolTipText("Exit System");
        exitmnITb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitmnITbActionPerformed(evt);
            }
        });

        setupmn.add(exitmnITb);
        jMenuBar1.add(setupmn);
        patientmanagemn.setMnemonic('o');
        patientmanagemn.setText("Operations");
        patientmanagemn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientmanagemnActionPerformed(evt);
            }
        });

        patientregstmnit.setText("Patient Registration");
        patientregstmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientregstmnitActionPerformed(evt);
            }
        });

        patientmanagemn.add(patientregstmnit);
        patientregnummnit.setText("Patient Registration With OPD No.");
        patientregnummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientregnummnitActionPerformed(evt);
            }
        });

        patientmanagemn.add(patientregnummnit);
        serviceAccptslipmnit.setText("Service Acceptance Slip");
        serviceAccptslipmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceAccptslipmnitActionPerformed(evt);
            }
        });

        patientmanagemn.add(serviceAccptslipmnit);
        generalmnit.setText("General Procedures");
        generalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalmnitActionPerformed(evt);
            }
        });

        patientmanagemn.add(generalmnit);
        patientmanagemn.add(jSeparator29);
        SchemeInvoicinmn.setText("Scheme Invoicing");
        schememnit.setText("Online Invoicing");
        schememnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schememnitActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(schememnit);
        Directinfomnit.setText("Direct Invoicing");
        Directinfomnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectinfomnitActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(Directinfomnit);
        debtinvoicingmnit.setText("Debtors Invoicing");
        debtinvoicingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtinvoicingmnitActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(debtinvoicingmnit);
        SchemeInvoicinmn.add(jSeparator79);
        approveinvmnit.setText("Dispatch Invoices");
        approveinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveinvmnitActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(approveinvmnit);
        approveinvmnit1.setText("Dispatch Invoices Per Payer");
        approveinvmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveinvmnit1ActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(approveinvmnit1);
        mergdispmnit.setText("Merge Dispatches");
        mergdispmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergdispmnitActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(mergdispmnit);
        DispConfirmationmnit.setText("Dispatch Confirmation");
        DispConfirmationmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DispConfirmationmnitActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(DispConfirmationmnit);
        DispConfSummnit.setText("Dispatch Confirmation Summary");
        DispConfSummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DispConfSummnitActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(DispConfSummnit);
        SchemeInvoicinmn.add(jSeparator80);
        CreditnoteSchmnit.setText("Patient Credit Note");
        CreditnoteSchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditnoteSchmnitActionPerformed(evt);
            }
        });

        SchemeInvoicinmn.add(CreditnoteSchmnit);
        patientmanagemn.add(SchemeInvoicinmn);
        inpatcashinvmnit.setText("Finalising Cash Inv.");
        inpatcashinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpatcashinvmnitActionPerformed(evt);
            }
        });

        patientmanagemn.add(inpatcashinvmnit);
        patientmanagemn.add(jSeparator30);
        labmn.setText("Lab");
        labprocmnit.setText("Lab Procedures");
        labprocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labprocmnitActionPerformed(evt);
            }
        });

        labmn.add(labprocmnit);
        labtestsresultmnit.setText("Lab Results");
        labtestsresultmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labtestsresultmnitActionPerformed(evt);
            }
        });

        labmn.add(labtestsresultmnit);
        labregmnit.setText("Lab Register");
        labregmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labregmnitActionPerformed(evt);
            }
        });

        labmn.add(labregmnit);
        labpendingmnit.setText("Test Pending");
        labpendingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labpendingmnitActionPerformed(evt);
            }
        });

        labmn.add(labpendingmnit);
        patientmanagemn.add(labmn);
        xraymnit.setText("Xray Procedure");
        xraymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xraymnitActionPerformed(evt);
            }
        });

        patientmanagemn.add(xraymnit);
        theatremn.setText("Theatre ");
        bookingschmnit.setText("Theatre Booking");
        bookingschmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingschmnitActionPerformed(evt);
            }
        });

        theatremn.add(bookingschmnit);
        theatrediagmnit.setText("Theatre Diagonistic");
        theatrediagmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theatrediagmnitActionPerformed(evt);
            }
        });

        theatremn.add(theatrediagmnit);
        theatreprocmnit.setText("Theatre Procedures");
        theatreprocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theatreprocmnitActionPerformed(evt);
            }
        });

        theatremn.add(theatreprocmnit);
        patientmanagemn.add(theatremn);
        surgicalitemmnit.setText("Surgical  Items");
        surgicalitemmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surgicalitemmnitActionPerformed(evt);
            }
        });

        patientmanagemn.add(surgicalitemmnit);
        inpatientmn.setText("In Patient");
        admmssionntmnit.setText("Admission");
        admmssionntmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admmssionntmnitActionPerformed(evt);
            }
        });

        inpatientmn.add(admmssionntmnit);
        patdischmnit.setText("Patient Discharge");
        patdischmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patdischmnitActionPerformed(evt);
            }
        });

        inpatientmn.add(patdischmnit);
        wardproceduresmnit.setText("Ward Procedures");
        wardproceduresmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardproceduresmnitActionPerformed(evt);
            }
        });

        inpatientmn.add(wardproceduresmnit);
        nhifcreditsmnit.setText("Nhif Credits");
        nhifcreditsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhifcreditsmnitActionPerformed(evt);
            }
        });

        inpatientmn.add(nhifcreditsmnit);
        inpatientmn.add(jSeparator9);
        patienttransfrmn.setText("Patient Transfer");
        wardtfrmnit.setText("Ward to Ward Transfer");
        wardtfrmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardtfrmnitActionPerformed(evt);
            }
        });

        patienttransfrmn.add(wardtfrmnit);
        Bedtrnsfrmnit.setText("Bed to Bed Transfer");
        Bedtrnsfrmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedtrnsfrmnitActionPerformed(evt);
            }
        });

        patienttransfrmn.add(Bedtrnsfrmnit);
        inpatientmn.add(patienttransfrmn);
        Bedchargesmnit.setText("Bed Charges");
        Bedchargesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedchargesmnitActionPerformed(evt);
            }
        });

        inpatientmn.add(Bedchargesmnit);
        patientmanagemn.add(inpatientmn);
        patientmanagemn.add(jSeparator5);
        bedmagmentmn.setText("Bed Management");
        bedmangtmnit.setText("Bed Management and Transfer");
        bedmangtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedmangtmnitActionPerformed(evt);
            }
        });

        bedmagmentmn.add(bedmangtmnit);
        newbedmnit.setText("New Bed");
        newbedmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbedmnitActionPerformed(evt);
            }
        });

        bedmagmentmn.add(newbedmnit);
        bedbrekgsmnit.setText("Bed Breakages");
        bedbrekgsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedbrekgsmnitActionPerformed(evt);
            }
        });

        bedmagmentmn.add(bedbrekgsmnit);
        patientmanagemn.add(bedmagmentmn);
        patientmanagemn.add(jSeparator7);
        billadjmn.setText("Bill Adjustments");
        billadjustmentmnit.setText("Bill Adjustments");
        billadjustmentmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billadjustmentmnitActionPerformed(evt);
            }
        });

        billadjmn.add(billadjustmentmnit);
        surgicaladjmnit.setText("Surgical Returns");
        surgicaladjmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surgicaladjmnitActionPerformed(evt);
            }
        });

        billadjmn.add(surgicaladjmnit);
        patientmanagemn.add(billadjmn);
        medicalrecordsmn.setText("Medical Records");
        bthregistermnit.setText("Birth Register");
        bthregistermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthregistermnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(bthregistermnit);
        medicalrecordsmn.add(jSeparator61);
        clinicsapp.setText("Clinics & Appointments");
        bookingschsmnit.setText("Booking");
        bookingschsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingschsmnitActionPerformed(evt);
            }
        });

        clinicsapp.add(bookingschsmnit);
        bookingsconfchmnit.setText("Bookings Confirmation");
        bookingsconfchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingsconfchmnitActionPerformed(evt);
            }
        });

        clinicsapp.add(bookingsconfchmnit);
        medicalrecordsmn.add(clinicsapp);
        vitalsignmnit.setText("Vital Signs Rec.");
        vitalsignmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalsignmnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(vitalsignmnit);
        docnotesmnit.setText("Doctors Notes");
        docnotesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docnotesmnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(docnotesmnit);
        patientdiagnosismnit.setText("Patient Observations");
        patientdiagnosismnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientdiagnosismnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(patientdiagnosismnit);
        refferalsmnit.setText("Refferals");
        refferalsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refferalsmnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(refferalsmnit);
        medicalrecordsmn.add(jSeparator62);
        deathregistermnit.setText("Death Register");
        deathregistermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deathregistermnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(deathregistermnit);
        deathnotficationmnit.setText("Death Notification");
        deathnotficationmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deathnotficationmnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(deathnotficationmnit);
        bodycollectionmnit.setText("Body Collection");
        bodycollectionmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodycollectionmnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(bodycollectionmnit);
        permitcollectormnit.setText("Permit Collector");
        permitcollectormnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permitcollectormnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(permitcollectormnit);
        medicalrecordsmn.add(jSeparator63);
        sickleavemnit.setText("Sick Leave Form");
        sickleavemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sickleavemnitActionPerformed(evt);
            }
        });

        medicalrecordsmn.add(sickleavemnit);
        patientmanagemn.add(medicalrecordsmn);
        morturymn.setText("Mortuary");
        admissmnit.setText("Mort. Admission");
        admissmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissmnitActionPerformed(evt);
            }
        });

        morturymn.add(admissmnit);
        mortdischmnit.setText("Discharge");
        mortdischmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mortdischmnitActionPerformed(evt);
            }
        });

        morturymn.add(mortdischmnit);
        patientmanagemn.add(morturymn);
        jMenuBar1.add(patientmanagemn);
        gledgermn.setMnemonic('C');
        gledgermn.setText("Accounting");
        cashbkmn.setText("Cash Book");
        receiptsmn.setText("Receive Payments");
        receiptsmnit.setText("Cash Sales");
        receiptsmnit.setAction(openShiftAction);
        receiptsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptsmnitActionPerformed(evt);
            }
        });

        receiptsmn.add(receiptsmnit);
        inReceiptsmnit.setText("InPatient Receipts");
        inReceiptsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inReceiptsmnitActionPerformed(evt);
            }
        });

        receiptsmn.add(inReceiptsmnit);
        Receiptsmnit.setText("Debtors Receipts");
        Receiptsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptsmnitActionPerformed(evt);
            }
        });

        receiptsmn.add(Receiptsmnit);
        otherrecptmnit.setText("Other Receipts");
        otherrecptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherrecptmnitActionPerformed(evt);
            }
        });

        receiptsmn.add(otherrecptmnit);
        rctdocfeesmnit.setText("Receipt Doctor Fees");
        rctdocfeesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rctdocfeesmnitActionPerformed(evt);
            }
        });

        receiptsmn.add(rctdocfeesmnit);
        receiptsmn.add(jSeparator72);
        directcashsalesmnit.setText("Payment Mode Adjustment");
        directcashsalesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directcashsalesmnitActionPerformed(evt);
            }
        });

        receiptsmn.add(directcashsalesmnit);
        inpatreceiptadjmnit.setText("Inpatient Receipt Adjustment");
        inpatreceiptadjmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpatreceiptadjmnitActionPerformed(evt);
            }
        });

        receiptsmn.add(inpatreceiptadjmnit);
        refundsmnit.setBackground(new java.awt.Color(204, 204, 204));
        refundsmnit.setText("Receipt Adjustments");
        refundsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundsmnitActionPerformed(evt);
            }
        });

        receiptsmn.add(refundsmnit);
        cashbkmn.add(receiptsmn);
        raisevouchmnit.setText("Enter Bills");
        raisevouchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raisevouchmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(raisevouchmnit);
        approvevouchmnit.setText("Approve Bills");
        approvevouchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvevouchmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(approvevouchmnit);
        cashbkmn.add(jSeparator73);
        paymenmn.setText("Payments");
        otherprmnit.setText("Payments");
        otherprmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherprmnitActionPerformed(evt);
            }
        });

        paymenmn.add(otherprmnit);
        Lumpotherprmnit.setText("Lumpsum Payments");
        Lumpotherprmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LumpotherprmnitActionPerformed(evt);
            }
        });

        paymenmn.add(Lumpotherprmnit);
        consultantspmnit.setText("Consultants");
        consultantspmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultantspmnitActionPerformed(evt);
            }
        });

        paymenmn.add(consultantspmnit);
        paymntadjmnit.setText("Payment Adjustment");
        paymntadjmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymntadjmnitActionPerformed(evt);
            }
        });

        paymenmn.add(paymntadjmnit);
        cashbkmn.add(paymenmn);
        cashbkmn.add(jSeparator3);
        bankingmnit.setText("Cash Point Rec.");
        bankingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankingmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(bankingmnit);
        Bankingmnit.setText("Banking");
        Bankingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankingmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(Bankingmnit);
        bankreconcmnit.setText("Bank Reconciliation");
        bankreconcmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankreconcmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(bankreconcmnit);
        comfbankingmnit.setText("Comfirm Banking");
        comfbankingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comfbankingmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(comfbankingmnit);
        bnkchargesmnit.setText("Bank Charges");
        bnkchargesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnkchargesmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(bnkchargesmnit);
        cashbkmn.add(jSeparator74);
        creditallocmnit.setText("Creditors Allocation");
        creditallocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditallocmnitActionPerformed(evt);
            }
        });

        cashbkmn.add(creditallocmnit);
        gledgermn.add(cashbkmn);
        gledgermn.add(jSeparator4);
        jrnloansmnit.setText("Journal");
        jrnloansmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrnloansmnitActionPerformed(evt);
            }
        });

        gledgermn.add(jrnloansmnit);
        pettycashmn.setMnemonic('C');
        pettycashmn.setText("Petty Cash");
        raisecashVouchmnit.setText("Raise Voucher");
        raisecashVouchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raisecashVouchmnitActionPerformed(evt);
            }
        });

        pettycashmn.add(raisecashVouchmnit);
        payvouchermnit.setText("Approve Voucher");
        payvouchermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payvouchermnitActionPerformed(evt);
            }
        });

        pettycashmn.add(payvouchermnit);
        pettycashpaymnit.setText("Petty Cash Payment");
        pettycashpaymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettycashpaymnitActionPerformed(evt);
            }
        });

        pettycashmn.add(pettycashpaymnit);
        printvouchermnit.setText("Petty Cash Adj.");
        printvouchermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printvouchermnitActionPerformed(evt);
            }
        });

        pettycashmn.add(printvouchermnit);
        gledgermn.add(pettycashmn);
        gledgermn.add(jSeparator75);
        allocation.setText("Allocation");
        SchemeAllocmnit.setText("Allocate Scheme Invoices");
        SchemeAllocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchemeAllocmnitActionPerformed(evt);
            }
        });

        allocation.add(SchemeAllocmnit);
        partlyallocinvmnit.setText("Allocate Invoice Partly");
        partlyallocinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partlyallocinvmnitActionPerformed(evt);
            }
        });

        allocation.add(partlyallocinvmnit);
        allocbypayermnit.setText("Allocation By Payer");
        allocbypayermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocbypayermnitActionPerformed(evt);
            }
        });

        allocation.add(allocbypayermnit);
        adjustinvmnit.setText("Allocation Doc. Excempted");
        adjustinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjustinvmnitActionPerformed(evt);
            }
        });

        allocation.add(adjustinvmnit);
        allocatewtocrtmnit.setText("Allocation Without Credits");
        allocatewtocrtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocatewtocrtmnitActionPerformed(evt);
            }
        });

        allocation.add(allocatewtocrtmnit);
        automatedwoffsmnit.setText("Automated Writeoffs");
        automatedwoffsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automatedwoffsmnitActionPerformed(evt);
            }
        });

        allocation.add(automatedwoffsmnit);
        appdocinvmnit.setText("Allocate DoctorsBills.");
        appdocinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appdocinvmnitActionPerformed(evt);
            }
        });

        allocation.add(appdocinvmnit);
        gledgermn.add(allocation);
        gledgermn.add(jSeparator76);
        miscsCreditorsmnit.setText("Misc Creditors");
        miscsCreditorsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miscsCreditorsmnitActionPerformed(evt);
            }
        });

        gledgermn.add(miscsCreditorsmnit);
        gledgermn.add(jSeparator77);
        debtorsTransactionsmn.setText("Debtors Transactions");
        credittransfmnit.setText("Credit Transfer");
        credittransfmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credittransfmnitActionPerformed(evt);
            }
        });

        debtorsTransactionsmn.add(credittransfmnit);
        miscdebtorsmnit.setText("Misc Debtors");
        miscdebtorsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miscdebtorsmnitActionPerformed(evt);
            }
        });

        debtorsTransactionsmn.add(miscdebtorsmnit);
        mergschaccmnit.setText("Merge Scheme Accounts");
        mergschaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergschaccmnitActionPerformed(evt);
            }
        });

        debtorsTransactionsmn.add(mergschaccmnit);
        changepayermnit.setText("Change Payer");
        changepayermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepayermnitActionPerformed(evt);
            }
        });

        debtorsTransactionsmn.add(changepayermnit);
        chgintrmnit.setText("Charge Interest");
        chgintrmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgintrmnitActionPerformed(evt);
            }
        });

        debtorsTransactionsmn.add(chgintrmnit);
        returnedclms.setText("Returned Claims");
        rtclaimsmnit.setText("Returned Claims");
        rtclaimsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtclaimsmnitActionPerformed(evt);
            }
        });

        returnedclms.add(rtclaimsmnit);
        resubmitclaimsmnit.setText("Resurbmit Claims");
        resubmitclaimsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resubmitclaimsmnitActionPerformed(evt);
            }
        });

        returnedclms.add(resubmitclaimsmnit);
        debtorsTransactionsmn.add(returnedclms);
        gledgermn.add(debtorsTransactionsmn);
        Provisiontransmn.setText("Debtors Provision ");
        provisionsmnit.setText("Provisions");
        provisionsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provisionsmnitActionPerformed(evt);
            }
        });

        Provisiontransmn.add(provisionsmnit);
        provisionsperdebtormnit.setText("Provisions per debtors");
        provisionsperdebtormnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provisionsperdebtormnitActionPerformed(evt);
            }
        });

        Provisiontransmn.add(provisionsperdebtormnit);
        gledgermn.add(Provisiontransmn);
        writeoffs.setText("Write Offs");
        Writeoffsmnit.setText("Write Offs Debits");
        Writeoffsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WriteoffsmnitActionPerformed(evt);
            }
        });

        writeoffs.add(Writeoffsmnit);
        Writeoffscrtmnit.setText("Write Offs Credits");
        Writeoffscrtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WriteoffscrtmnitActionPerformed(evt);
            }
        });

        writeoffs.add(Writeoffscrtmnit);
        gledgermn.add(writeoffs);
        gledgermn.add(jSeparator78);
        shiftmn.setText("Shift Operations");
        closeshiftmnit.setText("Close");
        closeshiftmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeshiftmnitActionPerformed(evt);
            }
        });

        shiftmn.add(closeshiftmnit);
        suspendmnit.setText("Suspend");
        suspendmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspendmnitActionPerformed(evt);
            }
        });

        shiftmn.add(suspendmnit);
        gledgermn.add(shiftmn);
        jMenuBar1.add(gledgermn);
        assetsmn.setMnemonic('A');
        assetsmn.setText("Assets");
        Depreciationmnit.setText("Depreciation Methods");
        Depreciationmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepreciationmnitActionPerformed(evt);
            }
        });

        assetsmn.add(Depreciationmnit);
        Depreciationratesmnit.setText("Depreciation Rates");
        Depreciationratesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepreciationratesmnitActionPerformed(evt);
            }
        });

        assetsmn.add(Depreciationratesmnit);
        AssetAllocmnit.setText("Asset Allocation");
        AssetAllocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssetAllocmnitActionPerformed(evt);
            }
        });

        assetsmn.add(AssetAllocmnit);
        asstregmnit.setText("Asset Registration");
        asstregmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asstregmnitActionPerformed(evt);
            }
        });

        assetsmn.add(asstregmnit);
        assetlocmnit.setText("Asset Location");
        assetlocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetlocmnitActionPerformed(evt);
            }
        });

        assetsmn.add(assetlocmnit);
        insurancemnit.setText("Insurance");
        insurancemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insurancemnitActionPerformed(evt);
            }
        });

        assetsmn.add(insurancemnit);
        assetrepmnit.setText("Asset Register Report");
        assetrepmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetrepmnitActionPerformed(evt);
            }
        });

        assetsmn.add(assetrepmnit);
        Loanregmnit.setText("Loan Registration");
        Loanregmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanregmnitActionPerformed(evt);
            }
        });

        assetsmn.add(Loanregmnit);
        jMenuBar1.add(assetsmn);
        budgetmn.setMnemonic('b');
        budgetmn.setText("Budget");
        budgetsectmint.setText("Budget Section");
        budgetsectmint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgetsectmintActionPerformed(evt);
            }
        });

        budgetmn.add(budgetsectmint);
        budgetdeptmnit.setText("Budget per Dept.");
        budgetdeptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgetdeptmnitActionPerformed(evt);
            }
        });

        budgetmn.add(budgetdeptmnit);
        budgettotalmnit.setText("Total Budget");
        budgettotalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgettotalmnitActionPerformed(evt);
            }
        });

        budgetmn.add(budgettotalmnit);
        budgetamendmnit.setText("Amend Budget");
        budgetamendmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budgetamendmnitActionPerformed(evt);
            }
        });

        budgetmn.add(budgetamendmnit);
        jMenuBar1.add(budgetmn);
        managementmn.setMnemonic('m');
        managementmn.setText("Management");
        Deprecmnit.setText("Currency");
        Deprecmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeprecmnitActionPerformed(evt);
            }
        });

        managementmn.add(Deprecmnit);
        Deprecatesmnit.setText("Exchage Rates");
        Deprecatesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeprecatesmnitActionPerformed(evt);
            }
        });

        managementmn.add(Deprecatesmnit);
        AssetAlmnit.setText("Exceptional Items");
        AssetAlmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssetAlmnitActionPerformed(evt);
            }
        });

        managementmn.add(AssetAlmnit);
        asrepmnit.setText("Format Setup");
        asrepmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asrepmnitActionPerformed(evt);
            }
        });

        managementmn.add(asrepmnit);
        astregmnit.setText("Group Statistics");
        astregmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astregmnitActionPerformed(evt);
            }
        });

        managementmn.add(astregmnit);
        aslocmnit.setText("Tax Claim");
        aslocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aslocmnitActionPerformed(evt);
            }
        });

        managementmn.add(aslocmnit);
        insuncemnit.setText("Amend Rates");
        insuncemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuncemnitActionPerformed(evt);
            }
        });

        managementmn.add(insuncemnit);
        managementmn.add(jSeparator32);
        BedOccmnit.setText("Bed Occupancy Registry");
        BedOccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedOccmnitActionPerformed(evt);
            }
        });

        managementmn.add(BedOccmnit);
        Revmnit.setText("Revenue Register");
        Revmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevmnitActionPerformed(evt);
            }
        });

        managementmn.add(Revmnit);
        Aiemnit.setText("Authority To Incure Expediture");
        Aiemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AiemnitActionPerformed(evt);
            }
        });

        managementmn.add(Aiemnit);
        AieRepmnit.setText("AIE Report");
        AieRepmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AieRepmnitActionPerformed(evt);
            }
        });

        managementmn.add(AieRepmnit);
        jMenuBar1.add(managementmn);
        reportsmn.setMnemonic('p');
        reportsmn.setText("Reports");
        inpatmn.setText("Inpatient");
        Pregistermn.setText("Patients Attendance");
        ordersmnit.setText("Registered Patient's ");
        ordersmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersmnitActionPerformed(evt);
            }
        });

        Pregistermn.add(ordersmnit);
        admissiomnit.setText("Daily Admissions");
        admissiomnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissiomnitActionPerformed(evt);
            }
        });

        Pregistermn.add(admissiomnit);
        dischargesmnit.setText("Discharged Patients");
        dischargesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargesmnitActionPerformed(evt);
            }
        });

        Pregistermn.add(dischargesmnit);
        inpatmn.add(Pregistermn);
        Wardsmn.setText("Wards Management");
        quotationmnit.setText("No of Wards");
        quotationmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quotationmnitActionPerformed(evt);
            }
        });

        Wardsmn.add(quotationmnit);
        admissbywardmnit.setText("Admissions By Ward");
        admissbywardmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissbywardmnitActionPerformed(evt);
            }
        });

        Wardsmn.add(admissbywardmnit);
        patbedoccupancymnit.setText("Wards Occupancy");
        patbedoccupancymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patbedoccupancymnitActionPerformed(evt);
            }
        });

        Wardsmn.add(patbedoccupancymnit);
        wardoccstatisticsmnit.setText("Ward Occupancy Statistics");
        wardoccstatisticsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardoccstatisticsmnitActionPerformed(evt);
            }
        });

        Wardsmn.add(wardoccstatisticsmnit);
        bedoccupancymnit.setText("Bed Occupancy");
        bedoccupancymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedoccupancymnitActionPerformed(evt);
            }
        });

        Wardsmn.add(bedoccupancymnit);
        wardoccupancymnit.setText("Patient Bed Occupancy");
        wardoccupancymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardoccupancymnitActionPerformed(evt);
            }
        });

        Wardsmn.add(wardoccupancymnit);
        ipdaysmnit.setText("Inpatient Days");
        ipdaysmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipdaysmnitActionPerformed(evt);
            }
        });

        Wardsmn.add(ipdaysmnit);
        inpatmn.add(Wardsmn);
        inpatmn.add(jSeparator11);
        Interiminvoicemn.setText("Interim Invoices");
        interimtxt.setText("Interim Invoice Txt");
        interimtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interimtxtActionPerformed(evt);
            }
        });

        Interiminvoicemn.add(interimtxt);
        interiminvmnit.setText("Interim Invoice");
        interiminvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interiminvmnitActionPerformed(evt);
            }
        });

        Interiminvoicemn.add(interiminvmnit);
        billsummnit.setText("Interim Summay");
        billsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsummnitActionPerformed(evt);
            }
        });

        Interiminvoicemn.add(billsummnit);
        patientaccmnit.setText("Patient Balances");
        patientaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientaccmnitActionPerformed(evt);
            }
        });

        Interiminvoicemn.add(patientaccmnit);
        inpatmn.add(Interiminvoicemn);
        finalinvmn.setText("Final Invoices");
        finalinpatinvsummnit.setText("Summarised Invoice");
        finalinpatinvsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalinpatinvsummnitActionPerformed(evt);
            }
        });

        finalinvmn.add(finalinpatinvsummnit);
        finalinpatinvmnit.setText("Final InPatient Inv");
        finalinpatinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalinpatinvmnitActionPerformed(evt);
            }
        });

        finalinvmn.add(finalinpatinvmnit);
        finalindetpatinvmnit.setText("Detailed Final InPatient Inv");
        finalindetpatinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalindetpatinvmnitActionPerformed(evt);
            }
        });

        finalinvmn.add(finalindetpatinvmnit);
        InPatInvCashmnit.setText("Final Inpatient Cash Invoices");
        InPatInvCashmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InPatInvCashmnitActionPerformed(evt);
            }
        });

        finalinvmn.add(InPatInvCashmnit);
        InPatsInvTotalmnit1.setText("IP Finalised Invoices ");
        InPatsInvTotalmnit1.setRolloverEnabled(true);
        InPatsInvTotalmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InPatsInvTotalmnit1ActionPerformed(evt);
            }
        });

        finalinvmn.add(InPatsInvTotalmnit1);
        Finalinvoicetxt.setText("In Patient Invoice Txt");
        Finalinvoicetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalinvoicetxtActionPerformed(evt);
            }
        });

        finalinvmn.add(Finalinvoicetxt);
        inpatmn.add(finalinvmn);
        inpatmn.add(jSeparator35);
        suppliersmnit.setText("Diagonistic History");
        suppliersmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersmnitActionPerformed(evt);
            }
        });

        inpatmn.add(suppliersmnit);
        outstandingordersmnit.setText("Drugs Prescribed");
        outstandingordersmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outstandingordersmnitActionPerformed(evt);
            }
        });

        inpatmn.add(outstandingordersmnit);
        reportsmn.add(inpatmn);
        outpatmn.setText("Out Patient");
        dailyissiuesmnit.setText("Daily Registered Patients");
        dailyissiuesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyissiuesmnitActionPerformed(evt);
            }
        });

        outpatmn.add(dailyissiuesmnit);
        Attendancesummnit.setText("Attendance Summary");
        Attendancesummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendancesummnitActionPerformed(evt);
            }
        });

        outpatmn.add(Attendancesummnit);
        attsheetmnit.setText("Attendance Sheet");
        attsheetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attsheetmnitActionPerformed(evt);
            }
        });

        outpatmn.add(attsheetmnit);
        patperdeptmnit.setText("Patients Per Dept.");
        patperdeptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patperdeptmnitActionPerformed(evt);
            }
        });

        outpatmn.add(patperdeptmnit);
        outpatmn.add(jSeparator23);
        printreceiptmnit.setText("Patient Receipt Copy");
        printreceiptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreceiptmnitActionPerformed(evt);
            }
        });

        outpatmn.add(printreceiptmnit);
        intinvmnit.setText("Interim Invoice");
        intinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intinvmnitActionPerformed(evt);
            }
        });

        outpatmn.add(intinvmnit);
        invbyinvmnit.setText("Invoice By Invoice");
        invbyinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invbyinvmnitActionPerformed(evt);
            }
        });

        outpatmn.add(invbyinvmnit);
        Outpatientinvoicetxt.setText("Out Patient Invoice Txt");
        Outpatientinvoicetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutpatientinvoicetxtActionPerformed(evt);
            }
        });

        outpatmn.add(Outpatientinvoicetxt);
        Detinvbyinvmnit.setText("Detailed Invoice By Invoice");
        Detinvbyinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetinvbyinvmnitActionPerformed(evt);
            }
        });

        outpatmn.add(Detinvbyinvmnit);
        patstmtmnit.setText("Patient Statement");
        patstmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patstmtmnitActionPerformed(evt);
            }
        });

        outpatmn.add(patstmtmnit);
        detailedpatstmtmnit.setText("Detailed Patient Statement");
        detailedpatstmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailedpatstmtmnitActionPerformed(evt);
            }
        });

        outpatmn.add(detailedpatstmtmnit);
        outpatmn.add(jSeparator24);
        stockbalancesmnit.setText("Patient Card");
        outpatmn.add(stockbalancesmnit);
        stockjournalsmnit.setText("Clinics/Appointments ");
        stockjournalsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockjournalsmnitActionPerformed(evt);
            }
        });

        outpatmn.add(stockjournalsmnit);
        patlabresultsmnit.setText("Patient Lab Results");
        patlabresultsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patlabresultsmnitActionPerformed(evt);
            }
        });

        outpatmn.add(patlabresultsmnit);
        reportsmn.add(outpatmn);
        reportsmn.add(jSeparator82);
        patacctmn.setText("Receivables / Debtors");
        invoicesmn.setText("Invoices & Credit Notes");
        unfinalisedinvmnit.setText("Unfinalised Inv.");
        unfinalisedinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unfinalisedinvmnitActionPerformed(evt);
            }
        });

        invoicesmn.add(unfinalisedinvmnit);
        unfinalisedinvmnit1.setText("In Patient Unfinalised Inv.");
        unfinalisedinvmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unfinalisedinvmnit1ActionPerformed(evt);
            }
        });

        invoicesmn.add(unfinalisedinvmnit1);
        finalisedinvmnit.setText("Finalised Invoices");
        finalisedinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalisedinvmnitActionPerformed(evt);
            }
        });

        invoicesmn.add(finalisedinvmnit);
        totalschemeinvlistmnit.setText("Invoices (Total)");
        totalschemeinvlistmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalschemeinvlistmnitActionPerformed(evt);
            }
        });

        invoicesmn.add(totalschemeinvlistmnit);
        pativoicesmnit.setText("Final Inv. Per Patient");
        pativoicesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pativoicesmnitActionPerformed(evt);
            }
        });

        invoicesmn.add(pativoicesmnit);
        invoicesmn.add(jSeparator33);
        invoicemnit.setText("Scheme Invoices");
        invoicemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicemnitActionPerformed(evt);
            }
        });

        invoicesmn.add(invoicemnit);
        distinvmnit.setText("Invoices Per Scheme");
        distinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distinvmnitActionPerformed(evt);
            }
        });

        invoicesmn.add(distinvmnit);
        nhifinvoicemnit.setText("NHIF Invoice");
        nhifinvoicemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhifinvoicemnitActionPerformed(evt);
            }
        });

        invoicesmn.add(nhifinvoicemnit);
        nhifcredits.setText("NHIF Credits");
        nhifcredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhifcreditsActionPerformed(evt);
            }
        });

        invoicesmn.add(nhifcredits);
        invoicesmn.add(jSeparator34);
        IPCreditmnit.setText("Detailed Credit Note");
        IPCreditmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPCreditmnitActionPerformed(evt);
            }
        });

        invoicesmn.add(IPCreditmnit);
        Opcreditmnit.setText("Out Patient CR Note");
        Opcreditmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcreditmnitActionPerformed(evt);
            }
        });

        invoicesmn.add(Opcreditmnit);
        Debtorscrnotemnit.setText("Debtors Credit Note");
        Debtorscrnotemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebtorscrnotemnitActionPerformed(evt);
            }
        });

        invoicesmn.add(Debtorscrnotemnit);
        creditnotesmnit.setText("Credit Notes");
        creditnotesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditnotesmnitActionPerformed(evt);
            }
        });

        invoicesmn.add(creditnotesmnit);
        patacctmn.add(invoicesmn);
        patacctmn.add(jSeparator12);
        Receiptmn.setText("Receipts");
        patreceiptsmnit.setText("Patient Receipts ");
        patreceiptsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patreceiptsmnitActionPerformed(evt);
            }
        });

        Receiptmn.add(patreceiptsmnit);
        allreceiptsmnit.setText("Receipts");
        allreceiptsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allreceiptsmnitActionPerformed(evt);
            }
        });

        Receiptmn.add(allreceiptsmnit);
        receiptscopymnit.setText("Other Receipts Copy");
        receiptscopymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptscopymnitActionPerformed(evt);
            }
        });

        Receiptmn.add(receiptscopymnit);
        receiptperpayermnit.setText("Receipt Per Payer");
        receiptperpayermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptperpayermnitActionPerformed(evt);
            }
        });

        Receiptmn.add(receiptperpayermnit);
        debreceiptsmnit.setText("Debtors Receipts");
        debreceiptsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debreceiptsmnitActionPerformed(evt);
            }
        });

        Receiptmn.add(debreceiptsmnit);
        patacctmn.add(Receiptmn);
        jSeparator13.setBorder(new javax.swing.border.TitledBorder(null, "wwww", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        patacctmn.add(jSeparator13);
        detstmtmn.setText("Statement Per Scheme");
        statementofaccmnit.setText("Statement of Account");
        statementofaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statementofaccmnitActionPerformed(evt);
            }
        });

        detstmtmn.add(statementofaccmnit);
        detailedstmtmnit.setText("Detailed Statement");
        detailedstmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailedstmtmnitActionPerformed(evt);
            }
        });

        detstmtmn.add(detailedstmtmnit);
        scmepfmmnit.setText("Scheme Performance(Periodical)");
        scmepfmmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scmepfmmnitActionPerformed(evt);
            }
        });

        detstmtmn.add(scmepfmmnit);
        schmsdebtCollmnit.setText("Debt Collector Report");
        schmsdebtCollmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schmsdebtCollmnitActionPerformed(evt);
            }
        });

        detstmtmn.add(schmsdebtCollmnit);
        schemesalesmnit.setText("Scheme Sales Report");
        schemesalesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schemesalesmnitActionPerformed(evt);
            }
        });

        detstmtmn.add(schemesalesmnit);
        detailedstmtmnit1.setText("Detailed Statement Breakdown");
        detailedstmtmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailedstmtmnit1ActionPerformed(evt);
            }
        });

        detstmtmn.add(detailedstmtmnit1);
        patacctmn.add(detstmtmn);
        patacctmn.add(jSeparator14);
        Statementsmn.setText("Statements Per Scheme Manager");
        submStmtmnit.setText("Submission Form");
        submStmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submStmtmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(submStmtmnit);
        debtorsStmtmnit.setText("Payers Statement");
        debtorsStmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtorsStmtmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(debtorsStmtmnit);
        DebtStatementmnit.setText("Debtors Statement");
        DebtStatementmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebtStatementmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(DebtStatementmnit);
        payerdetStmtmnit.setText("Payer Statement(Detailed)");
        payerdetStmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payerdetStmtmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(payerdetStmtmnit);
        stmtsummperdebtmnit.setText("Summarised Statement Per Debt");
        stmtsummperdebtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stmtsummperdebtmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(stmtsummperdebtmnit);
        debtorsyearlybalmnit.setText("Annual Debtors Balance");
        debtorsyearlybalmnit.setPreferredSize(new java.awt.Dimension(0, 0));
        debtorsyearlybalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtorsyearlybalmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(debtorsyearlybalmnit);
        debtosbalmnit.setText("Debtors OS Balances");
        debtosbalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtosbalmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(debtosbalmnit);
        exceedlimitsmnit.setText("Exceeded Limits");
        exceedlimitsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exceedlimitsmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(exceedlimitsmnit);
        extactscmmnit.setText("Active Acc. With Limits Exceeded");
        extactscmmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extactscmmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(extactscmmnit);
        payerperfmmnit.setText("Payer Performance");
        payerperfmmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payerperfmmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(payerperfmmnit);
        payertnovermnit.setText("Payer Turnover");
        payertnovermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payertnovermnitActionPerformed(evt);
            }
        });

        Statementsmn.add(payertnovermnit);
        detdebtorsStmtmnit.setText("Payers  Statement Breakdown");
        detdebtorsStmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detdebtorsStmtmnitActionPerformed(evt);
            }
        });

        Statementsmn.add(detdebtorsStmtmnit);
        patacctmn.add(Statementsmn);
        jSeparator20.setBorder(new javax.swing.border.TitledBorder("xxxx"));
        patacctmn.add(jSeparator20);
        ageingmn.setText("Ageing");
        compdebtorsmnit.setText("Debtors Ageing");
        compdebtorsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compdebtorsmnitActionPerformed(evt);
            }
        });

        ageingmn.add(compdebtorsmnit);
        payerageingmnit.setText("Ageing By Payer");
        payerageingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payerageingmnitActionPerformed(evt);
            }
        });

        ageingmn.add(payerageingmnit);
        payerageingsummnit.setText("Payer ageing Summary");
        payerageingsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payerageingsummnitActionPerformed(evt);
            }
        });

        ageingmn.add(payerageingsummnit);
        annualageingmnit.setText("Annual Debtors Ageing");
        annualageingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualageingmnitActionPerformed(evt);
            }
        });

        ageingmn.add(annualageingmnit);
        anualPayeragmnit.setText("Annual Ageing By Payer");
        anualPayeragmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anualPayeragmnitActionPerformed(evt);
            }
        });

        ageingmn.add(anualPayeragmnit);
        annualpayersummnit.setText("Annual Ageing By Payer Summary");
        annualpayersummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualpayersummnitActionPerformed(evt);
            }
        });

        ageingmn.add(annualpayersummnit);
        patacctmn.add(ageingmn);
        patacctmn.add(jSeparator22);
        SchemeDetailsmn.setText("Schemes  Information");
        schemestaffmnit.setText("Scheme Staff");
        schemestaffmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schemestaffmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(schemestaffmnit);
        scmattendsummnit.setText("Scheme Attendance");
        scmattendsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scmattendsummnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(scmattendsummnit);
        attdperscmdetmnit.setText("Attendace Per Scheme");
        attdperscmdetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attdperscmdetmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(attdperscmdetmnit);
        payerstaffamdmnit.setText("Payer Staff Amendments");
        payerstaffamdmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payerstaffamdmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(payerstaffamdmnit);
        Scmammnit.setText("Scheme Amendments");
        Scmammnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScmammnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(Scmammnit);
        SchemeDetailsmn.add(jSeparator85);
        scmstatusmnit.setText("Scheme status");
        scmstatusmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scmstatusmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(scmstatusmnit);
        scmperfrmnit.setText("Scheme Performance");
        scmperfrmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scmperfrmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(scmperfrmnit);
        autolimitsmnit.setText("Automated Limits");
        autolimitsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autolimitsmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(autolimitsmnit);
        payeractaccmnit.setText("Payer Active Accounts");
        payeractaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeractaccmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(payeractaccmnit);
        scmabtlimitmnit.setText("Scheme About To Exceed Limit");
        scmabtlimitmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scmabtlimitmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(scmabtlimitmnit);
        SchemeDetailsmn.add(jSeparator86);
        accabtexpiremnit.setText("Accounts About To Expire");
        accabtexpiremnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accabtexpiremnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(accabtexpiremnit);
        expiredaccmnit.setText("Expired Accounts");
        expiredaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiredaccmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(expiredaccmnit);
        closedschemesmnit.setText("Closed Schemes");
        closedschemesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closedschemesmnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(closedschemesmnit);
        SchemeDetailsmn.add(jSeparator87);
        marketertnovermnit.setText("Marketer Turnover");
        marketertnovermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketertnovermnitActionPerformed(evt);
            }
        });

        SchemeDetailsmn.add(marketertnovermnit);
        patacctmn.add(SchemeDetailsmn);
        reportsmn.add(patacctmn);
        creditorsmn.setText("Creditors");
        creditorsmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditorsmnActionPerformed(evt);
            }
        });

        creditorsinvmnit.setText("Creditors Invoices");
        creditorsinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditorsinvmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(creditorsinvmnit);
        invpercrdmnit.setText("Invoice Per Creditor");
        invpercrdmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invpercrdmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(invpercrdmnit);
        supplierinvmnit.setText("Suppliers Invoices");
        supplierinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierinvmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(supplierinvmnit);
        invpersuppliermnit.setText("Invoice Per Supplier");
        invpersuppliermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invpersuppliermnitActionPerformed(evt);
            }
        });

        creditorsmn.add(invpersuppliermnit);
        creditorsmn.add(jSeparator15);
        CrdVouchermnit.setText("Creditors Voucher");
        CrdVouchermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrdVouchermnitActionPerformed(evt);
            }
        });

        creditorsmn.add(CrdVouchermnit);
        Paymentsmnit.setText("Payments");
        Paymentsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentsmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(Paymentsmnit);
        paymentspercreditormnit.setText("Payments Per Creditor");
        paymentspercreditormnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentspercreditormnitActionPerformed(evt);
            }
        });

        creditorsmn.add(paymentspercreditormnit);
        payeepymtmnit.setText("Payment Per Creditor(detailed)");
        payeepymtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeepymtmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(payeepymtmnit);
        creditorsmn.add(jSeparator16);
        crdstmtmnit.setText("Creditors Statement");
        crdstmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crdstmtmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(crdstmtmnit);
        crdtstmtmnit.setText("Creditors Statement Det.");
        crdtstmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crdtstmtmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(crdtstmtmnit);
        storesrevmnit.setText("Stores Revenue");
        storesrevmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storesrevmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(storesrevmnit);
        creditorsmn.add(jSeparator43);
        payrollledgermnit.setText("Payroll Ledger");
        payrollledgermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollledgermnitActionPerformed(evt);
            }
        });

        creditorsmn.add(payrollledgermnit);
        creditorsmn.add(jSeparator44);
        Creditorsmnit.setText("Creditors Ageing");
        Creditorsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditorsmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(Creditorsmnit);
        ageingbycatmnit.setText("Ageing By Category");
        ageingbycatmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageingbycatmnitActionPerformed(evt);
            }
        });

        creditorsmn.add(ageingbycatmnit);
        grtsuppliermnit1.setText("Creditors Grt.");
        grtsuppliermnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grtsuppliermnit1ActionPerformed(evt);
            }
        });

        creditorsmn.add(grtsuppliermnit1);
        reportsmn.add(creditorsmn);
        managmn.setText("Consultants");
        Doctorslistmn.setText("Doctors Information");
        doctorslistmnit.setText("Doctors List");
        doctorslistmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorslistmnitActionPerformed(evt);
            }
        });

        Doctorslistmn.add(doctorslistmnit);
        nursesmnit.setText("Nurses List");
        Doctorslistmn.add(nursesmnit);
        accstatusmnit.setText("Closed Accounts");
        accstatusmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accstatusmnitActionPerformed(evt);
            }
        });

        Doctorslistmn.add(accstatusmnit);
        managmn.add(Doctorslistmn);
        managmn.add(jSeparator54);
        Voucherdetailsmn.setText("Doctors Vouchers");
        docVouchermnit.setText("Voucher");
        docVouchermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docVouchermnitActionPerformed(evt);
            }
        });

        Voucherdetailsmn.add(docVouchermnit);
        detvouchmnit.setText("Detailed Voucher");
        detvouchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detvouchmnitActionPerformed(evt);
            }
        });

        Voucherdetailsmn.add(detvouchmnit);
        paymentVouchermnit.setText("Payment Voucher");
        paymentVouchermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentVouchermnitActionPerformed(evt);
            }
        });

        Voucherdetailsmn.add(paymentVouchermnit);
        managmn.add(Voucherdetailsmn);
        managmn.add(jSeparator55);
        doctorsStamntmn.setText("Doctors Statements");
        paymentsperdocmnit.setText("Payments Per Doctor");
        paymentsperdocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentsperdocmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(paymentsperdocmnit);
        paymentperdocSummnit.setText("Payments Per Doc(Summary)");
        paymentperdocSummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentperdocSummnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(paymentperdocSummnit);
        doctorsStamntmn.add(jSeparator58);
        doctorsstmtmnit.setText("Doctors Statement");
        doctorsstmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsstmtmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(doctorsstmtmnit);
        doctstmtpaidinvmnit.setText("Doctors Statement(Paidup)");
        doctstmtpaidinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctstmtpaidinvmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(doctstmtpaidinvmnit);
        doctorsstatementmnit.setText("Statement");
        doctorsstatementmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsstatementmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(doctorsstatementmnit);
        stmtscmmnit.setText("Statement Including Scheme");
        stmtscmmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stmtscmmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(stmtscmmnit);
        doctorsStamntmn.add(jSeparator60);
        docunpaidinvmnit.setText("Doctors Unpaid Inv.");
        docunpaidinvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docunpaidinvmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(docunpaidinvmnit);
        doctorsStamntmn.add(jSeparator59);
        stmtperdebtmnit.setText("Statement Per Debtor");
        stmtperdebtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stmtperdebtmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(stmtperdebtmnit);
        paidupperdebtmnit.setText("Paidup Per Debtor");
        paidupperdebtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidupperdebtmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(paidupperdebtmnit);
        paidupbyscmnit.setText("Paidup By Scheme");
        paidupbyscmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidupbyscmnitActionPerformed(evt);
            }
        });

        doctorsStamntmn.add(paidupbyscmnit);
        managmn.add(doctorsStamntmn);
        managmn.add(jSeparator56);
        whtstamentsmn.setText("Withholding Tax Statements");
        whtmnit.setText("Withholding Tax");
        whtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whtmnitActionPerformed(evt);
            }
        });

        whtstamentsmn.add(whtmnit);
        whtperdocmnit.setText("Withholding Tax Per Doc.");
        whtperdocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whtperdocmnitActionPerformed(evt);
            }
        });

        whtstamentsmn.add(whtperdocmnit);
        whtsummnit.setText("WHT Summary");
        whtsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whtsummnitActionPerformed(evt);
            }
        });

        whtstamentsmn.add(whtsummnit);
        managmn.add(whtstamentsmn);
        managmn.add(jSeparator57);
        doctorslistsrmtmn.setText("Statements Summary");
        doctorspaymentsmnit.setText("Doctors Payments");
        doctorspaymentsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorspaymentsmnitActionPerformed(evt);
            }
        });

        doctorslistsrmtmn.add(doctorspaymentsmnit);
        doctorledgermnit.setText("Doctors Ledger");
        doctorledgermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorledgermnitActionPerformed(evt);
            }
        });

        doctorslistsrmtmn.add(doctorledgermnit);
        paidupsummmnit.setText("Paidup Summary");
        paidupsummmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidupsummmnitActionPerformed(evt);
            }
        });

        doctorslistsrmtmn.add(paidupsummmnit);
        docbalsummnit.setText("Doctors Balances");
        docbalsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docbalsummnitActionPerformed(evt);
            }
        });

        doctorslistsrmtmn.add(docbalsummnit);
        docearndeductmnit.setText("Doctors earnings & Deductions");
        docearndeductmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docearndeductmnitActionPerformed(evt);
            }
        });

        doctorslistsrmtmn.add(docearndeductmnit);
        managmn.add(doctorslistsrmtmn);
        reportsmn.add(managmn);
        reportsmn.add(jSeparator83);
        financeopermn.setText("Accounting Reports");
        financeopermn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeopermnActionPerformed(evt);
            }
        });

        CashierRepmn.setText("Cash Reports");
        chartaccountsmnit.setText("Chart of Accounts");
        chartaccountsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartaccountsmnitActionPerformed(evt);
            }
        });

        CashierRepmn.add(chartaccountsmnit);
        shiftrepmnit.setText("Shift Report");
        shiftrepmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftrepmnitActionPerformed(evt);
            }
        });

        CashierRepmn.add(shiftrepmnit);
        shiftrepDetmnit.setText("Shift Report Detailed");
        shiftrepDetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftrepDetmnitActionPerformed(evt);
            }
        });

        CashierRepmn.add(shiftrepDetmnit);
        uncollectedshiftsmnit.setText("Uncollected Shifts");
        uncollectedshiftsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uncollectedshiftsmnitActionPerformed(evt);
            }
        });

        CashierRepmn.add(uncollectedshiftsmnit);
        shiftstotalmnit.setText("Total Shifts");
        shiftstotalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftstotalmnitActionPerformed(evt);
            }
        });

        CashierRepmn.add(shiftstotalmnit);
        totalinpatrecmnit.setText("Inpatients Receipts(total)");
        totalinpatrecmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalinpatrecmnitActionPerformed(evt);
            }
        });

        CashierRepmn.add(totalinpatrecmnit);
        financeopermn.add(CashierRepmn);
        financeopermn.add(jSeparator17);
        Salesmn.setText("Sales Reports");
        Cashanalysismnit.setText("Cash Collected Analysis");
        Cashanalysismnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashanalysismnitActionPerformed(evt);
            }
        });

        Salesmn.add(Cashanalysismnit);
        Cashsalesmnit.setText("Cash Sales");
        Cashsalesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashsalesmnitActionPerformed(evt);
            }
        });

        Salesmn.add(Cashsalesmnit);
        CashSalesbrdmnit.setText("Cash Sales Breakdown");
        CashSalesbrdmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashSalesbrdmnitActionPerformed(evt);
            }
        });

        Salesmn.add(CashSalesbrdmnit);
        Salesmnit.setText("Sales Report");
        Salesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesmnitActionPerformed(evt);
            }
        });

        Salesmn.add(Salesmnit);
        markupbelowmnit.setText("Sales Below Markup");
        markupbelowmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markupbelowmnitActionPerformed(evt);
            }
        });

        Salesmn.add(markupbelowmnit);
        financeopermn.add(Salesmn);
        financeopermn.add(jSeparator45);
        RevReportmd.setText("Revenue Reports");
        dailyrevmnit.setText("Daily Revenue");
        dailyrevmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyrevmnitActionPerformed(evt);
            }
        });

        RevReportmd.add(dailyrevmnit);
        revperdepmnit.setText("Departments Revenue");
        revperdepmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revperdepmnitActionPerformed(evt);
            }
        });

        RevReportmd.add(revperdepmnit);
        transperaccmnit.setText("Transaction Per Account");
        transperaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transperaccmnitActionPerformed(evt);
            }
        });

        RevReportmd.add(transperaccmnit);
        revrepmnit.setText("Revenue Report");
        revrepmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revrepmnitActionPerformed(evt);
            }
        });

        RevReportmd.add(revrepmnit);
        oprevrptmnit.setText("Out Patient Rev.");
        oprevrptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprevrptmnitActionPerformed(evt);
            }
        });

        RevReportmd.add(oprevrptmnit);
        oprevbyaccmnit.setText("Op Rev By Account");
        oprevbyaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprevbyaccmnitActionPerformed(evt);
            }
        });

        RevReportmd.add(oprevbyaccmnit);
        iprevrptmnit.setText("IP Revenue");
        iprevrptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iprevrptmnitActionPerformed(evt);
            }
        });

        RevReportmd.add(iprevrptmnit);
        iprevbyaccmnit.setText("IP Rev By Acc.");
        iprevbyaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iprevbyaccmnitActionPerformed(evt);
            }
        });

        RevReportmd.add(iprevbyaccmnit);
        financeopermn.add(RevReportmd);
        financeopermn.add(jSeparator18);
        oprevbrkdwnmnit.setText("Ambulance Report");
        oprevbrkdwnmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprevbrkdwnmnitActionPerformed(evt);
            }
        });

        financeopermn.add(oprevbrkdwnmnit);
        financeopermn.add(jSeparator47);
        pettycashRepmn.setText("Petty Cash");
        pettycashpmtmnit.setText("Petty Cash Payments rep");
        pettycashpmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettycashpmtmnitActionPerformed(evt);
            }
        });

        pettycashRepmn.add(pettycashpmtmnit);
        pettycashreqmnit.setText("Petty Cash Requisitions.");
        pettycashreqmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettycashreqmnitActionPerformed(evt);
            }
        });

        pettycashRepmn.add(pettycashreqmnit);
        pettycashVouchmnit.setText("Petty Cash Vouchers");
        pettycashVouchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettycashVouchmnitActionPerformed(evt);
            }
        });

        pettycashRepmn.add(pettycashVouchmnit);
        pettycashshiftsmnit.setText("Petty Cash Shifts");
        pettycashshiftsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pettycashshiftsmnitActionPerformed(evt);
            }
        });

        pettycashRepmn.add(pettycashshiftsmnit);
        financeopermn.add(pettycashRepmn);
        financeopermn.add(jSeparator19);
        otherVouchermnit.setText("Other Voucher");
        otherVouchermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherVouchermnitActionPerformed(evt);
            }
        });

        financeopermn.add(otherVouchermnit);
        financeopermn.add(jSeparator27);
        expensesmnit.setText("Expenses");
        expensesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expensesmnitActionPerformed(evt);
            }
        });

        financeopermn.add(expensesmnit);
        financeopermn.add(jSeparator28);
        journalmnit.setText("Journal By Journal");
        journalmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journalmnitActionPerformed(evt);
            }
        });

        financeopermn.add(journalmnit);
        financeopermn.add(jSeparator46);
        pharmacymnit.setText("Pharmacy");
        pharmacymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacymnitActionPerformed(evt);
            }
        });

        financeopermn.add(pharmacymnit);
        reportsmn.add(financeopermn);
        glreportsmn.setText("Finance Reports");
        transactionslsmnitmnit.setText("Transactions List");
        transactionslsmnitmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionslsmnitmnitActionPerformed(evt);
            }
        });

        glreportsmn.add(transactionslsmnitmnit);
        glreportsmn.add(jSeparator48);
        CashBookmn.setText("Cash Book");
        cashBookmnit.setText("Cash Book");
        cashBookmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashBookmnitActionPerformed(evt);
            }
        });

        CashBookmn.add(cashBookmnit);
        postdatedchqmnit.setText("Post Dated Cheques");
        postdatedchqmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postdatedchqmnitActionPerformed(evt);
            }
        });

        CashBookmn.add(postdatedchqmnit);
        cancelledchqmnit.setText("Cancelled Cheques");
        cancelledchqmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelledchqmnitActionPerformed(evt);
            }
        });

        CashBookmn.add(cancelledchqmnit);
        cbookbalancesmnit.setText("CashBook Balances");
        cbookbalancesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbookbalancesmnitActionPerformed(evt);
            }
        });

        CashBookmn.add(cbookbalancesmnit);
        banksummnit.setText("CashBook Summary");
        banksummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banksummnitActionPerformed(evt);
            }
        });

        CashBookmn.add(banksummnit);
        cashflowoptmnit.setText("Cash Flow Operations");
        cashflowoptmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashflowoptmnitActionPerformed(evt);
            }
        });

        CashBookmn.add(cashflowoptmnit);
        glreportsmn.add(CashBookmn);
        glreportsmn.add(jSeparator49);
        Bankrepmn.setText("Bank Statements");
        bankingsmnit.setText("Banking Per Bank");
        bankingsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankingsmnitActionPerformed(evt);
            }
        });

        Bankrepmn.add(bankingsmnit);
        bankreccmnit.setText("Bank Recconciliation");
        bankreccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankreccmnitActionPerformed(evt);
            }
        });

        Bankrepmn.add(bankreccmnit);
        Unreconcitemsmnit.setText("UnReconcilled Items");
        Unreconcitemsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnreconcitemsmnitActionPerformed(evt);
            }
        });

        Bankrepmn.add(Unreconcitemsmnit);
        unrecitemsmnit.setText("Unreconcilled Item Per Bank");
        unrecitemsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unrecitemsmnitActionPerformed(evt);
            }
        });

        Bankrepmn.add(unrecitemsmnit);
        bankrecdiscrpmnit.setText("Bank Recon. Discripancies");
        bankrecdiscrpmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankrecdiscrpmnitActionPerformed(evt);
            }
        });

        Bankrepmn.add(bankrecdiscrpmnit);
        glreportsmn.add(Bankrepmn);
        glreportsmn.add(jSeparator50);
        profitlossmn.setText("Profit & Loss");
        pnlmnit.setText("Profit & Loss");
        pnlmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlmnitActionPerformed(evt);
            }
        });

        profitlossmn.add(pnlmnit);
        anualplmnit.setText("Annual P&L");
        anualplmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anualplmnitActionPerformed(evt);
            }
        });

        profitlossmn.add(anualplmnit);
        pnlmnit1.setText("Profit & Loss Txt.");
        pnlmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlmnit1ActionPerformed(evt);
            }
        });

        profitlossmn.add(pnlmnit1);
        glreportsmn.add(profitlossmn);
        glreportsmn.add(jSeparator51);
        Trialbalancemn.setText("Trial Balance");
        trialbalancemnit.setText("Trial Balance");
        trialbalancemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trialbalancemnitActionPerformed(evt);
            }
        });

        Trialbalancemn.add(trialbalancemnit);
        DtlTrialBalancemnit1.setText("Detailed Trial Balance Txt");
        DtlTrialBalancemnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DtlTrialBalancemnit1ActionPerformed(evt);
            }
        });

        Trialbalancemn.add(DtlTrialBalancemnit1);
        Annualtbmnit.setText("Annul Trial Balance");
        Annualtbmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnualtbmnitActionPerformed(evt);
            }
        });

        Trialbalancemn.add(Annualtbmnit);
        Annualtbmnit1.setText("Trial Balance Movement");
        Annualtbmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Annualtbmnit1ActionPerformed(evt);
            }
        });

        Trialbalancemn.add(Annualtbmnit1);
        glreportsmn.add(Trialbalancemn);
        glreportsmn.add(jSeparator481);
        acctdetmnit.setText("General Ledger");
        acctdetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctdetmnitActionPerformed(evt);
            }
        });

        glreportsmn.add(acctdetmnit);
        glreportsmn.add(jSeparator491);
        lbalancesheetmnit.setText("Balance Sheet");
        lbalancesheetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbalancesheetmnitActionPerformed(evt);
            }
        });

        glreportsmn.add(lbalancesheetmnit);
        glreportsmn.add(jSeparator501);
        deptincexpmnit.setText("Departmental Inc. & Exp.");
        deptincexpmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptincexpmnitActionPerformed(evt);
            }
        });

        glreportsmn.add(deptincexpmnit);
        glreportsmn.add(jSeparator511);
        transbyaccmnit.setText("Transaction By Account");
        transbyaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transbyaccmnitActionPerformed(evt);
            }
        });

        glreportsmn.add(transbyaccmnit);
        Transsummnit.setText("Transaction By Acc. Summ");
        Transsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranssummnitActionPerformed(evt);
            }
        });

        glreportsmn.add(Transsummnit);
        glreportsmn.add(jSeparator52);
        journalsmnit.setText("Journals");
        journalsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journalsmnitActionPerformed(evt);
            }
        });

        glreportsmn.add(journalsmnit);
        paymentssummnit.setText("Payments Summary");
        paymentssummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentssummnitActionPerformed(evt);
            }
        });

        glreportsmn.add(paymentssummnit);
        glreportsmn.add(jSeparator53);
        Taxesmn.setText("Taxes");
        CorporateTaxmnit.setText("Corporation Tax");
        CorporateTaxmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorporateTaxmnitActionPerformed(evt);
            }
        });

        Taxesmn.add(CorporateTaxmnit);
        taxreturnmnit.setText("Tax Return");
        taxreturnmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxreturnmnitActionPerformed(evt);
            }
        });

        Taxesmn.add(taxreturnmnit);
        glreportsmn.add(Taxesmn);
        reportsmn.add(glreportsmn);
        ManagementReportmn.setText("Management Report");
        Dailyrevmnit.setText("Daily Revenue Comparison");
        Dailyrevmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyrevmnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(Dailyrevmnit);
        ManagementReportmn.add(jSeparator36);
        weeklyrevmnit.setText("Weekly Revenue");
        weeklyrevmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeklyrevmnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(weeklyrevmnit);
        weeklyrevCompmnit.setText("Weekly Comparison Revenue");
        weeklyrevCompmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeklyrevCompmnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(weeklyrevCompmnit);
        ManagementReportmn.add(jSeparator37);
        Monthrevmnit.setText("Monthly Revenue Comparison");
        Monthrevmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthrevmnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(Monthrevmnit);
        MonthrevCompmnit.setText("Monthly Revenue Differentials");
        MonthrevCompmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthrevCompmnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(MonthrevCompmnit);
        ManagementReportmn.add(jSeparator38);
        Quarterrevmnit.setText("Quarterly Revenue");
        Quarterrevmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuarterrevmnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(Quarterrevmnit);
        QuartelyRevCompmnit.setText("Quaterly Revenue Differentials");
        QuartelyRevCompmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuartelyRevCompmnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(QuartelyRevCompmnit);
        ManagementReportmn.add(jSeparator39);
        Yearyrevmnit.setText("Yearly Revenue Comparison");
        Yearyrevmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearyrevmnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(Yearyrevmnit);
        ManagementReportmn.add(jSeparator40);
        Diagnosisanalysismnit.setText("Diagnosis Analysis");
        Diagnosisanalysismnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosisanalysismnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(Diagnosisanalysismnit);
        MonthlyDiagAnalysismnit.setText("Monthly Diagnosis Analysis");
        MonthlyDiagAnalysismnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyDiagAnalysismnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(MonthlyDiagAnalysismnit);
        ManagementReportmn.add(jSeparator42);
        InpatientAnalysismnit.setText("In Patient Visit Analysis");
        InpatientAnalysismnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InpatientAnalysismnitActionPerformed(evt);
            }
        });

        ManagementReportmn.add(InpatientAnalysismnit);
        reportsmn.add(ManagementReportmn);
        reportsmn.add(jSeparator84);
        listsmn.setText("Lists");
        revenuemnit.setText("Revenue");
        revenuemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenuemnitActionPerformed(evt);
            }
        });

        listsmn.add(revenuemnit);
        schemesmnit.setText("Schemes");
        schemesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schemesmnitActionPerformed(evt);
            }
        });

        listsmn.add(schemesmnit);
        specimensmnit.setText("Lab Specimens");
        specimensmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specimensmnitActionPerformed(evt);
            }
        });

        listsmn.add(specimensmnit);
        timelogmnit.setText("Time Log");
        timelogmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timelogmnitActionPerformed(evt);
            }
        });

        listsmn.add(timelogmnit);
        pharmperformmnit.setText("Pharmacy Performance");
        pharmperformmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmperformmnitActionPerformed(evt);
            }
        });

        listsmn.add(pharmperformmnit);
        laboratoryresultsmnit.setText("Lab Results");
        laboratoryresultsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboratoryresultsmnitActionPerformed(evt);
            }
        });

        listsmn.add(laboratoryresultsmnit);
        chekinmnit.setText("Patient Visit");
        chekinmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekinmnitActionPerformed(evt);
            }
        });

        listsmn.add(chekinmnit);
        patientdiagmnit.setText("Patient Diagnosis");
        patientdiagmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientdiagmnitActionPerformed(evt);
            }
        });

        listsmn.add(patientdiagmnit);
        Diagnosissummnit.setText("Diagnosis Summary");
        Diagnosissummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosissummnitActionPerformed(evt);
            }
        });

        listsmn.add(Diagnosissummnit);
        revpricelistmnit.setText("Departmental Price List");
        revpricelistmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revpricelistmnitActionPerformed(evt);
            }
        });

        listsmn.add(revpricelistmnit);
        reportsmn.add(listsmn);
        reportsmn.add(jSeparator841);
        claimsmn.setText("Claim Reports");
        unapprovedinvmn.setText("Undispatched Claims");
        Perschememnit.setText("Per Scheme");
        Perschememnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerschememnitActionPerformed(evt);
            }
        });

        unapprovedinvmn.add(Perschememnit);
        Perdebtormnit.setText("Per Debtor");
        Perdebtormnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerdebtormnitActionPerformed(evt);
            }
        });

        unapprovedinvmn.add(Perdebtormnit);
        Summarymnit.setText("Summary");
        Summarymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummarymnitActionPerformed(evt);
            }
        });

        unapprovedinvmn.add(Summarymnit);
        claimsmn.add(unapprovedinvmn);
        approvedinvmn.setText("Dispatched Claims");
        Schememnit.setText("Per Scheme");
        Schememnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchememnitActionPerformed(evt);
            }
        });

        approvedinvmn.add(Schememnit);
        debtormnit.setText("Per Debtor");
        debtormnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtormnitActionPerformed(evt);
            }
        });

        approvedinvmn.add(debtormnit);
        claimsmn.add(approvedinvmn);
        dispatchschmn.setText("Claim Dispatch Schedules");
        dispatchmnit.setText("Dispatch Schedules");
        dispatchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispatchmnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(dispatchmnit);
        displistmnit.setText("Dispatch Listing");
        displistmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displistmnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(displistmnit);
        dispperscmnit.setText("Dispatch Per Scheme");
        dispperscmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispperscmnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(dispperscmnit);
        dispperdebtmnit.setText("Dispatch Per Debtor");
        dispperdebtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispperdebtmnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(dispperdebtmnit);
        nhifdispmnit.setText("NHIF Dispatch");
        nhifdispmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhifdispmnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(nhifdispmnit);
        DispatchSummnit.setText("Dispatch Summary");
        DispatchSummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DispatchSummnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(DispatchSummnit);
        unpaidDispInvmnit.setText("Skipped Invoices");
        unpaidDispInvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unpaidDispInvmnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(unpaidDispInvmnit);
        dispatchperpayersummnit.setText("Dispatch Per Payer Summ");
        dispatchperpayersummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispatchperpayersummnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(dispatchperpayersummnit);
        Dispdelnotemnit.setText("Dispatch Delivery Note");
        Dispdelnotemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DispdelnotemnitActionPerformed(evt);
            }
        });

        dispatchschmn.add(Dispdelnotemnit);
        claimsmn.add(dispatchschmn);
        dispconf.setText("Confirmed Dispatches");
        confdispsummnit.setText("Confirmed Disp. Summary");
        confdispsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confdispsummnitActionPerformed(evt);
            }
        });

        dispconf.add(confdispsummnit);
        confdispperscmnit.setText("Confirmed Disp. Per Scheme");
        confdispperscmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confdispperscmnitActionPerformed(evt);
            }
        });

        dispconf.add(confdispperscmnit);
        dispconfperpayermnit.setText("Dispatch Conf. By Payer");
        dispconfperpayermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispconfperpayermnitActionPerformed(evt);
            }
        });

        dispconf.add(dispconfperpayermnit);
        claimsmn.add(dispconf);
        dormaccmnit.setText("Dormant Accounts");
        dormaccmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dormaccmnitActionPerformed(evt);
            }
        });

        claimsmn.add(dormaccmnit);
        debtcollsummnit.setText("Debt Collector Summary");
        debtcollsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtcollsummnitActionPerformed(evt);
            }
        });

        claimsmn.add(debtcollsummnit);
        ScmsalesSummnit.setText("Scheme Sales Summary");
        ScmsalesSummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScmsalesSummnitActionPerformed(evt);
            }
        });

        claimsmn.add(ScmsalesSummnit);
        retuenedclaims.setText("Returned Claims");
        rtclaimssummnit.setText("Returned Claims Summary");
        rtclaimssummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtclaimssummnitActionPerformed(evt);
            }
        });

        retuenedclaims.add(rtclaimssummnit);
        rtclaimsbyscmnit.setText("Returned Calim By Scheme");
        rtclaimsbyscmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtclaimsbyscmnitActionPerformed(evt);
            }
        });

        retuenedclaims.add(rtclaimsbyscmnit);
        resubmissionbyschmnit.setText("Resurbmission By Scheme");
        resubmissionbyschmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resubmissionbyschmnitActionPerformed(evt);
            }
        });

        retuenedclaims.add(resubmissionbyschmnit);
        claimsmn.add(retuenedclaims);
        reportsmn.add(claimsmn);
        allocationmn.setText("Allocation  Reports");
        allocsummnit.setText("Allocation Summary");
        allocsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocsummnitActionPerformed(evt);
            }
        });

        allocationmn.add(allocsummnit);
        debtallocsumnit.setText("Debtors Allocation Summary");
        debtallocsumnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtallocsumnitActionPerformed(evt);
            }
        });

        allocationmn.add(debtallocsumnit);
        allocationrepmnit.setText("Scheme Allocation Report");
        allocationrepmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocationrepmnitActionPerformed(evt);
            }
        });

        allocationmn.add(allocationrepmnit);
        scmallocsummnit.setText("Receipt Alloc Summary");
        scmallocsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scmallocsummnitActionPerformed(evt);
            }
        });

        allocationmn.add(scmallocsummnit);
        debtrectallocmnit.setText("Debtors Receipts Alloc Summary");
        debtrectallocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtrectallocmnitActionPerformed(evt);
            }
        });

        allocationmn.add(debtrectallocmnit);
        invwithbalmnit.setText("Invoices With Balances");
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
        allocchqmnit.setText("Allocation By Cheque");
        allocchqmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocchqmnitActionPerformed(evt);
            }
        });

        allocationmn.add(allocchqmnit);
        creditsbypayermnit.setText("Credits By Payer");
        creditsbypayermnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsbypayermnitActionPerformed(evt);
            }
        });

        allocationmn.add(creditsbypayermnit);
        Payerallocdetmnit.setText("Payer Alloc. Detailed");
        Payerallocdetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayerallocdetmnitActionPerformed(evt);
            }
        });

        allocationmn.add(Payerallocdetmnit);
        creditsSummnit.setText("Credits Summary");
        creditsSummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsSummnitActionPerformed(evt);
            }
        });

        allocationmn.add(creditsSummnit);
        unallocpymmnit.setText("Unallocated Cheques");
        unallocpymmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unallocpymmnitActionPerformed(evt);
            }
        });

        allocationmn.add(unallocpymmnit);
        reportsmn.add(allocationmn);
        provisionsmn.setText("Provisions");
        Provisionssummnit.setText("Provisions Summary");
        Provisionssummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvisionssummnitActionPerformed(evt);
            }
        });

        provisionsmn.add(Provisionssummnit);
        provperdebtmnit.setText("Provision Per Debtor");
        provperdebtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provperdebtmnitActionPerformed(evt);
            }
        });

        provisionsmn.add(provperdebtmnit);
        provperschmnit.setText("Provision Per Scheme");
        provperschmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provperschmnitActionPerformed(evt);
            }
        });

        provisionsmn.add(provperschmnit);
        provperdocmnit.setText("Provision By Doctor");
        provperdocmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provperdocmnitActionPerformed(evt);
            }
        });

        provisionsmn.add(provperdocmnit);
        docprovsummnit.setText("Doctors Provisions Summary");
        docprovsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docprovsummnitActionPerformed(evt);
            }
        });

        provisionsmn.add(docprovsummnit);
        provdocscmnit.setText("Scheme And Doc ");
        provdocscmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provdocscmnitActionPerformed(evt);
            }
        });

        provisionsmn.add(provdocscmnit);
        reportsmn.add(provisionsmn);
        wrt.setText("Writeoffs");
        wrtperscmnit.setText("WriteOff Per Scheme");
        wrtperscmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrtperscmnitActionPerformed(evt);
            }
        });

        wrt.add(wrtperscmnit);
        wrtsummnit.setText("Writeoff Summary");
        wrtsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrtsummnitActionPerformed(evt);
            }
        });

        wrt.add(wrtsummnit);
        reportsmn.add(wrt);
        reportsmn.add(jSeparator821);
        loanstock.setText("Loan Stock");
        loanstmtmnit.setText("Loan Statement");
        loanstmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanstmtmnitActionPerformed(evt);
            }
        });

        loanstock.add(loanstmtmnit);
        loanageingmnit.setText("Loan Ledger");
        loanageingmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanageingmnitActionPerformed(evt);
            }
        });

        loanstock.add(loanageingmnit);
        reportsmn.add(loanstock);
        reportsmn.add(jSeparator831);
        Labmn.setText("Laboratory Results");
        labresultsindmnit.setText("Laboratory Results");
        labresultsindmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labresultsindmnitActionPerformed(evt);
            }
        });

        Labmn.add(labresultsindmnit);
        laborresultsmnit.setText("Lab Results");
        laborresultsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laborresultsmnitActionPerformed(evt);
            }
        });

        Labmn.add(laborresultsmnit);
        labsspecimensmnit.setText("Lab Specimens");
        labsspecimensmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labsspecimensmnitActionPerformed(evt);
            }
        });

        Labmn.add(labsspecimensmnit);
        reportsmn.add(Labmn);
        PatientRecordsmn.setText("Patient Records");
        clinicsbookings.setText("Bookings");
        Bookingsmnit.setText("Clinics & Appointments ");
        Bookingsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingsmnitActionPerformed(evt);
            }
        });

        clinicsbookings.add(Bookingsmnit);
        ConfirmedBookingsmnit.setText("Confirmed Clinics & Appointments ");
        ConfirmedBookingsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmedBookingsmnitActionPerformed(evt);
            }
        });

        clinicsbookings.add(ConfirmedBookingsmnit);
        PatientRecordsmn.add(clinicsbookings);
        newbornsmnit.setText("Births");
        newbornsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbornsmnitActionPerformed(evt);
            }
        });

        PatientRecordsmn.add(newbornsmnit);
        deathsmnit.setText("Deaths");
        deathsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deathsmnitActionPerformed(evt);
            }
        });

        PatientRecordsmn.add(deathsmnit);
        sickoffsmnit.setText("Sick Offs");
        sickoffsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sickoffsmnitActionPerformed(evt);
            }
        });

        PatientRecordsmn.add(sickoffsmnit);
        reportsmn.add(PatientRecordsmn);
        jMenuBar1.add(reportsmn);
        viewsmn.setMnemonic('V');
        viewsmn.setText("Views");
        namesearchmnit.setText("Name Search");
        namesearchmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namesearchmnitActionPerformed(evt);
            }
        });

        viewsmn.add(namesearchmnit);
        departmentmnit.setText("Departmental");
        departmentmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentmnitActionPerformed(evt);
            }
        });

        viewsmn.add(departmentmnit);
        patstmtsmnit.setText("Patient Statement View");
        patstmtsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patstmtsmnitActionPerformed(evt);
            }
        });

        viewsmn.add(patstmtsmnit);
        patdocstmtmnit.setText("Patient Doctors Statement");
        patdocstmtmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patdocstmtmnitActionPerformed(evt);
            }
        });

        viewsmn.add(patdocstmtmnit);
        changepaymodesmnit.setText("Change Patient Paymode");
        changepaymodesmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepaymodesmnitActionPerformed(evt);
            }
        });

        viewsmn.add(changepaymodesmnit);
        changeiplimitmnit.setText("Change IpLimit");
        changeiplimitmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeiplimitmnitActionPerformed(evt);
            }
        });

        viewsmn.add(changeiplimitmnit);
        patstmtsummnit.setText("Patient Statement Summary");
        patstmtsummnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patstmtsummnitActionPerformed(evt);
            }
        });

        viewsmn.add(patstmtsummnit);
        viewsmn.add(jSeparator88);
        invammendmnit.setText("Amend Invoice");
        invammendmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invammendmnitActionPerformed(evt);
            }
        });

        viewsmn.add(invammendmnit);
        merginvmnit.setText("Merge Invoices");
        merginvmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merginvmnitActionPerformed(evt);
            }
        });

        viewsmn.add(merginvmnit);
        viewsmn.add(jSeparator89);
        schmdetmnit.setText("Scheme Details");
        schmdetmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schmdetmnitActionPerformed(evt);
            }
        });

        viewsmn.add(schmdetmnit);
        viewsmn.add(jSeparator881);
        AmendCreditmnit.setText("Amend Creditors Invoice");
        AmendCreditmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmendCreditmnitActionPerformed(evt);
            }
        });

        viewsmn.add(AmendCreditmnit);
        AmendCashbookmnit.setText("Amend Cashbook");
        AmendCashbookmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmendCashbookmnitActionPerformed(evt);
            }
        });

        viewsmn.add(AmendCashbookmnit);
        jMenuBar1.add(viewsmn);
        systemn.setMnemonic('t');
        systemn.setText("System");
        stockmnit1.setText("Stock/Inventory");
        stockmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockmnit1ActionPerformed(evt);
            }
        });

        systemn.add(stockmnit1);
        accountsmnit1.setText("Accounts");
        accountsmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsmnit1ActionPerformed(evt);
            }
        });

        systemn.add(accountsmnit1);
        assetmgtmnit1.setText("Asset Management");
        assetmgtmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetmgtmnit1ActionPerformed(evt);
            }
        });

        systemn.add(assetmgtmnit1);
        fahrmnit1.setText("HR/Payroll");
        fahrmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrmnit1ActionPerformed(evt);
            }
        });

        systemn.add(fahrmnit1);
        reportsmnit1.setText("Reports & Utilities");
        reportsmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsmnit1ActionPerformed(evt);
            }
        });

        systemn.add(reportsmnit1);
        docsmnit1.setText("Help & Docs");
        docsmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docsmnit1ActionPerformed(evt);
            }
        });

        systemn.add(docsmnit1);
        systemn.add(jSeparator2);
        lnfmn.setText("Look & Feel");
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
        xpskinmn.setText("XP Skin");
        officexpmn.setText("XP Office theme");
        officexpmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officexpmnActionPerformed(evt);
            }
        });

        xpskinmn.add(officexpmn);
        office2003mn.setText("Office 2K3");
        office2003mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                office2003mnActionPerformed(evt);
            }
        });

        xpskinmn.add(office2003mn);
        studio2k5mn.setText("Studio 2K5");
        studio2k5mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studio2k5mnActionPerformed(evt);
            }
        });

        xpskinmn.add(studio2k5mn);
        lnfmn.add(xpskinmn);
        systemn.add(lnfmn);
        jMenuBar1.add(systemn);
        utilitymn.setMnemonic('U');
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
        monthlyroutinemnit.setText("Monthly Routine");
        monthlyroutinemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyroutinemnitActionPerformed(evt);
            }
        });

        utilitymn.add(monthlyroutinemnit);
        yearlyrotinemnit.setText("Yearly  Routine");
        yearlyrotinemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyrotinemnitActionPerformed(evt);
            }
        });

        utilitymn.add(yearlyrotinemnit);
        setaccperiodmnit.setText("Set Accounting Period");
        setaccperiodmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaccperiodmnitActionPerformed(evt);
            }
        });

        utilitymn.add(setaccperiodmnit);
        utilitymn.add(jSeparator10);
        chgpasswdmnit.setText("Change Password");
        chgpasswdmnit.setToolTipText("Click to change your existing password.");
        chgpasswdmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpasswdmnitActionPerformed(evt);
            }
        });

        utilitymn.add(chgpasswdmnit);
        updatedomainsmnit1.setText("Update Domains");
        updatedomainsmnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedomainsmnit1ActionPerformed(evt);
            }
        });

        utilitymn.add(updatedomainsmnit1);
        restoredatamnit.setText("Restore Data");
        utilitymn.add(restoredatamnit);
        Yearlyhlpsetsmnit.setText("Yearly Depreciation");
        Yearlyhlpsetsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearlyhlpsetsmnitActionPerformed(evt);
            }
        });

        utilitymn.add(Yearlyhlpsetsmnit);
        Approvemnit.setText("Approve Depreciation");
        Approvemnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApprovemnitActionPerformed(evt);
            }
        });

        utilitymn.add(Approvemnit);
        mbVerifymnit.setText("Verify Member Details");
        mbVerifymnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbVerifymnitActionPerformed(evt);
            }
        });

        utilitymn.add(mbVerifymnit);
        receiptPrefsmnit.setText("Receipt Preferences");
        receiptPrefsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptPrefsmnitActionPerformed(evt);
            }
        });

        utilitymn.add(receiptPrefsmnit);
        docsdirmnit.setText("Set Documents Directory");
        docsdirmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docsdirmnitActionPerformed(evt);
            }
        });

        utilitymn.add(docsdirmnit);
        utilitymn.add(jSeparator1);
        changeBackgoundImagemnit1.setText("Backgroung Image");
        changeBackgoundImagemnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBackgoundImagemnit1ActionPerformed(evt);
            }
        });

        utilitymn.add(changeBackgoundImagemnit1);
        reportPrefsmnit.setText("Receipt Preferences");
        reportPrefsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportPrefsmnitActionPerformed(evt);
            }
        });

        utilitymn.add(reportPrefsmnit);
        writeofflimitsmnit.setText("Writeoff Limits");
        writeofflimitsmnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeofflimitsmnitActionPerformed(evt);
            }
        });

        utilitymn.add(writeofflimitsmnit);
        jMenuBar1.add(utilitymn);
        helpmn.setMnemonic('H');
        helpmn.setText("Help");
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

        pack();
    }//GEN-END:initComponents

    private void detailedstmtmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailedstmtmnit1ActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.DetSchStmt, connectDB);
        
        dates.setVisible(true);
        
        // Add your handling code here:
    }//GEN-LAST:event_detailedstmtmnit1ActionPerformed

    private void detdebtorsStmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detdebtorsStmtmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.DebtorsStmtBrk, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_detdebtorsStmtmnitActionPerformed

    private void Annualtbmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Annualtbmnit1ActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.TrialbalanceMvt, connectDB);
        
        dates.setVisible(true); 
        // Add your handling code here:
    }//GEN-LAST:event_Annualtbmnit1ActionPerformed

    private void approveinvmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveinvmnit1ActionPerformed
        com.afrisoftech.accounting.DispatchPerPayerInvoicesIntfr prod = new com.afrisoftech.accounting.DispatchPerPayerInvoicesIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_approveinvmnit1ActionPerformed

    private void monthlyroutinemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyroutinemnitActionPerformed
    int exitOption = javax.swing.JOptionPane.showConfirmDialog(new java.awt.Frame(), "Are you sure you want to APPROVE the Trial Balance?", "Caution before Approve TB!", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (exitOption == javax.swing.JOptionPane.YES_OPTION) {
            com.afrisoftech.lib.HosTBApprDatePanel dates = new com.afrisoftech.lib.HosTBApprDatePanel(this,pConnDB, true, this.ApproveTB, connectDB);
            
            dates.setVisible(true);
        }else{
            if (exitOption == javax.swing.JOptionPane.NO_OPTION) {
                javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), "Thanks for taking caution.","Information Message!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } 
   
   
   // Add your handling code here:
    }//GEN-LAST:event_monthlyroutinemnitActionPerformed

    private void unfinalisedinvmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unfinalisedinvmnit1ActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.IpUnFinInv, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_unfinalisedinvmnit1ActionPerformed

    private void patientregnummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientregnummnitActionPerformed
//        com.afrisoftech.noc.PatientRegisterIntfr comp = new  com.afrisoftech.noc.PatientRegisterIntfr(connectDB,pConnDB);
//        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
//        try {
//            comp.setSelected(true);
//        } catch(java.beans.PropertyVetoException pvt){}          // Add your handling code here:
    }//GEN-LAST:event_patientregnummnitActionPerformed
    
    private void grtsuppliermnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grtsuppliermnit1ActionPerformed
        com.afrisoftech.lib.HosGrtDatePanel dates = new com.afrisoftech.lib.HosGrtDatePanel(this,pConnDB, true, GRT, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_grtsuppliermnit1ActionPerformed
    
    private void pnlmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnlmnit1ActionPerformed
        com.afrisoftech.lib.HosBsDatePanel dates = new com.afrisoftech.lib.HosBsDatePanel(this, true, this.ProfitLossTxt, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_pnlmnit1ActionPerformed
    
    private void studio2k5mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studio2k5mnActionPerformed
        
        this.changeTheme("org.fife.plaf.VisualStudio2005.VisualStudio2005LookAndFeel", null);
        
        appProp.setProperty("defaultlnf","org.fife.plaf.VisualStudio2005.VisualStudio2005LookAndFeel");
        
        appProp.setProperty("defaulttheme", "");
        this.updateNewComponentsUI();
        
        storePreferences();
        // Add your handling code here:
    }//GEN-LAST:event_studio2k5mnActionPerformed
    
    private void office2003mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_office2003mnActionPerformed
        
        this.changeTheme("org.fife.plaf.Office2003.Office2003LookAndFeel", null);
        
        appProp.setProperty("defaultlnf","org.fife.plaf.Office2003.Office2003LookAndFeel");
        
        appProp.setProperty("defaulttheme", "");
        this.updateNewComponentsUI();
        
        storePreferences();
        // Add your handling code here:
    }//GEN-LAST:event_office2003mnActionPerformed
    
    private void officexpmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officexpmnActionPerformed
        
        this.changeTheme("org.fife.plaf.OfficeXP.OfficeXPLookAndFeel", null);
        
        appProp.setProperty("defaultlnf","org.fife.plaf.OfficeXP.OfficeXPLookAndFeel");
        
        appProp.setProperty("defaulttheme", "");
        this.updateNewComponentsUI();
        
        storePreferences();
        // Add your handling code here:
    }//GEN-LAST:event_officexpmnActionPerformed
    
    private void interimtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interimtxtActionPerformed
        com.afrisoftech.lib.HosInPatientDatePanel dates = new com.afrisoftech.lib.HosInPatientDatePanel(this,pConnDB, true, this.interimTxt, connectDB);
        
        dates.setVisible(true);          // Add your handling code here:
    }//GEN-LAST:event_interimtxtActionPerformed
    
    private void FinalinvoicetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalinvoicetxtActionPerformed
        com.afrisoftech.lib.HosInPatInvPanel dates = new com.afrisoftech.lib.HosInPatInvPanel(this, true, this.InvIpTxt, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_FinalinvoicetxtActionPerformed
    
    private void OutpatientinvoicetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutpatientinvoicetxtActionPerformed
        com.afrisoftech.lib.HosInvPanel dates = new com.afrisoftech.lib.HosInvPanel(this, true, this.InvByInvTxt, connectDB);
        
        dates.setVisible(true);
        
        //   com.afrisoftech.txtreports.OutPatientInvTxtReport policy = new com.afrisoftech.txtreports.OutPatientInvTxtReport(connectDB);
        // policy.OutPatientInvTxtReport();         // Add your handling code here:
    }//GEN-LAST:event_OutpatientinvoicetxtActionPerformed
    
    private void journalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journalmnitActionPerformed
        com.afrisoftech.lib.HosJournalPanel dates = new com.afrisoftech.lib.HosJournalPanel(this, true, this.journalInd, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_journalmnitActionPerformed
    
    private void permitcollectormnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permitcollectormnitActionPerformed
        com.afrisoftech.accounting.PermitCollectionIntfr comp = new  com.afrisoftech.accounting.PermitCollectionIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_permitcollectormnitActionPerformed
    
    private void refferalsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refferalsmnitActionPerformed
        com.afrisoftech.accounting.RefferalsIntfr comp = new  com.afrisoftech.accounting.RefferalsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_refferalsmnitActionPerformed
    
    private void bodycollectionmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodycollectionmnitActionPerformed
        com.afrisoftech.accounting.BodyCollectionIntfr comp = new  com.afrisoftech.accounting.BodyCollectionIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_bodycollectionmnitActionPerformed
    
    private void sickoffsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sickoffsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Sickoffs, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_sickoffsmnitActionPerformed
    
    private void deathsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deathsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Deaths, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_deathsmnitActionPerformed
    
    private void cbookbalancesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbookbalancesmnitActionPerformed
        com.afrisoftech.reports.CashBookBalancesPdf policy = new com.afrisoftech.reports.CashBookBalancesPdf();
        policy.CashBookBalancesPdf(connectDB);   // Add your handling code here:
    }//GEN-LAST:event_cbookbalancesmnitActionPerformed
    
    private void CashSalesbrdmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashSalesbrdmnitActionPerformed
        com.afrisoftech.lib.HosDepDatePanel dates = new com.afrisoftech.lib.HosDepDatePanel(this,pConnDB, true, this.CashSalesBrd, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_CashSalesbrdmnitActionPerformed
    
    private void namesearchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namesearchmnitActionPerformed
        com.afrisoftech.accounting.NameSearchIntfr comp = new  com.afrisoftech.accounting.NameSearchIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_namesearchmnitActionPerformed
    
    private void rctdocfeesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rctdocfeesmnitActionPerformed
        com.afrisoftech.accounting.DoctorsFeesRctintfr comp = new  com.afrisoftech.accounting.DoctorsFeesRctintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_rctdocfeesmnitActionPerformed
    
    private void labsspecimensmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labsspecimensmnitActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_labsspecimensmnitActionPerformed
    
    private void laborresultsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laborresultsmnitActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_laborresultsmnitActionPerformed
    
    private void labresultsindmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labresultsindmnitActionPerformed
        com.afrisoftech.lib.HosLabPanel dates = new com.afrisoftech.lib.HosLabPanel(this, true, this.labResults, connectDB);
        
        dates.setVisible(true);      // Add your handling code here:
    }//GEN-LAST:event_labresultsindmnitActionPerformed
    
    private void labpendingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labpendingmnitActionPerformed
        com.afrisoftech.laboratory.LabPendingresultsIntfr comp = new  com.afrisoftech.laboratory.LabPendingresultsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_labpendingmnitActionPerformed
    
    private void ipdaysmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipdaysmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,IPDays, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_ipdaysmnitActionPerformed
    
    private void marketertnovermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketertnovermnitActionPerformed
        com.afrisoftech.lib.HosMarketerDatePanel dates = new com.afrisoftech.lib.HosMarketerDatePanel(this,pConnDB,true,MarketerTnover, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_marketertnovermnitActionPerformed
    
    private void payertnovermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payertnovermnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,PayerTnover, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_payertnovermnitActionPerformed
    
    private void approvedagentsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedagentsmnitActionPerformed
        com.afrisoftech.accounting.SchemeMarketersIntfr prod = new com.afrisoftech.accounting.SchemeMarketersIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_approvedagentsmnitActionPerformed
    
    private void schmdetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schmdetmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB,true,SchmDet, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_schmdetmnitActionPerformed
    
    private void writeofflimitsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeofflimitsmnitActionPerformed
        com.afrisoftech.accounting.DebtLimitIntfr prod = new com.afrisoftech.accounting.DebtLimitIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_writeofflimitsmnitActionPerformed
    
    private void automatedwoffsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automatedwoffsmnitActionPerformed
        com.afrisoftech.accounting.WritOffMiscDebtsIntrIntfr prod = new com.afrisoftech.accounting.WritOffMiscDebtsIntrIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_automatedwoffsmnitActionPerformed
    
    private void admissbywardmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissbywardmnitActionPerformed
        com.afrisoftech.lib.HosWardsDatePanel dates = new com.afrisoftech.lib.HosWardsDatePanel(this,pConnDB,true,admByWard, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_admissbywardmnitActionPerformed
    
    private void allocatewtocrtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocatewtocrtmnitActionPerformed
        com.afrisoftech.accounting.AllocateWithoutCreditsIntfr prod = new com.afrisoftech.accounting.AllocateWithoutCreditsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_allocatewtocrtmnitActionPerformed
    
    private void newbornsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbornsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,Births, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_newbornsmnitActionPerformed
    
    private void adjustinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjustinvmnitActionPerformed
        com.afrisoftech.accounting.AdjustInvoicesIntfr prod = new com.afrisoftech.accounting.AdjustInvoicesIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}      // Add your handling code here:
    }//GEN-LAST:event_adjustinvmnitActionPerformed
    
    private void creditsSummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsSummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,CreditsSumm, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_creditsSummnitActionPerformed
    
    private void paymentssummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentssummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,PaymentsSumm, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_paymentssummnitActionPerformed
    
    private void resubmissionbyschmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resubmissionbyschmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB,true,RsbClaimsByScm, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_resubmissionbyschmnitActionPerformed
    
    private void rtclaimsbyscmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtclaimsbyscmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB,true,RtClaimsByScm, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_rtclaimsbyscmnitActionPerformed
    
    private void rtclaimssummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtclaimssummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,RtClaimsSumm, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_rtclaimssummnitActionPerformed
    
    private void DebtorscrnotemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebtorscrnotemnitActionPerformed
        com.afrisoftech.lib.HosScemesCrNoteDatePanel dates = new com.afrisoftech.lib.HosScemesCrNoteDatePanel(this,pConnDB,true,DebtCrNote, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_DebtorscrnotemnitActionPerformed
    
    private void loanageingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanageingmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,LoanStockAgeing, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_loanageingmnitActionPerformed
    
    private void loanstmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanstmtmnitActionPerformed
        com.afrisoftech.lib.HosLoanStockDatePanel dates = new com.afrisoftech.lib.HosLoanStockDatePanel(this,pConnDB,true,LoanStmt, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_loanstmtmnitActionPerformed
    
    private void payrollledgermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollledgermnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,PayrollLedger, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_payrollledgermnitActionPerformed
    
    private void reportPrefsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportPrefsmnitActionPerformed
        com.afrisoftech.accounting.ReportPrefsIntfr prod = new com.afrisoftech.accounting.ReportPrefsIntfr(connectDB,pConnDB, appProp);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_reportPrefsmnitActionPerformed
    
    private void ageingbycatmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageingbycatmnitActionPerformed
        com.afrisoftech.lib.HosCredCatDatePanel dates = new com.afrisoftech.lib.HosCredCatDatePanel(this,pConnDB,true,CreditorsAgeingByCat, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_ageingbycatmnitActionPerformed
    
    private void LoanregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanregmnitActionPerformed
        com.afrisoftech.accounting.LoanRegistrationintfr prod = new com.afrisoftech.accounting.LoanRegistrationintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_LoanregmnitActionPerformed
    
    private void resubmitclaimsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resubmitclaimsmnitActionPerformed
        com.afrisoftech.accounting.ResubmissionIntfr prod = new com.afrisoftech.accounting.ResubmissionIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_resubmitclaimsmnitActionPerformed
    
    private void rtclaimsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtclaimsmnitActionPerformed
        com.afrisoftech.accounting.RetunedClaimIntfr prod = new com.afrisoftech.accounting.RetunedClaimIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_rtclaimsmnitActionPerformed
    
    private void creditallocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditallocmnitActionPerformed
        com.afrisoftech.accounting.AllocateCreditorsInvsIntfr prod = new com.afrisoftech.accounting.AllocateCreditorsInvsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_creditallocmnitActionPerformed
    
    private void chgintrmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgintrmnitActionPerformed
        com.afrisoftech.accounting.ChargeDebtIntrIntfr prod = new com.afrisoftech.accounting.ChargeDebtIntrIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_chgintrmnitActionPerformed
    
    private void DispdelnotemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DispdelnotemnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.Ddnote, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_DispdelnotemnitActionPerformed
    
    private void PayerallocdetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayerallocdetmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB,true,this.PayerAllocDet, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_PayerallocdetmnitActionPerformed
    
    private void anualplmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anualplmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.AnnualPl, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_anualplmnitActionPerformed
    
    private void AnnualtbmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnualtbmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.AnnualTb, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_AnnualtbmnitActionPerformed
    
    private void ConfirmedBookingsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmedBookingsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.ConfBookings, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_ConfirmedBookingsmnitActionPerformed
    
    private void BookingsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Bookings, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_BookingsmnitActionPerformed
    
    private void wrtsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrtsummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.WrtSumm, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_wrtsummnitActionPerformed
    
    private void wrtperscmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrtperscmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB,true,this.WrtByScm, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_wrtperscmnitActionPerformed
    
    private void ScmsalesSummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScmsalesSummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.ScmSalesSumm, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_ScmsalesSummnitActionPerformed
    
    private void debtcollsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtcollsummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.DebtCollSumm, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_debtcollsummnitActionPerformed
    
    private void dormaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dormaccmnitActionPerformed
        com.afrisoftech.reports.DormSchemesPdf policy = new com.afrisoftech.reports.DormSchemesPdf();
        policy.DormSchemesPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_dormaccmnitActionPerformed
    
    private void payerstaffamdmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payerstaffamdmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB,true,this.PayerStaffAmd, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_payerstaffamdmnitActionPerformed
    
    private void ScmammnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScmammnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB,true,this.ScmAmm, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_ScmammnitActionPerformed
    
    private void cashflowoptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashflowoptmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.CasFlowOeprt, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_cashflowoptmnitActionPerformed
    
    private void dispconfperpayermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispconfperpayermnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB,true,this.DispConfPerPayer, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_dispconfperpayermnitActionPerformed
    
    private void confdispperscmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confdispperscmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB,true,this.DispConfPerScm, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_confdispperscmnitActionPerformed
    
    private void scmepfmmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scmepfmmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB,true,this.ScmPerf, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_scmepfmmnitActionPerformed
    
    private void oprevbrkdwnmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oprevbrkdwnmnitActionPerformed
        com.afrisoftech.lib.HosDepDatePanel dates = new com.afrisoftech.lib.HosDepDatePanel(this,pConnDB,true, this.AmbulRep, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_oprevbrkdwnmnitActionPerformed
    
    private void debtinvoicingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtinvoicingmnitActionPerformed
        com.afrisoftech.accounting.DebtorsBillingIntfr prod = new com.afrisoftech.accounting.DebtorsBillingIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){} // Add your handling code here:
    }//GEN-LAST:event_debtinvoicingmnitActionPerformed
    
    private void WriteoffscrtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WriteoffscrtmnitActionPerformed
        com.afrisoftech.accounting.WriteOffsCreditsIntfr comp = new  com.afrisoftech.accounting.WriteOffsCreditsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_WriteoffscrtmnitActionPerformed
    
    private void WriteoffsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WriteoffsmnitActionPerformed
        com.afrisoftech.accounting.WriteOffsInvIntfr comp = new  com.afrisoftech.accounting.WriteOffsInvIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}// Add your handling code here:
    }//GEN-LAST:event_WriteoffsmnitActionPerformed
    
    private void changepayermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepayermnitActionPerformed
        com.afrisoftech.accounting.ChangeAccountsPayerIntfr comp = new  com.afrisoftech.accounting.ChangeAccountsPayerIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_changepayermnitActionPerformed
    
    private void patstmtsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patstmtsummnitActionPerformed
        com.afrisoftech.accounting.PatientStmtSummIntfr comp = new  com.afrisoftech.accounting.PatientStmtSummIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_patstmtsummnitActionPerformed
    
    private void bookingsconfchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingsconfchmnitActionPerformed
        com.afrisoftech.accounting.BookingsConfimIntfr comp = new  com.afrisoftech.accounting.BookingsConfimIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_bookingsconfchmnitActionPerformed
    
    private void bookingschsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingschsmnitActionPerformed
        TheatreBookingIntfr comp = new TheatreBookingIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){} // Add your handling code here:
    }//GEN-LAST:event_bookingschsmnitActionPerformed
    
    private void AmendCashbookmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmendCashbookmnitActionPerformed
        javax.swing.JInternalFrame prod = new com.afrisoftech.accounting.CashbookAmmendIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_AmendCashbookmnitActionPerformed
    
    private void journalsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journalsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.Journals, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_journalsmnitActionPerformed
    
    private void payerperfmmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payerperfmmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB,true,this.PayerPfm, connectDB);
        
        dates.setVisible(true);       // Add your handling code here:
    }//GEN-LAST:event_payerperfmmnitActionPerformed
    
    private void AmendCreditmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmendCreditmnitActionPerformed
        javax.swing.JInternalFrame prod = new com.afrisoftech.accounting.CreditorInvAmmendIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_AmendCreditmnitActionPerformed
    
    private void QuartelyRevCompmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuartelyRevCompmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.QuarterlyRevComp, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_QuartelyRevCompmnitActionPerformed
    
    private void MonthrevCompmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthrevCompmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.MonthlyRevComp, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_MonthrevCompmnitActionPerformed
    
    private void AieRepmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AieRepmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.AieB, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_AieRepmnitActionPerformed
    
    private void InpatientAnalysismnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpatientAnalysismnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.IpAnalySummaryRev, connectDB);
        
        dates.setVisible(true);           // Add your handling code here:
    }//GEN-LAST:event_InpatientAnalysismnitActionPerformed
    
    private void AiemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AiemnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.accounting.AieIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}           // Add your handling code here:
    }//GEN-LAST:event_AiemnitActionPerformed
    
    private void RevmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.accounting.RevenuleIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_RevmnitActionPerformed
    
    private void BedOccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedOccmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.accounting.BedOccupancyIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_BedOccmnitActionPerformed
    
    private void weeklyrevCompmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeklyrevCompmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.WeeklySummaryRev, connectDB);
        
        dates.setVisible(true);          // Add your handling code here:
    }//GEN-LAST:event_weeklyrevCompmnitActionPerformed
    
    private void MonthlyDiagAnalysismnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyDiagAnalysismnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.MonthlyDiagSummary, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_MonthlyDiagAnalysismnitActionPerformed
    
    private void AttendancesummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendancesummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.OpAttSumm, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_AttendancesummnitActionPerformed
    
    private void accabtexpiremnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accabtexpiremnitActionPerformed
        com.afrisoftech.reports.SchmAboutToExpPdf policy = new com.afrisoftech.reports.SchmAboutToExpPdf();
        policy.SchmAboutToExpPdf(connectDB);  // Add your handling code here:
    }//GEN-LAST:event_accabtexpiremnitActionPerformed
    
    private void annualpayersummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualpayersummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.AnnualPayerAgSumm, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_annualpayersummnitActionPerformed
    
    private void anualPayeragmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anualPayeragmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB,true,this.AnnualPayerAg, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_anualPayeragmnitActionPerformed
    
    private void creditsbypayermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsbypayermnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB,true,this.DebtCredt, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_creditsbypayermnitActionPerformed
    
    private void DiagnosisanalysismnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosisanalysismnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DiagnosisAnalysis, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_DiagnosisanalysismnitActionPerformed
    
    private void CashanalysismnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashanalysismnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.CashAnalysis, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_CashanalysismnitActionPerformed
    
    private void impdocregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impdocregmnitActionPerformed
        com.afrisoftech.accounting.ImpDocRegisterIntfr prod = new com.afrisoftech.accounting.ImpDocRegisterIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_impdocregmnitActionPerformed
    
    private void docregistermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docregistermnitActionPerformed
        com.afrisoftech.accounting.DocRegisterIntfr prod = new com.afrisoftech.accounting.DocRegisterIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_docregistermnitActionPerformed
    
    private void QuarterrevmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuarterrevmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.QuarterlyRev, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_QuarterrevmnitActionPerformed
    
    private void provdocscmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provdocscmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.DocScmProvSumm, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_provdocscmnitActionPerformed
    
    private void docprovsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docprovsummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true,this.DocProvSumm, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_docprovsummnitActionPerformed
    
    private void provperdocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provperdocmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB, true, this.DocProv, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_provperdocmnitActionPerformed
    
    private void revpricelistmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revpricelistmnitActionPerformed
        com.afrisoftech.lib.HosDepDatePanel dates = new com.afrisoftech.lib.HosDepDatePanel(this,pConnDB, true, this.RevPrices, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_revpricelistmnitActionPerformed
    
    private void deathnotficationmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deathnotficationmnitActionPerformed
        com.afrisoftech.accounting.DeathNotificationIntfr prod = new com.afrisoftech.accounting.DeathNotificationIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}      // Add your handling code here:
    }//GEN-LAST:event_deathnotficationmnitActionPerformed
    
    private void bthregistermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthregistermnitActionPerformed
        com.afrisoftech.accounting.BirthRegistrationIntfr prod = new com.afrisoftech.accounting.BirthRegistrationIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_bthregistermnitActionPerformed
    
    private void allocchqmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocchqmnitActionPerformed
        com.afrisoftech.lib.HosChqsPanel dates = new com.afrisoftech.lib.HosChqsPanel(this,pConnDB, true, this.AllocBychq, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_allocchqmnitActionPerformed
    
    private void confdispsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confdispsummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.ConfDisp, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_confdispsummnitActionPerformed
    
    private void payeractaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeractaccmnitActionPerformed
        com.afrisoftech.lib.HosDebtorPanel dates = new com.afrisoftech.lib.HosDebtorPanel(this,pConnDB, true, this.PayerActAcc, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_payeractaccmnitActionPerformed
    
    private void attdperscmdetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attdperscmdetmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.AttPerscmDet, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_attdperscmdetmnitActionPerformed
    
    private void scmperfrmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scmperfrmnitActionPerformed
        com.afrisoftech.reports.SchemePerformPdf policy = new com.afrisoftech.reports.SchemePerformPdf();
        policy.SchemePerformPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_scmperfrmnitActionPerformed
    
    private void autolimitsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autolimitsmnitActionPerformed
        com.afrisoftech.reports.SchemeLimitStatusPdf policy = new com.afrisoftech.reports.SchemeLimitStatusPdf();
        policy.SchemeLimitStatusPdf(connectDB);     // Add your handling code here:
    }//GEN-LAST:event_autolimitsmnitActionPerformed
    
    private void scmstatusmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scmstatusmnitActionPerformed
        com.afrisoftech.reports.SchmAccStatusPdf policy = new com.afrisoftech.reports.SchmAccStatusPdf();
        policy.SchmAccStatusPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_scmstatusmnitActionPerformed
    
    private void TranssummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranssummnitActionPerformed
        com.afrisoftech.lib.AccountHosDatePanel dates = new com.afrisoftech.lib.AccountHosDatePanel(this,pConnDB, true, this.TransSumm, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_TranssummnitActionPerformed
    
    private void bankrecdiscrpmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankrecdiscrpmnitActionPerformed
        com.afrisoftech.lib.HosCashbookDatePanel dates = new com.afrisoftech.lib.HosCashbookDatePanel(this,pConnDB, true, this.BankRecDiscr, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_bankrecdiscrpmnitActionPerformed
    
    private void shiftrepDetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftrepDetmnitActionPerformed
        com.afrisoftech.lib.HosShiftDatePanel dates = new com.afrisoftech.lib.HosShiftDatePanel(this,pConnDB, true, this.ShiftDet, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_shiftrepDetmnitActionPerformed
    
    private void payeepymtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeepymtmnitActionPerformed
        com.afrisoftech.lib.HosPayeeDatePanel dates = new com.afrisoftech.lib.HosPayeeDatePanel(this,pConnDB, true, this.Paymentpercrdet, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_payeepymtmnitActionPerformed
    
    private void crdstmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crdstmtmnitActionPerformed
        com.afrisoftech.lib.HosCreditorsDatePanel dates = new com.afrisoftech.lib.HosCreditorsDatePanel(this,pConnDB, true, this.CreditorsStmt, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_crdstmtmnitActionPerformed
    
    private void schmsdebtCollmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schmsdebtCollmnitActionPerformed
        com.afrisoftech.lib.HosCollectorDatePanel dates = new com.afrisoftech.lib.HosCollectorDatePanel(this,pConnDB, true, this.DebtCollector, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_schmsdebtCollmnitActionPerformed
    
    private void scmabtlimitmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scmabtlimitmnitActionPerformed
        com.afrisoftech.reports.SchemesAbtExceedLimitPdf policy = new com.afrisoftech.reports.SchemesAbtExceedLimitPdf();
        policy.SchemesAbtExceedLimitPdf(connectDB);     // Add your handling code here:
    }//GEN-LAST:event_scmabtlimitmnitActionPerformed
    
    private void extactscmmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extactscmmnitActionPerformed
        com.afrisoftech.reports.ExcLimitActScmPdf policy = new com.afrisoftech.reports.ExcLimitActScmPdf();
        policy.ExcLimitActScmPdf(connectDB);       // Add your handling code here:
    }//GEN-LAST:event_extactscmmnitActionPerformed
    
    private void bnkchargesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnkchargesmnitActionPerformed
        com.afrisoftech.accounting.OtherChargesintfr prod = new com.afrisoftech.accounting.OtherChargesintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_bnkchargesmnitActionPerformed
    
    private void deathregistermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deathregistermnitActionPerformed
        com.afrisoftech.accounting.DeathRegistrationIntfr prod = new com.afrisoftech.accounting.DeathRegistrationIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_deathregistermnitActionPerformed
    
    private void sickleavemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sickleavemnitActionPerformed
        com.afrisoftech.accounting.SickLeaveIntfr prod = new com.afrisoftech.accounting.SickLeaveIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_sickleavemnitActionPerformed
    
    private void mergdispmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergdispmnitActionPerformed
        com.afrisoftech.hospital.MergingDispIntfr prod = new com.afrisoftech.hospital.MergingDispIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_mergdispmnitActionPerformed
    
    private void DispConfSummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DispConfSummnitActionPerformed
        com.afrisoftech.accounting.DispConfimSummaryIntfr prod = new com.afrisoftech.accounting.DispConfimSummaryIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_DispConfSummnitActionPerformed
    
    private void DispConfirmationmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DispConfirmationmnitActionPerformed
        com.afrisoftech.accounting.DispConfimIntfr prod = new com.afrisoftech.accounting.DispConfimIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_DispConfirmationmnitActionPerformed
    
    private void limitconsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitconsmnitActionPerformed
        com.afrisoftech.hospital.LimitConsIntfr prod = new com.afrisoftech.hospital.LimitConsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_limitconsmnitActionPerformed
    
    private void adjpricesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjpricesmnitActionPerformed
        com.afrisoftech.hospital.AmmendRevpricesintfr prod = new com.afrisoftech.hospital.AmmendRevpricesintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_adjpricesmnitActionPerformed
    
    private void YearyrevmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearyrevmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.YearlyRev, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_YearyrevmnitActionPerformed
    
    private void MonthrevmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthrevmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.MonthlyRev, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_MonthrevmnitActionPerformed
    
    private void DailyrevmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyrevmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DailysRev, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_DailyrevmnitActionPerformed
    
    private void weeklyrevmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeklyrevmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.WeeklyRev, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_weeklyrevmnitActionPerformed
    
    private void annualageingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualageingmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.AnnualDebtors, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_annualageingmnitActionPerformed
    
    private void ApprovemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApprovemnitActionPerformed
        com.afrisoftech.accounting.ApproveDepreciationClass depreciation = new com.afrisoftech.accounting.ApproveDepreciationClass(connectDB,pConnDB);
        
        System.out.println("The depreciation object : "+depreciation.toString());
        
        depreciation.DepreciationClass();        // Add your handling code here:
    }//GEN-LAST:event_ApprovemnitActionPerformed
    
    private void insuncemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuncemnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.management.AmmendExRateIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}          // Add your handling code here:
    }//GEN-LAST:event_insuncemnitActionPerformed
    
    private void aslocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aslocmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.management.TaxClaimRefundIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}          // Add your handling code here:
    }//GEN-LAST:event_aslocmnitActionPerformed
    
    private void astregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astregmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.management.GroupStatisticIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_astregmnitActionPerformed
    
    private void asrepmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asrepmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.management.FormatSetIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}      // Add your handling code here:
    }//GEN-LAST:event_asrepmnitActionPerformed
    
    private void AssetAlmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssetAlmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.management.ExceptionalItemsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}          // Add your handling code here:
    }//GEN-LAST:event_AssetAlmnitActionPerformed
    
    private void DeprecatesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeprecatesmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.management.ExchangeRateIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}          // Add your handling code here:
    }//GEN-LAST:event_DeprecatesmnitActionPerformed
    
    private void DeprecmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeprecmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.management.CurrencyIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_DeprecmnitActionPerformed
    
    private void budgetamendmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgetamendmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.accounting.BudgetAmendementintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_budgetamendmnitActionPerformed
    
    private void budgettotalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgettotalmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.accounting.BudgetDTotalintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_budgettotalmnitActionPerformed
    
    private void budgetdeptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgetdeptmnitActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.accounting.BudgetDepttintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_budgetdeptmnitActionPerformed
    
    private void budgetsectmintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budgetsectmintActionPerformed
        javax.swing.JInternalFrame comp = new com.afrisoftech.accounting.BudgetSectionintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_budgetsectmintActionPerformed
    
    private void taxreturnmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxreturnmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.TaxReturn, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_taxreturnmnitActionPerformed
    
    private void CorporateTaxmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorporateTaxmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.CorporateTax, connectDB);
        
        dates.setVisible(true);
        
        // Add your handling code here:
    }//GEN-LAST:event_CorporateTaxmnitActionPerformed
    
    private void AssetAllocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssetAllocmnitActionPerformed
        com.afrisoftech.accounting.AssetAllocationIntfr prod = new com.afrisoftech.accounting.AssetAllocationIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_AssetAllocmnitActionPerformed
    
    private void CorporatemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorporatemnitActionPerformed
        com.afrisoftech.hospital.CorporateIntfr prod = new com.afrisoftech.hospital.CorporateIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_CorporatemnitActionPerformed
    
    private void OpcreditmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcreditmnitActionPerformed
        com.afrisoftech.lib.OpCreditPanel dates = new com.afrisoftech.lib.OpCreditPanel(this, true, this.OpCredit, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_OpcreditmnitActionPerformed
    
    private void IPCreditmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPCreditmnitActionPerformed
        com.afrisoftech.lib.HosCredInPatPanel dates = new com.afrisoftech.lib.HosCredInPatPanel(this,true, this.FinalInPatCredit, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_IPCreditmnitActionPerformed
    
    private void CreditnoteSchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditnoteSchmnitActionPerformed
         com.afrisoftech.hospital.CreditInvAmmendIntfr prod = new com.afrisoftech.hospital.CreditInvAmmendIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
    /*    com.afrisoftech.hospital.CreditNoteIntfr prod = new com.afrisoftech.hospital.CreditNoteIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
     */
        // Add your handling code here:
    }//GEN-LAST:event_CreditnoteSchmnitActionPerformed
    
    private void postdatedchqmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postdatedchqmnitActionPerformed
        com.afrisoftech.reports.PostdatedChqsPdf policy = new com.afrisoftech.reports.PostdatedChqsPdf();
        policy.PostdatedChqsPdf(connectDB);  // Add your handling code here:
    }//GEN-LAST:event_postdatedchqmnitActionPerformed
    
    private void DebtStatementmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebtStatementmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this, pConnDB, true, this.DebtStmSummary, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_DebtStatementmnitActionPerformed
    
    private void finalindetpatinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalindetpatinvmnitActionPerformed
        com.afrisoftech.lib.HosInPatInvPanel dates = new com.afrisoftech.lib.HosInPatInvPanel(this, true, this.FinInDetInv, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_finalindetpatinvmnitActionPerformed
    
    private void DetinvbyinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetinvbyinvmnitActionPerformed
        com.afrisoftech.lib.HosInvPanel dates = new com.afrisoftech.lib.HosInvPanel(this, true, this.DetInvByInv, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_DetinvbyinvmnitActionPerformed
    
    private void dispatchperpayersummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispatchperpayersummnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this, pConnDB, true, this.DispPerPayerSumm, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_dispatchperpayersummnitActionPerformed
    
    private void paymntadjmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymntadjmnitActionPerformed
        int rowsNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            // java.sql.ResultSet rset = stmt.executeQuery("select user,count(debit),sum(debit + credit) from ac_cash_book where account_no ='"+jComboBox2.getSelectedItem()+"' and description !='' and reconciled = false AND date BETWEEN '"+datePicker1.getDate().toString()+"' AND '"+datePicker2.getDate().toString()+"' group by account_name");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(user_name) from ac_shifts where  user_name ilike '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
            
            while (rset1.next()) {
                
                rowsNo = rset1.getInt(1);
                
            }
            if (rowsNo < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "There is no Shift running");
            } else {
                
                //   while (rset.next()){
                
                //if(this.getShiftStatus()){
                
                com.afrisoftech.accounting.OtherPymAdjintfr prod = new com.afrisoftech.accounting.OtherPymAdjintfr(connectDB,pConnDB);
                saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
                
                try {
                    prod.setSelected(true);
                } catch(java.beans.PropertyVetoException pvt){}
                
                //  com.afrisoftech.accounting.InpatientRecpIntfr comp = new com.afrisoftech.accounting.InpatientRecpIntfr(connectDB,pConnDB);
                //  saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                // com.afrisoftech.hospital.InpatientReceiptsIntfr comp = new com.afrisoftech.hospital.InpatientReceiptsIntfr(connectDB,pConnDB);
                // comp.getContentPane().add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            }
        }
        
        catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sqlex.getMessage());
            
        }
    /*    com.afrisoftech.accounting.OtherPymAdjintfr prod = new com.afrisoftech.accounting.OtherPymAdjintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
     */// Add your handling code here:
    }//GEN-LAST:event_paymntadjmnitActionPerformed
    
    private void wardoccstatisticsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardoccstatisticsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.WardOccSt, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_wardoccstatisticsmnitActionPerformed
    
    private void allocbypayermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocbypayermnitActionPerformed
        com.afrisoftech.accounting.AllocateInvoicesByPayerIntfr prod = new com.afrisoftech.accounting.AllocateInvoicesByPayerIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_allocbypayermnitActionPerformed
    
    private void cancelledchqmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelledchqmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.CancelledChqs, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_cancelledchqmnitActionPerformed
    
    private void creditnotesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditnotesmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.CreditNotes, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_creditnotesmnitActionPerformed
    
    private void billsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsummnitActionPerformed
        com.afrisoftech.lib.HosInPatientDatePanel dates = new com.afrisoftech.lib.HosInPatientDatePanel(this,pConnDB, true, this.InpatBillSamm, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_billsummnitActionPerformed
    

//GEN-FIRST:event_inpatBillSummActionPerformed

//GEN-LAST:event_inpatBillSummActionPerformed
    private void inpatbillsammActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpatbillsammActionPerformed
    }   // Add your handling code here:

//GEN-LAST:event_inpatbillsammActionPerformed
    private void stmtsummperdebtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stmtsummperdebtmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.StmtSummPerDebt, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_stmtsummperdebtmnitActionPerformed
    
    private void DiagnosissummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosissummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DiagSumm, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_DiagnosissummnitActionPerformed
    
    private void expiredaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiredaccmnitActionPerformed
        com.afrisoftech.reports.ExpiredSchmAccPdf comp = new com.afrisoftech.reports.ExpiredSchmAccPdf();
        comp.ExpiredSchmAccPdf(connectDB); // Add your handling code here:
    }//GEN-LAST:event_expiredaccmnitActionPerformed
    
    private void scmattendsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scmattendsummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.AttendPerScm, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_scmattendsummnitActionPerformed
    
    private void closedschemesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closedschemesmnitActionPerformed
        com.afrisoftech.reports.ClosedSchmAccPdf comp = new com.afrisoftech.reports.ClosedSchmAccPdf();
        comp.ClosedSchmAccPdf(connectDB); // Add your handling code here:
    }//GEN-LAST:event_closedschemesmnitActionPerformed
    
    private void whtsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whtsummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.WHTSUMM, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_whtsummnitActionPerformed
    
    private void schemesalesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemesalesmnitActionPerformed
        com.afrisoftech.lib.HosMarketerDatePanel dates = new com.afrisoftech.lib.HosMarketerDatePanel(this,pConnDB, true, this.SchemeSales, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_schemesalesmnitActionPerformed
    
    private void banksummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banksummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.BankingSumm, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_banksummnitActionPerformed
    
    private void bankingsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankingsmnitActionPerformed
        com.afrisoftech.lib.HosCashbookDatePanel dates = new com.afrisoftech.lib.HosCashbookDatePanel(this,pConnDB, true, this.BankingPerBK, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_bankingsmnitActionPerformed
    
    private void finalinpatinvsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalinpatinvsummnitActionPerformed
        com.afrisoftech.lib.HosInPatInvPanel dates = new com.afrisoftech.lib.HosInPatInvPanel(this, true, this.FinalInvSumm, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_finalinpatinvsummnitActionPerformed
    
    private void unrecitemsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unrecitemsmnitActionPerformed
        com.afrisoftech.lib.HosCashbookDatePanel dates = new com.afrisoftech.lib.HosCashbookDatePanel(this,pConnDB, true, this.UnReconcItemsPerbk, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_unrecitemsmnitActionPerformed
    
    private void changeiplimitmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeiplimitmnitActionPerformed
        javax.swing.JInternalFrame prod = new ChangePatLimitIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){} // Add your handling code here:
    }//GEN-LAST:event_changeiplimitmnitActionPerformed
    
    private void creditorsmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditorsmnActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_creditorsmnActionPerformed
    
    private void iplimitmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iplimitmnitActionPerformed
        javax.swing.JInternalFrame prod = new IpLimitIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_iplimitmnitActionPerformed
    
    private void mergschaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergschaccmnitActionPerformed
        com.afrisoftech.accounting.MergingAccountsIntfr prod = new com.afrisoftech.accounting.MergingAccountsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_mergschaccmnitActionPerformed
    
    private void UnreconcitemsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnreconcitemsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.UnReconcItems, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_UnreconcitemsmnitActionPerformed
    
    private void assetrepmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetrepmnitActionPerformed
        com.afrisoftech.reports.AssetsRegPdf comp = new com.afrisoftech.reports.AssetsRegPdf();
        comp.AssetsRegPdf(connectDB);   // Add your handling code here:
    }//GEN-LAST:event_assetrepmnitActionPerformed
    
    private void bankreccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankreccmnitActionPerformed
        com.afrisoftech.lib.HosCashbookDatePanel dates = new com.afrisoftech.lib.HosCashbookDatePanel(this,pConnDB, true, this.BankRecc, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_bankreccmnitActionPerformed
    
    private void unpaidDispInvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unpaidDispInvmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.UnpaidDisp, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_unpaidDispInvmnitActionPerformed
    
    private void allocsumnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocsumnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.AllocationDetail, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_allocsumnitActionPerformed
    
    private void debtosbalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtosbalmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DebtOSBAlSumm, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_debtosbalmnitActionPerformed
    
    private void provisionsperdebtormnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provisionsperdebtormnitActionPerformed
        com.afrisoftech.accounting.ProvisionsPerDebtorIntfr prod = new com.afrisoftech.accounting.ProvisionsPerDebtorIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_provisionsperdebtormnitActionPerformed
    
    private void DispatchSummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DispatchSummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DispInvSumm, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_DispatchSummnitActionPerformed
    
    private void changepaymodesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepaymodesmnitActionPerformed
        javax.swing.JInternalFrame prod = new ChangePatPaymodeIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_changepaymodesmnitActionPerformed
    

//GEN-FIRST:event_changepaymodeActionPerformed

//GEN-LAST:event_changepaymodeActionPerformed
    private void merginvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merginvmnitActionPerformed
        javax.swing.JInternalFrame prod = new MergingInvIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_merginvmnitActionPerformed
    
    private void allocsummperdebtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocsummperdebtmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.PayerAllocSumm, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_allocsummperdebtmnitActionPerformed
    
    private void invwithbalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invwithbalmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.FinalInvBal, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_invwithbalmnitActionPerformed
    
    private void debtrectallocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtrectallocmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DebtAllocSumm, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_debtrectallocmnitActionPerformed
    
    private void scmallocsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scmallocsummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.ScmAllocSumm, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_scmallocsummnitActionPerformed
    
    private void nhifdispmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhifdispmnitActionPerformed
        com.afrisoftech.lib.HosDispartchDatePanel dates = new com.afrisoftech.lib.HosDispartchDatePanel(this,pConnDB,true, this.NhifDisp,connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_nhifdispmnitActionPerformed
    
    private void transbyaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transbyaccmnitActionPerformed
        com.afrisoftech.lib.AccountHosDatePanel dates = new com.afrisoftech.lib.AccountHosDatePanel(this,pConnDB, true, this.TransByacc, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_transbyaccmnitActionPerformed
    
    private void shiftstotalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftstotalmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.ShiftsTotal, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_shiftstotalmnitActionPerformed
    
    private void credittransfmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credittransfmnitActionPerformed
        com.afrisoftech.accounting.DebtCreditTransIntfr prod = new com.afrisoftech.accounting.DebtCreditTransIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_credittransfmnitActionPerformed
    
    private void paidupbyscmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidupbyscmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB,true, this.DocPaidupPerScm, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_paidupbyscmnitActionPerformed
    
    private void paidupperdebtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidupperdebtmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB,true, this.DocPaidupPerDebtor, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_paidupperdebtmnitActionPerformed
    
    private void stmtperdebtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stmtperdebtmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB,true, this.DocStmtPerDebtor, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_stmtperdebtmnitActionPerformed
    
    private void stmtscmmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stmtscmmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB,true, this.DoctorStmScm, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_stmtscmmnitActionPerformed
    
    private void docearndeductmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docearndeductmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DocEarnDeductions, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_docearndeductmnitActionPerformed
    
    private void provperschmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provperschmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.ProvPerSchm, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_provperschmnitActionPerformed
    
    private void provperdebtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provperdebtmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.ProvPerDebtor, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_provperdebtmnitActionPerformed
    
    private void ProvisionssummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvisionssummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.ProvSumm, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_ProvisionssummnitActionPerformed
    
    private void provisionsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provisionsmnitActionPerformed
        com.afrisoftech.accounting.ProvisionsIntfr prod = new com.afrisoftech.accounting.ProvisionsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_provisionsmnitActionPerformed
    
    private void markupbelowmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markupbelowmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.SalesBelowMk, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_markupbelowmnitActionPerformed
    
    private void SummarymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SummarymnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.UnDispInv, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_SummarymnitActionPerformed
    
    private void uncollectedshiftsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uncollectedshiftsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.UncollectedShifts, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_uncollectedshiftsmnitActionPerformed
    
    private void docunpaidinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docunpaidinvmnitActionPerformed
        
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB,true, this.DoctorStmUnPaid, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_docunpaidinvmnitActionPerformed
    
    private void docbalsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docbalsummnitActionPerformed
        com.afrisoftech.reports.DocBalSummPdf comp = new com.afrisoftech.reports.DocBalSummPdf();
        comp.DocBalSummPdf(connectDB); // Add your handling code here:
    }//GEN-LAST:event_docbalsummnitActionPerformed
    
    private void paymentperdocSummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentperdocSummnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB,true, this.PaymentsPerDoctorSumm, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_paymentperdocSummnitActionPerformed
    

//GEN-FIRST:event_paymtsummperdocActionPerformed

//GEN-LAST:event_paymtsummperdocActionPerformed
    private void inpatreceiptadjmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpatreceiptadjmnitActionPerformed
        com.afrisoftech.accounting.InpatientReceiptsAdjIntfr prod = new com.afrisoftech.accounting.InpatientReceiptsAdjIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_inpatreceiptadjmnitActionPerformed
    
    private void AmmendstaffregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmmendstaffregmnitActionPerformed
        javax.swing.JInternalFrame prod = new SchemeStaffMagtIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_AmmendstaffregmnitActionPerformed
    
    private void pettycashshiftsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettycashshiftsmnitActionPerformed
        com.afrisoftech.lib.HosShiftDatePanel dates = new com.afrisoftech.lib.HosShiftDatePanel(this,pConnDB,true, this.PettyCashShift, connectDB);
        
        dates.setVisible(true);// Add your handling code here:
    }//GEN-LAST:event_pettycashshiftsmnitActionPerformed
    
    private void payerageingsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payerageingsummnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.PayerAgeingSumm, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_payerageingsummnitActionPerformed
    
    private void debtorsyearlybalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtorsyearlybalmnitActionPerformed
        com.afrisoftech.reports.DebtorsAnualSummaryPdf comp = new com.afrisoftech.reports.DebtorsAnualSummaryPdf();
        comp.DebtorsAnualSummaryPdf(connectDB);
        // Add your handling code here:
    }//GEN-LAST:event_debtorsyearlybalmnitActionPerformed
    
    private void accstatusmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accstatusmnitActionPerformed
        com.afrisoftech.reports.ClosedDocAccPdf comp = new com.afrisoftech.reports.ClosedDocAccPdf();
        comp.ClosedDocAccPdf(connectDB); // Add your handling code here:
    }//GEN-LAST:event_accstatusmnitActionPerformed
    
    private void closedocaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closedocaccmnitActionPerformed
        javax.swing.JInternalFrame prod = new CloseSuspDocIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_closedocaccmnitActionPerformed
    
    private void paidupsummmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidupsummmnitActionPerformed
        com.afrisoftech.reports.DocPaidupSummPdf comp = new com.afrisoftech.reports.DocPaidupSummPdf();
        comp.DocPaidupSummPdf(connectDB);   // Add your handling code here:
    }//GEN-LAST:event_paidupsummmnitActionPerformed
    
    private void whtperdocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whtperdocmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB,true, this.WhtPerDoc, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_whtperdocmnitActionPerformed
    
    private void whtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whtmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Wht, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_whtmnitActionPerformed
    
    private void paymentsperdocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentsperdocmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB,true, this.PaymentsPerDoctor, connectDB);
        
        dates.setVisible(true);// Add your handling code here:
    }//GEN-LAST:event_paymentsperdocmnitActionPerformed
    
    private void doctorspaymentsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorspaymentsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DoctorsPayments, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_doctorspaymentsmnitActionPerformed
    
    private void detvouchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detvouchmnitActionPerformed
        com.afrisoftech.lib.HosDocVouchPanel dates = new com.afrisoftech.lib.HosDocVouchPanel(this,pConnDB,true, this.DoctorsVouchDet, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_detvouchmnitActionPerformed
    
    private void paymentVouchermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentVouchermnitActionPerformed
        com.afrisoftech.lib.HosDocVouchPanel dates = new com.afrisoftech.lib.HosDocVouchPanel(this,pConnDB,true, this.DoctorsVouch, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_paymentVouchermnitActionPerformed
    
    private void exceedlimitsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exceedlimitsmnitActionPerformed
        com.afrisoftech.reports.SchemesLimitPdf policy = new com.afrisoftech.reports.SchemesLimitPdf();
        policy.SchemesLimitPdf(connectDB);  // Add your handling code here:
    }//GEN-LAST:event_exceedlimitsmnitActionPerformed
    
    private void deductionsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deductionsmnitActionPerformed
        javax.swing.JInternalFrame prod = new DocDeductionsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_deductionsmnitActionPerformed
    
    private void dispperdebtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispperdebtmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.DispatchPerDebt, connectDB);
        
        dates.setVisible(true);// Add your handling code here:
    }//GEN-LAST:event_dispperdebtmnitActionPerformed
    
    private void dispperscmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispperscmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.DispatchPerScm, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_dispperscmnitActionPerformed
    
    private void displistmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displistmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DispatchListing, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_displistmnitActionPerformed
    
    private void dispatchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispatchmnitActionPerformed
        com.afrisoftech.lib.HosDispartchDatePanel dates = new com.afrisoftech.lib.HosDispartchDatePanel(this,pConnDB, true, this.Dispatch, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_dispatchmnitActionPerformed
    
    private void PerdebtormnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerdebtormnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.DebtStmtUnAppr, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_PerdebtormnitActionPerformed
    
    private void debtormnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtormnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.DebtStmtAppr, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_debtormnitActionPerformed
    
    private void SchememnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchememnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.AppInvSch,connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_SchememnitActionPerformed
    
    private void PerschememnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerschememnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.UnAppInvSch,connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_PerschememnitActionPerformed
    
    private void payerdetStmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payerdetStmtmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.DebtStmtDet, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_payerdetStmtmnitActionPerformed
    
    private void wardoccupancymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardoccupancymnitActionPerformed
        com.afrisoftech.reports.PatientBedOccupancyPdf policy = new com.afrisoftech.reports.PatientBedOccupancyPdf();
        policy.PatientBedOccupancyPdf(connectDB);   // Add your handling code here:
    }//GEN-LAST:event_wardoccupancymnitActionPerformed
    
    private void consultantspmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultantspmnitActionPerformed
        int rowsNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            // java.sql.ResultSet rset = stmt.executeQuery("select user,count(debit),sum(debit + credit) from ac_cash_book where account_no ='"+jComboBox2.getSelectedItem()+"' and description !='' and reconciled = false AND date BETWEEN '"+datePicker1.getDate().toString()+"' AND '"+datePicker2.getDate().toString()+"' group by account_name");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(user_name) from ac_shifts where  user_name ilike '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
            
            while (rset1.next()) {
                
                rowsNo = rset1.getInt(1);
                
            }
            if (rowsNo < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "There is no Shift running");
            } else {
                
                //   while (rset.next()){
                
                //if(this.getShiftStatus()){
                
                com.afrisoftech.accounting.ConsultantPymintfr prod = new com.afrisoftech.accounting.ConsultantPymintfr(connectDB,pConnDB);
                saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
                
                try {
                    prod.setSelected(true);
                } catch(java.beans.PropertyVetoException pvt){}
                
                //  com.afrisoftech.accounting.InpatientRecpIntfr comp = new com.afrisoftech.accounting.InpatientRecpIntfr(connectDB,pConnDB);
                //  saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                // com.afrisoftech.hospital.InpatientReceiptsIntfr comp = new com.afrisoftech.hospital.InpatientReceiptsIntfr(connectDB,pConnDB);
                // comp.getContentPane().add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            }
        }
        
        catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sqlex.getMessage());
            
        }
        
     /*   com.afrisoftech.accounting.ConsultantPymintfr prod = new com.afrisoftech.accounting.ConsultantPymintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
      */// Add your handling code here:
    }//GEN-LAST:event_consultantspmnitActionPerformed
    
    private void appdocinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appdocinvmnitActionPerformed
        com.afrisoftech.accounting.ApproveDocInvoicesIntfr prod = new com.afrisoftech.accounting.ApproveDocInvoicesIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_appdocinvmnitActionPerformed
    
    private void unallocpymmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unallocpymmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.UnAllocSum, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_unallocpymmnitActionPerformed
    
    private void debtallocsumnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtallocsumnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.DebtAllocSum, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_debtallocsumnitActionPerformed
    
    private void allocsummnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocsummnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.AllocSum, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_allocsummnitActionPerformed
    
    private void doctorsstatementmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsstatementmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB, true, this.DoctorsStmt, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_doctorsstatementmnitActionPerformed
    
    private void schemestaffmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemestaffmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.SchemeStaff, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_schemestaffmnitActionPerformed
    
    private void patientdiagmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientdiagmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.PatDiag, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_patientdiagmnitActionPerformed
    
    private void docsdirmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docsdirmnitActionPerformed
        
        invalidate();
        
        javax.swing.JFileChooser chooserDir = new javax.swing.JFileChooser(new java.io.File(System.getProperty("user.dir")));
        
        chooserDir.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        
        int returnVal = chooserDir.showOpenDialog(this);
        
        if(returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            
            System.out.println("You chose to open this file: " +
            
            chooserDir.getSelectedFile().getPath());
            
            // filePortrait = chooserPortrait.getSelectedFile();
            
            // this.jTextField1.setText(filePortrait.getNam);
            
            //  processBrRequisitionFile(filePortrait);
            
            appProp.setProperty("docsdir", chooserDir.getSelectedFile().getPath());
            
            System.setProperty("docsdir", chooserDir.getSelectedFile().getPath());
            
            //jPanel.validate();
            
            storePreferences();
            
        }
        
        
        // Add your handling code here:
    }//GEN-LAST:event_docsdirmnitActionPerformed
    
    private void chekinmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekinmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.PatTimeLog, connectDB);
        
        dates.setVisible(true);       // Add your handling code here:
    }//GEN-LAST:event_chekinmnitActionPerformed
    
    private void patlabresultsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patlabresultsmnitActionPerformed
        com.afrisoftech.lib.HosPatientDatePanel dates = new com.afrisoftech.lib.HosPatientDatePanel(this,pConnDB, true, this.PatLabResults, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_patlabresultsmnitActionPerformed
    
    private void laboratoryresultsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboratoryresultsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.LabResults, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_laboratoryresultsmnitActionPerformed
    
    private void supplierinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierinvmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.SupplierInvoices, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_supplierinvmnitActionPerformed
    
    private void labtestsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labtestsmnitActionPerformed
        javax.swing.JInternalFrame prod = new LabTestsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_labtestsmnitActionPerformed
    
    private void allocationrepmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocationrepmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this, pConnDB, true, this.AllocRep, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_allocationrepmnitActionPerformed
    
    private void miscsCreditorsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miscsCreditorsmnitActionPerformed
        
        com.afrisoftech.accounting.CreditMiscsIntfr prod = new com.afrisoftech.accounting.CreditMiscsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_miscsCreditorsmnitActionPerformed
    
    private void pharmperformmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmperformmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.PharmPerfom, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_pharmperformmnitActionPerformed
    
    private void timelogmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timelogmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.TimeLog, connectDB);
        
        dates.setVisible(true);       // Add your handling code here:
    }//GEN-LAST:event_timelogmnitActionPerformed
    
    private void submitQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitQueryActionPerformed
        
        if (barChart.isSelected()) {
            
            graphicalView.barChart = true;
            
            graphicalView.pieChart = false;
            
            graphicalView.xyChart = false;
            
        } else if (pieChart.isSelected()) {
            
            graphicalView.barChart = false;
            
            graphicalView.pieChart = true;
            
            graphicalView.xyChart = false;
            
        } else {
            
            graphicalView.barChart = false;
            
            graphicalView.pieChart = false;
            
            graphicalView.xyChart = true;
        }
        
        submitQueryString();
        
        isCustomQuery = true;
        
        graphViewDialog.dispose();        // Add your handling code here:
    }//GEN-LAST:event_submitQueryActionPerformed
    
    private void admissiomnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissiomnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.AdmissionSheet, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_admissiomnitActionPerformed
    
    private void serviceAccptslipmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceAccptslipmnitActionPerformed
        javax.swing.JInternalFrame prod = new ServiceAccSlipIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_serviceAccptslipmnitActionPerformed
    
    private void specimensmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specimensmnitActionPerformed
        com.afrisoftech.reports.LabSpecimenPdf policy = new com.afrisoftech.reports.LabSpecimenPdf();
        policy.LabSpecimenPdf(connectDB);
        // Add your handling code here:
    }//GEN-LAST:event_specimensmnitActionPerformed
    
    private void InPatInvCashmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InPatInvCashmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.FinalInPatInvCash, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_InPatInvCashmnitActionPerformed
    
    private void InPatsInvTotalmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InPatsInvTotalmnit1ActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.FinalInPatInvTotal, connectDB);
        
        dates.setVisible(true);// Add your handling code here:
    }//GEN-LAST:event_InPatsInvTotalmnit1ActionPerformed
    
    private void labresultsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labresultsmnitActionPerformed
        javax.swing.JInternalFrame prod = new LabParametersIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_labresultsmnitActionPerformed
    
    private void labspecimensmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labspecimensmnitActionPerformed
        javax.swing.JInternalFrame prod = new SpecimensIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_labspecimensmnitActionPerformed
    
    private void laboratorymnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboratorymnActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_laboratorymnActionPerformed
    
    private void labregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labregmnitActionPerformed
        javax.swing.JInternalFrame prod = new LabRegIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_labregmnitActionPerformed
    
    private void invammendmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invammendmnitActionPerformed
        javax.swing.JInternalFrame prod = new InvAmmendIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_invammendmnitActionPerformed
    
    private void partlyallocinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partlyallocinvmnitActionPerformed
        com.afrisoftech.accounting.PartlyAllocateIntfr prod = new com.afrisoftech.accounting.PartlyAllocateIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_partlyallocinvmnitActionPerformed
    
    private void expensesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expensesmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Expenses, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_expensesmnitActionPerformed
    
    private void interimnoticemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interimnoticemnitActionPerformed
        javax.swing.JInternalFrame prod = new IntFooterIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_interimnoticemnitActionPerformed
    
    private void cancelQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelQueryActionPerformed
        xaxisComboBox.setModel(null);       // Add your handling code here:
    }//GEN-LAST:event_cancelQueryActionPerformed
    
    private void closeDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDialogActionPerformed
        this.graphViewDialog.dispose();        // Add your handling code here:
    }//GEN-LAST:event_closeDialogActionPerformed
    
    private void xaxisComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xaxisComboBoxActionPerformed
        
        //        columnSelectorScrollPane.setViewportView(null);
        
        populateColumnSelectorTable();
        
        javax.swing.table.DefaultTableModel columnTableModel = (javax.swing.table.DefaultTableModel)columnSelectorTable.getModel();
        
        for (int k = 0; k < columnTableModel.getRowCount(); k++) {
            
            if (columnTableModel.getValueAt(k, 0) == null) {
                
                columnTableModel.removeRow(k);
                
            }
            
        }        // Add your handling code here:
    }//GEN-LAST:event_xaxisComboBoxActionPerformed
    
    private void patdocstmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patdocstmtmnitActionPerformed
        javax.swing.JInternalFrame prod = new PatientDocStmtntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_patdocstmtmnitActionPerformed
    
    private void doctstmtpaidinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctstmtpaidinvmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB, true, this.DocPaidInv, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_doctstmtpaidinvmnitActionPerformed
    
    private void oprevbyaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oprevbyaccmnitActionPerformed
        com.afrisoftech.lib.HosDepDatePanel dates = new com.afrisoftech.lib.HosDepDatePanel(this,pConnDB, true, this.OpRevByAcc, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_oprevbyaccmnitActionPerformed
    
    private void iprevbyaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iprevbyaccmnitActionPerformed
        com.afrisoftech.lib.HosDepDatePanel dates = new com.afrisoftech.lib.HosDepDatePanel(this,pConnDB, true, this.IpRevByAcc, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_iprevbyaccmnitActionPerformed
    
    private void patstmtsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patstmtsmnitActionPerformed
        javax.swing.JInternalFrame prod = new PatientStmtntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_patstmtsmnitActionPerformed
    
    private void iprevrptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iprevrptmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.IpRev, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_iprevrptmnitActionPerformed
    
    private void oprevrptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oprevrptmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.OpRev, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_oprevrptmnitActionPerformed
    
    private void financeopermnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeopermnActionPerformed
        
        // Add your handling code here:
    }//GEN-LAST:event_financeopermnActionPerformed
    
    private void nhifinvoicemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhifinvoicemnitActionPerformed
        com.afrisoftech.lib.HosInPatDatePanel dates = new com.afrisoftech.lib.HosInPatDatePanel(this,pConnDB, true, this.NhifInv, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_nhifinvoicemnitActionPerformed
    
    private void mortdischmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mortdischmnitActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_mortdischmnitActionPerformed
    
    private void paymentspercreditormnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentspercreditormnitActionPerformed
        com.afrisoftech.lib.HosCreditorsDatePanel dates = new com.afrisoftech.lib.HosCreditorsDatePanel(this,pConnDB, true, this.PaymtsPerCreditors, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_paymentspercreditormnitActionPerformed
    
    private void invpercrdmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invpercrdmnitActionPerformed
        com.afrisoftech.lib.HosCreditorsDatePanel dates = new com.afrisoftech.lib.HosCreditorsDatePanel(this,pConnDB, true, this.InvPerCreditors, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_invpercrdmnitActionPerformed
    
    private void receiptperpayermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptperpayermnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.PayerRct, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_receiptperpayermnitActionPerformed
    
    private void pativoicesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pativoicesmnitActionPerformed
        com.afrisoftech.lib.HosPatientInvDatePanel dates = new com.afrisoftech.lib.HosPatientInvDatePanel(this,pConnDB, true, this.InvByInv, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_pativoicesmnitActionPerformed
    
    private void totalinpatrecmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalinpatrecmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.TotalInpatRecp, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_totalinpatrecmnitActionPerformed
    
    private void CashsalesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashsalesmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.CashSaleRep, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_CashsalesmnitActionPerformed
    
    private void revrepmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revrepmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.RevRep, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_revrepmnitActionPerformed
    
    private void patientaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientaccmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.PatBal, connectDB);
        
        dates.setVisible(true);
        
        // Add your handling code here:
    }//GEN-LAST:event_patientaccmnitActionPerformed
    
    private void totalschemeinvlistmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalschemeinvlistmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.TotalSchemeInv, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_totalschemeinvlistmnitActionPerformed
    
    private void debreceiptsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debreceiptsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.DebtorsRct, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_debreceiptsmnitActionPerformed
    
    private void finalisedinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalisedinvmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.FinInv, connectDB);
        
        dates.setVisible(true);// Add your handling code here:
    }//GEN-LAST:event_finalisedinvmnitActionPerformed
    
    private void inpatcashinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpatcashinvmnitActionPerformed
        javax.swing.JInternalFrame prod = new FinalisingInpatientBillIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_inpatcashinvmnitActionPerformed
    
    private void miscdebtorsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miscdebtorsmnitActionPerformed
        com.afrisoftech.accounting.DebtMiscsIntfr prod = new com.afrisoftech.accounting.DebtMiscsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_miscdebtorsmnitActionPerformed
    
    private void unfinalisedinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unfinalisedinvmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.UnFinInv, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_unfinalisedinvmnitActionPerformed
    
    private void SalesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this,true, this.PharmSales, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_SalesmnitActionPerformed
    
    private void finalinpatinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalinpatinvmnitActionPerformed
        com.afrisoftech.lib.HosInPatInvPanel dates = new com.afrisoftech.lib.HosInPatInvPanel(this,true, this.FinalInPatInv, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_finalinpatinvmnitActionPerformed
    
    private void pettycashVouchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettycashVouchmnitActionPerformed
        com.afrisoftech.lib.HosPetCashVouchPanel dates = new com.afrisoftech.lib.HosPetCashVouchPanel(this,pConnDB,true, this.PettyVouch, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_pettycashVouchmnitActionPerformed
    
    private void otherVouchermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherVouchermnitActionPerformed
        com.afrisoftech.lib.HosCreditorsVouchPanel dates = new com.afrisoftech.lib.HosCreditorsVouchPanel(this,pConnDB,true, this.OtherVouch, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_otherVouchermnitActionPerformed
    
    private void CrdVouchermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrdVouchermnitActionPerformed
        com.afrisoftech.lib.HosCreditorsVouchPanel dates = new com.afrisoftech.lib.HosCreditorsVouchPanel(this,pConnDB,true, this.Vouch, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_CrdVouchermnitActionPerformed
    
    private void docVouchermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docVouchermnitActionPerformed
        com.afrisoftech.lib.HosCreditorsVouchPanel dates = new com.afrisoftech.lib.HosCreditorsVouchPanel(this,pConnDB,true, this.DocVouch, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_docVouchermnitActionPerformed
    
    private void approveinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveinvmnitActionPerformed
        com.afrisoftech.accounting.ApproveInvoicesIntfr prod = new com.afrisoftech.accounting.ApproveInvoicesIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_approveinvmnitActionPerformed
    
    private void payerageingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payerageingmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB,true, this.AgeingByPayer, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_payerageingmnitActionPerformed
    
    private void nhifcreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhifcreditsActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.NhifCredits, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_nhifcreditsActionPerformed
    
    private void invbyinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invbyinvmnitActionPerformed
        com.afrisoftech.lib.HosInvPanel dates = new com.afrisoftech.lib.HosInvPanel(this, true, this.InvByInv, connectDB);
        
        dates.setVisible(true);// Add your handling code here:
    }//GEN-LAST:event_invbyinvmnitActionPerformed
    
    private void doctorsstmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsstmtmnitActionPerformed
        com.afrisoftech.lib.HosDoctorsPanel dates = new com.afrisoftech.lib.HosDoctorsPanel(this,pConnDB, true, this.DocStmt, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_doctorsstmtmnitActionPerformed
    
    private void crdtstmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crdtstmtmnitActionPerformed
        com.afrisoftech.lib.HosCreditorsDatePanel dates = new com.afrisoftech.lib.HosCreditorsDatePanel(this,pConnDB, true, this.CredtStmt, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_crdtstmtmnitActionPerformed
    
    private void detailedstmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailedstmtmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.DetStmt, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_detailedstmtmnitActionPerformed
    
    private void ordersmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.InPatAttSheet, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_ordersmnitActionPerformed
    
    private void dischargesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargesmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DischSheet, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_dischargesmnitActionPerformed
    
    private void attsheetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attsheetmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.AttSheet, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_attsheetmnitActionPerformed
    
    private void departmentmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentmnitActionPerformed
        javax.swing.JInternalFrame prod = new GeneralViewIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_departmentmnitActionPerformed
    
    private void headermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headermnitActionPerformed
        javax.swing.JInternalFrame prod = new HeaderIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_headermnitActionPerformed
    
    private void debtorsStmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtorsStmtmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.DebtorsStmt, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_debtorsStmtmnitActionPerformed
    
    private void submStmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submStmtmnitActionPerformed
        com.afrisoftech.lib.HosDebtorDatePanel dates = new com.afrisoftech.lib.HosDebtorDatePanel(this,pConnDB, true, this.SubmStmt, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_submStmtmnitActionPerformed
    
    private void surgicaladjmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surgicaladjmnitActionPerformed
        javax.swing.JInternalFrame prod = new SurgicalItemsRetunsIntfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_surgicaladjmnitActionPerformed
    
    private void LumpotherprmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LumpotherprmnitActionPerformed
        
        
        int rowsNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            // java.sql.ResultSet rset = stmt.executeQuery("select user,count(debit),sum(debit + credit) from ac_cash_book where account_no ='"+jComboBox2.getSelectedItem()+"' and description !='' and reconciled = false AND date BETWEEN '"+datePicker1.getDate().toString()+"' AND '"+datePicker2.getDate().toString()+"' group by account_name");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(user_name) from ac_shifts where  user_name ilike '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
            
            while (rset1.next()) {
                
                rowsNo = rset1.getInt(1);
                
            }
            if (rowsNo < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "There is no Shift running");
            } else {
                
                //   while (rset.next()){
                
                //if(this.getShiftStatus()){
                
                javax.swing.JInternalFrame prod = new LumpSumOtherPymintfr(connectDB,pConnDB);
                saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
                
                try {
                    prod.setSelected(true);
                } catch(java.beans.PropertyVetoException pvt){}
                
                //  com.afrisoftech.accounting.InpatientRecpIntfr comp = new com.afrisoftech.accounting.InpatientRecpIntfr(connectDB,pConnDB);
                //  saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                // com.afrisoftech.hospital.InpatientReceiptsIntfr comp = new com.afrisoftech.hospital.InpatientReceiptsIntfr(connectDB,pConnDB);
                // comp.getContentPane().add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            }
        }
        
        catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sqlex.getMessage());
            
        }
       /* javax.swing.JInternalFrame prod = new LumpSumOtherPymintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        */// Add your handling code here:
    }//GEN-LAST:event_LumpotherprmnitActionPerformed
    
    private void directcashsalesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directcashsalesmnitActionPerformed
        // if(this.getShiftStatus()){
        com.afrisoftech.accounting.PaymodeAdjIntfr comp = new com.afrisoftech.accounting.PaymodeAdjIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // }else{
        //        javax.swing.JOptionPane.showMessageDialog(this,"Access Denied! Refer this matter to system administrator");
        //    }
        
        //        threadSales = true;
        
        //     java.lang.Thread threadSalesOpen = new java.lang.Thread(this, "Sales Open");
        
        ///  threadSalesOpen.start();
        // Add your handling code here:
    }//GEN-LAST:event_directcashsalesmnitActionPerformed
    
    private void distinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distinvmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.InvPerSchm, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_distinvmnitActionPerformed
    
    private void suspschememnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspschememnitActionPerformed
        CloseSuspSchemeIntfr comp = new CloseSuspSchemeIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_suspschememnitActionPerformed
    
    private void nhifcreditsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhifcreditsmnitActionPerformed
        NhifDebtsIntfr comp = new NhifDebtsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}// Add your handling code here:
    }//GEN-LAST:event_nhifcreditsmnitActionPerformed
    
    private void doctorledgermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorledgermnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, DoctorsLedger, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_doctorledgermnitActionPerformed
    
    private void intinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intinvmnitActionPerformed
        com.afrisoftech.lib.HosOutPatientDatePanel dates = new com.afrisoftech.lib.HosOutPatientDatePanel(this,pConnDB, true, OutPatientBill, connectDB);
        
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_intinvmnitActionPerformed
    
    private void surgicalitemmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surgicalitemmnitActionPerformed
        SurgicalItemsIntfr comp = new SurgicalItemsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_surgicalitemmnitActionPerformed
    
    private void changeBackgoundImagemnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBackgoundImagemnit1ActionPerformed
        
        invalidate();
        
        javax.swing.JFileChooser chooserImages = new javax.swing.JFileChooser(new java.io.File(System.getProperty("user.dir")));
        
        com.afrisoftech.lib.ExampleFileFilter filter = new com.afrisoftech.lib.ExampleFileFilter();
        
        filter.addExtension("jpg");
        
        filter.addExtension("gif");
        
        filter.addExtension("png");
        
        filter.setDescription("Image Files");
        
        chooserImages.setFileFilter(filter);
        
        int returnVal = chooserImages.showOpenDialog(this);
        
        if(returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            
            System.out.println("You chose to open this file: " +
            
            chooserImages.getSelectedFile().getPath());
            
            // filePortrait = chooserPortrait.getSelectedFile();
            
            // this.jTextField1.setText(filePortrait.getNam);
            
            //  processBrRequisitionFile(filePortrait);
            
            appProp.setProperty("backgrdimg", chooserImages.getSelectedFile().getPath());
            
            desktopPaneIcon = new javax.swing.ImageIcon(chooserImages.getSelectedFile().getPath());
            
            //jPanel.validate();
            
            this.desktopPane.updateUI();
            
            // this.desktopPane4.updateUI();
            
            // this.desktopPanePayroll.updateUI();
            
            // this.desktopPaneStock.updateUI();
            
            //this.mainPanel.updateUI();
            
            this.updateNewComponentsUI();
            
            //updateUI();
            
            validate();
        }
        
        repaint();
        // Add your handling code here:
    }//GEN-LAST:event_changeBackgoundImagemnit1ActionPerformed
    
    private void inReceiptsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inReceiptsmnitActionPerformed
        int rowsNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            // java.sql.ResultSet rset = stmt.executeQuery("select user,count(debit),sum(debit + credit) from ac_cash_book where account_no ='"+jComboBox2.getSelectedItem()+"' and description !='' and reconciled = false AND date BETWEEN '"+datePicker1.getDate().toString()+"' AND '"+datePicker2.getDate().toString()+"' group by account_name");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(user_name) from ac_shifts where  user_name ilike '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
            
            while (rset1.next()) {
                
                rowsNo = rset1.getInt(1);
                
            }
            if (rowsNo < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "There is no Shift running");
            } else {
                
                com.afrisoftech.accounting.InpatientRecpIntfr comp = new com.afrisoftech.accounting.InpatientRecpIntfr(connectDB,pConnDB);
                saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                try {
                    comp.setSelected(true);
                } catch(java.beans.PropertyVetoException pvt){}
                
            }
        }
        
        catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sqlex.getMessage());
            
        }    // com.afrisoftech.accounting.OtherRecptintfr comp = new com.afrisoftech.accounting.OtherRecptintfr(connectDB,pConnDB);
        
    /*    if(this.getShiftStatus()){
            InpatientReceiptsIntfr comp = new InpatientReceiptsIntfr(connectDB,pConnDB);
            saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            try {
                comp.setSelected(true);
            } catch(java.beans.PropertyVetoException pvt){}
        }else{
            javax.swing.JOptionPane.showInputDialog(this,"Access Denied ! Consult System Administrator.");
        }
     */
        // Add your handling code here:
    }//GEN-LAST:event_inReceiptsmnitActionPerformed
    
    private void suspschemepovmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspschemepovmnitActionPerformed
        CloseSuspProvIntfr comp = new CloseSuspProvIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_suspschemepovmnitActionPerformed
    
    private void nhifrebatesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhifrebatesmnitActionPerformed
        NhifRebeatIntfr comp = new NhifRebeatIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_nhifrebatesmnitActionPerformed
    
    private void SchemeAllocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemeAllocmnitActionPerformed
        com.afrisoftech.accounting.AllocateInvoicesIntfr comp = new com.afrisoftech.accounting.AllocateInvoicesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_SchemeAllocmnitActionPerformed
    
    private void TheatreChargesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheatreChargesmnitActionPerformed
        TheatreFixedRatesIntfr comp = new TheatreFixedRatesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_TheatreChargesmnitActionPerformed
    
    private void xraymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xraymnitActionPerformed
        XrayProceduresIntfr comp = new XrayProceduresIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_xraymnitActionPerformed
    
    private void transperaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transperaccmnitActionPerformed
        com.afrisoftech.lib.AccountHosDatePanel dates = new com.afrisoftech.lib.AccountHosDatePanel(this,pConnDB, true, TransPerAcc, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_transperaccmnitActionPerformed
    
    private void billadjustmentmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billadjustmentmnitActionPerformed
        BillingAdjGenIntfr comp = new BillingAdjGenIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}            // Add your handling code here:
    }//GEN-LAST:event_billadjustmentmnitActionPerformed
    
    private void invpersuppliermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invpersuppliermnitActionPerformed
        com.afrisoftech.lib.HosCreditorsDatePanel dates = new com.afrisoftech.lib.HosCreditorsDatePanel(this,pConnDB, true, GRT, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_invpersuppliermnitActionPerformed
    
    private void mtmediaBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtmediaBttn1ActionPerformed
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        
        
        try {
            
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                
                rt.exec("kspread");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            else  {
                
                rt.exec("excel");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
                
            }
            
            
            
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
            
        }        // Add your handling code here:
    }//GEN-LAST:event_mtmediaBttn1ActionPerformed
    
    private void suspendShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspendShiftActionPerformed
        
        suspendmnitActionPerformed(evt);
        // Add your handling code here:
    }//GEN-LAST:event_suspendShiftActionPerformed
    
    private void closeShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeShiftActionPerformed
        
        closeshiftmnitActionPerformed(evt);
        // Add your handling code here:
    }//GEN-LAST:event_closeShiftActionPerformed
    
    private void openShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openShiftActionPerformed
/*
        threadSales = true;
 
        java.lang.Thread threadSalesOpen = new java.lang.Thread(this, "Sales Open");
 
        threadSalesOpen.start();
 
 */ // Add your handling code here:
    }//GEN-LAST:event_openShiftActionPerformed
    
    private void compactDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compactDBActionPerformed
        
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
    }//GEN-LAST:event_compactDBActionPerformed
    
    private void optimizeDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optimizeDBActionPerformed
        
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
    }//GEN-LAST:event_optimizeDBActionPerformed
    
    private void backupDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupDBActionPerformed
        
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
    }//GEN-LAST:event_backupDBActionPerformed
    
    private void reportsToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsToolBarActionPerformed
 /*
        jTabbedPane1.setSelectedComponent(reportsSplitPane);
  
        this.invalidate();
  
        setJMenuBar(payrollMenuBar);
  
        this.validate();
  
        // Add your handling code here:*/
    }//GEN-LAST:event_reportsToolBarActionPerformed
    
    private void payrollToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollToolBarActionPerformed
 /*
        jTabbedPane1.setSelectedComponent(payrollSplitPane);
  
        this.invalidate();
  
        setJMenuBar(payrollMenuBar);
  
        this.validate();
  
  */// Add your handling code here:
    }//GEN-LAST:event_payrollToolBarActionPerformed
    
    private void pharmacyToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyToolBarActionPerformed
/*
        jTabbedPane1.setSelectedComponent(pharmacySplitPane);
 
        this.invalidate();
 
        setJMenuBar(inventoryMenuBar);
 
        this.validate();
 
 
 */   // Add your handling code here:
    }//GEN-LAST:event_pharmacyToolBarActionPerformed
    
    private void operationsToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationsToolBarActionPerformed
/*
        jTabbedPane1.setSelectedComponent(mainSplitPane);
 
        this.invalidate();
 
        setJMenuBar(jMenuBar1);
 
        this.validate();
 
 */    // Add your handling code here:
    }//GEN-LAST:event_operationsToolBarActionPerformed
    
    private void mainSplitPaneComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mainSplitPaneComponentShown
        
        this.setTitle(getCompanyName());
        
        this.invalidate();
        
        setJMenuBar(jMenuBar1);
        
        this.validate();
        
        
        // Add your handling code here:
    }//GEN-LAST:event_mainSplitPaneComponentShown
    
    private void docnotesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docnotesmnitActionPerformed
        DoctorsScreenIntfr comp = new DoctorsScreenIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_docnotesmnitActionPerformed
    
    private void patientdiagnosismnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientdiagnosismnitActionPerformed
        PatientDiagIntfr comp = new PatientDiagIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_patientdiagnosismnitActionPerformed
    
    private void schemesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemesmnitActionPerformed
        
        com.afrisoftech.reports.SchemesPdf policy = new com.afrisoftech.reports.SchemesPdf();
        policy.SchemesPdf(connectDB);     // Add your handling code here:
    }//GEN-LAST:event_schemesmnitActionPerformed
    
    private void revenuemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenuemnitActionPerformed
        
        com.afrisoftech.reports.RevenuesPdf policy = new com.afrisoftech.reports.RevenuesPdf();
        policy.RevenuesPdf(connectDB);
        // Add your handling code here:
    }//GEN-LAST:event_revenuemnitActionPerformed
    
    private void pettycashreqmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettycashreqmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.RaisePetyCash, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_pettycashreqmnitActionPerformed
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        int exitOption = javax.swing.JOptionPane.showConfirmDialog(this, "Do you really want to exit application?", "Caution before closing application!", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (exitOption == javax.swing.JOptionPane.YES_OPTION) {
            
            this.storePreferences();
            
            System.exit(0);
            
        } else {}        // Add your handling code here:
    }//GEN-LAST:event_formWindowClosing
    
    private void receiptPrefsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptPrefsmnitActionPerformed
        com.afrisoftech.accounting.ReceiptPrefsIntfr comp = new com.afrisoftech.accounting.ReceiptPrefsIntfr(connectDB,pConnDB, appProp);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_receiptPrefsmnitActionPerformed
    
    private void pettycashpmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettycashpmtmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.PetyCash, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_pettycashpmtmnitActionPerformed
    
    private void yearlyrotinemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyrotinemnitActionPerformed
        com.afrisoftech.accounting.CloseYearClass closeYear = new com.afrisoftech.accounting.CloseYearClass(connectDB,pConnDB);
        closeYear.CloseYearClass();
        
        //  Closingintfr comp = new Closingintfr(connectDB,pConnDB);
        //   saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        //   try {
        //       comp.setSelected(true);
        //   } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_yearlyrotinemnitActionPerformed
    
    private void patperdeptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patperdeptmnitActionPerformed
        com.afrisoftech.lib.HosDepDatePanel dates = new com.afrisoftech.lib.HosDepDatePanel(this,pConnDB, true, this.PatPerDept, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_patperdeptmnitActionPerformed
    
    private void DtlTrialBalancemnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DtlTrialBalancemnit1ActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DetailedTrialbalance, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_DtlTrialBalancemnit1ActionPerformed
    
    private void assetmgtmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetmgtmnit1ActionPerformed
/*
        this.jTabbedPane1.setSelectedComponent(mainSplitPane);
 
        this.invalidate();
 
        setJMenuBar(jMenuBar1);
 
        this.validate();
 
 */   // Add your handling code here:
    }//GEN-LAST:event_assetmgtmnit1ActionPerformed
    
    private void docsmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docsmnit1ActionPerformed
 /*
        this.jTabbedPane1.setSelectedComponent(reportsSplitPane);
  
        this.invalidate();
  
        this.setJMenuBar(reportsMenuBar);
  
        this.validate();
  
  */   //        this.jTabbedPane1.setSelectedComponent(helpSplitPane);
        // Add your handling code here:
    }//GEN-LAST:event_docsmnit1ActionPerformed
    
    private void reportsmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsmnit1ActionPerformed
 /*
        this.jTabbedPane1.setSelectedComponent(reportsSplitPane);
  
        this.invalidate();
  
        this.setJMenuBar(reportsMenuBar);
  
        this.validate();
  
  */ // Add your handling code here:
    }//GEN-LAST:event_reportsmnit1ActionPerformed
    
    private void fahrmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrmnit1ActionPerformed
        
        if (allowed2Access()){
            
            javax.swing.JScrollPane payrollTaskScrollPane = new javax.swing.JScrollPane();
            
            payrollTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
                public void componentShown(java.awt.event.ComponentEvent evt) {
                    payrollTaskPaneComponentShown(evt);
                }
            });
            
            payrollTaskScrollPane.setViewportView(payrollTaskPane);
            
            
            jOutLookBar.addTab("HR & Payroll",payrollTaskScrollPane);
            //        jOutLookBar.addTab("Maintenance & Utilities", new javax.swing.JButton());
            
            
            javax.swing.JScrollPane reportTaskScrollPane = new javax.swing.JScrollPane();
            
            reportTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
                public void componentShown(java.awt.event.ComponentEvent evt) {
                    reportTaskPaneComponentShown(evt);
                }
            });
            
            reportTaskScrollPane.setViewportView(reportTaskPane);
            
            jOutLookBar.addTab("Reports & Utilities", reportTaskScrollPane);
            
            
            
            
        }
        /*
        this.jTabbedPane1.setSelectedComponent(payrollSplitPane);
         
        this.invalidate();
         
        this.setJMenuBar(payrollMenuBar);
         
        this.validate();
         
         */ // Add your handling code here:
    }//GEN-LAST:event_fahrmnit1ActionPerformed
    
    private void accountsmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsmnit1ActionPerformed
/*
        this.jTabbedPane1.setSelectedComponent(mainSplitPane);
 
        this.invalidate();
 
        setJMenuBar(jMenuBar1);
 
        this.validate();
 
 */   // Add your handling code here:
    }//GEN-LAST:event_accountsmnit1ActionPerformed
    
    private void BedchargesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedchargesmnitActionPerformed
        BedsChargesintfr comp = new BedsChargesintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_BedchargesmnitActionPerformed
    
    private void DepreciationratesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepreciationratesmnitActionPerformed
        com.afrisoftech.accounting.Depreciationintfr comp = new com.afrisoftech.accounting.Depreciationintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_DepreciationratesmnitActionPerformed
    
    private void deptincexpmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptincexpmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DeptIncExp, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_deptincexpmnitActionPerformed
    
    private void accrualsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accrualsmnitActionPerformed
        AccrualsIntfr comp = new AccrualsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_accrualsmnitActionPerformed
    
    private void ReceiptsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptsmnitActionPerformed
        int rowsNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            // java.sql.ResultSet rset = stmt.executeQuery("select user,count(debit),sum(debit + credit) from ac_cash_book where account_no ='"+jComboBox2.getSelectedItem()+"' and description !='' and reconciled = false AND date BETWEEN '"+datePicker1.getDate().toString()+"' AND '"+datePicker2.getDate().toString()+"' group by account_name");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(user_name) from ac_shifts where  user_name ilike '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
            
            while (rset1.next()) {
                
                rowsNo = rset1.getInt(1);
                
            }
            if (rowsNo < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "There is no Shift running");
            } else {
                
                //   while (rset.next()){
                
                //if(this.getShiftStatus()){
                DebtorsRecptIntfr comp = new DebtorsRecptIntfr(connectDB,pConnDB);
                saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                try {
                    comp.setSelected(true);
                } catch(java.beans.PropertyVetoException pvt){}
                //}else{
                //  javax.swing.JOptionPane.showMessageDialog(this,"Access Denied! Refer this matter to system administrator");
            }
        }
        
        catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sqlex.getMessage());
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_ReceiptsmnitActionPerformed
    
    private void pharmacymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacymnitActionPerformed
        com.afrisoftech.reports.PharmacySalesPdf policy = new com.afrisoftech.reports.PharmacySalesPdf();
        policy.PharmacySalesPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_pharmacymnitActionPerformed
    
    private void DirectinfomnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectinfomnitActionPerformed
        SchemeInvocingIntfr comp = new SchemeInvocingIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_DirectinfomnitActionPerformed
    
    private void storesrevmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storesrevmnitActionPerformed
        com.afrisoftech.lib.HosDepDatePanel dates = new com.afrisoftech.lib.HosDepDatePanel(this,pConnDB, true, this.StoresRev, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_storesrevmnitActionPerformed
    
    private void patbedoccupancymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patbedoccupancymnitActionPerformed
        com.afrisoftech.reports.WardOccupancyPdf policy = new com.afrisoftech.reports.WardOccupancyPdf();
        policy.WardOccupancyPdf(connectDB);   // Add your handling code here:
    }//GEN-LAST:event_patbedoccupancymnitActionPerformed
    
    private void bedoccupancymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedoccupancymnitActionPerformed
        com.afrisoftech.reports.BedOccupancyPdf policy = new com.afrisoftech.reports.BedOccupancyPdf();
        policy.BedOccupancyPdf(connectDB);  // Add your handling code here:
    }//GEN-LAST:event_bedoccupancymnitActionPerformed
    
    private void suppliersmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersmnitActionPerformed
        com.afrisoftech.lib.HosInPatientDatePanel dates = new com.afrisoftech.lib.HosInPatientDatePanel(this,pConnDB, true, this.InpatDiag, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_suppliersmnitActionPerformed
    
    private void generalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalmnitActionPerformed
        GeneralBillingIntfr comp = new GeneralBillingIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_generalmnitActionPerformed
    
    private void chartaccountsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartaccountsmnitActionPerformed
        com.afrisoftech.reports.AllAccountsPdf policy = new com.afrisoftech.reports.AllAccountsPdf();
        policy.AllAccountsPdf(connectDB);         // Add your handling code here:
    }//GEN-LAST:event_chartaccountsmnitActionPerformed
    
    private void outstandingordersmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outstandingordersmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DrugsPrbd, connectDB);
        
        dates.setVisible(true);       // Add your handling code here:
    }//GEN-LAST:event_outstandingordersmnitActionPerformed
    
    private void quotationmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quotationmnitActionPerformed
        com.afrisoftech.reports.WardsPdf policy = new com.afrisoftech.reports.WardsPdf();
        policy.WardsPdf(connectDB);  // Add your handling code here:
    }//GEN-LAST:event_quotationmnitActionPerformed
    
    private void allreceiptsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allreceiptsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.TotalReceipts, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_allreceiptsmnitActionPerformed
    
    private void compdebtorsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compdebtorsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Debtors, connectDB);
        
        dates.setVisible(true);          // Add your handling code here:
    }//GEN-LAST:event_compdebtorsmnitActionPerformed
    
    private void receiptscopymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptscopymnitActionPerformed
        com.afrisoftech.lib.HosReceiptsDatePanel dates = new com.afrisoftech.lib.HosReceiptsDatePanel(this,pConnDB, true, this.ReceiptsCopy, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_receiptscopymnitActionPerformed
    
    private void doctorslistmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorslistmnitActionPerformed
        com.afrisoftech.reports.DoctorsListPdf comp = new com.afrisoftech.reports.DoctorsListPdf();
        comp.DoctorsListPdf(connectDB);        // Add your handling code here:
    }//GEN-LAST:event_doctorslistmnitActionPerformed
    
    private void stockjournalsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockjournalsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Bookings, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_stockjournalsmnitActionPerformed
    
    private void bookingschmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingschmnitActionPerformed
        TheatreBookingIntfr comp = new TheatreBookingIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){} // Add your handling code here:
    }//GEN-LAST:event_bookingschmnitActionPerformed
    
    private void PaymentsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Payments, connectDB);
        
        dates.setVisible(true); // Add your handling code here:
    }//GEN-LAST:event_PaymentsmnitActionPerformed
    
    private void statementofaccmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statementofaccmnitActionPerformed
        com.afrisoftech.lib.HosScemesDatePanel dates = new com.afrisoftech.lib.HosScemesDatePanel(this,pConnDB, true, this.AccntStatement, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_statementofaccmnitActionPerformed
    
    private void shiftrepmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftrepmnitActionPerformed
        com.afrisoftech.lib.HosShiftDatePanel dates = new com.afrisoftech.lib.HosShiftDatePanel(this,pConnDB, true, this.ShiftNo, connectDB);
        
        dates.setVisible(true);       // Add your handling code here:
    }//GEN-LAST:event_shiftrepmnitActionPerformed
    
    private void exitmnITbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitmnITbActionPerformed
        
        int exitOption = javax.swing.JOptionPane.showConfirmDialog(this, "Do you really want to exit application?", "Caution before closing application!", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (exitOption == javax.swing.JOptionPane.YES_OPTION) {
            
            this.storePreferences();
            
            System.exit(0);
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_exitmnITbActionPerformed
    
    private void invoicemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicemnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.FinalInv, connectDB);
        
        dates.setVisible(true);     // Add your handling code here:
    }//GEN-LAST:event_invoicemnitActionPerformed
    
    private void schemeregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemeregmnitActionPerformed
        SchemesIntfr comp = new SchemesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
        
    }//GEN-LAST:event_schemeregmnitActionPerformed
    
    private void printvouchermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printvouchermnitActionPerformed
        com.afrisoftech.accounting.PettyCashRefundIntfr comp = new com.afrisoftech.accounting.PettyCashRefundIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_printvouchermnitActionPerformed
    
    private void pettycashpaymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pettycashpaymnitActionPerformed
        PettyCashPymIntfr comp = new PettyCashPymIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_pettycashpaymnitActionPerformed
    
    private void DepreciationmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepreciationmnitActionPerformed
        com.afrisoftech.accounting.DepreciationMethodsintfr comp = new com.afrisoftech.accounting.DepreciationMethodsintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_DepreciationmnitActionPerformed
    
    private void insurancemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insurancemnitActionPerformed
        AsseInsuranceIntfr comp = new AsseInsuranceIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_insurancemnitActionPerformed
    
    private void assetlocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetlocmnitActionPerformed
        AssetsLocIntfr comp = new AssetsLocIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_assetlocmnitActionPerformed
    
    private void asstregmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asstregmnitActionPerformed
        AssetsRegintfr comp = new AssetsRegintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_asstregmnitActionPerformed
    
    private void creditorsinvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditorsinvmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.CreditorsInv, connectDB);
        
        dates.setVisible(true);          // Add your handling code here:
    }//GEN-LAST:event_creditorsinvmnitActionPerformed
    
    private void BankingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankingmnitActionPerformed
        com.afrisoftech.accounting.Bankingintfr comp = new com.afrisoftech.accounting.Bankingintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){} // Add your handling code here:
    }//GEN-LAST:event_BankingmnitActionPerformed
    
    private void suspendmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspendmnitActionPerformed
        
        if (System.getProperty("billpmnt").equalsIgnoreCase("showing")) {
            
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR : Check to ensure that the CASH SALES form is not \n running before suspending your shift?");
            
        } else {
            int openShift = javax.swing.JOptionPane.showConfirmDialog(this, "Proceed to suspend shift?", "Suspending current shift ...", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
            
            if (openShift == javax.swing.JOptionPane.YES_OPTION) {
                
                try {
                    
                    System.out.println("Cashpoint to suspend is : "+System.getProperty("cashpoint"));
                    
                    System.out.println("User Name to suspend is : "+System.getProperty("currentuser"));
                    
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement("UPDATE ac_shifts SET status = 'Suspended' WHERE cash_point = '"+System.getProperty("cashpoint")+"' AND user_name = '"+System.getProperty("currentuser")+"' AND status = 'Running'");
                    
                    pstmt.executeUpdate();
                    
                } catch(java.sql.SQLException sqlExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                    
                    
                }
            }
            
        }// Add your handling code here:
    }//GEN-LAST:event_suspendmnitActionPerformed
    
    private void closeshiftmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeshiftmnitActionPerformed
        
        if (System.getProperty("billpmnt").equalsIgnoreCase("showing")) {
            
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR : Check to ensure that the CASH SALES form is not \n running before closing your shift?");
            
        } else {
            int openShift = javax.swing.JOptionPane.showConfirmDialog(this, "Proceed to close shift?", "Closing current shift ...", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
            
            if (openShift == javax.swing.JOptionPane.YES_OPTION) {
                
                try {
                    
                    System.out.println("Cashpoint to suspend is : "+System.getProperty("cashpoint"));
                    
                    System.out.println("User Name to suspend is : "+System.getProperty("currentuser"));
                    
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement("UPDATE ac_shifts SET status = 'Closed', end_date = timenow() WHERE cash_point = '"+System.getProperty("cashpoint")+"' AND user_name = '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
                    
                    pstmt.executeUpdate();
                    
                    javax.swing.JOptionPane.showMessageDialog(this, "Shift closed for user "+System.getProperty("currentuser")+" at cashpoint "+System.getProperty("cashpoint")+".");
                    
                } catch(java.sql.SQLException sqlExec) {
                    
                    javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                    
                    
                }
            } else {}
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_closeshiftmnitActionPerformed
    
    private void cashpointmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashpointmnitActionPerformed
        com.afrisoftech.accounting.CashPointsIntfr comp = new com.afrisoftech.accounting.CashPointsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_cashpointmnitActionPerformed
    
    private void refundsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundsmnitActionPerformed
        com.afrisoftech.accounting.RefundsIntfr comp = new com.afrisoftech.accounting.RefundsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_refundsmnitActionPerformed
    
    private void stockmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockmnit1ActionPerformed
/*
        jTabbedPane1.setSelectedComponent(pharmacySplitPane);
 
        this.invalidate();
 
        setJMenuBar(inventoryMenuBar);
 
        this.validate();
 */
        // Add your handling code here:
    }//GEN-LAST:event_stockmnit1ActionPerformed
    
    private void schememnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schememnitActionPerformed
        SchemeDebtsIntfr comp = new SchemeDebtsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_schememnitActionPerformed
    
    private void theatreprocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theatreprocmnitActionPerformed
        TheatreProceduresIntfr comp = new TheatreProceduresIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_theatreprocmnitActionPerformed
    
    private void labprocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labprocmnitActionPerformed
        LabProceduresIntfr comp = new LabProceduresIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_labprocmnitActionPerformed
    
    private void wardproceduresmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardproceduresmnitActionPerformed
        WardProceduresIntfr comp = new WardProceduresIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_wardproceduresmnitActionPerformed
    
    private void admissmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissmnitActionPerformed
        MortAdmmissnIntfr comp = new MortAdmmissnIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_admissmnitActionPerformed
    
    private void vitalsignmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalsignmnitActionPerformed
//        VitalSignRecIntfr comp = new VitalSignRecIntfr(connectDB,pConnDB);
//        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
//        try {
//            comp.setSelected(true);
//        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_vitalsignmnitActionPerformed
    
    private void cashBookmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashBookmnitActionPerformed
        
        com.afrisoftech.lib.HosCashbookDatePanel dates = new com.afrisoftech.lib.HosCashbookDatePanel(this,pConnDB, true, this.CashBookList, connectDB);
        
        dates.setVisible(true);
        // Add your handling code here:
    }//GEN-LAST:event_cashBookmnitActionPerformed
    
    private void patdischmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patdischmnitActionPerformed
        PatientDischargeIntfr comp = new PatientDischargeIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_patdischmnitActionPerformed
    
    private void bedbrekgsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedbrekgsmnitActionPerformed
        BedBreakagesIntfr comp = new BedBreakagesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_bedbrekgsmnitActionPerformed
    
    private void newbedmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbedmnitActionPerformed
        NewBedsIntfr comp = new NewBedsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_newbedmnitActionPerformed
    
    
    private void bedmangtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedmangtmnitActionPerformed
        BedManagementIntfr comp = new BedManagementIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_bedmangtmnitActionPerformed
    
    private void BedtrnsfrmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedtrnsfrmnitActionPerformed
        BedTobedTransIntfr comp = new BedTobedTransIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_BedtrnsfrmnitActionPerformed
    
    private void printreceiptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printreceiptmnitActionPerformed
        com.afrisoftech.lib.HosReceiptsPatDatePanel dates = new com.afrisoftech.lib.HosReceiptsPatDatePanel(this,pConnDB, true, this.ReceiptperPat, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_printreceiptmnitActionPerformed
    
    private void interiminvmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interiminvmnitActionPerformed
        com.afrisoftech.lib.HosInPatientDatePanel dates = new com.afrisoftech.lib.HosInPatientDatePanel(this,pConnDB, true, this.PatientBill, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_interiminvmnitActionPerformed
    
    private void detailedpatstmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailedpatstmtmnitActionPerformed
        com.afrisoftech.lib.HosPatientDatePanel dates = new com.afrisoftech.lib.HosPatientDatePanel(this,pConnDB, true, this.DetailedPatStmt, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_detailedpatstmtmnitActionPerformed
    
    private void patstmtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patstmtmnitActionPerformed
        com.afrisoftech.lib.HosPatientDatePanel dates = new com.afrisoftech.lib.HosPatientDatePanel(this,pConnDB, true, this.PatientStatement, connectDB);
        
        dates.setVisible(true);    // Add your handling code here:
    }//GEN-LAST:event_patstmtmnitActionPerformed
    
    private void dailyissiuesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyissiuesmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.PatList, connectDB);
        
        dates.setVisible(true);  // Add your handling code here:
    }//GEN-LAST:event_dailyissiuesmnitActionPerformed
    
    
    private void revperdepmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revperdepmnitActionPerformed
        com.afrisoftech.lib.HosDepDatePanel dates = new com.afrisoftech.lib.HosDepDatePanel(this,pConnDB, true, this.DepartmentRev, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_revperdepmnitActionPerformed
    
    private void dailyrevmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyrevmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.DailyRev, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_dailyrevmnitActionPerformed
    
    private void CreditorsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditorsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.Creditors, connectDB);
        
        dates.setVisible(true);
        //   CreditorsPdf comp = new CreditorsPdf();
        //  comp.CreditorsPdf(connectDB);
        
        // Add your handling code here:
    }//GEN-LAST:event_CreditorsmnitActionPerformed
    
    private void patreceiptsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patreceiptsmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.ReceiptsList, connectDB);
        
        dates.setVisible(true);       // Add your handling code here:
    }//GEN-LAST:event_patreceiptsmnitActionPerformed
    
    private void theatrediagmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theatrediagmnitActionPerformed
        TheatreDiagIntfr comp = new TheatreDiagIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_theatrediagmnitActionPerformed
    
    private void labtestsresultmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labtestsresultmnitActionPerformed
        LabResultsIntfr comp = new LabResultsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_labtestsresultmnitActionPerformed
    
    private void wardtfrmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardtfrmnitActionPerformed
        
        WardToWardTransferInfr comp = new WardToWardTransferInfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        
        // Add your handling code here:
    }//GEN-LAST:event_wardtfrmnitActionPerformed
    
    private void pnlmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnlmnitActionPerformed
        com.afrisoftech.lib.HosBsDatePanel dates = new com.afrisoftech.lib.HosBsDatePanel(this, true, this.ProfitLoss, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_pnlmnitActionPerformed
    
    private void trialbalancemnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trialbalancemnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.TrialBalance, connectDB);
        
        dates.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_trialbalancemnitActionPerformed
    
    private void acctdetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctdetmnitActionPerformed
        
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.GITransactions, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_acctdetmnitActionPerformed
    
    private void lbalancesheetmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbalancesheetmnitActionPerformed
        com.afrisoftech.lib.HosBsDatePanel dates = new com.afrisoftech.lib.HosBsDatePanel(this, true, this.BalanceSheet, connectDB);
        
        dates.setVisible(true);   // Add your handling code here:
    }//GEN-LAST:event_lbalancesheetmnitActionPerformed
    
    private void transactionslsmnitmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionslsmnitmnitActionPerformed
        com.afrisoftech.lib.HosDatePanel dates = new com.afrisoftech.lib.HosDatePanel(this, true, this.TransactionsList, connectDB);
        
        dates.setVisible(true);        // Add your handling code here:
    }//GEN-LAST:event_transactionslsmnitmnitActionPerformed
    
    private void patientmanagemnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientmanagemnActionPerformed
        
        
        // Add your handling code here:
    }//GEN-LAST:event_patientmanagemnActionPerformed
    
    private void receiptsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptsmnitActionPerformed
        int rowsNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            // java.sql.ResultSet rset = stmt.executeQuery("select user,count(debit),sum(debit + credit) from ac_cash_book where account_no ='"+jComboBox2.getSelectedItem()+"' and description !='' and reconciled = false AND date BETWEEN '"+datePicker1.getDate().toString()+"' AND '"+datePicker2.getDate().toString()+"' group by account_name");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(user_name) from ac_shifts where  user_name ilike '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
            
            while (rset1.next()) {
                
                rowsNo = rset1.getInt(1);
                
            }
        }catch (java.sql.SQLException sqE) {
            sqE.printStackTrace();
        }
        if (rowsNo ==0) {
            
            int openShift = javax.swing.JOptionPane.showConfirmDialog(this, "Opening new shift", "Starting a new shift ...", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
            
            if (openShift == javax.swing.JOptionPane.YES_OPTION) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                
                long dateNow = calendar.getTimeInMillis();
                
                java.sql.Date datenowSql1= new java.sql.Date(dateNow);
                
                System.out.println(datenowSql1.toString());
                
                java.sql.Timestamp datenowSql= new java.sql.Timestamp(dateNow);
                
                System.out.println(datenowSql.toString());
                
                String current_user;
                try {
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement("INSERT INTO ac_shifts values(?,?)");
                    pstmt.setString(1, System.getProperty("cashpoint"));
                    pstmt.setString(2,"Running");
                    pstmt.executeUpdate();
                }catch (java.sql.SQLException sqE) {
                    sqE.printStackTrace();
                }
                System.out.println("Opening shift");
                
                //  status = true;
                
                
                //     com.afrisoftech.accounting.BillPaymentsIntfr comp = new com.afrisoftech.accounting.BillPaymentsIntfr(connectDB,pConnDB);
                // saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                cashRunning = true;
                
                cashThread = new java.lang.Thread(this, "Cash");
                
                cashThread.start();
            }
        } else {
            
            //   while (rset.next()){
            
            //if(this.getShiftStatus()){
            // com.afrisoftech.accounting.BillPaymentsIntfr comp = new com.afrisoftech.accounting.BillPaymentsIntfr(connectDB,pConnDB);
            // saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            cashRunning = true;
            
            cashThread = new java.lang.Thread(this, "Cash");
            
            cashThread.start();
            
        }
        
        
        
        
        /*
        threadSales = true;
         
        java.lang.Thread threadSalesOpen = new java.lang.Thread(this, "Sales Open");
         
        threadSalesOpen.start();
         
         
        if (getShiftStatus()) {
         
            //        System.out.println(statusShift);
         
            com.afrisoftech.accounting.BillPaymentsIntfr comp = new  com.afrisoftech.accounting.BillPaymentsIntfr(connectDB,pConnDB);
         
            if (!(System.getProperty("billpmnt").equalsIgnoreCase("showing"))) {
                saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                try {
         
                    comp.setSelected(true);
         
                    this.billPaymentIntfr_isShowing = true;
         
                    try {
         
                        java.sql.PreparedStatement pstmt = connectDB.prepareStatement("UPDATE ac_shifts SET status = 'Running' WHERE cash_point = '"+System.getProperty("cashpoint")+"' AND user_name = '"+System.getProperty("currentuser")+"' AND status = 'Suspended'");
         
                        pstmt.executeUpdate();
         
                    } catch(java.sql.SQLException sqlExec) {
         
         
                        javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
         
                    }
         
                    System.setProperty("billpmnt", "showing");
         
                    System.out.println(System.getProperty("billpmnt"));
         
                } catch(java.beans.PropertyVetoException pvt){}
            }
        } else {
         
            javax.swing.JOptionPane.showMessageDialog(this, "Can't proceed without a valid shift instance", "Error Message", javax.swing.JOptionPane.WARNING_MESSAGE);
         
        }
         */
        // Add your handling code here:
    }//GEN-LAST:event_receiptsmnitActionPerformed
    
    private void admmssionntmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admmssionntmnitActionPerformed
//        AdmissionIntfr comp = new AdmissionIntfr(connectDB,pConnDB);
//        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
//        try {
//            comp.setSelected(true);
//            
//        } catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_admmssionntmnitActionPerformed
    
    private void patientdepositsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientdepositsmnitActionPerformed
        com.afrisoftech.accounting.TransactionTypeIntfr comp = new com.afrisoftech.accounting.TransactionTypeIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_patientdepositsmnitActionPerformed
    
    private void patientcollateralmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientcollateralmnitActionPerformed
        PatientCollateralIntfr comp = new PatientCollateralIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_patientcollateralmnitActionPerformed
    
    private void docnursmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docnursmnitActionPerformed
        
        StaffIntfr comp = new StaffIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_docnursmnitActionPerformed
    
    private void patientregstmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientregstmnitActionPerformed
        
        patientRunning = true;
        
        patientThread = new java.lang.Thread(this, "Patient");
        
        patientThread.start();
        
        
/*        PatientRegisterIntfr comp = new PatientRegisterIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
 */ // Add your handling code here:
    }//GEN-LAST:event_patientregstmnitActionPerformed
    
    private void creditcardsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditcardsmnitActionPerformed
        CreditCardIntfr comp = new CreditCardIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}      // Add your handling code here:
    }//GEN-LAST:event_creditcardsmnitActionPerformed
    
    private void OperatingparamertersmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperatingparamertersmnitActionPerformed
        FixedRatesIntfr comp = new FixedRatesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_OperatingparamertersmnitActionPerformed
    
    private void patcategmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patcategmnitActionPerformed
        PatientCategoriesIntfr comp = new PatientCategoriesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}        // Add your handling code here:
    }//GEN-LAST:event_patcategmnitActionPerformed
    
    private void bedsetupmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedsetupmnitActionPerformed
        BedSetupIntfr comp = new BedSetupIntfr(connectDB,pConnDB);
        
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_bedsetupmnitActionPerformed
    
    private void schemeallmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemeallmnitActionPerformed
        SchemeAlloteesIntfr comp = new  SchemeAlloteesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_schemeallmnitActionPerformed
    
    private void schemeprovmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemeprovmnitActionPerformed
        HCProviderIntfr comp = new HCProviderIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_schemeprovmnitActionPerformed
    
    
    private void banksmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banksmnitActionPerformed
        BankSetupIntfr comp = new BankSetupIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}  // Add your handling code here:
    }//GEN-LAST:event_banksmnitActionPerformed
    
    private void diseasesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseasesmnitActionPerformed
        DiseasesIntfr comp = new DiseasesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_diseasesmnitActionPerformed
    
    private void wardprocmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardprocmnitActionPerformed
        WardsSetupIntfr comp = new WardsSetupIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}      // Add your handling code here:
    }//GEN-LAST:event_wardprocmnitActionPerformed
    
    
    private void depatmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depatmnitActionPerformed
        DepartmentsIntfr comp = new DepartmentsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_depatmnitActionPerformed
    
    private void districtmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtmnitActionPerformed
        DistrictsIntfr comp = new DistrictsIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_districtmnitActionPerformed
    
    private void userprofmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userprofmnit1ActionPerformed
        UsersetupHospitalIntfr comp = new UsersetupHospitalIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}     // Add your handling code here:
    }//GEN-LAST:event_userprofmnit1ActionPerformed
    
    private void glaccountsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glaccountsmnitActionPerformed
        com.afrisoftech.accounting.ActivitiesIntfr comp = new com.afrisoftech.accounting.ActivitiesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}       // Add your handling code here:
    }//GEN-LAST:event_glaccountsmnitActionPerformed
    
    private void lgalstatussetupmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgalstatussetupmnitActionPerformed
        LegalStatusIntfr comp = new LegalStatusIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}   // Add your handling code here:
    }//GEN-LAST:event_lgalstatussetupmnitActionPerformed
    
    private void paymentmodesmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentmodesmnitActionPerformed
        com.afrisoftech.accounting.PaymentModesIntfr comp = new com.afrisoftech.accounting.PaymentModesIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
            
        } catch(java.beans.PropertyVetoException pvt){}    // Add your handling code here:
    }//GEN-LAST:event_paymentmodesmnitActionPerformed
    
    private void countrymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countrymnitActionPerformed
        NationalityIntfr comp = new NationalityIntfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}      // Add your handling code here:
    }//GEN-LAST:event_countrymnitActionPerformed
    
    private void hosptalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hosptalmnitActionPerformed
        int j = 0;
        try {
            java.sql.Statement stmt1 = connectDB.createStatement();
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(hospital_name) from pb_hospitalprofile");
            while (rset1.next()) {
                j = rset1.getInt(1);
            }
            if (j > 0){
                javax.swing.JInternalFrame dismth = new CompanyProfIntfr(connectDB,pConnDB);
                saccopn.add(dismth, javax.swing.JLayeredPane.DEFAULT_LAYER);
                try {
                    
                    dismth.setSelected(true);
                } catch(java.beans.PropertyVetoException pvt){}
                
            } else {
                
                
                
                int resOptt =  javax.swing.JOptionPane.showOptionDialog(this, "Do you want to open a new Company ?", "Set Company", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, new java.lang.String[]{"New Company", "Open Existing Company", "Cancel"}, "Open Existing Company");
                
                
                if (resOptt == javax.swing.JOptionPane.YES_OPTION) {
                    javax.swing.JInternalFrame dismth = new CompNameIntfr(connectDB,pConnDB);
                    saccopn.add(dismth, javax.swing.JLayeredPane.DEFAULT_LAYER);
                    try {
                        dismth.setSelected(true);
                    } catch(java.beans.PropertyVetoException pvt){}
                    
                    
                }
                
                isRunning = true;
                
                java.lang.Thread tread = new java.lang.Thread(this);
                
                
                tread.start();
            }
        } catch(java.sql.SQLException sqlE) {
            javax.swing.JOptionPane.showMessageDialog(this,sqlE.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        // Add your handling code here:
    }//GEN-LAST:event_hosptalmnitActionPerformed
    
    private void aboutmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutmnActionPerformed
        AboutBoxintfr comp = new AboutBoxintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_aboutmnActionPerformed
    
    private void mbVerifymnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbVerifymnitActionPerformed
        //        javax.swing.JInternalFrame comp = new MemberVerifyintfr(connectDB,pConnDB);
        //      saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        //    try {
        //      comp.setSelected(true);
        
        //} catch(java.beans.PropertyVetoException pvt){}         // Add your handling code here:
    }//GEN-LAST:event_mbVerifymnitActionPerformed
    
    private void raisecashVouchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raisecashVouchmnitActionPerformed
        com.afrisoftech.accounting.RaiseCashJournalintfr comp = new com.afrisoftech.accounting.RaiseCashJournalintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_raisecashVouchmnitActionPerformed
    
    private void payvouchermnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payvouchermnitActionPerformed
        //  com.afrisoftech.accounting.CashJourAppintfr comp = new com.afrisoftech.accounting.CashJourAppintfr(connectDB,pConnDB);
        
        //  comp.setVisible(true);
        com.afrisoftech.hospital.CashJourAppintfr comp = new com.afrisoftech.hospital.CashJourAppintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_payvouchermnitActionPerformed
    
    private void setaccperiodmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setaccperiodmnitActionPerformed
        
        javax.swing.JInternalFrame comp = new ChangePeriodintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_setaccperiodmnitActionPerformed
    
    private void comfbankingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comfbankingmnitActionPerformed
        com.afrisoftech.accounting.ComfBankingintfr comp = new com.afrisoftech.accounting.ComfBankingintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_comfbankingmnitActionPerformed
    
    private void approvevouchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvevouchmnitActionPerformed
        com.afrisoftech.accounting.VoucherApprintfr comp = new com.afrisoftech.accounting.VoucherApprintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_approvevouchmnitActionPerformed
    
    private void YearlyhlpsetsmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearlyhlpsetsmnitActionPerformed
        com.afrisoftech.accounting.DepreciationClass depreciation = new com.afrisoftech.accounting.DepreciationClass(connectDB,pConnDB);
        
        System.out.println("The depreciation object : "+depreciation.toString());
        
        depreciation.DepreciationClass();
        
        // Add your handling code here:
    }//GEN-LAST:event_YearlyhlpsetsmnitActionPerformed
    
    private void raisevouchmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raisevouchmnitActionPerformed
        com.afrisoftech.accounting.RaiseVoucherintfr comp = new com.afrisoftech.accounting.RaiseVoucherintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_raisevouchmnitActionPerformed
    
    private void bankingmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankingmnitActionPerformed
        com.afrisoftech.accounting.ShiftDepintfr comp = new com.afrisoftech.accounting.ShiftDepintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        // Add your handling code here:
    }//GEN-LAST:event_bankingmnitActionPerformed
    
    private void updatedomainsmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedomainsmnit1ActionPerformed
        
        
        this.domainsReset = true;
        
        this.updateActivityDomains();
        
        this.domainsReset = false;
        
        // Add your handling code here:
    }//GEN-LAST:event_updatedomainsmnit1ActionPerformed
    
    private void chgpasswdmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpasswdmnitActionPerformed
        com.afrisoftech.lib.ChangePassword chgPasswd = new com.afrisoftech.lib.ChangePassword(this, true, connectDB, psWord);
        
        chgPasswd.setVisible(true);         // Add your handling code here:
    }//GEN-LAST:event_chgpasswdmnitActionPerformed
    
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
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        int exitOption = javax.swing.JOptionPane.showConfirmDialog(this, "Do you really want to exit application?", "Caution before closing application!", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (exitOption == javax.swing.JOptionPane.YES_OPTION) {
            
            this.storePreferences();
            
            System.exit(0);
            
        } else {}
        // Add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    
    private void jrnloansmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrnloansmnitActionPerformed
        com.afrisoftech.accounting.Journalsintfr currint = new com.afrisoftech.accounting.Journalsintfr(connectDB, pConnDB);
        saccopn.add(currint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            
            currint.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        // Add your handling code here:
    }//GEN-LAST:event_jrnloansmnitActionPerformed
    
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
        com.afrisoftech.accounting.BankReconintfr comp = new com.afrisoftech.accounting.BankReconintfr(connectDB,pConnDB);
        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            comp.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
        
        
        
        // Add your handling code here:
    }//GEN-LAST:event_bankreconcmnitActionPerformed
    
    private void saccopnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_saccopnComponentShown
        // Add your handling code here:
    }//GEN-LAST:event_saccopnComponentShown
    
    private void bbjmnit11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbjmnit11ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "bbjthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/bbjthemepack.zip"));
        
        appProp.setProperty("defaultlnf","com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
        
        appProp.setProperty("defaulttheme", "bbjthemepack.zip");
        
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_bbjmnit11ActionPerformed
    
    private void swinglnfmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swinglnfmnit1ActionPerformed
        
        this.changeTheme("javax.swing.plaf.metal.MetalLookAndFeel", null);
        
        appProp.setProperty("defaultlnf","javax.swing.plaf.metal.MetalLookAndFeel");
        
        appProp.setProperty("defaulttheme", "");
        
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_swinglnfmnit1ActionPerformed
    
    private void winlnfmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winlnfmnit1ActionPerformed
        
        
        //  System.setProperty("os.name", "Windows");
        
        
        this.changeTheme("com.sun.java.swing.plaf.windows.WindowsLookAndFeel", null);
        
        appProp.setProperty("defaultlnf","com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        
        appProp.setProperty("defaulttheme", "");
        
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_winlnfmnit1ActionPerformed
    
    private void motiflnfmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motiflnfmnit1ActionPerformed
        
        this.changeTheme("com.sun.java.swing.plaf.motif.MotifLookAndFeel", null);
        
        appProp.setProperty("defaultlnf","com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        
        appProp.setProperty("defaulttheme", "");
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_motiflnfmnit1ActionPerformed
    
    private void macmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macmnit1ActionPerformed
        
        this.changeTheme("it.unitn.ing.swing.plaf.macos.MacOSLookAndFeel", null);
        
        appProp.setProperty("defaultlnf","it.unitn.ing.swing.plaf.macos.MacOSLookAndFeel");
        
        appProp.setProperty("defaulttheme", "");
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_macmnit1ActionPerformed
    
    private void skinmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skinmnActionPerformed
        
        //  this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "xplunathemepack.zip");
        
        // Add your handling code here:
    }//GEN-LAST:event_skinmnActionPerformed
    
    private void beosmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beosmnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "beosthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/beosthemepack.zip"));
        
        appProp.setProperty("defaultlnf","com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
        
        appProp.setProperty("defaulttheme", "beosthemepack.zip");
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_beosmnit1ActionPerformed
    
    private void aquamnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquamnit1ActionPerformed
        
        //       this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "aquathemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/aquathemepack.zip"));
        
        appProp.setProperty("defaultlnf","com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
        
        appProp.setProperty("defaulttheme", "aquathemepack.zip");
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_aquamnit1ActionPerformed
    
    private void modernmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modernmnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "modernthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/modernthemepack.zip"));
        
        appProp.setProperty("defaultlnf","com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
        
        appProp.setProperty("defaulttheme", "modernthemepack.zip");
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_modernmnit1ActionPerformed
    
    private void whiltmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiltmnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "whistlerthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/whistlerthemepack.zip"));
        
        appProp.setProperty("defaultlnf","com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
        
        appProp.setProperty("defaulttheme", "whistlerthemepack.zip");
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_whiltmnit1ActionPerformed
    
    private void macos1mnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macos1mnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "macosthemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/macosthemepack.zip"));
        
        appProp.setProperty("defaultlnf","com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
        
        appProp.setProperty("defaulttheme", "macosthemepack.zip");
        this.updateNewComponentsUI();
        // Add your handling code here:
    }//GEN-LAST:event_macos1mnit1ActionPerformed
    
    
    private void xpmnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xpmnit1ActionPerformed
        
        //        this.changeTheme("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", "xplunathemepack.zip");
        this.changeThemeByUrl("com.l2fprod.gui.plaf.skin.SkinLookAndFeel", getClass().getResource("/xplunathemepack.zip"));
        
        appProp.setProperty("defaultlnf","com.l2fprod.gui.plaf.skin.SkinLookAndFeel");
        
        appProp.setProperty("defaulttheme", "xplunathemepack.zip");
        this.updateNewComponentsUI();
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
    
    
    private void otherrecptmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherrecptmnitActionPerformed
        int rowsNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            // java.sql.ResultSet rset = stmt.executeQuery("select user,count(debit),sum(debit + credit) from ac_cash_book where account_no ='"+jComboBox2.getSelectedItem()+"' and description !='' and reconciled = false AND date BETWEEN '"+datePicker1.getDate().toString()+"' AND '"+datePicker2.getDate().toString()+"' group by account_name");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(user_name) from ac_shifts where  user_name ilike '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
            
            while (rset1.next()) {
                
                rowsNo = rset1.getInt(1);
                
            }
            if (rowsNo ==0) {
                javax.swing.JOptionPane.showMessageDialog(this, "There is no Shift running");
            } else {
                
                //   while (rset.next()){
                
                //if(this.getShiftStatus()){
                com.afrisoftech.accounting.OtherRecptintfr comp = new com.afrisoftech.accounting.OtherRecptintfr(connectDB,pConnDB);
                saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                try {
                    comp.setSelected(true);
                } catch(java.beans.PropertyVetoException pvt){}
                //}else{
                //  javax.swing.JOptionPane.showMessageDialog(this,"Access Denied! Refer this matter to system administrator");
            }
        }
        
        catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sqlex.getMessage());
            
        }
        /*        if(this.getShiftStatus()){
            com.afrisoftech.accounting.OtherRecptintfr comp = new com.afrisoftech.accounting.OtherRecptintfr(connectDB,pConnDB);
            saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            try {
                comp.setSelected(true);
            } catch(java.beans.PropertyVetoException pvt){}
        }else{
            javax.swing.JOptionPane.showInputDialog(this,"Access Denied ! Consult System Administrator.");
        }
         */
        
        // Add your handling code here:
    }//GEN-LAST:event_otherrecptmnitActionPerformed
    
    private void saccopnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saccopnMousePressed
        
        System.out.println("Selected taskbar "+jOutLookBar.getTitleAt(jOutLookBar.getSelectedIndex()));
        
        if (evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK){
            
            if(jOutLookBar.getTitleAt(jOutLookBar.getSelectedIndex()) == "Hospital Operations"){
                
                this.operationsPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                
            }  else if (jOutLookBar.getTitleAt(jOutLookBar.getSelectedIndex()) == "Stock & Inventory") {
                
                this.inventoryPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                
            } else if (jOutLookBar.getTitleAt(jOutLookBar.getSelectedIndex()) == "Payroll") {
                
                this.payrollPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                
            } else if (jOutLookBar.getTitleAt(jOutLookBar.getSelectedIndex()) == "Sacco Manager") {
                
                this.saccoPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                
            } else if (jOutLookBar.getTitleAt(jOutLookBar.getSelectedIndex()) == "HR Management") {
                
                this.hrmPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
              
            } else if (jOutLookBar.getTitleAt(jOutLookBar.getSelectedIndex()) == "Reports & Utilities") {
                
                this.reportsPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                
            } else{
                
                this.saccoPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
        // Add your handling code here:
    }//GEN-LAST:event_saccopnMousePressed
    
    private void mtmediaBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtmediaBttnActionPerformed
        
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();
        
        
        try {
            
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                
                rt.exec("kscd");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            else  {
                
                rt.exec("mplayer2");
                
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
                
                rt.exec("evolution");
                
                System.out.print(System.getProperty("os.name") + "  "+System.getProperty("os.version"));
            }
            
            else {
                
                rt.exec("outlook");
                
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
            else  {
                
                rt.exec("winword");
                
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
            else {
                
                rt.exec("iexplore");
                
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
            else  {
                
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
            else  {
                
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
    
    private void opbalmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opbalmnitActionPerformed
        //javax.swing.JInternalFrame prod = new balancesintfr();
        com.afrisoftech.accounting.OpeningBalintfr prod = new com.afrisoftech.accounting.OpeningBalintfr(connectDB,pConnDB);
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
    
    private void otherprmnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherprmnitActionPerformed
     /*   if(this.getShiftStatus()){
            javax.swing.JInternalFrame prod = new com.afrisoftech.hospital.OtherPymintfr(connectDB,pConnDB);
            saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
            try {
                prod.setSelected(true);
            } catch(java.beans.PropertyVetoException pvt){}
        }else{
            javax.swing.JOptionPane.showInputDialog(this,"Access Denied ! Consult System Administrator.");
        }
      
   /*     javax.swing.JInternalFrame prod = new OtherPymintfr(connectDB,pConnDB);
        saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        try {
            prod.setSelected(true);
        } catch(java.beans.PropertyVetoException pvt){}
      
      */
        
        int rowsNo = 0;
        
        try {
            java.sql.Statement stmt = connectDB.createStatement();
            java.sql.Statement stmt1 = connectDB.createStatement();
            // java.sql.ResultSet rset = stmt.executeQuery("select user,count(debit),sum(debit + credit) from ac_cash_book where account_no ='"+jComboBox2.getSelectedItem()+"' and description !='' and reconciled = false AND date BETWEEN '"+datePicker1.getDate().toString()+"' AND '"+datePicker2.getDate().toString()+"' group by account_name");
            java.sql.ResultSet rset1 = stmt1.executeQuery("select count(user_name) from ac_shifts where  user_name ilike '"+System.getProperty("currentuser")+"' AND (status = 'Running' OR status = 'Suspended')");
            
            while (rset1.next()) {
                
                rowsNo = rset1.getInt(1);
                
            }
            if (rowsNo < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "There is no Shift running");
            } else {
                
                //   while (rset.next()){
                
                //if(this.getShiftStatus()){
                
                javax.swing.JInternalFrame prod = new com.afrisoftech.hospital.OtherPymintfr(connectDB,pConnDB);
                saccopn.add(prod, javax.swing.JLayeredPane.DEFAULT_LAYER);
                try {
                    prod.setSelected(true);
                } catch(java.beans.PropertyVetoException pvt){}
                
                //  com.afrisoftech.accounting.InpatientRecpIntfr comp = new com.afrisoftech.accounting.InpatientRecpIntfr(connectDB,pConnDB);
                //  saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                // com.afrisoftech.hospital.InpatientReceiptsIntfr comp = new com.afrisoftech.hospital.InpatientReceiptsIntfr(connectDB,pConnDB);
                // comp.getContentPane().add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            }
        }
        
        catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(sqlex.getMessage());
            
        }
        // Add your handling code here:
    }//GEN-LAST:event_otherprmnitActionPerformed
    
    /** Exit the Application */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //      HospitalMain stockInstance = new HospitalMain(connect2DB(), getPooledConnectionSource(), getPath2Acrobat(), psWord, null, null, null);
        
        //      stockInstance.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        
        //      stockInstance.setVisible(true);
        
        //      java.util.Properties sysProp = System.getProperties();
        
    }
    
    public static java.sql.Connection connect2DB() {
        
        java.sql.Connection connDBStock = null;
        
        try {
            
            java.lang.Class.forName("org.postgresql.Driver");
            
        } catch(java.lang.ClassNotFoundException cnf) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), cnf.getMessage());
            
        }
        
        try {
            
            connDBStock = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/medic","postgres","pilsiner");
            
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), sqlExec.getMessage());
            
        }
        
        return connDBStock;
        
    }
    
    
    public void menuItemsDisabler(java.lang.Object[] menuList2Disable) {
        
        java.lang.reflect.Field[] fieldsArray = null;
        
        javax.swing.JMenuItem disMenuItems = null;
        
        
        try {
            java.lang.Class classMain = java.lang.Class.forName("com.afrisoftech.hospital.HospitalMain");
            
            try {
                
                fieldsArray = classMain.getDeclaredFields();
                
                for (int n = 0; n  < fieldsArray.length; n++) {
                    
                    if (fieldsArray[n].getName().endsWith("mnit")) {
                        
                        disMenuItems = (javax.swing.JMenuItem)fieldsArray[n].get(this);
                        
                        System.out.println(fieldsArray[n].getName()+"\t"+"\t"+"\t"+disMenuItems.getText());
                        
                        
                        
                        disMenuItems.setEnabled(false);
                        // disMenuItems.setVisible(false);
                        
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
            
            javax.swing.JOptionPane.showMessageDialog(this, "Class hospital.hospital not found in the classpath");
            
        }
        
    }
    
    public void updateActivityDomains() {
        
        if (domainsReset) {
            
            try {
                
                java.sql.PreparedStatement pstmt_del = this.connectDB.prepareStatement("DELETE FROM menu_item_list where app_name = 'hospital_main'");
                
                pstmt_del.execute();
                
            } catch(java.sql.SQLException sqlExec) {
                
                javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
                
                
            }
            
            try {
                
                java.lang.Class classMain = java.lang.Class.forName("com.afrisoftech.hospital.HospitalMain");
                
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
                                
                                pstmt.setString(3,"hospital_main");
                                
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
                
                javax.swing.JOptionPane.showMessageDialog(this, "Class hospital.hospital not found in the classpath");
                
                
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
                        
                        // jToolBar1.updateUI();
                        
                        //   this.jPopupMenu1.updateUI();
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this);
                        
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this.getRootPane());
                        
                        updateNewComponentsUI();
                        
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
    
    public void changeTheme(java.lang.String lnf, java.lang.String themepack) {
        
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
                        
                        
                        //jToolBar1.updateUI();
                        
                        //   this.jPopupMenu1.updateUI();
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this);
                        
                        updateNewComponentsUI();
                        
                        javax.swing.SwingUtilities.updateComponentTreeUI(this.getRootPane());
                        
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
    
    public java.lang.String getCompanyName() {
        
        java.lang.String title = null;
        
        
        
        try {
            
            
            java.sql.Statement stmt1 = this.connectDB.createStatement();
            
            java.sql.ResultSet rs1 = stmt1.executeQuery("select hospital_name from pb_hospitalprofile");
            
            while (rs1.next()) {
                
                title = "FUNSOFT :: "+(rs1.getString(1)); //- ["+jTabbedPane1.getSelectedComponent().getName()+"]";
                
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
            
            backup_proc = rt_backup.exec("pg_dump medic -f MEDIC_"+backup_date_stamp+".sql");
            
            try {
                
                backup_proc.waitFor();
                
            } catch(java.lang.InterruptedException IntruptExec){
                
                javax.swing.JOptionPane.showMessageDialog(this, IntruptExec.getLocalizedMessage());
                
            }
            
            int backup_proc_return = backup_proc.exitValue();
            
            
            if (backup_proc_return == 0) {
                
                javax.swing.JOptionPane.showMessageDialog(this, "Backup of the Medic database successfully completed on "+backup_date_stamp);
                
            } else {
                
                javax.swing.JOptionPane.showMessageDialog(this, "Backup of the Medic database failed at "+backup_date_stamp);
                
            }
            
        } catch(IOException IOExec){
            
            JOptionPane.showMessageDialog(this, "Sorry, can't get path to Help utility", "Error Message", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
    }
    
    public void stop() {
        
        Thread.currentThread().stop();
        
        
    }
    
    
   /*  public void run() {
        //   this.setCursor(javax.swing.JFrame.WAIT_CURSOR);
        System.out.println("Thread is "+java.lang.Thread.currentThread().getName());
    
        if (java.lang.Thread.currentThread().getName().matches("Cash")) {
    
            loadingMode = true;
    
            //progressBarPopup.show();
    
            aliveStatus = true;
    
            startRunning();
            //            System.out.println("Thread Patient starting...");
            while (cashRunning) {
    
                com.afrisoftech.accounting.BillPaymentsIntfr comp = new com.afrisoftech.accounting.BillPaymentsIntfr(connectDB,pConnDB);
    
                saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
    
                loadingMode = false;
    
                // progressBarPopup.hide();
    
                try {
                    comp.setSelected(true);
    
                } catch(java.beans.PropertyVetoException pvt){}
                try {
                    Thread.currentThread().sleep(100);
    
                } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
    
    
                stopRunning();
    
    
                cashRunning = false;
            }
    
            // while(isRunning) {
    
            //         int comp_dlg  = javax.swing.JOptionPane.showConfirmDialog(this, "About to open Company profile", "Company profile dialogue", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
    
            //       if (comp_dlg == javax.swing.JOptionPane.YES_OPTION){
    
            //               this.backupImmediate();
    
            //               isRunning = false;
    
    
            //   javax.swing.JInternalFrame comp = new CompanyPrfintfr(connectDB, pConnDB);
    
    
    
    
            // saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
    
    
    
    
          //  patientRunning = false;
    
            cashierRunning = false;
    
         /* try {
                comp.setSelected(true);
    
                this.setCursor(javax.swing.JFrame.DEFAULT_CURSOR);
    
            } catch(java.beans.PropertyVetoException pvt){}
    */
    // }
    //}
    
    // if (!cashRunning) {
    
    //   stop();
    
    //   Thread.currentThread().destroy();
    // }
    
    // }
/* else if (java.lang.Thread.currentThread().getName().matches("Sales Open")){
 
 
            System.out.println("Thread is "+java.lang.Thread.currentThread().getName());
 
            while (threadSales == true) {
 
                if (getShiftStatus()) {
 
                    loadingMode = true;
 
                    // progressBarPopup.show();
 
                    aliveStatus = true;
 
                    startRunning();
 
                    //        System.out.println(statusShift);
 
                    com.afrisoftech.accounting.BillPaymentsIntfr comp = new com.afrisoftech.accounting.BillPaymentsIntfr(connectDB,pConnDB);
 
                    if (!(System.getProperty("billpmnt").equalsIgnoreCase("showing"))) {
                        saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                        try {
 
                            comp.setSelected(true);
 
                            this.billPaymentIntfr_isShowing = true;
 
                            try {
 
                                java.sql.PreparedStatement pstmt = connectDB.prepareStatement("UPDATE ac_shifts SET status = 'Running' WHERE cash_point = '"+System.getProperty("cashpoint")+"' AND user_name = '"+System.getProperty("currentuser")+"' AND status = 'Suspended'");
 
                                pstmt.executeUpdate();
 
                            } catch(java.sql.SQLException sqlExec) {
 
 
                                javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
 
                            }
 
                            System.setProperty("billpmnt", "showing");
 
                            System.out.println(System.getProperty("billpmnt"));
 
                            try {
 
                                Thread.currentThread().sleep(100);
 
                            } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
 
                        } catch(java.beans.PropertyVetoException pvt){}
                    }
 
                } else {
 
                    javax.swing.JOptionPane.showMessageDialog(this, "Can't proceed without a valid shift instance", "Error Message", javax.swing.JOptionPane.WARNING_MESSAGE);
 
                }
 
                loadingMode = false;
 
                stopRunning();
 
                //   progressBarPopup.hide();
 
                threadSales = false;
            }
 
        }*/
    // if (!threadSales) {
    
    //   stop();
    
    //  Thread.currentThread().destroy();
    //}
    // }
    
    public void run() {
        //   this.setCursor(javax.swing.JFrame.WAIT_CURSOR);
        System.out.println("Thread is "+java.lang.Thread.currentThread().getName());
        
        if (java.lang.Thread.currentThread().getName().matches("Patient")) {
            
            loadingMode = true;
            
            //progressBarPopup.show();
            
            aliveStatus = true;
            
            startRunning();
            //            System.out.println("Thread Patient starting...");
            while (patientRunning) {
                
                PatientRegisterIntfr comp = new PatientRegisterIntfr(connectDB,pConnDB);
                
                saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                
                loadingMode = false;
                
                // progressBarPopup.hide();
                
                try {
                    comp.setSelected(true);
                    
                } catch(java.beans.PropertyVetoException pvt){}
                try {
                    Thread.currentThread().sleep(100);
                    
                } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
                
                
                stopRunning();
                
                
                patientRunning = false;
            }
            
            // while(isRunning) {
            
            //         int comp_dlg  = javax.swing.JOptionPane.showConfirmDialog(this, "About to open Company profile", "Company profile dialogue", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
            
            //       if (comp_dlg == javax.swing.JOptionPane.YES_OPTION){
            
            //               this.backupImmediate();
            
            //               isRunning = false;
            
            
            //   javax.swing.JInternalFrame comp = new CompanyPrfintfr(connectDB, pConnDB);
            
            
            
            
            // saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            
            
            
            
            patientRunning = false;
            
            cashRunning = false;
            
         /* try {
                comp.setSelected(true);
          
                this.setCursor(javax.swing.JFrame.DEFAULT_CURSOR);
          
            } catch(java.beans.PropertyVetoException pvt){}
          */
            // }
            //}
            
            if (!patientRunning) {
                
                stop();
                
                Thread.currentThread().destroy();
            }
            
        } else if (java.lang.Thread.currentThread().getName().matches("Cash")){
            
            
            System.out.println("Thread is "+java.lang.Thread.currentThread().getName());
            
            while (cashRunning) {
                
                //  if (getShiftStatus()) {
                
                loadingMode = true;
                
                // progressBarPopup.show();
                
                aliveStatus = true;
                
                startRunning();
                
                //        System.out.println(statusShift);
                
                com.afrisoftech.accounting.BillPaymentsIntfr comp = new com.afrisoftech.accounting.BillPaymentsIntfr(connectDB,pConnDB);
                
                saccopn.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                
                
                System.setProperty("billpmnt", "showing");
                
                System.out.println(System.getProperty("billpmnt"));
                
                try {
                    comp.setSelected(true);
                    
                } catch(java.beans.PropertyVetoException pvt){}
                try {
                    Thread.currentThread().sleep(100);
                    
                } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
                
                
                
                
                
                loadingMode = false;
                
                stopRunning();
                
                //   progressBarPopup.hide();
                
                cashRunning = false;
                
                
            }
            if (!cashRunning) {
                
                stop();
                
                Thread.currentThread().destroy();
            }
        }
    }
    public void launchIntfr(java.lang.String instIntfrName, java.lang.String intfrClass){
        
    }
    
 /*   public java.lang.Object[] getMemberNo() {
  
        java.util.Vector memVector = new java.util.Vector(1,1);
  
        java.lang.Object[] memObj = null;
  
  
  
     /   try {
  
            //            java.sql.Connection dbConn = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/sako","postgres","pilsiner");
  
            java.sql.Statement connStmt = this.connectDB.createStatement();
  
            java.sql.ResultSet rSet = connStmt.executeQuery("SELECT DISTINCT lpad(m_number,9,0) FROM member");
  
            while (rSet.next()) {
  
  
                memVector.addElement(rSet.getObject(1).toString());
  
            }
  
        } catch(java.sql.SQLException sqlExec) {
  
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
  
        }
  
        memObj = memVector.toArray();
  
        return memObj;
  
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
  */
    public static org.netbeans.lib.sql.pool.PooledConnectionSource getPooledConnectionSource() {
        
        org.netbeans.lib.sql.pool.PooledConnectionSource pooledConnectionSource1 = new org.netbeans.lib.sql.pool.PooledConnectionSource();
        
        pooledConnectionSource1.setDatabase("jdbc:postgresql://localhost:5432/medic");
        
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
            
            //java.util.Properties appProp = new java.util.Properties();
            
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
    
    private boolean getShiftStatus() {
        
        
        boolean status = false;
        
        java.lang.String shift_state = null;
        
        try {
            
            java.sql.Statement stmt = connectDB.createStatement();
            
            java.sql.ResultSet rSet = stmt.executeQuery("Select status from ac_shifts where cash_point = '"+System.getProperty("cashpoint")+"' AND user_name = '"+System.getProperty("currentuser")+"'");
            
            while (rSet.next()) {
                
                shift_state = rSet.getString(1);
                
            }
            
        } catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
        }
        
        if (shift_state == null) {
            
            int openShift = javax.swing.JOptionPane.showConfirmDialog(this, "Opening new shift", "Starting a new shift ...", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
            
            if (openShift == javax.swing.JOptionPane.YES_OPTION) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                
                long dateNow = calendar.getTimeInMillis();
                
                java.sql.Date datenowSql1= new java.sql.Date(dateNow);
                
                System.out.println(datenowSql1.toString());
                
                java.sql.Timestamp datenowSql= new java.sql.Timestamp(dateNow);
                
                System.out.println(datenowSql.toString());
                
                String current_user;
                try {
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement("INSERT INTO ac_shifts values(?,?)");
                    pstmt.setString(1, System.getProperty("cashpoint"));
                    pstmt.setString(2,"Running");
                    pstmt.executeUpdate();
                }catch (java.sql.SQLException sqE) {
                    sqE.printStackTrace();
                }
                System.out.println("Opening shift");
                
                status = true;
                
            }
            //            javax.swing.JOptionPane.showMessageDialog(this, "ERROR : Contact System Administrator regarding shift status.");
            
        } else {
            
            if (!shift_state.equalsIgnoreCase("Closed")) {
                
                status = true;
                
                
                
/*        if (shiftStatus) {
 
            javax.swing.JOptionPane.showMessageDialog(this, "You have an instance of shift running");
 
            status = true; */
            }
            else {
                
                int openShift = javax.swing.JOptionPane.showConfirmDialog(this, "Opening new shift", "Starting a new shift ...", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
                
                if (openShift == javax.swing.JOptionPane.YES_OPTION) {
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    
                    long dateNow = calendar.getTimeInMillis();
                    
                    java.sql.Date datenowSql1= new java.sql.Date(dateNow);
                    
                    System.out.println(datenowSql1.toString());
                    
                    java.sql.Timestamp datenowSql= new java.sql.Timestamp(dateNow);
                    
                    System.out.println(datenowSql.toString());
                    
                    String current_user;
                    try {
                        //java.sql.Statement stm = connectDB.createStatement();
                        //java.sql.ResultSet rset = stm.executeQuery("select current_user");
                        //current_user = rset.getObject(1).toString();
                        java.sql.PreparedStatement pstmt = connectDB.prepareStatement("INSERT INTO ac_shifts values(?,?)");
                        
                        // pstmt.setString(1, current_user);
                        pstmt.setString(1, System.getProperty("cashpoint"));
                        //  pstmt.setString(3,null);
                        pstmt.setString(2,"Running");
                        // pstmt.setTimestamp(5,datenow);
                        //   pstmt.setTimestamp(6,null);
                        pstmt.executeUpdate();
                    }catch (java.sql.SQLException sqE) {
                        sqE.printStackTrace();
                    }
                    System.out.println("Opening shift");
                    
                    status = true;
                    
                } else {
                    
                    System.out.println("Cancelled opening shift");
                    
                    status = false;
                }
                
            }
        }
        
        
        
        return(status);
        
        
    }
    
    private void storePreferences() {
        
        //        appProp.setProperty("defaultsplitpane", jTabbedPane1.getSelectedComponent().getName());
        
        try {
            
            try {
                
                appProp.store(new java.io.FileOutputStream(myAppOutFileUrl), "My properties file");
                
            } catch(java.io.FileNotFoundException fnfExec) {
                
                javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), fnfExec.getMessage());
                
            }
            
        } catch(java.io.IOException IOExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), IOExec.getMessage());
            
        }
        
    }
    
    class ProgressThread extends java.lang.Thread {
        
        
        
        boolean stopStatus = false;
        
        int min = 0;
        
        int max = 50;
        
        public ProgressThread(java.awt.Component parent) {
            
            progressMonitor = new javax.swing.ProgressMonitor(parent, "Please wait while form initializes...", "About to start...", min, max);
            
            System.out.println("Progress Monitor object : "+progressMonitor.toString());
            
            progressMonitor.setMillisToDecideToPopup(1);
        }
        
        public void setStop(boolean value) {
            
            stopStatus = value;
            
            progressMonitor.close();
            
        }
        
        public void run() {
            
            System.out.println("Progress Monitor object 1 : "+progressMonitor.toString());
            
            progressMonitor.setNote("Loading. Please wait...");
            
            while (loadingMode) {
                
                min = 0;
                
                max = 100000;
                
                for (int i = min; i <= max; i++) {
                    
                    if (stopStatus) {
                        
                        break;
                        
                    } else {
                        
                        progressMonitor.setProgress(i);
                        
                        //  progressBar.setValue(i);
                        progressMonitor.setNote(""+(i*2)+"%");
                        try {
                            
                            java.lang.Thread.sleep(500);
                            
                        } catch (java.lang.InterruptedException intExec) {
                            
                            javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), "Interruption Exception!");
                        }
                        
                        // }
                        
                    }
                    
                }
                aliveStatus = false;
                
            }
            
        }
        
    }
    private void startRunning() {
        
        System.out.println("Starting to run Progress Thread");
        
        if (progressThread == null || !progressThread.isAlive()) {
            
            progressThread = new ProgressThread(this);
            
            progressThread.start();
            
            System.out.println("Progress Thread started");
            
        }
        
    }
    
    private void stopRunning() {
        
        System.out.println("Stopping run Progress Thread");
        
        progressThread.setStop(true);
        
    }
    public java.lang.Object[] getOrderNo() {
        
        java.util.Vector memVector = new java.util.Vector(1,1);
        
        java.lang.Object[] orderObj = null;
        
        try {
            
            java.sql.Statement connStmt = connectDB.createStatement();
            
            java.sql.ResultSet rSet = connStmt.executeQuery("SELECT DISTINCT order_no FROM st_orders");
            
            while (rSet.next()) {
                
                memVector.addElement(rSet.getObject(1).toString());
                
            }
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
        
        orderObj = memVector.toArray();
        
        return orderObj;
        
    }
    public java.lang.Object[] getSuppName() {
        
        java.util.Vector memVector = new java.util.Vector(1,1);
        
        java.lang.Object[] suppObj = null;
        
        
        
        try {
            
            
            java.sql.Statement connStmt = connectDB.createStatement();
            
            java.sql.ResultSet rSet = connStmt.executeQuery("SELECT DISTINCT supplier FROM st_product_list");
            
            while (rSet.next()) {
                
                memVector.addElement(rSet.getObject(1).toString());
                
            }
            
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
        
        suppObj = memVector.toArray();
        
        return suppObj;
        
    }
    
    private void optimizeDB() {
        
        
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
        
    }
 /*
    public void setURL(java.net.URL newURL) {
  
        try {
  
//            helpDocEditorPane.setPage(newURL);
  
        } catch(java.io.IOException exec) {
  
            exec.printStackTrace();
  
            javax.swing.JOptionPane.showMessageDialog(this, exec.getMessage());
  
        }
  
    }
  
    public void setURLSet(java.lang.String stringUrl) {
  
        try {
  
            java.net.URL urlString = new java.net.URL("file:///"+homeUrl+stringUrl);
  
            setURL(urlString);
  
        } catch (java.net.MalformedURLException malExec) {
  
            malExec.printStackTrace();
  
            javax.swing.JOptionPane.showMessageDialog(this, malExec.getMessage());
  
        }
  
    }
  */
    private class OpenShiftAction extends javax.swing.AbstractAction {
        
        public void OpenShiftAction() {
            
        }
        
        public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
            
            threadSales = true;
            
            java.lang.Thread threadSalesOpen = new java.lang.Thread(getMainClass(), "Sales Open");
            
            threadSalesOpen.start();
            
            //openShiftAction.setEnabled(false);
            
            
        }
        
    }
    
    private class PatientRegistrationAction extends javax.swing.AbstractAction {
        
        public void PatientRegistrationAction() {
            
        }
        
        public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
            
            patientRunning = true;
            
            patientThread = new java.lang.Thread(getMainClass(), "Patient");
            
            patientThread.start();
            
        }
        
    }
    
    public com.afrisoftech.hospital.HospitalMain getMainClass() {
        
        return this;
        
    }
   /* private javax.swing.JTextPane createTextPane() {
        javax.swing.JTextPane textPane = new javax.swing.JTextPane();
        java.lang.String[] initString =
        { "This is an editable JTextPane, ",		//regular
          "another ",					//italic
          "styled ",					//bold
          "text ",					//small
          "component, ",				//large
          "which supports embedded components..." + newline,//regular
          newTab+newTab+newTab+newTab+" " + newline,
          // newline,
          newTab+newTab+newTab+newTab+" " + newline,//button
          "...and embedded icons..." + newline,		//regular
          " ", 						//icon
          newline + "JTextPane is a subclass of JEditorPane that " +
          "uses a StyledEditorKit and StyledDocument, and provides " +
          "cover methods for interacting with those objects."
        };
    
        java.lang.String[] initStyles =
        { "regular", "italic", "bold", "small", "large",
          "regular", "button", "button1", "regular", "icon",
          "regular"
        };
    
        initStylesForTextPane(textPane);
    
        javax.swing.text.Document doc = textPane.getDocument();
    
        try {
            for (int i=0; i < initString.length; i++) {
                doc.insertString(doc.getLength(), initString[i],
                textPane.getStyle(initStyles[i]));
            }
        } catch (javax.swing.text.BadLocationException ble) {
            System.err.println("Couldn't insert initial text.");
        }
    
        return textPane;
    }
    
    protected void initStylesForTextPane(javax.swing.JTextPane textPane) {
        //Initialize some styles.
        javax.swing.text.Style def = javax.swing.text.StyleContext.getDefaultStyleContext().
        getStyle(javax.swing.text.StyleContext.DEFAULT_STYLE);
    
        Style regular = textPane.addStyle("regular", def);
        StyleConstants.setFontFamily(def, "SansSerif");
    
        Style s = textPane.addStyle("italic", regular);
        StyleConstants.setItalic(s, true);
    
        s = textPane.addStyle("bold", regular);
        StyleConstants.setBold(s, true);
    
        s = textPane.addStyle("small", regular);
        StyleConstants.setFontSize(s, 10);
    
        s = textPane.addStyle("large", regular);
        StyleConstants.setFontSize(s, 16);
    
        s = textPane.addStyle("icon", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        StyleConstants.setIcon(s, new javax.swing.ImageIcon("images/Pig.gif"));
    
        s = textPane.addStyle("button", regular);
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        //        javax.swing.JButton button = new javax.swing.JButton(new javax.swing.ImageIcon(getClass().getResource("/npdbr1.gif")));
        javax.swing.JButton button = new javax.swing.JButton(this.openShiftAction);
        button.setMargin(new java.awt.Insets(1,1,1,1));
        button.setSize(30,10);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                java.awt.Toolkit.getDefaultToolkit().beep();
            }
        });
        StyleConstants.setComponent(s, button);
    
        s = textPane.addStyle("button1", regular);
    
        StyleConstants.setAlignment(s, StyleConstants.ALIGN_CENTER);
        //        javax.swing.JButton button = new javax.swing.JButton(new javax.swing.ImageIcon(getClass().getResource("/npdbr1.gif")));
        javax.swing.JButton button1 = new javax.swing.JButton(this.patientRegistrationAction);
        button1.setMargin(new java.awt.Insets(1,1,1,1));
        button1.setOpaque(false);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                java.awt.Toolkit.getDefaultToolkit().beep();
            }
        });
        StyleConstants.setComponent(s, button1);
    
    }
    */
    class CustomTreeCellEditor extends javax.swing.tree.DefaultTreeCellEditor {
        
        // Color currentColor = null;
        
        public CustomTreeCellEditor(javax.swing.JButton treeButton) {
            
            super(new javax.swing.JTree(), new javax.swing.tree.DefaultTreeCellRenderer());
            
            // super(new javax.swing.JCheckBox()); //Unfortunately, the constructor
            //expects a check box, combo box,
            //or text field.
            editingComponent = treeButton;
            
            //setClickCountToStart(1); //This is usually 1 or 2.
            
            //Must do this so that editing stops when appropriate.
           /* treeButton.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
            
                    fireEditingStopped();
                }
            });*/
        }
        
        protected void fireEditingStopped() {
            
            // super.fireEditingStopped();
            
        }
        
        public Object getCellEditorValue() {
            
            return editingComponent.getName();
            
        }
        
        public java.awt.Component getTreeCellEditorComponent(javax.swing.JTree tree,
        Object value,
        boolean isSelected,
        int row,
        int column) {
            
            //((javax.swing.JButton)editingComponent).setText(value.toString());
            // currentColor = (Color)value;
            return (javax.swing.JButton)value; //= (javax.swing.JButton)value;
        }
    }
 /*
    public void callMenuItemFromTree(java.lang.String menuItem2call, java.lang.String moduleClassName) {
  
        java.lang.reflect.Field[] fieldsArray = null;
  
        javax.swing.JMenuItem disMenuItems = null;
  
  
        try {
            java.lang.Class classMain = java.lang.Class.forName(moduleClassName);
  
            try {
  
                fieldsArray = classMain.getDeclaredFields();
  
                for (int n = 0; n  < fieldsArray.length; n++) {
  
                    if (fieldsArray[n].getName().endsWith("mnit")) {
  
                        disMenuItems = (javax.swing.JMenuItem)fieldsArray[n].get(this);
  
                        //System.out.println(fieldsArray[n].getName()+"\t"+"\t"+"\t"+disMenuItems.getText());
  
                        //disMenuItems.setEnabled(false);
  
                        // for (int m = 0; m < menuList2Disable.length; m++) {
  
                        if (fieldsArray[n].getName().equals(menuItem2call)) {
  
                            java.lang.Object obj = (java.lang.Object)fieldsArray[n];
  
                            try{
  
                                javax.swing.JMenuItem men2dis = (javax.swing.JMenuItem)fieldsArray[n].get(this);
  
                                men2dis.doClick();
  
                                // men2dis.setEnabled(true);
  
                            } catch(java.lang.IllegalAccessException illAcc){
  
                                System.out.println(illAcc.getMessage());
  
                            }
  
                        }
  
                        // }
  
                    }
  
                }
  
  
            } catch(java.lang.IllegalAccessException illAcc){
  
                System.out.println(illAcc.getMessage());
  
            }
  
        } catch(java.lang.ClassNotFoundException clsNotFnd){
  
            javax.swing.JOptionPane.showMessageDialog(this, "Class hospital.hospital not found in the classpath");
  
        }
  
    }
  
    public void createTreeComponents() {
  
        top = new javax.swing.tree.DefaultMutableTreeNode("Hospital System View");
  
        treeRowCount = parseMenuBar.parseHospitalMenus(this.getJMenuBar(), top, topReports, "Operations Reports", "Operations Utilities");
  
        jTree1 = new javax.swing.JTree(top);
  
        javax.swing.tree.DefaultTreeCellRenderer renderer = new javax.swing.tree.DefaultTreeCellRenderer();
  
        javax.swing.tree.DefaultTreeCellEditor treeEditor = new CustomTreeCellEditor(new javax.swing.JButton());
  
        renderer.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/npdbr1.gif")));
  
        renderer.setTextSelectionColor(java.awt.Color.blue);
  
        renderer.setOpaque(true);
  
        jTree1.setCellEditor(treeEditor);
  
        jTree1.setCellRenderer(renderer);
  
        jTree1.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);
  
        //Listen for when the selection changes.
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
  
            public void valueChanged(javax.swing.event.TreeSelectionEvent e) {
  
                javax.swing.tree.DefaultMutableTreeNode node = (javax.swing.tree.DefaultMutableTreeNode)
  
                jTree1.getLastSelectedPathComponent();
  
                if (node == null) return;
  
                Object nodeInfo = node.getUserObject();
  
                if (node.isLeaf()) {
  
                    parseMenuBar.getTargetMenuItem(getJMenuBar().getSubElements(), nodeInfo.toString());
  
                    //                    invokeTreeActionPlan(nodeInfo.toString());
  
                } else {
                    // displayURL(helpURL);
                }
            }
        });
  
        //        parseMenuBar.expandCustomTree(jTree1, treeRowCount);
  
        treeScrollPane.setViewportView(jTree1);
  
        //        parseMenuBar.expandCustomTree(jTreeHelp, 100);
  
    }
  
    public void createTreeStock() {
  
        topStock = new javax.swing.tree.DefaultMutableTreeNode("Hospital Pharmacy & Stock");
  
        int topStockRowCount = parseMenuBar.parseHospitalMenus(stockMain.getJMenuBar(), topStock, topReports, "Inventory Reports", "Inventory Utilities");
  
        jTreeStock = new javax.swing.JTree(topStock);
  
        javax.swing.tree.DefaultTreeCellRenderer rendererStock = new javax.swing.tree.DefaultTreeCellRenderer();
  
        rendererStock.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/BD21314_.GIF")));
  
        rendererStock.setTextSelectionColor(java.awt.Color.blue);
  
        rendererStock.setOpaque(true);
  
        jTreeStock.setCellRenderer(rendererStock);
  
        jTreeStock.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);
  
        //Listen for when the selection changes.
        jTreeStock.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
  
            public void valueChanged(javax.swing.event.TreeSelectionEvent e) {
  
                javax.swing.tree.DefaultMutableTreeNode node = (javax.swing.tree.DefaultMutableTreeNode)
  
                jTreeStock.getLastSelectedPathComponent();
  
                if (node == null) return;
  
                Object nodeInfo = node.getUserObject();
  
                if (node.isLeaf()) {
  
                    parseMenuBar.getTargetMenuItem(stockMain.getJMenuBar().getSubElements(), nodeInfo.toString());
  
                    //                    invokeStockTreeActionPlan(nodeInfo.toString());
  
                } else {
                    // displayURL(helpURL);
                }
            }
        });
  
        //        parseMenuBar.expandCustomTree(jTreeStock, topStockRowCount);
  
        treeScrollPane2.setViewportView(jTreeStock);
  
    }
  
    public void createTreePayroll() {
  
        toPayroll = new javax.swing.tree.DefaultMutableTreeNode("Hospital Payroll");
  
        int treePayrollRowCount = parseMenuBar.parseHospitalMenus(payrollMain.getJMenuBar(), toPayroll, topReports, "Payroll Reports", "Payroll Utilities");
  
        jTreePayroll = new javax.swing.JTree(toPayroll);
  
        //jTreePayroll.setBackground(java.awt.Color.gray);
  
        javax.swing.tree.DefaultTreeCellRenderer rendererPayroll = new javax.swing.tree.DefaultTreeCellRenderer();
  
        rendererPayroll.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/BD21337_.GIF")));
  
        rendererPayroll.setTextSelectionColor(java.awt.Color.blue);
  
        rendererPayroll.setOpaque(true);
  
        jTreePayroll.setCellRenderer(rendererPayroll);
  
        jTreePayroll.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);
  
        //Listen for when the selection changes.
        jTreePayroll.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
  
            public void valueChanged(javax.swing.event.TreeSelectionEvent e) {
  
                javax.swing.tree.DefaultMutableTreeNode node = (javax.swing.tree.DefaultMutableTreeNode)
  
                jTreePayroll.getLastSelectedPathComponent();
  
                if (node == null) return;
  
                Object nodeInfo = node.getUserObject();
  
                if (node.isLeaf()) {
  
                    //                    com.afrisoftech.lib.ParseMenuBar parserMenuBar = new com.afrisoftech.lib.ParseMenuBar();
  
                    parseMenuBar.getTargetMenuItem(payrollMain.getJMenuBar().getSubElements(), nodeInfo.toString());
  
                    // javax.swing.JMenuItem targetMenuItem = (javax.swing.JMenuItem)targetItem;
  
                    //                    System.out.println();
  
                    //                    System.out.println(targetMenuItem);
  
                    //                    targetMenuItem.setEnabled(false);
                    //                    callMenuItemFromTree(nodeInfo.toString(), "com.afrisoftech.hospayroll.PayrollMain");
  
                    //                    invokePayrollTreeActionPlan(nodeInfo.toString());
  
                } else {
                    // displayURL(helpURL);
                }
            }
        });
  
        //        parseMenuBar.expandCustomTree(jTreePayroll, treePayrollRowCount);
  
        treeScrollPane3.setViewportView(jTreePayroll);
  
    }
  
    public void createReportsTree() {
  
        jTreeReports = new javax.swing.JTree(topReports);
  
        javax.swing.tree.DefaultTreeCellRenderer renderer = new javax.swing.tree.DefaultTreeCellRenderer();
  
        javax.swing.tree.DefaultTreeCellEditor treeEditor = new CustomTreeCellEditor(new javax.swing.JButton());
  
        renderer.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/old[1].gif")));
  
        renderer.setTextSelectionColor(java.awt.Color.blue);
  
        renderer.setOpaque(true);
  
        //        jTreeReports.setCellEditor(treeEditor);
  
        jTreeReports.setCellRenderer(renderer);
  
        jTreeReports.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);
  
        //Listen for when the selection changes.
        jTreeReports.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
  
            public void valueChanged(javax.swing.event.TreeSelectionEvent e) {
  
                javax.swing.tree.DefaultMutableTreeNode node = (javax.swing.tree.DefaultMutableTreeNode)
  
                jTreeReports.getLastSelectedPathComponent();
  
                if (node == null) return;
  
                Object nodeInfo = node.getUserObject();
  
                if (node.isLeaf()) {
  
                    parseMenuBar.getTargetMenuItem(getJMenuBar().getSubElements(), nodeInfo.toString());
  
                    parseMenuBar.getTargetMenuItem(stockMain.getJMenuBar().getSubElements(), nodeInfo.toString());
  
                    parseMenuBar.getTargetMenuItem(payrollMain.getJMenuBar().getSubElements(), nodeInfo.toString());
  
                    //                    invokeTreeActionPlan(nodeInfo.toString());
  
                } else {
                    // displayURL(helpURL);
                }
            }
        });
  
        //        parseMenuBar.expandCustomTree(jTreeReports, treeRowCount);
  
        treeScrollPane4.setViewportView(jTreeReports);
  
        this.desktopPaneReports.setOpaque(false);
  
        this.desktopPanePayroll.setOpaque(false);
  
        this.jTabbedPane1.setOpaque(false);
  
        this.payrollSplitPane.setOpaque(false);
  
    }
  */
    public void createTreeDBAdmin() {
        
        treeScrollPaneDBAdmin = new javax.swing.JScrollPane();
        
        com.afrisoftech.dbadmin.DbSchemaTreeModel dbSchemaModel = new com.afrisoftech.dbadmin.DbSchemaTreeModel();
        
        final javax.swing.JTree jTreeDBAdmin = dbSchemaModel.createDBSchemaModel(connectDB, topDBAdmin); //        topDBAdmin = new javax.swing.tree.DefaultMutableTreeNode("Hospital Payroll");
        
        //        int treePayrollRowCount = parseMenuBar.parseHospitalMenus(payrollMain.getJMenuBar(), toPayroll, topReports, "Payroll Reports", "Payroll Utilities");
        
        //        jTreePayroll = new javax.swing.JTree(toPayroll);
        
        //jTreePayroll.setBackground(java.awt.Color.gray);
        
        //        javax.swing.tree.DefaultTreeCellRenderer rendererDBAdmin = new javax.swing.tree.DefaultTreeCellRenderer();
        
        //        rendererPayroll.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/BD21337_.GIF")));
        
        //        jTreeDBAdmin.getCellRenderer().setTextSelectionColor(java.awt.Color.blue);
        
        //        rendererPayroll.setOpaque(true);
        
        //        jTreePayroll.setCellRenderer(rendererPayroll);
        
        jTreeDBAdmin.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);
        
        //Listen for when the selection changes.
        jTreeDBAdmin.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            
            public void valueChanged(javax.swing.event.TreeSelectionEvent e) {
                
                javax.swing.tree.DefaultMutableTreeNode node = (javax.swing.tree.DefaultMutableTreeNode)
                
                jTreeDBAdmin.getLastSelectedPathComponent();
                
                if (node == null) return;
                
                Object nodeInfo = node.getUserObject();
                
                if (node.isLeaf()) {
                    
                    if (tableView.isShowing()) {
                        
                        java.lang.String selectedTable = nodeInfo.toString();
                        
                        tableView.setSize(saccopn.getSize());
                        
                        tableView.populateTableView(selectedTable);
                        
                        tableView.setVisible(true);
                        
                    } else {
                        
                        saccopn.add(tableView, javax.swing.JLayeredPane.DEFAULT_LAYER);
                        
                        java.lang.String selectedTable = nodeInfo.toString();
                        
                        try {
                            
                            tableView.populateTableView(selectedTable);
                            
                            tableView.setSize(saccopn.getSize());
                            
                            tableView.setSelected(true);
                            
                            tableView.setVisible(true);
                            
                        } catch(java.beans.PropertyVetoException pvt){}
                        
                        
                    }
                    
                    //                    com.afrisoftech.lib.ParseMenuBar parserMenuBar = new com.afrisoftech.lib.ParseMenuBar();
                    
                    // parseMenuBar.getTargetMenuItem(payrollMain.getJMenuBar().getSubElements(), nodeInfo.toString());
                    
                    // javax.swing.JMenuItem targetMenuItem = (javax.swing.JMenuItem)targetItem;
                    
                    //                    System.out.println();
                    
                    //                    System.out.println(targetMenuItem);
                    
                    //                    targetMenuItem.setEnabled(false);
                    //                    callMenuItemFromTree(nodeInfo.toString(), "com.afrisoftech.hospayroll.PayrollMain");
                    
                    //                    invokePayrollTreeActionPlan(nodeInfo.toString());
                    
                } else {
                    // displayURL(helpURL);
                }
            }
        });
        
        //   parseMenuBar.expandCustomTree(jTreeDBAdmin, treePayrollRowCount);
        
        treeScrollPaneDBAdmin.setViewportView(jTreeDBAdmin);
        
    }
    
    public void createTreeGraphicals() {
        
        isCustomQuery = false;
        
        treeScrollPaneGraphicals = new javax.swing.JScrollPane();
        
        com.afrisoftech.dbadmin.DbSchemaTreeModel dbSchemaModel = new com.afrisoftech.dbadmin.DbSchemaTreeModel();
        
        final javax.swing.JTree jTreeGraphicals = dbSchemaModel.createDBSchemaModel(connectDB, topGraphicals); //        topDBAdmin = new javax.swing.tree.DefaultMutableTreeNode("Hospital Payroll");
        
        //        int treePayrollRowCount = parseMenuBar.parseHospitalMenus(payrollMain.getJMenuBar(), toPayroll, topReports, "Payroll Reports", "Payroll Utilities");
        
        //        jTreePayroll = new javax.swing.JTree(toPayroll);
        
        //jTreePayroll.setBackground(java.awt.Color.gray);
        
        //        javax.swing.tree.DefaultTreeCellRenderer rendererDBAdmin = new javax.swing.tree.DefaultTreeCellRenderer();
        
        //        rendererPayroll.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/BD21337_.GIF")));
        
        //        jTreeDBAdmin.getCellRenderer().setTextSelectionColor(java.awt.Color.blue);
        
        //        rendererPayroll.setOpaque(true);
        
        //        jTreePayroll.setCellRenderer(rendererPayroll);
        
        jTreeGraphicals.getSelectionModel().setSelectionMode(javax.swing.tree.TreeSelectionModel.SINGLE_TREE_SELECTION);
        
        //Listen for when the selection changes.
        jTreeGraphicals.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            
            public void valueChanged(javax.swing.event.TreeSelectionEvent e) {
                
                javax.swing.tree.DefaultMutableTreeNode node = (javax.swing.tree.DefaultMutableTreeNode)
                
                jTreeGraphicals.getLastSelectedPathComponent();
                
                if (node == null) return;
                
                Object nodeInfo = node.getUserObject();
                
                if (node.isLeaf()) {
                    
                    selectedTable = nodeInfo.toString();
                    
                    if (graphicalView.isShowing()) {
                        
                        
                        tableColumnsVector = getTableColumns(selectedTable);
                        
                        xaxisComboBox.setModel(new javax.swing.DefaultComboBoxModel(tableColumnsVector));
                        
                        
                        graphViewDialog.setSize(500,400);
                        
                        graphViewDialog.setLocation((((getSize().width)/2) - (500/2)), (((getSize().height)/2) - (400/2)));
                        
                        graphViewDialog.setVisible(true);
                        
                        
                        graphicalView.showChart(queryString, selectedTable, getSelf());
                        
                        
                        graphicalView.setSize(saccopn.getSize());
                        
                        graphicalView.setVisible(true);
                        
                    } else {
                        
                        saccopn.add(graphicalView, javax.swing.JLayeredPane.DEFAULT_LAYER);
                        
                        selectedTable = nodeInfo.toString();
                        
                        
                        tableColumnsVector = getTableColumns(selectedTable);
                        
                        xaxisComboBox.setModel(new javax.swing.DefaultComboBoxModel(tableColumnsVector));
                        
                        
                        try {
                            
                            graphViewDialog.setSize(500,400);
                            
                            graphViewDialog.setLocation((((getSize().width)/2) - (500/2)), (((getSize().height)/2) - (400/2)));
                            
                            graphViewDialog.setVisible(true);
                            
                            graphicalView.showChart(queryString, selectedTable, getSelf());
                            
                            graphicalView.setSize(saccopn.getSize());
                            
                            graphicalView.setSelected(true);
                            
                            graphicalView.setVisible(true);
                            
                        } catch(java.beans.PropertyVetoException pvt){}
                        
                        
                    }
                    
                    //                    com.afrisoftech.lib.ParseMenuBar parserMenuBar = new com.afrisoftech.lib.ParseMenuBar();
                    
                    // parseMenuBar.getTargetMenuItem(payrollMain.getJMenuBar().getSubElements(), nodeInfo.toString());
                    
                    // javax.swing.JMenuItem targetMenuItem = (javax.swing.JMenuItem)targetItem;
                    
                    //                    System.out.println();
                    
                    //                    System.out.println(targetMenuItem);
                    
                    //                    targetMenuItem.setEnabled(false);
                    //                    callMenuItemFromTree(nodeInfo.toString(), "com.afrisoftech.hospayroll.PayrollMain");
                    
                    //                    invokePayrollTreeActionPlan(nodeInfo.toString());
                    
                } else {
                    // displayURL(helpURL);
                }
            }
        });
        
        //   parseMenuBar.expandCustomTree(jTreeDBAdmin, treePayrollRowCount);
        
        treeScrollPaneGraphicals.setViewportView(jTreeGraphicals);
        
    }
    
    
    public void createOperationsPopupMenu() {
        
        parseMenuBar.parseHospitalPopupMenus(getJMenuBar(), operationsPopupMenu, reportsPopupMenu, "Operations Reports", "Operations Utilities", operationsPopupButtonGroup, reportsPopupButtonGroup);
        
    }
    
    public void createInventoryPopupMenu() {
        
        parseMenuBar.parseHospitalPopupMenus(stockMain.getJMenuBar(), inventoryPopupMenu, reportsPopupMenu, "Pharmacy & Inventory Reports", "Inventory Utilities", inventoryPopupButtonGroup, null);
        
    }
    
    public void createPayrollPopupMenu() {
        
//        parseMenuBar.parseHospitalPopupMenus(payrollMain.getJMenuBar(), payrollPopupMenu, reportsPopupMenu, "HR & Payroll Reports", "HR & Payroll Utilities", payrollPopupButtonGroup, null);
        
    }
    
    public void createHRMPopupMenu() {
        
    //    parseMenuBar.parseHospitalPopupMenus(hrMain.getJMenuBar(), hrmPopupMenu, reportsPopupMenu, "HRM Reports", "HRM Utilities", hrPopupButtonGroup, null);
        
    }
    
     public void createSaccoPopupMenu() {
        
        parseMenuBar.parseHospitalPopupMenus(saccoMain.getJMenuBar(), saccoPopupMenu, reportsPopupMenu, "Sacco Reports", "Sacco Utilities", saccoPopupButtonGroup, null);
        
    }   
    
    public void createStockMenuBar() {
        
        parseMenuBar.parseHospitalMenuBars(stockMain.getJMenuBar(), null, null, inventoryMenuBar, reportsMenuBar, "Pharmacy & Inventory Reports", "Inventory Utilities", null, null);
        
        
    }
    
    public void createPayrollMenuBar() {
        
//        parseMenuBar.parseHospitalMenuBars(payrollMain.getJMenuBar(), null, null, payrollMenuBar, reportsMenuBar, "HR & Payroll Reports", "Payroll Utilities", null, null);
        
    }
    
    public void createHRMenuBar() {
        
  //      parseMenuBar.parseHospitalMenuBars(hrMain.getJMenuBar(), null, null, hrMenuBar, reportsMenuBar, "HRM Reports", "HRM Utilities", null, null);
        
    }
    
    public void createSaccoMenuBar() {
        
        parseMenuBar.parseHospitalMenuBars(saccoMain.getJMenuBar(), null, null, saccoMenuBar, reportsMenuBar, "Sacco Reports", "Sacco Utilities", null, null);
        
    }
         
        
    public void createSystemMenus() {
        
        
        parseMenuBar.parseHospitalMenuBars(getJMenuBar(), payrollMenuBar, null, null, null, "Operations Reports", "System Utilities", payrollMenuBarButtonGroup, null);
        
        parseMenuBar.parseHospitalMenuBars(getJMenuBar(), null, inventoryMenuBar, null, null, "Operations Reports", "System Utilities", inventoryMenuBarButtonGroup,  null);
        
        //        parseMenuBar.parseHospitalMenuBars(getJMenuBar(), payrollMenuBar, inventoryMenuBar, null, reportsMenuBar, "Operations Reports", "System Utilities");
        
        parseMenuBar.parseHospitalMenuBars(getJMenuBar(), null, null, null, reportsMenuBar, "Operations Reports", "System Utilities", operationsMenuBarButtonGroup,reportsMenuBarButtonGroup);
        
        updateNewComponentsUI();
        
    }
    
    public void updateNewComponentsUI(){
        
        this.saccopn.setOpaque(false);
        
        repaint();
        
        javax.swing.SwingUtilities.updateComponentTreeUI(jMenuBar1);
        
        javax.swing.SwingUtilities.updateComponentTreeUI(graphViewDialog);
        
        //        jMenuBar1.setBorder(new javax.swing.border.TitledBorder(null, "Operations Menu Bar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier", 2, 10), new java.awt.Color(0, 0, 153)));
        
        //        jMenuBar1.setFont(new java.awt.Font("Serif", 0, 12));
        
        javax.swing.SwingUtilities.updateComponentTreeUI(reportsMenuBar);
        
        //        reportsMenuBar.setBorder(new javax.swing.border.TitledBorder(null, "Reports Menu Bar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier", 2, 10), new java.awt.Color(0, 0, 153)));
        
        reportsMenuBar.setFont(new java.awt.Font("Serif", 0, 12));
        
        javax.swing.SwingUtilities.updateComponentTreeUI(payrollMenuBar);
        
        //  payrollMenuBar.setBorder(new javax.swing.border.TitledBorder(null, "HR & Payroll Menu Bar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier", 2, 10), new java.awt.Color(0, 0, 153)));
        
        payrollMenuBar.setFont(new java.awt.Font("Serif", 0, 12));
        
        javax.swing.SwingUtilities.updateComponentTreeUI(inventoryMenuBar);
        
        //  inventoryMenuBar.setBorder(new javax.swing.border.TitledBorder(null, "Pharmacy & Inventory Menu Bar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier", 2, 10), new java.awt.Color(0, 0, 153)));
        
        inventoryMenuBar.setFont(new java.awt.Font("Serif", 0, 12));
        
        javax.swing.SwingUtilities.updateComponentTreeUI(reportsPopupMenu);
        
        javax.swing.SwingUtilities.updateComponentTreeUI(inventoryPopupMenu);
        
        //        javax.swing.SwingUtilities.updateComponentTreeUI(jMenuBar1);
        
        javax.swing.SwingUtilities.updateComponentTreeUI(payrollPopupMenu);
        
        javax.swing.SwingUtilities.updateComponentTreeUI(operationsPopupMenu);
        
    }
    
 /*   public java.awt.Component getDefaultSplitPane(java.lang.String defaultSplitPaneName) {
  
        java.awt.Component targetSplitPaneComponent = null;
  
        java.awt.Component[] splitPaneComponents = this.jTabbedPane1.getComponents();
  
        for (int i = 0; i < splitPaneComponents.length; i++) {
  
            if (splitPaneComponents[i].getName().equals(defaultSplitPaneName)) {
  
                targetSplitPaneComponent = splitPaneComponents[i];
  
            }
  
        }
  
        return targetSplitPaneComponent;
  
    }
  */
    class ConnectionStatus extends java.lang.Thread {
        
        boolean runningStatus = true;
        
        java.sql.Statement stmtConnectionStatus;
        
        public ConnectionStatus(java.awt.Component parent) {
            
            try {
                
                System.out.println(connectDB);
                
                stmtConnectionStatus = connectDB.createStatement();
                
                
            } catch (java.sql.SQLException sqlExec) {
                
                javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), "Connection not established.");
                
            }
            
        }
        
        public void run() {
            
            while (runningStatus) {
                
                try {
                    
                    stmtConnectionStatus.executeQuery("SELECT * FROM connection_status");
                    
                    //                    connectDB.getMetaData();
                    
                    System.out.println("Database Connection still on");
                    
                    try {
                        
                        java.lang.Thread.sleep(5000);
                        
                    } catch (java.lang.InterruptedException intExec) {
                        
                        javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(), "Interruption Exception!");
                    }
                    
                    
                } catch (java.sql.SQLException sqlExec) {
                    
                    connectionLabel.setText("DB Connection Status : [DISCONNECTED]");
                    
                    runningStatus = false;
                    
                    javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), "Connection to database lost. Contact Database or System Administrator.");
                }
                
            }
            
        }
        
    }
    
    
    private void populateColumnSelectorTable() {
        
        columnSelectorTable.setModel(new javax.swing.table.DefaultTableModel(
        
/*        new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            }*/
        createTableData(),
        
        new String [] {
            "Column Name", "Include"
        }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
    }
    
    public java.util.Vector getTableColumns(java.lang.String tableName) {
        
        tableColumnsVector = new java.util.Vector(1,1);
        
        try {
            
            java.sql.PreparedStatement pstmtColumns = connectDB.prepareStatement("select * from "+ tableName);
            
            pstmtColumns.executeQuery();
            
            java.sql.ResultSetMetaData rsetMetadata = pstmtColumns.getMetaData();
            
            columnCount = rsetMetadata.getColumnCount();
            
            for (int i = 0; i < rsetMetadata.getColumnCount(); i++) {
                
                tableColumnsVector.addElement(rsetMetadata.getColumnName(i + 1));
                
            }
            
        } catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), sqlExec.getMessage());
            
        }
        
        return tableColumnsVector;
        
    }
    
    public java.util.Vector getTableColumnsFromQuery(java.lang.String queryStr) {
        
        tableColumnsVector = new java.util.Vector(1,1);
        
        try {
            
            java.sql.PreparedStatement pstmtColumns = connectDB.prepareStatement(queryStr);
            
            pstmtColumns.executeQuery();
            
            java.sql.ResultSetMetaData rsetMetadata = pstmtColumns.getMetaData();
            
            columnCount = rsetMetadata.getColumnCount();
            
            for (int i = 0; i < rsetMetadata.getColumnCount(); i++) {
                
                tableColumnsVector.addElement(rsetMetadata.getColumnName(i + 1));
                
            }
            
        } catch (java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), sqlExec.getMessage());
            
        }
        
        return tableColumnsVector;
        
    }
    
    public java.lang.Object[][] createTableData() {
        
        tableData = new java.lang.Object[columnCount][2];
        
        for (int i = 0; i < columnCount; i++) {
            
            if ((tableColumnsVector.get(i).toString() != xaxisComboBox.getSelectedItem().toString()) && !tableColumnsVector.get(i).toString().startsWith("date") && !tableColumnsVector.get(i).toString().endsWith("date")) {
                
                tableData[i][0] = tableColumnsVector.get(i);
                
                tableData[i][1] = null;
                
            }
            
        }
        
        return tableData;
        
    }
    
    public void submitQueryString() {
        
        
        
        System.out.println("Selected table ["+selectedTable+"]");
        
        java.util.Vector qStringVector = new java.util.Vector(1,1);
        
        queryString = "";
        
        String columnValues = "";
        
        int valueCount = 0;
        
        for (int n = 0; n < columnSelectorTable.getRowCount(); n++) {
            
            if ((columnSelectorTable.getValueAt(n,0).toString() != null) && (columnSelectorTable.getValueAt(n, 1) == Boolean.valueOf(true))) {
                
                qStringVector.addElement(columnSelectorTable.getValueAt(n, 0));
                
                //columnValues = columnSelectorTable.getValueAt(n, 0).toString()+" ,";
                
            }
            
        }
        
        java.lang.Object[] queryObjects = qStringVector.toArray();
        
        for (int n = 0; n < queryObjects.length; n++) {
            
            if ( n < (queryObjects.length -1)) {
                
                columnValues = columnValues + queryObjects[n].toString()+", ";
                
            } else {
                
                columnValues = columnValues + queryObjects[n];
                
            }
            
        }
        
        queryString = "SELECT "+xaxisComboBox.getSelectedItem().toString()+", "+columnValues+" FROM "+selectedTable;
        
        System.out.println("Query String "+queryString);
        
        if (isCustomQuery) {
            
            showCustomChart();
            
        }
        
    }
    
    public com.afrisoftech.hospital.HospitalMain getSelf() {
        
        return this;
        
    }
    
    public void setSelectedTable(java.lang.String selectedTableString) {
        
        selectedTable = selectedTableString;
        
    }
    
    public void showCustomChart() {
        
        graphicalView.showChart(queryString, selectedTable, getSelf());
        
        //        graphicalView.setSize(saccopnGraphicals.getSize());
        
        //        graphicalView.setSelected(true);
        
        graphicalView.setVisible(true);
    }
    
    
    
    public com.l2fprod.common.swing.JOutlookBar createOutLookBar(){
         
        createTreeDBAdmin();
        
         createTreeGraphicals();
        
        jOutLookBar = new com.l2fprod.common.swing.JOutlookBar();
        
        javax.swing.JScrollPane operationsTaskScrollPane = new javax.swing.JScrollPane();
        
        operationsTaskScrollPane.setViewportView(operationsTaskPane);
        
        operationsTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                operationsTaskPaneComponentShown(evt);
            }
        });
        
        
        //   operationsTaskScrollPane.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 9));
        jOutLookBar.setAlignmentX(jOutLookBar.LEFT_ALIGNMENT);
//        jOutLookBar.addTab("Hospital Operations", operationsTaskScrollPane);
        jOutLookBar.setAnimated(true);
//        jOutLookBar.setIconAt(getDefaultPaneByName("Hospital Operations"),new javax.swing.ImageIcon(getClass().getResource("/openfold.gif")));
        
        javax.swing.JScrollPane accountsTaskScrollPane = new javax.swing.JScrollPane();
        
        accountsTaskScrollPane.setViewportView(acctsMainTaskPane);
        
        accountsTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                accountsTaskPaneComponentShown(evt);
            }
        });
        
        
  //      jOutLookBar.addTab("Accounts & Financials", accountsTaskScrollPane);
        
        javax.swing.JScrollPane stockTaskScrollPane = new javax.swing.JScrollPane();
        
        stockTaskScrollPane.setViewportView(stockTaskPane);
        
        stockTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                stockTaskPaneComponentShown(evt);
            }
        });

   //      jOutLookBar.addTab("Stock & Inventory",stockTaskScrollPane);
        
        javax.swing.JScrollPane hrTaskScrollPane = new javax.swing.JScrollPane();
        
        hrTaskScrollPane.setViewportView(hrmTaskPane);
        
        hrTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                hrTaskPaneComponentShown(evt);
            }
        });
        
 //       jOutLookBar.addTab("HR Management",hrTaskScrollPane);
        
        
        javax.swing.JScrollPane payrollTaskScrollPane = new javax.swing.JScrollPane();
        payrollTaskScrollPane.setViewportView(payrollTaskPane);        
        payrollTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                payrollTaskPaneComponentShown(evt);
            }
        });
        
        
  //      jOutLookBar.addTab("Payroll",payrollTaskScrollPane);
        
        
        javax.swing.JScrollPane saccoTaskScrollPane = new javax.swing.JScrollPane();
         saccoTaskScrollPane.setViewportView(saccoTaskPane);
        saccoTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                saccoTaskPaneComponentShown(evt);
            }
        });  
        
          jOutLookBar.addTab("Sacco Manager",saccoTaskScrollPane);      

          /*
        payrollTaskScrollPane.setViewportView(payrollTaskPane);
     
     
        //        jOutLookBar.addTab("Maintenance & Utilities", new javax.swing.JButton());
     
     
        javax.swing.JScrollPane reportTaskScrollPane = new javax.swing.JScrollPane();
     
        reportTaskScrollPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                reportTaskPaneComponentShown(evt);
            }
        });
     
        reportTaskScrollPane.setViewportView(reportTaskPane);
     
        jOutLookBar.addTab("Reports & Utilities", reportTaskScrollPane);
     */
        //  jOutLookBar.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 9));
    //javax.swing.JScrollPane treeScrollPaneDBAdmin;
    
    //javax.swing.JScrollPane treeScrollPaneGraphicals;
    
        jOutLookBar.addTab("Database Analysis", treeScrollPaneDBAdmin);
        
        jOutLookBar.addTab("Graphical Statistics", treeScrollPaneGraphicals);
                
        jOutLookBar.setSelectedIndex(getDefaultPaneByName());
        
        return jOutLookBar;
        
    }
    private void  operationsTaskPaneComponentShown(java.awt.event.ComponentEvent evt) {
        
        this.setTitle(getCompanyName());
        
        this.invalidate();
        
        setJMenuBar(jMenuBar1);
        
        this.validate();
        
        this.saccopn = saccopn;
        
        rememberDefaultPane();
        
        System.out.println("Component changes registered");
        // Add your handling code here:
    }
    private void  accountsTaskPaneComponentShown(java.awt.event.ComponentEvent evt) {
        
        this.setTitle(getCompanyName());
        
        this.invalidate();
        
        setJMenuBar(jMenuBar1);
        
        this.validate();
        
        this.saccopn = saccopn;
        
        rememberDefaultPane();
        
        System.out.println("Component changes registered");
        // Add your handling code here:
    }
    private void  stockTaskPaneComponentShown(java.awt.event.ComponentEvent evt) {
        
        this.setTitle(getCompanyName());
        
        this.invalidate();
        
        setJMenuBar(stockMain.getJMenuBar());
        
        this.validate();
        
        stockMain.medicdspane = saccopn;
        
        System.out.println("Component changes registered");
        
        rememberDefaultPane();
        
        // Add your handling code here:
    }
    private void  payrollTaskPaneComponentShown(java.awt.event.ComponentEvent evt) {
        //  if (allowed2Access()){
        this.setTitle(getCompanyName());
        
        this.invalidate();
        
        setJMenuBar(payrollMain.getJMenuBar());
        
        this.validate();
        
        payrollMain.payrollpn = saccopn;
        
        System.out.println("Component changes registered");
        
        rememberDefaultPane();
      /*
        } else {
       
                 jOutLookBar.setSelectedIndex(getDefaultPaneByName());
       
        }*/
        // Add your handling code here:
    }
     private void  hrTaskPaneComponentShown(java.awt.event.ComponentEvent evt) {
        //  if (allowed2Access()){
        this.setTitle(getCompanyName());
        
        this.invalidate();
        
        setJMenuBar(hrMain.getJMenuBar());
        
        this.validate();
        
        hrMain.hrDesktopPane = saccopn;
        
        System.out.println("Component changes registered");
        
        rememberDefaultPane();
      /*
        } else {
       
                 jOutLookBar.setSelectedIndex(getDefaultPaneByName());
       
        }*/
        // Add your handling code here:
    }  
     
     private void  saccoTaskPaneComponentShown(java.awt.event.ComponentEvent evt) {
        //  if (allowed2Access()){
        this.setTitle(getCompanyName());
        
        this.invalidate();
        
        setJMenuBar(saccoMain.getJMenuBar());
        
        this.validate();
        
        saccoMain.saccopn = saccopn;
        
        System.out.println("Component changes registered");
        
        rememberDefaultPane();
      /*
        } else {
       
                 jOutLookBar.setSelectedIndex(getDefaultPaneByName());
       
        }*/
        // Add your handling code here:
    }
     
    private void  reportTaskPaneComponentShown(java.awt.event.ComponentEvent evt) {
        
        this.setTitle(getCompanyName());
        
        this.invalidate();
        
        setJMenuBar(reportsMenuBar);
        
        this.validate();
        
        this.saccopn = saccopn;
        
        System.out.println("Component changes registered");
        
        rememberDefaultPane();
        // Add your handling code here:
    }
    
    public void createTaskPanes(){
        
        parseMenuBar = new com.afrisoftech.lib.ParseMenuBar();
        
        parseMenuBar1 = new com.afrisoftech.lib.ParseMenuBar1();
        System.out.println(acctsMainTaskPane.toString());
        operationsTaskPane1 = new com.l2fprod.common.swing.JTaskPane();
        
        // javax.swing.JMenu
//        parseMenuBar1.createJTaskBarFromMenuBar(this.getJMenuBar(), this.getJMenuBar().getSubElements(), operationsTaskPane1, acctsMainTaskPane, "Accounts & Financials", "Operations & Utilities", operationsPopupButtonGroup, reportsPopupButtonGroup);
//        parseMenuBar1.createJTaskBarFromMenuBar(this.getJMenuBar(), this.getJMenuBar().getSubElements(), operationsTaskPane, reportTaskPane, "Operations Reports", "Operations & Utilities", operationsPopupButtonGroup, reportsPopupButtonGroup);
//        parseMenuBar1.createJTaskBarFromMenuBar(stockMain.getJMenuBar(), stockMain.getJMenuBar().getSubElements(), stockTaskPane, reportTaskPane, "Stock Reports", "Stock & Utilities", operationsPopupButtonGroup, reportsPopupButtonGroup);
//        parseMenuBar1.createJTaskBarFromMenuBar(payrollMain.getJMenuBar(), payrollMain.getJMenuBar().getSubElements(), payrollTaskPane, reportTaskPane, "Payroll Reports", "Payroll & Utilities", operationsPopupButtonGroup, reportsPopupButtonGroup);
//        parseMenuBar1.createJTaskBarFromMenuBar(hrMain.getJMenuBar(), hrMain.getJMenuBar().getSubElements(), hrmTaskPane, reportTaskPane, "HRM Reports", "HRM Utilities", operationsPopupButtonGroup, reportsPopupButtonGroup);
        parseMenuBar1.createJTaskBarFromMenuBar(saccoMain.getJMenuBar(), saccoMain.getJMenuBar().getSubElements(), saccoTaskPane, reportTaskPane, "Sacco Reports", "Sacco Utilities", saccoPopupButtonGroup, reportsPopupButtonGroup);
        
        //        parseMenuBar1.
        java.awt.GridBagConstraints gridBagConstraints;
        treePane.setLayout(new java.awt.GridBagLayout());
        
        treePane.setBorder(new javax.swing.border.EtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        treePane.add(createOutLookBar(), gridBagConstraints);
        
        
        
    }
    
    public void rememberDefaultPane(){
        
        appProp.setProperty("defaultsplitpane",jOutLookBar.getTitleAt(jOutLookBar.getSelectedIndex()));
        
        storePreferences();
        
    }
    
    public int getDefaultPaneByName(){
        System.out.println("default split pane ["+System.getProperty("defaultsplitpane")+"]");
        String searchString = System.getProperty("defaultsplitpane");
        int index = 0;
        for (int i = 0; i < jOutLookBar.getTabCount(); i++){
            
            
            
            if(jOutLookBar.getTitleAt(i).equalsIgnoreCase(searchString)){
                index = i;
                //   break;
            }
            
        }
        
        return index;
    }
    
    public int getDefaultPaneByName(java.lang.String searchString){
        System.out.println("default split pane ["+System.getProperty("defaultsplitpane")+"]");
        //  String searchString = System.getProperty("defaultsplitpane");
        int index = 0;
        for (int i = 0; i < jOutLookBar.getTabCount(); i++){
            
            
            
            if(jOutLookBar.getTitleAt(i).equalsIgnoreCase(searchString)){
                index = i;
                //   break;
            }
            
        }
        
        return index;
    }
    
    private boolean allowed2Access(){
        
        String password2Access = javax.swing.JOptionPane.showInputDialog(this,"Please type in access code");
        
        return(password2Access.toString().equalsIgnoreCase(getAccessCode()));
        
    }
    
    private String getAccessCode(){
        
        java.lang.String access_code = null;
        
        try{
            
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("select accessobject from defined_contribution");
            
            java.sql.ResultSet rset = pstmt.executeQuery();
            while (rset.next()){
                access_code = rset.getObject(1).toString();
            }
        } catch(java.sql.SQLException sqlExec) {
            
            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());
            
        }
        
        return access_code;
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem stockmnit1;
    private javax.swing.JMenu countryditrmn;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel activeDatabase;
    private javax.swing.JMenuItem detvouchmnit;
    private javax.swing.JMenuItem patientaccmnit;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JMenuItem bkupmnit;
    private javax.swing.JMenuItem Schememnit;
    private javax.swing.JLabel activePane;
    private javax.swing.JMenuItem ConfirmedBookingsmnit;
    private javax.swing.JSeparator jSeparator77;
    private javax.swing.JMenuItem unfinalisedinvmnit1;
    private javax.swing.JMenuItem Salesmnit;
    private javax.swing.JMenuItem docsdirmnit;
    private javax.swing.JMenuItem nhifinvoicemnit;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JMenuItem shiftrepmnit;
    private javax.swing.JMenuItem paymentspercreditormnit;
    private javax.swing.JMenuItem Yearyrevmnit;
    private javax.swing.JMenu Taxesmn;
    private javax.swing.JButton openShift;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JMenuItem specimensmnit;
    private javax.swing.JLabel xaxisLabel;
    private javax.swing.JMenuItem labpendingmnit;
    private javax.swing.JMenuItem Summarymnit;
    private javax.swing.JMenuItem bankreccmnit;
    private javax.swing.ButtonGroup inventoryPopupButtonGroup;
    private javax.swing.JMenuItem suspendmnit;
    private javax.swing.JMenuItem userprofmnit1;
    private javax.swing.JSeparator jSeparator37;
    public javax.swing.JDialog graphViewDialog;
    private javax.swing.JMenuItem DebtStatementmnit;
    private javax.swing.JMenuItem transperaccmnit;
    private javax.swing.JMenuItem pativoicesmnit;
    private javax.swing.JMenuItem Perdebtormnit;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JSeparator jSeparator501;
    private javax.swing.JMenuItem patdischmnit;
    private javax.swing.JMenuItem Debtorscrnotemnit;
    private javax.swing.JButton suspendShift;
    private javax.swing.JButton helpButton;
    private javax.swing.JMenuItem wardproceduresmnit;
    private javax.swing.JMenuItem office2003mn;
    private javax.swing.JMenuItem invpersuppliermnit;
    private javax.swing.JMenuItem otherprmnit;
    private javax.swing.JMenuItem pettycashVouchmnit;
    private javax.swing.JMenu Voucherdetailsmn;
    private javax.swing.JButton mtmediaBttn1;
    private javax.swing.JMenuItem yearlyrotinemnit;
    private javax.swing.JMenu Bankrepmn;
    private javax.swing.JMenuItem pharmperformmnit;
    private javax.swing.JMenu budgetmn;
    private javax.swing.JMenuItem patstmtsummnit;
    private javax.swing.JMenuItem Provisionssummnit;
    private javax.swing.JMenuItem revpricelistmnit;
    private javax.swing.JMenuItem payvouchermnit;
    private javax.swing.JMenuItem Opcreditmnit;
    private javax.swing.JMenuItem deathsmnit;
    private javax.swing.JMenuItem TheatreChargesmnit;
    private javax.swing.JSeparator jSeparator79;
    private javax.swing.JMenuItem transbyaccmnit;
    private javax.swing.JRadioButton pieChart;
    private javax.swing.JSeparator jSeparator87;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem paidupbyscmnit;
    private javax.swing.JMenuItem schmsdebtCollmnit;
    private javax.swing.JMenuBar reportsMenuBar;
    private javax.swing.JMenuItem schemeregmnit;
    private javax.swing.JMenuItem Operatingparamertersmnit;
    private javax.swing.JMenu CashierRepmn;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JMenuItem restoredatamnit;
    private javax.swing.JMenuItem nursesmnit;
    private javax.swing.JMenu creditorsmn;
    private javax.swing.JButton cancelQuery;
    private javax.swing.JMenu Financialmn;
    private javax.swing.JMenuItem changeiplimitmnit;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JMenuItem storesrevmnit;
    private javax.swing.JMenu Statementsmn;
    private javax.swing.JMenuBar payrollMenuBar;
    private javax.swing.JMenuItem nhifcredits;
    private javax.swing.JMenu lnfmn;
    private javax.swing.JMenu ageingmn;
    private javax.swing.JButton closeShift;
    public javax.swing.JComboBox xaxisComboBox;
    private javax.swing.JMenuItem partlyallocinvmnit;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem cpactdatamnit;
    private javax.swing.JSeparator jSeparator85;
    private javax.swing.JMenuItem otherrecptmnit;
    private javax.swing.JMenuItem acctdetmnit;
    private javax.swing.JLabel connectionLabel;
    private javax.swing.JMenu cashbkmn;
    private javax.swing.JMenuItem attdperscmdetmnit;
    private javax.swing.JButton help;
    private javax.swing.JMenuItem billadjustmentmnit;
    private javax.swing.JMenuItem assetmgtmnit1;
    private java.awt.GridBagLayout gridBagLayout1;
    private javax.swing.JMenuItem allocatewtocrtmnit;
    private javax.swing.JMenuItem headermnit;
    private javax.swing.JMenuItem raisevouchmnit;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JMenuItem mergschaccmnit;
    private javax.swing.JButton mtmediaBttn;
    private javax.swing.JRadioButtonMenuItem macos1mnit1;
    private javax.swing.JMenuItem debtrectallocmnit;
    private javax.swing.JMenuItem scmperfrmnit;
    private javax.swing.ButtonGroup reportsPopupButtonGroup;
    private javax.swing.JMenuItem cashflowoptmnit;
    private javax.swing.JMenuItem scmstatusmnit;
    private javax.swing.JMenu systemn;
    private javax.swing.JMenuBar inventoryMenuBar;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JMenuItem Deprecmnit;
    private javax.swing.JMenuItem doctorledgermnit;
    private javax.swing.JMenu Wardsmn;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JMenuItem Finalinvoicetxt;
    private javax.swing.JMenuItem paymentsperdocmnit;
    private javax.swing.JMenuItem weeklyrevCompmnit;
    private javax.swing.JMenu Interiminvoicemn;
    private javax.swing.JMenuItem ageingbycatmnit;
    private javax.swing.JMenuItem bthregistermnit;
    private javax.swing.JButton mailBttn;
    private javax.swing.JMenuItem officexpmn;
    private javax.swing.JMenu managementmn;
    private javax.swing.JButton calcBttn;
    private javax.swing.JMenuItem payeepymtmnit;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator83;
    private javax.swing.JMenuItem Scmammnit;
    private javax.swing.JMenuItem doctorsstmtmnit;
    private javax.swing.JMenuItem deathregistermnit;
    private javax.swing.JMenuItem surgicaladjmnit;
    private javax.swing.JMenuItem miscsCreditorsmnit;
    private javax.swing.JPopupMenu hrmPopupMenu;
    private javax.swing.JMenuItem creditorsinvmnit;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JMenu profitlossmn;
    private javax.swing.JMenuItem changeBackgoundImagemnit1;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JMenu doctorsStamntmn;
    private javax.swing.JPanel desktopPane;
    private javax.swing.JMenuItem optimdbmnit;
    private javax.swing.JTable columnSelectorTable;
    private javax.swing.JDesktopPane saccopn;
    private javax.swing.JMenuItem finalisedinvmnit;
    private javax.swing.JMenuItem banksmnit;
    private javax.swing.JMenu returnedclms;
    private javax.swing.JMenuItem wardtfrmnit;
    private javax.swing.JMenuItem Writeoffsmnit;
    private javax.swing.JMenu reportsmn;
    private javax.swing.JMenuItem allreceiptsmnit;
    private javax.swing.JMenuItem Transsummnit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JMenuItem labsspecimensmnit;
    private javax.swing.JMenuItem glaccountsmnit;
    private javax.swing.JMenuItem adjustinvmnit;
    private javax.swing.JMenuItem docbalsummnit;
    private javax.swing.JMenu Receiptmn;
    private javax.swing.JMenuItem Creditorsmnit;
    private javax.swing.JMenuItem BedOccmnit;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JMenuItem iprevrptmnit;
    private javax.swing.JMenuItem monthlyroutinemnit;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JMenuItem paidupperdebtmnit;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JMenuItem oprevbyaccmnit;
    private javax.swing.JMenuItem stmtscmmnit;
    private javax.swing.JMenuItem transactionslsmnitmnit;
    private javax.swing.JMenuItem debtinvoicingmnit;
    private javax.swing.JMenuItem provperdebtmnit;
    private javax.swing.JMenuItem weeklyrevmnit;
    private javax.swing.JMenuItem rctdocfeesmnit;
    private javax.swing.JMenuItem deptincexpmnit;
    private javax.swing.JMenuItem bodycollectionmnit;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JMenuItem closedschemesmnit;
    private javax.swing.JMenuItem invammendmnit;
    private javax.swing.JButton backupDB;
    private javax.swing.JButton compactDB;
    private javax.swing.JMenuItem chartaccountsmnit;
    private javax.swing.JMenuItem Diagnosisanalysismnit;
    private javax.swing.JMenu shiftmn;
    private javax.swing.JSeparator jSeparator481;
    private javax.swing.JMenuItem nhifcreditsmnit;
    private javax.swing.JMenuItem trialbalancemnit;
    private javax.swing.JMenu labmn;
    private javax.swing.JMenu Trialbalancemn;
    private javax.swing.JMenuItem labresultsindmnit;
    private javax.swing.JButton optimizeDB;
    private javax.swing.JMenuItem reportPrefsmnit;
    private javax.swing.JMenuItem expiredaccmnit;
    private javax.swing.JMenuItem AmendCashbookmnit;
    private javax.swing.JMenu LegalDocumentmn;
    private javax.swing.JMenuItem inReceiptsmnit;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator81;
    private javax.swing.ButtonGroup operationsMenuBarButtonGroup;
    private javax.swing.JMenu patientCategorymn;
    private javax.swing.JMenuItem deathnotficationmnit;
    private javax.swing.JMenuItem creditnotesmnit;
    private javax.swing.JMenuItem bankrecdiscrpmnit;
    private javax.swing.JMenuItem totalinpatrecmnit;
    private javax.swing.JMenuItem autolimitsmnit;
    private javax.swing.JMenu schememn;
    private javax.swing.JMenuItem Annualtbmnit;
    private javax.swing.JMenuItem Lumpotherprmnit;
    private javax.swing.JMenu clinicsapp;
    private javax.swing.JMenuItem changepayermnit;
    private javax.swing.JMenuItem patperdeptmnit;
    private javax.swing.JMenuItem totalschemeinvlistmnit;
    private javax.swing.JMenuItem iplimitmnit;
    private javax.swing.JMenuItem assetrepmnit;
    private javax.swing.JMenu patientmanagemn;
    private javax.swing.JMenuItem countrymnit;
    private javax.swing.JMenuItem miscdebtorsmnit;
    private javax.swing.JButton payrollToolBar;
    private javax.swing.JMenuItem laborresultsmnit;
    private javax.swing.JMenuItem opbalmnit;
    private javax.swing.JSeparator jSeparator831;
    private javax.swing.JMenuItem AssetAlmnit;
    private javax.swing.JMenuItem statementofaccmnit;
    private javax.swing.JMenu profilemn;
    private javax.swing.JMenuItem wardprocmnit;
    private javax.swing.JMenuItem receiptscopymnit;
    private javax.swing.JMenuItem labprocmnit;
    private javax.swing.JMenuItem otherVouchermnit;
    private javax.swing.JMenuItem rtclaimsbyscmnit;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem Revmnit;
    private javax.swing.JMenuItem consultantspmnit;
    private javax.swing.JScrollPane columnSelectorScrollPane;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JMenuItem provdocscmnit;
    private javax.swing.ButtonGroup inventoryMenuBarButtonGroup;
    private javax.swing.JRadioButtonMenuItem beosmnit1;
    private javax.swing.JMenuItem sickoffsmnit;
    private javax.swing.JMenuItem Annualtbmnit1;
    private javax.swing.JMenuItem bookingschmnit;
    private javax.swing.JMenuItem distinvmnit;
    private javax.swing.JMenuItem chgpasswdmnit;
    private javax.swing.JMenuItem marketertnovermnit;
    private javax.swing.JMenuItem suspschememnit;
    private javax.swing.JMenuItem CorporateTaxmnit;
    private javax.swing.JToolBar jToolBar31;
    private javax.swing.JMenuItem changepaymodesmnit;
    private javax.swing.JMenuItem docearndeductmnit;
    private javax.swing.ButtonGroup payrollPopupButtonGroup;
    private javax.swing.JMenuItem schemesalesmnit;
    private javax.swing.JMenuItem chgintrmnit;
    private javax.swing.JLabel userLabel;
    private javax.swing.JMenuItem dispperdebtmnit;
    private javax.swing.JMenuItem refundsmnit;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JMenuItem accstatusmnit;
    private javax.swing.JMenuItem wrtsummnit;
    private javax.swing.JMenuItem confdispsummnit;
    private javax.swing.JMenuItem supplierinvmnit;
    private javax.swing.JMenuItem bookingsconfchmnit;
    private javax.swing.JMenuItem studio2k5mn;
    private javax.swing.JMenuItem assetlocmnit;
    private javax.swing.JToolBar jToolBar311;
    private javax.swing.JMenuItem pettycashpmtmnit;
    private javax.swing.JMenuItem Directinfomnit;
    private javax.swing.JMenuItem scmepfmmnit;
    private javax.swing.JMenu whtstamentsmn;
    private javax.swing.ButtonGroup operationsPopupButtonGroup;
    private javax.swing.JMenuItem Bedchargesmnit;
    private javax.swing.JMenuItem limitconsmnit;
    private javax.swing.JMenuItem provisionsperdebtormnit;
    private javax.swing.JMenuItem Paymentsmnit;
    private javax.swing.JMenuItem scmattendsummnit;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JMenuItem allocsummnit;
    private javax.swing.JMenuItem schemeprovmnit;
    private javax.swing.JMenuItem InPatInvCashmnit;
    private javax.swing.JMenuItem invpercrdmnit;
    private javax.swing.JMenuItem bookingschsmnit;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JMenuItem newbedmnit;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JMenuItem debtcollsummnit;
    private javax.swing.JRadioButtonMenuItem whiltmnit1;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JMenuItem receiptperpayermnit;
    private javax.swing.JMenuItem dischargesmnit;
    private javax.swing.ButtonGroup chartButtonGroup;
    private javax.swing.JMenuItem MonthlyDiagAnalysismnit;
    private javax.swing.JMenuItem labspecimensmnit;
    private javax.swing.JMenuItem paymentmodesmnit;
    private javax.swing.JMenuItem revenuemnit;
    private javax.swing.JMenuItem paymentssummnit;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JMenuItem DtlTrialBalancemnit1;
    private javax.swing.JMenuItem bedmangtmnit;
    private javax.swing.JMenuItem Yearlyhlpsetsmnit;
    private javax.swing.JMenuItem whtmnit;
    private javax.swing.JMenuItem interiminvmnit;
    private javax.swing.JMenuItem nhifrebatesmnit;
    private javax.swing.JMenuItem InpatientAnalysismnit;
    private javax.swing.JMenuItem wardoccstatisticsmnit;
    private javax.swing.JMenu clinicsbookings;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JMenuItem journalsmnit;
    private javax.swing.JMenuItem wardoccupancymnit;
    private javax.swing.JMenuItem loanstmtmnit;
    private javax.swing.JMenuItem billsummnit;
    private javax.swing.JMenuItem Unreconcitemsmnit;
    private javax.swing.JMenuItem SchemeAllocmnit;
    private javax.swing.JMenuItem merginvmnit;
    private javax.swing.JMenuItem docnursmnit;
    private javax.swing.JMenu invoicesmn;
    private javax.swing.JMenuItem Depreciationratesmnit;
    private javax.swing.JMenuItem docprovsummnit;
    private javax.swing.JMenuItem doctorslistmnit;
    private javax.swing.JMenuItem fahrmnit1;
    private javax.swing.JMenu retuenedclaims;
    private javax.swing.JMenuItem paidupsummmnit;
    private javax.swing.JMenuItem docunpaidinvmnit;
    private javax.swing.JMenu setupmn;
    private javax.swing.JMenuItem anualplmnit;
    private javax.swing.JMenuItem closeshiftmnit;
    private javax.swing.JMenu approvedinvmn;
    private javax.swing.JMenuItem labtestsresultmnit;
    private javax.swing.JMenuItem payerperfmmnit;
    private javax.swing.JMenuItem cancelledchqmnit;
    private javax.swing.JMenuItem taxreturnmnit;
    private javax.swing.JMenu SchemeInvoicinmn;
    private javax.swing.JMenu skinmn;
    private javax.swing.JSeparator jSeparator76;
    private javax.swing.JButton fmgrBttn;
    private javax.swing.JSeparator jSeparator89;
    private javax.swing.JMenuItem QuartelyRevCompmnit;
    private javax.swing.JMenuItem stockjournalsmnit;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JMenuItem schmdetmnit;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JMenuItem schememnit;
    private javax.swing.JMenu RevReportmd;
    private javax.swing.JMenuItem districtmnit;
    private javax.swing.JPopupMenu payrollPopupMenu;
    private javax.swing.JMenuItem diseasesmnit;
    private javax.swing.JMenuItem asrepmnit;
    private javax.swing.JMenuItem creditcardsmnit;
    private javax.swing.JMenuItem cashpointmnit;
    private javax.swing.JMenuItem approveinvmnit1;
    private javax.swing.JMenu finalinvmn;
    private javax.swing.JMenuItem ipdaysmnit;
    private javax.swing.JMenuItem accabtexpiremnit;
    private javax.swing.JMenuItem suppliersmnit;
    private javax.swing.JButton submitQuery;
    private javax.swing.JMenuItem IPCreditmnit;
    private javax.swing.JMenuItem Cashsalesmnit;
    private javax.swing.JSeparator jSeparator821;
    private javax.swing.JSeparator jSeparator68;
    private javax.swing.JMenuItem detailedpatstmtmnit;
    private javax.swing.JMenuItem closedocaccmnit;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator78;
    private javax.swing.JRadioButton xyChart;
    private javax.swing.JMenuItem printvouchermnit;
    private javax.swing.JMenuItem theatrediagmnit;
    private javax.swing.JMenuItem interimtxt;
    private javax.swing.JMenuItem departmentmnit;
    private javax.swing.JMenuItem aslocmnit;
    private javax.swing.JMenuItem debtorsStmtmnit;
    private javax.swing.JMenuItem loanageingmnit;
    private javax.swing.JMenuItem expensesmnit;
    private javax.swing.JButton reportsToolBar;
    private javax.swing.JMenuItem unrecitemsmnit;
    private javax.swing.JMenuItem dispatchperpayersummnit;
    private javax.swing.JMenuItem bankingsmnit;
    private javax.swing.JMenu laboratorymn;
    private javax.swing.JMenu Labmn;
    private javax.swing.JMenuItem debtormnit;
    private javax.swing.JMenuItem namesearchmnit;
    private javax.swing.JMenu SchemeDetailsmn;
    private javax.swing.JMenuItem deductionsmnit;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JRadioButtonMenuItem bbjmnit11;
    private javax.swing.JMenuItem crdtstmtmnit;
    private javax.swing.JMenuItem cbookbalancesmnit;
    private javax.swing.JMenuItem impdocregmnit;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JMenuItem invwithbalmnit;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JMenu dispatchschmn;
    private javax.swing.JMenuItem invoicemnit;
    private javax.swing.JMenuItem astregmnit;
    private javax.swing.JSeparator jSeparator74;
    private javax.swing.JMenuItem attsheetmnit;
    private javax.swing.JMenuItem shiftstotalmnit;
    private javax.swing.JMenuItem labtestsmnit;
    private javax.swing.JMenuItem revrepmnit;
    private javax.swing.JMenuItem printreceiptmnit;
    private javax.swing.JMenuItem allocationrepmnit;
    private javax.swing.JMenuItem lbalancesheetmnit;
    private javax.swing.JMenuItem mergdispmnit;
    private javax.swing.JMenuItem shiftrepDetmnit;
    private javax.swing.JMenuItem annualpayersummnit;
    private javax.swing.JMenuItem dailyrevmnit;
    private javax.swing.JMenuItem provperschmnit;
    private javax.swing.JSeparator jSeparator72;
    private javax.swing.JMenuItem creditsSummnit;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenuItem pettycashshiftsmnit;
    private javax.swing.JMenuItem lgalstatussetupmnit;
    private javax.swing.JMenu pettycashRepmn;
    private javax.swing.JMenuItem inpatreceiptadjmnit;
    private javax.swing.JMenuItem revperdepmnit;
    private javax.swing.JMenuItem insurancemnit;
    private javax.swing.JMenuItem validatamnit;
    private javax.swing.JSeparator jSeparator70;
    private javax.swing.JMenuItem generalmnit;
    private javax.swing.JMenuItem asstregmnit;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JMenuItem surgicalitemmnit;
    private javax.swing.JMenuItem bankreconcmnit;
    private javax.swing.JMenuItem budgetdeptmnit;
    private javax.swing.JMenuItem debreceiptsmnit;
    private javax.swing.JMenu ManagementReportmn;
    private javax.swing.JMenuItem patientregnummnit;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JMenuItem automatedwoffsmnit;
    private javax.swing.JRadioButtonMenuItem xpmnit1;
    private javax.swing.JMenuItem pnlmnit1;
    private javax.swing.JMenu utilitymn;
    private javax.swing.JMenu unapprovedinvmn;
    private javax.swing.JRadioButtonMenuItem modernmnit1;
    private javax.swing.JMenuItem wrtperscmnit;
    private javax.swing.JMenuItem Quarterrevmnit;
    private javax.swing.JPanel treePane;
    private javax.swing.JMenu claimsmn;
    private javax.swing.JMenuItem Outpatientinvoicetxt;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JPopupMenu saccoPopupMenu;
    private javax.swing.JMenu assetsmn;
    private javax.swing.JMenuItem exceedlimitsmnit;
    private javax.swing.JMenuBar saccoMenuBar;
    private javax.swing.JMenu provisionsmn;
    private javax.swing.JMenuItem labresultsmnit;
    private javax.swing.JMenu helpmn;
    private javax.swing.JMenu billadjmn;
    private javax.swing.JSeparator jSeparator511;
    private javax.swing.JMenuItem accountsmnit1;
    private javax.swing.JMenuItem journalmnit;
    private javax.swing.JMenuItem schemesmnit;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JRadioButton barChart;
    private javax.swing.JMenu detstmtmn;
    private javax.swing.JSplitPane mainSplitPane;
    private javax.swing.JMenuItem dailyissiuesmnit;
    private javax.swing.JMenuItem schemestaffmnit;
    private javax.swing.JMenuItem detdebtorsStmtmnit;
    private javax.swing.JMenuItem debtosbalmnit;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JMenuItem approvevouchmnit;
    private javax.swing.JMenuItem unfinalisedinvmnit;
    private javax.swing.ButtonGroup saccoPopupButtonGroup;
    private javax.swing.JMenuItem detailedstmtmnit1;
    private javax.swing.JMenuItem Corporatemnit;
    private javax.swing.JMenuItem unpaidDispInvmnit;
    private javax.swing.JMenuItem admissmnit;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JMenuItem writeofflimitsmnit;
    private javax.swing.JMenu departmentalmn;
    private javax.swing.JMenuItem patlabresultsmnit;
    private javax.swing.ButtonGroup payrollMenuBarButtonGroup;
    private javax.swing.JSeparator jSeparator841;
    private javax.swing.JMenuItem oprevbrkdwnmnit;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JMenuItem bedoccupancymnit;
    private javax.swing.JMenuItem detailedstmtmnit;
    private javax.swing.JMenu morturymn;
    private javax.swing.JMenuItem mbVerifymnit;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JMenuItem hosptalmnit;
    private javax.swing.JMenuItem unallocpymmnit;
    private javax.swing.JSeparator jSeparator86;
    private javax.swing.JMenuItem compdebtorsmnit;
    private javax.swing.JButton operationsToolBar;
    private javax.swing.JMenuItem Approvemnit;
    private javax.swing.JMenuItem dispconfperpayermnit;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JMenuItem patbedoccupancymnit;
    private javax.swing.JMenuItem xraymnit;
    private javax.swing.JMenuItem patstmtmnit;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem payerstaffamdmnit;
    private javax.swing.JMenuItem Bedtrnsfrmnit;
    private javax.swing.JMenuItem iprevbyaccmnit;
    private javax.swing.JMenu CashBookmn;
    private javax.swing.JMenu bedmagmentmn;
    private javax.swing.JMenu viewsmn;
    private javax.swing.JMenuItem labregmnit;
    private javax.swing.JMenuItem reportsmnit1;
    private javax.swing.JMenuItem CreditnoteSchmnit;
    private javax.swing.JMenuItem markupbelowmnit;
    private javax.swing.JSeparator jSeparator881;
    private javax.swing.JSeparator jSeparator84;
    private javax.swing.JMenuItem Detinvbyinvmnit;
    private javax.swing.JMenuItem pnlmnit;
    private javax.swing.JMenuItem bedsetupmnit;
    private javax.swing.JMenuItem payerageingmnit;
    private javax.swing.JMenu gledgermn;
    private javax.swing.JPanel xaxisColumnPanel;
    private javax.swing.JMenuItem adjpricesmnit;
    private javax.swing.JMenu medicalRecordsmn;
    private javax.swing.JMenuItem appdocinvmnit;
    private javax.swing.ButtonGroup reportsMenuBarButtonGroup;
    private javax.swing.JMenu staffmn;
    private javax.swing.JSeparator jSeparator82;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JMenuItem banksummnit;
    private javax.swing.JMenuItem dispatchmnit;
    private javax.swing.JMenuItem patientdepositsmnit;
    private javax.swing.JMenuItem anualPayeragmnit;
    private javax.swing.JMenuItem approvedagentsmnit;
    private javax.swing.JMenu inpatientmn;
    private javax.swing.JPopupMenu inventoryPopupMenu;
    private javax.swing.JMenuItem Perschememnit;
    private javax.swing.JMenuItem whtperdocmnit;
    private javax.swing.JMenuItem crdstmtmnit;
    private javax.swing.JMenuItem Deprecatesmnit;
    private javax.swing.JMenuItem payerdetStmtmnit;
    private javax.swing.JMenuItem pettycashpaymnit;
    private javax.swing.JMenuItem creditallocmnit;
    private javax.swing.JSeparator jSeparator491;
    private javax.swing.JMenuItem stmtperdebtmnit;
    private javax.swing.JMenuItem interimnoticemnit;
    private javax.swing.JMenuItem dispperscmnit;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JMenuItem Aiemnit;
    private javax.swing.JMenuItem finalinpatinvsummnit;
    private javax.swing.JMenu dispconf;
    private javax.swing.JMenuItem Dailyrevmnit;
    private javax.swing.JMenu Provisiontransmn;
    private javax.swing.JMenu allocationmn;
    private javax.swing.JMenuItem outstandingordersmnit;
    private javax.swing.JMenuItem vitalsignmnit;
    private javax.swing.JMenuItem displistmnit;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JMenuItem patcategmnit;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JMenuItem depatmnit;
    private javax.swing.JMenuItem admmssionntmnit;
    private javax.swing.JMenuItem AieRepmnit;
    private javax.swing.JMenuItem CashSalesbrdmnit;
    private javax.swing.JMenuItem scmallocsummnit;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JButton pharmacyToolBar;
    private javax.swing.JMenuItem MonthrevCompmnit;
    private javax.swing.JMenu outpatmn;
    private javax.swing.JMenuItem paymentperdocSummnit;
    private javax.swing.JMenuItem allocsummperdebtmnit;
    private javax.swing.JMenuItem doctorspaymentsmnit;
    private javax.swing.JMenu glreportsmn;
    private javax.swing.JMenuItem doctorsstatementmnit;
    private javax.swing.JMenuItem debtallocsumnit;
    private javax.swing.JMenuItem budgetamendmnit;
    private javax.swing.JMenuItem extactscmmnit;
    private javax.swing.JMenu Pregistermn;
    private javax.swing.JMenuItem bedbrekgsmnit;
    private javax.swing.JMenu theatremn;
    private javax.swing.JMenuItem inpatcashinvmnit;
    private javax.swing.JSeparator jSeparator80;
    private javax.swing.JMenuItem approveinvmnit;
    private javax.swing.JMenuItem resubmissionbyschmnit;
    private javax.swing.JMenuItem hlpcontmnit;
    private javax.swing.JMenuItem payeractaccmnit;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator67;
    private javax.swing.JPopupMenu reportsPopupMenu;
    private javax.swing.JMenuItem bankingmnit;
    private javax.swing.JMenuItem serviceAccptslipmnit;
    public static javax.swing.JCheckBoxMenuItem motiflnfmnit1;
    private javax.swing.JMenuItem refferalsmnit;
    private javax.swing.JMenuItem comfbankingmnit;
    private javax.swing.JMenu pettycashmn;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JMenuItem ordersmnit;
    private javax.swing.JMenuItem cashBookmnit;
    private javax.swing.JMenuBar hrMenuBar;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JMenu receiptsmn;
    private javax.swing.JMenuItem Attendancesummnit;
    private javax.swing.JMenuItem stmtsummperdebtmnit;
    private javax.swing.JMenuItem CrdVouchermnit;
    private javax.swing.JMenuItem patreceiptsmnit;
    private javax.swing.JMenuItem whtsummnit;
    private javax.swing.JMenu medicalrecordsmn;
    private javax.swing.JMenuItem paymentVouchermnit;
    private javax.swing.JMenuItem provisionsmnit;
    private javax.swing.JMenuItem Dispdelnotemnit;
    private javax.swing.JMenuItem submStmtmnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem laboratoryresultsmnit;
    private javax.swing.JMenuItem budgettotalmnit;
    private javax.swing.JMenuItem DispatchSummnit;
    private javax.swing.JMenuItem nhifdispmnit;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu allocation;
    private javax.swing.JMenuItem grtsuppliermnit1;
    private javax.swing.JMenuItem rtclaimsmnit;
    private javax.swing.JMenuItem stockbalancesmnit;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenuItem admissiomnit;
    private javax.swing.JMenuItem payerageingsummnit;
    private javax.swing.JMenuItem directcashsalesmnit;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JMenu writeoffs;
    private javax.swing.JMenuItem receiptPrefsmnit;
    private javax.swing.JCheckBoxMenuItem macmnit1;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JMenuItem docVouchermnit;
    private javax.swing.JMenu Operatingchamn;
    private javax.swing.JMenuItem timelogmnit;
    private javax.swing.JMenuItem Ammendstaffregmnit;
    private javax.swing.JMenuItem confdispperscmnit;
    private javax.swing.JMenuItem uncollectedshiftsmnit;
    private javax.swing.ButtonGroup hrPopupButtonGroup;
    private javax.swing.JMenu xpskinmn;
    private javax.swing.JMenuItem Monthrevmnit;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JMenuItem Cashanalysismnit;
    private javax.swing.JMenuItem Bookingsmnit;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JMenuItem DispConfSummnit;
    private javax.swing.JButton brwsrBttn;
    private javax.swing.JMenu wardsetupmn;
    private javax.swing.JMenuItem newbornsmnit;
    private javax.swing.JMenuItem setaccperiodmnit;
    public static javax.swing.JCheckBoxMenuItem winlnfmnit1;
    private javax.swing.JMenuItem docnotesmnit;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuItem paymntadjmnit;
    private javax.swing.JMenu patacctmn;
    private javax.swing.JMenu inpatmn;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JMenuItem invbyinvmnit;
    private javax.swing.JMenu wrt;
    private javax.swing.JMenu financeopermn;
    private javax.swing.JMenuItem docregistermnit;
    private javax.swing.JMenuItem chekinmnit;
    private javax.swing.JMenuItem schemeallmnit;
    private javax.swing.JMenuItem Writeoffscrtmnit;
    private javax.swing.JMenuItem InPatsInvTotalmnit1;
    private javax.swing.JMenuItem postdatedchqmnit;
    private javax.swing.JMenuItem pettycashreqmnit;
    private javax.swing.JMenu paymenmn;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JMenuItem annualageingmnit;
    private javax.swing.JMenuItem Loanregmnit;
    private javax.swing.JMenuItem insuncemnit;
    private javax.swing.JMenuItem resubmitclaimsmnit;
    private javax.swing.JRadioButtonMenuItem aquamnit1;
    private javax.swing.JMenuItem DispConfirmationmnit;
    private javax.swing.JMenuItem exitmnITb;
    private javax.swing.JMenuItem Depreciationmnit;
    private javax.swing.JMenuItem theatreprocmnit;
    private javax.swing.JMenu Salesmn;
    private javax.swing.JMenuItem sickleavemnit;
    private javax.swing.JMenu patienttransfrmn;
    private javax.swing.JMenuItem aboutmn;
    private javax.swing.JPopupMenu operationsPopupMenu;
    private javax.swing.JMenuItem doctstmtpaidinvmnit;
    private javax.swing.JMenuItem mortdischmnit;
    private javax.swing.JMenuItem oprevrptmnit;
    private javax.swing.JMenuItem admissbywardmnit;
    private javax.swing.JMenuItem AmendCreditmnit;
    private javax.swing.JMenuItem receiptsmnit;
    private javax.swing.JMenuItem Bankingmnit;
    private javax.swing.JMenuItem finalinpatinvmnit;
    private javax.swing.JMenuItem patientregstmnit;
    private javax.swing.JMenuItem accrualsmnit;
    private javax.swing.JMenuItem allocchqmnit;
    private javax.swing.JMenuItem allocsumnit;
    private javax.swing.JMenuItem pharmacymnit;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JMenuItem rtclaimssummnit;
    private javax.swing.JMenuItem debtorsyearlybalmnit;
    private javax.swing.JMenuItem Payerallocdetmnit;
    private javax.swing.JButton closeDialog;
    private javax.swing.JMenuItem patientdiagnosismnit;
    private javax.swing.JSeparator jSeparator88;
    private javax.swing.JMenuItem permitcollectormnit;
    private javax.swing.JMenu debtorsTransactionsmn;
    private javax.swing.JMenuItem Diagnosissummnit;
    private javax.swing.JMenuItem raisecashVouchmnit;
    private javax.swing.JMenuItem provperdocmnit;
    private javax.swing.JMenu listsmn;
    private javax.swing.JMenuItem Receiptsmnit;
    private javax.swing.JMenuItem budgetsectmint;
    private javax.swing.JPanel valuesAxisSelector;
    private javax.swing.JMenuItem jrnloansmnit;
    private javax.swing.JMenuItem docsmnit1;
    private javax.swing.ButtonGroup saccoMenuBarButtonGroup;
    private javax.swing.JMenuItem patientcollateralmnit;
    private javax.swing.JSeparator jSeparator73;
    private javax.swing.JMenuItem bnkchargesmnit;
    private javax.swing.JMenuItem intinvmnit;
    private javax.swing.JMenuItem updatedomainsmnit1;
    private javax.swing.JButton editButtn;
    private javax.swing.JMenuItem patientdiagmnit;
    private javax.swing.JMenu Doctorslistmn;
    private javax.swing.JMenuItem scmabtlimitmnit;
    private javax.swing.JMenuItem allocbypayermnit;
    private javax.swing.JMenuItem patdocstmtmnit;
    private javax.swing.JMenuItem patstmtsmnit;
    private javax.swing.JMenuItem dormaccmnit;
    private javax.swing.JMenuItem quotationmnit;
    private javax.swing.JSeparator jSeparator75;
    private javax.swing.JMenuItem creditsbypayermnit;
    private javax.swing.JMenu PatientRecordsmn;
    private javax.swing.JMenuItem payrollledgermnit;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem finalindetpatinvmnit;
    private javax.swing.JMenu loanstock;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JMenu doctorslistsrmtmn;
    private javax.swing.JMenuItem credittransfmnit;
    private javax.swing.JMenuItem AssetAllocmnit;
    private javax.swing.JMenuItem payertnovermnit;
    private javax.swing.JPanel taskBar;
    public static javax.swing.JCheckBoxMenuItem swinglnfmnit1;
    private javax.swing.JMenuItem ScmsalesSummnit;
    private javax.swing.JMenu managmn;
    private javax.swing.JMenuItem suspschemepovmnit;
    // End of variables declaration//GEN-END:variables
    
}
