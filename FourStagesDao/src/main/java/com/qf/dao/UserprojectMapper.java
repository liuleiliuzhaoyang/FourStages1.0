package com.qf.dao;

import java.util.List;

import com.qf.pojo.UserprojectExample;
import com.qf.pojo.UserprojectKey;
import org.apache.ibatis.annotations.Param;

public interface UserprojectMapper {
    int countByExample(UserprojectExample example);

    int deleteByExample(UserprojectExample example);

    int deleteByPrimaryKey(UserprojectKey key);

    int insert(UserprojectKey record);

    int insertSelective(UserprojectKey record);

    List<UserprojectKey> selectByExample(UserprojectExample example);

    int updateByExampleSelective(@Param("record") UserprojectKey record, @Param("example") UserprojectExample example);

    int updateByExample(@Param("record") UserprojectKey record, @Param("example") UserprojectExample example);
}