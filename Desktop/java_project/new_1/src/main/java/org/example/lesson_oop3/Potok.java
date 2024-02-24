package org.example.lesson_oop3;

import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<StudentGroup> {
    public String GroupName;
    public Integer GroupCount;


    public Potok(String GroupName, Integer GroupCount) {
        this.GroupName = GroupName;
        this.GroupCount = GroupCount;


    }

    @Override
    public String toString() {
        return "Potok{" +
                "GroupName='" + GroupName + '\'' +
                ", GroupCount=" + GroupCount +
                '}';
    }

    public List<StudentGroup> groupList;

    public Potok(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }
}


