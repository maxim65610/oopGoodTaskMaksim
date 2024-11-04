package ru.oop.task2;
/**
 * Трансопорт, на котором поедет человек
 */
interface Transport extends Positioned  {
    /**
     * Едет до пунтка назначения по возможности
     * @param destination пункт назначения
     */
     void move(Person person, Position destination);
}
