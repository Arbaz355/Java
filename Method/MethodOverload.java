public class MethodOverload {
    static int Addition (int x)
    {
       int sum= 12+x;
       return sum;
    }
    static double sub (double x, double y)
    {
        double sub= x-y;
        return sub;
    }
    public static void main(String [] args)
    {
       int num1= Addition(5);
       double num2=sub(20.745, 10.890);
       System.out.println("Addition is " +num1 );
       System.out.println("Subtraction is " +num2);
    }
}