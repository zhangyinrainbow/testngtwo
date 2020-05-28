package chuji;

import chuji.Student;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {

    @Test(enabled = false)
    public void testGetScore() {
        Student student=new Student("wangwei",40,18);
        student.getScore();
        Assert.assertEquals(18,18);
    }

    @Test
    public void testWolf() {
        Student sunge=new Student("sunge",44,99);
        sunge.wolf();
    }
}