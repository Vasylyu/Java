package org.example.lesson_oop3;

import java.util.ArrayList;

/**
 Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
 Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
 */
public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.studentList.add(new Student(3L, "3", "a", "Chehov"));
        studentGroup.studentList.add(new Student(1L, "2", "A", "Pushkin"));
        studentGroup.studentList.add(new Student(2L, "4", "Bb", "Tolstoy"));
        studentGroup.studentList.add(new Student(4L, "1", "BB", "Tolstoy"));


        TeacherList teacherList = new TeacherList(new  ArrayList<>());
        teacherList.teacherList.add(new Teacher(1L,"Анна","Сергеевна","Мирясова"));
        teacherList.teacherList.add(new Teacher(2L,"Анжела","Олеговна","Жукова"));
        teacherList.teacherList.add(new Teacher(3L,"Анжелика","Андреевна","Селезнева"));


        StudentVue studentVue = new StudentVue();
        studentVue.sendToConsole(studentGroup.studentList);
        TeacherVue teacherVue = new TeacherVue();
        teacherVue.sendToConsole(teacherList.teacherList);

    }


}


