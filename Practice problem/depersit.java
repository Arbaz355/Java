import.java.io.*;
class depersit{
 public static void main(String ar[])
throw IoExceptation 
{
try {
Fileinput streamfin=new FileinputStream("f.txt");
ObjectinputStream ob=new Objectinputstream(fin);
student s=(student)ob.readobject();
System.out.println("id is"+s.id+"name is"s.name);
}}
catch(Exception);
}
