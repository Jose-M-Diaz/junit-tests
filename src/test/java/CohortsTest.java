import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CohortsTest {
    Student billy;
    Student susan;
    Cohort regulus;
    @Before
    public void setUp() {
        billy = new Student(1, "Billy");
        susan = new Student(2, "Susan");
        regulus = new Cohort();
        regulus.addStudent(billy);
        regulus.addStudent(susan);
        billy.addGrade(88);
        billy.addGrade(100);
        billy.addGrade(84);
        billy.addGrade(82);
        susan.addGrade(100);
        susan.addGrade(100);
        susan.addGrade(96);
        susan.addGrade(98);
    }

    @Test
    public void canAddStudent() {

        Assert.assertEquals(this.billy, regulus.getStudents().get(0));
        Assert.assertEquals(this.susan, regulus.getStudents().get(1));
    }

    @Test
    public void canGetStudents() {
        Assert.assertEquals(2, regulus.getStudents().size());
        Assert.assertEquals(this.billy, regulus.getStudents().get(0));
        Assert.assertEquals(this.susan, regulus.getStudents().get(1));
    }

    @Test
    public void canGetCohortAverage() {

        Assert.assertEquals(93.5, regulus.getCohortAverage(),0);
    }

}
