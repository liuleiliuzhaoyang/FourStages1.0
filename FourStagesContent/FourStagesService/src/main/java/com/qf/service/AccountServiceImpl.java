package com.qf.service;

import com.qf.dao.AccountMapper;
import com.qf.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    public List<AccountDto> selectSiBiaoLianChan(Integer userid) {
        return accountMapper.selectSiBiaoLianChan(userid);
    }
}
