abstract class animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzz");
    }
}

class pig extends animal{
    public void animalSound(){
        System.out.println("Phuuu");
    }
}

public class AbstractClass {
    public static void main(String [] args){
        pig myObj = new pig();
        myObj.animalSound();
        myObj.sleep();
    }
}