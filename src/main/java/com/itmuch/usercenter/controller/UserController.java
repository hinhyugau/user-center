package com.itmuch.usercenter.controller;

import com.itmuch.usercenter.domain.User;
import com.itmuch.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    @GetMapping("/{id}")
    public User findUserBuId(@PathVariable Integer id) {
        return this.userService.findUserById(id);
    }
}