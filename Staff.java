
public class Staff extends Employee{
	public String title;
	public Staff(String name, String address, String phone, String email,
			MyDate date, int officeNumber, int salary, String title) {
	super(name, address, phone, email, officeNumber, salary, date);
	this.title = title;
	}
	@Override
	public String toString() {
		return this.getClass().getName() + ": " + name 
				+ "\nTitle: " + title 
				+ "\nOffice Number: " + officeNumber 
				+ "\nsalary: $" + salary 
				+ "\nDate hired: " + date.getDate() 
				+ "\nAddress: " + address 
				+ "\nPhone number: " + phone 
				+ "\nEmail address: " + email;
	}
}
