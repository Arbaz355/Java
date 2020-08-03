interface printable12{
void print();
}
interface showable extends printable12{
void show();
}
class TestInterface implements showable{
public void print(){System.out.println("hello");}
public void show(){System.out.println ("welcome");}

public static void main(String args[]){
TestInterface obj= new TestInterface();
obj.print();
obj.show();
}
} 