public class LongestCommonSubstringProblem {
    static String X, Y;
    // Returns length of function for longest common
    // substring of X[0..m-1] and Y[0..n-1]
    static int lcs(int i, int j, int count) {

        if (i == 0 || j == 0) {
            return count;
        }
        if (X.charAt(i - 1) == Y.charAt(j - 1)) {
            count = lcs(i - 1, j - 1, count + 1);
        }
        count = Math.max(count, Math.max(lcs(i, j - 1, 0), lcs(i - 1, j, 0)));
        return count;
    }
    // Driver code
    public static void main(String[] args){
        int n, m;
        X = "SEPTRIO";
        Y = "RAFINALDO";

        n = X.length();
        m = Y.length();
        System.out.println(lcs(n, m, 0));
    }
}