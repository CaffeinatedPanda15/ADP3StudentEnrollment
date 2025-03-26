package yourmom.factory;

import java.util.Date;

public class EnrollmentFactory {
    public static Enrollment createEnrollment(String studentId, String courseId) {
        return new Enrollment.Builder().setstudentId(studentId).setcourseId(courseId).setdateEnrollment(new Date()).build();
    }
}//end of class
