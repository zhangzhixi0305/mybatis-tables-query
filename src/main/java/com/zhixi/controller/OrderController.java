package com.zhixi.controller;

import com.zhixi.pojo.Order;
import com.zhixi.pojo.dto.OrderDTO;
import com.zhixi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2023-09-18 10:04
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        orderService.save(order);
        return ResponseEntity.ok(order);
    }

    /**
     * 查询订单列表
     *
     * @return 订单列表
     */
    @GetMapping("/orderList")
    public ResponseEntity<List<OrderDTO>> findOrderList() {
        List<OrderDTO> orderDTOList = orderService.findAll();
        return ResponseEntity.ok(orderDTOList);
    }
}
