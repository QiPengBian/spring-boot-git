package com.example.sys.controller;

import com.example.sys.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 菜单信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:19
 */
@RestController("sys/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

}
