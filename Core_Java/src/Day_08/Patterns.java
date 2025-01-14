package Day_08;

public class Patterns {
	public static void main(String[] args) {
//		square star patterns
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
//		Hollow Square star patterns
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				if(i==0 || i==4 || j==0 || j==4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
//		right triangle
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
//		hollow right angle
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0||i==j || i==4) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
	