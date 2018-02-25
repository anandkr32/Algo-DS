class SumClosestX{
    public static void main(String[] args){
        int[] arr = {10,22,28,29,30,40};
        int n = arr.length;
        int x = 54;
        int diff = 1000;
        int num1=0,num2=0;
        int l = 0;
        int r = n-1;
        while(r > l) {
            if((absValue(arr[l] + arr[r]) - x) < diff) {
                diff = absValue(arr[l] + arr[r] -x);
                num1 = arr[l];
                num2 = arr[r];
            } 
            if(arr[l] + arr[r] < x) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println(" the closest pair to "+x+" is "+num1+" and "+num2);
    }

    private static int absValue(int x) {
        if(x > 0) {
            return x;
        } else {
            return -x;
        }
    }
}