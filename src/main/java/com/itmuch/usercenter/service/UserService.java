package com.itmuch.usercenter.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.itmuch.usercenter.domain.User;

/**
 * 服务接口
 *
 * @author bryan
 * @description
 * @since 2021-02-28 14:00:57
 */
public interface UserService extends IService<User> {
    /**
     * 根据Id查询用户
     *
     * @param id
     * @return
     */
    User findUserById(Integer id);
}