package by.grsu.service;

import by.grsu.data.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getUsers();

    UserEntity logIn(String login, String password);

    List<UserEntity> getTeachers();

    UserEntity saveTeacher(UserEntity userEntity);

    List<UserEntity> getStudents();

    UserEntity saveStudent(UserEntity userEntity);

    void deleteById(Long id);
}
