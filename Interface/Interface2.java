interface cat{
    public void fact();
    public void sound();
}
interface dog{
    public void newFact();
    public void newSound();
}
class demo implements cat, dog{
    public void fact(){
        System.out.println("Adult Cats Only Meow For Humans");
    }
    public void sound(){
        System.out.println("Meow");
    }
    public void newFact(){
        System.out.println("A Dog Can Hear Sounds Up to Four Times Farther Than a Human Can");
    }
    public void newSound(){
        System.out.println("Bhuu Bhuu");
    }
}
public class Interface2 {
    public static void main(String [] args){
    demo myObj = new demo();
    myObj.fact();
    myObj.sound();
    myObj.newFact();
    myObj.newSound();
    }  
}