package com.zz.module.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zz.module.user.pojo.User;
import org.springframework.stereotype.Repository;

/*防止idea报错*/
@Repository
public interface UserMapper extends BaseMapper<User> {
//    User findById(Long id);
    IPage<User> findById(Page page);
}
