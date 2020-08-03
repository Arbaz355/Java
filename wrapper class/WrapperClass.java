
public class WrapperClass {
    public static void main(String [] args){
        Integer marks = 70;
        Double attedance = 89.2357;
        Character grade = 'B';
        Byte x = 10;
        System.out.println(marks);
        System.out.println(attedance);
        System.out.println(grade);
        System.out.println(x);
        // using method in wrapper class
        System.out.println("From here method is used!");
        System.out.println(marks.intValue());
        System.out.println(attedance.doubleValue());
        System.out.println(grade.charValue());
        System.out.println(x.byteValue());
    }

}