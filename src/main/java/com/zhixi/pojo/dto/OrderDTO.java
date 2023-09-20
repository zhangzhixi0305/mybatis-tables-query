package com.zhixi.pojo.dto;

import com.zhixi.pojo.Order;
import com.zhixi.pojo.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description 订单DTO
 * @date 2023-09-18 9:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderDTO extends Order {

    /**
     * 下单用户
     */
    User user;
}
