public class Vehichle{
    protected String brandName= "Maruti suzuki";
    public void carSologen(){
        System.out.println("You own family car");
    }
}
class car extends Vehichle{
    private String modelName="Swift desire";
    public static void main(String[] args) {
        car myCar= new car();
        myCar.carSologen();
        System.out.println(myCar.brandName+" "+myCar.modelName);
    }
}