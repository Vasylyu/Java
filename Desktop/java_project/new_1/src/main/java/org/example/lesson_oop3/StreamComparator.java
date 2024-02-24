package org.example.lesson_oop3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Potok> {


    @Override
    public int compare(Potok o1, Potok o2) {
        int resultofComparing = o1.GroupName.compareTo(o2.GroupName);
        if (resultofComparing == 0) {
            resultofComparing = o1.GroupCount.compareTo(o2.GroupCount);

        } else {
            return resultofComparing;
        }
        return resultofComparing;
    }

}