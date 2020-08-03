
public class MultipleCatch {
    public static void main(String [] args){
        try {
            int a[]= new int[5];
            a[5]= 30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundException occurs");
        }
        catch(Exception e){
            System.out.println("parent exception occurs");
        }
        finally{
            System.out.println("This block shoud be used for final statement");
        }
    }
}