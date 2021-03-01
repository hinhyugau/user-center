package com.itmuch.usercenter.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (user)实体类
 *
 * @author bryan
 * @description
 * @since 2021-02-28 14:00:57
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("user")
public class User extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 微信Id
     */
    private String wxId;
    /**
     * 微信名
     */
    private String wxNickname;
    /**
     * 权限
     */
    private String roles;
    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 积分
     */
    private Integer bonus;

}