import java.io.*;
class MinimumLengthUnsortedArray {
    public static void main(String[] args){
        int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};

        // scanning from left and finding the element which is greater than immediate roght element
        int s=0,e=arr.length;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[i+1]) {
                continue;
            }
            s = i+1;
            break;
        }

        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] > arr[i-1]) {
                continue;
            }
            e = i-1;
            break;
        }

        System.out.println("the start index is "+s+" and end index is "+e);

        //find the minimum and maximum element in the range s and e
        int minIndex = s;
        int maxIndex = e;
        for(int j = s+1; j <= e; j++) {
            if(arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        for(int j = e-1; j >=s; j--) {
            if(arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
        }

        //finding min and max index in the sub array
        System.out.println("minIndex is "+minIndex);
        System.out.println("maxIndex is "+maxIndex);

        //finding actual min and max
        
    }
}