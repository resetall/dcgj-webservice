package com.dcgj.web.dao;

import com.dcgj.web.entity.DecorItem;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface DecorItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DecorItem record);

    int insertSelective(DecorItem record);

    List<DecorItem> selectByTags(@Param(value="tags")String tags);

    List<DecorItem> selectAllRecord();

    DecorItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DecorItem record);

    int updateByPrimaryKey(DecorItem record);
}