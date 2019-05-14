package com.qf.controller;

import com.qf.pojo.Userinfo;
import com.qf.pojo.UserinfoExample;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class UserInfoController {
    @Autowired
    private  UserInfoService userInfoService;
    @RequestMapping("aaa")
    public List<Userinfo> getAllUserinfo(){
        UserinfoExample userinfoExample = new UserinfoExample();
        System.out.println(userInfoService.selectByExample(userinfoExample));
        return userInfoService.selectByExample(userinfoExample);
    }
}
