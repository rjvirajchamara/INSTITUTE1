/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.student_manage.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.student_manage.dao.custom.peymentDAO;
import lk.ijse.student_manage.dao.db.ConnectionFactory;
import lk.ijse.student_manage.dto.StudentDTO;
import lk.ijse.student_manage.dto.paymentDTO;

/**
 *
 * @author Expression chamara is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class PeymentDAOImpl implements peymentDAO{
private Connection connection;

    public PeymentDAOImpl() {
        connection= ConnectionFactory.getInstance().getConnection();
    }

        
        
    
    @Override
    public boolean add(paymentDTO peyment) throws Exception {
        
        String SQL = "INSERT INTO  payment VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, peyment.getPID());
        stm.setObject(2, peyment.getRID());
        stm.setObject(3, peyment.getPaID());
        stm.setObject(4, peyment.getFee());
        stm.setObject(5, peyment.getPtype());
        stm.setObject(6, peyment.getDiscount());
        stm.setObject(7, peyment.getGon_tax());
        stm.setObject(8, peyment.getGon_rate());
        stm.setObject(9, peyment.getDelay_Intrest());
        stm.setObject(10, peyment.getPDate());
        stm.setObject(11, peyment.getDate());
        stm.setObject(12, peyment.getAmount());
        stm.setObject(13, peyment.getBlasce());
        stm.setObject(14, peyment.getPaymentstatas());
        stm.setObject(15, peyment.getDuepaymentDate());
        
        
       // stm.setObject(6, student.getGender());
        int res = stm.executeUpdate();
        System.out.println("result "+res);
        return (res > 0);
    }

    @Override
    public boolean update(paymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public paymentDTO get(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<paymentDTO> getAll() throws Exception {
        String sql = "Select * from  payment";
        Statement  preparedStatemen = connection.createStatement();
        ResultSet resultSet =  preparedStatemen.executeQuery(sql);
        ArrayList<paymentDTO> alpeyment = null;

        while (resultSet.next()) {

            if (alpeyment == null) {
                alpeyment = new ArrayList<>();
            }
            paymentDTO peyment = new paymentDTO(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getString(9),
                    resultSet.getString(10),
                    resultSet.getString(11),
                    resultSet.getString(12),
                    resultSet.getString(13), 
                    resultSet.getString(14), 
                    resultSet.getString(15));
        
            alpeyment.add(peyment);
    }
        return alpeyment;
}}

    


