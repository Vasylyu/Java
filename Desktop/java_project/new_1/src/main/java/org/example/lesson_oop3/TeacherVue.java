package org.example.lesson_oop3;

import java.util.List;

public class TeacherVue implements UserVue<TeacherServise> {

    @Override
    public void sendToConsole(List<TeacherServise> list) {
        for (TeacherServise t : list) {
            System.out.println(t);
        }
    }
}