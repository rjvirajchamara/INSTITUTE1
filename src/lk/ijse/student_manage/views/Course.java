/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student_manage.views;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;
import lk.ijse.student.idgenarator.IDGenarator;
import lk.ijse.student_manage.controller.ControllerFactory;
import lk.ijse.student_manage.controller.custom.CourseController;
import lk.ijse.student_manage.controller.custom.StudentController;
import lk.ijse.student_manage.controller.custom.impl.CourseConrollerImpl;
import lk.ijse.student_manage.controller.custom.impl.StudentControllerImpl;
import lk.ijse.student_manage.dto.CoureDTO;
import lk.ijse.student_manage.dto.StudentDTO;

/**
 *
 * @author chamara
 *
 */
public class Course extends javax.swing.JFrame {

    private ArrayList<CoureDTO> CourseList;

    private String searchType = "";
    private ArrayList<CoureDTO> searchCourseList;

    /**
     * Creates new form studentview
     */
    CourseController coursecotroller = new CourseConrollerImpl();

    
      private void clearTextFields() {
       // txtCid.setText("");
        txtcoursename.setText("");
        TxtDuration.setText("");
         txtCourseFee.setText("");
         txtRegfee.setText("");
         txtCstatas.setText("");
         txtCstatas.setText("");
         txtdiscount.setText("");
    }

    
    
    
    public Course() {
        initComponents();
        getAllCourseDetails();
        IDGenarator();
        txtCid.setBorder(null);
        txtcoursename.setBorder(null);
        TxtDuration.setBorder(null);
        txtCourseFee.setBorder(null);
        txtRegfee.setBorder(null);
        txtCstatas.setBorder(null);
        txtdiscount.setBorder(null);
        //txtwrite.setBorder(null);

        coursecotroller = (CourseController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Course);

        CourseTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (CourseTable.getSelectedRow() == -1) {
                    return;
                }

                txtCid.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 0).toString());
                txtcoursename.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 1).toString());
                TxtDuration.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 2).toString());
                txtCourseFee.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 3).toString());
                txtRegfee.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 4).toString());
                txtCstatas.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 5).toString());
                txtdiscount.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 6).toString());
               // txtSchool.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 7).toString());
               // comboGender.setSelectedItem(CourseTable.getValueAt(CourseTable.getSelectedRow(),8).toString());

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkerboardPainter1 = new org.jdesktop.swingx.painter.CheckerboardPainter();
        checkerboardPainter2 = new org.jdesktop.swingx.painter.CheckerboardPainter();
        email2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        txtdiscount = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        CourseTable = new org.jdesktop.swingx.JXTable();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtRegfee = new javax.swing.JTextField();
        txtCourseFee = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtCstatas = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        btAddStudent = new javax.swing.JLabel();
        btUpdateStudent = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        txtCid = new javax.swing.JTextField();
        txtcoursename = new javax.swing.JTextField();
        TxtDuration = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtaFullName = new org.jdesktop.swingx.JXLabel();
        jXMultiSplitPane1 = new org.jdesktop.swingx.JXMultiSplitPane();
        jXCollapsiblePane1 = new org.jdesktop.swingx.JXCollapsiblePane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        email3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 680, 90, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 102, 230, -1));

        txtdiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiscountActionPerformed(evt);
            }
        });
        getContentPane().add(txtdiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 230, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, -1));

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "CID", "Coursename", "CourseFee", "Duration", "RegFee", "Cstatas", "Discount"
            }
        ));
        jScrollPane3.setViewportView(CourseTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 1300, 220));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 122, 230, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 102, 230, -1));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Regfee");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 80, 20));

        txtRegfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegfeeActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 230, -1));

        txtCourseFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseFeeActionPerformed(evt);
            }
        });
        getContentPane().add(txtCourseFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 230, -1));
        getContentPane().add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 230, -1));

        txtCstatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCstatasActionPerformed(evt);
            }
        });
        getContentPane().add(txtCstatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 230, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 230, -1));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 74, 230, -1));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 134, 230, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 230, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 132, 230, 0));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 122, 230, 10));
        getContentPane().add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 90, -1));

        btAddStudent.setBackground(new java.awt.Color(51, 204, 255));
        btAddStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAddStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btAddStudent.setText("ADD Course");
        btAddStudent.setOpaque(true);
        btAddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAddStudentMouseClicked(evt);
            }
        });
        getContentPane().add(btAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 140, 30));

        btUpdateStudent.setBackground(new java.awt.Color(0, 204, 102));
        btUpdateStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btUpdateStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btUpdateStudent.setText("Update Course");
        btUpdateStudent.setOpaque(true);
        btUpdateStudent.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btUpdateStudentAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btUpdateStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUpdateStudentMouseClicked(evt);
            }
        });
        getContentPane().add(btUpdateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 150, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 110, -1));

        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 20, 10));

        txtCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidActionPerformed(evt);
            }
        });
        getContentPane().add(txtCid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 230, -1));
        getContentPane().add(txtcoursename, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 230, -1));

        TxtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDurationActionPerformed(evt);
            }
        });
        getContentPane().add(TxtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 230, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("CourseFee");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CourseName");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CStatas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 47, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Duration");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("discount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 110, -1));

        txtaFullName.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtaFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1460, 820));
        getContentPane().add(jXMultiSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));
        getContentPane().add(jXCollapsiblePane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/student/icon/download (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 780, 540));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 210, 240));
        getContentPane().add(email3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, -1));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 52, 230, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddStudentMouseClicked
        try {
            
            System.out.println("ghjkl");
            CoureDTO coure = new CoureDTO(
                txtCid.getText(),
                txtcoursename.getText(),
              //  txtCstatas.getText(),
                txtCourseFee.getText(),
                TxtDuration.getText(),
                txtRegfee.getText(),
                txtCstatas.getText(), 
                txtdiscount.getText());
            
            boolean result = coursecotroller.add(coure);
            getAllCourseDetails();
            if (result) {
                JOptionPane.showMessageDialog(this, "Student has been successfully added...!");
            } else {
                JOptionPane.showMessageDialog(this, "Student has not been added...!");
            }
        } catch (Exception ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btAddStudentMouseClicked

    private void btUpdateStudentAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btUpdateStudentAncestorAdded

    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {


    }//GEN-LAST:event_btUpdateStudentAncestorAdded

    private void btUpdateStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUpdateStudentMouseClicked
           try {
        CoureDTO coure = new CoureDTO(
                 txtCid.getText(),
                txtcoursename.getText(),
               // txtCstatas.getText(),
                txtCourseFee.getText(),
                TxtDuration.getText(),
                txtRegfee.getText(),
                txtCstatas.getText(), 
                txtdiscount.getText());

        
            // System.out.println("Clickd");
            boolean result = coursecotroller.update(coure);
           getAllCourseDetails();
            //  System.out.println(result);

            if (result) {
                JOptionPane.showMessageDialog(this, "Customer has been successfully updated...!");
            } else {
                JOptionPane.showMessageDialog(this, "Customer has not been updated...!");
            }
        } catch (Exception ex) {
           
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btUpdateStudentMouseClicked

    private void txtCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidActionPerformed

    private void txtCourseFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseFeeActionPerformed

    private void TxtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDurationActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       // Registration registrationView = new Registration();
       // registrationView.setVisible(true);
      //  removeAll();
    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        getAllCourseDetails();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txtCstatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCstatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCstatasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearTextFields() ;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtdiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiscountActionPerformed

    private void txtRegfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegfeeActionPerformed

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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTable CourseTable;
    private javax.swing.JTextField TxtDuration;
    private javax.swing.JLabel btAddStudent;
    private javax.swing.JLabel btUpdateStudent;
    private javax.swing.JButton btn_refresh;
    private org.jdesktop.swingx.painter.CheckerboardPainter checkerboardPainter1;
    private org.jdesktop.swingx.painter.CheckerboardPainter checkerboardPainter2;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField email3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXCollapsiblePane jXCollapsiblePane1;
    private org.jdesktop.swingx.JXMultiSplitPane jXMultiSplitPane1;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCourseFee;
    private javax.swing.JTextField txtCstatas;
    private javax.swing.JTextField txtRegfee;
    private org.jdesktop.swingx.JXLabel txtaFullName;
    private javax.swing.JTextField txtcoursename;
    private javax.swing.JTextField txtdiscount;
    // End of variables declaration//GEN-END:variables
 private void addTableDetails() {
    }

    private void getAllCourseDetails() {
        try {
            this.CourseList = (ArrayList<CoureDTO>) coursecotroller.getAll();

            DefaultTableModel dtm = (DefaultTableModel) CourseTable.getModel();

            dtm.setRowCount(0);

            for (CoureDTO Coures : CourseList) {

                Object[] rowData = {Coures.getCID(),
                    Coures.getCoursename(),
                    Coures.getDuration(),
                    Coures.getCourse_fee(),
                    Coures.getRegfee(),
                    Coures.getCStatas(),
                    Coures.getDiscount(),};
                   // Coures.getDob(),};
                   

                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   /* private void searchStudentDetails(String type, String searchText) {

        // System.out.println("T"+searchType);
        // System.out.println("st"+searchText);
       // System.out.println("sL"+StudentList);
        System.out.println("Result  " + type.equals("SID"));
        if (type.equals("SId")) {

            searchStudentList = new ArrayList<>();
            for (StudentDTO studentDTO : StudentList) {
                if (studentDTO.getSID().toLowerCase().contains(searchText.toLowerCase())) {
                    searchStudentList.add(studentDTO);

                }
            }
        } else if (type.equals("Name")) {
            searchStudentList = new ArrayList<>();
            for (StudentDTO studentDTO : StudentList) {
                if (studentDTO.getName().toLowerCase().contains(searchText.toLowerCase())) {
                    searchStudentList.add(studentDTO);
                }
            }
        } else if (type.equals("Address")) {
            searchStudentList = new ArrayList<>();
            for (StudentDTO studentDTO : StudentList) {
                if (studentDTO.getAddress().toLowerCase().contains(searchText.toLowerCase())) {
                    searchStudentList.add(studentDTO);
                }
            }
        } else if (type.equals("Telephone")) {
            searchStudentList = new ArrayList<>();
            for (StudentDTO studentDTO : StudentList) {
                if (studentDTO.getTelephone().toLowerCase().contains(searchText.toLowerCase())) {
                    searchStudentList.add(studentDTO);
                }
            }
        } else if (type.equals("School")) {
            searchStudentList = new ArrayList<>();
            for (StudentDTO studentDTO : StudentList) {
                if (studentDTO.getSchool().toLowerCase().contains(searchText.toLowerCase())) {
                    searchStudentList.add(studentDTO);
                }

            }
        } else if (type.equals("email")) {
            searchStudentList = new ArrayList<>();
            for (StudentDTO studentDTO : StudentList) {
                if (studentDTO.getEmail().toLowerCase().contains(searchText.toLowerCase())) {
                    searchStudentList.add(studentDTO);

                }
            }
        } else if (type.equals("dob")) {
            searchStudentList = new ArrayList<>();
            for (StudentDTO studentDTO : StudentList) {
                if (studentDTO.getDob().toLowerCase().contains(searchText.toLowerCase())) {
                    searchStudentList.add(studentDTO);
                }
          
        }
        try {

            DefaultTableModel dtm = (DefaultTableModel) CourseTable.getModel();

            dtm.setRowCount(0);

            for (StudentDTO student : searchStudentList) {

                Object[] rowData = {student.getSID(),
                    student.getName(),
                    student.getAddress(),
                    student.getTelephone(),
                    student.getSchool(),
                    student.getGender(),
                    student.getEmail(),
                    student.getDob(),};
                System.out.println("sL" + rowData);
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
   */ 
    
    private void IDGenarator() {

        try {
            txtCid.setText(IDGenarator.getNewID("coures", " CID", "C"));

        } catch (SQLException ex) {
            Logger.getLogger(Course.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}