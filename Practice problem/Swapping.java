import java.util.*;
public class Swapping {
    public static void main (String [] args ){
        System.out.println("Enter the frist number:");
        Scanner value= new Scanner(System.in);
        float num1=value.nextFloat();
        System.out.println("Enter the second number:");
        float num2=value.nextFloat();
        System.out.println("------Number before Swapping------");
        System.out.println("Frist number is: "+num1);
        System.out.println("Second number is: "+num2);
        float temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("-------Number After swapping-------");
        System.out.println("Frist number is: "+num1);
        System.out.println("Second number is: "+num2);
    }
}