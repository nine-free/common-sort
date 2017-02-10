package test.com.soft1010.sort.common;

import com.soft1010.sort.common.QuickSort;

/**
 * @Author zhangjifu
 * @Create time: 2017/2/10 14:34
 * @Description:
 */
public class QuickSortTest {

    public static void main(String[] args) {
        int[] arr = {12, 3, 2, 5, 7, 8, 1};
        QuickSort.quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
