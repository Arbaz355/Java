public class StartEndMethod {
    public static void main(String [] args){
        String [] name = {"Arbaz", "Shahbaz", "Gulnawaz", "Arman"};
        for (String i : name){
            if(i.startsWith("Ar")){
                System.out.println(i+" start with Ar");
            }
        for (String a : name ){
            if(a.endsWith("az")){
                System.out.println(i+" Ends with az");
            }
        }

        }
    }
}