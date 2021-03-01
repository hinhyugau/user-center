package com.itmuch.usercenter.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itmuch.usercenter.domain.User;
import lombok.Data;

/**
 * @Description: user dto
 * @Author bryan
 * @Date 2021/2/28 2:14 下午
 * @Version 1.0
 */
@Data
@TableName("user")
public class UserDto extends User {
}
