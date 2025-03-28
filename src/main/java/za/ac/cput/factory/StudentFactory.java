//Strathmore York Fynn (221547290)
package za.ac.cput.factory;

import za.ac.cput.domain.Student;

public class StudentFactory {
    public static Student createStudent(String id, String name, String email) {
        return new Student.Builder()
                .setId(id)
                .setName(name)
                .setEmail(email)
                .build();
    }
}
