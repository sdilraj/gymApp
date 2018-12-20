package gymBuddy;

public class CustomerInfo {
	
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private double height;
	private double weight;
	private int zipCode;
	
	public CustomerInfo(String firstName, String lastName, String gender, int age, double height, double weight, int zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.zipCode = zipCode;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
	public void displayInfo() {
		System.out.println("The customer's name is " + firstName + " " + lastName);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(zipCode);
		
	}

}
