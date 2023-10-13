import java.util.Arrays;

// TODO: come back to this one
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // Arrays.sort(nums);
        // int k = 1;
        // for (int i = 0; i < nums.length - 1; i++) {
        // if (nums[i] == -1) {
        // break;
        // }
        // if (nums[i] == nums[i + 1]) {
        // removeIndex(nums, i);
        // } else {
        // k++;
        // }
        // }
        // return k;
        // if (nums.length == 1) {
        // return 1;
        // }
        // // assert nums.length > 1
        // int nonDup = 1;
        // int i = 1;
        // int index = i;
        // while (i < nums.length - 1) {
        // // int key = nums[i];
        // for (int j = index + 1; j < nums.length; j++) {
        // if (nums[index] < nums[j]) {
        // nums[i] = nums[j];
        // index = j;
        // nonDup += 1;
        // break;
        // }
        // }
        // i++;

        // }
        // return nonDup;
        if (nums.length == 1) {
            return 1;
        }
        int k, i, index;
        index = 0;
        k = i = 1;
        while (i < nums.length) {
            if (nums[i] > nums[index]) {
                k++;
                i++;
                index++;
            } else {
                if (i == nums.length - 1) {
                    break;
                }
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > nums[index]) {
                        nums[index + 1] = nums[j];
                        index++;
                        k++;
                        break;
                    }
                }
                i++;
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
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = -1;
        }
        return array;
    }

    public static void main(String[] args) {
        RemoveDuplicates object = new RemoveDuplicates();
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums = { 1, 1, 2, 3 };
        int k = object.removeDuplicates(nums);
    }
}