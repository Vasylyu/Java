package org.example.lesson_oop3;

import java.util.Iterator;
import java.util.List;

public class TeacherList implements Iterable<Teacher> {
    public List<Teacher> teacherList;

    public TeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return null;
    }
}
