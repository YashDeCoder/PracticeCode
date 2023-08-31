import java.util.Arrays;

// TODO: come back to this one
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == -1) {
                break;
            }
            if (nums[i] == nums[i + 1]) {
                removeIndex(nums, i);
            } else {
                k++;
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
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = object.removeDuplicates(nums);
    }
}