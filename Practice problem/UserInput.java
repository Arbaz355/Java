import java.util.*;
public class UserInput {
    public static void main(String [] args){
       Scanner file= new Scanner (System.in);
       System.out.println("Enter your number:");
       int a= file.nextInt();
       System.out.println("You Entred-" +a);
    }
}