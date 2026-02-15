class Solution {
    public String addBinary(String a, String b) {
        int n = a.length() - 1;
        int m = b.length() - 1;
        StringBuilder re = new StringBuilder();
        int c = 0;

        while (n >= 0 || m >= 0 || c == 1) {
            int x = 0, y = 0;

            if (n >= 0) x = a.charAt(n--) - '0';
            if (m >= 0) y = b.charAt(m--) - '0';

            int sum = x + y + c;
            re.append(sum % 2);
            c = sum / 2;
        }
        return re.reverse().toString();
    }
}
