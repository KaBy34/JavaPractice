package com.study.JavaPractice.module1_2;

import java.util.*;

public class Task_3 {
    public static void checkDuplicate(List<Integer> array) {
        Collections.sort(array);
        int result = 0;
        int n = -1;
        for (int i : array) {
            if (n == i)
                continue;
            int count = Collections.frequency(array, i);
            if (count > 1) {
                result++;
                if (result == 1)
                    System.out.println("Result: true");
                System.out.println("Число " + i + " повторяется " + count + " раза");
            }

            n = i;
        }
        if (result < 1)
            System.out.println("Result: false \n" + "Дубликатов нет");
    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер изначальной коллекции целых чисел, " +
                "а затем и сами целые числа: ");

        // collection initialization
        try {
            int count = in.nextInt();
            for (int i = 0; i < count; i++)
                array.add(in.nextInt());

        System.out.println("Полученная коллекция целых чисел: \n" + "Array: " + array);

        // duplicate calculating method
        checkDuplicate(array);

        } catch (NullPointerException e) {
            System.out.println("null - недопустимо");
        } catch (InputMismatchException e) {
            System.out.println("Символы - недопустимы");
        }
    }
}