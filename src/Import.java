// Рандомные числа
package ru.proglib;

import java.util.Random; // импортируем описание класса из пакета java.util
public class Import {
    public static void main(String[] args) {
        var random = new Random();
        System.out.println(random.nextInt()); // выводим на экран случайное число

    }
}