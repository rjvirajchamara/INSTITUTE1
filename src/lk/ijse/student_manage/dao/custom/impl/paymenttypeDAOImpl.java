/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.student_manage.dao.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.student_manage.dao.custom.paymenttypeDAO;
import lk.ijse.student_manage.dao.db.ConnectionFactory;
import lk.ijse.student_manage.dto.paymentTypeDTO;

/**
 *
 * @author Expression chamara is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class paymenttypeDAOImpl implements paymenttypeDAO{
    
    private Connection connection;

    public paymenttypeDAOImpl() {
        connection =ConnectionFactory.getInstance().getConnection();
    }
    
    

    @Override
    public boolean add(paymentTypeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(paymentTypeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public paymentTypeDTO get(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<paymentTypeDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
