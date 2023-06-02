public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();

        int[] nums = {1, 2, 3, 4};

        int[] temp = tt.productExceptSelf(nums);

        for (int val : temp) System.out.print(val+" ");

    }


}