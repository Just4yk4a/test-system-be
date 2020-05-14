package by.grsu.controller;

import by.grsu.converter.TestConverter;
import by.grsu.data.vo.TestVO;
import by.grsu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("tests")
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public List<TestVO> getTests() {
        return testService.getTests().stream().map(TestConverter::convert).collect(Collectors.toList());
    }

    @PostMapping
    public TestVO saveTest(@RequestBody TestVO testVO) {
        return TestConverter.convert(testService.save(TestConverter.convert(testVO)));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        testService.deleteById(id);
    }
}
