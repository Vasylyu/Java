package org.oop_5.view;

import org.example.model.LessonGroup;
import org.example.model.Student;
import org.example.model.Teacher;

public class StudentView {
    public void printOnConsole(Student student){
        System.out.println(student);
    }
    public void printOnConsole1(Teacher teacher){
        System.out.println("teacher = " + teacher);
    }
    public void printOnConsole2(LessonGroup lessonGroup){
        System.out.println(lessonGroup);
    }
}
