package com.lit.controller;

import com.lit.dao.UserDao;
import com.lit.entry.User;
import com.lit.mapper.UserMapper;
import com.lit.pojo.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lijun
 * @date 2020/1/11 10:52
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/user/list")
    private List<User> showUserList(){
        return userDao.findAll();
    }

    @RequestMapping("/get")
    private List<MUser> getUserList(){
        return userMapper.getUserList();
    }


}
