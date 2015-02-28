package com.ovstech.dorado.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangxingyu on 2015/2/27.
 */
@Controller
@RequestMapping("/admin")
public class IndexController {

    @RequestMapping("/index.shtml")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
