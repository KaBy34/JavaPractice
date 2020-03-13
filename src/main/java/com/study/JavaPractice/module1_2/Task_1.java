package com.study.JavaPractice.module1_2;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {

        MyCollection myColl = new MyCollection();

        System.out.print("Введите размер изначальной коллекции целых чисел, " +
                "а затем и сами целые числа: ");
        try {
            int count = MyCollection.scan();
            for (int i = 0; i < count; i++)
                myColl.add(i, MyCollection.scan());
        } catch (NullPointerException e){
            System.out.println("null - недопустимое значение!!!");
        }

        System.out.println("Полученная коллекция целых чисел: \n" + myColl);
        System.out.println();

        int choice;
        do {

            System.out.println("Выберите операцию над коллекцией: \n" +
                    "1 - добавление эл-та;\n" +
                    "2 - удаление эл-та;\n" +
                    "3 - поиск элемента по значению;\n" +
                    "4 - поиск элемента по индексу;\n" +
                    "5 - поиск максимального элемента;\n" +
                    "6 - поиск минимального элемента;\n" +
                    "7 - поиск среднего арифметического всех эл-ов;\n" +
                    "0 - ничего не делать.\n");
            System.out.print("Ваш выбор: ");

            choice = MyCollection.scan();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Введите добавляемый эл-нт: ");
                    int a = MyCollection.scan();
                    myColl.add(a);
                    break;
                case 2:
                    System.out.print("Введите индекс удаляемого эл-нта: ");
                    int b = MyCollection.scan();
                    myColl.remove(b);
                    break;
                case 3:
                    System.out.print("Найти эл-нт по значению: ");
                    int c = MyCollection.scan();
                    System.out.println("Элемент <" + c + "> под индексом [" + myColl.indexOf(c) + "]");
                    break;
                case 4:
                    System.out.println("Найти эл-нт под индексом: ");
                    int d = MyCollection.scan();
                    System.out.println("Под индексом [" + d + "] элемент <" + myColl.getIndex(d) + "]");
                    break;
                case 5:
                    System.out.print("Максимальный эл-нт: " + Collections.max(myColl));
                    break;
                case 6:
                    System.out.print("Минимальный эл-нт: " + Collections.min(myColl));
                    break;
                case 7:
                    System.out.println("Среднее арифметическое всех эл-ов: " + myColl.getAverage());
                    break;
                default:
                    break;
            }
            System.out.println("\nТекущая версия коллекции: \n" + myColl);
            System.out.println();

        } while ((choice < 8) && (choice > 0));
    }
}
