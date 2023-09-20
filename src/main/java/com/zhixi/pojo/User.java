package com.zhixi.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName T_USER
 */
@TableName(value = "T_USER")
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "ID")
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "F_NAME")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "F_AGE")
    private String age;

    /**
     * 性别
     */
    @TableField(value = "F_SEX")
    private String sex;

    /**
     * 地址
     */
    @TableField(value = "F_ADDRESS")
    private String address;

    @TableField(exist = false)

    private static final long serialVersionUID = 1L;
}