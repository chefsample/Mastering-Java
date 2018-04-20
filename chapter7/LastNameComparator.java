import java.util.Comparator;

public class LastNameComparator implements Comparator {

	
	public int compare(Object o1, Object o2) {
		Customer c1 = (Customer)o1;
		Customer c2 = (Customer)o2;
		
		int index = ((Customer) o1).getLastName().compareTo(((Customer) o2).getLastName());
		return index;
	}

}
