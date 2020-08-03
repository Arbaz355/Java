import java.util.Scanner;
public class Throw2{
    public static void checkAttendance(int x){
        if(x<75){
            throw new ArithmeticException("Soory you are detained");
        }
        else{
            System.out.println("You can sit in exam");
        }
    }
    public static void main(String [] args){

        Scanner value = new Scanner(System.in);
        System.out.println("Enter you attedance in %:");
        int x = value.nextInt();
        checkAttendance(x);
    }
}