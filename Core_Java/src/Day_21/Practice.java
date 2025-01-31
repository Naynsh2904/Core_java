package Day_21;

public class Practice {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread t = new Thread(() -> {
            try {
                a.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t1 = new Thread(() -> {
            try {
                b.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();
        t1.start();
    }
}

class A {
    public void run() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            System.out.println("One 1 : " + i);
            Thread.sleep(500);
        }
    }
}

class B {
    public void run() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Two 2 : " + i);
            Thread.sleep(0);
        }
    }
}
