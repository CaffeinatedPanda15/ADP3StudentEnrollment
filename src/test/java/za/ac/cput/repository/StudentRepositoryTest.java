//Strathmore York Fynn (221547290)
package za.ac.cput.repository;


import za.ac.cputdomain.Student;
import za.ac.cputfactory.StudentFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentRepositoryTest {
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        studentRepository = new StudentRepository();
    }

    @Test
    void testCreateStudent() {
        Student student = StudentFactory.createStudent("S001", "John Doe", "john@example.com");
        Student savedStudent = studentRepository.create(student);
        assertNotNull(savedStudent);
    }

    @Test
    void testReadStudent() {
        Student student = StudentFactory.createStudent("S001", "John Doe", "john@example.com");
        studentRepository.create(student);
        assertNotNull(studentRepository.read("S001"));
    }
}
