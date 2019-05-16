package com.qf.service;

import com.qf.pojo.Identify;

public interface IdentifyService {
    //通过电话号码来查询一个对象
    public Identify getIdentifyTel(String identifyTel);
}
