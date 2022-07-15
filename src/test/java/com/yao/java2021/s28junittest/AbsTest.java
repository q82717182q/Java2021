package com.yao.java2021.s28junittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jack Yao on 2022/3/23 2:27 PM
 */
@RunWith(Parameterized.class)
public class AbsTest {
    int input;
    int expected;

    //這個類要建構子
    public AbsTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<?> data(){
        return Arrays.asList(new Object[][]{
                {0, 0}, {1, 1}, {-1, 1}
        });
    }

    //這邊給 {0, 0}, {1, 1}, {-1, 1} 所以這邊測試會測三遍
    @Test
    public void testAbs() {
        int r = Math.abs(this.input);
        assertEquals(this.expected,r);
    }
}
