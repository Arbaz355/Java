import java.util.Scanner;
public class ReverseNum{
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter any two digit num to reverse:");
        int num = myObj.nextInt();
        int reverse = 0;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num/=10;
        }
        System.out.println("revrsed num: "+reverse);
    }
}