import java.util.*;
class palindrome 
{
public static void main(String args[])
{
 String original,reverse="";
 scanner in= new Scanner(System.in);
 system.out.println("Enter a string/number to check");
 original=in.nextLine();
 int length= original.length();
 for(int i=length-1; i>=0; i--)
 reverse= revrese+original.charAt(i);
 if (original.equal(reverse))
 {
 System.out.println("Entred number is palindrome");
 }
 else
 {
 System.out.println(" Entred number is not palindrome");
}
}}
