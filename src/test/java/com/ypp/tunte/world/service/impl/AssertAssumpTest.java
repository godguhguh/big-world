package com.ypp.tunte.world.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@SpringBootTest
@Slf4j
@ActiveProfiles("test")
public class AssertAssumpTest {

    /**
     * 最简单的成功用例
     */
    @Test
    void assertSuccess(){
        assertEquals(2,Math.addExact(1,1));
    }

    /**
     * 最简单的失败用例
     */
    @Test
    void assertFail(){
        assertEquals(3,Math.addExact(1,1));
    }

    /**
     * assumeTrue不抛出异常的用例
     */
    @Test
    void assumpSuccess(){
        // assumeTrue方法的入参如果为true，就不会抛出异常，后面的代码才会继续执行
        assumeTrue(true);
        // 如果打印出此日志，证明assumeTrue方法没有抛出异常
        log.info("assumpSuccess的assumeTrue执行完成");

        //接下来是常规的单元测试逻辑
        assertEquals(2,Math.addExact(1,1));

    }

    /**
     * assumeTrue抛出异常的用例
     */
    @Test
    void assumpFail() {
        // assumeTrue方法的入参如果为false，就会抛出TestAbortedException异常，后面就不会执行了
        assumeTrue(false, "未通过assumeTrue");
        // 如果打印出此日志，证明assumpFail方法没有抛出异常
        log.info("assumpFail的assumeTrue执行完成");
        // 接下来是常规的单元测试逻辑，但因为前面抛出了异常，就不再执行了
        assertEquals(2, Math.addExact(1,1));
    }

    @Value("${envType:CI}")
    private String envType;

    @Test
    @DisplayName("最普通的assume用法")
    void tryAssumeTrue(){
        assumeTrue("CI".equals(envType));
        log.info("CI环境才会打印的assumeTrue");
    }


    @Test
    @DisplayName("assume失败时带自定义错误信息")
    void tryAssumeTrueWithMessage() {
        // 第二个入参是Supplier实现，返回的内容用作跳过用例时的提示信息
        assumeTrue("CI".equals(envType),
                () -> "环境不匹配而跳过，当前环境：" + envType);

        log.info("CI环境才会打印的tryAssumeTrueWithMessage");
    }

    @Test
    @DisplayName("assume成功时执行指定逻辑")
    void tryAssumingThat(){
        // 第二个入参是Executable实现，
        // 当第一个参数为true时，执行第二个参数的execute方法
        assumingThat("CI".equals(envType),() -> {
            log.info("这一行内容只有在CI环境才会打印");
        });

        log.info("无论什么环境都会打印的tryAssumingThat");
    }


}
