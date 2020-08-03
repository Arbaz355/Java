import java.util.*;  
public class HashMap2 {  
   public static void main(String args[]) {  
    HashMap<Integer,String> map=new HashMap<Integer,String>();          
      map.put(201,"Signal processing");    
      map.put(202,"C++");    
      map.put(203,"Microprocessor");  
      map.put(204, "Image processing"); 
      map.put(205, "Python");
 
    System.out.println(" list of elements: "+map);    
    map.remove(201);  
    System.out.println(" list of elements: "+map);    
    map.remove(202);  
    System.out.println(" list of elements: "+map);  
    map.remove(203); 
    System.out.println(" list of elements: "+map); 
    map.remove(204);
    System.out.println(" list of elements: "+map); 
     map.remove(205);  
   }      
}  