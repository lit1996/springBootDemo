package com.lit.controller;

import com.lit.dao.UserDao;
import com.lit.entry.User;
import com.lit.mapper.UserMapper;
import com.lit.pojo.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lit
 * @date 2020/1/11 13:46:59
 */
@Controller
public class PageController {
    @Autowired
    private UserDao userDao;
    @Value("${page.rows}")
    private Integer rows;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("page")
    public String showUserList(Model model){
        List<MUser> userList = userMapper.getUserList();
        model.addAttribute("userList", userList);
        return "user";
    }

    @RequestMapping("rows")
    @ResponseBody
    public Integer showUserList(){
        return rows;
    }


}
