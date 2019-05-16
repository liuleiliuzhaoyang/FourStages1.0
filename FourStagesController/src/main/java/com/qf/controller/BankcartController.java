package com.qf.controller;

import com.qf.pojo.Bankcart;
import com.qf.pojo.BankcartExample;
import com.qf.pojo.Userinfo;
import com.qf.service.BankcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BankcartController {
    @Autowired
    private BankcartService bankcartService;
    @RequestMapping("insertBankcartSele")
    @ResponseBody
    public int insertBankcartSele(@RequestBody Bankcart bankcart,HttpSession session){
        Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
        Integer userid = userinfo.getUserid();
        Bankcart bankcart1 = new Bankcart();
        bankcart.setUserid(userid);
        return bankcartService.insertSelective(bankcart);
    }

    @RequestMapping("insertBankcart")
    @ResponseBody
    public int insertBankcart(@RequestBody Bankcart bankcart){
        return bankcartService.insert(bankcart);
    }


    @RequestMapping("selecttBankcart")
    @ResponseBody
    public List<Bankcart> selecttBankcart(){
        BankcartExample bankcartExample = new BankcartExample();
        return bankcartService.selectByExample(bankcartExample);
    }

    @RequestMapping("selecttBankcartById")
    @ResponseBody
    public Bankcart selecttBankcartById(@RequestParam Integer bcid){
        return bankcartService.selectByPrimaryKey(bcid);
    }

    @RequestMapping("selecttBankcartByIdUserId")
    @ResponseBody
    public Bankcart selecttBankcartByIdUserId(@RequestParam Integer userid){
        return bankcartService.selectByPrimaryKeyUserid(userid);
    }

    @RequestMapping("updatBankcartuserid")
    @ResponseBody
    public int updateByPrimaryKeyByUserid(@RequestBody Bankcart bankcart){
        System.out.println("==================="+bankcart);
        return bankcartService.updatBankcartuserid(bankcart);
    }


    @RequestMapping("selecttBankcartByIdUserIdaa")
    @ResponseBody
    public Bankcart selecttBankcartByIdUserIdaa(HttpSession session){
        Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
        Integer userid = userinfo.getUserid();
        return bankcartService.selectByPrimaryKeyUserid(userid);
    }

}
