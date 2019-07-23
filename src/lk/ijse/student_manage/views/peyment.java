/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student_manage.views;

import java.sql.Connection;
import java.sql.SQLException;
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
import lk.ijse.student_manage.controller.custom.PeymentController;
import lk.ijse.student_manage.controller.custom.RegistrationController;
import lk.ijse.student_manage.controller.custom.StudentController;
import lk.ijse.student_manage.controller.custom.impl.PeymentControllerImpl;
import lk.ijse.student_manage.controller.custom.impl.RegistrationControllrtImpl;
import lk.ijse.student_manage.controller.custom.impl.StudentControllerImpl;
import lk.ijse.student_manage.dao.db.ConnectionFactory;
import lk.ijse.student_manage.dto.RegistrationDTO;
import lk.ijse.student_manage.dto.StudentDTO;
import lk.ijse.student_manage.dto.paymentTypeDTO;
import lk.ijse.student_manage.dto.paymentDTO;

/**
 *
 * @author chamara
 *
 */
public class peyment extends javax.swing.JFrame {

    private ArrayList<paymentDTO> peymenttList;

    private String searchType = "";
    private ArrayList<paymentDTO> searchpeymentList;
    private static StudentDTO studentDTO1;
    private static studentview st;
    /**
     * Creates new form studentview
     */
    private Connection connection;
    PeymentController peymentcotroller = new PeymentControllerImpl();
    RegistrationController registrationController = new RegistrationControllrtImpl();
//connection =ConnectionFactory.getInstance().getConnection();

    public peyment() {
        initComponents();
        getAllPeymentDetails();
        IDGenarator();
        IDGenarator1();
        connection = ConnectionFactory.getInstance().getConnection();

        // searchStudentDetails1();
        // searchPaymentDetails();
        txtPeymentId.setBorder(null);
        txtRegistratiaID.setBorder(null);
        txtpaid.setBorder(null);
        Txtfee.setBorder(null);
        //   Txtptype.setBorder(null);
        txtdiscount.setBorder(null);
        jTextGonrate.setBorder(null);
        txtGonTAx.setBorder(null);
        txtdelayIntrst.setBorder(null);
        pdate.setBorder(null);
        txtamount.setBorder(null);
        txtblase.setBorder(null);
        txtpaymentstatas.setBorder(null);
        txtGonTAx.setBorder(null);
        txtdelayIntrst.setBorder(null);
        txtDupaymentDate.setBorder(null);

        peymentcotroller = (PeymentController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.payment);

        peymentTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (peymentTable.getSelectedRow() == -1) {
                    return;
                }
                txtPeymentId.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 0).toString());
                txtRegistratiaID.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 1).toString());
                txtpaid.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 2).toString());
                Txtfee.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 3).toString());
                //  Txtptype.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 4).toString());
                txtdiscount.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 5).toString());
                jTextGonrate.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 6).toString());
                txtGonTAx.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 7).toString());
                txtdelayIntrst.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 8).toString());
                //pdate.getDate.toString(),(peymentTable.getValueAt(peymentTable.getSelectedRow(), 9).toString());
                txtamount.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 9).toString());
                txtblase.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 10).toString());
                txtpaymentstatas.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 11).toString());
                txtDupaymentDate.setText(peymentTable.getValueAt(peymentTable.getSelectedRow(), 12).toString());
                // txtdelayIntrst .setText(StudentTable.getValueAt(StudentTable.getSelectedRow(), 14).toString());

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

        email2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        typecombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtblase = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtamount = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtwrite = new javax.swing.JTextField();
        txtdiscount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDupaymentDate = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextGonrate = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtdelayIntrst = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txtpaymentstatas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btAddStudent = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        btUpdateStudent = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        btn_refresh = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        PeymentCombo = new javax.swing.JComboBox<>();
        Txtfee = new javax.swing.JTextField();
        txtsrach = new javax.swing.JTextField();
        txtPeymentId = new javax.swing.JTextField();
        txtGonTAx = new javax.swing.JTextField();
        txtRegistratiaID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtpaid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        email3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();

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
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 102, 230, -1));

        typecombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        typecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RegistrationID", "fee", "paymenttype", "Amount", "Blasce", "paymentstatas", "DuepaymentDate", " ", " " }));
        typecombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typecomboItemStateChanged(evt);
            }
        });
        typecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typecomboActionPerformed(evt);
            }
        });
        getContentPane().add(typecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 170, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DelayIntrst");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 100, -1));
        getContentPane().add(txtblase, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 230, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, -1));
        getContentPane().add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 230, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 102, 230, -1));

        txtwrite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtwrite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtwrite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        txtwrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwriteActionPerformed(evt);
            }
        });
        txtwrite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtwriteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtwriteKeyReleased(evt);
            }
        });
        getContentPane().add(txtwrite, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 200, 30));
        getContentPane().add(txtdiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 230, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("peymenttype");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, 20));

        txtDupaymentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDupaymentDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDupaymentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 230, -1));
        getContentPane().add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 362, 230, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Discount");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, -1));

        jTextGonrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGonrateActionPerformed(evt);
            }
        });
        getContentPane().add(jTextGonrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 230, -1));
        getContentPane().add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 230, -1));

        txtdelayIntrst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdelayIntrstActionPerformed(evt);
            }
        });
        getContentPane().add(txtdelayIntrst, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 230, -1));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 112, 230, 10));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 192, 230, -1));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 242, 230, 0));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 152, 230, 0));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 302, 230, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 148, 230, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 230, -1));

        txtpaymentstatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaymentstatasActionPerformed(evt);
            }
        });
        getContentPane().add(txtpaymentstatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 230, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Blasce");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 140, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Duepaymentdate");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 140, 20));

        btAddStudent.setBackground(new java.awt.Color(51, 204, 255));
        btAddStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAddStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btAddStudent.setText("Add payment");
        btAddStudent.setOpaque(true);
        btAddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAddStudentMouseClicked(evt);
            }
        });
        getContentPane().add(btAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 140, 30));
        getContentPane().add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 230, -1));
        getContentPane().add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 230, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("amount");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 140, 20));
        getContentPane().add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 332, 230, 0));

        btUpdateStudent.setBackground(new java.awt.Color(0, 204, 102));
        btUpdateStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btUpdateStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btUpdateStudent.setText("Update payment");
        btUpdateStudent.setOpaque(true);
        btUpdateStudent.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btUpdateStudentAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btUpdateStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUpdateStudentMouseClicked(evt);
            }
        });
        getContentPane().add(btUpdateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 160, 30));
        getContentPane().add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 230, -1));
        getContentPane().add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));
        getContentPane().add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 332, 230, 0));

        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 110, 30));
        getContentPane().add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 192, 230, -1));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 230, -1));

        PeymentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full", "half", " " }));
        PeymentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeymentComboActionPerformed(evt);
            }
        });
        getContentPane().add(PeymentCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 230, -1));

        Txtfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfeeActionPerformed(evt);
            }
        });
        getContentPane().add(Txtfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 230, -1));

        txtsrach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrachActionPerformed(evt);
            }
        });
        txtsrach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsrachKeyReleased(evt);
            }
        });
        getContentPane().add(txtsrach, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 160, -1));

        txtPeymentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeymentIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtPeymentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 230, -1));

        txtGonTAx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGonTAxActionPerformed(evt);
            }
        });
        getContentPane().add(txtGonTAx, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 230, -1));
        getContentPane().add(txtRegistratiaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 230, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("PaymentStatas");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 140, 20));

        txtpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaidActionPerformed(evt);
            }
        });
        getContentPane().add(txtpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 230, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("pdate");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 140, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("fee");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("peyment ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 110, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("GoVRate");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Registration ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("GovTax");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 70, -1));

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 40, -1, -1));
        getContentPane().add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 230, -1));
        getContentPane().add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, -1));
        getContentPane().add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 230, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("PaID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, -1));

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/student/icon/download (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 530));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 210, 240));
        getContentPane().add(email3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 230, -1));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 52, 230, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 230, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("PeymentDatedrop ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 217, 120, 20));
        getContentPane().add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 230, -1));
        getContentPane().add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 230, -1));
        getContentPane().add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 220, -1));
        getContentPane().add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 230, -1));
        getContentPane().add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddStudentMouseClicked
        try {
            paymentDTO peyment = new paymentDTO(
                    txtPeymentId.getText(),
                    txtRegistratiaID.getText(),
                    txtpaid.getText(),
                    Txtfee.getText(),
                    PeymentCombo.getSelectedItem().toString(),
                    txtdiscount.getText(),
                    jTextGonrate.getText(),
                    txtGonTAx.getText(),
                    txtdelayIntrst.getText(),
                    date.getDate().toString(),
                    pdate.getDate().toString(),
                    txtamount.getText(),
                    txtblase.getText(),
                    txtpaymentstatas.getText(),
                    txtDupaymentDate.getText());

            System.out.println("j");
            //txtdelayIntrst.getText());
            boolean result = peymentcotroller.add(peyment);
            System.out.println("result view " + result);
            if (result) {
                JOptionPane.showMessageDialog(this, "peyment has been successfully added...!");
            } else {
                JOptionPane.showMessageDialog(this, "peyment has not been added...!");
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

        paymentDTO peyment = new paymentDTO(
                txtPeymentId.getText(),
                txtRegistratiaID.getText(),
                txtpaid.getText(),
                Txtfee.getText(),
                PeymentCombo.getSelectedItem().toString(),
                txtdiscount.getText(),
                jTextGonrate.getText(),
                txtGonTAx.getText(),
                txtdelayIntrst.getText(),
                date.getDate().toString(),
                pdate.getDate().toString(),
                txtamount.getText(),
                txtblase.getText(),
                txtpaymentstatas.getText(),
                txtDupaymentDate.getText());
        try {
            System.out.println("Clickd");
            boolean result = peymentcotroller.update(peyment);
            System.out.println(result);

            if (result) {
                JOptionPane.showMessageDialog(this, "peyment has been successfully updated...!");
            } else {
                JOptionPane.showMessageDialog(this, "peyment has not been updated...!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btUpdateStudentMouseClicked

    private void txtPeymentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeymentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeymentIdActionPerformed

    private void txtGonTAxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGonTAxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGonTAxActionPerformed

    private void txtpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaidActionPerformed

    private void typecomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typecomboItemStateChanged
        txtwrite.setText("");
        this.searchType = (String) typecombo.getSelectedItem();
    }//GEN-LAST:event_typecomboItemStateChanged

    private void typecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typecomboActionPerformed

    private void txtwriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwriteActionPerformed
        addTableDetails();
    }//GEN-LAST:event_txtwriteActionPerformed

    private void txtwriteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwriteKeyPressed

    }//GEN-LAST:event_txtwriteKeyPressed

    private void txtwriteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwriteKeyReleased
        this.searchType = (String) typecombo.getSelectedItem();
        searchpaymentDetails1(searchType, txtwrite.getText());
    }//GEN-LAST:event_txtwriteKeyReleased

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed

    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txtdelayIntrstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdelayIntrstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdelayIntrstActionPerformed

    private void TxtfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfeeActionPerformed

    private void jTextGonrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGonrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGonrateActionPerformed

    private void txtpaymentstatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaymentstatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaymentstatasActionPerformed

    private void txtDupaymentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDupaymentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDupaymentDateActionPerformed

    private void txtsrachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrachActionPerformed
        //  Studentserach ();
    }//GEN-LAST:event_txtsrachActionPerformed

    private void txtsrachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrachKeyReleased
        // Str
    }//GEN-LAST:event_txtsrachKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String sid = txtsrach.getText();
            RegistrationDTO register = registrationController.search(sid);
            if (register != null) {

                txtRegistratiaID.setText(register.getRID());
                Txtfee.setText(register.getFee());

            } else {
                JOptionPane.showMessageDialog(null, "Student not Registerd Before...");
            }
        } catch (Exception ex) {
            Logger.getLogger(peyment.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void PeymentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeymentComboActionPerformed
      /*  if (jCheckBox2. ()) {
            double dis = ((Double.parseDouble(Txtfee.getText()) * Double.parseDouble(txtdiscount.getText())) / 100);
            double disamount = (Double.parseDouble(txtdiscount.getText())) - (dis);
            double gtaxs = (((disamount) * Double.parseDouble(txtGonTAx.getText())) / 100);
            double asd = (disamount) + (gtaxs);
            txttotal.setText(asd + "");
            jTextField1.setText("0");
        }*/
    }//GEN-LAST:event_PeymentComboActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    if (jCheckBox1.isSelected())  {
            double dis = ((Double.parseDouble(Txtfee.getText()) * Double.parseDouble(txtdiscount.getText())) / 100);
            double disamount = (Double.parseDouble(txtdiscount.getText())) - (dis);
            double gtaxs = (((disamount) * Double.parseDouble(txtGonTAx.getText())) / 100);
            double asd = (disamount) + (gtaxs);
          txtamount.setText(asd + "");
            txtpaymentstatas.setText("0");
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(peyment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peyment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peyment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peyment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peyment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PeymentCombo;
    private javax.swing.JTextField Txtfee;
    private javax.swing.JLabel btAddStudent;
    private javax.swing.JLabel btUpdateStudent;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField email3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextGonrate;
    private javax.swing.JTextField txtDupaymentDate;
    private javax.swing.JTextField txtGonTAx;
    private javax.swing.JTextField txtPeymentId;
    private javax.swing.JTextField txtRegistratiaID;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtblase;
    private javax.swing.JTextField txtdelayIntrst;
    private javax.swing.JTextField txtdiscount;
    private javax.swing.JTextField txtpaid;
    private javax.swing.JTextField txtpaymentstatas;
    private javax.swing.JTextField txtsrach;
    private javax.swing.JTextField txtwrite;
    private javax.swing.JComboBox typecombo;
    // End of variables declaration//GEN-END:variables

    public void getStudentDetails(StudentDTO studentDTO) {
        if (null != studentDTO) {
            studentDTO1 = studentDTO;

        }

    }

    private void getAllPeymentDetails() {
        try {
            this.peymenttList = (ArrayList<paymentDTO>) peymentcotroller.getAll();

            DefaultTableModel dtm = (DefaultTableModel) peymentTable.getModel();

            dtm.setRowCount(0);

            for (paymentDTO peyment : peymenttList) {

                Object[] rowData = {peyment.getPID(),
                    peyment.getRID(),
                    peyment.getPaID(),
                    peyment.getFee(),
                    peyment.getPtype(),
                    peyment.getDiscount(),
                    peyment.getGon_tax(),
                    peyment.getGon_rate(),
                    peyment.getDelay_Intrest(),
                    peyment.getPDate(),
                    peyment.getDate(),
                    peyment.getAmount(),
                    peyment.getBlasce(),
                    peyment.getPaymentstatas(),
                    peyment.getDuepaymentDate(),};

                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void IDGenarator() {

        try {
            txtPeymentId.setText(IDGenarator.getNewID("payment", " PID", "P"));
        } catch (SQLException ex) {
            Logger.getLogger(peyment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(peyment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchpaymentDetails1(String type, String searchText) {

        System.out.println("T" + searchType);
        System.out.println("st" + searchText);
        System.out.println("sL" + peymenttList);
        System.out.println("Result  " + type.equals("RegistrationID"));
        if (type.equals("P")) {

            searchpeymentList = new ArrayList<>();
            for (paymentDTO paymentDTO : peymenttList) {
                if (paymentDTO.getRID().toLowerCase().contains(searchText.toLowerCase())) {
                    searchpeymentList.add(paymentDTO);

                }
            }
        } else if (type.equals("fee")) {
            searchpeymentList = new ArrayList<>();
            for (paymentDTO paymentDTO : peymenttList) {
                if (paymentDTO.getFee().toLowerCase().contains(searchText.toLowerCase())) {
                    searchpeymentList.add(paymentDTO);
                }
            }
        } else if (type.equals("paymenttype")) {
            searchpeymentList = new ArrayList<>();
            for (paymentDTO paymentDTO : peymenttList) {
                if (paymentDTO.getPtype().toLowerCase().contains(searchText.toLowerCase())) {
                    searchpeymentList.add(paymentDTO);
                }
            }
        } else if (type.equals("Blasce")) {
            searchpeymentList = new ArrayList<>();
            for (paymentDTO paymentDTO : peymenttList) {
                if (paymentDTO.getBlasce().toLowerCase().contains(searchText.toLowerCase())) {
                    searchpeymentList.add(paymentDTO);
                }
            }

        } else if (type.equals("Discount")) {
            searchpeymentList = new ArrayList<>();
            for (paymentDTO paymentDTO : peymenttList) {
                if (paymentDTO.getDiscount().toLowerCase().contains(searchText.toLowerCase())) {
                    searchpeymentList.add(paymentDTO);
                }

            }
        } else if (type.equals("paymentstatas")) {
            searchpeymentList = new ArrayList<>();
            for (paymentDTO paymentDTO : peymenttList) {
                if (paymentDTO.getPaymentstatas().toLowerCase().contains(searchText.toLowerCase())) {
                    searchpeymentList.add(paymentDTO);

                }
            }
        } else if (type.equals("DuepaymentDate")) {
            searchpeymentList = new ArrayList<>();
            for (paymentDTO paymentDTO : peymenttList) {
                if (paymentDTO.getDuepaymentDate().toLowerCase().contains(searchText.toLowerCase())) {
                    searchpeymentList.add(paymentDTO);
                }
            }
            // } else if (type.equals("DuepaymentDate")) {
            //searchpeymentList = new ArrayList<>();
            //for (paymentDTO paymentDTO : peymenttList) {
            //  if (paymentDTO.getDiscount().toLowerCase().contains(searchText.toLowerCase())) {
            //   searchpeymentList.add(paymentDTO);

        }
        try {

            DefaultTableModel dtm = (DefaultTableModel) peymentTable.getModel();

            dtm.setRowCount(0);

            for (paymentDTO peyment : searchpeymentList) {

                Object[] rowData = {peyment.getPID(),
                    peyment.getRID(),
                    peyment.getPaID(),
                    peyment.getFee(),
                    peyment.getPtype(),
                    peyment.getDiscount(),
                    peyment.getGon_tax(),
                    peyment.getGon_rate(),
                    peyment.getDelay_Intrest(),
                    peyment.getPDate(),
                    peyment.getDate(),
                    peyment.getAmount(),
                    peyment.getBlasce(),
                    peyment.getPaymentstatas(),
                    peyment.getDuepaymentDate(),};
                System.out.println("sL" + rowData);
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void IDGenarator1() {

        try {
            txtpaid.setText(IDGenarator.getNewID("payment", " PaID", "P"));
        } catch (SQLException ex) {
            Logger.getLogger(peyment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(peyment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void addTableDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*  private void searchStudentDetails1() {
     String id=(String) jComboBox1.getSelectedItem();
        try {
            re
            txtsrach.setText(speciality.getNic());
        } catch (Exception ex) {
            Logger.getLogger(peyment.class.getName()).log(Level.SEVERE, null, ex);
      
    
}*/

//private void searchStudentDetails1() {
//   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
// }

