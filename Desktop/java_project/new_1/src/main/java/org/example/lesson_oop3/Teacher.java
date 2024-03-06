package org.example.lesson_oop3;

public  class Teacher extends User implements Comparable<Teacher> {

    public Long teacherId;
    //  (Liskov Substitution Principle — LSP):
    //  В данной программе мы можем спокойно заменить (или добавить) класс Учитель
    //  на любой другой класс, например "родитель ученика",
    //  так как Учитеть и Студент наследуются от класса user,
    //  который универсално может принимать ФИО.

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + " " +
                super.toString() +
                '}';

    }

    public Teacher(Long teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }


    @Override
    public int compareTo(Teacher o) {
        if (this.teacherId > o.teacherId)
            return 1;
        else if (this.teacherId < o.teacherId)
            return -1;
        else return 0;
    }
}