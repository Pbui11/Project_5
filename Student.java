
public class Student extends Person{

	public final String status;
	public Student(String name,String status, String address, String phone, String email) {
		super(name, address, phone, email);
		this.status = status;	
	}
	@Override
	public String toString() {
	    return this.getClass().getName() + ": " + name
	    		+"\nStatus: "+status
	    		+"\nAddress: "+address
	    		+"\nPhone number: "+phone
	    		+"\nEmail Address: "+email;
	}
}
