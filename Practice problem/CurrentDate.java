import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentDate {
    public static void main(String [] args){
        LocalDate myObj = LocalDate.now();
        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj);
        System.out.println(myObj2);
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd-mm-yyyy HH-mm-ss");
        String NewDate = myObj2.format(newFormat);
        System.out.println(NewDate);
    }
}