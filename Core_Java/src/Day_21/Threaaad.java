package Day_21;

public class Threaaad extends Thread {

	public static void main(String[] args) {
		One o =new One();
		tne t =new tne();
		o.start();
		t.start();
	}

}

class One extends Thread {
	public void run () {
		for(int i=1 ; i< 5; i++) {
			for(int j=1;j<5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class tne extends One {
	public void run () {
		for(int i=1 ; i<= 5; i++) {
			for(int j=1;j<5; j++) {
				if(i==1 || i== 5||j==1||j==5) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}