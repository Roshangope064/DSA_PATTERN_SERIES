import java.util.Scanner;
class Calculator {
    int sum(int i, int j) {
        System.out.println("This is a Sum Function");
        return (i + j);
    }

    double sum(int i, double j) {
        System.out.println("This is a Sum Function");
        return(i +j);
    }
}
void main(){
    int i = 90;
    int j = 89;
    Calculator cal = new Calculator();
    int result = cal.sum(i,j);
    System.out.println("The sum of "+i+","+j+" = "+(result));

}