public class Throw {
    public static void Age(int age){
        if (age<18){
            throw new ArithmeticException("Access denied your age must be more than 18");
        }
        else {
            System.out.println("Access granted");
        }
    }
        public static void main(String [] args){
            Age(17);
        }
}