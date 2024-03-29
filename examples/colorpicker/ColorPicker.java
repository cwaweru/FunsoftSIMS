/*
 *                 Sun Public License Notice
 * 
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"). You may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/
 * 
 * The Original Code is NetBeans. The Initial Developer of the Original
 * Code is Sun Microsystems, Inc. Portions Copyright 1997-2000 Sun
 * Microsystems, Inc. All Rights Reserved.
 */

package examples.colorpicker;

public class ColorPicker extends javax.swing.JFrame {

    /** Initializes the Form */
    public ColorPicker() {
        initComponents ();
        pack ();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        colorPreviewPanel = new javax.swing.JPanel();
        colorPreview1 = new examples.colorpicker.ColorPreview();
        jPanel1 = new javax.swing.JPanel();
        redSlider = new javax.swing.JSlider();
        greenSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        colorPreviewPanel.setLayout(new java.awt.BorderLayout());

        colorPreviewPanel.setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder(null, new java.awt.Color (134, 134, 134)), "Color Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), java.awt.Color.black));
        colorPreviewPanel.add(colorPreview1, java.awt.BorderLayout.CENTER);

        getContentPane().add(colorPreviewPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        redSlider.setMaximum(255);
        redSlider.setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder(null, new java.awt.Color (134, 134, 134)), "Red", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), java.awt.Color.black));
        redSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });

        jPanel1.add(redSlider);

        greenSlider.setMaximum(255);
        greenSlider.setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder(null, new java.awt.Color (134, 134, 134)), "Green", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), java.awt.Color.black));
        greenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSliderStateChanged(evt);
            }
        });

        jPanel1.add(greenSlider);

        blueSlider.setMaximum(255);
        blueSlider.setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder(null, new java.awt.Color (134, 134, 134)), "Blue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), java.awt.Color.black));
        blueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSliderStateChanged(evt);
            }
        });

        jPanel1.add(blueSlider);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

    }//GEN-END:initComponents

    private void blueSliderStateChanged (javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderStateChanged
        colorPreview1.setBlue (blueSlider.getValue ());
    }//GEN-LAST:event_blueSliderStateChanged

    private void greenSliderStateChanged (javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderStateChanged
        colorPreview1.setGreen (greenSlider.getValue ());
    }//GEN-LAST:event_greenSliderStateChanged

    private void redSliderStateChanged (javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderStateChanged
        colorPreview1.setRed (redSlider.getValue ());
    }//GEN-LAST:event_redSliderStateChanged

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit (0);
    }//GEN-LAST:event_exitForm


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private examples.colorpicker.ColorPreview colorPreview1;
    private javax.swing.JPanel colorPreviewPanel;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JSlider redSlider;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider blueSlider;
    // End of variables declaration//GEN-END:variables


    public static void main(java.lang.String[] args) {
        new ColorPicker ().show ();
    }

}
