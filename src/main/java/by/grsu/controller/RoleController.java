package by.grsu.controller;

import by.grsu.converter.RoleConverter;
import by.grsu.data.vo.RoleVO;
import by.grsu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("roles")
public class RoleController {
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleVO> getRoles() {
        return roleService.getRoles().stream().map(RoleConverter::convert).collect(Collectors.toList());
    }
}
