package chuji;

import chuji.suanfa;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class suanfaTesttwo {

    @BeforeMethod
    public void setUp() {
        System.out.println("zheshikaishi");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("zheshijieshu");
    }

    @Test
    public void testJiafa() {
        suanfa suanfaone=new suanfa();
        int a=2;
        int c=4;
        suanfaone.jiafa(a,c);
    }
    @Test(timeOut = 6000)
    public void testChaoShi() throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("chaoshi");
    }
}