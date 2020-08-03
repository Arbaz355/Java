public class Array {
    public static void main (String [] args){
        String[] movies = {"Chapak", "Street Dancer", "Malang", "Avenger", "D.c Batman"};
        for(String a: movies) // pay attention on looping in array
        {
            System.out.println(a);
        }
        movies[0]="D.c justice leage"; // here the element of array is changing 
        System.out.println(movies[0]);  //here the changed element is getting printed
        System.out.println(movies.length); // here we are measuring
    }
}