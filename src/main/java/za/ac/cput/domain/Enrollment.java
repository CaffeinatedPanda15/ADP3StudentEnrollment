package za.ac.cput.domain;

public class Enrollment {
    private String StudentId;
    private String courseId;
    private String dateEnrollment;

    public Enrollment() {

    }

    public Enrollment(String StudentId, String courseId, String dateEnrollment) {
        this.StudentId = StudentId;
        this.courseId = courseId;
        this.dateEnrollment = dateEnrollment;
    }

    public String getStudentId() {
        return StudentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getDateEnrollment() {
        return dateEnrollment;
    }
}
