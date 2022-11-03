class Employee
{
	String name;
 	int age;
 	String phone;
 	double	Salary;	
    public Employee(String name, int age, double Salary, String phone)
    {	 this.name=name;
    	 this.age=age;
    	 this.Salary=Salary;
         this.phone=phone;
	}  
    void printdetails()
	 {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Contact: "+phone);
	 }	
}
class Officer extends Employee
 {
	 String Specialization ;
 	 Officer(String name,int age,double Salary,String phone,String Specialization)
 	 {
 		 super(name,age,Salary,phone);
 		 this.Specialization=Specialization;
 		System.out.println("Specializtaion: "+Specialization); 
 	 }
 	 void printSalary()
 	 {
 		 System.out.println("Salary ="+Salary);
 	 }	 
}	 
class Manager extends Officer
{
	 Manager(String name,int age,double Salary,String phone,String Specialization)
	 {   super(name, age, Salary, phone, Specialization);
		 this.Specialization=Specialization;
	 }
}
public class SimpleInheritence 
{
 public static void main(String[] args) 
 {
	Officer Off =new Officer("Employee-1",29,200000,"944776651","Officer");
	Off.printdetails();
	Off.printSalary();
	Manager man=new Manager("Employee-2",32,400000,"944778821","Manager");
	man.printdetails();
	man.printSalary();
 }
}
