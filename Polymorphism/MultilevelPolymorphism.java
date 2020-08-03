class animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends animal{
    void eat(){
        System.out.println("eating biscuit");
    }
}
class pupyDog extends dog{
    void eat(){
        System.out.println("eating drink");
    }
}
public class MultilevelPolymorphism {
    public static void main(String [] args){
        animal a1,a2,a3;
        a1 = new animal();
        a2 = new dog();
        a3= new pupyDog();
        a1.eat();
        a2.eat();
    }
}