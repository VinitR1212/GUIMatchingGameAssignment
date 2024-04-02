/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menugui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Vinit Rao
 */
public class IndexUI extends javax.swing.JFrame {

    /**
     * Creates new form MenuUI
     */
    public IndexUI() {
        initComponents();
        
        this.setDefaultCloseOperation(IndexUI.DO_NOTHING_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("appIcon.png"));
        setIconImage(icon.getImage());
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point currentLocation = waterbg.getLocation();
                int newX = currentLocation.x - 3;
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

        bBack = new javax.swing.JButton();
        bDolphin = new javax.swing.JButton();
        bBass = new javax.swing.JButton();
        bPiranha = new javax.swing.JButton();
        bSalmon = new javax.swing.JButton();
        bPerch = new javax.swing.JButton();
        bJellyfish = new javax.swing.JButton();
        bShark = new javax.swing.JButton();
        bSnapper = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        waterbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(663, 485));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bBack.setBackground(new java.awt.Color(107, 72, 42));
        bBack.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bBack.setForeground(new java.awt.Color(255, 255, 255));
        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });
        getContentPane().add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 60));

        bDolphin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/image2.png"))); // NOI18N
        bDolphin.setText("Dolphin");
        bDolphin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDolphinActionPerformed(evt);
            }
        });
        getContentPane().add(bDolphin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 130, 80));

        bBass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/image1.png"))); // NOI18N
        bBass.setText("Bass");
        bBass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBassActionPerformed(evt);
            }
        });
        getContentPane().add(bBass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 80));

        bPiranha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/image4.png"))); // NOI18N
        bPiranha.setText("Piranha");
        bPiranha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPiranhaActionPerformed(evt);
            }
        });
        getContentPane().add(bPiranha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, 80));

        bSalmon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/image5.png"))); // NOI18N
        bSalmon.setText("Salmon");
        bSalmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalmonActionPerformed(evt);
            }
        });
        getContentPane().add(bSalmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, 80));

        bPerch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/image8.png"))); // NOI18N
        bPerch.setText("Perch");
        bPerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPerchActionPerformed(evt);
            }
        });
        getContentPane().add(bPerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 130, 80));

        bJellyfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/image3.png"))); // NOI18N
        bJellyfish.setText("Jellyfish");
        bJellyfish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJellyfishActionPerformed(evt);
            }
        });
        getContentPane().add(bJellyfish, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 130, 80));

        bShark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/image6.png"))); // NOI18N
        bShark.setText("Shark");
        bShark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSharkActionPerformed(evt);
            }
        });
        getContentPane().add(bShark, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 130, 80));

        bSnapper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/image7.png"))); // NOI18N
        bSnapper.setText("Snapper");
        bSnapper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSnapperActionPerformed(evt);
            }
        });
        getContentPane().add(bSnapper, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 130, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/index.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(650, 450));
        jLabel1.setMinimumSize(new java.awt.Dimension(650, 450));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        waterbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menugui/waterbg2.jpg"))); // NOI18N
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

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        // TODO add your handling code here:
        MenuUI mgui = new MenuUI();
        mgui.show();
        dispose();
    }//GEN-LAST:event_bBackActionPerformed

    private void bPerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPerchActionPerformed
        PerchUI perchgui = new PerchUI();
        perchgui.show();
        dispose();
    }//GEN-LAST:event_bPerchActionPerformed

    private void bSharkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSharkActionPerformed
        // TODO add your handling code here:
        SharkUI sharkgui = new SharkUI();
        sharkgui.show();
        dispose();
    }//GEN-LAST:event_bSharkActionPerformed

    private void bSnapperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSnapperActionPerformed
        // TODO add your handling code here:
        SnapperUI snappergui = new SnapperUI();
        snappergui.show();
        dispose();
    }//GEN-LAST:event_bSnapperActionPerformed

    private void bBassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBassActionPerformed
        BassUI bassgui = new BassUI();
        bassgui.show();
        dispose();
    }//GEN-LAST:event_bBassActionPerformed

    private void bJellyfishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJellyfishActionPerformed
        JellyfishUI jellyfishgui = new JellyfishUI();
        jellyfishgui.show();
        dispose();
    }//GEN-LAST:event_bJellyfishActionPerformed

    private void bDolphinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDolphinActionPerformed
        DolphinUI dolphingui = new DolphinUI();
        dolphingui.show();
        dispose();
    }//GEN-LAST:event_bDolphinActionPerformed

    private void bPiranhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPiranhaActionPerformed
        PiranhaUI piranhagui = new PiranhaUI();
        piranhagui.show();
        dispose();
    }//GEN-LAST:event_bPiranhaActionPerformed

    private void bSalmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalmonActionPerformed
        SalmonUI salmongui = new SalmonUI();
        salmongui.show();
        dispose();
    }//GEN-LAST:event_bSalmonActionPerformed

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
            java.util.logging.Logger.getLogger(IndexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bBass;
    private javax.swing.JButton bDolphin;
    private javax.swing.JButton bJellyfish;
    private javax.swing.JButton bPerch;
    private javax.swing.JButton bPiranha;
    private javax.swing.JButton bSalmon;
    private javax.swing.JButton bShark;
    private javax.swing.JButton bSnapper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel waterbg;
    // End of variables declaration//GEN-END:variables
}
