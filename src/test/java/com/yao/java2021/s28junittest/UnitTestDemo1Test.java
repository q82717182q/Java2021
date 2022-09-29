package com.yao.java2021.s28junittest;

import com.yao.demo.java2021.s28junittest.UnitTestDemo1;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Jack Yao on 2022/3/23 11:18 AM
 */
public class UnitTestDemo1Test {

    UnitTestDemo1 instance1 = null;
    static UnitTestDemo1 instance2 = null;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class method.");
        instance2 = new UnitTestDemo1();
    }

    @Before
    public void beforeEveryTest(){
        instance1 = new UnitTestDemo1();
    }
    //打完點左邊綠色箭頭就可以測試，
    @Test
    public void add() {

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        assertEquals(2,instance1.add(1,1));
    }

    @Test
    public void sub() {
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        assertEquals(0,instance1.sub(1,1));
    }

    @After
    public void afterEveryTest(){
        System.out.println("Test case execution finish.");
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void testException(){
        //這是拋ArithmeticException
        int r = 1/0;
    }

    @Test(timeout = 2000)
    public void testTimeOut() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAssertFalse(){
        assertFalse(1 > 2);
    }

    @Test
    public void testFail() {
        fail("I set it to fail.");
    }
}