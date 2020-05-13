package by.grsu.service.impl;

import by.grsu.data.entity.RoleEntity;
import by.grsu.repository.RoleRepository;
import by.grsu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleEntity> getRoles() {
        return roleRepository.findAll();
    }

    @Override
    public RoleEntity getRoleByName(String name) {
        return roleRepository.findByName(name);
    }
}
