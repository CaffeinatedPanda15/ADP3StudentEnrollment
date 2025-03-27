package za.ac.cput.service;

import java.util.Set;
import za.ac.cput.repository.EnrollmentRepository;
import za.ac.cput.domain.Enrollment;

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
