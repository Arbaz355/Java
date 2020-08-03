import java.util.ArrayList;
public class LoopWithArrayList {
    public static void main(String [] args){
        ArrayList <String> name = new ArrayList <String>();
        name.add("Arbaz");// add used for adding an item
        name.add("Shahbaz");
        name.add("Gulnawaz");
        name.add("Tanweer");
        System.out.println(name.size());  // to find out the size of array
        System.out.println("Your brother name are:");
        for(int i=0; i<name.size(); i++){
            System.out.println(i+"." +name.get(i));
        } // This is simple looping process
        for(String i : name){
            System.out.println(i);
        } // This is called for each loop(Uniqe way to loop throw array)
    }

}