import java.util.Scanner;
public class Matrixtranspose 
{
	public static void main(String[] args) 
	{
		Scanner sm = new Scanner(System.in);
		int r,c;
		int A[][]= new int[20][20];
		int AT[][]= new int[20][20];
		System.out.println("Enter the number of rows: ");
	     r = sm.nextInt();
	     System.out.println("Enter the number of columns: ");
	     c = sm.nextInt();
	     System.out.println("Enter the matrix elements: ");
	     for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 A[i][j]=sm.nextInt();
	    	 }
	     }
	     for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 AT[j][i]=A[i][j];
	    	 }
	     }
		System.out.println("Transpose of the matrix: ");
		for(int i=0;i<r;i++)
	     {
	    	 for(int j=0;j<c;j++)
	    	 {
	    	 System.out.print(" "+AT[i][j]);
	    	 }
	    System.out.println("\n");
	     }
	}
}
