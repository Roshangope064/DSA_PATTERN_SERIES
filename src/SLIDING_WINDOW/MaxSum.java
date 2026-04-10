package SLIDING_WINDOW;

public class MaxSum {
    void main(){
        int [] array = {2, 3, 7, 8, 1, 3, 5, 6};
        int i,j,sum=0, max_sum = 0,len=array.length,k=3;
//        while(j<len){
//            if(j>=k){
//                sum-=array[i];
//                sum+=array[j];
//                if(sum>max_sum)
//                    max_sum=sum;
//                i++;
//            }else{
//                    sum+=array[j];
//                    max_sum = sum;
//            }
//            j++;
//        }
//        System.out.println(max_sum);
        // First Window
        for(j=0;j<k;j++){
            sum+=array[j];
        }
        max_sum = sum;
        for(i=0,j=k;j<len;i++,j++){
            sum-=array[i];
            sum+=array[j];
            if(sum>max_sum) max_sum = sum;
        }
        System.out.println(max_sum);

    }
}
