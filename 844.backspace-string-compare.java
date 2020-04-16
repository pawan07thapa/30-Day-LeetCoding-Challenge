/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        S = backspaceCompareHelper_giveEffectiveString(S);
        T = backspaceCompareHelper_giveEffectiveString(T);

        return S.equals(T);
    }

    public String backspaceCompareHelper_giveEffectiveString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '#' && sb.length() == 0)
                continue;
            if (c == '#') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
// @lc code=end
