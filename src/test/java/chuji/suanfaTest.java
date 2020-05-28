package chuji;

import chuji.suanfa;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class suanfaTest {
    @BeforeTest


    @Test
    public void testJiafa() {
        int a=1;
        int b=2;
        suanfa suanfa=new suanfa();
        int c=suanfa.jiafa(a,b);
        double d=suanfa.jiafa(2.2,3.3);
        Assert.assertEquals(c,3);
        Assert.assertEquals(d,5.5);
    }

    @Test
    public void testChufa() {
        suanfa suanfaone=new suanfa();
        int d=suanfaone.chufa(2,0);
        int e=suanfaone.chufa(4,2);
        Assert.assertEquals(d,0);
        Assert.assertEquals(e,2);
    }
}