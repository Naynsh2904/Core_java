package Day_10;

public class classes_Objects {
	public class Main {
	    public static void main(String[] args) {
	        Clanguage c = new Clanguage();
	        CPP cpp = new CPP();
	        Java java = new Java();
	        Employee employee = new Employee();
	        Student std = new Student();
	        Circle cir = new Circle();
	        Triangle tri = new Triangle();
	        Rectangle rec = new Rectangle();
	        Account acc = new Account();
	        

	        c.displayCLanguage();
	        cpp.displayCPP();
	        java.displayJava();
	        
	        float basic = 20000;
	        employee.grosssalary(basic);
	        
	        std.info();
	        std.avg();
	        
	        cir.area();
	        tri.area();
	        rec.area();
	        
	        acc.createAccount("John Doe");
	        acc.creditAmount(1000);
	        acc.debitAmount(500);
	    }
	}

}

//1. Create classes with names "Clanguage", "CPP", "Java" respectively. Create different methods in the three classes and try to call the methods where ever required.
class Clanguage {
    public void displayCLanguage() {
        System.out.println("This is C Language.");
    }
}
class Java {
    public void displayJava() {
        System.out.println("This is Java Language.");
    }
}
class CPP {
    public void displayCPP() {
        System.out.println("This is C++ Language.");
    }
}

//2. Create a class Employee. Create a method grosssalary( ) in the class. Calculate the gross salary of employee by adding 50% of bonus in the basic salary.
class Employee {
	public void grosssalary(float basic) {
		float gross =basic + basic * 0.50f ;
		System.out.println("Gross salary is "+ gross);
	}
}

//3. Take name age and marks of three subjects of the student. Calculate the average marks. Take two different methods for personal information and marks.
class Student {
	public void info() {
		String name = "Nayan";
		int age = 22;
		System.out.println("my name is "+ name + " and age is " + age);
	}
	public void avg() {
		int sub1 = 76;
		int sub2 = 79;
		int sub3 = 91;
		
		float avg = (sub1+ sub2 + sub3)/ 3;
		System.out.println("average is "+ avg);
	}
}

//4. Create three classes "Circle", "Triangle" and "Rectangle". Calculate the areas of the all the three using three different methods.
class Circle{
	public void area() {
		float pi = 3.14f;
		int r=5;
		float area = pi * r* r;
		System.out.println("Area of a Circle is "+ area);
	}
}
class Triangle {
	public void area() {
		int base = 4;
		int height = 6;
		float area = 0.5f * base * height;
		System.out.println("Area of a Triangle is "+ area);
	}
}
class Rectangle {
	public void area() {
		int width = 4;
		int length = 6;
		int area = width * length;
		System.out.println("Area of a Rectangle is "+ area);
	}
}

//5. Create a main class with the name "Bank". Create different classes for different operations perform in a bank. (eg: credit, debit, opening account etc.). Create methods for the same and call them in the main class.
class Account {
	public void createAccount(String accountHolder) { 
		System.out.println("Account created for: " + accountHolder); 
		}
	public void debitAmount(double amount) {
		System.out.println("Amount debited: Rs." + amount);
		}
	public void creditAmount(double amount) { 
		System.out.println("Amount credited: Rs." + amount); 
		}
}
