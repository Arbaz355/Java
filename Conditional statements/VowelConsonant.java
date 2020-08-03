import java.util.Scanner;
public class VowelConsonant {
    public static void main(String [] args){
        Scanner value = new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        char ch = value.next().charAt(0);
        if(ch =='A'|| ch =='E' || ch =='I'|| ch =='O'|| ch =='U'||ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
        {
            System.out.println("Alaphabet is Vowel ");
        }
        else 
        {
            System.out.println("Alphabet is consonant");
        }

    }
}