package com.homeblog.dao;

import com.homeblog.bo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public interface UserDAO {

    /*
    public List<User> getUser();

    /**
     *
     * @return
     */
    public User getUserById(long userId);
}
