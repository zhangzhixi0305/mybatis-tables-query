package com.zhixi.pojo.dto;

import com.zhixi.pojo.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2023-09-20 12:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleDTO extends User {
    /**
     * 用户角色列表，一个用户可以对应多个角色
     */
    List<RoleDTO> roleList;
}
