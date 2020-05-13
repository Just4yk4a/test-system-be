package by.grsu.data.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserVO {
    private Long id;
    private String login;
    private String firstName;
    private String secondName;
    private String password;
    private String mail;
    private RoleVO role;
}
