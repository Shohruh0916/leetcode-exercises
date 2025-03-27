package easy.string.sortThePeople;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int [] a=new int[heights.length];
        for(int i=0; i<heights.length; i++){
            a[i]=i;
        }
        for(int i=0; i<heights.length; i++){
            for(int j=0; j<heights.length; j++){
                if(heights[a[i]]>heights[a[j]]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        String[] result=new String[names.length];
        for(int i=0; i<names.length; i++){
            result[i]=names[a[i]];
        }
        return  result;
    }
}
