package Day_12;

public class classwork_Inheritence {
	public static void main(String[] args) {
//		1. Write a program to demonstrate Multilevel Inheritance. (Take example by your own).
		Dog d = new Dog();
		d.eat();
		System.out.println();
		
//		2. Create a class bank. Create two methods credit() and debit() in it respectively. Create two classes Credit and Debit which extends the Bank class and call the two methods respectively in both the classes.
		Credit cr = new Credit();
		cr.credit();
		Debit dr =new Debit();
		dr.debit();
		System.out.println();
		
//		3. Create a class GrandParent. Create a class Parent which extends it. Again Create a class Child which extends Parent. Create different methods in the classes and call them using object of child class.
		Child ch = new Child();
		ch.child();
		ch.parent();
		ch.grandParent();
		System.out.println();
		
//		4. Write a program to demonstrate single level inheritance. (Take example by your own)
		B a = new B();
		a.parent_A();
		a.child_B();
		System.out.println();
		
//		5. Create a class Student. Create three classes PersonalDetails, AcademicDetails, and CurricularDetails respectively which extend it. Create different methods in different classes and call the methods based on your requirement.
		PersonalDetails personal = new PersonalDetails("Nayan Shivankar", 101, "Wardha, Maharashtra", "9876543210");
        personal.displayPersonal();

        System.out.println();

        AcademicDetails academic = new AcademicDetails("Nayan Shivankar", 101, "B.Tech in CSE", 7.1);
        academic.displayAcademic();

        System.out.println();

        String[] activities = {"Events Participant", "Cricket Team"};
        CurricularDetails curricular = new CurricularDetails("Nayan Shivankar", 101, activities);
        curricular.displayCurricular();
	}
}

//	1. Write a program to demonstrate Multilevel Inheritance. (Take example by your own).
class Animal {
	public void eat() {
		System.out.println("eating");
	}
}

class Mammal extends Animal {
	public void leg() {
		System.out.println("Legsss");
	}
}

class Dog extends Mammal{
	public void dogg() {
		System.out.println("Dog");
	}
}

//	2. Create a class bank. Create two methods credit() and debit() in it respectively. Create two classes Credit and Debit which extends the Bank class and call the two methods respectively in both the classes.
class Bank {
	public void credit() {
		System.out.println("Dear UPI user A/C X6909 Credited by 500.0 on date 26Dec24");
	}
	public void debit() {
		System.out.println("Dear UPI user A/C X6909 debited by 15.0 on date 26Dec24");
	}
}

class Credit extends Bank{
	
}

class Debit extends Bank{
	
}

//	3. Create a class GrandParent. Create a class Parent which extends it. Again Create a class Child which extends Parent. Create different methods in the classes and call them using object of child class.
class GrandParent {
	public void grandParent() {
		System.out.println("From GrandParent");
	}
}

class Parent extends GrandParent {
	public void parent () {
		System.out.println("from Parent");
	}
}

class Child extends Parent {
	public void child() {
		System.out.println("From Child");
	}
}

//	4. Write a program to demonstrate single level inheritance. (Take example by your own)
class A {
	public void parent_A() {
		System.out.println("From Single levevel inhertence Parent A");
	}
}

class B extends A {
	public void child_B() {
		System.out.println("From single level inheritence Child B");
	}
}


//	5. Create a class Student. Create three classes PersonalDetails, AcademicDetails, and CurricularDetails respectively which extend it. Create different methods in different classes and call the methods based on your requirement.
class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayBasicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class PersonalDetails extends Student {
    String address;
    String contactNumber;

    public PersonalDetails(String name, int rollNumber, String address, String contactNumber) {
        super(name, rollNumber);
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public void displayPersonal() {
        displayBasicDetails();
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }
}

class AcademicDetails extends Student {
    String course;
    double cgpa;

    public AcademicDetails(String name, int rollNumber, String course, double cgpa) {
        super(name, rollNumber);
        this.course = course;
        this.cgpa = cgpa;
    }

    public void displayAcademic() {
        displayBasicDetails();
        System.out.println("Course: " + course);
        System.out.println("CGPA: " + cgpa);
    }
}

class CurricularDetails extends Student {
    String[] activities;

    public CurricularDetails(String name, int rollNumber, String[] activities) {
        super(name, rollNumber);
        this.activities = activities;
    }

    public void displayCurricular() {
        displayBasicDetails();
        System.out.println("Co-Curricular Activities:");
        for (String activity : activities) {
            System.out.println("- " + activity);
        }
    }
}













