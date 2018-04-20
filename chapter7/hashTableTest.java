import java.util.HashMap;

public class hashTableTest {
	public static void main(String[] args) {
	
	Customer c1 = new Customer("Sudheer","Akula",123456);
	Customer c2 = new Customer("Komala","Devi",34567);
	Customer c3 = new Customer("Suhasini", "varada",343232);
	
	HashMap map = new HashMap();
	
	map.put("123456", c1);
	map.put("34567", c2);
	map.put("343232", c3);
	
	Customer customer = (Customer) map.get("34567");
	
	System.out.println(customer.getFirstName()+" "+customer.getLastName()+ "  "+
	customer.getSsn());
	}
	
	
	

}
