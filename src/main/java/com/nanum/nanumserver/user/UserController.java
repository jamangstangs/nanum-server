package com.nanum.nanumserver.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final LoginService loginService;



}
