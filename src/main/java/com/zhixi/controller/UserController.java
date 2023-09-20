package com.zhixi.controller;

import com.zhixi.pojo.User;
import com.zhixi.pojo.dto.UserOrderDTO;
import com.zhixi.pojo.dto.UserRoleDTO;
import com.zhixi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2023-09-17 22:42
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    public List<User> findUserList() {
        return userService.list();
    }

    @PostMapping("/saveUser")
    public ResponseEntity<User> saveUserToMybatisPlus(@RequestBody User user) {
        boolean save = userService.save(user);
        if (save) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/saveUserToMybatis")
    public ResponseEntity<User> saveUserToMybatis(@RequestBody User user) {
        boolean save = userService.saveUser(user);
        if (save) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    /**
     * 1:n关系查询，一个用户对应多个订单
     *
     * @return 用户订单列表
     */
    @GetMapping("/findUserOrderList")
    public List<UserOrderDTO> findUserOrderList() {
        return userService.findUserOrderList();
    }

    /**
     * n:n关系查询，一个用户可以有多个角色，一个角色可以被多个用户拥有
     */
    @GetMapping("/findUserRoleList")
    public List<UserRoleDTO> findUserRoleList(){
        return userService.findUserRoleList();
    }
}
