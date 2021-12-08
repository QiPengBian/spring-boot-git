package com.example.sys.controller;

import com.example.common.domain.Resp;
import com.example.sys.domain.UserEntity;
import com.example.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@RestController("sys/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Resp<List<UserEntity>> list() {
        List<UserEntity> userEntityList = userService.list();
        return Resp.ok(userEntityList);
    }

}
