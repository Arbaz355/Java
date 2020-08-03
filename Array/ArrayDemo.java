class student 
implements comparable<student>
{
int id;
String name;
student(int id, String name)
{
this.id=id;
this.name=name;}
}
public int compareTo(student person);
{return name compareTo(person.name);
}
class ArrayDemo
{public static void main(String []arr)
{Arraylist<Student>ar.new ArrayList<Student>();
ar.add(new student(1,"Rahul"));
ar.add(new student(2,"Ajay"));
Collections.sort(ar);//asc order
Iterator it=ar.iterator();
while(it.hashtext())
{System.out.println(it.next());
}}}