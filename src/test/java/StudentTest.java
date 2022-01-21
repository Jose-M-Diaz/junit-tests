import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    private String expectedName;
    private long expectedId;
    private Student student;

    @Before
    public void setUp(){
        this.expectedName = "Jose";
        this.expectedId = 311282;
        this.student = new Student(311282,"Jose");
    }

    @Test
    public void testNameIsSet(){
//        Assert.assertEquals("", Student.name);
        Assert.assertEquals(this.expectedName, this.student.getName());
    }

    @Test
    public void testIdIsSet(){
//        Assert.assertEquals(0.0, Student.id, 0);
        Assert.assertEquals(this.expectedId, this.student.getId());
    }

    @Test
    public void testGradesIsSet(){
        List<Integer> grades = this.student.getGrades();
        Assert.assertEquals(grades, this.student.getGrades());
    }

    @Test
    public void testAddGrades(){
        Assert.assertEquals(0, this.student.getGrades().size());
        this.student.addGrade(90);
        Assert.assertEquals(1, this.student.getGrades().size());
        this.student.addGrade(87);
        Assert.assertEquals(2, this.student.getGrades().size());
        this.student.addGrade(75);
        Assert.assertEquals(3, this.student.getGrades().size());
    }

}