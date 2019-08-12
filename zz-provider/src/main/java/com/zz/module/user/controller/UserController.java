package com.zz.module.user.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zz.module.user.pojo.User;
import com.zz.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zhangzhao
 * @Date: 2019-08-09 09:09
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    private IPage<User> getUser(){
        IPage<User> user = userService.getById(1L);
        return user;
    }
}