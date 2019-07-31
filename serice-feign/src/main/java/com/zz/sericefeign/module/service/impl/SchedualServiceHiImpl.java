package com.zz.sericefeign.module.service.impl;

import com.zz.sericefeign.module.service.SchedualServiceHi;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: zhangzhao
 * @Date: 2019-07-29 17:54
 **/
@Service
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}