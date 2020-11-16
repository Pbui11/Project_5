import java.util.Scanner;

public class Driver{
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
		System.out.print("1) To create a student \n2) To create an employee \nChoice: ");
		choice = Integer.parseInt(sc.nextLine());
		}
		while  (choice!= 1 && choice != 2);	
		
		if (choice == 1)
		{			
			System.out.print("\nEnter a name: ");
			String name = sc.nextLine();
							
			
			System.out.print("Enter " + name + "'s address: ");
			String address = sc.nextLine();
			
			System.out.print("Enter "+name+"'s phone number: ");
			String phone = sc.nextLine();
			
			System.out.print("Enter " +name+ "'s email: ");
			String email = sc.nextLine();
			
			System.out.print("Enter "+name+ "'s class status: ");
			String status = sc.nextLine();
			
			Student s1 = new Student(name, status, address, phone, email);
			System.out.println("\n"+s1);
		}
		else 
		{
			System.out.print("Enter a name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter "+name+"'s address: ");
			String address = sc.nextLine();
			
			System.out.print("Enter "+name+"'s phone number: ");
			String phone = sc.nextLine();
			
			System.out.print("Enter "+name+"'s email address: ");
			String email = sc.nextLine();
			
			do {
			System.out.print("\n1) To create a faculty member \n2) To create a staff member \nChoice: ");
			
			choice = Integer.parseInt(sc.nextLine());
			}
			while (choice != 1 && choice != 2);
			
			if (choice == 1) {
				
				System.out.print("\nEnter an office number: ");
				int officeNumber = Integer.parseInt(sc.nextLine());
				
				System.out.print("Enter a salary: $");
				int salary = Integer.parseInt(sc.nextLine());
				
				System.out.print("Enter a hire date (mm/dd/yy): ");
				String date = sc.nextLine();
				MyDate m1 = new MyDate(date);
				
				System.out.print("Enter office hours: ");
				String officeHours = sc.nextLine();
				
				System.out.print("Enter a rank: ");
				String rank = sc.nextLine();
				Faculty f1 = new Faculty(name, address, phone, email, m1, officeNumber, salary, officeHours, rank);
				System.out.println("\n"+f1);
			}
			else
			{
				System.out.print("Enter office number: ");
				int officeNumber = Integer.parseInt(sc.nextLine());
				
				System.out.print("Enter salary: ");
				int salary = Integer.parseInt(sc.nextLine());
				
				System.out.print("Enter date hired (mm/dd/yy): ");
				String date = sc.nextLine();
				MyDate m1 = new MyDate(date);
				
				System.out.print("Enter title: ");
				String title = sc.nextLine();
				
				Staff s = new Staff(name, address, phone, email,m1, officeNumber, salary, title);
				System.out.print("\n"+s);
				
				sc.close();
			}
		}
	}
}