package ru.oop.task3;
/**
 * Автобус, на котором поедет человек
 */
public class Bus implements Transport{
    /**
     * Конструктор для создания автобуса с его номером маршрута.
     * @param routeNumber номер маршрута автобуса
     */
    public Bus(String routeNumber) {
        //TODO
    }
    /**
     * Едет до пунтка назначения по возможности
     *
     * @param person      человек, который поедет на машине
     * @param destination место назначения
     * @return новое местоположение после перемещения
     */
    @Override
    public Position move(Person person, Position destination) {
        //TODO
        return null;
    }
    @Override
    public Position getPosition() {
        return null;
    }
}
