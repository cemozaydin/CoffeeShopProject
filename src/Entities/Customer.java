package Entities;
import Abstract.Entity;

public class Customer implements Entity{
	private int id;
	private String nationalityId;
	private String firstName;
	private String lastName;
	private int birthOfYear;
	
	
	
	public Customer() {
		
	}

	public Customer(int id, String nationalityId, String firstName, String lastName, int birthOfYear) {
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
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

	public int getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}	

	
	
}
