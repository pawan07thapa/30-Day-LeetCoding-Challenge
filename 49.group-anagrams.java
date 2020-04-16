/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0)
            return res;
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] ca = strs[i].toCharArray();
            Arrays.sort(ca);
            String s = String.valueOf(ca);

            if (!hm.containsKey(s)) {
                hm.put(s, new ArrayList<>());
                hm.get(s).add(strs[i]);
            } else {
                hm.get(s).add(strs[i]);
            }
        }
        for (String str : hm.keySet()) {
            res.add(hm.get(str));
        }
        return res;
    }
}
// @lc code=end
