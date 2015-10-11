/*
 * DatePicker.java
 *
 * Created on April 20, 2003, 8:36 PM
 */

package com.afrisoftech.sys;

/**
 *
 * @author  root
 */
public class DatePicker extends javax.swing.JDialog {
    
    /** Creates new form DatePicker */
    public DatePicker(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        dpMainPanel = new javax.swing.JPanel();
        monthPane = new javax.swing.JPanel();
        yearPane = new javax.swing.JPanel();
        datePane = new javax.swing.JPanel();
        datePickScrollPane = new javax.swing.JScrollPane();
        datePickTable = new javax.swing.JTable();
        pickdatebtn = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Date Picker");
        setModal(true);
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        dpMainPanel.setLayout(new java.awt.GridBagLayout());

        dpMainPanel.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.lightGray));
        monthPane.setBorder(new javax.swing.border.EtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        dpMainPanel.add(monthPane, gridBagConstraints);

        yearPane.setBorder(new javax.swing.border.EtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        dpMainPanel.add(yearPane, gridBagConstraints);

        datePane.setLayout(new java.awt.GridBagLayout());

        //javax.swing.JTable dateTable = new javax.swing.JTable(new DatePick());

        //datePane.add(dataTable);
        datePane.setBorder(new javax.swing.border.EtchedBorder());
        datePickScrollPane.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datePickTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"
            }
        ));
        datePickScrollPane.setViewportView(datePickTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datePane.add(datePickScrollPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        dpMainPanel.add(datePane, gridBagConstraints);

        pickdatebtn.setText("Pick Date");
        pickdatebtn.setBorder(new javax.swing.border.EtchedBorder());
        pickdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickdatebtnActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        dpMainPanel.add(pickdatebtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(dpMainPanel, gridBagConstraints);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(355, 201));
        setLocation((screenSize.width-355)/2,(screenSize.height-201)/2);
    }//GEN-END:initComponents

    private void pickdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickdatebtnActionPerformed
    this.dispose();        // Add your handling code here:
    }//GEN-LAST:event_pickdatebtnActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new DatePicker(new javax.swing.JFrame(), true).show();
    }
  
    public class DatePick extends javax.swing.table.AbstractTableModel {
        
        String dateData[][] = new String[7][7];
        
        String dayColumnNames[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        public int getRowCount() {
            
            return dateData.length;
            
        }
        
        public int getColumnCount() {
            
            return dayColumnNames.length;
            
        }
        
        public java.lang.Object getValueAt(int row, int column) {
            
            return dateData[row][column];
            
        }
        
        public java.lang.String getColumnName(int column) {
            
            return dayColumnNames[column];
            
        }
        
        public void setValueAt(java.lang.Object value, int row, int column) {
            
            dateData[row][column] = (java.lang.String)value;
            
        }
        
        public java.lang.Class getColumnClass(int c) {
            
            return getValueAt(0, c).getClass();
            
        }
        

        
    }
    
    java.util.Calendar cal = java.util.Calendar.getInstance();
    
    java.util.Date date = cal.getTime();
    
    
    
/*
        datePane.setBorder(new javax.swing.border.EtchedBorder());
        datePickTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"
            }
        ));
        datePickScrollPane.setViewportView(datePickTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        datePane.add(datePickScrollPane, gridBagConstraints);
    */
            
            
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel datePane;
    private javax.swing.JButton pickdatebtn;
    private javax.swing.JScrollPane datePickScrollPane;
    private javax.swing.JTable datePickTable;
    private javax.swing.JPanel dpMainPanel;
    private javax.swing.JPanel monthPane;
    private javax.swing.JPanel yearPane;
    // End of variables declaration//GEN-END:variables
    
}
