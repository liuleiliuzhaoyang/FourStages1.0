package com.qf.service;

import com.qf.pojo.Userinfo;
import com.qf.pojo.UserinfoExample;

import java.util.List;

public interface UserInfoService {
    //先查询所有的用户
    List<Userinfo> selectByExample(UserinfoExample example);
}
