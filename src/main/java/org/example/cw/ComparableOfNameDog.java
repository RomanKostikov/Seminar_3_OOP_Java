package org.example.cw;

import java.util.Comparator;

/**
 * Класс сортировки по имени собаки
 */
public class ComparableOfNameDog implements Comparator<Dog> {
    /**
     * Переопределенный метод сортировки по имени
     *
     * @param dog1 the first object to be compared.
     * @param dog2 the second object to be compared.
     * @return возвращает int-ое значение результата сортировки
     */
    @Override
    public int compare(Dog dog1, Dog dog2) {
        return dog1.getName().compareTo(dog2.getName());
    }
}
