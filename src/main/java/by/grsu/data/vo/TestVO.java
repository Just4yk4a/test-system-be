package by.grsu.data.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TestVO {
    private Long id;
    private String name;
    private String json;
}
