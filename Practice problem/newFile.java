import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class newFile {
    public static void main(String [] args){
        try{
           FileWriter myWritter = new FileWriter("newFile.txt");
           myWritter.write("I am alien");
           myWritter.close();
           System.out.println("File written suceessfully");
        }
        catch(IOException e){
            System.out.println("File could not be written");
            e.printStackTrace();
        }
    }
}