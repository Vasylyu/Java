package org.example.lesson_oop3;

import java.util.List;

public class StudentVue implements UserVue<Student> {
    @Override
    public void sendToConsole(List<Student> list) {

        for (Student s : list) {
            System.out.println(s);
        }
    }
}