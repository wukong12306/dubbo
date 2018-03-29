package com.search.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.search.dubbo.mapper.UserMapper;
import com.search.dubbo.pojo.User;
import com.search.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(version = "1.1")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getById(String id) {
        User userById = userMapper.getUserById(id);
        return userById;

    }
    //@Transactional(rollbackFor = Exception.class)
    public void test(){
        userMapper.insertUser(new User("122","张122"));
        int i = 1/0;
        userMapper.insertUser(new User("123","张123"));
    }
}
