package ru.oop.task3;

/**
 * Транспорт
 */
interface Transport extends Positioned {
    /**
     * Движение транспорта до пункта назначения
     * @param destination пункт назначения
     */
    void move(Position destination);
}
