class Check
{
 public static void main(String arg[])
 {
 
   java.util.HashMap<Integer, String> hm=new java.util.HashMap<Integer, String>();
 
   hm.put(81,”bhanusri”);
 
   hm.put(57,”anusha”);
 
   hm.put(23,”bharadwaj”);
 
   hm.put(33,”aparna”);
 
   hm.put(85,”bharath”);  
 
   hm.put(99,”babitha”);
 
   hm.put(66,”bindu”);
 
   Collection col=hm.values();
 
   Iterator trav=col.iterator();
 
   while(trav.hasNext())
   {
 
     String value=(String)trav.next();  // will give next Value
  
     System.out.println(value);
   }
  
  }
 
}