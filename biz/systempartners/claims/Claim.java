/*
 * Claim.java
 *
 * Created on July 2, 2006, 10:53 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package biz.systempartners.claims;

import com.sun.star.lib.uno.environments.java.java_environment;
import java.io.IOException;

/**
 *
 * @author Charles W. Waweru <cwaweru@systempartners.biz>
 */
public class Claim implements java.lang.Runnable {
    
    /** Creates a new instance of Claim */
    public Claim() {
        
        threadExport2XML = new java.lang.Thread(this, "SerializeClaim2XML");
        
        readXMLClaimThread = new ReadXMLClaimFileThread();
        
    }
    /**
     * Setter method for the patient ID.
     */
    
    public void setPatientNumber(java.lang.String patientNumber){
        
        patientNo = patientNumber;
        
    }
    
    /**
     * Setter method for the name of the patient.
     */
    
    public void setPatientName(java.lang.String nameofPatient){
        
        patientName = nameofPatient;
        
    }
    /**
     * Setter method for the scheme member/beneficiary number/ID
     */
    
    public void setSchemeMemberNumber(java.lang.String schemeMemberNumber){
        
        schemeMemberNo = schemeMemberNumber;
        
    }
    /**
     * Setter method for the name of the scheme administrator.
     */
    
    public void setSchemeName(java.lang.String nameofScheme){
        
        schemeName = nameofScheme;
        
    }
    /**
     * Setter method for the scheme payer.
     */
    
    public void setSchemePayer(java.lang.String payerName){
        
        schemePayer = payerName;
        
    }
    /**
     * Setter method for the scheme account number/ID.
     */
    
    public void setAccountNumber(java.lang.String accountNumber){
        
        accountNo = accountNumber;
        
    }
    /**
     * Setter method for the claim invoice number
     */
    
    public void setInvoiceNumber(java.lang.String invoiceNumber){
        
        invoiceNo = invoiceNumber;
        
    }
    /**
     * Setter method for the health care provider.
     */
    
    public void setHealthCareProvider(java.lang.String hospitalName){
        
        healthcareProviderID = hospitalName;
        
    }
    
    /**
     * Setter method for the invoice table.
     */
    
    public void setInvoiceTable(javax.swing.JTable ivoiceItemsTable){
        
        //invoiceTable = ivoiceItemsTable;
        
    }
    /**
     * Getter method for the patient ID.
     */
    
    public java.lang.String getPatientNumber(){
        
        return patientNo;
        
    }
    /**
     * Getter method for the name of the patient.
     */
    
    
    public java.lang.String getPatientName(){
        
        return patientName;
        
    }
    /**
     * Getter method for the scheme member/beneficiary number.
     */
    
    public java.lang.String getSchemeMemberNumber(){
        
        return schemeMemberNo;
        
    }
    /**
     * Getter method for the scheme administrator name.
     */
    
    public java.lang.String getSchemeName(){
        
        return schemeName;
        
    }
    /**
     * Getter method for the scheme payer name.
     */
    
    public java.lang.String getSchemePayer(){
        
        return schemePayer;
        
    }
    /**
     * Getter method for the scheme account number.
     */
    
    public java.lang.String getAccountNumber(){
        
        return accountNo;
        
    }
    /**
     * Getter method for the claim invoice number.
     */
    
    public java.lang.String getInvoiceNumber(){
        
        return invoiceNo;
        
    }
    /**
     * Getter method for the health care provider.
     */
    
    public java.lang.String getHealthCareProvider(){
        
        return healthcareProviderID;
        
    }
    
    /**
     * Getter method for the invoice table.
     */
    
    public javax.swing.JTable getInvoiceTable(){
        
        return invoiceTable;
        
    }
    /**
     * Serializing the claim object to an XML file.
     */
    
    public void serializeClaim2XML(){
        
        this.createXMLDoc();
        
        //threadExport2XML.start();
        
    }
    
    public void readClaimFromXMLFile(){
        
        
        
    }
    
    public java.io.File getClaimFile2Send(){
        
        System.out.println("Claim file name >>>> : "+xmlDocFile);
        
        return xmlDocFile;
        
    }
    
    /**
     * Send claim to a Scheme or Payer.
     */
    
    public void sendClaimViaEmail(java.io.File xmlClaimFile, java.lang.String schemeMailAddress){
        
//        this.serializeClaim2XML();
        
        biz.systempartners.claims.SendClaim.sendClaim(xmlClaimFile, schemeMailAddress);
        
    }
    
    public void createXMLDoc() {}
     public void createXMLDoc(javax.swing.JTable invoicesTable) {    
        // java.io.File xmlDocFile =  null;
        
        org.w3c.dom.Document xmlDocument = null;
        
        System.out.println("Started XML claim serialization ...");
        
        System.getProperty("docsdir",System.getProperty("user.dir"));
        
        try {
            
            // xmlDocFile = java.io.File.createTempFile("CLAIM"+biz.systempartners.claims.DateLables.getDateLabel()+"_", ".xml", new java.io.File(System.getProperty("docsdir")));
            xmlDocFile = new java.io.File(System.getProperty("docsdir"),"HospitalClaimsFile.xml");//.createTempFile("HospitalClaimsFile", ".xml", new java.io.File(System.getProperty("docsdir")));
            
            //    xmlDocFile.deleteOnExit();
            
            xmlOutpuStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(xmlDocFile));
            
            System.out.println("File name ["+xmlDocFile.getAbsolutePath()+"]");
            
            fileString = xmlDocFile.getAbsolutePath();
            
            
            
            javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
            
            try {
                
                javax.xml.parsers.DocumentBuilder xmlDocBuilder = documentBuilderFactory.newDocumentBuilder();
                
                
                initXmlDoc = xmlDocBuilder.newDocument();
                
                workonXmlDocument(initXmlDoc, invoicesTable);
                
                javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), "Successfully exported table ["+tableName.toUpperCase()+"] to file ["+xmlDocFile.getAbsolutePath()+"]");
                
                
            } catch(javax.xml.parsers.ParserConfigurationException parserExec) {
                
                javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), parserExec.getMessage());
                
            }
            
        } catch(java.io.IOException ioExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), ioExec.getMessage());
            
        }
        
    }
    
    public void workonXmlDocument(org.w3c.dom.Document xmlDoc) {}
   
    public void workonXmlDocument(org.w3c.dom.Document xmlDoc, javax.swing.JTable invoiceTable) {     
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        
        java.util.Date date = calendar.getTime();
        
        com.afrisoftech.lib.DateFormatter dateFormatter = new com.afrisoftech.lib.DateFormatter(date, "yyyy-MM-dd");

        com.afrisoftech.lib.DateFormatter timeFormatter = new com.afrisoftech.lib.DateFormatter(date, "HH:mm:ss");        
        
//        java.text.SimpleDateFormat dateFormat = java.text.SimpleDateFormat.

        java.lang.String txDate = dateFormatter.getDateString();
        
        java.lang.String txTime = timeFormatter.getDateString();
        
        java.lang.Object[] tableColumns = this.getTableColumns(invoiceTable);
        
        int rowCount = invoiceTable.getRowCount();
        
        int columnCount = invoiceTable.getColumnCount();
        
        ////  org.w3c.dom.Element rootElement = xmlDoc.createElement("claimXMLDoc");
        org.w3c.dom.Element rootElement = xmlDoc.createElement("ClaimData");
        //  org.w3c.dom.Element docType = xmlDoc.createElement("")
        
        org.w3c.dom.Element cardSerialElement = xmlDoc.createElement("Card_Serial");
////        org.w3c.dom.Element claimHeaderElement = xmlDoc.createElement("claimHeader");
        org.w3c.dom.Element pooledNoElement = xmlDoc.createElement("Pool_Nr");
////        org.w3c.dom.Element tableElement = xmlDoc.createElement("xmlTable");
        org.w3c.dom.Element claimLinesElement = xmlDoc.createElement("ClaimLines");
////        org.w3c.dom.Element tableColumnModelElement = xmlDoc.createElement("tableColumnModel");
////        org.w3c.dom.Element tableColumnElement = xmlDoc.createElement("tableColumn");
        
        org.w3c.dom.Element txElement = xmlDoc.createElement("Transaction");
////        org.w3c.dom.Element tableRowElement = xmlDoc.createElement("tableRow");
        org.w3c.dom.Element txDateElement = xmlDoc.createElement("Transaction_Date");
        org.w3c.dom.Element txTimeElement = xmlDoc.createElement("Transaction_Time");        
        org.w3c.dom.Element serviceProviderElement = xmlDoc.createElement("Service_Provider_Nr");
        org.w3c.dom.Element diagnoseCodeElement = xmlDoc.createElement("Diagnosis_Code");
        org.w3c.dom.Element diagnoseDescriptionElement = xmlDoc.createElement("Diagnosis_Description");
        org.w3c.dom.Element encounterTypeElement = xmlDoc.createElement("Encounter_Type");
        org.w3c.dom.Element codeTypeElement = xmlDoc.createElement("Code_Type");
        org.w3c.dom.Element codeElement = xmlDoc.createElement("Code");
        org.w3c.dom.Element codeDescriptionElement = xmlDoc.createElement("Code_Description");
        org.w3c.dom.Element quantityElement = xmlDoc.createElement("Quantity");
        org.w3c.dom.Element amountElement = xmlDoc.createElement("Amount");
////        org.w3c.dom.Element tableCellElement = xmlDoc.createElement("tableCell");
  ////      org.w3c.dom.Element tableDataElement = xmlDoc.createElement("tableData");
        
        xmlDoc.appendChild(rootElement);
        
        rootElement.appendChild(xmlDoc.createComment("This is a Claim XML document for healthcare"));
        
        System.out.println("Sorting claim data ...");
        
     //   rootElement.appendChild(cardSerialElement);
        
        appendClaimHeaderInfo(xmlDoc, rootElement);
        
       // claimLinesElement.appendChild(txElement);
        
      //  rootElement.appendChild(tableElement);
        
     //   tableElement.appendChild(tableDataElement);
        
      /*  for (int i = 0; i < tableColumns.length; i++) {
       
            javax.swing.table.TableColumn xmlTableColumn = (javax.swing.table.TableColumn)tableColumns[i];
       
            tableColumnElement = xmlDoc.createElement("tableColumn");
       
            tableColumnElement.appendChild(xmlDoc.createTextNode(xmlTableColumn.getHeaderValue().toString()));
       
            tableColumnModelElement.appendChild(tableColumnElement);
       
        }
       */
        for (int j = 0; j < rowCount; j++) {
            
            if(invoiceTable.getValueAt(j,0) != null){
            txElement = xmlDoc.createElement("Transaction");
            
          //  for (int k = 0; k < columnCount; k++) {
                
                txDateElement = xmlDoc.createElement("Transaction_Date");
                txDateElement.appendChild(xmlDoc.createTextNode(txDate));
                txElement.appendChild(txDateElement);
                
                txTimeElement = xmlDoc.createElement("Transaction_Time");
                txTimeElement.appendChild(xmlDoc.createTextNode(txTime));
                txElement.appendChild(txTimeElement);
                
                serviceProviderElement = xmlDoc.createElement("Service_Provider_Nr");
                serviceProviderElement.appendChild(xmlDoc.createTextNode("Karen"));
                txElement.appendChild(serviceProviderElement);
                
                diagnoseCodeElement = xmlDoc.createElement("Diagnosis_Code");
                diagnoseCodeElement.appendChild(xmlDoc.createTextNode("0"));
                txElement.appendChild(diagnoseCodeElement);
                
                diagnoseDescriptionElement = xmlDoc.createElement("Diagnosis_Description");
                diagnoseDescriptionElement.appendChild(xmlDoc.createTextNode("Unkown disease"));
                txElement.appendChild(diagnoseDescriptionElement);
                
                encounterTypeElement = xmlDoc.createElement("Encounter_Type");
                encounterTypeElement.appendChild(xmlDoc.createTextNode("Medication"));
                txElement.appendChild(encounterTypeElement);
                
                codeTypeElement = xmlDoc.createElement("Code_Type");
                codeTypeElement.appendChild(xmlDoc.createTextNode("Mcode")); // Testing
                txElement.appendChild(codeTypeElement);
                
                codeElement = xmlDoc.createElement("Code");
                codeElement.appendChild(xmlDoc.createTextNode("1")); // for testing
                txElement.appendChild(codeElement);
                
                codeDescriptionElement = xmlDoc.createElement("Code_Description");
                codeDescriptionElement.appendChild(xmlDoc.createTextNode(invoiceTable.getValueAt(j,0).toString()));
                txElement.appendChild(codeDescriptionElement);
                
                quantityElement = xmlDoc.createElement("Quantity");
                quantityElement.appendChild(xmlDoc.createTextNode(invoiceTable.getValueAt(j,1).toString()));
                txElement.appendChild(quantityElement);
                
                amountElement = xmlDoc.createElement("Amount");
                amountElement.appendChild(xmlDoc.createTextNode(invoiceTable.getValueAt(j,3).toString()));
                txElement.appendChild(amountElement);
        //    }
                
            }
            claimLinesElement.appendChild(txElement);
            rootElement.appendChild(claimLinesElement);
        }
                /*
                if (invoiceTable.getValueAt(j, k) != null) {
                    
                    tableCellElement.appendChild(xmlDoc.createTextNode(invoiceTable.getValueAt(j, k).toString()));
                    
                } else if (invoiceTable.getValueAt(j, k) == "") {
                    
                    tableCellElement.appendChild(xmlDoc.createTextNode("-"));
                    
                } else {
                    
                    tableCellElement.appendChild(xmlDoc.createTextNode("-"));
                    
                }
                
                tableRowElement.appendChild(tableCellElement);
                
            }
            
            tableDataElement.appendChild(tableRowElement);
            
        }
        */
        org.apache.xml.serialize.OutputFormat format = new org.apache.xml.serialize.OutputFormat();
        
        format.setIndenting(true);
        
        org.apache.xml.serialize.XMLSerializer xmlSerializer = new org.apache.xml.serialize.XMLSerializer(xmlOutpuStream, format);
        
        try {
            
            xmlSerializer.asDOMSerializer();
            
            xmlSerializer.serialize(xmlDoc);
            
        } catch(java.io.IOException ioExec) {
            
            javax.swing.JOptionPane.showMessageDialog(new java.awt.Frame(), ioExec.getMessage());
            
        }
        try {
            
            xmlOutpuStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        printNodeList(rootElement);
        
    }
    
    public void printNodeList(org.w3c.dom.Element rootElement) {
        
        org.w3c.dom.NodeList docNodeList = rootElement.getChildNodes();
        
        for (int i = 0; i < docNodeList.getLength(); i++) {
            
            System.out.println("Node type ["+docNodeList.item(i).getNodeType()+"]");
            
            if (docNodeList.item(i).getNodeType() != org.w3c.dom.Document.NOTATION_NODE) {
                
                System.out.println(docNodeList.item(i).getNodeValue());
                
                if (docNodeList.item(i).hasChildNodes()) {
                    
                    printNodeList((org.w3c.dom.Element)docNodeList.item(i));
                    
                }
            }
        }
    }
    
    public java.lang.Object[] getTableColumns(javax.swing.JTable exportedTable) {
        
        java.util.Vector columnVector = new java.util.Vector(1,1);
        
        java.lang.Object[] columnArray = null;
        
        java.util.Enumeration columnsEnumeration = exportedTable.getColumnModel().getColumns();
        
        while (columnsEnumeration.hasMoreElements()) {
            
            columnVector.addElement(columnsEnumeration.nextElement());
            
        }
        
        columnArray = columnVector.toArray();
        
        return columnArray;
    }
    
    /**
     * Adding claim header information.
     *
     */
    public void appendClaimHeaderInfo(org.w3c.dom.Document xmlDoc, org.w3c.dom.Element claimHeaderElement){
        org.w3c.dom.Element cardSerialElement = xmlDoc.createElement("Card_Serial");
        
        cardSerialElement.appendChild(xmlDoc.createTextNode(biz.systempartners.claims.XMLClaimFile.cardNumber));//cardSerial));
        
        claimHeaderElement.appendChild(cardSerialElement);
        
////        org.w3c.dom.Element claimHeaderElement = xmlDoc.createElement("claimHeader");
        org.w3c.dom.Element pooledNoElement = xmlDoc.createElement("Pool_Nr");
        
        pooledNoElement.appendChild(xmlDoc.createTextNode(biz.systempartners.claims.XMLClaimFile.cardNr));//poolNr));
        
        claimHeaderElement.appendChild(pooledNoElement);
        /*
        org.w3c.dom.Element patientNoElement = xmlDoc.createElement("patientNo");
        
        patientNoElement.appendChild(xmlDoc.createTextNode(patientNo));
        
        claimHeaderElement.appendChild(patientNoElement);
        
        org.w3c.dom.Element patientNameElement = xmlDoc.createElement("patientName");
        
        patientNameElement.appendChild(xmlDoc.createTextNode(patientName));
        
        claimHeaderElement.appendChild(patientNameElement);
        
        org.w3c.dom.Element schemeMemberNoElement = xmlDoc.createElement("schemeMemberNo");
        
        schemeMemberNoElement.appendChild(xmlDoc.createTextNode(schemeMemberNo));
        
        claimHeaderElement.appendChild(schemeMemberNoElement);
        
        org.w3c.dom.Element schemeNameElement = xmlDoc.createElement("schemeName");
        
        schemeNameElement.appendChild(xmlDoc.createTextNode(schemeName));
        
        claimHeaderElement.appendChild(schemeNameElement);
        
        org.w3c.dom.Element schemePayerElement = xmlDoc.createElement("schemePayer");
        
        schemePayerElement.appendChild(xmlDoc.createTextNode(schemePayer));
        
        claimHeaderElement.appendChild(schemePayerElement);
        
        org.w3c.dom.Element accountNoElement = xmlDoc.createElement("accountNo");
        
        accountNoElement.appendChild(xmlDoc.createTextNode(accountNo));
        
        claimHeaderElement.appendChild(accountNoElement);
        
        org.w3c.dom.Element invoiceNoElement = xmlDoc.createElement("invoiceNo");
        
        invoiceNoElement.appendChild(xmlDoc.createTextNode(invoiceNo));
        
        claimHeaderElement.appendChild(invoiceNoElement);
        
        org.w3c.dom.Element healthcareProviderIDElement = xmlDoc.createElement("healthCareProviderID");
        
        healthcareProviderIDElement.appendChild(xmlDoc.createTextNode(healthcareProviderID));
        
        claimHeaderElement.appendChild(healthcareProviderIDElement);
        */
    }
    
    public void run() {
        
        //  while (export2XML) {
        
        createXMLDoc();
        
        
        
        try {
            
            // threadExport2XML.
            
            Thread.currentThread().sleep(100);
            
        } catch(java.lang.InterruptedException IntExec){ System.out.println(IntExec.getMessage());}
        
        //   export2XML = false;
        
        // }
        
    }
    
    public void processXMLClaimFile(){
        
        readXMLClaimThread.start();
        
    }
    
    private class ReadXMLClaimFileThread extends java.lang.Thread {
        
        public void ReadXMLClaimFileThread(){
            
        }
        
        public void run(){
            
            processXMLClaimFile();
            
        }
        
        public void processXMLClaimFile(){
            
        }
        
    }
    
    // Claim class attributes.
    java.util.Vector invoiceChildVector = new java.util.Vector(1,1);
    java.lang.String patientNo;
    java.lang.String patientName;
    java.lang.String schemeMemberNo;
    java.lang.String schemeName;
    java.lang.String schemePayer;
    java.lang.String accountNo;
    java.lang.String invoiceNo;
    java.lang.String healthcareProviderID;
    javax.swing.JTable invoiceTable;
    java.io.File xmlClaimFile;
    java.io.BufferedOutputStream xmlOutpuStream = null;
    java.lang.Thread threadExport2XML = null;
    org.w3c.dom.Document initXmlDoc = null;
    java.lang.String tableName = "Claims_Table";
    boolean export2XML = true;
    java.lang.String fileString = null;
    ReadXMLClaimFileThread readXMLClaimThread = null;
    java.io.File xmlDocFile = null;
    static String cardSerial = null;
    static String poolNr = null;
}
