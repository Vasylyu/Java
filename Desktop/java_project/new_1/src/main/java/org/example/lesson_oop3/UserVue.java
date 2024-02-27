package org.example.lesson_oop3;

import java.util.List;

public interface UserVue<T extends User>{
    void sendToConsole(List<T> list);
}
