import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class hashSetDemo {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		//Set set = new HashSet();
		Set set = new TreeSet();
		
		set.add("World");
		set.add("ABC");
		set.add("World");
		set.add("abc");
		set.add("Hello");

	
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			String S1 = (String) itr.next();
			System.out.println(S1);
		}
	}

}
