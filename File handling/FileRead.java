import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead {
    public static void main(String [] args){
        try{
            File myObj = new File("Java files");
            Scanner reader = new Scanner(myObj);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
            }
            catch(FileNotFoundException e){
                System.out.println("An error occurd");
                e.printStackTrace();
            }
    }
}