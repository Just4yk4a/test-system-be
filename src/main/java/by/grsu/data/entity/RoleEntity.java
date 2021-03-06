package by.grsu.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "role")
public class RoleEntity extends AbstractPersistable<Long> {
    @Column
    private String name;

    public void setId(Long id) {
        super.setId(id);
    }
}
