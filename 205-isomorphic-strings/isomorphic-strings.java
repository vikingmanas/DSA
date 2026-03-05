class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> word1 = new HashMap<>();
        HashMap<Character, Integer> word2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int prev1 = word1.getOrDefault(s.charAt(i), -1);
            int prev2 = word2.getOrDefault(t.charAt(i), -1);
            if (prev1 != prev2) {
                return false;
            }
            word1.put(s.charAt(i), i);
            word2.put(t.charAt(i), i);
        }
        return true;
    }
}