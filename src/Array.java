import java.util.Scanner;
public class Array {
    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("This is a Array Class");
        int len = 0;
        System.out.println("Enter the length of the Array :: ");
        len = scan.nextInt();
       int [] array = new int[len];
        System.out.println("Enter the "+len+" inputs--");
        for(int i = 0;i<len;i++){
            int data = scan.nextInt();
            array[i] = data;
        }
        System.out.println("The elements are --");
        for(int i = 0;i<len;i++){
            System.out.println(array[i]);
        }


    }

}