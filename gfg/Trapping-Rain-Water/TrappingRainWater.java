class Solution {
    long trappingWater(int[] arr) {
        int left = 0, right = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        long water = 0;

        while (left < right) {
            if (arr[left] <= arr[right]) {
                leftMax = Math.max(leftMax, arr[left]);
                water += leftMax - arr[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, arr[right]);
                water += rightMax - arr[right];
                right--;
            }
        }

        return water;
    }
}
