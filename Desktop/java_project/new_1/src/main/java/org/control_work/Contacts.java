package org.control_work;


public class Contacts {
    String surname;
    String name;
    String patronymic;



    public Contacts(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;

    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s>", surname, name, patronymic);
    }
}