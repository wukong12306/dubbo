package com.youmeek.ssm.module.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.search.dubbo.pojo.User;
import com.search.dubbo.service.UserService;
import com.youmeek.ssm.module.user.mapper.SysUserMapper;
import com.youmeek.ssm.module.user.pojo.SysUser;
import com.youmeek.ssm.module.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Reference
	private SysUserMapper sysUserMapper;

	@Reference
	UserService userService;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public String get(String id) {
		return null;
	}


}
