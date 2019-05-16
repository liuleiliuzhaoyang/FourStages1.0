package com.qf.service;

import com.qf.dao.UserinfoMapper;
import com.qf.dto.UserInfoDto;
import com.qf.pojo.Userinfo;
import com.qf.pojo.UserinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements  UserInfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;

    public List<Userinfo> selectByExample(UserinfoExample example) {
        return userinfoMapper.selectByExample(example);
    }

    public UserInfoDto selectUserinfoBankcart(Integer userid) {
        return userinfoMapper.selectUserinfoBankcart(userid);
    }
    @Override
    public boolean insertUserInfo(Userinfo userinfo) {
        return userinfoMapper.insert(userinfo)>0;
    }

    @Override
    public Userinfo getUserByTel(String usertel) {
        return userinfoMapper.getUserTel(usertel);
    }
//    public ArrayList<Userinfo> getAllUser() {
//        UserinfoExample userinfoExample = new UserinfoExample();
//        return (ArrayList<Userinfo>) userinfoMapper.selectByExample(userinfoExample);
//    }

}
