/**
 * Product
 */
public class Product {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] pred = new int[n];
        int[] succ = new int[n];
        succ[n - 1] = 1;
        pred[0] = 1;
        for (int i = 1; i < n; i++) {
            pred[i] = pred[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            succ[i] = succ[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = pred[i] * succ[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        Product product = new Product();
        int[] answer = product.productExceptSelf(nums);
    }
}