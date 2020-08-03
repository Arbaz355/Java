import java.util.Scanner;
public class FactrorialWithRecurction {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number for Factorial:");
        int n = myObj.nextInt();
        
        System.out.println(fact(n));

    }
    public static long fact(long n){
        if (n <= 1){
            return 1; // base conditions 
        }
        else {
            return n*fact(n-1);
        }
    }
}