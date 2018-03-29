package com.search.dubbo.mapper;

import com.search.dubbo.pojo.User;


public interface UserMapper {
    int insertUser(User user);
    User getUserById(String id);
}
