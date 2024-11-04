package ru.oop.task3;


/**
 * Трансопорт, на котором поедет человек
 */
interface Transport extends Positioned {
    /**
     * Едет до пунтка назначения по возможности
     *
     * @param destination пункт назначения
     * @param person человек, который едет
     */
    Position move(Person person, Position destination);

}
