package com.homeblog.controller;

import com.homeblog.bo.BlogType;
import com.homeblog.service.TypeService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/type")
public class TypeController {

    @Autowired
    TypeService typeService;
    @RequestMapping("getId/{typeId}")
    public @ResponseBody String getById(@PathVariable("typeId") long id){
        BlogType blogType = typeService.getTypeDetail(id);
        return blogType.toString();
    }
}
