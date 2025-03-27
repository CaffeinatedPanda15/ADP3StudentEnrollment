package za.ac.cput.domain;

import java.util.*;

public class Enrollment {
    private final String studentId;
    private final String courseId;
    private final Date dateEnrollment;

    private Enrollment(Builder builder) {
        this.studentId = builder.studentId;
        this.courseId = builder.courseId;
        this.dateEnrollment = builder.dateEnrollment;
    }


    public String getStudentId() {
        return studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public Date getDateEnrollment() {
        return dateEnrollment;
    }
    public static class Builder {
        private String studentId;
        private String courseId;
        private Date dateEnrollment;

        public Builder setstudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setcourseId(String courseId) {
            this.courseId = courseId;
            return this;
        }

        public Builder setdateEnrollment(Date dateEnrollment) {
            this.dateEnrollment = dateEnrollment;
            return this;
        }

        public Enrollment build() {
            return new Enrollment(this);

        }
    }//end of builder class
}
