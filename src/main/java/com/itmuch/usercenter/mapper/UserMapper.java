package com.itmuch.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmuch.usercenter.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (user)数据Mapper
 *
 * @author bryan
 * @description
 * @since 2021-02-28 14:00:57
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
