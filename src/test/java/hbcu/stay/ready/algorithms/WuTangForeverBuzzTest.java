package hbcu.stay.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class WuTangForeverBuzzTest {

    @Test
    public void wuTangClanTest(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();
        int length = 15;

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n";
        String actual = wuTangForeverBuzz.wuTangClan(length);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void ifFactorofThreeFiveTest1(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();
        int test = 12;

        String expected = "Wu";
        String actual = wuTangForeverBuzz.ifFactorofThreeFive(test);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void ifFactorofThreeFiveTest2(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();
        int test = 22;

        String expected = "22";
        String actual = wuTangForeverBuzz.ifFactorofThreeFive(test);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void ifFactorofThreeFiveTest3(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();
        int test = 30;

        String expected = "WuTang Forever";
        String actual = wuTangForeverBuzz.ifFactorofThreeFive(test);

        Assert.assertEquals(expected,actual);
    }
}
