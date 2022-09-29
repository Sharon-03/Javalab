import java.util.Scanner;
public class Matrixmultiplication 
{
	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		int r,c,m,n;
		 System.out.println("Enter the number of rows of matrix1: ");
	     r = sn.nextInt();
	     System.out.println("Enter the number of columns matrix1: ");
	     c = sn.nextInt();
	     System.out.println("Enter the number of rows of matrix2: ");
	     n = sn.nextInt();
	     System.out.println("Enter the columns of matrix2: ");
         m = sn.nextInt();
        int a[][]= new int[r][c];
 		int b[][]= new int[n][m];
 		int d[][]= new int[r][m];
 		if(c==n)
 		{	
          System.out.println("Enter the elements of matrix1: ");
          for(int i=0;i<r;i++)
	      {
	    	  for(int j=0;j<c;j++)
	    	  {
	    	  a[i][j]=sn.nextInt();
	    	  }
	      }
          System.out.println("Enter the elements of matrix2: ");
          for(int i=0;i<c;i++)
	      {
	       	  for(int j=0;j<m;j++)
	    	  {
	    	  b[i][j]=sn.nextInt();
	    	  }
	      }
          for(int i=0;i<r;i++)
	      {
	    	  for(int j=0;j<m;j++)
	    	  {
	    	    for(int k=0;k<c;k++)
	    	    {
	    	  d[i][j]=(a[i][k]*b[k][j])+d[i][j];
	    	    }
 	    	  }
	      }
          System.out.println("Product of the matrices: ");
          for(int i=0;i<r;i++)
	      {
	    	  for(int j=0;j<m;j++)
	    	  {
	    	  System.out.print(" "+d[i][j]);
	    	  }
	      System.out.println("\n");
	      }
 		} 
 		else
 		{
 			System.out.println("Multiplication Not possible");
 		}
	}
}
