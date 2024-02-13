package org.example.lesson_9hw;

import java.util.*;

/**
 * Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже.
 * Если значение null, то параметр не должен попадать в запрос.
 * Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
 * String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
 * Пример: Строка sql-запроса:
 * select * from students where
 * Параметры для фильтрации:
 * <p>
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Результат:
 * <p>
 * select * from students where name='Ivanov' and country='Russia' and city='Moscow'
 */

public class Main {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }
        StringBuilder sb = new StringBuilder(QUERY);
        String[] arr_params = PARAMS.replaceAll("[{}\"]", "").split(", ");
        boolean first = true;
        for (String item : arr_params) {
            String[] str = item.split(":");
            if (!str[1].equals ("null")) {

                if (!first) {
                    sb.append("and ");
                        }
                        first = false;
                        sb.append(str[0]).append("=").append("'").append(str[1]).append("'");
                    }
                }
        System.out.println(sb);
            }
        }








