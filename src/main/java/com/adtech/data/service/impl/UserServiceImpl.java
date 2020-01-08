package com.adtech.data.service.impl;

import com.adtech.data.mapper.BaseEntityMapper;
import com.adtech.data.mapper.UserMapper;
import com.adtech.data.entity.User;
import com.adtech.data.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ：wx
 * @date ：2020/1/7 16:50
 * @description：
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    BaseEntityMapper baseEntityMapper;

    @Override
    public User getUser() {
        List<Map<String,Object>> list = baseEntityMapper.getByCondition("name = '1'","user");
        System.out.println(list);
        return null;
    }
}
