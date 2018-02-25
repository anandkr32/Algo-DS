import java.io.*;

class LIS {
    public static void main(String[] args){
        int[] arr = {3,0,20,1,21,4,7};

        System.out.println("the length of the longest increasing subsequence is "+findLIS(arr,7));
    }

    private static int findLIS(int[] arr, int n) {
        int[] lis = new int[n];
        for(int i = 0; i<n; i++) {
            lis[i] = 1; //initialise with the value 1 
        }

        for(int i=1; i<n; i++) {
            for(int j = i-1; j>=0; j--) {
                if(arr[i]>arr[j] && lis[i]<=lis[j]) {
                    lis[i] = lis[j]+1;
                }
            }
        }
        int max = 0;
        for(int i = 0;i<n;i++){
            if(max < lis[i]) {
                max = lis[i];
            }
        }
        return max;
    }
}