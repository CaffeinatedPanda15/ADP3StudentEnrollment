package service;

import java.util.Set;

public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository = new EnrollmentRepository();

    public Enrollment enrollStudent(Enrollment enrollment) {

        return enrollmentRepository.create(enrollment);
    }

    public Enrollment getEnrollmentByStudentId(String studentId) {

        return enrollmentRepository.read(studentId);
    }

    public Set<Enrollment> getAllEnrollments() {

        return enrollmentRepository.getAll();
    }
}
