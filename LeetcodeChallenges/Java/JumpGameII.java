public class JumpGameII {
    public int jump(int[] nums) {
        // Must reach in minimum steps
        int min = 0;
        int n = nums.length - 1;
        int track = 0;
        int far = 0;
        // Could try all combinations? Or collect the minimum at each index (so at index
        // 2 either in one or two steps)
        //
        for (int i = 0; i < n; i++) {
            far = Math.max(far, i + nums[i]);
            if (far >= nums.length - 1) {
                min++;
                break;
            }
            if (i == track) {
                min++;
                track = far;
            }
        }
        return min;
    }

    // public static void main(String[] args) {

    // }
}
