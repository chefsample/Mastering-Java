package threadss;

public class HighImportantThread extends Thread {
	public HighImportantThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName()+"Running");
	}
}
