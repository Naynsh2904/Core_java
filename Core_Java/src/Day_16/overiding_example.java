package Day_16;

public class overiding_example extends Two {
	public static void main(String[] args) {
		Three t = new Three();
		t.one(45);
	}
	void one (int a) {
		System.out.println("First");
	}
}

class Two extends Three {
	void one (int a) {
		System.out.println("second");
	}
}

class Three {
	void one (int a) {
		System.out.println("three	");
	}
}
