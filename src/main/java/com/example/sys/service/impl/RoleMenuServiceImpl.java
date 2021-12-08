package com.example.sys.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.sys.mapper.RoleMenuMapper;
import com.example.sys.domain.RoleMenuEntity;
import com.example.sys.service.RoleMenuService;

/**
 * 角色菜单关联表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenuEntity> implements RoleMenuService {

}