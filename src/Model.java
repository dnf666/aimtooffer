import java.util.Scanner;

/**
 * created by dailf on 2018/9/8
 *
 * @author dailf
 */
public class Model {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        int i = scanner.nextInt();
        return i;
    }

    public static String inputString() {
        String i = scanner.nextLine();
        return i;
    }

    public static int[][] inputTwoDimensionArray(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int x1 = scanner.nextInt();
                array[i][j] = x1;
            }
        }

        return array;
    }

}
