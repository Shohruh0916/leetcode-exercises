package easy.string.convertDateToBinary;

public class Solution {
    public String convertDateToBinary(String date) {
        String[] a=date.split("-");
        int year=Integer.parseInt(a[0]);
        int month=Integer.parseInt(a[1]);
        int day=Integer.parseInt(a[2]);
        String yearBinary=Integer.toBinaryString(year);
        String monthBinary=Integer.toBinaryString(month);
        String dayBinary=Integer.toBinaryString(day);
        return yearBinary+"-"+monthBinary+"-"+dayBinary;
    }
}
