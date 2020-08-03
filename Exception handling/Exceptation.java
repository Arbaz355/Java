public class Exceptation {
    public static void main(String [] args){
        try{
        int myNumber[] = {12, 13,18,19};
        System.out.println(myNumber[10]);
        }
        catch(Exception e){
            System.out.println("Something  went wrong");
        }
        finally{
            System.out.println("Please check array input");
        }
        
    }
