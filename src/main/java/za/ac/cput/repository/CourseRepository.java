//Muhammad Siddeeq Rabin (221084096)
package za.ac.cput.repository;

import za.ac.cput.domain.Course;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class CourseRepository implements IRepository<Course, String> {
    private final Set<Course> courses = new HashSet<>();

    @Override
    public Course create(Course course) {
        if (course != null) {
            courses.add(course);
            return course;
        }
        return null;
    }

    @Override
    public Course read(String courseId) {
        return courses.stream()
                .filter(course -> course.getCourseId().equals(courseId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Course update(Course course) {
        Course existing = read(course.getCourseId());
        if (existing != null) {
            courses.remove(existing);
            courses.add(course);
            return course;
        }
        return null;
    }

    @Override
    public boolean delete(String courseId) {
        Course course = read(courseId);
        return course != null && courses.remove(course);
    }

    @Override
    public Set<Course> getAll() {
        return new HashSet<>(courses);
    }
}
