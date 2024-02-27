package org.example.lesson_oop3;

import java.util.Comparator;

public class UserComparator <T extends User>implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultofComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultofComparing == 0) {
            resultofComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultofComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultofComparing;
            }
        } else {
            return resultofComparing;
        }
    }
}
