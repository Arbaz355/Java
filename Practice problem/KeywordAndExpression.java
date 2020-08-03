public class KeywordAndExpression {
    public static void main(String [] ars){
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;
        if(score ==500){
            System.out.println("your score is "+score );
            if (gameOver==true){
               int finalScore = score+(levelCompleted*bonus);
                System.out.println("your final score is "+finalScore);
            }
        }
        int score2  = 1000;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        int finalScore2 = score2+(levelCompleted2*bonus2);
        if(gameOver){
            System.out.println("your second level score is "+finalScore2);
        }
    } 
}