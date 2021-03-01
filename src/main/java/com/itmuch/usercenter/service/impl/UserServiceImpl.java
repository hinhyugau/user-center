package com.itmuch.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itmuch.usercenter.domain.User;
import com.itmuch.usercenter.domain.dto.UserDto;
import com.itmuch.usercenter.mapper.UserMapper;
import com.itmuch.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 服务接口实现
 *
 * @author bryan
 * @description
 * @since 2021-02-28 14:00:57
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    /**
     * 根据Id查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User findUserById(Integer id) {
        return this.baseMapper.selectById(id);
    }
}