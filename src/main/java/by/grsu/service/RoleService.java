package by.grsu.service;

import by.grsu.data.entity.RoleEntity;

import java.util.List;

public interface RoleService {
    List<RoleEntity> getRoles();

    RoleEntity getRoleByName(String name);
}
