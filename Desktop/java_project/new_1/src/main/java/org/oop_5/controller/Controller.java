package org.oop_5.controller;

import org.oop_5.model.LessonGroup;
import org.oop_5.model.Student;
import org.oop_5.model.Teacher;
import org.oop_5.model.Type;
import org.oop_5.service.DataService;
import org.oop_5.service.LessonGroupService;
import org.oop_5.view.StudentView;

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