
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student fer = new Student(1L, "fer");
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }

    @Test
    public void testStudentFields(){
        Student fer = new Student(1L, "fer");
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(0, fer.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }

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