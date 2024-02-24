package org.example.OOP_3;

import java.util.Iterator;
import java.util.List;

public class PotokIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> groupList;
    private int counter;

    public PotokIterator(Potok potok) {
        this.groupList = potok.getGroupList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groupList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return groupList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext()){
            groupList.remove(--counter);
        }
    }
}
