package org.example.Phone_book;

public class Number {
    private String nameUser;
    private Integer numberPhone1;
    private Integer numberPhone2;

    public Number() {
    }

    public Number(String nameUser, Integer numberPhone1, Integer numberPhone2) {
        this.nameUser = nameUser;
        this.numberPhone1 = numberPhone1;
        this.numberPhone2 = numberPhone2;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Integer getNumberPhone1() {
        return numberPhone1;
    }

    public void setNumberPhone1(Integer numberPhone1) {
        this.numberPhone1 = numberPhone1;
    }

    public Integer getNumberPhone2() {
        return numberPhone2;
    }

    public void setNumberPhone2(Integer numberPhone2) {
        this.numberPhone2 = numberPhone2;
    }

    @Override
    public String toString() {
        return "Number{" +
                "nameUser='" + nameUser + '\'' +
                ", numberPhone1=" + numberPhone1 +
                ", numberPhone2=" + numberPhone2 +
                '}';
    }
}

