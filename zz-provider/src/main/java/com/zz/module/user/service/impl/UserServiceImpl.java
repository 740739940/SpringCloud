package com.zz.module.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    public IPage<User> getById(Long id) {
        Page<User> page = new Page<>();
        QueryWrapper qw = new QueryWrapper<>();
        page.setTotal(10);
        page.setPages(1);
        IPage<User> u = userMapper.findById(page);
        System.out.println(u);
        return u;
    }
}