import java.util.Scanner;
import java.io.*;
public class FileSample
{
 public static void main(String[] args) throws IOException 
 {
  Scanner s =new Scanner(System.in);
  File f1 =new File("Sample4.txt");
  File fc =new File("Copy.txt");
  try
  {
    if(f1.createNewFile())
    {
	 System.out.println("File created");
    }
    else
    {
	   System.out.println("FILE creation failed");
    }
     String str1;
     FileInputStream f3= new FileInputStream(f1);
      System.out.println("Enter the content for the file");
      str1=s.nextLine();
      FileOutputStream f2=new FileOutputStream(f1);
      f2.write(str1.getBytes());
      f2.flush();
      f2.close();
      System.out.println("Content saved in the file");
      System.out.println("File Name: "+f1.getName());
  }
   catch(FileNotFoundException e)
   {
    e.printStackTrace();
   }
   catch(IOException e)
   {
	e.printStackTrace();
   }
   try
   {
	FileInputStream in =new FileInputStream(f1);
	int l= (int)f1.length();
    byte[] Bytes=new byte[l];
    in.read(Bytes);
    String str= new String(Bytes);
    System.out.println("Content of file_1: "+str);
    in.close();
   }
   catch(FileNotFoundException e)
   {
	  e.printStackTrace();
   }
   catch(IOException e)
   {
	 e.printStackTrace();
   }
  File file=new File("NEW Sample");
  try
  {
  if(f1.createNewFile())
   {
	  System.out.println("NEW File Created");
   }
  }
  catch(FileNotFoundException e)
  {
	 e.printStackTrace();
  }
  catch(IOException e)
  {
	 e.printStackTrace();
  }
  FileInputStream io= new FileInputStream(f1);
  FileOutputStream ou=new FileOutputStream(fc);
  int len=(int)f1.length();
  byte[] Bytes=new byte[len];
  io.read(Bytes);
  for(int i=0;i<len;i++)
  {
  ou.write(Bytes[i]);
  }
  System.out.println("File copied");
  int text;
  io.close();
  ou.close();
 try
 {
 FileInputStream a=new FileInputStream(f1);
 int text1;
 System.out.println("Copied File Name: "+fc.getName());
 System.out.println("Content of copied file-  ");
 while((text1=a.read())!=-1)
 {
 System.out.print((char)text1);
 }
 a.close();
 }
  catch(FileNotFoundException e)
  {
  e.printStackTrace();
  }
  catch(IOException e)
  {
  e.printStackTrace();
  }
 }
}
