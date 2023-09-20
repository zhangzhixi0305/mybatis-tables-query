package com.zhixi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhixi.pojo.User;
import com.zhixi.pojo.dto.UserOrderDTO;
import com.zhixi.pojo.dto.UserRoleDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhixi
 * @description 针对表【T_USER】的数据库操作Mapper
 * @createDate 2023-09-17 22:38:16
 * @Entity com.zhixi.pojo.TUser
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 保存用户
     *
     * @param user 用户
     * @return 是否保存成功
     */
    boolean saveUser(User user);

    /**
     * 查询用户订单列表，一个用户对应多个订单
     * @return 用户订单列表
     */
    List<UserOrderDTO> findUserOrderList();

    /**
     * 查询用户角色列表，一个用户对应多个角色，一个角色对应多个用户
     * @return 用户角色列表
     */
    List<UserRoleDTO> findUserRoleList();
}




