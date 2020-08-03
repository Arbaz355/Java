private class MyCar{
    String carName;
    int estDate;
    String carColour;
    public MyCar(String modelName, int est, String color){
        carName = modelName;
        estDate = est;
        carColour = color;
    }
    public static void main(String [] args){
        MyCar myObj= new MyCar ("Nano", 2012,"Yellow");
        System.out.println(myObj.carColour+" "+myObj.carName+" was lanunch in "+myObj.estDate);
    }
    }