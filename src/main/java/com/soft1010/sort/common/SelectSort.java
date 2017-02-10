package com.soft1010.sort.common;

/**
 * @Author zhangjifu
 * @Create time: 2017/2/8 14:01
 * @Description:
 */
public class SelectSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
