import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifElse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N%2!=0){
            System.out.println("weird");
        }
        else if( 2<=N && N<=5){
            System.out.println("Not weired");
        }
        else if( 6<=N && N<=20){
            System.out.println("weired");
        }
        else if( N>20){
            System.out.println("Not weired");
        }


        scanner.close();
    }
}
