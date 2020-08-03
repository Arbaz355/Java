abstract class person{
    public String fname="Arbaz";
    public int age=21;
    public abstract void study();
}
class student extends person{
    public int passingYear=2020;
    public void study (){
     System.out.println("Studying all day");
    }
}
