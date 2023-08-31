class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int i = nums[0];
        for (int num : nums) {
            if (i == num) {
                k++;
                i++;
            } else {
                removeIndex(nums, i);
            }
        }
        return k;
    }

    private int[] removeIndex(int[] array, int index) {
        // List<Integer> arrayList = IntStream.of(array)
        // .boxed()
        // .collect(Collectors.toList());
        // arrayList.remove(index);
        // return arrayList.stream()
        // .mapToInt(Integer::intValue)
        // .toArray();

        // moves all the indices into the one before
        for (int i = index + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        return array;
    }

    public static void main(String[] args) {
        RemoveDuplicates object = new RemoveDuplicates();
        int[] nums = { 1, 1, 2 };
        int k = object.removeDuplicates(nums);
    }
}