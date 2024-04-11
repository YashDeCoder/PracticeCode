import java.util.Arrays;

class Hindex {
    public int hIndex(int[] citations) {
        // Idea is to first sort the array and then compare the values
        Arrays.sort(citations);
        int hindex = 0;
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            if ((n - i) <= citations[i]) {
                hindex = n - i;
                break;
            }
        }
        return hindex;
    }

    public static void main(String[] args) {
        Hindex object = new Hindex();
        int citations[] = { 100 };
        int returnal = object.hIndex(citations);
        System.out.println(returnal);
    }
}