package com.dcgj.web.controller;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首页焦点图控制器
 *
 * @author cooper.Liu
 * @date 2016/9/5
 */
@Controller
public class IndexFocusPicController {

    @ResponseBody
    @RequestMapping(value = "index/getFocusPic", produces = "application/json;charset=UTF-8")
    public String getFocusPic(){
        return null;
    }

}
