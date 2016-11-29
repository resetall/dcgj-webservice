package com.dcgj.web.dao;

import com.dcgj.web.entity.DecorDict;

public interface DecorDictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DecorDict record);

    int insertSelective(DecorDict record);

    DecorDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DecorDict record);

    int updateByPrimaryKey(DecorDict record);
}