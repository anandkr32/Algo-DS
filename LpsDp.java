
public class LpsDp{
    public static void main(String[] args){
        String str = "ABXTBA";

        int n = str.length();
        int[][] l = new int[n][n];

        for(int i = 0; i<n; i++) {
            l[i][i] = 1; // covers the condition that a single character in a string  is always a palindrome of lenght 1;
        }
        for ( int k =2; k<=n;k++) {
            for(int i = 0;i<n-k+1;i++){
                int j = i + k -1 ;
                System.out.println(k);
                System.out.println(i);
                System.out.println(j);
                if( k == 2 && str.charAt(i) == str.charAt(j)) {
                    l[i][j] = 2;
                    System.out.println("hello 1");
                    System.out.println(l[i][j]);
                } else if(str.charAt(i) == str.charAt(j)) {
                    l[i][j] = 2+ l[i+1][j-1];
                    System.out.println("hello 2");
                    System.out.println(l[i][j]);
                } else {
                    l[i][j] = max(l[i][j-1], l[i+1][j]);
                    System.out.println("hello 3");
                    System.out.println(l[i][j]);
                }
            }
        }

        System.out.println("length of the longest palindromic subsequence is "+l[0][n-1]);
    }

    private static int max(int a, int b) {
        return a>b? a: b;
    }
}