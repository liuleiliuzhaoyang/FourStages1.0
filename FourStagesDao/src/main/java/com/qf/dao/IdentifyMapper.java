package com.qf.dao;

import com.qf.pojo.Identify;
import com.qf.pojo.IdentifyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IdentifyMapper {
    int countByExample(IdentifyExample example);

    int deleteByExample(IdentifyExample example);

    int deleteByPrimaryKey(Integer identifyid);

    int insert(Identify record);

    int insertSelective(Identify record);

    List<Identify> selectByExample(IdentifyExample example);

    Identify selectByPrimaryKey(Integer identifyid);

    int updateByExampleSelective(@Param("record") Identify record, @Param("example") IdentifyExample example);

    int updateByExample(@Param("record") Identify record, @Param("example") IdentifyExample example);

    int updateByPrimaryKeySelective(Identify record);

    int updateByPrimaryKey(Identify record);
    //通过电话号码tel 来查询一个真的身份认证对象
    Identify getIdentifyTel(String identifyTel);
}