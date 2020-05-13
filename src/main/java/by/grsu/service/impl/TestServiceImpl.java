package by.grsu.service.impl;

import by.grsu.data.entity.TestEntity;
import by.grsu.repository.TestRepository;
import by.grsu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public List<TestEntity> getTests() {
        return testRepository.findAll();
    }

    @Override
    public TestEntity getTestByName(String name) {
        return testRepository.findByName(name);
    }

    @Override
    public TestEntity save(TestEntity testEntity) {
        return testRepository.save(testEntity);
    }
}
