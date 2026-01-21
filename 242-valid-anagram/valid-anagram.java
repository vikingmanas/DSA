class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] f = new int[26];

        for (char c : s.toCharArray()) {
            f[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            f[c - 'a']--;
        }

        for (int x : f) {
            if (x != 0)
                return false;
        }

        return true;
    }
}
