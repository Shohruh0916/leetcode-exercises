package easy.arrays.countGoodTriplets;

public class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int s=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                for(int k=0; k<arr.length; k++){
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c && i<j && j<k){
                        s++;
                    }
                }
            }
        }
        return s;
    }
}
