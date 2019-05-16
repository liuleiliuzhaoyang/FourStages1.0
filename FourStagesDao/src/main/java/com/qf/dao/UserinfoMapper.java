package com.qf.dao;

import java.util.List;

import com.qf.dto.UserInfoDto;
import com.qf.pojo.Userinfo;
import com.qf.pojo.UserinfoExample;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    int countByExample(UserinfoExample example);

    int deleteByExample(UserinfoExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    List<Userinfo> selectByExample(UserinfoExample example);

    Userinfo selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);

    UserInfoDto selectUserinfoBankcart(Integer userid);
    //通过电话号码查找到整个对象
    Userinfo getUserTel(String usertel);
}