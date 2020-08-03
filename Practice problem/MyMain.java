public class MyMain{
    public static void main (String [] args){
    Boy myObj= new Boy();
    System.out.println("Person name is "+myObj.name);
    System.out.println("Age is "+myObj.age);
    System.out.println("Email id= "+myObj.email);
    System.out.println("He has passed in "+myObj.passingYear);
    myObj.game();
    }
}