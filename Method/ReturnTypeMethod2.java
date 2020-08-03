public class ReturnTypeMethod2{
    static int mymethod(int x, int y)
    {
        int sum= x+y;// we can use calculator by changing the value return
        int sub= x-y;
        int mul= x*y;
        int div= x/y;
        return sum;
    }
    public static void main(String [] args)
    {
        System.out.println(mymethod(2, 5));
    }
}