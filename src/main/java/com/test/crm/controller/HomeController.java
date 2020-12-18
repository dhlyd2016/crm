package com.test.crm.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Alex
 * @Date 2020/12/4 16:02
 * @Version 1.0
 */
@Controller
public class HomeController {
    private static final Log log = LogFactory.getLog(HomeController.class);
    @RequestMapping(value = "/")
    public String homePage() {
        return "login";
    }
}
