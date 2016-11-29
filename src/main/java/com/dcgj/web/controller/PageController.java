package com.dcgj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 顶层国际家装页面视图管理器
 *
 * @author xav
 * @date 2016/8/18
 */
@Controller
public class PageController {
    /**
     * 一级页面——首页
     * @return index.html
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 一级页面——作品案例
     * @return design.html
     */
    @RequestMapping("/design")
    public String design(){
        return "design";
    }

    /**
     * 二级页面——风范大宅
     * @return design_decor.html
     */
    @RequestMapping("/decor")
    public String decor(){
        return "design_decor";
    }

    /**
     * 一级页面——家装体验馆
     * @return museum.html
     */
    @RequestMapping("/museum")
    public String museum(){
        return "museum";
    }

    /**
     * 一级页面——品牌实力
     * @return brand.html
     */
    @RequestMapping("/brand")
    public String brand(){
        return "brand";
    }

    /**
     * 一级页面——关于我们
     * @return aboutus.html
     */
    @RequestMapping("/aboutus")
    public String aboutus(){
        return "aboutus";
    }

}
