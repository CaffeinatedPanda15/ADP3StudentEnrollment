package yourmom.domain;
public class Student {
    private String studentId;
    private String studentName;
    private String studentSurname;

    public Student() {

    }
    public Student(String studentId, String studentName, String studentSurname) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }
}//end of class

