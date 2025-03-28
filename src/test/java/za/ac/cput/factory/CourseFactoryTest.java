//Muhammad Siddeeq Rabin (221084096)
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Course;

import static org.junit.jupiter.api.Assertions.*;

class CourseFactoryTest {

    @Test
    public void testCreateCourse() {
        Course course = CourseFactory.createCourse("C123", "Software Engineering", 3);
        assertNotNull(course);
        assertEquals("C123", course.getCourseId());
        assertEquals("Software Engineering", course.getCourseName());
    }

    @Test
    public void testCreateCourseThatFails() {
        Course course = CourseFactory.createCourse(null, "", 0);
        assertNotNull(course);  // The factory still returns a Course object
        assertNull(course.getCourseId()); // Should fail because the ID is null
        assertEquals("", course.getCourseName()); // Empty name
    }
}
