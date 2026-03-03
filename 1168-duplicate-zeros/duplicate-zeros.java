class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> ar = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ar.add(arr[i]);
            if (arr[i] == 0) {
                ar.add(0);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ar.get(i);
        }
    }
}