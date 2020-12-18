package com.test.crm.service;

import com.test.crm.pojo.User;

/**
 * @Author Alex
 * @Date 2020/12/4 13:19
 * @Version 1.0
 */
public interface UserService {

    /**
     * 实现用户登陆
     * @param user
     * @return
     */
    User login(User user);
}
