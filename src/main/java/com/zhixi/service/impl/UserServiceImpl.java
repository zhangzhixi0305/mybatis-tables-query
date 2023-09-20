package com.zhixi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhixi.mapper.UserMapper;
import com.zhixi.pojo.User;
import com.zhixi.pojo.dto.UserOrderDTO;
import com.zhixi.pojo.dto.UserRoleDTO;
import com.zhixi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhixi
 * @description 针对表【T_USER】的数据库操作Service实现
 * @createDate 2023-09-17 22:38:16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public List<UserOrderDTO> findUserOrderList() {
        return userMapper.findUserOrderList();
    }

    @Override
    public List<UserRoleDTO> findUserRoleList() {
        return userMapper.findUserRoleList();
    }
}




