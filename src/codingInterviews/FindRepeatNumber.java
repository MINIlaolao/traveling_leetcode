package codingInterviews;

/**
 * 下标法
 * 找出数组中重复的数字。
 * <p>
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * 限制：
 * <p>
 * 2 <= n <= 100000
 *
 * @author laoqixin    [lmao6688@gmail.com]
 * @date 2022/7/31 21:26
 * @description TODO
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //下标法：根据下标和对应元素值匹配，如果两者不等，则将元素替换到相等下标的位置，即 nums[num[i]] = nums[i],期间，如果替换的时候出现相同的值，说明重复了，return
            //当数组值不等于下标时，替换。
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                //把数组值放到数组下标，下标和值相等
                int k = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = k;
            }
        }
        return -1;
    }
}
