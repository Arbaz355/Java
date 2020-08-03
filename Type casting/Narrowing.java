public class Narrowing {
    public static void main (String[] args) {
        double myDouble = 9.789;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        System.out.println(myDouble);
    }
}