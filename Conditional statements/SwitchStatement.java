import java.util.*;
public class SwitchStatement {
    public static void main (String [] args){
        System.out.println("Enter your choice:");
        Scanner value= new Scanner(System.in);
        int day= value.nextInt();
        switch(day) 
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thusday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Please choose your day between 0 to 7");
            break;
        }
    }
}