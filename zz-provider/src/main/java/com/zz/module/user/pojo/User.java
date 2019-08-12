package com.zz.module.user.pojo;

import lombok.Data;

/**
 * @Description:
 * @Author: zhangzhao
 * @Date: 2019-07-26 17:45
 **/
@Data
public class User {

//    @TableField
    private Long id;

    private String carNo;

    private String remark;
}