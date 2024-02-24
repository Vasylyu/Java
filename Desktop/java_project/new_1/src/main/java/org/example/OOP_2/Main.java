package org.example.OOP_2;


/**
 * Задание 1.
 *Необходимо реализовать:
 * 1. Интерфейс ActorBehavoir,
 * который будет содержать
 * описание возможных
 * действий актора в
 * очереди/магазине
 * 2. Абстрактный класс Actor,
 * который хранит в себе
 * параметры актора, включая
 * состояние готовности сделать
 * заказ и факт получения
 * заказа. Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
 * “персональных данных” abstract
 * 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
 * Задание 2ю
 * Необходимо реализовать строение классов, без
 * конкретной реализации:
 * 1. Интерфейс QueueBehaviour, который описывает
 * логику очереди – помещение в/освобождение из
 * очереди, принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает
 * логику магазина – приход/уход покупателей,
 * обновление состояния магазина
 * 3. Класс Market, который реализовывает два
 * вышеуказанных интерфейса и хранит в списке
 * список людей в очереди в различных статусах
 */

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Petr");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();

    }
}