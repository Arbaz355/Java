import java.util.Scanner;
public class SumOfNaturalNumber{
    public static void main (String [] args){
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= value.nextInt();
        int sum1= (n*(n+1))/2;  //sum of n natural number
        int sum2=(n*(n+1)*(2*n+1))/6; // sum of square of natural number
        System.out.println("Sum of natural of "+sum1);
        System.out.println("Sum of square natural number is "+sum2);
    }
}