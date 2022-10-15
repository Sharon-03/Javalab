import java.util.Scanner;
public class StringPallindrome 
{
 public static void main(String[] args) 
 {
  int n;
  StringBuffer s=new StringBuffer("");
  StringBuffer rev=new StringBuffer("");
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the string: ");
  rev = s.append(sc.nextLine());
  System.out.println("Reverse of the string is: "+(s.reverse()));
  if(s.equals(rev))
  {
   System.out.println("PALLINDROME");	  
  }
  else
  {
	System.out.println("NOT PALLINDROME");
  }
 }
}
