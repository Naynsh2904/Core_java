package Day_06;

public class Arrays {
	public static void main(String[] args) {
		
//		Classwork
//		1. Write a program for addition of single array elements.
		int arr1[] = new int[3];
		arr1[0] = 5;
		arr1[1] = 5;
		arr1[2] = 5;
		
		int sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		
		System.out.println("addition of aaray of element is "+ sum);
		System.out.println();
		
//		2. Write a program for addition of two arrays stored in third array.
		int arr2[] = {10,20,30,40,50};
		int arr3[] = {10,20,30,40,50};
		int sumoftwoarr[]= new int[arr2.length];
		
		for(int i=0; i<5; i++) {
			sumoftwoarr[i]= arr2[i] + arr3[i];
			System.out.print(sumoftwoarr[i]+ " ,");
		}
		System.out.println();
		System.out.println();
		
//		3. Write a program to search a particular element in array and display its position.
		int arr4[] = {10,20,30,40,50};
		int key = 40;
		
		for(int i=0;i<arr4.length; i++ ) {
			if(arr4[i] == key) {
				System.out.println("position of "+ key + " is "+ (i+1));
			}
		}
		System.out.println();
		
//		4. Write a program to store squares and cubes of the elements in another arrays and Display all the three arrays.
		int arr5[] = {10,20,30,40,50};
		int square[] = new int[arr5.length];
		int cube[] = new int[arr5.length];
		
		for(int i=0; i<arr1.length; i++) {
			square[i] =arr5[i]*arr5[i];
			cube[i] =arr5[i]*arr5[i]*arr5[i];
			System.out.println("Square of "+arr5[i] + " is "+ square[i]);
			System.out.println("cube of "+arr5[i] + " is "+ cube[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
//		Homework
//		1. Write a program to insert array elements and search any particular array element.
		int arr6[] = {10,20,30,40,50};
		int key2= 40;
		
		for(int i=0;i<arr4.length; i++ ) {
			if(arr6[i] == key) {
				System.out.println("position of "+ key2+ " is "+ (i+1));
			}
		}
		System.out.println();
		
//		2. Enter 5 array elements and sort them in ascending order.
		int arr7[] = { 5, 7, 9, 6, 8, 4, 1 };
//		Ascending order
		for (int i = 0; i < arr7.length - 1; i++) {
			  for (int j = 0; j < arr7.length - 1 - i; j++) {
			    if (arr7[j] > arr7[j + 1]) {
			    	
			      int temp = arr7[j];
			      arr7[j] = arr7[j + 1];
			      arr7[j + 1] = temp;
			    }
			  }
			}
		System.out.print("asending order : ");
	    for (int j = 0; j < arr7.length; j++) {
	        System.out.print(arr7[j] + "  ");
	      }
	    System.out.println();
	    
//	    descending order
	    for (int i = 0; i < arr7.length - 1; i++) {
			  for (int j = 0; j < arr7.length - 1 - i; j++) {
			    if (arr7[j] < arr7[j + 1]) {
			    	
			      int temp = arr7[j];
			      arr7[j] = arr7[j + 1];
			      arr7[j + 1] = temp;
			    }
			  }
			}
	    System.out.print("decending order : ");
	    for (int j = 0; j < arr7.length; j++) {
	        System.out.print(arr7[j] + "  ");
	      }
	    System.out.println();
	    System.out.println();
	    
//	    3. Enter 10 array elements and find the minimum and maximum number among them.
	    int arr8[] = {50,65,12,75,15,42};
	    
	    int min = Integer.MIN_VALUE;
	    int max = Integer.MAX_VALUE;
	    
	    for(int i=0; i<arr8.length; i++) {
	    	if(arr8[i]>min) {
	    		min = arr8[i];
	    	}
	    	if(arr8[i]<max) {
	    		max = arr8[i];
	    	}
	    }
	    System.out.println("maximun number is : " + min);
	    System.out.println("minimum number is : " + max);
	    System.out.println();
	    
//	    4. Enter 10 array elements and store even and odd numbers among them in different arrays.
	    int arr9[] = {50,65,12,75,15,42};
        int even[] = new int[arr9.length];
        int odd[] = new int[arr9.length];
        
        for(int i=0; i<arr9.length; i++) {
          if(arr9[i] % 2 == 0){
            even[i]= arr9[i];
            
          }
          if(arr9[i] % 2 != 0){
            odd[i]= arr9[i];
          }
        }
        
        System.out.print("even number is ");
        for(int i=0; i<arr9.length; i++) {
        	if(even[i] != 0) {
        		System.out.print(even[i]+" ");
        	}
        }
        System.out.println();
        System.out.print("odd number is ");
        for(int i=0; i<arr9.length; i++) {
        	if(odd[i] != 0) {
    		System.out.print(odd[i]+" ");
    	}
        }
	    
	    
	    
	}
}
