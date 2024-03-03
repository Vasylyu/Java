package org.oop_5.model;

public class Student extends User {
    private Integer studentId;

    public Student(Integer studentId, String firstName, String secondName, String lastName, Integer yearOfBirth) {
        super(firstName, secondName, lastName, yearOfBirth);
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                super.toString() +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }
}
