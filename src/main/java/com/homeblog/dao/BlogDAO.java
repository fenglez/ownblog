package com.homeblog.dao;

import com.homeblog.bo.Blog;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface BlogDAO {

    public Blog getById(long id);

    public long save(Blog blog);

    @Select("SELECT * FROM blog WHERE user_id=#{userId}")
    public List<Blog> getBolgListByUser(int userId);


}
