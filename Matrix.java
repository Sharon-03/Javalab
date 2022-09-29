import java.util.Scanner;
public class Matrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int r,c;
		int ar[][]= new int[20][20];
		System.out.println("Enter the number of rows: ");
	     r = sc.nextInt();
	     System.out.println("Enter the number of columns: ");
	     c = sc.nextInt();
	     System.out.println("Enter the matrix elements: ");
	     for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 ar[i][j]=sc.nextInt();
	    	 }
	     }
	    System.out.println("Matrix elements are: ");
	     for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 System.out.print(" " +ar[i][j]);
	    	 }
	       System.out.println("\n");
	     }
	}

}
