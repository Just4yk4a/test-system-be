package by.grsu.service;

import by.grsu.data.entity.TestEntity;

import java.util.List;

public interface TestService {
    List<TestEntity> getTests();

    TestEntity getTestByName(String name);

    TestEntity save(TestEntity testEntity);

    void deleteById(Long id);
}
