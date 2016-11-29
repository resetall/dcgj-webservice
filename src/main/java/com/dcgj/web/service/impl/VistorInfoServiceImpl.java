package com.dcgj.web.service.impl;

import com.dcgj.web.dao.VistorInfoMapper;
import com.dcgj.web.entity.VistorInfo;
import com.dcgj.web.service.IVistorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 下午5:12
 * Desc:
 */

@Service("vistorInfoService")
public class VistorInfoServiceImpl implements IVistorInfoService{

    @Autowired
    private VistorInfoMapper mapper;

    public int commitVistorInfo(VistorInfo vistor) {
        return mapper.insert(vistor);
    }

    public List<VistorInfo> getAllVistorInfos() {
        return null;
    }

    public List<VistorInfo> getVistorInfosByIsReplay(Integer status) {
        return null;
    }
}
