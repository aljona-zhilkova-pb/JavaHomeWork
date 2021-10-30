package com.pb.Zhilkova.hw3;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[10];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;
        array[6] = 70;
        array[7] = 80;
        array[8] = 90;
        array[9] = 100;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println(array[8]);
        System.out.println(array[9]);

        int sum = 0;                            // сумма элементов массива
        for (int x = 0; x < array.length; x++) {
            sum += array[x];
            System.out.println("сумма:" + sum);
        }


        int pos = 0;                             // количество позитивных элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                pos++;
        }
        System.out.println("положительных:" + pos);

        for(int i = 0; i <  array.length; i++) {
            array[i] =  (int)(Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        System.out.print("\nSorted: \n");
                                                            //Сортируем массив
        Arrays.sort(array);
                                                            //Выводим отсортированный массив на консоль.
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
