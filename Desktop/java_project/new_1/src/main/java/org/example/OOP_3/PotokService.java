package org.example.OOP_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotokService {
    private Potok potok;

    public PotokService(Potok potok) {
        this.potok = potok;
    }


    public List<StudentGroup> getSortedStream() {
        List<StudentGroup> groupList = new ArrayList<>(potok.getGroupList());
        StreamComparator comparator = new StreamComparator();
        Collections.sort(groupList, comparator);
        return groupList;
    }

    public List<StudentGroup> getSortedStreamBySize() {
        List<StudentGroup> studentGroups = new ArrayList<>(potok.getGroupList());
        studentGroups.sort(new StreamComparator());
        return studentGroups;
    }

    public Potok getStream() {
        return potok;
    }

    public void setStream(Potok potok) {
        this.potok = potok;
    }

}

