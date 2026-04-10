package TwoPointers;

public class ReverseString {
    public static  void main(){
        String str = "India";
        StringBuilder newStr = new StringBuilder(str);
        int i = 0, j= str.length() - 1;
        while(i<j){
            char temp = newStr.charAt(i);
            newStr.setCharAt(i, newStr.charAt(j));
            newStr.setCharAt(j,temp);
            i++;j--;
        }
        System.out.println(newStr);
    }
}
