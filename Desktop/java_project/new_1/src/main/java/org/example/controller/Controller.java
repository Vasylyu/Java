package org.example.controller;

import org.example.model.Student;
import org.example.model.Type;
import org.example.service.DataService;
import org.example.view.StudentView;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName, Integer yearOfBirth) {
        service.create(firstName, secondName, lastName, yearOfBirth, Type.STUDENT);

    }

    public void printAllStudents() {
        for (Student student : service.getStudentList()) {
            view.printOnConsole(student);

        }
    }
}
