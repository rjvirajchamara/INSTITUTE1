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
import lk.ijse.student_manage.dao.custom.CourseDAO;
import lk.ijse.student_manage.dao.db.ConnectionFactory;
import lk.ijse.student_manage.dto.CoureDTO;

/**
 *
 * @author Expression chamara is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class CourseDAOImpl implements CourseDAO{

    private  Connection connection;

    public CourseDAOImpl() {
    
    
    connection = ConnectionFactory.getInstance().getConnection();
    }
    

    
    @Override
    public boolean add(CoureDTO coures) throws Exception {
        String SQL = "INSERT INTO coures VALUES (?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, coures.getCID());
        stm.setObject(2, coures.getCoursename());
        stm.setObject(3, coures.getDuration());
        stm.setObject(4, coures.getCourse_fee());
        stm.setObject(5, coures.getRegfee());
        stm.setObject(6, coures.getCStatas());
        stm.setObject(7, coures.getDiscount());
        
        int res = stm.executeUpdate();
        return (res > 0);
    
    }

    @Override
    public boolean update(CoureDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CoureDTO get(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CoureDTO> getAll() throws Exception {
         String sql = "Select * from  coures";
        Statement  preparedStatemen = connection.createStatement();
        ResultSet resultSet =  preparedStatemen.executeQuery(sql);
        ArrayList<CoureDTO> alcoure = null;

        while (resultSet.next()) {

            if (alcoure == null) {
                alcoure = new ArrayList<>();
            }
            CoureDTO coure = new CoureDTO(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    //resultSet.getString(7),
                    resultSet.getString(7));
        
            alcoure.add(coure);
    }
        return alcoure;
}}

           

