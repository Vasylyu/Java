package org.example.lesson_oop3;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int index = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList;
    }

    @Override
    public boolean hasNext() {
        if (index < studentList.size()) return true;
        return false;
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }

    @Override
    public void remove() {
        studentList.remove(index);

    }
}
