package com.example.sys.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 菜单信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@TableName("sys_menu")
public class MenuEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 菜单ID
	 */
	@TableId
	private Long id;
	/**
	 * 菜单名称
	 */
	@TableField(value = "menu_name")
	private String menuName;
	/**
	 * 菜单路径
	 */
	@TableField(value = "menu_path")
	private String menuPath;

	public static final String ID = "id";

	public static final String MENU_NAME = "menu_name";

	public static final String MENU_PATH = "menu_path";

}
