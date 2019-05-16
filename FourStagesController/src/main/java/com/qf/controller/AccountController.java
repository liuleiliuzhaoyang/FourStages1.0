package com.qf.controller;

import com.qf.dto.AccountDto;
import com.qf.pojo.Bankcart;
import com.qf.pojo.Userinfo;
import com.qf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountServiceImpl;
    @RequestMapping("selectSiBiaoLianChan")
    @ResponseBody
    public List<AccountDto> selectSiBiaoLianChan(HttpSession session){
        Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
        Integer userid = userinfo.getUserid();
        return accountServiceImpl.selectSiBiaoLianChan(userid);
    }
}
