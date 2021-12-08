package com.example.sys.controller;

import com.example.sys.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色菜单关联表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@RestController("sys/rolemenu")
public class RoleMenuController {

    @Autowired
    private RoleMenuService roleMenuService;

}
