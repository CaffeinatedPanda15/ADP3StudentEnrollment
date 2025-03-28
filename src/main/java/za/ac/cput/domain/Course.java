//Muhammad Siddeeq Rabin (221084096)
package za.ac.cput.domain;

public class Course {
    private final String CourseId;
    private final String CourseName;


    private Course(Builder builder) {
        this.CourseId = builder.CourseId;
        this.CourseName = builder.CourseName;

    }

    public String getCourseId() {
        return CourseId;
    }

    public String getCourseName() {
        return CourseName;
    }


    public static class Builder {
        private String CourseId;
        private String CourseName;


        public Builder setId(String id) {
            this.CourseId = CourseId;
            return this;
        }

        public Builder setName(String name) {
            this.CourseName = CourseName;
            return this;
        }



        public Course build() {
            return new Course(this);
        }
    }
}
