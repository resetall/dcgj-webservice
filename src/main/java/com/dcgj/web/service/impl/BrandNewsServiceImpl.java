package com.dcgj.web.service.impl;

import com.dcgj.web.dao.BrandNewMapper;
import com.dcgj.web.entity.BrandNew;
import com.dcgj.web.service.IBrandNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 下午1:59
 * Desc:
 */
@Service("brandNewsService")
public class BrandNewsServiceImpl implements IBrandNewsService {

    @Autowired
    private BrandNewMapper mapper;

    public int addBrandNews(BrandNew brandNew) {
        try {
            int col = mapper.insertSelective(brandNew);
        } catch (Exception e){

        }
        return 0;
    }

    /**
     * 获取Brand页面新闻,按发布日期取降序的前4条
     * @return 新闻Item数组
     */
    public List<BrandNew> getBrandNews() {
        return mapper.selectNewsGroupByDate();
    }
}
