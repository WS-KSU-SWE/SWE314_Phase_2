package swe314_project_phase2;

public class Employee {

	private int id;
	private String name;
	private String phoneNumber;
	private Position position;
	private double salary;
	private String email;
	private String password;
	
	
	public Employee(int id, String name, String phoneNumber, Position position, double salary, String email, String password) {
		
		setId(id);
		setName(name);
		setPhoneNumber(phoneNumber);
		setPosition(position);
		setSalary(salary);
		setEmail(email);
		setPassword(password);
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
