import java.util.ArrayList;
import java.util.Collections;
public class ArraySortNumber {
    public static void main(String [] args){
        ArrayList <Integer> result = new ArrayList <Integer> ();
        result.add(98);
        result.add(41);
        result.add(65);
        result.add(60);
        result.add(91);
        Collections.sort(result);
        for(int i: result){
            System.out.println(i);
        }
    }
}