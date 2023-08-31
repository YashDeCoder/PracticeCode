import java.util.Arrays;

class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majority = nums.length / 2;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > majority) {
                    majority = nums[i];
                    break;
                }
            } else {
                count = 1;
            }
        }
        if (nums.length == 1) {
            majority = nums[0];
        }
        return majority;
    }

    public static void main(String[] args) {
        MajorityElement element = new MajorityElement();
        int[] nums = { 1 };
        int k = element.majorityElement(nums);
    }
}