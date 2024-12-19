package Day_05;

import java.util.Scanner;

public class Homework_looping_Statement {
	public static void main(String[] args) {

		Scanner scnr = new Scanner (System.in);
		int a = 0;
//		Print 1 to 50 alternate numbers by using while loop
		System.out.println("print 1 to 50 numbers");
		while(a <= 50) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		System.out.println();
		
//		Print 1 to 50 even numbers by using while loop
		System.out.println("print 1 to 50 even numbers");
		int b = 0;
		while(b <= 50) {
			if( b % 2 == 0) {
				System.out.print(b + " ");
			}
			b++;
		}
		System.out.println();
		System.out.println();
		
//		Print 1 to 50 odd numbers by using while loop
		System.out.println("print 1 to 50 odd numbers");
		int c = 0;
		while(c <= 50) {
			if( c % 2 != 0) {
				System.out.print(c + " ");
			}
			c++;
		}
		System.out.println();
		System.out.println();
		
//		Print sum of 1 to 10 even numbers using while loop
		System.out.println("Print sum of 1 to 10 even numbers");
		int d = 1;
		int sum = 0;
		while(d<=10) {
			if (d % 2 == 0) {
				sum += d;
			}
			d++;
		}
		System.out.print("sum of 1 to 10 even no. is " + sum);

		System.out.println();
		System.out.println();
		
//		Print sum of 1 to 10 odd numbers using while loop
		System.out.println("Print sum of 1 to 10 odd numbers");
		int e = 1;
		int oddSum = 0;
		while(e<=10) {
			if (e % 2 != 0) {
				oddSum += e;
			}
			e++;
		}
		System.out.print("sum of 1 to 10 odd no. is " + oddSum);

		System.out.println();
		System.out.println();
		
//		Accept a number from user and print its factorial. e.g. 5! = 120
		System.out.print("Enter no. for factorial: ");
        int f = scnr.nextInt();
        int factorial=1;
        for(int i = 1; i<=f;i++){
        	factorial *= i;
        }
          System.out.print("factorial of "+f+"is "+factorial);
  		System.out.println();
  		System.out.println();
  		
//  	Write a program to print odd numbers from 521 to 229 using while loop.
  		System.out.println("print odd numbers from 521 to 229");
  		int g = 521;
  		while(g>=229) {
  			System.out.print(g+" ");
  			g-=2;
  		}
  		System.out.println();
  		System.out.println();
  		
//  	Write a program to print table of number given by the user
		System.out.print("Enter table no ");
  		int h = scnr.nextInt();
  		System.out.println("print a table for "+ h);
  		
  		for(int i =1; i<=10; i++) {
  		
  			System.out.println(h*i);
  		}
  		
  		System.out.println();
  		System.out.println();
  		
//  	Write a program to check whether the number is palindrome or not
  		System.out.println("check whether the number is palindrome or not");
  		String checkPalindrome = "12321";
  		boolean check=true;
        for (int i=0; i<checkPalindrome.length()/2; i++) {
            
            int n = checkPalindrome.length();
            if(checkPalindrome.charAt(i) != checkPalindrome.charAt(n-1-i)){
               check=false;
            }
        }
        if (check==true) {
            System.out.println("is palindrome");

        }else{
            System.out.println("is not palindrome");
        }
  		System.out.println();
  		System.out.println();
  		
//      Print 1 to 50 alternate numbers by using do___while loop
  		System.out.println("print 1 to 50 numbers");
        int ij = 1;
        do {
			System.out.print(ij + " ");
			ij++;
		} while(ij <= 50);
		System.out.println();
		System.out.println();
		
//		Print 1 to 50 even numbers by using do___while loop
		System.out.println("print 1 to 50 even numbers");
		int jk = 0;
		do{
			if( jk % 2 == 0) {
				System.out.print(jk + " ");
			}
			jk++;
		}while(jk <= 50);
		System.out.println();
		System.out.println();
		
//		Print 1 to 50 odd numbers by using do___while loop
		System.out.println("print 1 to 50 odd numbers");
		int k = 0;
		do {
			if( k % 2 != 0) {
				System.out.print(k + " ");
			}
			k++;
		}while(k <= 50);
		System.out.println();
		System.out.println();
		
//		Print sum of 1 to 10 even numbers using do___while loop
		System.out.println("Print sum of 1 to 10 even numbers");
		int l = 1;
		int sum2 = 0;
		do {
			if (l % 2 == 0) {
				sum2 += l;
			}
			l++;
		}while(l<=10);
		System.out.print("sum of 1 to 10 even no. is " + sum2);

		System.out.println();
		System.out.println();
		
//		Print sum of 1 to 10 odd numbers using do___while loop
		System.out.println("Print sum of 1 to 10 odd numbers");
		int m = 1;
		int oddSum2 = 0;
		while(m<=10) {
			if (m % 2 != 0) {
				oddSum2 += m;
			}
			m++;
		}
		System.out.print("sum of 1 to 10 odd no. is " + oddSum2);

		System.out.println();
		System.out.println();
		
//		Write a program to print odd numbers from 521 to 229 using do___while loop.
		System.out.println("print odd numbers from 521 to 229");
  		int n = 521;
  		do {
  			System.out.print(n+" ");
  			n-=2;
  		}while(n>=229);
  		System.out.println();
  		System.out.println();
  		
//  	1. Write a program to print sum of even numbers and odd numbers between 1 to 30 using for loop
  		int OddSum = 0;
  		int EvenSum = 0;
  		for(int ab=0; ab<=30; ab++) {
  			if(ab % 2 == 0) {
  				EvenSum += ab;
  			} else {
  				OddSum += ab;
  			}
  		}
  		System.out.println("Sum of odd number is " + OddSum);
  		System.out.println("Sum of even number is " + EvenSum);

//		2. Accept a number from user and print its sum of digits. e.g. if num is 123 the answer is 6.
		System.out.print("Enter No : ");
		
		int sumDigit = 0;
		for(int ac = scnr.nextInt(); ac != 0; ac /= 10) {
			sumDigit += ac % 10;
		}
		System.out.println("print its sum of digits is " +sumDigit);
		System.out.println();
		System.out.println();
		
//		3. Print odd numbers from 101 to 110 using for loop.
		System.out.println("Print odd numbers from 101 to 110");
		for(int i=101; i<=110; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
//		4. Accept a number from user and print its factorial using for loop.
		System.out.print("Enter no. for factorial: ");
		int factNo = scnr.nextInt();
	    int factorialOne=1;
	    for(int i = 1; i<=factNo;i++){
	    	factorialOne *= i;
	    }
	    System.out.print("factorial of "+factNo+" is "+factorialOne);
	    System.out.println();
	    System.out.println();
	    
//	    5. Write a program to print squares of numbers from 1 to20 using for loop
	    for (int i = 1; i <=20; i++) {
	    	System.out.println("square of "+ i +" = " + i*i + " ");
	    }
	    System.out.println();
	    System.out.println();
	    
//	    6. Print a table of 5 us ing for loop.
	    for(int i = 1; i<=10; i++) {
	    	System.out.println(5*i);
	    }
	    System.out.println();
	    System.out.println();
	    
//	    Print sum of 1 to 10 numbers using while loop
	    int using = 0;
	    int izx =1;
	    while ( izx<=10 ) {
	    	using+=izx;
	    	izx++;
	    }
	    System.out.println("sum of 1 to 10 numbers is "+using);
	    System.out.println();
	    System.out.println();
	    
//	    Write a program to print sum of even numbers and odd numbers between 1 to 30.
	    int OddSum2 = 0;
		int EvenSum2 = 0;
		for(int ab=0; ab<=30; ab++) {
			if(ab % 2 == 0) {
				EvenSum2 += ab;
			} else {
				OddSum2 += ab;
			}
		}
		System.out.println("Sum of odd number is " + OddSum2);
		System.out.println("Sum of even number is " + EvenSum2);
	    System.out.println();
	    System.out.println();
	    
//	    Accept a number from user and print its factors. e.g. factors of 6 are: 1 2 3
	    System.out.print("Enter a number: ");
        int numex = scnr.nextInt();

        System.out.print("Factors of " + numex + " are: ");
        for (int i = 1; i <= numex; i++) {
            if (numex % i == 0) {
                System.out.print(i + " ");
            }
        }
	    System.out.println();
	    System.out.println();
	    
//	    Accept base and index from user and print its power. e.g. 2^3 = 8
	    System.out.print("Enter base: ");
	    int base = scnr.nextInt();
	    System.out.print("Enter index: ");
	    int index = scnr.nextInt();
	    int power =1 ;
	    
	    for(int i=1; i<=index; i++) {
	    	power*= base;
	    }
	    System.out.println(power);
	    System.out.println();
	    System.out.println();
	    
	    
//		Find all prime number between 101 to 150
		int start = 101;
        int end = 150;
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
	    System.out.println();
	    System.out.println();
	    
//	    Write a program to print squares of numbers from 1 to20
	    for (int i = 1; i <=20; i++) {
	    	System.out.println("square of "+ i +" = " + i*i + " ");
	    }
	    System.out.println();
	    System.out.println();
        
        
	}
}
