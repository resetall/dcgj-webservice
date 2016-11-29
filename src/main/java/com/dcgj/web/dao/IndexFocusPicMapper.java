package com.dcgj.web.dao;

import com.dcgj.web.entity.IndexFocusPic;

public interface IndexFocusPicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IndexFocusPic record);

    int insertSelective(IndexFocusPic record);

    IndexFocusPic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndexFocusPic record);

    int updateByPrimaryKey(IndexFocusPic record);
}