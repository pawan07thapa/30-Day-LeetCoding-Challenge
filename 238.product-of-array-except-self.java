/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
     /*   int[] fwd = new int[nums.length];
        int[] bw = new int[nums.length];
        int len = nums.length;
        fwd[0]=nums[0];
        bw[len-1]=nums[len-1];
        for (int i = 1; i < len; i++) {
            fwd[i] =fwd[i-1]  * nums[i ];
        }
        for (int i = len - 2; i >= 0; i--) {
            bw[i] =bw[i+1] * nums[i ];
        }
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                nums[i] = bw[i + 1];
            } else if (i == len - 1) {
                nums[i] = fwd[i - 1];
            } else {
                nums[i] = fwd[i - 1] * bw[i + 1];
            }
        }
        return nums;
        */
     int len = nums.length;
     int[] fwd = new int[len];
     fwd[0] = nums[0];
     for (int i = 1; i < len; i++) {
         fwd[i] = fwd[i - 1] * nums[i];
     }
     num[len - 1] = fwd[i - 1];
     int bw = nums[len - 1];
     for (int i = len - 2; i >= 0; i--) {
         if (i == 0) {
             nums[i] = bw;
         } else {
             nums[i] = fwd[i - 1] * bw;
         }

         bw = bw * nums[i];
        }

    }
}
// @lc code=end
