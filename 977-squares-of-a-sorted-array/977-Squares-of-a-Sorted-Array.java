class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        int[] result = new int[n];

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }

            pos--;
        }

        return result;
    }
}