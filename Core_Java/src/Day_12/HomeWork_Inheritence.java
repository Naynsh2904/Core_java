package Day_12;

public class HomeWork_Inheritence {
	public static void main(String[] args) {
//		1. Create a class Manager. Create a class TeamLeader which extends it. Again Create a class Employee which extends TeamLeader. Create different methods in the classes and call them using object of Employee class.
		Employee eobj = new Employee();
		eobj.Add(12,20);
		
		int bret=eobj.Mul(5, 2);
		System.out.println(bret);


//		2. Create a class Sports. Create two methods indoor() and outdoor() in it respectively. Create two classes Indoor and Outdoor which extends the Sports class and call the two methods respectively in both the classes.
		Indoor i = new Indoor();
		i.indoor();
		Outdoor o = new Outdoor();
		o.outdoor();

//		3. Create a class Person with methods getFirstName() and getLastName(). Create a class PersonDetails which extends the class Person and print the details by calling the methods.
		PersonDetails pobj = new PersonDetails("Nayan","Shivankar");

		
//		4. Create a class named Programming. Create a method programming() which prints "Programming languages are used to translate directions into binary code that devices can follow as apps, websites, and software programs. ". Create three classes Clanguage, CPP and Java respectively which extend it. Create methods in the three classes to print features of the particular language. Call the methods as per your requirement.
		C c = new C();
		CPP d = new CPP();
		Java r = new Java();
		c.C();
		d.cpp();
		r.Java();

	}
}
//	1. Create a class Manager. Create a class TeamLeader which extends it. Again Create a class Employee which extends TeamLeader. Create different methods in the classes and call them using object of Employee class.
class Manager
{
	public int Mul(int a,int b)
	{
		int c =a*b;
		return c;
	}
	
}

class TeamLeader extends Manager
{
	public int Sub(int a,int b)
	{
		int c =a-b;
		return c;
	}
}

class Employee extends TeamLeader
{
	public void Add(int a,int b)
	{
		System.out.println(a+b);
	}
}

//	2. Create a class Sports. Create two methods indoor() and outdoor() in it respectively. Create two classes Indoor and Outdoor which extends the Sports class and call the two methods respectively in both the classes.
class Sport {
	public void indoor() {
		System.out.println("Indoor Games");
	}
	public void outdoor() {
		System.out.println("Outdoor Games");
	}
}

class Indoor extends Sport{
	
}
class Outdoor extends Sport{
	
}
//	3. Create a class Person with methods getFirstName() and getLastName(). Create a class PersonDetails which extends the class Person and print the details by calling the methods.
class Person
{
	String str;
	String str2;
	
	Person(String a,String b)
	{
		this.str=a;
		this.str2=b;
	}
	
	
}
class PersonDetails extends Person
{
	PersonDetails(String str,String str2)
	{
		super(str,str2);
		System.out.println("First Name :"+str+" Last Name : "+str2);
	}

}

//	4. Create a class named Programming. Create a method programming() which prints "Programming languages are used to translate directions into binary code that devices can follow as apps, websites, and software programs. ". Create three classes Clanguage, CPP and Java respectively which extend it. Create methods in the three classes to print features of the particular language. Call the methods as per your requirement.
	

class Programming{
	
	public void Programming()
	{
		System.out.println("Programming languages are used to translate directions into binary code that devices can follow as apps, websites, and software programs. ");
	}
}

class C extends Programming
{
	public void C()
	{
		Programming p = new Programming();
		System.out.print("C Language is a ");
		p.Programming();
	}
	
}
class CPP extends Programming 
{
	public void cpp()
	{
		Programming p = new Programming();
		System.out.print("CPP Language is a ");
		p.Programming();
	}
	

}
class Java extends Programming
{
	public void Java()
	{
		Programming p = new Programming();
		System.out.print("Java Language is a ");
		p.Programming();
	}
	
}