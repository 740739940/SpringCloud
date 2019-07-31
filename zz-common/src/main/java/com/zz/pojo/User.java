package com.zz.pojo;

import lombok.Data;

/**
 * @Description:
 * @Author: zhangzhao
 * @Date: 2019-07-26 13:36
 **/
@Data
public class User {

    private Long id;

    private String userName;

    private String url;

    @Override
    public String toString(){
        return id + "==========" + "userName" + "===========" + url;

    }


}