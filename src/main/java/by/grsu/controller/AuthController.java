package by.grsu.controller;

import by.grsu.converter.UserConverter;
import by.grsu.data.vo.UserVO;
import by.grsu.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public UserVO logIn(@RequestParam String mail, @RequestParam String pass) {
        return UserConverter.convert(userService.logIn(mail, pass));
    }
}
