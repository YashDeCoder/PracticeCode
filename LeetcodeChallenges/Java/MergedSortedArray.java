import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MergedSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copyNums = mergeArrays(nums1, nums2, m, n);
        Arrays.sort(copyNums);
        nums1 = copyNums;
    }

    private int[] mergeArrays(int[] nums1, int[] nums2, int m, int n) {
        int[] filledArray = new int[n + m];
        for (int i = 0; i < m; i++) {
            filledArray[i] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            filledArray[j + m] = nums2[j];
        }
        return filledArray;
    }

    public int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        // THIS SHIT DOESN'T WORK WTF
        int[] copyNums = new int[m + n];
        System.arraycopy(nums1, 0, copyNums, 0, m);
        System.arraycopy(nums2, 0, copyNums, m, n);
        List<Integer> arrayList = IntStream.of(copyNums)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> copyList = new ArrayList<>(n + m);
        if (m == 0 && nums1[0] == 0) {
            nums1 = nums2;
        } else {
            while (arrayList.size() > 0) {
                int smallestInt = 10000;
                int index = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) < smallestInt) {
                        smallestInt = arrayList.get(i);
                        index = i;
                    }
                }

                // Remove the specified element and add it to an empty list
                arrayList.remove(index);
                copyList.add(smallestInt);

            }
            // return the resultant array
            nums1 = copyList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
        return nums1;
    }

    public static void main(String[] args) {
        // For the Longest Common Prefix
    }
}