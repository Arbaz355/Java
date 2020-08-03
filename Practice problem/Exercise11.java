public class Exercise11 {

    public static void main(String[] args)
    {
        char[] arr_num = new char[] { 'j', 'a', 'v', 'a' };
        String str = String.copyValueOf(arr_num, 0, 4);
        System.out.println("\nThis is " + str +" class.\n");
    }
}