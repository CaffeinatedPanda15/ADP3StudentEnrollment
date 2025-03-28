//Muhammad Siddeeq Rabin (221084096)
package za.ac.cput.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.repository.CourseRepository;
import za.ac.cput.domain.Course;

import java.util.Set;

class CourseRepositoryTest {

    private CourseRepository repository;
    private Course course1, course2;

    @BeforeEach
    void setUp() {
        repository = new CourseRepository();
        course1 = new Course.Builder()
                .setId("C123")
                .setName("Software Engineering")
                .build();
        course2 = new Course.Builder()
                .setId("C124")
                .setName("Data Structures")
                .build();
    }

    @Test
    void testCreate() {
        Course created = repository.create(course1);
        assertNotNull(created);
        assertEquals(course1.getCourseId(), created.getCourseId());
        assertEquals(1, repository.getAll().size());
    }

    @Test
    void testRead() {
        repository.create(course1);
        Course found = repository.read("C123");
        assertNotNull(found);
        assertEquals("Software Engineering", found.getCourseName());
    }

    @Test
    void testUpdate() {
        repository.create(course1);
        Course updatedCourse = new Course.Builder()
                .setId("C123")
                .setName("Advanced Software Engineering")
                .build();

        Course updated = repository.update(updatedCourse);
        assertNotNull(updated);
        assertEquals("Advanced Software Engineering", updated.getCourseName());
    }

    @Test
    void testDelete() {
        repository.create(course1);
        assertTrue(repository.delete("C123"));
        assertNull(repository.read("C123"));
    }

    @Test
    void testGetAll() {
        repository.create(course1);
        repository.create(course2);
        Set<Course> courses = repository.getAll();
        assertEquals(2, courses.size());
    }
}