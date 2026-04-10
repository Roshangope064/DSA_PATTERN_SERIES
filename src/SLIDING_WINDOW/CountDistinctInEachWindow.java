package SLIDING_WINDOW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;

public class CountDistinctInEachWindow {
    void main(String[]args){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j= 0, k = 4;
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        // First Window
        for(j = 0;j<k;j++){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
        }
        result.add(map.size());
        for(i=1,j=k;j<arr.length;i++,j++){
            if (map.get(arr[i - 1]) ==  1) map.remove(arr[i-1]);
            else map.put(arr[i-1],map.getOrDefault(arr[i-1],0)-1);
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            result.add(map.size());
        }
        System.out.println(result);
    }
}
