package com.example.sys.controller;

import com.example.sys.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户角色关联表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@RestController("sys/userrole")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

}
