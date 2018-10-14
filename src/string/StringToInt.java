package string;

import java.util.HashSet;
import java.util.Set;

/**
 * created by dailf on 2018/9/23
 *
 * @author dailf
 */
public class StringToInt {
    static boolean finished = false;

    public static void main(String[] args) {
        System.out.println(StrToInt("+123"));
    }

    public static int StrToInt(String str) {
        if (str == "" || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        int length = str.length();
        int i = 0;

        boolean minus = false;
//先判断第一个字符是否是正负号
        if (str.charAt(0) == '-') {

            minus = true;

            i++;

        } else if (str.charAt(0) == '+') {

            i++;

        }

        long MIN_VALUE = Integer.MIN_VALUE;

        long MAX_VALUE = Integer.MAX_VALUE;

        long num = 0;

        for (; i < length && !finished; i++) {

            char c = str.charAt(i);

            if (c >= '0' && c <= '9') {

                num *= 10;

                num += c - '0';

            } else {

                num = 0;

                break;

            }

            if (minus && 0 - num < MIN_VALUE) {

                return Integer.MIN_VALUE;

            }

            if (!minus && num > MAX_VALUE) {

                return Integer.MAX_VALUE;

            }

        }

        if (i == length) {

            finished = true;

        }

        return minus ? new Long(0 - num).intValue() : new Long(num).intValue();

    }

}


