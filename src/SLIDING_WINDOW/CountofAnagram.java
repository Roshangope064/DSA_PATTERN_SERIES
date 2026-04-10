package SLIDING_WINDOW;
import java.util.Arrays;

public class CountofAnagram {
    void main(){
        String pattern = "aaba";
        String word = "aabaabaa";
        int count = 0;
       int [] frequencyArray = new int[26];
       for(int i = 0;i<pattern.length();i++){
           int index = pattern.charAt(i)-97;
           frequencyArray[index]++;
       }
        int i,j,k=pattern.length();
       int [] countOccurence =  new int[26];
        // First Window
       for(j=0;j<k;j++){
           int index = word.charAt(j)-97;
           countOccurence[index]++;
       }
       if(Arrays.equals(frequencyArray,countOccurence))count+=1;
       for(i=1,j=k;j<word.length();i++,j++){
           int removeIndex = word.charAt(i-1)-97;
           int addIndex = word.charAt(j)-97;
           countOccurence[removeIndex]--;
           countOccurence[addIndex]++;
           if(Arrays.equals(frequencyArray,countOccurence))count+=1;
       }
        System.out.println(count);

    }
}
