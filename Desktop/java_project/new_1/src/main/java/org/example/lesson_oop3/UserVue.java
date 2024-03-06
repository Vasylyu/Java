package org.example.lesson_oop3;

import java.util.List;

public interface UserVue<T extends User>{
    void sendToConsole(List<T> list);
    //  (Interface Segregation Principle — ISP):
    //  В данной программе пользователь не зависит от интерфейса,
    //  так как в нем реализовано только вывод в консоль и ничего лишнего.
}
