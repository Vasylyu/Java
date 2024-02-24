package org.example.OOP_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList111 = Arrays.asList(
                new Student(4, "Алексей", "Иванов", "Сергеевич"),
                new Student(2, "Иван", "Петров", "Иванович"),
                new Student(3, "Ольга", "Петрова", "Aндреевна"),
                new Student(1, "Вечеслав", "Семенов", "Алексеевич"));
                List < Student > studentList222 = Arrays.asList(
                        new Student(4, "Марина", "Киарова", "Олеговна"),
                        new Student(2, "Елена", "Пушкина", "Сергеевна"),
                        new Student(2, "Светлана", "Жорова", "Максимова"));
        List<Student> studentList333 = Arrays.asList(
                new Student(4, "Aak", "Frost", "Gis"),
                new Student(4, "Cat", "Fire", "Yand"));

        StudentGroup studentGroup1 = new StudentGroup(studentList111, 67);
        StudentGroup studentGroup2 = new StudentGroup(studentList222, 76);
        StudentGroup studentGroup3 = new StudentGroup(studentList333, 54);


        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(studentGroup1);
        studentGroupList.add(studentGroup2);
        studentGroupList.add(studentGroup3);
        System.out.println();
        Potok potok = new Potok(studentGroupList);

        for (StudentGroup group : potok) {
            System.out.println(group);
        }
        System.out.println();
        PotokService service = new PotokService(potok);
        for (StudentGroup group : service.getSortedStream()) {
            System.out.println(group);
        }
    }
}

