package com.soft1010.sort.common;

/**
 * @Author zhangjifu
 * @Create time: 2017/2/8 13:49
 * @Description:
 *
 * 1、冒泡排序
 * 2、时间复杂度 n^2
 * 3、最稳定的排序
 */
public class BuddleSort {

    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
        }
    }
}
