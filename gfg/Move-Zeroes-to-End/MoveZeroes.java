class Solution {
    void pushZerosToEnd(int[] arr) {
        int insertPos = 0;
        for (int x : arr) {
            if (x != 0) arr[insertPos++] = x;
        }
        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }
    }
}
