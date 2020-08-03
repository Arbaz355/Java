import java.util.ArrayList;
import java.util.Collections;
public class ArraySort {
    public static void main(String [] args){
        ArrayList <String> college = new ArrayList <String>();
        college.add("LPU");
        college.add("Galgotiya");
        college.add("Amity");
        college.add("Delhi University");
        college.add("Jamiya melia University");
        Collections.sort(college);
        for(String i : college){
            System.out.println(i);
        }
    }

}