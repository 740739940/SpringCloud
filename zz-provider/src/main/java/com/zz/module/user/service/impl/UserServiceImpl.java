package com.zz.module.user.service.impl;

import com.zz.module.user.mapper.UserMapper;
import com.zz.module.user.pojo.User;
import com.zz.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: zhangzhao
 * @Date: 2019-07-26 16:30
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Long id) {
        User user = userMapper.findById(id);
        return user;
    }
}