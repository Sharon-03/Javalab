import java.util.Scanner;
abstract class Animal
{
 protected int legs;
 protected Animal(int legs)
 {
	 this.legs=legs;
 }
 public abstract void eat();
 public abstract void walk();
}
class Spider extends Animal
{
 public Spider()
 {
 super(8);
 }
 public void walk()
 {
	 System.out.println("Walks on "+legs+"legs");
 }
 public void eat()
 {
	 System.out.println("Spider eats insects");
 }
}
interface Pet
{
 public String getname();
 public void play();
 }
  class Poocha extends Animal implements Pet
{
private String name;
public Poocha(String nm)
	{
		super(4);		
	    name=nm;
	}
 public Poocha()
 {
	 this("");
 }
 public String getname()
 {
	 return name;
 }
 public void setname(String name)
 {
	 this.name=name;
 }
 public void play()
 {
	 System.out.println(name+"plays with ball.");
 }
 public void eat()
 {
	 System.out.println("Cats eat anyhting.");
 }
 public void walk(){
 }
}
class Fish extends Animal implements Pet
{
	private String name;
	public Fish(String name)
	{
		super(0);		
	    this.name=name;
	}
 public Fish()
 {
	 this("");
 }
 public String getname()
 {
	 return name;
 }
 public void setname(String name)
 {
	 this.name=name;
 }
 public void play()
 {
	 System.out.println(name+"plays in aquarium.");
 }
 public void eat()
 {
	 System.out.println("Fish eat insects.");
 }
 public void walk() {
 }
}
public class Animalinheritance 
{
	public static void main(String[] args) 
	{
		Fish d = new Fish();
		Poocha c = new Poocha("Fluffy");
		Animal e = new Spider();
		Pet p = new Poocha();
		d.getname();
		d.play();
		d.eat();
		d.walk();
		c.getname();
		c.play();
		c.eat();
		c.walk();
	}
}
