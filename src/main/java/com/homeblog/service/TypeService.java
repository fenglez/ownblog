package com.homeblog.service;

import com.homeblog.bo.BlogType;
import com.homeblog.dao.TypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {

   @Autowired
   TypeDAO typeDAO;

   public BlogType getTypeDetail(long id){
        BlogType blogType = typeDAO.getById(id);
        return blogType;
    }
}
