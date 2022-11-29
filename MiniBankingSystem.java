import java.util.Random;
import java.util.Scanner;
class InvalidAmountException extends Exception
{
 InvalidAmountException(String msg) 
 {
	 super (msg);
 }
}
class Account 
{
 static String name;
 static long Accno=000000;
 static long balance;
 static long amount;
 static int age;
public static void CreateAcc()
{
Scanner s =new Scanner(System.in); 
String name;
String AccNo;
int age = 0;
int AccBalance;
int op;
System.out.println("Enter the Name: ");
name=s.nextLine();
System.out.println("Enter the account Number: ");

Accno=s.nextLong();
System.out.println("Your new AccNo. is: "+Accno);
System.out.println("Enter the age: ");
age=s.nextInt();
System.out.println("Enter the Amount: ");
amount=s.nextLong();
balance=balance+amount;
}
public void search()
 {
String name;
String AccNo;
int age;
int AccBalance;
int op;
System.out.println("Enter the account number to be checked:");
Long accno1;
Scanner a = new Scanner(System.in);
accno1 = a.nextLong();
if(Accno == accno1)
  {
   display();
  }
 }
public static void display()
 {
  System.out.println("Name        : "+name);
  System.out.println("Age         : "+age);
  System.out.println("Account No. : "+Accno);
  System.out.println("Balance     : "+balance);
 }
public static void Withdraw()
{
 int Withdraw;
 Scanner w = new Scanner(System.in);
 System.out.println("Enter the amount to be withdrawed: ");
 Withdraw = w.nextInt();
 try
 {
	if(Withdraw<=0)
	{
		throw new InvalidAmountException("Invalid withdrawal amount.");
	}
	else
	{
		balance=balance-Withdraw;
	}
 }
 catch(Exception e)
 {
	 System.out.println(e);
 }
}
public static void deposit()
 {
  Scanner dep= new Scanner(System.in);
  long deposit;
  System.out.println("Enter the amount to be deposited: ");
  deposit=dep.nextLong();
  try
  {
	 if(deposit<=0)
	 {
		throw new InvalidAmountException("Invalid Amount.");
	 }
	 else
	 {
		 balance= balance + deposit;
		 System.out.println("Your current Amount is: "+balance);
	 }
  } catch(Exception e)
  {
	  System.out.println(e);
  }
 }
}
public class BankAccount extends Account
{
 public static void main(String[] args) 
 {
  Scanner k = new Scanner(System.in);
  int n;
  int entry=0;
  System.out.println("Enter the number of customers:");
  n=k.nextInt();
  Account cus[]=new Account[n]; 
  System.out.println("Enter the details of the coustmer");
  for(int i=0;i<n;i++)
  {
	  cus[i]=new Account();
	  CreateAcc();
  }
  for(int i=0;i<=n;i++)
  {
  System.out.println("Enter your choice: \n 1->Display\n2->Deposit\n3->withdraw\n4->Exit");  
  entry=k.nextInt();
  switch(entry)
  {
 
  case 1:
	     display();
  case 2:
	    deposit();
  case 3:
	    Withdraw();
  case 4:
	     break;
   }
  }
 }
}
