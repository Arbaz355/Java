import java.util.Scanner;
public class EvenOdd {
    public static void main (String [] args){
        System.out.println("Enter the number:");
        Scanner value= new Scanner(System.in);
        int num= value.nextInt();
        if(num%2==0)
        {
            System.out.println("It is a even number");
        }
        
    }
}
