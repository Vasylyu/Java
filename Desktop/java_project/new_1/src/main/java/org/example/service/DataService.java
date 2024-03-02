package org.example.service;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataService {


    private List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Integer yearOfBirth, Type type) {
        int id = getFreeId(type);
        if (type == Type.TEACHER) {
            users.add(new Teacher(id, firstName, secondName, lastName, yearOfBirth));
        } else if (type == Type.STUDENT) {
            users.add(new Student(id, firstName, secondName, lastName, yearOfBirth));

        }
    }

    private int getFreeId(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int lastId = 1;
        for (User user: users){
            if(user instanceof Student && isStudent)
                lastId = ((Student) user).getStudentId() +1;
            else if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher)user).getTeacherId() +1;

            }
        }
        return lastId;
    }
    public List<User> getUsers() {
        return users;
    }
    public List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();
        for (User user: users){
            if(user instanceof Student){
                studentList.add((Student) user);

            }
        }
        return studentList;
    }
    public List<Teacher> getTeacherList() {
        List<Teacher> teacherList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher) {
                teacherList.add((Teacher) user);
            }
        }
        return teacherList;
    }
    public List<LessonGroup> getGroupList() {
        List<LessonGroup> groupList = new ArrayList<>();
        for (User user : users) {
            groupList.add(new LessonGroup(5,"Anna",45));
        }
        return groupList;
    }

}

