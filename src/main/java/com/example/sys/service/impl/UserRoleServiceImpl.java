package com.example.sys.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.sys.mapper.UserRoleMapper;
import com.example.sys.domain.UserRoleEntity;
import com.example.sys.service.UserRoleService;

/**
 * 用户角色关联表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleEntity> implements UserRoleService {

}