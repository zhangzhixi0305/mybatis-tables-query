package com.zhixi.pojo.dto;

import com.zhixi.pojo.Order;
import com.zhixi.pojo.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description 一个用户对应多个订单
 * @date 2023-09-18 12:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserOrderDTO extends User {
    /**
     * 1:N，一个用户对应多个订单
     */
    List<Order> orders;
}
