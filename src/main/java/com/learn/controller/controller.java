package com.learn.controller;

import com.learn.dao.UserDao;
import com.learn.pojo.User;
import com.learn.service.test;
import com.learn.utils.SqlSessionFaction;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/controller")
public class controller {
    @Autowired
    public test tset;
    @RequestMapping("/test")
    public ModelAndView test()
    {
        SqlSession sqlSession = SqlSessionFaction.getSqlSessionFactory();
        System.out.println("执行了！");
        tset.tset();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> allUser = mapper.getAllUser();
        ModelAndView modelAndView = new ModelAndView();
        for(User user:allUser)
        {
            System.out.println(user.toString());
        }
        modelAndView.addObject("userList",allUser);
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
