package com.example.sys.mapper;

import com.example.sys.domain.RoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色信息表
 * 
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:19
 */
@Mapper
public interface RoleMapper extends BaseMapper<RoleEntity> {
	
}
