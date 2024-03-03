package org.oop_5.model;

import org.oop_5.controller.Controller;

/**
 Урок 5. От простого к практике
 — Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
 — Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
 — Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
 — Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.
 */

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Vasilii", "Ivanovich", "Crigorev", 1989);
        controller.createStudent("Ivan", "Ivanovich", "Crigorev", 1988);
        controller.createStudent("Lida", "Ivanovich", "Crigorev", 1986);
        controller.createStudent("Olesy", "Ivanovich", "Crigorev", 1983);
        controller.printAllStudents();

        System.out.println("--------------------------------------------------------------------------------------");
        controller.createTeacher("Anna","Sergeevna","Mirasova",1969);
        controller.createTeacher("Svetlana","Olegovna","Kyznecova",1972);
        controller.printTeachers();
        System.out.println("----------------------------------------------------------------------------------------");
        controller.createGroup(5,"Anna",45);
        controller.printGroup();
    }

}