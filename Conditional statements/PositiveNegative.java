import java.util.Scanner;
class PositiveNegative{
    public static void main(String [] args){
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= value.nextInt();
        if(num>0)
        {
            System.out.println("Number is poitive");
        }
        else if(num==0)
        {
            System.out.println("Number is Zero");
        }
        else if (num<0)
        {
            System.out.println("Number is negative");
        }

    }
}