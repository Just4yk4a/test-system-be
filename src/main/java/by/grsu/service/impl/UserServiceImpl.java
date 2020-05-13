package by.grsu.service.impl;

import by.grsu.data.entity.UserEntity;
import by.grsu.repository.UserRepository;
import by.grsu.service.RoleService;
import by.grsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleService roleService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleService roleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    public UserEntity logIn(String login, String password) {
        UserEntity userEntity = userRepository.findByLogin(login);
        if (userEntity.getPassword().equals(password)) {
            return userEntity;
        }
        return null;
    }

    @Override
    public List<UserEntity> getTeachers() {
        return userRepository.findByRoleName("teacher");
    }

    @Override
    public UserEntity saveTeacher(UserEntity userEntity) {
        userEntity.setRole(roleService.getRoleByName("teacher"));
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getStudents() {
        return userRepository.findByRoleName("student");
    }

    @Override
    public UserEntity saveStudent(UserEntity userEntity) {
        userEntity.setRole(roleService.getRoleByName("student"));
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
