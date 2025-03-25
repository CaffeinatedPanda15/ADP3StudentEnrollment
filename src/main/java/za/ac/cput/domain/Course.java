package za.ac.cput.domain;

public class Course {
    private String CourseId;
    private String CourseName;


    public Course() {

    }

    public Course(String CourseId, String CourseName) {
        this.CourseId = CourseId;
        this.CourseName = CourseName;
    }

    public String getCourseId() {
        return CourseId;
    }

    public String getCourseName() {
        return CourseName;
    }
}
