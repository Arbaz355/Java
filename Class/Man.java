abstract class Man{
    public String name="Shahbaz Akhter";
    public int age= 24;
    public String email="Shahbazakhter355@gmail.com";
    public abstract void Game();
}
class Boy extends Man{
    public int passingYear=2020;
    void game(){
        System.out.println("Shahbaz is playing a lot");
    }
}