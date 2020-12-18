package com.test.crm.service.impl;

import com.test.crm.dao.UserMapper;
import com.test.crm.pojo.User;
import com.test.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Alex
 * @Date 2020/12/4 13:20
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {

        User tbUser = null;
        return tbUser = userMapper.findUserByUserName(user);
    }
}
