/*
 * TableModelPanel.java
 *
 * Created on August 21, 2005, 5:54 PM
 */

package biz.systempartners.txtreports;

/**
 *
 * @author  waweru
 */
public class TableModelPanel extends javax.swing.JPanel {
    
    /** Creates new form TableModelPanel */
    public TableModelPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1100023", "My life has been in Kenya", "9000.00", "9867.25"},
                {"6100053", "This is papa", "2354.50", "100.00"},
                {"8320087", "This is not mama", "3350.90", "78.00"},
                {"7102343", "Joe must work very hard!", "0.00", "12000.00"}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        add(jTable1, java.awt.BorderLayout.CENTER);

    }
    // </editor-fold>//GEN-END:initComponents
    public javax.swing.table.DefaultTableModel getTableModel(){
        return (javax.swing.table.DefaultTableModel)jTable1.getModel();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}