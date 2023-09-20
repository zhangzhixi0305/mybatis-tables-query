package com.zhixi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhixi.pojo.User;
import com.zhixi.pojo.dto.UserOrderDTO;
import com.zhixi.pojo.dto.UserRoleDTO;

import java.util.List;

/**
 * @author zhixi
 * @description 针对表【T_USER】的数据库操作Service
 * @createDate 2023-09-17 22:38:16
 */
public interface UserService extends IService<User> {
    /**
     * 保存用户
     *
     * @param user 用户
     * @return 是否保存成功
     */
    boolean saveUser(User user);

    /**
     * 查询用户订单列表，一个用户对应多个订单
     *
     * @return 用户订单列表
     */
    List<UserOrderDTO> findUserOrderList();

    /**
     * 查询用户角色列表，一个用户对应多个角色
     * @return 用户角色列表
     */
    List<UserRoleDTO> findUserRoleList();
}
