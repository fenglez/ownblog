package com.homeblog.controller;

import com.homeblog.bo.Blog;
import com.homeblog.bo.User;
import com.homeblog.model.FanClass;
import com.homeblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Resource
    BlogService blogService;

    @RequestMapping("list/{userId}")
    public @ResponseBody FanClass<User,Blog> getList(@PathVariable("userId") int userId){
        if(userId <=0) {
            return null;
        }
        return blogService.getBlogList(userId);
    }

    @RequestMapping(value="/getById/{blogId}",method=RequestMethod.GET)
    public @ResponseBody String getById(@PathVariable("blogId") long id){
        Blog blog = blogService.getBlogDetail(id);
        return blog.toString();
    }

    @RequestMapping(value="/save",method=RequestMethod.POST)
    public @ResponseBody String saveBlog(@RequestBody Blog blog){
        return String.valueOf(blogService.save(blog));
    }
}
