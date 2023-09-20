package com.zhixi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhixi.mapper.OrderMapper;
import com.zhixi.pojo.Order;
import com.zhixi.pojo.dto.OrderDTO;
import com.zhixi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}




