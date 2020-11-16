
public class Employee extends Person{
	public int officeNumber;
	public int salary;
	public MyDate date;

	public Employee(String name, String address, String phone, String email, int officeNumber, int salary, MyDate date) {
	super(name, address, phone, email);
	this. officeNumber = officeNumber;
	this. salary = salary;
	this. date = date;
	}
}
