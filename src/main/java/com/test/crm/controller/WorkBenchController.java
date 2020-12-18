package com.test.crm.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author Alex
 * @Date 2020/12/4 16:33
 * @Version 1.0
 */
@Controller
@RequestMapping("/workbench")
public class WorkBenchController {

    private static final Log log = LogFactory.getLog(WorkBenchController.class);

    @GetMapping("/index")
    public ModelAndView Index(HttpServletRequest request) {
        log.info("进入WorkBenchController的index方法：");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("workbench/index");

        return modelAndView;
    }
}
