package org.example.lesson_oop3;

public abstract class User {

    //(Dependency Inversion Principle — DIP):
    // Класс Студент и класс Учитель наследуются от абстрактного класса user,
    // поэтому эти классы зависят от абстракции и легко могут быть изменены.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    // (Open/Closed Principle — OCP):
    // Класс user открыт для расширения,
    // можем добавить год рождения, например,
    // и закрыт для изменений так как строки имени фамилии и отчества приватны.
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
