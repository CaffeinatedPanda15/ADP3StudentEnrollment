//Strathmore York Fynn (221547290)
package za.ac.cput.repository;

import za.ac.cput.domain.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentRepository implements IRepository<Student, String> {
    private final Set<Student> students = new HashSet<>();

    @Override
    public Student create(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student read(String id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Student update(Student student) {
        Student existing = read(student.getId());
        if (existing != null) {
            students.remove(existing);
            students.add(student);
        }
        return student;
    }

    @Override
    public boolean delete(String id) {
        Student student = read(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    @Override
    public Set<Student> getAll() {
        return students;
    }
}
