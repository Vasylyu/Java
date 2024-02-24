package org.example.lesson_oop3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultofComparing = o1.secondName.compareTo(o2.secondName);
        if (resultofComparing == 0) {
            resultofComparing = o1.firstName.compareTo(o2.firstName);
            if (resultofComparing == 0) {
                return o1.lastName.compareTo(o2.lastName);
            } else {
                return resultofComparing;
            }
        } else {
            return resultofComparing;
        }
    }
}
