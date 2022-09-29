import java.util.Scanner;
public class Matrixaddition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int r,c;
		int ar[][]= new int[20][20];
		int br[][]= new int[20][20];
		System.out.println("NOTE: To add two matrices they should be of same order.");
		System.out.println("Enter the no.of rows: ");
	     r = sc.nextInt();
	     System.out.println("Enter the number of columns: ");
	     c = sc.nextInt();
	     System.out.println("Enter the elements of first matrix.");
	     for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 ar[i][j]=sc.nextInt();
	    	 }
	     }
	     System.out.println("Enter elements of second matrix.");
	     for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 br[i][j]=sc.nextInt();
	    	 }
	     }
	     for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 ar[i][j]+=br[i][j];
	    	 }
	     }
	     System.out.println("Sum of matrices: ");
	     for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 System.out.print(" "+ar[i][j]);
	    	 }
	    	 System.out.println("\n");
	     }
	}
}
