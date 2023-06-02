public class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftProductNums = new int[len];    // Array to store the product of left subarrays for each element
        int[] rightProductNums = new int[len];   // Array to store the product of right subarrays for each element
        int[] result = new int[len];         // Result array

        // Calculating the product of left subarrays for each element
        // {1,2,3,4}->{1,1,2,6}
        leftProductNums[0] = 1;
        for (int i = 1; i < len; i++) {
            leftProductNums[i] = nums[i - 1] * leftProductNums[i - 1];
        }

        // Calculating the product of right subarrays for each element
        // {1,2,3,4}->{24,12,4,1}
        rightProductNums[len - 1] = 1;
        for (int i = len - 2; i > -1; i--) {
            rightProductNums[i] = nums[i + 1] * rightProductNums[i + 1];
        }

        // Calculating the final result array
        // {1,1,2,6} * {24,12,4,1} = {24,12,8,6}
        for (int i = 0; i < len; i++) {
            result[i] = leftProductNums[i] * rightProductNums[i];
        }

        return result;
    }

}