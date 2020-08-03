import java.io.File;
public class FileInformation {
    public static void main(String [] args){
        File myObj = new File("My files.txt");
        if(myObj.exists()){
            System.out.println("Name : "+myObj.getName());
            System.out.println("length of the files: "+myObj.length());
            System.out.println("Path of the file: "+myObj.getAbsolutePath());
            System.out.println("Readable: "+myObj.canRead());
            System.out.println("Writable:"+myObj.canWrite());
            System.out.println("Lits of files: "+myObj.list());
        }
        else {
            System.out.println("File does not exit");
        }
    }

}