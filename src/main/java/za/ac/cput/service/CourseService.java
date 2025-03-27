package za.ac.cput.service;

import za.ac.cput.domain.Course;
import za.ac.cput.repository.CourseRepository;

import java.util.Set;

public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(Course course) {
        return courseRepository.create(course);
    }

    public Course getCourseById(String id) {
        return courseRepository.read(id);
    }

    public Set<Course> getAllCourses() {
        return courseRepository.getAll();
    }
}
