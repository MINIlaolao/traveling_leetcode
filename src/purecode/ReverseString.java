package purecode;

/**
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/8/20 00:02
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        //双指针
        int i = 0;
        int j = n - 1;
        char k;
        while (i < j) {
            k = s[i];
            s[i] = s[j];
            s[j] = k;
            i++;
            j--;
        }
    }
}
