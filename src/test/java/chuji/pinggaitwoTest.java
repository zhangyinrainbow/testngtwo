package chuji;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class pinggaitwoTest {

    @Test
    public void testJisuan() {
        pinggaitwo two=new pinggaitwo();
        two.jisuan(80);
    }
}