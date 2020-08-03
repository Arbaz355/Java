public class NestedTryCatch {
    public static void main(String [] args){
        try{
            try{
                int a = 39/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        try{
            int myArr[] = new int[5];
            myArr[4]=0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}