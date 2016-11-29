package com.dcgj.web.dao;

import com.dcgj.web.entity.BrandNew;

import java.util.List;

public interface BrandNewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrandNew record);

    int insertSelective(BrandNew record);

    BrandNew selectByPrimaryKey(Integer id);

    List<BrandNew> selectNewsGroupByDate();

    int updateByPrimaryKeySelective(BrandNew record);

    int updateByPrimaryKeyWithBLOBs(BrandNew record);

    int updateByPrimaryKey(BrandNew record);
}