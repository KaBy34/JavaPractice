package com.study.JavaPractice.module1_2;

import java.util.HashSet;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>();

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер изначальной коллекции целых чисел, " +
                "а затем и сами целые числа: ");
        int count = in.nextInt();
        for (int i = 0; i < count; i++)
            myHashSet.add(in.nextInt());

        System.out.println("Полученная коллекция целых уникальных чисел: \n" + "array =" + myHashSet);
        Integer[] array = myHashSet.toArray(new Integer[myHashSet.size()]);

        System.out.print("Введите искомое число: \n" + "Number = ");
        int number = in.nextInt();

        System.out.println();


        for (int i =0; i < array.length-1; i++)
            for (int j = i+1; j < array.length; j++) {
                if (calculate(number, array[i], array[j])) {
                    System.out.println("result = [" + i + ", " + j + "]");
                    break;
                }
            }
    }

    public static boolean calculate(int number, int x1, int x2) {
        return (x1 + x2) == number;
    }
}