package com.zz.module.user.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @Description:
 * @Author: zhangzhao
 * @Date: 2019-07-26 17:45
 **/
@Data
public class User {

    @TableField
    private Long id;

    private String userName;

    private String url;

    @Override
    public String toString(){
        return id + "==========" + "userName" + "===========" + url;

    }
}