package com.zz.module.user.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zz.module.user.pojo.User;

public interface UserService {
    IPage<User> getById(Long id);
}
