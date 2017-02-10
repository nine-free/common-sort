
###### 排序算法


冒泡排序 比较的是相邻两个元素的大小  时间复杂度O(n^2) 稳定
选择排序 每次循环选择出一个最大或者最小  时间复杂度O(n^2)  不稳定
快速排序 递归方式 交换  时间复杂度nlog2^n  


冒泡排序
```
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
```

选择排序
```
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
```



