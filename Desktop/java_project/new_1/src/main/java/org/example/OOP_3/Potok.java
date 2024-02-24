package org.example.OOP_3;


import java.util.Iterator;
import java.util.List;

public class Potok  implements Iterable<StudentGroup> {
    private List<StudentGroup> groupList;


    public Potok(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new PotokIterator(this);
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return groupList.toString();
    }
}
