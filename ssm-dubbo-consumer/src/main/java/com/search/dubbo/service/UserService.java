package com.search.dubbo.service;

import com.search.dubbo.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getListByName(String name);
    User getById(String id);
    //void test();
}
