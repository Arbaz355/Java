public class MethodOverload2 {
    static double myMethod (double r)// here we are using same method with different parameters and return type 
    {
        double result1=(3.1415*r*r);
        return result1;
    }
    static double myMethod(double b, double h)
    {
        double result2= ((b*h)/2);
        return result2;
    }
    public static void main(String [] args)
    {
        double AreaOfCircle= myMethod(7);
        double AreOfTriangle = myMethod(12.484, 13.90);
        System.out.println("Area of circle = " +AreaOfCircle);
        System.out.println("Area of triangle = " +AreOfTriangle);
    }
}