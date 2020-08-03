import java.util.Scanner;
public class Factorial {
    public static void main(String [] args){
    Scanner myObj = new Scanner(System.in);
    int fact;
    System.out.println("Enter the number:");
    int n = myObj.nextInt();
    for (int i=1; i = n; i++){
        fact= fact*i;
    }
    System.out.println(fact);
    }  
}