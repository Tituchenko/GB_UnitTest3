package seminars.third.hw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainHWTest {
//    @Test
//    public void testEvenOddNumber(){
//        MainHW mainHW=new MainHW();
//        assertTrue(mainHW.evenOddNumber(2));
//        assertTrue(!mainHW.evenOddNumber(3));
//    }
//
//
//
//    @Test
//    void numberInInterval() {
//        MainHW mainHW=new MainHW();
//        assertTrue(!mainHW.numberInInterval(20));
//        assertTrue(!mainHW.numberInInterval(120));
//        assertTrue(!mainHW.numberInInterval(25));
//        assertTrue(!mainHW.numberInInterval(1000));
//    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void evenOddNumber() {
        MainHW mainHW=new MainHW();
        assertTrue(mainHW.evenOddNumber(2));
        assertTrue(!mainHW.evenOddNumber(3));
    }

    @Test
    void testNumberInInterval() {
        MainHW mainHW=new MainHW();
        assertTrue(!mainHW.numberInInterval(20));
        assertTrue(!mainHW.numberInInterval(120));
        assertTrue(!mainHW.numberInInterval(25));
        assertTrue(!mainHW.numberInInterval(100));
    }
}
