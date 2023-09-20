package com.zhixi.pojo.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description 角色DTO
 * @date 2023-09-20 14:13
 */
@TableName("T_ROLE")
@Data
public class RoleDTO {

    /**
     * 角色名称
     */
    @TableField(value = "F_ROLE_NAME")
    private String roleName;
}
