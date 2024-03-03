package org.oop_5.service;

import org.oop_5.model.Teacher;
import org.oop_5.model.Type;
import org.oop_5.model.User;

import java.util.ArrayList;
import java.util.List;

public class LessonGroupService {
    private List<User> users = new ArrayList<>();

    public void creates(Integer numberGroup, String teacherName, String secondName, Integer countStudent, Type type) {

        if (type == Type.GROUP) {
            users.add(new Teacher(numberGroup, teacherName, teacherName, secondName, countStudent));

        }
    }
}







