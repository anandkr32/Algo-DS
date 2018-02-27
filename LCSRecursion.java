
class LCSRecursion {
    public static void main(String[] args){
        String X = "AGGTAB";
        String Y = "GXTXAYB";

        findLCS(X, Y, X.length(), Y.length());
    }

    private static int findLCS(String X, String Y, int m, int n) {
        if (m == 0 || n == 0)
            return 0;
          if (X.charAt(m-1) == Y.charAt(n-1))
            return 1 + findLCS(X, Y, m-1, n-1);
          else
            return max(findLCS(X, Y, m, n-1), findLCS(X, Y, m-1, n));
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}