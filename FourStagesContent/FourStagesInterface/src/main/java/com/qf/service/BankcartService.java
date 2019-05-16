package com.qf.service;

import com.qf.pojo.Bankcart;
import com.qf.pojo.BankcartExample;

import java.util.List;

public interface BankcartService {

    int insert(Bankcart record);

    int insertSelective(Bankcart record);

    List<Bankcart> selectByExample(BankcartExample example);

    Bankcart selectByPrimaryKey(Integer bcid);

    Bankcart selectByPrimaryKeyUserid(Integer userid);

    int updatBankcartuserid(Bankcart bankcart);
}
