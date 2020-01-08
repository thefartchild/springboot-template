package com.adtech.data.controller;

import com.adtech.data.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：wx
 * @date ：2020/1/7 16:51
 * @description：
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "getUser")
    @ResponseBody
    public String getUser(){
        String a = JSONObject.toJSONString(userService.getUser());
        System.out.println(a);
        return a;
    }
}
