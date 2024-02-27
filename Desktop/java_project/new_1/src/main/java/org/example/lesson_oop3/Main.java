package org.example.lesson_oop3;

import java.util.ArrayList;

/**
 * Задача 1
 * � Создать класс Юзер и перенести в него базовые поля ( ФИО )
 * � Модифицировать ранее созданный класс СтудентКомпаратор
 * � Переименовать в ЮзерКомпаратор
 * � Типизировать его T наследующегося от типа Юзер ( T extends User )
 * � Типизировать реализуемый интерфейс Компаратор T
 * � Изменить метод компаре, внеся во входные данные вместо конкретных
 * классов типизацию T
 * � Внести правки места, где использовался предыдущий компаратор
 * <p>
 * Задача 2
 * � Создать интерфейс ЮзерВью
 * � Типизировать его T наследующегося от типа Юзер
 * � Создать в нем метод sendOnConsole(List<Student> students) используя
 * типизацию
 * � Создать класс СтудентВью реализующий созданный интерфейс
 */
public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.studentList.add(new Student(3L, "3", "a", "Chehov"));
        studentGroup.studentList.add(new Student(1L, "2", "A", "Pushkin"));
        studentGroup.studentList.add(new Student(2L, "4", "Bb", "Tolstoy"));
        studentGroup.studentList.add(new Student(4L, "1", "BB", "Tolstoy"));


        TeacherList teacherList = new TeacherList(new  ArrayList<>());
        teacherList.teacherList.add(new TeacherServise(1L,"Анна","Сергеевна","Мирясова"));
        teacherList.teacherList.add(new TeacherServise(2L,"Анжела","Олеговна","Жукова"));
        teacherList.teacherList.add(new TeacherServise(3L,"Анжелика","Андреевна","Селезнева"));


        StudentVue studentVue = new StudentVue();
        studentVue.sendToConsole(studentGroup.studentList);
        TeacherVue teacherVue = new TeacherVue();
        teacherVue.sendToConsole(teacherList.teacherList);

    }


}


