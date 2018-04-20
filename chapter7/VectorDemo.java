import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo{
	public static void main(String args[]){
		List list = new Vector();

		list.add("hello");
		list.add("world");
		list.add("world");
		list.add("abc");

		for(int i=0; i< list.size(); i++){
			String s1 = (String)list.get(i);
			System.out.println(s1);
		}
	}
}
