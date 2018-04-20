package threadss;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		
		Thread t2 = new Thread(t1);
		
		t2.start();
		
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Main Thread about to terminate");
		
		System.out.println("Main Thread terminated");
		
		System.out.println(t2.getName());
		
		System.out.println(t2.getPriority());
		
		
	}

}
