package com.example;

import com.example.sys.domain.UserEntity;
import com.example.sys.mapper.RoleMapper;
import com.example.sys.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootGitApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleMapper roleMapper;

    @Test
    void contextLoads() {
        List<UserEntity> userEntityList = userService.list();
        userEntityList.forEach(System.out::println);
    }

}
