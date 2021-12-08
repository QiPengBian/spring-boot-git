package com.example.sys.mapper;

import com.example.sys.domain.RoleMenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色菜单关联表
 * 
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenuEntity> {
	
}
