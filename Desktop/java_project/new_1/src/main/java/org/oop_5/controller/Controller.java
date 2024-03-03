package org.oop_5.controller;

import org.example.model.LessonGroup;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.Type;
import org.example.service.DataService;
import org.example.service.LessonGroupService;
import org.example.view.StudentView;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final LessonGroupService lessonGroupService = new LessonGroupService();

    public void createGroup(Integer numberGroup, String teacherName, Integer countStudent) {
        lessonGroupService.creates(numberGroup, teacherName, teacherName, countStudent, Type.GROUP);
    }


    public void createStudent(String firstName, String secondName, String lastName, Integer yearOfBirth) {
        service.create(firstName, secondName, lastName, yearOfBirth, Type.STUDENT);

    }

    public void createTeacher(String firstName, String secondName, String lastName, Integer yearOfBirth) {
        service.create(firstName, secondName, lastName, yearOfBirth, Type.TEACHER);
    }

    public void printTeachers() {
        for (Teacher teacher : service.getTeacherList()) {
            view.printOnConsole1(teacher);
        }
    }

    public void printAllStudents() {
        for (Student student : service.getStudentList()) {
            view.printOnConsole(student);

        }
    }

    public void printGroup() {
        for (LessonGroup lessonGroup : service.getGroupList()) {
            view.printOnConsole2(lessonGroup);

        }

    }
}