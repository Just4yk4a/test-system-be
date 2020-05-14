package by.grsu.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "class")
public class ClassEntity extends AbstractPersistable<Long> {
    public void setId(Long id) {
        super.setId(id);
    }
}
