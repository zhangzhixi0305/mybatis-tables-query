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


    /**
     * 扣除订单金额，使用MP的自定义SQL实现
     * @param modifyTheAmount 要进行扣除的金额
     * @param ids 订单id集合
     * @return 是否更新成功
     */
    @PostMapping("/updateOrderTotalPrice")
    public ResponseEntity<String> updateOrderTotalPrice(@RequestParam String modifyTheAmount, @RequestParam List<Long> ids) {
        orderService.updateOrderTotalPrice(Double.valueOf(modifyTheAmount), ids);
        return ResponseEntity.ok("更新成功");
    }
}















