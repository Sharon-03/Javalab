class Square
{
		int l;
		void sqarea(int length)
		{
			l=length*length;
			System.out.println("Square area: "+l);
		}
		void rectangle(int length, int breadth)
		{
			l=length*breadth;
			System.out.println("Rectangle area= "+l);
		}
	}

public class MethodOverloading {

	public static void main(String[] args) 
	{
     Square s=new Square();
     s.sqarea(10);
     s.rectangle(10,20);    		 
	}
}
