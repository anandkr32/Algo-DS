
class LongestPalindromicSubsequenceRecursion {
    public static void main(String[] args){
        String str = "ABBXTRBBZA";

        System.out.println(findLongestPalindromicSubsequece(str,0,str.length()-1));
    }

    private static int findLongestPalindromicSubsequece(String str, int l, int r) {
        // return conditons

        if(l == r) {
            return 1;
        }

        if( r == l +1 && str.charAt(r)== str.charAt(l)) {
            return 2;
        }

        if(str.charAt(l) == str.charAt(r)) {
            return 2 + findLongestPalindromicSubsequece(str, l+1, r-1);
        } else {
            return max(findLongestPalindromicSubsequece(str, l,r-1), findLongestPalindromicSubsequece(str, l+1,r));
        }
    }

    private static int max(int a, int b) {
        return a>b? a: b;
    }
}