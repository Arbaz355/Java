import java.io.fileinputstream;
public class fileinputstreamdemo1
{
public static void main(String args[])
{
try{
fileinputstream fout=new fileoutputStream("c:user/home/abc.txt")
string s="programming in java';
byte b[]=s.getBytes();
fout.write(b);
fout.close();
system.out.println("successful..");
}
catch(exception e){syetem.out.println(e);}
}