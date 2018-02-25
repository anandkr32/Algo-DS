class LCS {
    public static void main(String[] args){
        char[] X = {'A'};
        char[] Y = {'A','A','D'};
        System.out.println("The LCS of two char arrays is "+findLCS(X,Y));
    }

    private static int findLCS(char[] X, char[] Y) {
        int m = X.length;
        int n = Y.length;

        int[][] L = new int[m+1][n+1];

        for(int i = 0; i<=m; i++) {
            for(int j = 0; j<=n; j++){
                if(i == 0 || j == 0) {
                    L[i][j] = 0;
                    continue;
                }
                if(X[i-1] == Y[j-1]) {
                    L[i][j] = L[i-1][j-1] + 1;
                } else {
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
                }
            }
        }

        return L[m][n];
    }

    static int max(int a, int b) {
        return a>b?a:b;
    }
}