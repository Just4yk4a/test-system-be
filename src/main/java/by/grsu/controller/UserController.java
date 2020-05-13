package by.grsu.controller;

import by.grsu.converter.UserConverter;
import by.grsu.data.vo.UserVO;
import by.grsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserVO> getUsers() {
        return userService.getUsers().stream().map(UserConverter::convert).collect(Collectors.toList());
    }

    @GetMapping("/teachers")
    public List<UserVO> getTeachers() {
        return userService.getTeachers().stream().map(UserConverter::convert).collect(Collectors.toList());
    }

    @PostMapping("/teachers")
    public UserVO saveTeacher(@RequestBody UserVO user) {
        return UserConverter.convert(userService.saveTeacher(UserConverter.convert(user)));
    }

    @GetMapping("/students")
    public List<UserVO> getStudents() {
        return userService.getStudents().stream().map(UserConverter::convert).collect(Collectors.toList());
    }

    @PostMapping("/students")
    public UserVO saveStudent(@RequestBody UserVO user) {
        return UserConverter.convert(userService.saveStudent(UserConverter.convert(user)));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
