package com.qf.service;

import com.qf.dto.UserInfoDto;
import com.qf.pojo.Userinfo;
import com.qf.pojo.UserinfoExample;

import java.util.List;

public interface UserInfoService {
    //先查询所有的用户
    List<Userinfo> selectByExample(UserinfoExample example);

    UserInfoDto selectUserinfoBankcart(Integer userid);
    //插入一个用户
    boolean insertUserInfo(Userinfo userinfo);
    //通过电话号查询出一个用户
    Userinfo getUserByTel(String usertel);
}
