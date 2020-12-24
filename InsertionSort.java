package com;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {7, 5, 6, 4, 2, 9};
        InsertionSort sourter = new InsertionSort();
        sourter.sort(array);
    }

        public void sort(int[] array) {
            int current;
            for (int i = 0; i < array.length - 1; i++) {
                current = array[i + 1];
                int preIndex = i;
                while (preIndex >= 0 && current < array[preIndex]) {
                    array[preIndex + 1] = array[preIndex];
                    preIndex--;
                }
                array[preIndex + 1] = current;
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

