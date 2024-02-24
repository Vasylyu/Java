package org.example.lesson_oop3;

import java.util.Iterator;
import java.util.List;

public class Streamer implements Iterable<Potok> {
    public List<StudentGroup> groupList;

    public Streamer(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public Iterator<Potok> iterator() {
        return null;
    }
}
