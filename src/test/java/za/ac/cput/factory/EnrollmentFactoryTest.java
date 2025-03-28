package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Enrollment;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentFactoryTest {

    @Test
    public void testCreateEnrollment() {
        String studentId = "S12345";
        String courseId = "CSE101";

        Enrollment enrollment = EnrollmentFactory.createEnrollment(studentId, courseId);

        assertNotNull(enrollment);
        assertEquals(studentId, enrollment.getStudentId());
        assertEquals(courseId, enrollment.getCourseId());
        assertNotNull(enrollment.getDateEnrollment());

        Date now = new Date();
        long diff = Math.abs(now.getTime() - enrollment.getDateEnrollment().getTime());
        long oneSecond = 1000;
        assertTrue(diff < oneSecond);
    }
}
