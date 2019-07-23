/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.student_manage.service.custom.Impl;

import java.util.ArrayList;
import lk.ijse.student_manage.dao.DAOFactory;
import lk.ijse.student_manage.dao.custom.StudentDAO;
import lk.ijse.student_manage.dto.StudentDTO;
import lk.ijse.student_manage.dto.SuperDTO;
import lk.ijse.student_manage.service.custom.StudentService;

/**
 *
 * @author chamara
 */
public class StudentServiceImpl implements StudentService{
   
    private StudentDAO studentDAO;
    
    public StudentServiceImpl(){
        
         studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    }

    @Override
    public boolean add(StudentDTO dto) throws Exception {
        return studentDAO.add(dto);
    }

    @Override
    public boolean update(StudentDTO dto) throws Exception {
        return studentDAO.update(dto);
    }

    @Override
    public boolean delete(String key) throws Exception {
        return studentDAO.delete(key);
    }

    @Override
    public StudentDTO get(String key) throws Exception {
        return  studentDAO.get(key);
    }

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
        return  studentDAO.getAll();
    }

}