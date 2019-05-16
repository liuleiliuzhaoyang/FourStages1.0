package com.qf.controller;

import com.qf.dto.UserInfoDto;
import com.qf.pojo.*;
import com.qf.service.IdentifyService;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
@RestController
public class UserInfoController {
    @Autowired
    private  UserInfoService userInfoService;
    @Autowired
    private IdentifyService identifyService;
    @RequestMapping("selectUserinfoBankcart")
    public UserInfoDto selectUserinfoBankcart(HttpSession session){
        Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
        Integer userid = userinfo.getUserid();
        Bankcart bankcart = new Bankcart();
        bankcart.setUserid(userid);
        return userInfoService.selectUserinfoBankcart(userid);
    }
    @RequestMapping("zhuce")
    @ResponseBody
    public boolean zhuZe(@RequestBody Userinfo userinfo, HttpSession session){
        String usertel = userinfo.getUsertel();
        //先用电话号码将用户的真实信息给查出来
        Identify realIdentify = identifyService.getIdentifyTel(usertel);
        if(realIdentify!=null) {
            if ((realIdentify.getIdentifyname().equals(userinfo.getUserrname())) && (realIdentify.getIdentifycode().equals(userinfo.getUseridentify()))) {
                //则说明是真实身份 然后注册成功
                boolean b = userInfoService.insertUserInfo(userinfo);
                //注册成功之后  将对象直接存到session里面
                session.setAttribute("userinfo", userinfo);
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }
    @PostMapping("/login")
    @ResponseBody
    public boolean dengLu(@RequestBody Login login, HttpSession session){
        //通过电话号码查找到整个对象
        Userinfo userinfo = userInfoService.getUserByTel(login.getUsertel());
        if((login.getUserpass()!=null)&&(userinfo!=null)){
            if(login.getUserpass().equals(userinfo.getUserpass())){
                //如果账号和密码匹配成功的时候
                //然后将其存储的session
                session.setAttribute("userinfo",userinfo);
                return true;
            }else{
                return false;

            }
        }else{
            return false;
        }
    }
}
