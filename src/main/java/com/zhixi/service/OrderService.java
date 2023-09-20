package com.zhixi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhixi.pojo.Order;
import com.zhixi.pojo.dto.OrderDTO;

import java.util.List;

/**
 * @author zhixi
 * @description 针对表【T_ORDER】的数据库操作Service
 * @createDate 2023-09-18 09:48:09
 */
public interface OrderService extends IService<Order> {
    /**
     * 查询所有订单
     *
     * @return 订单列表
     */
    List<OrderDTO> findAll();
}
