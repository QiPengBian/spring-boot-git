package com.example.sys.controller;

import com.example.common.domain.Resp;
import com.example.sys.domain.RoleEntity;
import com.example.sys.domain.UserEntity;
import com.example.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 用户信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@RestController
@RequestMapping("sys/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userRelatedRole")
    public Resp<List<RoleEntity>> userRelatedRole(Long userId) {
        UserEntity userEntity = userService.getById(userId);
        List<RoleEntity> roleEntityList = Optional.ofNullable(userEntity).map(UserEntity::getRoleEntityList).orElseGet(() -> new ArrayList<>());
        return Resp.ok(roleEntityList);
    }


}
