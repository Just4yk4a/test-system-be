package by.grsu.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "user")
@Table(name = "user", schema = "public")
public class UserEntity extends AbstractPersistable<Long> {
    @Column
    private String login;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String password;

    @Column
    private String mail;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = RoleEntity.class)
    @JoinColumn(name = "role")
    private RoleEntity role;

    public void setId(Long id) {
        super.setId(id);
    }
}
