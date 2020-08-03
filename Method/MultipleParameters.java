public class MultipleParameters {
    static void mymethod(String name, int age)
    {
        System.out.println(name+ " is " +age);
    }
    public static void main(String [] args)
    {
        mymethod("Arbaz akhter", 21);
        mymethod("Shahbaz akhter", 24);
        mymethod("Gulnawaz akhter", 26);
    }
}