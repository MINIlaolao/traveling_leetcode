/**
 * @author laoqixin    [qixin.lao@isee.work]
 * @date 2021/8/21 23:51
 */
public class ReverseWords {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        //去除多余的前置、后置和内部空格
        int newLength = trim(str);

        return null;
    }

    /**
     * 原地删除多余的前置空格，后置空格，以及内部多余的空格，返回字符串长度
     *
     * @param str 原始str
     * @return 字符串长度
     */
    private int trim(char[] str) {

        int i = 0;
        int n = str.length;
        //记录删除后字符串长度
        int k = 0;
        char space = ' ';
        //X 只有一个空格的时候指针往前
        //Y 去除最前面的空格
        while (i < n && str[i] == space) {
            i++;
        }

        //到这里说明发现多余空格
        while (i < n) {
            char item = str[i];
            //找到空格，判断其后一位是否有空格
            if (item == space) {
                int nextIndex = i + 1;
                //如果到尽头就不用添加空格
                boolean isEndIndex = nextIndex < n;
                boolean isLatestItemHasSpace = str[nextIndex] == space;
                if (isEndIndex && !isLatestItemHasSpace) {
                    //前面有字符，根据要求要空一位空格。
                    str[k] = space;
                    k += 1;
                }
            } else {
                //不是空格则交换
                str[k] = item;
                k += 1;
            }
            i += 1;
        }
        return k;
    }
}
