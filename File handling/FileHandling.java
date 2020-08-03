import java.io.File;
import java.io.IOException;
public class FileHandling{
    public static void main(String [] args){
        try{
        File myObj = new File("Kung fu panda");
        myObj.createNewFile();
        if(myObj.canRead()){
            System.out.println("File created:"+myObj.getName());
        }
        else {
            System.out.println("File is already available");
        }
        }
        catch(IOException e){
            System.out.println("Some error occurd");
            e.printStackTrace();
        }
    }
}