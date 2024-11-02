package ru.oop.task1;

/**
 * Машина
 */
interface Car {
    /**
     * Едет до пунтка назначения по возможности
     *
     * @param destination место назначения
     */
    Void move(Position destination);
}