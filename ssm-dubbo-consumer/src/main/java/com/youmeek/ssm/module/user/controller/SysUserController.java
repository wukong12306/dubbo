package com.youmeek.ssm.module.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.search.dubbo.pojo.User;
import com.search.dubbo.service.UserService;
import com.youmeek.ssm.module.user.pojo.SysUser;
import com.youmeek.ssm.module.user.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.Date;

@Controller
@RequestMapping("/sysUserController")
public class SysUserController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SysUserController.class);
	@Autowired
	private UserService userService;

	@Resource
	private SysUserService sysUserService;


	@RequestMapping("/showUserToJSONById/{userId}")
	@ResponseBody
	public SysUser showUser(@PathVariable("userId") Long userId){
		SysUser user = sysUserService.getById(userId);
		return user;
	}
	
	
	@RequestMapping("/test-logback")
	@ResponseBody
	public Date testLogback(){
		LOG.trace("-----------------------------------trace");
		LOG.debug("-----------------------------------debug");
		LOG.info("-----------------------------------info");
		LOG.warn("-----------------------------------warn");
		LOG.error("-----------------------------------error");
		return new Date();
	}

	@RequestMapping("/test")
	@ResponseBody
	public Date test(){

		User byId = userService.getById("2");
		System.out.println(byId.getId());
		return new Date();
	}


}
