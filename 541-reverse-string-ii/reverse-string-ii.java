class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i += 2 * k) {
            if (i + k - 1 <= n - 1) {
                rev(i, i + k - 1, arr);
            } else {
                rev(i, n - 1, arr);
            }
        }
        String ans = new String(arr);
        return ans;
    }

    public void rev(int i, int j, char[] arr) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}