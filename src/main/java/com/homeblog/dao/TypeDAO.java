package com.homeblog.dao;

import com.homeblog.bo.BlogType;
import org.springframework.stereotype.Service;

@Service
public interface TypeDAO {
    public BlogType getById(long id);
}
