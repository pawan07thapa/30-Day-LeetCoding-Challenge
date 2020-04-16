/*
 *
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (arr.length == 0 || arr.length == 1)
            return 0;

        HashSet<Integer> hs = new HashSet<>();
        for (int ele : arr)
            hs.add(ele);

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i] + 1)) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
// @lc code=end
