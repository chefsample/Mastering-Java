
public class Customer {
	String firstName;
	String lastName;
	int ssn;
	
	public Customer(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		
	}
		
		
		public int getSsn(){
			return this.ssn;
		}
	

	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}
}
