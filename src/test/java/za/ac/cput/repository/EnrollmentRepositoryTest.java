package za.ac.cput.repository;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import za.ac.cput.domain.Enrollment;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.domain.Student;
import za.ac.cput.repository.EnrollmentRepository;

import java.util.Set;

public class EnrollmentRepositoryTest {

    private EnrollmentRepository enrollmentRepository;
    private Enrollment enrollment1;
    private Enrollment enrollment2;

    @Before
    public void setUp() {
        enrollmentRepository = new EnrollmentRepository();
        enrollment1 = new Enrollment.Builder()
                .setStudentId("S12345")
                .setCourseId("CSE101")
                .setDateEnrollment(new java.util.Date())
                .build();

        enrollment2 = new Enrollment.Builder()
                .setStudentId("S67890")
                .setCourseId("CSE102")
                .setDateEnrollment(new java.util.Date())
                .build();
    }

    @Test
    public void testCreateEnrollment() {
        Enrollment createdEnrollment = enrollmentRepository.create(enrollment1);
        assertNotNull(createdEnrollment);
        assertEquals("S12345", createdEnrollment.getStudentId());
        assertEquals("CSE101", createdEnrollment.getCourseId());
    }

    @Test
    public void testReadEnrollment() {
        enrollmentRepository.create(enrollment1);
        Enrollment retrievedEnrollment = enrollmentRepository.read("S12345");
        assertNotNull(retrievedEnrollment);
        assertEquals("S12345", retrievedEnrollment.getStudentId());
        assertEquals("CSE101", retrievedEnrollment.getCourseId());
    }

    @Test
    public void testUpdateEnrollment() {
        enrollmentRepository.create(enrollment1);
        Enrollment updatedEnrollment = new Enrollment.Builder()
                .setStudentId("S12345")
                .setCourseId("CSE103")
                .setDateEnrollment(new java.util.Date())
                .build();

        Enrollment result = enrollmentRepository.update(updatedEnrollment);
        assertNotNull(result);
        assertEquals("S12345", result.getStudentId());
        assertEquals("CSE103", result.getCourseId());
    }

    @Test
    public void testDeleteEnrollment() {
        enrollmentRepository.create(enrollment1);
        boolean deleted = enrollmentRepository.delete("S12345");
        assertTrue(deleted);
        assertNull(enrollmentRepository.read("S12345"));
    }

    @Test
    public void testGetAllEnrollments() {
        enrollmentRepository.create(enrollment1);
        enrollmentRepository.create(enrollment2);
        Set<Enrollment> enrollments = enrollmentRepository.getAll();
        assertNotNull(enrollments);
        assertEquals(2, enrollments.size());
    }
}
