package com.itmuch.usercenter.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (bonus_event_log)实体类
 *
 * @author bryan
 * @description
 * @since 2021-02-28 14:00:57
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("bonus_event_log")
public class BonusEventLog extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * 积分
     */
    private Integer value;
    /**
     * event
     */
    private String event;

    /**
     * 描述
     */
    private String description;
    /**
     * userId
     */
    private Integer userId;

}