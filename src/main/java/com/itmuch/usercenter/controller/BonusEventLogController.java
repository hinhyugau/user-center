package com.itmuch.usercenter.controller;

import com.itmuch.usercenter.service.BonusEventLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务控制器
 *
 * @author bryan
 * @description
 * @since 2021-02-28 14:00:57
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/bonusEventLog")
public class BonusEventLogController {
    private final BonusEventLogService bonusEventLogService;

}