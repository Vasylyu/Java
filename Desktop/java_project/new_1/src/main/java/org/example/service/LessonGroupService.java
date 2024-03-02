package org.example.service;

import org.example.model.*;

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







