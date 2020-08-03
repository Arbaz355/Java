interface animal{
    public void animalSound();  //interface method this must is empty
    public void sleep();
}
class pig implements animal{
    public void animalSound(){
        System.out.println("Weee"); //Method overridding 
    }
    public void sleep(){
        System.out.println("Zzzzz");
    }
}
public class Interface{
    public static void main(String [] args){
    pig myObj = new pig();
    myObj.animalSound();
    myObj.sleep();
    }
}