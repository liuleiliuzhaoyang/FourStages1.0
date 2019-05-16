package com.qf.service;

import com.qf.dto.AccountDto;

import java.util.List;

public interface AccountService {
    List<AccountDto> selectSiBiaoLianChan(Integer userid);
}
