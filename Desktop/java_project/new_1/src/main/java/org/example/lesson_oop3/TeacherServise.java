package org.example.lesson_oop3;

public class TeacherServise extends User implements Comparable<TeacherServise> {

    public Long teacherId;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + " " +
                super.toString() +
                '}';

    }

    public TeacherServise(Long teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }


    @Override
    public int compareTo(TeacherServise o) {
        if (this.teacherId > o.teacherId)
            return 1;
        else if (this.teacherId < o.teacherId)
            return -1;
        else return 0;
    }
}