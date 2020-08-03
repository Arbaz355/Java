class shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}

class rectangle extends shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}

class circle extends shape {
    void draw(){
        System.out.println("Drawing circle");
    }
}

class triangle extends shape{
    void draw(){
        System.out.println("Draawing rectangle");
    }
}
class TestPolymorphism{
    public static void main(String [] args){
    shape myObj = new rectangle();
    shape myObj2 = new circle();
    shape myObj3 = new triangle();
    myObj.draw();
    myObj2.draw();
    myObj3.draw();
    }
}