package sort;

import java.util.Scanner;

/**
 * created by dailf on 2018/9/19
 *
 * @author dailf
 */
public class QuickSort {
    static int n = 8;
    static int[] a = new int[10];

    public static void quicksort(int left, int right) {
        if (left > right) {
            return;
        }
        int i, j, t, temp;
        temp = a[left]; //temp中存的就是基准数
        i = left;
        j = right;
        while (i != j) {
            //顺序很重要，要先从右边开始找
            while (a[j] >= temp && i < j) {
                j--;
            }
            //再找左边的
            while (a[i] <= temp && i < j) {
                i++;
            }
            //交换两个数在数组中的位置
            if (i < j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        //最终将基准数归位
        a[left] = a[i];
        a[i] = temp;

        quicksort(left, i - 1);//继续处理左边的，这里是一个递归的过程
        quicksort(i + 1, right);//继续处理右边的 ，这里是一个递归的过程
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            int scan = scanner.nextInt();
            a[i] = scan;
        }
        //读入数据
        quicksort(1, n); //快速排序调用

        //输出排序后的结果
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
    }

}

