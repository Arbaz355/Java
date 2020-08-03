public class car{
    static void avrageSpeed(){
        System.out.println("Car is moving at avrage speed");
    }
    public void maxSpeed(int s){
        System.out.println("Maximum speed is "+s);
    }
    public static void main(String [] args){
        avrageSpeed();
        car myObj= new car();
        myObj.maxSpeed(10);
    }
}