package com.test.crm.interceptor;

import com.test.crm.controller.HomeController;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author Alex
 * @Date 2020/12/15 13:31
 * @Version 1.0
 */
public class TestInterceptor implements HandlerInterceptor {

    private static final Log log = LogFactory.getLog(TestInterceptor.class);

    //在目标方法执行之前运行此方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("进入到拦截器========================");
        HttpSession session = request.getSession();
        String loginUser = (String) session.getAttribute("user");
        if (StringUtils.isEmpty(loginUser)) {
            //说明用户未登陆
            request.setAttribute("msg", "没有相应权限请先登陆");
            request.getRequestDispatcher("/user/login").forward(request, response);
            log.info(request.getAttribute("msg"));
            return false;
        }
        return true;
    }
}
