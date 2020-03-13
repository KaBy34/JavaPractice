package com.study.JavaPractice.module1_2;

import java.util.*;

class MyCollection extends ArrayList<Integer>{

    public int getIndex(int index) {

        return get(index);
    }

    @Override
    public boolean add(Integer value) {
        for (int i = 0; i < size(); i++) {
            set(i, get(i) + value);
        }
        return super.add(value);
    }
    public void remove(Integer value) {
        for (int j = 0; j < size(); j++) {
            set(j, get(j) - value);
        }
        super.remove(value);
    }

    public double getAverage(){
        int sum = 0;
        double avg;
        for(int i = 0; i < size(); i++)
            sum += getIndex(i);
        avg = sum / size();
        return avg;
    }

    public static int scan() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
