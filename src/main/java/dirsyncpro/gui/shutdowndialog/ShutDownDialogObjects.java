/*
 * GuiObjects.java
 *
 * Copyright (C) 2008-2011 O. Givi (info@dirsyncpro.org)
 * Copyright (C) 2006 F. Gerbig
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 2 februari 2008, 18:40
 */

package dirsyncpro.gui.shutdowndialog;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import dirsyncpro.Const;
import dirsyncpro.DirSyncPro;
import dirsyncpro.tools.GuiTools;

/**
 * The DirSyncPro Main GUI.
 * 
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public abstract class ShutDownDialogObjects extends javax.swing.JDialog {
    
	public ShutDownDialogObjects(JFrame frame) {
		super(frame);
		GuiTools.setSystemLookAndFeel(DirSyncPro.isSystemLookAndFeel());

    	initComponents();
    }

	
	/** Creates new form GuiObjects */
//    public GuiObjects() {
//       initComponents();
//    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        updateButtonsPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        spacer = new javax.swing.JPanel();
        localVersion = new javax.swing.JLabel();
        remoteVersion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spacer1 = new javax.swing.JPanel();
        secondsJLabel = new javax.swing.JLabel();

        setTitle("ShutDown");
        setIconImage(new ImageIcon(getClass().getResource("/icons/DirSyncPro64x64.png")).getImage());
        getContentPane().setLayout(new java.awt.GridBagLayout());

        updateButtonsPanel.setLayout(new javax.swing.BoxLayout(updateButtonsPanel, javax.swing.BoxLayout.LINE_AXIS));

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setAlignmentX(0.5F);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtoncancelActionPerformed(evt);
            }
        });
        updateButtonsPanel.add(cancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(updateButtonsPanel, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Shutting down!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(jLabel1, gridBagConstraints);

        spacer.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(spacer, gridBagConstraints);

        localVersion.setText("Shutting down the system in:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(localVersion, gridBagConstraints);

        remoteVersion.setText("seconds!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        getContentPane().add(remoteVersion, gridBagConstraints);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 6);
        getContentPane().add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(spacer1, gridBagConstraints);

        secondsJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        secondsJLabel.setText("30");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(secondsJLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cancelButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtoncancelActionPerformed
    this.setVisible(false);
    stopCountDown();
}//GEN-LAST:event_cancelButtoncancelActionPerformed

private void openRecentMenuItemopenConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openRecentMenuItemopenConfigActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_openRecentMenuItemopenConfigActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel localVersion;
    protected javax.swing.JLabel remoteVersion;
    protected javax.swing.JLabel secondsJLabel;
    private javax.swing.JPanel spacer;
    private javax.swing.JPanel spacer1;
    private javax.swing.JPanel updateButtonsPanel;
    // End of variables declaration//GEN-END:variables
 
    abstract protected void stopCountDown();
}