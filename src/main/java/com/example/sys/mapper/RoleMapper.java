package com.example.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sys.domain.MenuEntity;
import com.example.sys.domain.RoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:19
 */
@Mapper
public interface RoleMapper extends BaseMapper<RoleEntity> {

    List<MenuEntity> queryMenuByRoleId(@Param("roleId") Long roleId);

}
