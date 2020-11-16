
public class Faculty extends Employee{
	public String officeHours;
	public String rank;

	public Faculty(String name, String address, String phone, String email,
			MyDate date, int officeNumber, int salary, String officeHours, String rank) {
			super(name, address, phone, email, officeNumber, salary, date);
			this. officeHours = officeHours;
			this. rank = rank;
	}
	@Override
	public String toString() {
		return this.getClass().getName() + " : " + name
				+ "\nRank: " + rank 
				+ "\nSalary: $" + salary 
				+ "\nDate hired: " + date.getDate()
				+"\n\nOffice Hours: " + officeHours 
				+ "\nOffice Number: " + officeNumber  
				+ "\nAddress: " + address 
				+ "\nPhone number: " + phone 
				+ "\nEmail address: " + email;
	
	}
}
