package org.example.lesson_oop3;

import java.util.Iterator;
import java.util.List;

public class TeacherList implements Iterable<TeacherServise> {
    public List<TeacherServise> teacherList;

    public TeacherList(List<TeacherServise> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public Iterator<TeacherServise> iterator() {
        return null;
    }
}
