import java.util.*;
public class TableWithLoop {
    public static void main (String [] args) {
        System.out.println("Enter the number:");
        Scanner value = new Scanner(System.in);
        int a= value.nextInt();
        int b= 0;
        while(b<=10)
        {
            int c=a*b;
            System.out.println(c);
            b++;
        }
    }
}