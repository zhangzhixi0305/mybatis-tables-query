package com.zhixi.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName T_ORDER
 */
@TableName(value ="T_ORDER")
@Data
public class Order implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID")
    private Long id;

    /**
     * 下单时间
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)// 反序列化
    @JsonSerialize(using = LocalDateTimeSerializer.class)// 序列化
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")// 对入参进行格式化
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 对出参进行格式化
    @TableField(value = "F_ORDER_TIME")
    private LocalDateTime orderTime;

    /**
     * 下单金额
     */
    @TableField(value = "F_TOTAL")
    private String total;

    /**
     * 下单用户
     */
    @TableField(value = "F_USER_ID")
    private Long userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}