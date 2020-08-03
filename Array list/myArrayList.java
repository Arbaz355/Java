import java.util.ArrayList;
public class myArrayList{
    public static void main(String [] args){
        ArrayList <String> cars = new ArrayList <String>();
        cars.add("volvo");// add used for adding an item
        cars.add("BMW");
        cars.add("Ferari");
        cars.add("Ford");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0, "Maruti suzuiki"); // set used to set the new element by replacing
        System.out.println(cars.get(0));
        cars.remove(2);
        System.out.println(cars.get(2));
        
    }
}