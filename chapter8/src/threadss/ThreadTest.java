package threadss;

public class ThreadTest {
	public static void main(String[] args) {
		LessImportantThread lt = new LessImportantThread("A");
		lt.setPriority(5);
		lt.start();
		
		HighImportantThread ht1 = new HighImportantThread("B");
		ht1.setPriority(10);;
		ht1.start();
		
		LessImportantThread lt1 = new LessImportantThread("E");
		lt1.setPriority(5);
		lt1.start();
		
		HighImportantThread ht2 = new HighImportantThread("C");
		ht2.setPriority(10);;
		ht2.start();
		
		HighImportantThread ht3 = new HighImportantThread("D");
		ht3.setPriority(10);;
		ht3.start();
	}

}
