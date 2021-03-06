package com.example.sys.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 用户信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonIgnoreProperties(value = {"handler"})
@TableName(value = "sys_user", resultMap = "userMap")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户名
	 */
	@TableField(value = "username")
	private String username;
	/**
	 * 密码
	 */
	@TableField(value = "password")
	private String password;
	/**
	 * 是否有效：0-无效，1-有效
	 */
	@TableField(value = "enabled")
	private Integer enabled;

	private List<RoleEntity> roleEntityList;

	public static final String ID = "id";

	public static final String USERNAME = "username";

	public static final String PASSWORD = "password";

	public static final String ENABLED = "enabled";

}
