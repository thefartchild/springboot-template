package com.adtech.data.service.impl;

import com.adtech.data.mapper.UserMapper;
import com.adtech.data.entity.User;
import com.adtech.data.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：wx
 * @date ：2020/1/7 16:50
 * @description：
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userDao;

    @Override
    public User getUser() {
        return userDao.getUser();
    }
}
