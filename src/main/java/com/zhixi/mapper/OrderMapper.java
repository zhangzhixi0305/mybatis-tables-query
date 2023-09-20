package com.zhixi.mapper;

import com.zhixi.pojo.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhixi.pojo.dto.OrderDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author zhixi
* @description 针对表【T_ORDER】的数据库操作Mapper
* @createDate 2023-09-18 09:48:09
* @Entity com.zhixi.pojo.Order
*/
@Repository
public interface OrderMapper extends BaseMapper<Order> {
    /**
     * 查询所有订单，一个订单对应一个用户
     * @return 订单列表
     */
    List<OrderDTO> findAll();
}




