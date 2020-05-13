package by.grsu.converter;

import by.grsu.data.entity.TestEntity;
import by.grsu.data.vo.TestVO;

public class TestConverter {

    public static TestVO convert(TestEntity testEntity) {
        return TestVO.builder()
                .id(testEntity.getId())
                .name(testEntity.getName())
                .json(testEntity.getJson())
                .build();
    }

    public static TestEntity convert(TestVO testVO) {
        TestEntity roleEntity = new TestEntity();
        roleEntity.setId(testVO.getId());
        roleEntity.setName(testVO.getName());
        roleEntity.setJson(testVO.getJson());
        return roleEntity;
    }
}
