package purecode;

/**
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2021/8/17 20:08
 */
public class DefangIpaddrC {
    public static void main(String[] args) {
        DefangIpaddrC defangC = new DefangIpaddrC();
        System.out.println(defangC.defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {
        char[] array = address.toCharArray();
        //新数组长度
        int newArrayLength = array.length + 3 * 2;
        char[] newArray = new char[newArrayLength];
        //存储新数组下标
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            char item = array[i];
            if (item != '.') {
                newArray[k] = item;
                k++;
            } else {
                newArray[k] = '[';
                k++;
                newArray[k] = item;
                k++;
                newArray[k] = ']';
                k++;
            }
        }
        return new String(newArray);
    }
    /*
      给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。

      所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。

      示例 1：

      输入：address = "1.1.1.1"
      输出："1[.]1[.]1[.]1"
      示例 2：

      输入：address = "255.100.50.0"
      输出："255[.]100[.]50[.]0"
      提示：

      给出的 address 是一个有效的 IPv4 地址
      Related Topics
      字符串

      👍 67
      👎 0
     */
}
