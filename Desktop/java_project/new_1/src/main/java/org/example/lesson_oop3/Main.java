package org.example.lesson_oop3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.studentList.add(new Student(3L, "3", "a", "Chehov"));
        studentGroup.studentList.add(new Student(1L, "2", "A", "Pushkin"));
        studentGroup.studentList.add(new Student(2L, "4", "Bb", "Tolstoy"));
        studentGroup.studentList.add(new Student(4L, "1", "BB", "Tolstoy"));



        StudentGroupServise servise = new StudentGroupServise(studentGroup);

        Potok potok = new Potok(new ArrayList<>());


        servise.soutList(studentGroup.studentList);

        System.out.println("--------------------------------------------------------");

        servise.soutList(servise.getSortedStudentGroupByFio());

        System.out.println("--------------------------------------------------------");

        servise.soutList(servise.getSortedStudentGroup());

    }


}


