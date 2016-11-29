package com.dcgj.web.dao;

import com.dcgj.web.entity.Designer;

public interface DesignerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Designer record);

    int insertSelective(Designer record);

    Designer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Designer record);

    int updateByPrimaryKey(Designer record);
}