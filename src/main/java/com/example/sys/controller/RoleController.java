package com.example.sys.controller;

import com.example.common.domain.Resp;
import com.example.sys.domain.MenuEntity;
import com.example.sys.domain.RoleEntity;
import com.example.sys.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 角色信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:19
 */
@RestController
@RequestMapping("sys/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/list")
    public Resp<List<RoleEntity>> list() {
        List<RoleEntity> roleEntityList = roleService.list();
        return Resp.ok(roleEntityList);
    }

    @GetMapping("/roleRelatedMenu")
    public Resp<List<MenuEntity>> roleRelatedMenu(Long roleId) {
        RoleEntity roleEntity = roleService.getById(roleId);
        List<MenuEntity> menuEntityList = Optional.ofNullable(roleEntity).map(RoleEntity::getMenuEntityList).orElseGet(() -> new ArrayList<MenuEntity>());
        return Resp.ok(menuEntityList);
    }

}
