package com.zhixi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhixi.mapper.OrderMapper;
import com.zhixi.pojo.Order;
import com.zhixi.pojo.dto.OrderDTO;
import com.zhixi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhixi
 * @description 针对表【T_ORDER】的数据库操作Service实现
 * @createDate 2023-09-18 09:48:09
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
        implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderDTO> findAll() {
        return orderMapper.findAll();
    }

    /**
     * @param modifyTheAmount 修改的金额
     * @param ids             订单id列表
     * @return >0，更新成功
     */
    @Override
    public int updateOrderTotalPrice(Double modifyTheAmount, List<Long> ids) {
        if (modifyTheAmount == null || ids.isEmpty()) {
            throw new RuntimeException("用户编号和需要扣减的余额不能为空");
        }
        // 按照订单ID修改订单余额
        QueryWrapper<Order> orderQueryWrapper = new QueryWrapper<Order>().in("id", ids);
        int updateResult = orderMapper.updateOrderTotalPrice(modifyTheAmount, orderQueryWrapper);

        if (updateResult == 0) {
            throw new RuntimeException("更新失败");
        }
        return updateResult;
    }
}