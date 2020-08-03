import java.util.Scanner;
public class MethodNoReturn {
    static void GreaterNum()
    {
        Scanner value= new Scanner(System.in);
        System.out.println("Enter the frist number");
        int a = value.nextInt();
        System.out.println("Enter the second number");
        int b = value.nextInt();
        if(a>b)
        {
            System.out.println("The greater number is "+a);
        }
        else 
        {
            System.out.println("The greater number is "+b);
        }
    }
    public static void main(String [] args)
    {
      GreaterNum();
    }
}