package string;

import java.util.HashSet;
import java.util.Set;

/**
 * created by dailf on 2018/10/14
 *
 * @author dailf
 */
public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        if (s== null || s.length() == 0){
            return 0;
        }
        int max = 0;
        int temp = 0;
        char c[] = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            Set<Character> set = new HashSet<Character>();
            temp = 0;
            for(int j = i;j<c.length;j++){
                if(set.contains(c[j])){
                    break;
                }else{
                    set.add(c[j]);
                    temp++;
                }
            }
            if (max<temp){
                max = temp;
            }
        }
        return max;

    }
}
