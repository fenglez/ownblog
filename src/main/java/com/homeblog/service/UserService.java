package com.homeblog.service;

import com.homeblog.bo.User;
import com.homeblog.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;
    public User getUserDetail(long id){
        User user = userDAO.getUserById(id);
        return  user;
    }


}
