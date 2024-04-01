/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menugui;
import javax.swing.ImageIcon;
import menugui.MemoryGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Vinit Rao
 */
public class MenuUI extends javax.swing.JFrame {
    /**
     * Creates new form MenuUI
     */
    
    
    public MenuUI() {
        initComponents();
        
        this.setDefaultCloseOperation(MenuUI.DO_NOTHING_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("appIcon.png"));
        setIconImage(icon.getImage());
        
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point currentLocation = waterbg.getLocation();
                int newX = currentLocation.x - 2;
                if (newX <= -1300) {
                    newX = 0;
                }
                waterbg.setLocation(newX, currentLocation.y);
            }
        });
        timer.start();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bPlay = new javax.swing.JButton();
        bHelp = new javax.swing.JButton();
        bIndex = new javax.swing.JButton();
        bQuit = new javax.swing.JButton();
        bInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        waterbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(663, 485));
        setMinimumSize(new java.awt.Dimension(663, 485));
        setPreferredSize(new java.awt.Dimension(663, 485));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bPlay.setBackground(new java.awt.Color(107, 72, 42));
        bPlay.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        bPlay.setForeground(new java.awt.Color(255, 255, 255));
        bPlay.setText("Play");
        bPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlayActionPerformed(evt);
            }
        });
        getContentPane().add(bPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 226, 344, 79));

        bHelp.setBackground(new java.awt.Color(107, 72, 42));
        bHelp.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bHelp.setForeground(new java.awt.Color(255, 255, 255));
        bHelp.setText("Help");
        bHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHelpActionPerformed(evt);
            }
        });
        getContentPane().add(bHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 311, 169, 79));

        bIndex.setBackground(new java.awt.Color(107, 72, 42));
        bIndex.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bIndex.setForeground(new java.awt.Color(255, 255, 255));
        bIndex.setText("Index");
        bIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIndexActionPerformed(evt);
            }
        });
        getContentPane().add(bIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 311, 169, 79));

        bQuit.setBackground(new java.awt.Color(102, 0, 0));
        bQuit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bQuit.setForeground(new java.awt.Color(255, 255, 255));
        bQuit.setText("X");
        bQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitActionPerformed(evt);
            }
        });
        getContentPane().add(bQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 60, 60));

        bInfo.setBackground(new java.awt.Color(51, 51, 51));
        bInfo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bInfo.setForeground(new java.awt.Color(255, 255, 255));
        bInfo.setText("i");
        bInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoActionPerformed(evt);
            }
        });
        getContentPane().add(bInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/bg1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(650, 450));
        jLabel1.setMinimumSize(new java.awt.Dimension(650, 450));
        jLabel1.setPreferredSize(new java.awt.Dimension(650, 450));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        waterbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/waterbg.jpg"))); // NOI18N
        waterbg.setText("jLabel2");
        waterbg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        waterbg.setMaximumSize(new java.awt.Dimension(1950, 450));
        waterbg.setMinimumSize(new java.awt.Dimension(1950, 450));
        waterbg.setName(""); // NOI18N
        waterbg.setPreferredSize(new java.awt.Dimension(1950, 450));
        waterbg.setRequestFocusEnabled(false);
        getContentPane().add(waterbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1950, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlayActionPerformed
        MemoryGame mggui = new MemoryGame();
        mggui.show();
        dispose();
        
    }//GEN-LAST:event_bPlayActionPerformed

    private void bHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHelpActionPerformed
        // TODO add your handling code here:
        HelpUI1 hgui = new HelpUI1();
        hgui.show();
        dispose();
    }//GEN-LAST:event_bHelpActionPerformed

    private void bQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitActionPerformed
        // TODO add your handling code here:
        QuitUI qgui = new QuitUI();
        qgui.show();
        dispose();
    }//GEN-LAST:event_bQuitActionPerformed

    private void bIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIndexActionPerformed
        IndexUI ixgui = new IndexUI();
        ixgui.show();
        dispose();
    }//GEN-LAST:event_bIndexActionPerformed

    private void bInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInfoActionPerformed
        // TODO add your handling code here:
        InfoUI igui = new InfoUI();
        igui.show();
        dispose();
    }//GEN-LAST:event_bInfoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHelp;
    private javax.swing.JButton bIndex;
    private javax.swing.JButton bInfo;
    private javax.swing.JButton bPlay;
    private javax.swing.JButton bQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel waterbg;
    // End of variables declaration//GEN-END:variables
}
