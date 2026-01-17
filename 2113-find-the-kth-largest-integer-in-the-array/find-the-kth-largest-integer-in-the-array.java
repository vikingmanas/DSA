import java.util.*;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {

        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() != b.length()) return a.length() - b.length();
                return a.compareTo(b);
            }
        });

        int i = nums.length - 1;   // largest element index
        while (k > 1) {            // move (k-1) steps left
            i--;
            k--;
        }
        return nums[i];
    }
}
