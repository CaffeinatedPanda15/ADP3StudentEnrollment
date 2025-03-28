//Uwaiz Laher (221270191)
package za.ac.cput.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Enrollment;


import java.util.Set;

class EnrollmentRepositoryTest {

    private EnrollmentRepository repository;
    private Enrollment enrollment1, enrollment2;

    @BeforeEach
    void setUp() {
        repository = new EnrollmentRepository();
        enrollment1 = new Enrollment.Builder()
                .setstudentId("C123")
                .setcourseId("11111")
                .build();
        enrollment2 = new Enrollment.Builder()
                .setstudentId("C124")
                .setcourseId("22222")
                .build();
    }

    @Test
    void testCreate() {
        Enrollment created = repository.create(enrollment1);
        assertNotNull(created);
        assertEquals(enrollment1.getCourseId(), created.getCourseId());
        assertEquals(1, repository.getAll().size());
    }

    @Test
    void testRead() {
        repository.create(enrollment1);
        Enrollment found = repository.read("C123");
        assertNotNull(found);
        assertEquals("11111", found.getCourseId());
    }

    @Test
    void testUpdate() {
        repository.create(enrollment1);
        Enrollment updatedCourse = new Enrollment.Builder()
                .setstudentId("C123")
                .setcourseId("11111")
                .build();

        Enrollment updated = repository.update(updatedCourse);
        assertNotNull(updated);
        assertEquals("11111", updated.getCourseId());
    }

    @Test
    void testDelete() {
        repository.create(enrollment1);
        assertTrue(repository.delete("C123"));
        assertNull(repository.read("C123"));
    }

    @Test
    void testGetAll() {
        repository.create(enrollment1);
        repository.create(enrollment2);
        Set<Enrollment> courses = repository.getAll();
        assertEquals(2, courses.size());
    }
}