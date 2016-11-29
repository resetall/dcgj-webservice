package com.dcgj.web.dao;

import com.dcgj.web.entity.DesignerWorks;

public interface DesignerWorksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DesignerWorks record);

    int insertSelective(DesignerWorks record);

    DesignerWorks selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DesignerWorks record);

    int updateByPrimaryKey(DesignerWorks record);
}