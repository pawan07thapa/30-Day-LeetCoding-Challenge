/*
 * @lc app=leetcode id=49 lang=java
 *
 *  Counting Elements
 */

// @lc code=start
class Solution {
    public int countElements(int[] arr) {
     if(arr.length ==0 || arr.length ==1) return 0;
        
        HashSet<Integer> hs = new HashSet<>();
         for(int ele : arr)
            hs.add(ele);
        
        int cnt=0;
         for(int i=0;i<arr.length ;i++){
             if(hs.contains(arr[i]+1)){
                 cnt+=1;
             }
         }
        return cnt;
    }
}