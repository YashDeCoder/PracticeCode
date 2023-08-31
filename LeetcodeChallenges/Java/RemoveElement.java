class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int[] copyNums = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            if (num == val) {
                k--;
            } else {
                copyNums[i] = num;
                i++;
            }
        }
        nums = copyNums;
        return k;
    }

    public static void main(String[] args) {
        // For Removing an Element
        RemoveElement objectRemoveElement = new RemoveElement();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        objectRemoveElement.removeElement(nums, val);
    }
}