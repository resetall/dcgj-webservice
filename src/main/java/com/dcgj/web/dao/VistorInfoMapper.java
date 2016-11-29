package com.dcgj.web.dao;

import com.dcgj.web.entity.VistorInfo;

import java.util.List;

public interface VistorInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VistorInfo record);

    int insertSelective(VistorInfo record);

    VistorInfo selectByPrimaryKey(Integer id);

    List<VistorInfo> selectAllVistorInfos();

    List<VistorInfo> selectByIsReplay(Integer status);

    int updateByPrimaryKeySelective(VistorInfo record);

    int updateByPrimaryKey(VistorInfo record);
}