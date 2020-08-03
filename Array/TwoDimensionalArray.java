public class TwoDimensionalArray {
    public static void main(String [] args){
        int[][] myNumber= { {1,2,3,4} , {5,6,7,8} };
        int x=myNumber[0][2];
        System.out.println(x);// to print particular element 
        for(int i=0; i<myNumber.length; ++i)// to print all element 
        {
            for (int j=0; j<myNumber[i].length; ++j)
            {
                System.out.println(myNumber[i][j]);
            }
        }
    }
}