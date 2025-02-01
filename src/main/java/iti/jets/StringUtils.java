package iti.jets;

public class StringUtils {
    public boolean isPalindrome(String str){
        if(str == null)
            return false;
        if(str.equals( new StringBuilder(str).reverse().toString())){
            return true;
        }
        return false;
    }
}
