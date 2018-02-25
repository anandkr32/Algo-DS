import java.util.*;

class MinimumPlateform {
    public static void main(String[] args){
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i =1;
        int j= 0;
        int plateformNeeded = 1;
        int result = 1;
        int n = arr.length;
        while(i<n && j< n){
            // check how many trains have arrived before train j has departed
            if(arr[i] < dep[j]) {
                i++;
                plateformNeeded++;
                if(result < plateformNeeded) {
                    result = plateformNeeded;
                }
            } else {
                j++;
                plateformNeeded --;
            }
        }

        System.out.println("minimum plateform needed is "+result);
    }
}