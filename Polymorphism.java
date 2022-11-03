abstract class Shapes
{
 int a,b,c;
 abstract void area(int a,int b,int c);
}
class Rectangle extends Shapes
{
 void area(int a,int b,int c) 
 {
  System.out.println("Rectangle's Area= "+(a*b));	 
 }
}
class Triangle extends Shapes
{
 void area(int a,int b,int c) 
 {
  System.out.println("Triangle's Area= "+(0.5*a*b));	 
 }
}
public class Polymorphism 
{
	public static void main(String[] args) 
	{
	 Rectangle rec=new Rectangle();
	 rec.area( 5, 20,1);
	 Triangle t=new Triangle();
	 t.area(20, 5,1);
	 System.out.println("FINISH");
	}
}
