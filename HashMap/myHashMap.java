import java.util.HashMap;
import java.util.Collections;
public class myHashMap{
    public static void main(String [] args){
        HashMap <String , String> capitalCities = new HashMap <String, String> ();
        capitalCities.put("Mumbai", "Mahrastra");
        capitalCities.put("Patna", "Bihar");
        capitalCities.put("Chandighar", "Punjab");
        capitalCities.put("Manipur", "Imphal");
        System.out.println(capitalCities.get("Patna"));
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.keySet());
        System.out.println(capitalCities.values());
        capitalCities.remove("Chandighar");
        System.out.println(capitalCities.keySet());
        System.out.println(capitalCities.values());
        for(String i : capitalCities.keySet()){
            System.out.println(i);
            }
        for (String a : capitalCities.values())
            {
                System.out.println(a);
            }
    }
}