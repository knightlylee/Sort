package selection;

/**
 * Created by kilo on 2018/9/16.
 * 选择排序
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        //执行了arr.length-1次排序
        for (int i = 0; i < arr.length-1; i++) {
            //寻找[i,arr.length)区间里的最小值
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);

            //每趟排序的结果
            for (int k = 0; k <arr.length; k++) {
                System.out.printf("%d ", arr[k]);
            }
            System.out.println();
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 8, 7, 9, 6, 2, 3, 0, 1};
        sort(a);
        System.out.println("=========最后结果=========");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
