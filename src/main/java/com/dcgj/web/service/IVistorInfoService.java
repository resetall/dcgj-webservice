package com.dcgj.web.service;

import com.dcgj.web.entity.VistorInfo;

import java.util.List;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 下午5:12
 * Desc:
 */
public interface IVistorInfoService {

    int commitVistorInfo(VistorInfo vistor);

    List<VistorInfo> getAllVistorInfos();

    List<VistorInfo> getVistorInfosByIsReplay(Integer status);

}
