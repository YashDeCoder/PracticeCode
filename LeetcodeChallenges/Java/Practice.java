import java.util.HashSet;

public class Practice {

    public static int[] practiceNumbers(int[] arr) {
        HashSet<Integer> first = new HashSet<Integer>();
        HashSet<Integer> second = new HashSet<Integer>();
        int[] returnNum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            final int j = i;
            if (first.stream().anyMatch(x -> x > arr[j]) && second.stream().anyMatch(x -> x > arr[j])) {
                if (first.size() > second.size()) {
                    second.add(arr[i]);
                } else {
                    first.add(arr[i]);
                }
            } else if (first.stream().anyMatch(x -> x > arr[j]) && !(second.stream().anyMatch(x -> x > arr[j]))) {
                first.add(arr[i]);
            } else {
                second.add(arr[i]);
            }
        }

        if (first.addAll(second)) {
            returnNum = first.stream().mapToInt(Integer::intValue).toArray();
        }

        return returnNum;
    }

    public static void main(String[] args) {
        int[] numbersArr = { 1, 2, 3 };
        System.out.print(practiceNumbers(numbersArr));
    }
}
