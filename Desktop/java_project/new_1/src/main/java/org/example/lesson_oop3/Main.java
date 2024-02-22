package org.example.lesson_oop3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        Student student1 = new Student(1, "Anton", "Pal", "Chehov");
        Student student2 = new Student(2, "Alex", "Serg", "Pushkin");
        Student student3 = new Student(3, "Alex", "Ivan", "Tolstoy");
        studentGroup.studentList.add(student1);
        studentGroup.studentList.add(student2);
        studentGroup.studentList.add(student3);

        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
            if (iterator.next().studentId == 1)
                iterator.remove();
        }
    }
}

