package duldimensionarray;

import java.util.concurrent.Executors;

/**
 * created by dailf on 2018/9/8
 *
 * @author dailf
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class SearchArray {
    public static void main(String[] args) {
        int target = 6;
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = find(target, array);
    }

    private static boolean find(int target, int[][] array) {
        int row = array.length;
        int rowl = 0;
        int column = array[0].length;
        int columnl = column - 1;
        while (rowl <= row - 1 && columnl >= 0) {
            //相等就返回
            if (array[rowl][columnl] == target) {
                return true;
            }
            // 如果当前数小于target
            if (array[rowl][columnl] < target) {
                rowl++;
            } else {
                columnl--;
            }
        }
        return false;
    }

}
