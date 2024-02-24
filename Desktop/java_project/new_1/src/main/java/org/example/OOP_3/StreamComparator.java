package org.example.OOP_3;

import org.example.lesson_oop3.StudentGroup;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {


    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getStudentList().size() - o2.getStudentList().size();
    }
}

