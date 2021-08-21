import java.util.Arrays;

/**
 * @author laoqixin    [qixin.lao@isee.work]
 * @date 2021/8/17 15:44
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum one1 = new TwoSum();
        System.out.println(Arrays.toString(one1.twoSum(new int[]{1, 3, 4, 5}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int index1 = 0; index1 < nums.length; index1++) {
            int value1 = nums[index1];
            for (int index2 = 0; index2 < nums.length; index2++) {
                int value2 = nums[index2];
                if (value1 + value2 == target) {
                    result[0] = index1;
                    result[1] = index2;
                    break;
                }
            }
        }
        return result;
    }
}
