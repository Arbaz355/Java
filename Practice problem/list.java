import java.util.*;n
class Xyz
{
    String name;
    String clg ;
    String branch ;
    double per;
    
     Xyz(String s1,String s2,String s3,double p)
     {
         name=s1;
         clg=s2;
         branch=s3;
         per=p;
     }
 
}
class list
{
	public static void main(String arg[]) 
	{	
	     HashMap<Integer, Xyz> hm=new HashMap<Integer, Xyz>();
	 
                Xyz x1=new Xyz("goutham","SNIST","cse",68.5);
                Xyz x2=new Xyz("kanakesh","SNIST","ecm",70);
                Xyz x3=new Xyz("rahul","SNIST","ecm",75);
                Xyz x4=new Xyz("vasista","SNIST","ECM",80);
                Xyz x5=new Xyz("narayana","SNIST","EEE",85);
	        hm.put(1,x1);
	        hm.put(2,x2);
	        hm.put(3,x3);
	        hm.put(4,x4);
	        hm.put(5,x5); 
	   Iterator trav=hm.entrySet().iterator();
	while(trav.hasNext())
	{
		Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
		Xyz j=(Xyz)record.getValue();
                System.out.println(record.getKey()+" "+j.name+" "+j.clg+" "+j.branch+" "+j.per);
	}
       }
}