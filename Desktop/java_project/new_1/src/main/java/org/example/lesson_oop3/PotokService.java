package org.example.lesson_oop3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotokService {
    Potok potok;

    public PotokService(Potok potok) {
        this.potok = potok;
    }

    public List<StudentGroup> getSortedPotok() {
        List<StudentGroup> groupList = new ArrayList<>(potok.groupList);

        return groupList;
    }

}


