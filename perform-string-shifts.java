/*
 * @lc app=leetcode id=543 lang=java
 *
 * Perform String Shifts
 */

// @lc code=start

class Solution {
    public String stringShift(String s, int[][] shift) {
           if(s ==null || s.length()==0) return "";
           int left = 0;
           int right = 0;
           for (int i = 0; i < shift.length; i++) {
               if (shift[i][0] == 0)
                   left += shift[i][1];
               else
                   right += shift[i][1];
           }
           if (left - right == 0)
               return s;
   
           if (left > right) {
               return stringShift(s, left - right, true);
           } else {
               return stringShift(s, right - left, false);
           }
       }
   
       public  String stringShift(String str, int effShift, boolean left) {
           Deque<Character> dq = new LinkedList <>();
   
           for (int i = 0; i < str.length(); i++) {
               dq.add(str.charAt(i));
           }
           if(left){
               while(effShift!=0){
                   dq.addLast(dq.pollFirst());
                   effShift--;
               }
           }else{
               while(effShift!=0){
                   dq.addFirst(dq.pollLast());
                   effShift--;
               }
           }
         StringBuilder sb = new StringBuilder();
           for(int i=0;i<str.length() ;i++){
               sb.append(dq.pollFirst());
           }
            return sb.toString();
       }
   }
// @lc code=end
