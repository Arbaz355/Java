interface Drawable{
void draw();
}
class Reactangle implements Drawable{
public void Draw (){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
public void Draw(){System.out.println("drawing Circle");}
class TestInterface1{
public static void main(String args[]){
Drawable d=new Circle();
d.draw();
}}                                                                                                                            