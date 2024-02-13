package org.example.lesson_11;

import java.util.List;

public class Student {
    private String surname;
    private Integer group;
    private Integer stipendia;
    private List<Integer> grades;

    public Student() {
    }

    public Student(String surname, Integer group, Integer stipendia, List<Integer> grades) {
        this.surname = surname;
        this.group = group;
        this.stipendia = stipendia;
        this.grades = grades;
    }


    public boolean evenGrades() {
        Integer sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum % 2 == 0;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getStipendia() {
        return stipendia;
    }

    public void setStipendia(Integer stipendia) {
        this.stipendia = stipendia;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", group=" + group +
                ", stipendia=" + stipendia +
                ", grades=" + grades +
                '}';
    }

}
