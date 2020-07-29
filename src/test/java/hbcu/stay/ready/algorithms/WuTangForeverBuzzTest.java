package hbcu.stay.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class WuTangForeverBuzzTest {

    @Test
    public void wuTangClanTest(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n";
        String actual = wuTangForeverBuzz.wuTangClan(15);

        Assert.assertEquals(expected,actual);
    }
}
