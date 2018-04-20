import java.util.*;

public class ArrayListDemo{
	public static void main(String args[]){
		List list = new ArrayList();

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
