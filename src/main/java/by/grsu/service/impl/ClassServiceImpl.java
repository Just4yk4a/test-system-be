package by.grsu.service.impl;

import by.grsu.repository.ClassRepository;
import by.grsu.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {
    private final ClassRepository classRepository;

    @Autowired
    public ClassServiceImpl(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }
}
