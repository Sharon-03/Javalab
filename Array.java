import java.util.Scanner;
public class Array {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the number of entries: ");
     n = sc.nextInt();
     int ar[]= new int[n];
     System.out.println("Enter the elements: ");
     for(int i=0;i<n;i++)
     {
    	 ar[i]=sc.nextInt();
     }
    System.out.println("Array elements are: ");
     for(int i=0;i<n;i++)
     {
    	 System.out.println(" " +ar[i]);
     }
	}
}
