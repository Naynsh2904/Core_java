package Test;

import java.util.Scanner;

public class First_test {
	public static void main(String[] args) {
//		Accept a number from user and print its factors. e.g. factors of 6 are: 1 2 3
		Scanner scnr = new Scanner(System.in);
		
		int fact = scnr.nextInt();
		 
		for (int i=1; i<fact; i++) {
			if(fact % i == 0) {
				System.out.println(i);
			}
		}
		
//		Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
		int a=55;
		int b=70;
		
		if(a<50) {
			System.out.println("a<50 is true");
		}
		if (a<b) {
			System.out.println("a<b is true");
		}
		
		
		
//		Write a program to check largest among four integer numbers
		int e=10;
		int f=20;
		int c=30;
		int d=51;
		
		if(e>f && e>c && e>d) {
			System.out.println(e + " is Greater");
		} else if(f>e && f>c && f>d) {
			System.out.println(f + " is Greater");
		} else if(c>f && e>f && c>d) {
			System.out.println(c + " is Greater");
		} else if(d>f && d>c && d>e) {
			System.out.println(d + " is Greater");
		} else {
			System.out.println("All no=umber are same");
		}
		
		
		
//		Write a program to print odd numbers from 521 to 229 using do___while loop.
		
		int num = 531;
		do {
			if (num % 2 != 0) {
				System.out.print(num+ " ");
			}
			num--;
		} while ( num > 229);
		
//		Write a program to Print A to Z alphabeats using loop
		char alpha = 'A';
		do {
			System.out.println(alpha);
			alpha++;
		}while(alpha <= 26);	
		
//		Write a program to enter 10 elements into the array and store even and odd elements into two different arrays
		int arr[] = {1,2,3,4,5,6,7,8,9,90};
        int even[] = new int[arr.length];
        int odd[] = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
          if(arr[i] % 2 == 0){
            even[i]= arr[i];
          }else {
        	  even[i]= 0;
          }
          if(arr[i] % 2 != 0){
            odd[i]= arr[i];
          }else {
        	  odd[i] = 1;
          }
        }
        
        System.out.print("even number is ");
        for(int i=0; i<arr.length; i++) {
        	System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.print("odd number is ");
        for(int i=0; i<arr.length; i++) {
    		System.out.print(odd[i]+" ");
    	}
        
		
	}
}
