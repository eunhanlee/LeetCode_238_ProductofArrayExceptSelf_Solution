public class Solution {
    /**
     * Calculates the product of all elements in the input array except itself.
     *
     * @param nums The input array of integers.
     * @return An array of integers where each element represents the product of all elements except itself.
     */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        result[0] = 1;  // Initialize the product of left subarray as 1 for the first element
        for (int i = 1; i < len; i++) {
            result[i] = nums[i - 1] * result[i - 1];  // Calculate the product of left subarray
        }

        int rightProduct = 1;  // Initialize the cumulative product from right to left
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= rightProduct;  // Multiply the product of left subarray and right subarray
            rightProduct *= nums[i];  // Update the cumulative product from right
        }

        return result;  // Return the result array
    }
}
