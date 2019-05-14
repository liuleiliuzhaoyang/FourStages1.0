package com.qf.dao;

import com.qf.pojo.Bankcart;
import com.qf.pojo.BankcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankcartMapper {
    int countByExample(BankcartExample example);

    int deleteByExample(BankcartExample example);

    int deleteByPrimaryKey(Integer bcid);

    int insert(Bankcart record);

    int insertSelective(Bankcart record);

    List<Bankcart> selectByExample(BankcartExample example);

    Bankcart selectByPrimaryKey(Integer bcid);

    int updateByExampleSelective(@Param("record") Bankcart record, @Param("example") BankcartExample example);

    int updateByExample(@Param("record") Bankcart record, @Param("example") BankcartExample example);

    int updateByPrimaryKeySelective(Bankcart record);

    int updateByPrimaryKey(Bankcart record);
}