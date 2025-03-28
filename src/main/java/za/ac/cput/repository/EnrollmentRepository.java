package za.ac.cput.repository;

import java.util.*;
import za.ac.cput.domain.Enrollment;

public class EnrollmentRepository implements IRepository<Enrollment, String> {
    private final Set<Enrollment> enrollments = new HashSet<>();

    @Override
    public Enrollment create(Enrollment enrollment) {
        enrollments.add(enrollment);
        return enrollment;
    }

    @Override
    public Enrollment read(String id) {
        return enrollments.stream().filter(e -> e.getStudentId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Enrollment update(Enrollment enrollment) {
        Enrollment existing = read(enrollment.getStudentId());
        if (existing != null) {
            enrollments.remove(existing);
            enrollments.add(enrollment);
        }
        return enrollment;
    }

    @Override
    public boolean delete(String id) {
        Enrollment enrollment = read(id);
        if (enrollment != null) {
            enrollments.remove(enrollment);
            return true;
        }
        return false;
    }

    @Override
    public Set<Enrollment> getAll() {
        return enrollments;
    }
}//end of class
