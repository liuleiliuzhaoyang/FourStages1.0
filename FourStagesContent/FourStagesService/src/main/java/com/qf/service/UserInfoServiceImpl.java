package com.qf.service;

import com.qf.dao.UserinfoMapper;
import com.qf.pojo.Userinfo;
import com.qf.pojo.UserinfoExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoServiceImpl implements  UserInfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;

    public List<Userinfo> selectByExample(UserinfoExample example) {
        return userinfoMapper.selectByExample(example);
    }
//    public ArrayList<Userinfo> getAllUser() {
//        UserinfoExample userinfoExample = new UserinfoExample();
//        return (ArrayList<Userinfo>) userinfoMapper.selectByExample(userinfoExample);
//    }

}
