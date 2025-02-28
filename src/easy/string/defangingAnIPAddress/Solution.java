package easy.string.defangingAnIPAddress;

public class Solution {
    public String defangIPaddr(String address) {
        String result=address.replace(".","[.]");
        return result;
    }
}
