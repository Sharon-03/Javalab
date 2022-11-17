import java.util.Scanner;
public class ArithExcept 
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int n1,n2,d,c;
do{
	System.out.println("1.ArithmeticException \n2.ArrayIndexOutOfBoundsException\n3.Exit");
    d=s.nextInt();  
 switch(d)
 {
 case 1:
	 do
	 {
		System.out.println("program to perform Division.\n");
		System.out.print("Enter number-1: ");
		n1=s.nextInt();
		System.out.println("Enter number-2: ");
		n2=s.nextInt();
		try
		{
		if(n2==0)
		  {
		 	throw new ArithmeticException("/ by zero.");
		  }
		  else
		  {
			System.out.println("Result: "+(n1/n2));
			System.out.println("End of Try block.");
		  }
		}
		catch(ArithmeticException e)
		{
		  System.out.println("Division by zero.");
		}
		finally
		{
		  System.out.println("Finally block contents.\nDo you want to countinue?1 for yes and 2 for no1");
		  c=s.nextInt();  	
		}
	 }while(c==1);
	 break;
 case 2:
	    int n,i,p;
	    System.out.println("Enter the no.of elements you want to store: ");
        n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements you want to store: ");
        for(i=0;i<n;i++)
        {
         ar[i]=s.nextInt();
        }
        System.out.println("The array elements are: ");
        for( i=0;i<n;i++)
        {
         System.out.print("\t"+ar[i]); 	
        }
        System.out.println("\n1Enter the position of element 1to be accessed: ");
        p=s.nextInt();
        try
        {
        	System.out.println(" "+ar[p]);
        }
        catch(ArrayIndexOutOfBoundsException t)
        {
         System.out.println("Array Index is Out Of Bounds.");
        }
  } 
 }while(d==1||d==2);
}
}
