package za.ac.cput.factory;

import za.ac.cput.domain.Course;

public class CourseFactory {
    public static Course createCourse(String id, String name, int credits) {
        return new Course.Builder()
                .setId(id)
                .setName(name)
                .build();
    }
}
