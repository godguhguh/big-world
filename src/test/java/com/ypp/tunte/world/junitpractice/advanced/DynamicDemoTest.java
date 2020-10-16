package com.ypp.tunte.world.junitpractice.advanced;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
@Slf4j
public class DynamicDemoTest {

    @TestFactory
    Iterable<DynamicTest> testFactoryTest(){
        DynamicTest firstTest = DynamicTest.dynamicTest(
                "一号动态测试用例",
                () -> {
                    log.info("一号用例，这里编写单元测试逻辑代码");
                }
        );

        DynamicTest secondTest = DynamicTest.dynamicTest(
                "二号动态测试用例",
                () -> {
                    log.info("二号用例，这里编写单元测试逻辑代码");
                }
        );

        return Arrays.asList(firstTest,secondTest);

    }

}
