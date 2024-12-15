/**
 * DTW
 */
public class DTW {
    public double DTWDistance(int[] s, int[] t, int w) {
        int n = s.length;
        int m = t.length;
        double[][] DTW = new double[n][m];
        double inf = Double.POSITIVE_INFINITY;

        w = Math.max(w, Math.abs(n-m));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++){
                DTW[i][j] = inf;
            }
        }
        DTW[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = Math.max(1, i-w); j < Math.min(m, i+w); j++){
                DTW[i][j] = 0;
            }
        }
        int cost = 0;
        for (int i = 0; i < n; i++) {
            for (int j = Math.max(1, i-w); j < Math.min(m, i+w); j++){
                cost = d(s[i], t[j]);
                DTW[i][j] = cost + Math.min(DTW[i-1][j], Math.min(DTW[i][j-1], DTW[i-1][j-1]));
            }
        }
        
        return DTW[n-1][m-1];
    }
    
    private int d(int i, int j) {
        return Math.abs(i - j);
    }

    public static void main(String[] args) {
        int[] s = {1, 4, 1, 1, 1};
        int[] t = {1, 1, 1, 4, 1};
        DTW object = new DTW();
        double result = object.DTWDistance(s, t, 1);
        System.out.println(result);
    }
}