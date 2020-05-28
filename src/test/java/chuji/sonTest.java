package chuji;

import chuji.son;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sonTest {

    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void testName() {
        son sonone=new son();
        Assert.assertEquals(sonone.name(),"wangwei");
    }
}