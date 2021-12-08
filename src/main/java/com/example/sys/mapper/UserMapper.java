package com.example.sys.mapper;

import com.example.sys.domain.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息表
 * 
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
