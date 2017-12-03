package com.homeblog.service;

import com.homeblog.bo.Blog;
import com.homeblog.bo.User;
import com.homeblog.dao.BlogDAO;
import com.homeblog.dao.UserDAO;
import com.homeblog.model.FanClass;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BlogService {
    @Resource
    BlogDAO blogDAO;
    @Resource
    UserDAO userDAO;

    public FanClass<User,Blog> getBlogList(int userId) {
        List<Blog> blogs = blogDAO.getBolgListByUser(userId);
        User user = userDAO.getUserById(userId);
        FanClass<User,Blog> a =new FanClass<User,Blog>();
        a.setTt(blogs);
        a.setUser(user);
        return a;
    }
    public Blog getBlogDetail(long id) {
        Blog blog = blogDAO.getById(id);
        return blog;
    }

    public long save(Blog blog){
        return blogDAO.save(blog);

    }
}
