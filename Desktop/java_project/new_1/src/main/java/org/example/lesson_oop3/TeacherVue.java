package org.example.lesson_oop3;

import java.util.List;

public class TeacherVue implements UserVue<Teacher> {

    @Override
    public void sendToConsole(List<Teacher> list) {
        for (Teacher t : list) {
            System.out.println(t);
        }
    }
}