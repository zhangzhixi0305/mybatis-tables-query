package com.zhixi.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhixi.pojo.Order;
import com.zhixi.pojo.dto.OrderDTO;
import org.apache.ibatis.annotations.Param;
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
     *
     * @return 订单列表
     */
    List<OrderDTO> findAll();

    /**
     * 更新订单总价
     *
     * @param modifyTheAmount 修改的金额
     * @param queryWrapper    查询条件
     */
    int updateOrderTotalPrice(@Param("amount") Double modifyTheAmount, @Param("ew") QueryWrapper<Order> queryWrapper);
}




