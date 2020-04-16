/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        Set<Integer> hs = new HashSet<>();
        while (n > 1 && !hs.contains(n)) {
            hs.add(n);
            n = giveSumOfSquares(n);
        }
        return n == 1;

    }

private int giveSumOfSquares(int n) {
    int sum = 0, h = 0;
    while (n > 0) {
        h = n % 10;
        sum += (h * h);
        n /= 10;
    }
    return sum;
}
// @lc code=end
