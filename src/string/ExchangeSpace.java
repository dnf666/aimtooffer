package string;

/**
 * created by dailf on 2018/9/8
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author dailf
 */
public class ExchangeSpace {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("we are family");
        System.out.println(replaceSpace(stringBuffer));
    }
    public static String replaceSpace(StringBuffer str) {
        for (int i = 0;i< str.length();i++){
            char c = str.charAt(i);
            if (c==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}
