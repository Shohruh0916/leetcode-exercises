package easy.arrays.numberOfEmployees;

public class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int a=0;
        for(int i=0; i<hours.length; i++ ){
            if(target<=hours[i]){
                a++;
            }
        }
        return a;
    }
}
