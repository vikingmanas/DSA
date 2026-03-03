class Solution {
    public long minCost(String s, int[] cost) {   
        long total = 0;
        long[] freqCost = new long[26];
        
        for (int i = 0; i < s.length(); i++) {
            total += cost[i];
            freqCost[s.charAt(i) - 'a'] += cost[i];
        }
        
        long maxKeep = 0;
        
        for (int i = 0; i < 26; i++) {
            maxKeep = Math.max(maxKeep, freqCost[i]);
        }
        
        return total - maxKeep;
    }
}