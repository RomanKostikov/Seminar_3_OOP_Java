package org.example.cw;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    /**
     * 1. (cw) Создать класс Dog и добавить возможноность итерирования по нему;
     * 2. (hw) Добавить Comparable и/или Comparator к приложению, написанному на семинаре;
     *
     * @param args
     */
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        listDogs.setListDogs(Arrays.asList(
                new Dog("Bob"),
                new Dog("Bib"),
                new Dog("Pip")));
        System.out.println("--------Перебор итератором--------");
        Iterator<Dog> iter = listDogs.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("\n--------Сортировка через класс ComparableOfNameDog по имени--------");
        listDogs.getListDogs().sort(new ComparableOfNameDog());
        for (Dog dog : listDogs) {
            System.out.println(dog);
        }
    }
}
