package com.zhixi.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2023-09-20 12:53
 */
@TableName("T_ROLE")
@Data
public class Role {

    /**
     * 主键
     */
    @TableId(value = "ID")
    private Long id;

    /**
     * 角色名称
     */
    @TableField(value = "F_ROLE_NAME")
    private String roleName;
}
