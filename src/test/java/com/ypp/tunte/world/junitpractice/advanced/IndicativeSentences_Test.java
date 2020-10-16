package com.ypp.tunte.world.junitpractice.advanced;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@IndicativeSentencesGeneration(separator = ",测试方法：",generator = DisplayNameGenerator.ReplaceUnderscores.class)
public class IndicativeSentences_Test {

    @Test
    void if_it_is_one_of_the_following_years(){

    }

}
