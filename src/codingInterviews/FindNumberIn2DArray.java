package codingInterviews;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 现有矩阵 matrix 如下：
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * <p>
 * 限制：
 * <p>
 * 0 <= n <= 1000
 * <p>
 * 0 <= m <= 1000
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof">问题链接</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2022/7/31 22:09
 * @description TODO
 */
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
            return false;
        }
        /*
           从最左下角看，它永远大于上面，永远小于右边。
         * [
         * [1,   4,  7, 11, 15],
         * [2,   5,  8, 12, 19],
         * [3,   6,  9, 16, 22],
         * [10, 13, 14, 17, 24],
         * [18, 21, 23, 26, 30]
         * ]*/
        int cols = matrix.length;
        int rows = matrix[0].length;
        //初始化当前下标为左下角
        int col = cols - 1;
        int row = 0;

        while (col >= 0 && row < rows) {
            if (target > matrix[col][row]) {
                //target比当前值大，向右移位
                row += 1;
            } else if (target < matrix[col][row]) {
                //target比当前值小，向上移位
                col -= 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
