enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public class Enumerations2{
        public static void main(String [] args){
            Level myVar = Level.MEDIUM;
            switch(myVar)
            {
                case LOW:
                System.out.println("level is low");
                break;
                case MEDIUM:
                System.out.println("Level is medium");
                break;
                case HIGH:
                System.out.println("level is High");
                break;
            } 
        }
    }