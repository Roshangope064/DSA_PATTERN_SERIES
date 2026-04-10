package SLIDING_WINDOW;
import java.util.ArrayList;

public class FirstNegative {
    void main(){
        int [] array = {12,-1,-7,8,-15,30,16,28};
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        // First Window
        int i,j,k=3;
        for(j=0;j<k;j++){
            if(array[j]<0)negative.addLast(array[j]);
        }
        if(!(negative.isEmpty()))result.addLast(negative.getFirst());
        else result.addLast(0);
        for(i=1,j=k;j< array.length;i++,j++){
            if(array[i-1]<0) negative.removeFirst();
            if(array[j]<0) negative.addLast(array[j]);
            if(!(negative.isEmpty()))result.add(negative.getFirst());
            else result.addLast(0);
        }
        System.out.println(result);

    }


}
