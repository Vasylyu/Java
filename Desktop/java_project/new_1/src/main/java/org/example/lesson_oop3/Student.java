package org.example.lesson_oop3;

public  class Student extends User implements Comparable<Student> {


    //(Single Responsibility Principle — SRP):
    // Данный класс Студент отвечает только за студентов и ничего больше,
    // для других задач у нас есть, например, класс Учитель, отвечающий за учителей.
    public Long studentId;


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId + " " +
                super.toString()+
                '}';
    }

    public Student(Long studentId, String firstName, String secondName, String lastName) {
        super(firstName,secondName,lastName);
        this.studentId = studentId;

    }

    @Override
    public int compareTo(Student o) {
        if (this.studentId > o.studentId)
            return 1;
        else if (this.studentId < o.studentId)
            return -1;
        else return 0;

    }
}
