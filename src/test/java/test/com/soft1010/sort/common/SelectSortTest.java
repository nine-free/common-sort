package test.com.soft1010.sort.common;

import com.soft1010.sort.common.SelectSort;

/**
 * @Author zhangjifu
 * @Create time: 2017/2/8 14:07
 * @Description:
 */
public class SelectSortTest {
    public static void main(String[] args){
        int[] arr = {5, 1, 2, 3, 0};
        SelectSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
