package chuji;


import org.testng.annotations.Test;

public class testngzhuanyong {
    @Test(groups = "ten")
    public void testone(){
        System.out.println("one");
    }
    @Test(groups = "nine")
    public void testtwo(){
        System.out.println("two");
    }
    @Test(groups = {"nine","ten"})
    public void testthree(){
        System.out.println("three");
    }
    @Test(groups= "ten")
    public void testfour(){
        System.out.println("four");
    }
    @Test(groups = "nine")
    public void testfive(){
        System.out.println("five");
    }
    @Test(dependsOnMethods = "testfive")
    public void testsix(){
        System.out.println("six");
    }
    @Test(dependsOnGroups = {"ten","nine"})
    public void testseven(){
        System.out.println("seven");
    }
}
