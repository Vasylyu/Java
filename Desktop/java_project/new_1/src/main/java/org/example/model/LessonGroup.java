package org.example.model;

public class LessonGroup {
    private Integer numberGroup;

    private String TeacherName;
    private Integer countStudent;

    public Integer getNumberGroup() {
        return numberGroup;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public Integer getCountStudent() {
        return countStudent;
    }

    public LessonGroup(Integer numberGroup, String teacherName, Integer countStudent) {
        this.numberGroup = numberGroup;
        TeacherName = teacherName;
        this.countStudent = countStudent;

    }



    @Override
    public String toString() {
        return "LessonGroupService{" +
                "numberGroup=" + numberGroup +
                ", TeacherName='" + TeacherName + '\'' +
                ", countStudent=" + countStudent +
                super.toString() +
                '}';
    }
}