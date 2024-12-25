package Day_11;

public class homework {
	public static void main(String[] args) {
//	1. Write a program to show constructor overloading. (Take your own example)
		Book b = new Book(10 , 20);
		Book c = new Book(10 , 20, 30);
		System.out.println();
		
//		2. Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
		BankAccount a = new BankAccount();
		a.setAccountNo(123456789);
		System.out.println("Account number is "+a.getAccountNo());
		a.setBalance(15000);
		System.out.println("Balance is "+ a.getBalance());
		System.out.println();
		
//		3. Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.
		Rectanglee r = new Rectanglee();
		r.setLen(10);
		r.setWidth(20);
		System.out.println("Length of Rectangle is "+r.getLen());
		System.out.println("width of Rectangle is "+r.getWidth());
		System.out.println();
		
//		4. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculateCircuference() that return the calculated area and perimeter based on the current radius value.
		Circle m =new Circle();
		m.setRadius(10);
		m.calculateArea(m.getRadius());
		m.calculateCircumference(m.getRadius());
		System.out.println();
		
//		5. Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
		Car k = new Car();
		k.setCompany_Name("BMW");
		k.setModal_Name("BMW M8 Competition Coupe");
		k.setYear(2021);
		k.setMileage("20km/hr");
		System.out.println("Company name is "+ k.getCompany_Name());
		System.out.println("modal name is "+ k.getModal_Name());
		System.out.println("year is "+ k.getYear());
		System.out.println("Milage is "+ k.getMileage());
		System.out.println();
		
//		6. Write a Java program to create a class called "Movie" with attributes for title, director and actors and print the names by using constructor. Take one constructor for title and movie and another constructor for three actors
		Movie e = new Movie();
	}
}

//	1. Write a program to show constructor overloading. (Take your own example)
class Book {
	Book(int a, int b){
		System.out.println(a +b);
	}
	
	Book(int a, int b, int c){
		System.out.println(a+b+c);
	}
}

//	2. Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
class BankAccount {
	private int accountNo ;
	private int balance ;
	
	public int getAccountNo () {
		return accountNo;
	}
	public void setAccountNo (int accountNo) {
		this.accountNo =accountNo;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance (int balance) {
		this.balance=balance;
	}
}

//	3. Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.
class Rectanglee {
	private int len;
	private int width;
	
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len=len;
	}
	
	public int getWidth () {
		return width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
}

//	4. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculateCircuference() that return the calculated area and perimeter based on the current radius value.
class Circle {
	float pi= 3.14f;
	private int radius;
	public int getRadius () {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void calculateArea(int radius) {
		double area = pi *radius* radius;
		System.out.println("Area of circle is "+ area);
	}
	public void calculateCircumference(int radius) {
		double area = pi *2* radius;
		System.out.println("circumference  of circle is "+ area);
	}
}


//5. Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
class Car {
	private String company_Name;
	private String modal_Name;
	private int year;
	private String mileage;
	
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	
	public String getModal_Name() {
		return modal_Name;
	}
	public void setModal_Name(String modal_Name) {
		this.modal_Name = modal_Name;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
}

//	6. Write a Java program to create a class called "Movie" with attributes for title, director and actors and print the names by using constructor. Take one constructor for title and movie and another constructor for three actors
class Movie {
	String title = "Andhadhun";
	String descrip = "Sriram Raghavan";
	String actor = "Ayushmann Khurrana";
	Movie (){
		System.out.println("Movie name is "+title +" and director is " + descrip+ ", and Hero is "+actor);
	}
}






