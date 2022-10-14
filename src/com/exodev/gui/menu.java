package com.exodev.gui;

import com.exodev.source.PasswordGenerator;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {
    
    int x;
    int y;
    
    public menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        lbPassword = new javax.swing.JLabel();
        lbShow = new javax.swing.JLabel();
        roundedPanel1 = new com.exodev.swing.RoundedPanel();
        lbLenght = new javax.swing.JLabel();
        btInfo = new com.exodev.swing.RoundedButton();
        txLenght = new com.exodev.swing.LineTextField();
        btGenerate = new com.exodev.swing.RoundedButton();
        lbClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnMenu.setBackground(new java.awt.Color(240, 240, 240));

        lbPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(0, 0, 0));
        lbPassword.setText("Password Generator");
        lbPassword.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbPassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbPasswordMouseDragged(evt);
            }
        });
        lbPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbPasswordMousePressed(evt);
            }
        });

        lbShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(205, 205, 205)));

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setRadius(30);

        lbLenght.setForeground(new java.awt.Color(77, 77, 77));
        lbLenght.setText("Set Password Length:");
        roundedPanel1.add(lbLenght);
        lbLenght.setBounds(10, 10, 160, 16);

        btInfo.setText("!");
        btInfo.setBorderColor(new java.awt.Color(86, 216, 216));
        btInfo.setColorClick(new java.awt.Color(0, 102, 102));
        btInfo.setColorOver(new java.awt.Color(86, 216, 216));
        btInfo.setRadius(20);
        btInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfoActionPerformed(evt);
            }
        });
        roundedPanel1.add(btInfo);
        btInfo.setBounds(160, 70, 25, 22);
        roundedPanel1.add(txLenght);
        txLenght.setBounds(10, 30, 180, 36);

        btGenerate.setText("Generate");
        btGenerate.setBorderColor(new java.awt.Color(86, 216, 216));
        btGenerate.setColorClick(new java.awt.Color(0, 102, 102));
        btGenerate.setColorOver(new java.awt.Color(86, 216, 216));
        btGenerate.setRadius(25);
        btGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerateActionPerformed(evt);
            }
        });
        btGenerate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btGenerateKeyTyped(evt);
            }
        });
        roundedPanel1.add(btGenerate);
        btGenerate.setBounds(10, 70, 100, 22);

        lbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/exodev/imags/closeBlack16x.png"))); // NOI18N
        lbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbCloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createSequentialGroup()
                        .addComponent(lbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbClose)))
                .addContainerGap())
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbClose))
                    .addComponent(lbPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lbShow, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerateActionPerformed
        genPassword();
    }//GEN-LAST:event_btGenerateActionPerformed
        
    private void btGenerateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btGenerateKeyTyped
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            genPassword();
        }
    }//GEN-LAST:event_btGenerateKeyTyped

    private void lbCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMousePressed
        System.exit(0);
    }//GEN-LAST:event_lbCloseMousePressed

    private void btInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoActionPerformed
        JOptionPane.showMessageDialog(null, "Develop by: Exodev \nUser Interface Inspirated by: DJ-Raven \nYouTube Channel > https://www.youtube.com/c/HelloWorld-Raven", "Info", HEIGHT);
    }//GEN-LAST:event_btInfoActionPerformed

    private void lbPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPasswordMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lbPasswordMousePressed

    private void lbPasswordMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPasswordMouseDragged
        setLocation(getLocation().x + evt.getX() - x, getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lbPasswordMouseDragged
    
    public void genPassword() {
        int plength = Integer.parseInt(txLenght.getText());
        PasswordGenerator pg = new PasswordGenerator();

        try {
            if (txLenght.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Error --> Please, fill the empty field");
            } else {
                lbShow.setText(pg.genPassword(plength));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error --> This lenght parameter invalid, please, try add numbers");
        }
    }

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.exodev.swing.RoundedButton btGenerate;
    private com.exodev.swing.RoundedButton btInfo;
    private javax.swing.JLabel lbClose;
    private javax.swing.JLabel lbLenght;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbShow;
    private javax.swing.JPanel pnMenu;
    private com.exodev.swing.RoundedPanel roundedPanel1;
    private com.exodev.swing.LineTextField txLenght;
    // End of variables declaration//GEN-END:variables
}
