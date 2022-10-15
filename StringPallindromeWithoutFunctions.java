import java.util.Scanner;
public class PallindromeWithoutFunctions 
{
 public static void main(String[] args) 
 {
  int n;
  StringBuffer s=new StringBuffer("");
  StringBuffer rev = new StringBuffer("");
  String s1,s2;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the string: ");
  s=s.append(sc.nextLine());
  n=s.length();
  for(int i=n-1;i>=0;i--)
  {
   rev= rev.append(s.charAt(i));
  }
  System.out.println("Reverse of the string is: "+rev);
  s1=s.toString();
  s2=rev.toString();
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
