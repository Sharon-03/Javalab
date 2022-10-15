import java.util.Scanner;
public class Frequency 
{
 public static void main(String[] args) 
 {
  char ch;
  StringBuffer s=new StringBuffer("");
  Scanner sc = new Scanner(System.in);
  int n,count=0;
  System.out.println("Enter the string: ");
  s=s.append(sc.nextLine());
  n=s.length();
  System.out.println("Enter the search character: ");
  ch=sc.next().charAt(0);
  for(int i=0;i<n;i++)
  {
	if(ch==s.charAt(i)) 
	{
	count++;	
	}
   }
  System.out.println("Frequency = "+count);
  }
 }
