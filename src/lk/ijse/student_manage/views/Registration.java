/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student_manage.views;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;
import lk.ijse.student.idgenarator.IDGenarator;
import lk.ijse.student_manage.controller.ControllerFactory;
import lk.ijse.student_manage.controller.custom.BatchController;
import lk.ijse.student_manage.controller.custom.CourseController;
import lk.ijse.student_manage.controller.custom.RegistrationController;
import lk.ijse.student_manage.controller.custom.StudentController;
import lk.ijse.student_manage.controller.custom.impl.BatchControllerImpl;
import lk.ijse.student_manage.controller.custom.impl.CourseConrollerImpl;
import lk.ijse.student_manage.controller.custom.impl.RegistrationControllrtImpl;
import lk.ijse.student_manage.controller.custom.impl.StudentControllerImpl;
import lk.ijse.student_manage.dto.BatchDTO;
import lk.ijse.student_manage.dto.CoureDTO;
import lk.ijse.student_manage.dto.RegistrationDTO;
import lk.ijse.student_manage.dto.StudentDTO;

/**
 *
 * @author chamara
 */
public class Registration extends javax.swing.JFrame {

    private ArrayList<RegistrationDTO> registrationList;
    private ArrayList<StudentDTO> StudentList;
    private ArrayList<BatchDTO> BatchList;
    private ArrayList<CoureDTO> CoureList;
    private String searchType = "";
    private ArrayList<RegistrationDTO> searchregistrationList;
    private static StudentDTO studentDTO1;

    /**
     * Creates new form studentview
     */
    RegistrationController registrationcotroller = new RegistrationControllrtImpl();
    StudentController studentcotroller = new StudentControllerImpl();
    BatchController batchController = new BatchControllerImpl();
    CourseController courseController = new CourseConrollerImpl();

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        getAllStudentDetails();
        IDGenarator();
        IDGenarator();
        getAllCourseDetails();
        getAllRegistrationDetails();
        
                
                
        studentcotroller = (StudentController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.STUDENT);
        registrationcotroller = (RegistrationController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Registion);
        batchController = (BatchController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.Batch);
        setStudentID();
        CourseTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (CourseTable.getSelectedRow() == -1) {
                    return;
                }
                txtCourseID.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 0).toString());
                txtCourseName.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 1).toString());
                txtfee.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 3).toString());
            }
        });

        CourseTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (CourseTable1.getSelectedRow() == -1) {
                    return;
                }
                BatchId.setText(CourseTable1.getValueAt(CourseTable1.getSelectedRow(), 0).toString());
                RbatchNAme.setText(CourseTable1.getValueAt(CourseTable1.getSelectedRow(), 1).toString());
                //  txtCourseID.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 0).toString());
                // txtCourseName.setText(CourseTable.getValueAt(CourseTable.getSelectedRow(), 1).toString());

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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistrationTable = new javax.swing.JTable();
        btAddStudent = new javax.swing.JLabel();
        btUpdateStudent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRegistrationid = new javax.swing.JTextField();
        RbatchNAme = new javax.swing.JTextField();
        txtfee = new javax.swing.JTextField();
        RegistrationDate = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane3 = new javax.swing.JScrollPane();
        CourseTable1 = new org.jdesktop.swingx.JXTable();
        jLabel3 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        txtStudent2 = new javax.swing.JTextField();
        RegFeeStatus = new javax.swing.JComboBox<>();
        RegStatus = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        CourseTable = new org.jdesktop.swingx.JXTable();
        BatchId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Course name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Registration ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 117, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Batch name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("fee");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 99, 30));

        RegistrationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RID", "SID", "BID", "RegistrationDAte", "fee", "RegfeeStatus", "regstatas"
            }
        ));
        jScrollPane1.setViewportView(RegistrationTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 364, 660, 330));

        btAddStudent.setBackground(new java.awt.Color(51, 204, 255));
        btAddStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAddStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btAddStudent.setText("Add Registration");
        btAddStudent.setOpaque(true);
        btAddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAddStudentMouseClicked(evt);
            }
        });
        jPanel1.add(btAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 180, 30));

        btUpdateStudent.setBackground(new java.awt.Color(0, 204, 102));
        btUpdateStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btUpdateStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btUpdateStudent.setText("Update Registration");
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
        jPanel1.add(btUpdateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("RegistrationDate");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 151, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Student ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("RegStatus");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("RegFeeStatus");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 110, 30));

        txtRegistrationid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrationidActionPerformed(evt);
            }
        });
        jPanel1.add(txtRegistrationid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 202, -1));

        RbatchNAme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbatchNAmeActionPerformed(evt);
            }
        });
        jPanel1.add(RbatchNAme, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 202, -1));
        jPanel1.add(txtfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 202, -1));
        jPanel1.add(RegistrationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 200, -1));

        CourseTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "BID", "Batchname"
            }
        ));
        jScrollPane3.setViewportView(CourseTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 130, 330));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Batch ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 202, -1));

        txtStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudent2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtStudent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 202, -1));

        RegFeeStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(RegFeeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 200, -1));

        RegStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "inActive", " " }));
        jPanel1.add(RegStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 200, -1));

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
                "CID", "Coursename", "Duration", "Coursefee", "RegFee", "Cstatas", "Discount"
            }
        ));
        jScrollPane4.setViewportView(CourseTable);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 360, 550, 330));
        jPanel1.add(BatchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Course ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 30));

        txtCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 202, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddStudentMouseClicked
        try {
            RegistrationDTO registration = new RegistrationDTO(
                    txtRegistrationid.getText(),
                    txtStudent2.getText(),
                    BatchId.getText(),
                    txtCourseID.getText(),
                    // BatchId.getText(),
                    txtfee.getText(),
                    RegFeeStatus.getSelectedItem().toString(),
                    RegStatus.getSelectedItem().toString(),
                    RegistrationDate.getDate().toString());
            //  txtstatus.getText());
           // getAllRegistrationDetails();
            boolean result = registrationcotroller.add(registration);
            getAllRegistrationDetails();
            if (result) {
                JOptionPane.showMessageDialog(this, "Customer has been successfully updated...!");
            } else {
                JOptionPane.showMessageDialog(this, "Customer has not been updated...!");
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }//GEN-LAST:event_btAddStudentMouseClicked

    private void btUpdateStudentAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btUpdateStudentAncestorAdded

    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {

    }//GEN-LAST:event_btUpdateStudentAncestorAdded

    private void btUpdateStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUpdateStudentMouseClicked

        /*   RegistrationDTO registration = new RegistrationDTO(
            tfSID.getText(),
            tfNIC.getText(),
            tfName.getText(),
            txtAddress.getText(),
            txtemail1.getText(),
            TxtDateOfBirth.getText(),
            tfTel.getText(),
            txtSchool.getText(),
            txtMoblie.getText());

        try {
            // System.out.println("Clickd");
            boolean result = studentcotroller.update(student);
            //  System.out.println(result);

            if (result){
                JOptionPane.showMessageDialog(this, "Customer has been successfully updated...!");
            }else{
                JOptionPane.showMessageDialog(this, "Customer has not been updated...!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_btUpdateStudentMouseClicked

    private void RbatchNAmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbatchNAmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbatchNAmeActionPerformed

    private void txtRegistrationidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrationidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistrationidActionPerformed

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add 
    }//GEN-LAST:event_txtCourseNameActionPerformed

    private void txtStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudent2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudent2ActionPerformed

    private void txtCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseIDActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BatchId;
    private org.jdesktop.swingx.JXTable CourseTable;
    private org.jdesktop.swingx.JXTable CourseTable1;
    private javax.swing.JTextField RbatchNAme;
    private javax.swing.JComboBox<String> RegFeeStatus;
    private javax.swing.JComboBox<String> RegStatus;
    private org.jdesktop.swingx.JXDatePicker RegistrationDate;
    private javax.swing.JTable RegistrationTable;
    private javax.swing.JLabel btAddStudent;
    private javax.swing.JLabel btUpdateStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtRegistrationid;
    private javax.swing.JTextField txtStudent2;
    private javax.swing.JTextField txtfee;
    // End of variables declaration//GEN-END:variables
    private void getAllRegistrationDetails() {
        try {
            this.registrationList = (ArrayList<RegistrationDTO>) registrationcotroller.getAll();

            DefaultTableModel dtm = (DefaultTableModel) RegistrationTable.getModel();

            dtm.setRowCount(0);

            for (RegistrationDTO Registration : registrationList) {

                Object[] rowData = {Registration.getCID(),
                    Registration.getSID(),
                    Registration.getBID(),
                    Registration.getCID(),
                    Registration.getRegDate(),
                    Registration.getFee(),
                    Registration.getRegfeestatar(),
                    Registration.getStatus(),};
                // Coures.getDob(),};

                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getAllCourseDetails() {
        try {
            this.CoureList = (ArrayList<CoureDTO>) courseController.getAll();

            DefaultTableModel dtm = (DefaultTableModel) CourseTable.getModel();

            dtm.setRowCount(0);

            for (CoureDTO Coures : CoureList) {

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

    private void getAllStudentDetails() {
        try {
            this.BatchList = (ArrayList<BatchDTO>) batchController.getAll();

            DefaultTableModel dtm = (DefaultTableModel) CourseTable1.getModel();

            dtm.setRowCount(0);

            for (BatchDTO batch : BatchList) {

                Object[] rowData = {batch.getBID(),
                    batch.getBatchname(),};

                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void IDGenarator() {

        try {
            txtRegistrationid.setText(IDGenarator.getNewID("registration", " RID", "R"));

        } catch (SQLException ex) {
            Logger.getLogger(studentview.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentview.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    
    public void getStudentDetails(StudentDTO studentDTO) {
        if (null != studentDTO ) {
            studentDTO1 = studentDTO;
            txtStudent2.setText(studentDTO1.getSID());
        }

    }
    
    public void setStudentID(){
//        txtStudent2.setText(studentDTO1.getSID());
//        System.out.println(studentDTO1.getSID());
    }
}
