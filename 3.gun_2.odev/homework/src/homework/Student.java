package homework;

public class Student extends User {
	private String firstName;
	private String lastName;
	private String complation;

	public Student() {
	}
	
	public Student(String firstName, String lastName, String complation) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.complation = complation;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getComplation() {
		return complation;
	}
	
	public void setComplation(String complation) {
		this.complation = complation;
	}
	
}








