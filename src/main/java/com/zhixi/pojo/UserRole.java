package com.zhixi.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2023-09-20 12:55
 */
@TableName("T_USER_ROLE")
@Data
public class UserRole {
    /**
     * 主键
     */
    @TableId(value = "ID")
    private Long id;

    @TableField(value = "F_USER_ID")
    private Long userId;

    @TableField(value = "F_ROLE_ID")
    private Long roleId;
}
