//Strathmore York Fynn (221547290)
package za.ac.cput.service;

import za.ac.cput.domain.Student;
import za.ac.cput.repository.StudentRepository;

import java.util.Set;

public class StudentService {
    private final StudentRepository studentRepository = new StudentRepository();

    public Student addStudent(Student student) {
        return studentRepository.create(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.read(id);
    }

    public Set<Student> getAllStudents() {
        return studentRepository.getAll();
    }
}
