package com.qf.service;

import com.qf.dao.BankcartMapper;
import com.qf.pojo.Bankcart;
import com.qf.pojo.BankcartExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankcartServiceImpl implements BankcartService {
    @Autowired
    private BankcartMapper bankcartMapper;
    public int insert(Bankcart record) {
        return bankcartMapper.insert(record);
    }

    public int insertSelective(Bankcart record) {
        return bankcartMapper.insertSelective(record);
    }

    public List<Bankcart> selectByExample(BankcartExample example) {
        return bankcartMapper.selectByExample(example);
    }

    public Bankcart selectByPrimaryKey(Integer bcid) {
        return bankcartMapper.selectByPrimaryKey(bcid);
    }

    public Bankcart selectByPrimaryKeyUserid(Integer userid) {
        return bankcartMapper.selectByPrimaryKeyUserid(userid);
    }

    public int updatBankcartuserid(Bankcart bankcart) {
        return bankcartMapper.updatBankcartuserid(bankcart);
    }
}
