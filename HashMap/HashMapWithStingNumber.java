import java.util.HashMap;
import java.util.Collections; //optional API for sorting the element which can be done thrrow the linkedHashMap
public class HashMapWithStingNumber {
    public static void main(String [] args){
        HashMap <String , String> phonebook = new HashMap <String, String> ();
    phonebook.put("Arbaz akhter","3434343434");
    phonebook.put("Gulnawaz akhter", "7009166892");
    phonebook.put("Zarina khatoon", "12121212");
    phonebook.put("Tanweer akhter", "2121212121");
    System.out.println(phonebook.get("Zarina khatoon"));
    for(String i : phonebook.keySet()){
        System.out.println("Name: " +i+ " PhoneNumber: " +phonebook.get(i));
    }
    }
}
