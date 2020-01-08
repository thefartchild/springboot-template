package com.adtech.data.mapper;

import com.adtech.data.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：wx
 * @date ：2020/1/7 16:46
 * @description：
 */
@Mapper
public interface UserMapper {
    public User getUser();
}
