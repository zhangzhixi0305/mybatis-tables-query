package com.zhixi.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhixi.pojo.Order;
import com.zhixi.pojo.dto.OrderDTO;
import org.apache.ibatis.annotations.Param;

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


    /**
     * 更新订单总价
     *
     * @param modifyTheAmount 修改的金额
     * @param ids         订单id列表
     */
    int updateOrderTotalPrice(Double modifyTheAmount, List<Long> ids);
}
