package com.qf.dao;

import java.util.List;

import com.qf.pojo.Topup;
import com.qf.pojo.TopupExample;
import org.apache.ibatis.annotations.Param;

public interface TopupMapper {
    int countByExample(TopupExample example);

    int deleteByExample(TopupExample example);

    int deleteByPrimaryKey(Integer topupid);

    int insert(Topup record);

    int insertSelective(Topup record);

    List<Topup> selectByExample(TopupExample example);

    Topup selectByPrimaryKey(Integer topupid);

    int updateByExampleSelective(@Param("record") Topup record, @Param("example") TopupExample example);

    int updateByExample(@Param("record") Topup record, @Param("example") TopupExample example);

    int updateByPrimaryKeySelective(Topup record);

    int updateByPrimaryKey(Topup record);
}