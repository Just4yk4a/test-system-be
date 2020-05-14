package by.grsu.converter;

import by.grsu.data.entity.UserEntity;
import by.grsu.data.vo.UserVO;

public class UserConverter {

    public static UserVO convert(UserEntity userEntity) {
        return UserVO.builder()
                .id(userEntity.getId())
                .login(userEntity.getLogin())
                .password(userEntity.getPassword())
                .firstName(userEntity.getFirstName())
                .secondName(userEntity.getLastName())
                .mail(userEntity.getMail())
                .role(RoleConverter.convert(userEntity.getRole()))
                .build();
    }

    public static UserEntity convert(UserVO userVO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userVO.getId());
        userEntity.setLogin(userVO.getLogin());
        userEntity.setPassword(userVO.getPassword());
        userEntity.setFirstName(userVO.getFirstName());
        userEntity.setLastName(userVO.getSecondName());
        userEntity.setMail(userVO.getMail());
        if (userEntity.getRole() != null) {
            userEntity.setRole(RoleConverter.convert(userVO.getRole()));
        }
        return userEntity;
    }
}
