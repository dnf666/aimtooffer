package 网易;


import java.util.ArrayList;
import java.util.List;

/**
 * created by dailf on 2018/9/8
 *
 * @author dailf
 */
public class Parentheses {
    public static void main(String[] args) {
        System.out.println(diffWaysToCompute("1+2*3").toString());
    }
    public static List<Integer> diffWaysToCompute(String input) {
        //int i = 0;
        List<Integer> res = helper(input);

        return res;
    }

    public static List<Integer> helper(String input) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int n = input.length();
        while (i < n) {
            //int j=i;
            while (i < n && Character.isDigit(input.charAt(i))) i++;
            if(i==n) break;
            String s1 = input.substring(0, i);
            String s2 = input.substring(i + 1);
            char operator = input.charAt(i);
            List<Integer> list1 = helper(s1);
            List<Integer> list2 = helper(s2);
            if (operator == '+') {
                for (int i1 : list1) {
                    for (int i2 : list2) {
                        res.add(i1 + i2);
                    }
                }
            } else if (operator == '-') {
                for (int i1 : list1) {
                    for (int i2 : list2) {
                        res.add(i1 - i2);
                    }
                }
            } else {
                for (int i1 : list1) {
                    for (int i2 : list2) {
                        res.add(i1 * i2);
                    }
                }
            }
            i++;
        }
        if(res.isEmpty()) res.add(Integer.parseInt(input));
        return res;
    }
}
