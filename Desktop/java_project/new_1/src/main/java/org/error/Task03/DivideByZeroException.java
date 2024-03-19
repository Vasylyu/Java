package org.error.Task03;
/**
 * Задание 3.2
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        super("division by zero");
    }

    public DivideByZeroException(String s) {
        super(s);
    }
}
