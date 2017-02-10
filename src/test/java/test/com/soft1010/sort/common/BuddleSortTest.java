package test.com.soft1010.sort.common;

import com.soft1010.sort.common.BuddleSort;

/**
 * @Author zhangjifu
 * @Create time: 2017/2/8 13:56
 * @Description:
 */
public class BuddleSortTest {

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 0};
        BuddleSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
