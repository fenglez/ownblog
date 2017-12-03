package com.homeblog.controller;

import com.homeblog.bo.User;
import com.homeblog.service.UserService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getById/{userId}")
    public @ResponseBody String getById(@PathVariable("userId") long id){
        User user = userService.getUserDetail(id);
        return user.toString();
    }
}
