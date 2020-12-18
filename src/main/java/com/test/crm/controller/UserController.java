package com.test.crm.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.crm.pojo.User;
import com.test.crm.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Alex
 * @Date 2020/12/4 10:32
 * @Version 1.0
 */

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Log log = LogFactory.getLog(UserController.class);

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public String hello(@RequestBody User user) {
        log.info("进入到UserController的login方法");
        Map<String, String> map = new HashMap<>();
        map.put("message", "处理结果");
        int size = 0;
        user = userService.login(user);
        if (user == null) {
            map.put("message", "账号密码错误");
            map.put("code", "300");
            return JSONObject.toJSONString(map);
        }
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        map.put("message", "登陆成功");
        map.put("code", "200");
        return JSONObject.toJSONString(map);
    }

}

