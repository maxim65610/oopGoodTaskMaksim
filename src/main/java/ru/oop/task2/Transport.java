package ru.oop.task2;
/**
 * Трансопорт
 */
interface Transport extends Positioned {
    /**
     * Движение транспорта до пункта назначения
     * @param destination пункт назначения
     */
    void move(Position destination);;
}
