package com;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {7, 5, 6, 4, 2, 9};
        ShellSort sourter = new ShellSort();
        sourter.sort(array);
    }

    public void sort(int[] array) {
        int len = array.length;
        int temp, open = len / 2;
        while (open > 0) {
            for (int i = open; i < len; i++) {
                temp = array[i];
                int preIndex = i - open;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + open] = array[preIndex];
                    preIndex -= open;
                }
                array[preIndex + open] = temp;
            }
            open /= 2;
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
