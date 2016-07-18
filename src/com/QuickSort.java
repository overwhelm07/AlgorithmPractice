package com;

import java.util.Arrays;

/**
 * Created by JeongHeon on 2016. 4. 23..
 */
public class QuickSort {
    static int[] s = {1, 3, 2, 8, 4, 11};

    public static void main(String[] args) {
        quickSort(0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    public static void quickSort(int low, int high) {
        int pivotPoint;
        if (high > low) {
            pivotPoint = partition(low, high);
            quickSort(low, pivotPoint - 1);
            quickSort(pivotPoint + 1, high);
        }
    }

    public static int partition(int low, int high) {
        int i, j, pivotPoint;
        int pivotItem = s[low];
        j = low;
        for (i = low + 1; i <= high; i++) {
            if (s[i] < pivotItem) {
                j++;
                swap(i, j);
            }
        }
        pivotPoint = j;
        swap(low, pivotPoint);
        return pivotPoint;
    }

    public static void swap(int i, int j) {
        int tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}
