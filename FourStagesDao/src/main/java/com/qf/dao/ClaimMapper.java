package com.qf.dao;

import java.util.List;

import com.qf.pojo.Claim;
import com.qf.pojo.ClaimExample;
import org.apache.ibatis.annotations.Param;

public interface ClaimMapper {
    int countByExample(ClaimExample example);

    int deleteByExample(ClaimExample example);

    int deleteByPrimaryKey(Integer claimid);

    int insert(Claim record);

    int insertSelective(Claim record);

    List<Claim> selectByExample(ClaimExample example);

    Claim selectByPrimaryKey(Integer claimid);

    int updateByExampleSelective(@Param("record") Claim record, @Param("example") ClaimExample example);

    int updateByExample(@Param("record") Claim record, @Param("example") ClaimExample example);

    int updateByPrimaryKeySelective(Claim record);

    int updateByPrimaryKey(Claim record);
}