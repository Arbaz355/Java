import java.util.*;
public class ListItems {
    public static void main(String [] args){
        String [] things = {"Laddu", "Rasmalayi", "KalaJamun", "Samosa"};
        List <String> list1 = new ArrayList <String> ();
        for(String x : things){ // this is how we can add items throw loop in arraylist
            list1.add(x);
        }
        String [] newThings = {"Pen", "copy", "Book", "Laptop"};
        List <String> list2 = new ArrayList <String> (); 
        System.out.println("List1 items are:");
        for(String y : newThings){
            list2.add(y);
        }
        for (int i= 0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.println("List2 items are:");
        for (int j=0; j<list2.size(); j++){
            System.out.println(list2.get(j));
        }
    }

}