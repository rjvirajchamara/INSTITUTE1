/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student_manage.views;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import lk.ijse.student_manage.controller.ControllerFactory;
import lk.ijse.student_manage.controller.custom.LoginController;
import lk.ijse.student_manage.dto.LoginDTO;

/**
 *
 * @author chamara
 */
public class login extends javax.swing.JFrame {

    private Timer timer;
    /**
     * Creates new form login
     */
    private LoginController ctrlUser;

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        RunImage();
        txtName.setBorder(null);
        txtPassword.setBorder(null);
        ctrlUser = (LoginController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Loging);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        sinup = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblRun = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        txtName = new javax.swing.JTextField();
        lblLogin = new org.jdesktop.swingx.JXLabel();
        jButton1 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 250, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 250, 0));

        sinup.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sinup.setForeground(new java.awt.Color(102, 0, 0));
        sinup.setText("Login");
        sinup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinupActionPerformed(evt);
            }
        });
        getContentPane().add(sinup, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 80, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 90, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 250, -1));

        lblRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/student/icon/121212121212121212123.jpg"))); // NOI18N
        lblRun.setText("jXLabel2");
        getContentPane().add(lblRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 130));

        jXLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jXLabel1.setText("Frogot Password...?");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 130, 20));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 260, 30));

        lblLogin.setForeground(new java.awt.Color(0, 51, 255));
        lblLogin.setToolTipText("Login form mobile shop");
        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
        });
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Frogot");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 90, 30));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 80, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/student/icon/download (2)_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 80, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 80, 20));

        jXLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jXLabel2.setText("Frogot Password...?");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 130, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        txtPassword.requestFocus();
        txtPassword.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked

    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        //if((txtPassword.getText()).equals("19950531")&&(txtName.getText()).equals("kavindu")){URL resource=this.getClass().getResource("/lk/ijse/MobileShop/Icon/kavindu.jpg");
        //ImageIcon image=new ImageIcon(resource);

        //lblIcon.setIcon(image);
        //}
    }//GEN-LAST:event_lblLoginMouseEntered

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed


    }//GEN-LAST:event_txtPasswordActionPerformed

    private void sinupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinupActionPerformed
        LoginDTO dto = new LoginDTO(txtName.getText (), txtPassword.getText());

        try {
            boolean login = ctrlUser.Login(dto);
            System.out.println(txtName.getText());
            System.out.println(txtPassword.getText());
            if (login) {
                Home mainFram = new Home();
                mainFram.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username or password");
            }
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_sinupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel lblLogin;
    private org.jdesktop.swingx.JXLabel lblRun;
    private javax.swing.JButton sinup;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
 private void RunImage() {
        timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point p = new Point();
                p.x = lblRun.getLocation().x + 5;
                if (p.x < login.this.getWidth()) {
                } else {
                    p.x = 0;
                }
                p.y = lblRun.getLocation().y;
                lblRun.setLocation(p);
            }

        });
        timer.start();
    }
}
