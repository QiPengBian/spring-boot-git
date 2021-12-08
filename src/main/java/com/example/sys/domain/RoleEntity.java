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
 * 角色信息表
 *
 * @author bianqipeng
 * @email bqp18975203048
 * @date 2021-12-08 11:06:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
// 处理序列化异常
@JsonIgnoreProperties(value = {"handler"})
@TableName(value = "sys_role", resultMap = "roleMap")
public class RoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableId
    private Long id;
    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    private String roleName;

    private List<MenuEntity> menuEntityList;

    public static final String ID = "id";

    public static final String ROLE_NAME = "role_name";

}
