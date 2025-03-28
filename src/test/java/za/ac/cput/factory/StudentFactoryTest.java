//Strathmore York Fynn (221547290)
package za.ac.cput.factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.Student;

import static org.junit.Assert.*;
public class StudentFactoryTest {
    private String studentId;
    private String studentName;
    private String studentEmail;



    @Before
    public void setUp() throws Exception {
        studentId = "12345";
        studentName = "John Doe";
        studentEmail = "john.doe@example.com";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createStudent() {
        Student student = StudentFactory.createStudent(studentId, studentName, studentEmail);

        assertNotNull(student);
        assertEquals(studentId, student.getId());
        assertEquals(studentName, student.getName());
        assertEquals(studentEmail, student.getEmail());
    }
}
