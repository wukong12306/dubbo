package com.youmeek.ssm;

import com.search.dubbo.pojo.User;
import com.search.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboTest {
    public static void main(String[] args){
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext*.xml");
        context.start();
        //获取接口
        UserService userService = (UserService) context.getBean("userService");

        User byId = userService.getById("1");
        System.out.println(byId.getId());

    }
}
