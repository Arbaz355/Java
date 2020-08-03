class boxdemo1
{
public static void main(String ar[])
{
double vol;
box1 mybox=new box1();
mybox.width=10;
mybox.height=10;
mybox.depth=10;
vol=mybox.width*mybox.height*mybox.depth;
System.out.println("vol is" +vol);
}}