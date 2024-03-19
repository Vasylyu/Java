package org.control_work;

import java.util.Scanner;


public class Enter {
    public String[] enter() {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Введите данные в cтроку через ПРОБЕЛ (строка должна содержать Ф.И.О, " +
                "дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m )");
        String next = scanner.nextLine();
        String[] arrData = next.split(" ");

       if (arrData.length == 6) {
           return arrData;
       } else if (arrData.length < 6){
               throw new RuntimeException(String.format("Вы ввели недостаточно данных: "));

        }else throw new RuntimeException(String.format("Вы ввели много данных: "));

        }

    }

}



