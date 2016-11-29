package com.dcgj.web.service;

import com.dcgj.web.entity.BrandNew;

import java.util.List;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 下午1:56
 * Desc:
 */
public interface IBrandNewsService {

    List<BrandNew> getBrandNews();

    int addBrandNews(BrandNew brandNews);

}
