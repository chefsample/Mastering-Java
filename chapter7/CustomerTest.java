import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTest {
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new LastNameComparator());
		
		set.add(new Customer("Sudheer","Akula",23414));
		set.add(new Customer("Kumar","Akula",345332));
		set.add(new Customer("Akula","ASK",3434343));
		
		Iterator itr = set.iterator();
		
		Customer customer = (Customer) itr.next();
		
		System.out.println(customer.getLastName() + " " + customer.getFirstName()+ " " +customer.getSsn());
		
		
		
	}

}
