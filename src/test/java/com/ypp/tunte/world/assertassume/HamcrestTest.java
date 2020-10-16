package com.ypp.tunte.world.assertassume;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@SpringBootTest
@Slf4j
public class HamcrestTest {

    @Test
    @DisplayName("体验hamcrest")
    void assertWithHamcrestMatcher(){
        assertThat(Math.addExact(1,2),is(equalTo(3)));
    }

}
