package com.example.demo1;

import com.search.dubbo.pojo.User;
import com.search.dubbo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
//@MapperScan("com.search.dubbo.mapper")
public class Demo1ApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		try {
			userService.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("失败");
	}

}
