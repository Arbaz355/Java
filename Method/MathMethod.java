import java.util.*;
public class MathMethod {
    public static void main(String [] args){
        Scanner value= new Scanner(System.in);
        System.out.println("Enter the frist number:");
        Double x= value.nextDouble();
        System.out.println("Enter the second number:");
        Double y= value.nextDouble();
        Double min= Math.min(x, y);
        Double max= Math.max(x, y);
        Double root= Math.sqrt(x);
        Double PositiveNum1= Math.abs(x);
        Double Random= Math.random();
        System.out.println("Min number=" +min);
        System.out.println("Max number=" +max);
        System.out.println("Square root of frist number:" +root);
        System.out.println("Positive frist number:" +PositiveNum1);
        System.out.println("Random number=" +Random);
    }
}