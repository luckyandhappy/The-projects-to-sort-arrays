package com;
import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {7, 5, 6, 4, 2, 9};
        CountingSort sourter = new CountingSort();
        sourter.sort(array);
    }

    public void sort(int[] array) {
        int tool, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        tool = 0 - min;
        int[] temp = new int[max - min + 1];
        Arrays.fill(temp, 0);
        for (int i = 0; i < array.length; i++) {
            temp[array[i] + tool]++;
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (temp[i] != 0) {
                array[index] = i - tool;
                temp[i]--;
                index++;
            } else
                i++;
        }
        showArray(array);
    }

    public void showArray(int[] array){
        for (int i:array){
            System.out.print("<" + i);
        }
        System.out.println();
    }
}
