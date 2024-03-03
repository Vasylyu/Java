package org.oop_5.view;

import org.oop_5.model.LessonGroup;
import org.oop_5.model.Student;
import org.oop_5.model.Teacher;

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
