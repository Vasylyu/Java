package org.example.Phone_book3;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class PhoneBook {
    private static final String All_contact = "contacts.txt";

    public static void main(String[] args) {
        Map<String, List<String>> contacts = new HashMap<String, List<String>>();
        contacts.put("Мария ", new ArrayList<>(Arrays.asList("8923346667", "3456777", "8999035435")));
        contacts.put("Олег ", new ArrayList<>(Arrays.asList("892334667", "3456459")));
        contacts.put("Петя ", new ArrayList<>(Arrays.asList("892334667", "3458450")));
        contacts.put("Света ", new ArrayList<>(Arrays.asList("892334667", "898989457")));
        contacts.put("Миша", new ArrayList<>(Arrays.asList("892334667")));
        contacts.put("Артем", new ArrayList<>(Arrays.asList("892334667")));
        contacts.put("Наташа", new ArrayList<>(Arrays.asList("892334667")));

        System.out.println("Телефонная книга ");
        System.out.println("======================================");
        System.out.println("Нажми команду 'exit' когда закончишь:");
        listCommands();
        System.out.print(": ");


        Scanner input = new Scanner(System.in);
        String line = input.nextLine().trim();

        while (!line.equals("exit")) {

            switch (line) {
                case "list":
                    listContacts(contacts);
                    break;
                case "show":
                    showContact(contacts, input);
                    break;
                case "find":
                    findContact(contacts, input);
                    break;
                case "add":
                    addContact(contacts, input);
                    break;
                case "edit":
                    editContact(contacts, input);
                    break;
                case "delete":
                    deleteContact(contacts, input);
                    break;
                case "help":
                    listCommands();
                    break;
                default:
                    System.out.println("Неверная команда ввода");
                    break;
            }


            System.out.print("\n> ");
            line = input.nextLine().trim();
        }

        System.out.println("'Phone Book 3' Закрыта.");

    }

    private static void saveContacts(Map<String, List<String>> contacts) {
        try (PrintWriter writer = new PrintWriter(All_contact)) {
            if (!contacts.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
                    String line = String.format("%s,\"%s\"",
                            entry.getKey(), entry.getValue().toString().replaceAll("\\[|]", ""));
                    writer.println(line);
                }
            }

        } catch (IOException ioex) {
            System.err.println(ioex.getMessage());
        }
    }



    private static void listCommands() {
        System.out.println("list - Все контакты");
        System.out.println("show - поиск контакта по имени");
        System.out.println("find - поиск контакта по номеру");
        System.out.println("add - добавления контакта");
        System.out.println("edit - изменея номера контакта");
        System.out.println("delete - полное удаление контакта");
        System.out.println("help - список доступных команд в меню");
        System.out.println("----------------------------------------");
    }

    private static void listContacts(Map<String, List<String>> contacts) {
        if (!contacts.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
                System.out.println(entry.getKey());
                for (String number : entry.getValue()) {
                    System.out.println(number);
                }
                System.out.println();
            }
        } else {
            System.out.println("No records found, the phone book is empty!");
        }

        System.out.println();
        System.out.println("Выбери команду выхода 'exit' или команду меню 'help':");
    }

    private static void showContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Введите имя для поиска:");
        String name = input.nextLine().trim();

        if (contacts.containsKey(name)) {
            System.out.println(name);
            for (String number : contacts.get(name)) {
                System.out.println(number);
            }
        } else {
            System.out.println("Извени,ничего не найдено");
        }

        System.out.println();
        System.out.println("Выбери команду выхода 'exit' или команду меню 'help':");
    }

    private static void findContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Введите номер телефона для поиска:");
        String number = input.nextLine().trim();

        while (!number.matches("^\\+?[0-9 ]{3,25}$")) {
            System.out.println("Invalid number! May contain only digits, spaces and '+'. Min length 3, max length 25.");
            System.out.println("Ввведите номер:");
            number = input.nextLine().trim();
        }

        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            if (entry.getValue().contains(number)) {
                System.out.println(entry.getKey());
                System.out.println(number);
            }
        }

        System.out.println();
        System.out.println("Выбери команду выхода 'exit' или команду меню 'help':");
    }

    private static void addContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Напишите о контакте");
        String name;
        String number;

        while (true) {
            System.out.println("Введите имя контакта:");
            name = input.nextLine().trim();
            if (name.matches("^.{2,50}$")) {
                break;
            } else {
                System.out.println("Name must be in range 2 - 50 symbols.");
            }
        }

        while (true) {
            System.out.println("Введите номер контакта:");
            number = input.nextLine().trim();
            if (number.matches("^\\+?[0-9 ]{3,25}$")) {
                break;
            } else {
                System.out.println("Number may contain only '+', spaces and digits. Min length 3, max length 25.");
            }
        }

        if (contacts.containsKey(name)) {
            System.out.printf("'%s' already exists in the phone book!\n", name);

            if (contacts.get(name).contains(number)) {
                System.out.printf("Number %s already available for contact '%s'.\n", number, name);
            } else {
                contacts.get(name).add(number);
                saveContacts(contacts);
                System.out.printf("Successfully added number %s for contact '%s'.\n", number, name);
            }

        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            contacts.put(name, numbers);
            saveContacts(contacts);
            System.out.printf("Successfully added contact '%s' !\n", name);
        }

        System.out.println();
        System.out.println("Выбери команду выхода 'exit' или команду меню 'help':");
    }

    private static void editContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Enter name of the contact you would like to modify:");
        String name = input.nextLine().trim();

        if (contacts.containsKey(name)) {
            List<String> numbers = new ArrayList<>(contacts.get(name));
            System.out.printf("Current number(s) for %s:\n", name);
            for (String number : numbers) {
                System.out.println(number);
            }
            System.out.println();
            System.out.println("Would you like to add a new number or delete an existing number for this contact? [add/delete/cancel]");
            String editOption = input.nextLine().trim().toLowerCase();
            boolean addNumber = false;
            boolean delNumber = false;

            option:
            while (true) {
                switch (editOption) {
                    case "add":
                        addNumber = true;
                        break option;
                    case "delete":
                        delNumber = true;
                        break option;
                    case "cancel":
                        System.out.println("Contact was not modified!");
                        break option;
                    default:
                        System.out.println("Use 'add' to save a new number, 'delete' to remove an existing number or 'cancel' to go back.");
                        editOption = input.nextLine().trim().toLowerCase();
                        break;
                }
            }

            if (addNumber) {
                while (true) {
                    System.out.println("Enter new number:");
                    String number = input.nextLine().trim();
                    if (number.matches("^\\+?[0-9 ]{3,25}$")) {
                        contacts.get(name).add(number);
                        saveContacts(contacts);
                        System.out.printf("Number %s was successfully added, record updated!\n", number);
                        break;
                    } else {
                        System.out.println("Number may contain only '+', spaces and digits. Min length 3, max length 25.");
                    }
                }
            }

            if (delNumber) {
                while (true) {
                    System.out.println("Введите номер,который хотите удалить");
                    String number = input.nextLine().trim();
                    if (numbers.contains(number)) {
                        numbers.remove(number);
                        contacts.put(name, numbers);
                        saveContacts(contacts);
                        System.out.printf("Number %s was removed from the record for '%s'\n", number, name);
                        break;
                    } else {
                        System.out.printf("Number does not exist! Current number(s) for %s:\n", name);
                        for (String num : numbers) {
                            System.out.println(num);
                        }
                    }
                }
            }

        } else {
            System.out.println("Sorry, name not found!");
        }

        System.out.println();
        System.out.println("Выбери команду выхода 'exit' или команду меню 'help':");
    }

    private static void deleteContact(Map<String, List<String>> contacts, Scanner input) {
        System.out.println("Введите имя контакта,который хотите удалить: ");
        String name = input.nextLine().trim();

        if (contacts.containsKey(name)) {
            System.out.printf("Contact '%s' will be deleted. Are you sure? [Y/N]:\n", name);
            String confirmation = input.nextLine().trim().toLowerCase();
            confirm:
            while (true) {
                switch (confirmation) {
                    case "y":
                        contacts.remove(name);
                        saveContacts(contacts);
                        System.out.println("Contact was deleted successfully!");
                        break confirm;
                    case "n":
                        break confirm;
                    default:
                        System.out.println("Delete contact? [Y/N]:");
                        break;
                }
                confirmation = input.nextLine().trim().toLowerCase();
            }

        } else {
            System.out.println("Извени, контакт не найден");
        }

        System.out.println();
        System.out.println("Выбери команду выхода 'exit' или команду меню 'help':");
    }

}


