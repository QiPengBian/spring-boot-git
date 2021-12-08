package com.example.sys.controller;

import com.example.common.domain.Resp;
import com.example.sys.domain.RoleEntity;
import com.example.sys.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:19
 */
@RestController("sys/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/list")
    public Resp<List<RoleEntity>> list() {
        List<RoleEntity> roleEntityList = roleService.list();
        return Resp.ok(roleEntityList);
    }

}
