class RemoveDuplicates2 {
    public static void moveNegativesToEnd(int[] arr) {
        int n = arr.length;
        int writeIndex = 0;

        // Move non-negative elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr[writeIndex++] = arr[i];
            }
        }

        // Fill remaining positions with -1
        while (writeIndex < n) {
            arr[writeIndex++] = -1;
        }
    }

    public int removeDuplicates(int[] nums) {
        // int count = 1;
        // int j = 0;
        // int key = nums[j];
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[j] == nums[i] && count < 2) {

        // count++;
        // j++;
        // nums[j] = nums[i];
        // } else {
        // if (nums[j] != nums[i]) {

        // nums[j + 1] = nums[i];

        // count = 1;
        // j++;
        // }
        // }
        // }
        // j = j++;
        // return j++;
        // if (nums.length == 1) {
        // return 1;
        // }
        // int k, i, index, count;
        // index = 0;
        // k = i = count = 1;
        // while (i < nums.length) {
        // if (nums[i] > nums[index]) {
        // count = 1;
        // k++;
        // i++;
        // index++;
        // } else {
        // if (i == nums.length - 1) {
        // break;
        // }
        // for (int j = i; j < nums.length; j++) {
        // if (nums[j] > nums[index]) {
        // index++;
        // count = 1;
        // nums[index] = nums[j];
        // k++;
        // break;
        // } else if (count == 2) {
        // k++;
        // index++;
        // } else {
        // count++;
        // }
        // }
        // i++;
        // }
        // }
        // return k;
        // boolean removal = false;
        // int duplicate = 1;
        // int count = 1;
        // int index = 0;
        // int startRep = 0;
        // int endRep = 0;
        // int j = 1;
        // int n = nums.length;

        // while (index < n) {
        // while (j < n) {
        // if (nums[index] == nums[j] && duplicate < 2) {
        // duplicate++;
        // count++;
        // } else if (nums[index] == nums[j] && duplicate >= 2) {
        // nums[j] = -1;
        // removal = true;
        // endRep = j;
        // }
        // duplicate = 1;
        // startRep = j;
        // j++;
        // break;
        // }
        // if (removal) {
        // moveNegativesToEnd(nums);
        // removal = false;
        // }
        // index = startRep;
        // }

        // return count;

        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] > nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;

    }
    // public int removeDuplicates(int[] nums) {
    // int k = 0;
    // int i = nums[0];
    // for (int num : nums) {
    // if (i == num) {
    // k++;
    // i++;
    // } else {
    // removeIndex(nums, i);
    // }
    // }
    // return k;
    // }

    // private int[] removeIndex(int[] array, int index) {
    // // List<Integer> arrayList = IntStream.of(array)
    // // .boxed()
    // // .collect(Collectors.toList());
    // // arrayList.remove(index);
    // // return arrayList.stream()
    // // .mapToInt(Integer::intValue)
    // // .toArray();

    // // moves all the indices into the one before
    // for (int i = index + 1; i < array.length; i++) {
    // array[i - 1] = array[i];
    // }
    // return array;
    // }

    public static void main(String[] args) {
        RemoveDuplicates2 object = new RemoveDuplicates2();
        int[] nums = { 0 };
        int k = object.removeDuplicates(nums);
    }
}