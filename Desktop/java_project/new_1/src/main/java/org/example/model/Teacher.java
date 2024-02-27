package org.example.model;

public class Teacher extends User {
    private Integer teacherId;



    public Teacher(Integer teacherId, String firstName, String secondName, String lastName, Integer yearOfBirth) {
        super(firstName, secondName, lastName, yearOfBirth);
        this.teacherId = teacherId;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                super.toString() +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }
}