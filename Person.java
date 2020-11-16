
public class Person {
	public String name;
	public String address;
	public String phone;
	public String email;

	public Person(String name, String address, String phone, String email) {
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.email = email;
	}
	@Override
	public String toString() {
	return this.getClass().getName() + "\n" + name;
	}
}
